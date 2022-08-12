// Name of the package where all the Clock In/Out files are
package grpc.printer;

//Required java packages
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//Required grpc packages for the server
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import grpc.printer.PrintAllDocumentsRequest;
import grpc.printer.PrintAllDocumentsResponse;

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

	@Override
	public StreamObserver<PrintAllDocumentsRequest> printAllDocuments(
			StreamObserver<PrintAllDocumentsResponse> responseObserver) {
		return new StreamObserver<PrintAllDocumentsRequest>() {
//			//kgs of apple sold weekly in the last 4 weeks are saved in an ArrayList data structure
//			ArrayList<String> messageList = new ArrayList<String>();
//			
//			//now we must implement 3 abstract methods of the StreamObserver class: onNext(), onError() and onCompleted()
//			
//			//first, we implement onNext()
//			//onNext() method specifies the required actions when the server receives all incoming messages from the client

			
			
			
			@Override
			public void onNext(PrintAllDocumentsRequest requests) {
				//incoming values weekly apple sales in kg are added into the ArrayList
				System.out.println("Receiving all the documents for printing: " + requests.getDocumentName());

			}
			@Override
			public void onError(Throwable t) {
				System.out.println("An error occured");
				t.printStackTrace();
				
			}

			//here we create the response when client finished to stream incoming messages
			@Override
			public void onCompleted() {
				
				
				String doc1 = "1 was printed successufuly";
				String doc2 = "2 was printed successufuly";
				String doc3 = "3 was printed successufuly";

			
				//now we can build the responses the server will send back to the client						
				PrintAllDocumentsResponse.Builder responses = PrintAllDocumentsResponse.newBuilder();
				
				//4 responses are built, showing the sales values of apple over 4 weeks
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

