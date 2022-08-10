// Name of the package where all the Conference Room files are
package grpc.conferenceRoom;

// Required java packages 
import java.io.IOException;
import java.text.ParseException;
import java.util.Random;
import java.util.logging.Logger;


//Required grpc packages for the server 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//ImplBase class that was generated from the proto file.
import grpc.conferenceRoom.ConferenceRoomGrpc.ConferenceRoomImplBase;

public class ConferenceRoomServer extends ConferenceRoomImplBase {

	//Logger instance to show different events at the server console
	private static final Logger logger = Logger.getLogger(ConferenceRoomServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Instance of server class definition
		ConferenceRoomServer crServer = new ConferenceRoomServer();

		// Service 2 (ConferenceRoom) port number definition, where server will be listening to clients
		int port = 50052;

		//Create a server instance defined with the port
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
	
	//Server Streaming RPC
	@Override
	public void getAvailableRooms(GetAvailableRoomsRequest request,
			StreamObserver<GetAvailableRoomsResponse> responseObserver) {
		System.out.println("Available Conference Rooms Server is starting");
		
		//now we can read in the request coming from the client
		String date = request.getDate();

		System.out.println("The ids of the conference rooms available for booking on " + date + " are presented below: \n" );
		
		//Call method	
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
							.setConferenceRoomId(11).build());		
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(7).build());	
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(3).build());	
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(1).build());	
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(2).build());	
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(10).build());	
		
		responseObserver.onNext(GetAvailableRoomsResponse.newBuilder()
				.setConferenceRoomId(5).build());	
		
		
		//End the call
		responseObserver.onCompleted();
	}
	
	//Unary RPC
	@Override	
	public void bookConferenceRoom(BookConferenceRoomRequest request,
			StreamObserver<BookConferenceRoomResponse> responseObserver) {
		String date = request.getDate();
		String timeslot = request.getTimeslot();
		int numParticipants = request.getNumParticipants();
		int conferenceRoomId = request.getConferenceRoomId();
		 
		
		responseObserver.onNext(BookConferenceRoomResponse.newBuilder()
				.setMessage("The details of the conference room you booked are: "
					+"\n Conference Room Number : " + conferenceRoomId 
					+ "\n Date : " + date
					+ "\n Time : " + timeslot 
					+ "\n Number of Participants : " + numParticipants).build());
					
		//End the call
		responseObserver.onCompleted();
		
	}
	
	//Client streaming RPC
	@Override
	public StreamObserver<OccupancyDataRequest> sendOccupancyData(
			StreamObserver<OccupancyDataResponse> responseObserver) {
			return new StreamObserver<OccupancyDataRequest>() {
			
			int totalOccupancy = 0;
						
			public void onNext(OccupancyDataRequest numOccupancy) {
				// Compute the total people occupancy by summing the streamed data
				System.out.println("receive -> " + numOccupancy.getNumOccupancy());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			// Once the complete stream is received this logic will be executed.
			@Override
			public void onCompleted() {
				// Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
				 // Here, response is sent once the client is done with sending the stream.
				OccupancyDataResponse res = OccupancyDataResponse.newBuilder().setTotalOccupancy(totalOccupancy).build();
		          responseObserver.onNext(res);
		          responseObserver.onCompleted();
			}
		};
	}
}