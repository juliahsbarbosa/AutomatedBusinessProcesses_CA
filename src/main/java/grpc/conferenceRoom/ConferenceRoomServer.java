// Name of the package where all the Conference Room files are
package grpc.conferenceRoom;

// Required java packages 
import java.io.IOException;
import java.util.logging.Logger;

//Required grpc packages for the server 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//ImplBase class that was generated from the proto file.
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomImplBase;

public class ConferenceRoomServer extends ConferenceRoomImplBase {

	// Logger instance to show different events at the server console
	private static final Logger logger = Logger.getLogger(ConferenceRoomServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {

		// Instance of server class definition
		ConferenceRoomServer crServer = new ConferenceRoomServer();

		// Service 2 (ConferenceRoom) port number definition, where server will be listening to clients
		int port = 50052;

		// Create a server instance defined with the port
		Server server = ServerBuilder.forPort(port)
				.addService(crServer)
				.build() // Build the server
				.start(); // Start the server

		// Show on the server console that server has started
		logger.info("Server for service 2 (Conference Room) started, listening on " + port);

		// Server will be running until externally terminated
		server.awaitTermination();

	}

	// RPC methods that have been defined in the ConferenceRoom.proto

	// Server Streaming RPC
	@Override
	public void getAvailableRooms(GetAvailableRoomsRequest request,
			StreamObserver<GetAvailableRoomsResponse> responseObserver) {
		
		// Call method - Stream of data
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder().setConferenceRoomName("Conference Room 2").build());

		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder().setConferenceRoomName("Conference Room 7").build());

		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder().setConferenceRoomName("Conference Room 3").build());
		
		// End the call
		responseObserver.onCompleted();
	}

	// Unary RPC
	@Override
	public void bookConferenceRoom(BookConferenceRoomRequest request,
			StreamObserver<BookConferenceRoomResponse> responseObserver) {
		String date = request.getDate();
		String timeslot = request.getTimeslot();
		String conferenceRoomName = request.getConferenceRoomName();

		
		responseObserver.onNext(BookConferenceRoomResponse.newBuilder()
				.setMessage("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
						+ "\n Conference room booking confirmed!"
						+ "\nThe details of the conference room you booked are: " + "\n Conference Room Number : "
						+ conferenceRoomName + "\n Date : " + date + "\n Time : " + timeslot)
				.build());

		// End the call
		responseObserver.onCompleted();

	}
	
	
	//Client Streaming RPC
	@Override
	public StreamObserver<OccupancyRequest> calculateTotalOccupancy(
			StreamObserver<OccupancyResponse> responseObserver) {
		return new StreamObserver<OccupancyRequest>() {

			int totalOcc = 0;

			public void onNext(OccupancyRequest requests) {
				System.out.println("Receiving the number of people entering the conference room: " + requests.getNumPeople());
				totalOcc += requests.getNumPeople();
			}

			@Override
			public void onError(Throwable t) {
				System.out.println("An error has occured!");

			}

			@Override
			public void onCompleted() {
				// Response is sent once the client is done with sending the stream.
				OccupancyResponse res = OccupancyResponse.newBuilder().setTotalOccupancy(totalOcc).build();
				responseObserver.onNext(res);
				responseObserver.onCompleted();
				System.out.println("Server completed!");

			}
		};
	}

}
