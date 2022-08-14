// Name of the package where all the Clock In/Out files are
package grpc.printer;

//Required java packages
import java.io.IOException;
import java.util.logging.Logger;

//Required grpc packages for the server
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.ServiceRegistration;
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
		
		//jmDNS Naming

		String serviceType = "_printerGrpc._tcp.local.";
		String serviceName = "Printer Server";
		ServiceRegistration pReg = new ServiceRegistration();
		pReg.run(port, serviceType, serviceName);

		//Create a server instance defined with the port
		Server server = ServerBuilder.forPort(port) 
				.addService(pServer) 
				.build() 
				.start();

		// Display on the server console 
		logger.info("Server for service 3 (Printer) started, listening on " + port);

		// Server will run until terminated
		server.awaitTermination();
			
	}
	// RPC methods that have been defined in the Printer.proto

	//Bidirectional RPC
	@Override
	public StreamObserver<PrintAllDocumentsRequest> printAllDocuments(
			StreamObserver<PrintAllDocumentsResponse> responseObserver) {
		return new StreamObserver<PrintAllDocumentsRequest>() {

			//Implementation of 3 abstract methods of the StreamObserver
			@Override
			public void onNext(PrintAllDocumentsRequest requests) {
				System.out.println("Receiving all the documents for printing: " + requests.getDocumentName());

			}
			@Override
			public void onError(Throwable t) {
				System.out.println("An error has occured");
				t.printStackTrace();
				
			}

			//Response when client finished to stream incoming messages
			@Override
			public void onCompleted() {
				
				
				String doc1 = "1 was printed successufuly";
				String doc2 = "2 was printed successufuly";
				String doc3 = "3 was printed successufuly";

			
				//Build the responses the server will send back to the client						
				PrintAllDocumentsResponse.Builder responses = PrintAllDocumentsResponse.newBuilder();
				
				responses.setMessage(doc1).build();	
				responseObserver.onNext(responses.build());
					
				responses.setMessage(doc2).build();	
				responseObserver.onNext(responses.build());
					
				responses.setMessage(doc3).build();	
				responseObserver.onNext(responses.build());
			
				
				System.out.println("Document: " + doc1 + "\nDocument: " + doc2 + "\nDocument: " + doc3);						
			
				System.out.println("Server completed!");

				responseObserver.onCompleted();

			}
		
		};
		
	}
}	

