package grpc.conferenceRoom;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.lang.System.Logger;
import java.util.Iterator;
import java.util.Random;

import grpc.clockInOut.ClockinRequest;
import grpc.clockInOut.ClockinResponse;
//This is to include rpc method enum message
import grpc.conferenceRoom.BookConferenceRoomRequest;

import grpc.conferenceRoom.BookConferenceRoomResponse;
import grpc.conferenceRoom.ConferenceRoomGrpc;
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomBlockingStub;
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomStub;
import grpc.printer.PrintAllDocumentsRequest;
import grpc.printer.PrintAllDocumentsResponse;

public class ConferenceRoomClient {

	// Creating stubs for establishing the connection with server.
	// Blocking stub
	private static ConferenceRoomBlockingStub blockingStub;
	// Asynch stub
	private static ConferenceRoomGrpc.ConferenceRoomStub asyncStub;

	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide
		// the server name (localhost) and port (50055).
		// As it is a local demo of GRPC, we can have non-secured channel
		// (usePlaintext).
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

		// Client Streaming RPC call

		// Closing the channel once message has been passed.
		channel.shutdown();

	}

	// Server Streaming
	public static void getRooms() {
		// First creating a request message. Here, the message contains a string in
		// setVal
		GetAvailableRoomsRequest request = GetAvailableRoomsRequest.newBuilder().setDate("12/08/2022")
				.setTimeslot("13:00").build();

		// as this call is blocking. The client will not proceed until all the messages
		// in stream has been received.
		try {
			// Iterating each message in response when calling remote split RPC method.
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
		// First creating a request message. Here, the message contains a string in
		// setVal
		BookConferenceRoomRequest bookReq = BookConferenceRoomRequest.newBuilder()
				.setConferenceRoomName("Conference Room 7").setDate("12/08/2022").setTimeslot("13:00").build();
		// Calling a remote RPC method using blocking stub defined in main method. req
		// is the message we want to pass.
		BookConferenceRoomResponse bookRes = blockingStub.bookConferenceRoom(bookReq);

		// response contains the output from the server side. Here, we are printing the
		// value contained by response.
		System.out.println(bookRes.getMessage());

	}

	// Client Streaming RPC
	public static void calculateOcc() {
		// Handling the stream for client using onNext (logic for handling each message
		// in stream), onError, onCompleted (logic will be executed after the completion
		// of stream)
		StreamObserver<OccupancyResponse> responseObserver = new StreamObserver<OccupancyResponse>() {

			@Override
			public void onNext(OccupancyResponse response) {

				System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\""
						+ " \nThe total occupancy of the conference room is: " + response.getTotalOccupancy() + " people");
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

		// Here, we are calling the Remote reverseStream method. Using onNext, client
		// sends a stream of messages.
		StreamObserver<OccupancyRequest> requestObserver = asyncStub.calculateTotalOccupancy(responseObserver);
		try {

		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(1).build());
		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(7).build());
		requestObserver.onNext(OccupancyRequest.newBuilder().setNumPeople(5).build());
		


		// Sleep for a bit before sending the next one.

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Mark the end of requests
		requestObserver.onCompleted();
	}

}
