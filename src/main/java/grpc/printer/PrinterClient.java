package grpc.printer;

import javax.jmdns.ServiceInfo;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import jmDNS.ServiceDiscovery;


public class PrinterClient {

	// Stubs for establishing the connection with server
	// Asynch stub
	private static PrinterGrpc.PrinterStub asyncStub;

	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
		//jmDNS Naming
		ServiceInfo info;
		String serviceType = "_printerGrpc._tcp.local.";
		info = ServiceDiscovery.run(serviceType);
		
		// Create a channel to the server from client with server name (localhost) and port (50053).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();

		// stubs -- generate from proto
		asyncStub = PrinterGrpc.newStub(channel);

		// Bidirectional RPC call
		print();

		// Closing the channel
		channel.shutdown();

	}

	//Bidirectional RPC
	public static void print() {
		// Handling the server stream using onNext, onError, onCompleted
		StreamObserver<PrintAllDocumentsResponse> responseObserver = new StreamObserver<PrintAllDocumentsResponse>() {

			@Override
			public void onNext(PrintAllDocumentsResponse responses) {

				responses.getMessage();

			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.getMessage();

			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Server completed!");
			}

		};

		// Sends a stream of messages to the client
		StreamObserver<PrintAllDocumentsRequest> requestObserver = asyncStub.printAllDocuments(responseObserver);
		try {

		requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Financial Report").build());
		requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Contract").build());
		requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Letter").build());

			// Sleep for 2 seconds
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// End the call
		requestObserver.onCompleted();

	}

}
