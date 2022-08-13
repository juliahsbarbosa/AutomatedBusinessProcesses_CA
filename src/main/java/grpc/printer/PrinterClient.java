package grpc.printer;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class PrinterClient {

	// Stubs for establishing the connection with server
	// Asynch stub
	private static PrinterGrpc.PrinterStub asyncStub;

	// The main method will have the logic for client.
	public static void main(String[] args) throws Exception {
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

			// Sleep for a while before sending the next one
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// End the call
		requestObserver.onCompleted();

	}

}
