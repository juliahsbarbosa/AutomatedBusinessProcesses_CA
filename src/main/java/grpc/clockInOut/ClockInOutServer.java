// Name of the package where all the Clock In/Out files are
package grpc.clockInOut;

//Required java packages
import java.io.IOException;
import java.util.logging.Logger;


//Required grpc packages for the server
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//ImplBase class that was generated from the proto file
import grpc.clockInOut.ClockinGrpc.ClockinImplBase;

public class ClockInOutServer extends ClockinImplBase {

	//Logger instance to show different events at the server console
	private static final Logger logger = Logger.getLogger(ClockInOutServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Instance of server class definition
		ClockInOutServer cServer = new ClockInOutServer();

		// Service 1 (ClockInOut) port number definition, where server will be listening to clients
		//Default grpc port is 50051, so this is the first port used
		int port = 50051;

		//Create a server instance defined with the port
		Server server = ServerBuilder.forPort(port) 
				.addService(cServer) 
				.build() // Build the server
				.start(); // Start the server

		// Show on the server console that server has started
		logger.info("Server for service 1 (ClockInOut) started, listening on " + port);

		// Server will be running until externally terminated
		server.awaitTermination();
			
	}

	// RPC methods that have been defined in the ClockInOut.proto
	
	//Unary RPC
	@Override
	public void clockIn(ClockinRequest request, StreamObserver<ClockinResponse> responseObserver) {		
		int employeeId = request.getEmployeeId();
		String dateIn = request.getDateIn();
		String timeIn = request.getTimeIn();

	
		//Send back to the client
		if(employeeId < 0 || employeeId > 10000) {
			responseObserver.onNext(ClockinResponse.newBuilder().setMessage("Employee id " + employeeId + " doesn't exist!").build());
		}else {
			responseObserver.onNext(ClockinResponse.newBuilder().setMessage("Employee id " + employeeId + " clocked in successufully on "  + dateIn + " at " + timeIn).build());
		}
		
		//End the call
		responseObserver.onCompleted();
	}

	//Unary RPC
	@Override
	public void clockOut(ClockoutRequest request, StreamObserver<ClockoutResponse> responseObserver) {
		System.out.println("Clocking in"); 
		
		int employeeId = request.getEmployeeId();
		String dateOut = request.getDateOut();
		String timeOut = request.getTimeOut();

	
		//Send back to the client
		if(employeeId < 0 || employeeId > 10000) {
			responseObserver.onNext(ClockoutResponse.newBuilder().setMessage("Employee id " + employeeId + " doesn't exist!").build());
		}else {
			responseObserver.onNext(ClockoutResponse.newBuilder().setMessage("Employee id " + employeeId + " clocked out successufully on "  + dateOut + " at " + timeOut).build());
		}
		
		//End the call
		responseObserver.onCompleted();
	}
}