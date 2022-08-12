package grpc.printer;

//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.lang.System.Logger;
import java.util.Random;

//This is to include rpc method enum message
import grpc.printer.PrintAllDocumentsRequest;

import grpc.printer.PrintAllDocumentsResponse;
import grpc.printer.PrinterGrpc;
import grpc.printer.PrinterGrpc.PrinterBlockingStub;
import grpc.printer.PrinterGrpc.PrinterStub;

public class PrinterClient {

	// Creating stubs for establishing the connection with server.		
		// Asynch stub
		private static PrinterGrpc.PrinterStub asyncStub;
		
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
			
			//stubs -- generate from proto
			asyncStub = PrinterGrpc.newStub(channel);

			// Unary RPC call
			print();

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}

		public static void print(){
			// Handling the server stream for client using onNext (logic for handling each message in stream), onError, onCompleted (logic will be executed after the completion of stream)
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

			// Here, we are calling the Remote reverseStream method. Using onNext, client sends a stream of messages.
			StreamObserver<PrintAllDocumentsRequest> requestObserver = asyncStub.printAllDocuments(responseObserver);


				requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Financial Report").build());
				requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Contract").build());
				requestObserver.onNext(PrintAllDocumentsRequest.newBuilder().setDocumentName("Letter").build());
				
				try {
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
