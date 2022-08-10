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
	public StreamObserver<OccupancyDataRequest> sendOccupancyData(StreamObserver<Empty> responseObserver) {
		// TODO Auto-generated method stub
		return super.sendOccupancyData(responseObserver);
	}
	
}