package grpc.conferenceRoom;

//required import packages for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.Iterator;
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomBlockingStub;
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomStub;


public class ConferenceRoomClient {

	// Creating stubs for establishing the connection with server
	// Blocking stub
	private static ConferenceRoomBlockingStub blockingStub;
	// Asynch stub
	private static ConferenceRoomStub asyncStub;

	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
		// Create a channel to the server from client with server name (localhost) and port (50052).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

		// stubs -- generate from proto
		blockingStub = ConferenceRoomGrpc.newBlockingStub(channel);
		asyncStub = ConferenceRoomGrpc.newStub(channel);

		// Server streaming RPC call
		getRooms();

		// Unary RPC call
		book();

		// Client streaming RPC
		calculateOcc();

		// Closing the channel 
		channel.shutdown();

	}

	// Server Streaming
	public static void getRooms() {
		// Creating a request message
		GetAvailableRoomsRequest request = GetAvailableRoomsRequest.newBuilder().setDate("12/08/2022")
				.setTimeslot("13:00").build();

		//Handle the stream from server
		// The client will not proceed until all the messages in stream has been received
		try {
			// Iterating each message in response when calling RPC method
			Iterator<GetAvailableRoomsResponse> responses = blockingStub.getAvailableRooms(request);

			// Client keeps a check on the next message in stream.
			while (responses.hasNext()) {
				GetAvailableRoomsResponse temp = responses.next();
				System.out.println("\nThe conference rooms available on " + request.getDate() + " at "
						+ request.getTimeslot() + " are : \n");
				System.out.println(temp.getConferenceRoomName());
			}

		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}

	}

	// Unary RPC
	public static void book() {
		// Crequest message
		BookConferenceRoomRequest bookReq = BookConferenceRoomRequest.newBuilder()
				.setConferenceRoomName("Conference Room 7").setDate("12/08/2022").setTimeslot("13:00").build();
		// Calling a remote RPC method using blocking stub 
		BookConferenceRoomResponse bookRes = blockingStub.bookConferenceRoom(bookReq);

		//Output from the server 
		System.out.println(bookRes.getMessage());

	}

	// Client Streaming RPC
	public static void calculateOcc() {
		// Handle the stream for client using onNext (each message in stream), onError, onCompleted (after the completion of stream)
		StreamObserver<OccupancyResponse> responseObserver = new StreamObserver<OccupancyResponse>() {

			@Override
			public void onNext(OccupancyResponse response) {
				System.out.println(
						"\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
								+ " \nThe total occupancy of the conference room is: " + response.getTotalOccupancy()
								+ " people");
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onCompleted() {
				System.out.println("Server completed!");

			}

		};

		// Sends a stream of messages.
		StreamObserver<OccupancyRequest> requestObserver = asyncStub.calculateTotalOccupancy(responseObserver);
		try {

		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(1).build());
		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(7).build());
		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(5).build());

		// Sleep for a while before sending the next one
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Mark the end of requests
		requestObserver.onCompleted();
	}

}
