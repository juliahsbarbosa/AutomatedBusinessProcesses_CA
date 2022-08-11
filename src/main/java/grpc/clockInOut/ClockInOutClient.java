package grpc.clockInOut;
//required grpc package for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.lang.System.Logger;

//This is to include rpc method enum message
import grpc.clockInOut.ClockinRequest.*;
import grpc.clockInOut.ClockinGrpc;
import grpc.clockInOut.ClockinGrpc.ClockinBlockingStub;
import grpc.clockInOut.ClockinGrpc.ClockinStub;


public class ClockInOutClient {		
	
	// Creating stubs for establishing the connection with server.
		// Blocking stub
		private static ClockinGrpc.ClockinBlockingStub blockingStub;
		
		// The main method will have the logic for client.
		public static void main(String[] args) throws Exception {
		// First a channel is being created to the server from client. Here, we provide the server name (localhost) and port (50055).
			// As it is a local demo of GRPC, we can have non-secured channel (usePlaintext).
			ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			
			//stubs -- generate from proto
			blockingStub = ClockinGrpc.newBlockingStub(channel);

			// Unary RPC call
			clockin();
			
			clockout();

			// Closing the channel once message has been passed.		
			channel.shutdown();

		}


		//unary rpc
		public static void clockin() {

			// First creating a request message. Here, the message contains a string in setVal
			ClockinRequest inReq = ClockinRequest.newBuilder().setEmployeeId(7).setDateIn("11/08/2022").setTimeIn("13:13").build();
			//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
			ClockinResponse inRes = blockingStub.clockIn(inReq);

			//response contains the output from the server side. Here, we are printing the value contained by response. 
			System.out.println(inRes.getMessage());
			
		}
		
		public static void clockout() {

			// First creating a request message. Here, the message contains a string in setVal
			ClockoutRequest outReq = ClockoutRequest.newBuilder().setEmployeeId(3).setDateOut("11/08/2022").setTimeOut("15:15").build();
			//  Calling a remote RPC method using blocking stub defined in main method. req is the message we want to pass.
			ClockoutResponse outRes = blockingStub.clockOut(outReq);

			//response contains the output from the server side. Here, we are printing the value contained by response. 
			System.out.println(outRes.getMessage());
			
		}

}