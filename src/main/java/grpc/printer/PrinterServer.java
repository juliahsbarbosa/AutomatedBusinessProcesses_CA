// Name of the package where all the Clock In/Out files are
package grpc.printer;

//Required java packages
import java.io.IOException;
import java.util.logging.Logger;


//Required grpc packages for the server
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//ImplBase class that was generated from the proto file
import grpc.printer.PrinterGrpc.PrinterImplBase;

public class PrinterServer extends PrinterImplBase {

	//Logger instance to show different events at the server console
	private static final Logger logger = Logger.getLogger(PrinterServer.class.getName());

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//Instance of server class definition
		PrinterServer pServer = new PrinterServer();

		// Service 3 (Printer) port number definition, where server will be listening to clients
		int port = 50053;

		//Create a server instance defined with the port
		Server server = ServerBuilder.forPort(port) 
				.addService(pServer) 
				.build() // Build the server
				.start(); // Start the server

		// Show on the server console that server has started
		logger.info("Server for service 3 (Printer) started, listening on " + port);

		// Server will be running until externally terminated
		server.awaitTermination();
			
	}

	// RPC methods that have been defined in the Printer.proto

	//Client Streaming RPC
	@Override
	public StreamObserver<ScanFilesRequest> scanFiles(StreamObserver<ScanFilesResponse> responseObserver) {
		// TODO Auto-generated method stub
		return super.scanFiles(responseObserver);
	}

	//Bidirectional RPC
	@Override
	public StreamObserver<PrintsAllDocumentsRequest> printsAllDocuments(
			StreamObserver<PrintsAllDocumentsResponse> responseObserver) {
		// TODO Auto-generated method stub
		return super.printsAllDocuments(responseObserver);
	}

	
	
}