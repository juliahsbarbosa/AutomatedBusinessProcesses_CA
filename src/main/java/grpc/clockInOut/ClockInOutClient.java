package grpc.clockInOut;

//required import packages for the client side
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import grpc.clockInOut.ClockinGrpc.ClockinBlockingStub;

public class ClockInOutClient {

	// Stubs for establishing the connection with server.
	// Blocking stub
	private static ClockinBlockingStub blockingStub;

	public static void main(String[] args) throws Exception {
		// Create a channel to the server from client with server name (localhost) and port (50051).
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		// stubs -- generate from proto
		blockingStub = ClockinGrpc.newBlockingStub(channel);

		// Unary RPC call
		clockin();

		// Unary RPC call
		clockout();

		// Closing the channel once message has been passed.
		channel.shutdown();

	}

	// Unary RPC
	public static void clockin() {

		// Create a request message
		ClockinRequest inReq = ClockinRequest.newBuilder().setEmployeeId(7).setDateIn("11/08/2022").setTimeIn("13:13")
				.build();
		// Call RPC method using blocking stub 
		ClockinResponse inRes = blockingStub.clockIn(inReq);

		// Output from the server
		System.out.println(inRes.getMessage());

	}

	// Unary RPC
	public static void clockout() {

		// Create request message
		ClockoutRequest outReq = ClockoutRequest.newBuilder().setEmployeeId(3).setDateOut("11/08/2022")
				.setTimeOut("15:15").build();
		
		// Call RPC method using blocking stub 
		ClockoutResponse outRes = blockingStub.clockOut(outReq);

		// Output from the server
		System.out.println(outRes.getMessage());

	}

}