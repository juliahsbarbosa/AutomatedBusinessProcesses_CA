package grpc.clockInOut;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Defining the service containing the rpc methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ClockInOut.proto")
public final class ClockinGrpc {

  private ClockinGrpc() {}

  public static final String SERVICE_NAME = "Clockin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.clockInOut.ClockinRequest,
      grpc.clockInOut.ClockinResponse> getClockInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClockIn",
      requestType = grpc.clockInOut.ClockinRequest.class,
      responseType = grpc.clockInOut.ClockinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.clockInOut.ClockinRequest,
      grpc.clockInOut.ClockinResponse> getClockInMethod() {
    io.grpc.MethodDescriptor<grpc.clockInOut.ClockinRequest, grpc.clockInOut.ClockinResponse> getClockInMethod;
    if ((getClockInMethod = ClockinGrpc.getClockInMethod) == null) {
      synchronized (ClockinGrpc.class) {
        if ((getClockInMethod = ClockinGrpc.getClockInMethod) == null) {
          ClockinGrpc.getClockInMethod = getClockInMethod = 
              io.grpc.MethodDescriptor.<grpc.clockInOut.ClockinRequest, grpc.clockInOut.ClockinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Clockin", "ClockIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clockInOut.ClockinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clockInOut.ClockinResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClockinMethodDescriptorSupplier("ClockIn"))
                  .build();
          }
        }
     }
     return getClockInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.clockInOut.ClockoutRequest,
      grpc.clockInOut.ClockoutResponse> getClockOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClockOut",
      requestType = grpc.clockInOut.ClockoutRequest.class,
      responseType = grpc.clockInOut.ClockoutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.clockInOut.ClockoutRequest,
      grpc.clockInOut.ClockoutResponse> getClockOutMethod() {
    io.grpc.MethodDescriptor<grpc.clockInOut.ClockoutRequest, grpc.clockInOut.ClockoutResponse> getClockOutMethod;
    if ((getClockOutMethod = ClockinGrpc.getClockOutMethod) == null) {
      synchronized (ClockinGrpc.class) {
        if ((getClockOutMethod = ClockinGrpc.getClockOutMethod) == null) {
          ClockinGrpc.getClockOutMethod = getClockOutMethod = 
              io.grpc.MethodDescriptor.<grpc.clockInOut.ClockoutRequest, grpc.clockInOut.ClockoutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Clockin", "ClockOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clockInOut.ClockoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clockInOut.ClockoutResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClockinMethodDescriptorSupplier("ClockOut"))
                  .build();
          }
        }
     }
     return getClockOutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClockinStub newStub(io.grpc.Channel channel) {
    return new ClockinStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClockinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClockinBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClockinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClockinFutureStub(channel);
  }

  /**
   * <pre>
   * Defining the service containing the rpc methods
   * </pre>
   */
  public static abstract class ClockinImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Unary RPC
     *The client requests clock in, the server returns clockin response
     * </pre>
     */
    public void clockIn(grpc.clockInOut.ClockinRequest request,
        io.grpc.stub.StreamObserver<grpc.clockInOut.ClockinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClockInMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clockout, the server returns clockout response
     * </pre>
     */
    public void clockOut(grpc.clockInOut.ClockoutRequest request,
        io.grpc.stub.StreamObserver<grpc.clockInOut.ClockoutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClockOutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getClockInMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.clockInOut.ClockinRequest,
                grpc.clockInOut.ClockinResponse>(
                  this, METHODID_CLOCK_IN)))
          .addMethod(
            getClockOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.clockInOut.ClockoutRequest,
                grpc.clockInOut.ClockoutResponse>(
                  this, METHODID_CLOCK_OUT)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining the service containing the rpc methods
   * </pre>
   */
  public static final class ClockinStub extends io.grpc.stub.AbstractStub<ClockinStub> {
    private ClockinStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockinStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockinStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockinStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clock in, the server returns clockin response
     * </pre>
     */
    public void clockIn(grpc.clockInOut.ClockinRequest request,
        io.grpc.stub.StreamObserver<grpc.clockInOut.ClockinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClockInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clockout, the server returns clockout response
     * </pre>
     */
    public void clockOut(grpc.clockInOut.ClockoutRequest request,
        io.grpc.stub.StreamObserver<grpc.clockInOut.ClockoutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClockOutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining the service containing the rpc methods
   * </pre>
   */
  public static final class ClockinBlockingStub extends io.grpc.stub.AbstractStub<ClockinBlockingStub> {
    private ClockinBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockinBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockinBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockinBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clock in, the server returns clockin response
     * </pre>
     */
    public grpc.clockInOut.ClockinResponse clockIn(grpc.clockInOut.ClockinRequest request) {
      return blockingUnaryCall(
          getChannel(), getClockInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clockout, the server returns clockout response
     * </pre>
     */
    public grpc.clockInOut.ClockoutResponse clockOut(grpc.clockInOut.ClockoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getClockOutMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining the service containing the rpc methods
   * </pre>
   */
  public static final class ClockinFutureStub extends io.grpc.stub.AbstractStub<ClockinFutureStub> {
    private ClockinFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClockinFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClockinFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClockinFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clock in, the server returns clockin response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.clockInOut.ClockinResponse> clockIn(
        grpc.clockInOut.ClockinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClockInMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Unary RPC
     *The client requests clockout, the server returns clockout response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.clockInOut.ClockoutResponse> clockOut(
        grpc.clockInOut.ClockoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClockOutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CLOCK_IN = 0;
  private static final int METHODID_CLOCK_OUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClockinImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClockinImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLOCK_IN:
          serviceImpl.clockIn((grpc.clockInOut.ClockinRequest) request,
              (io.grpc.stub.StreamObserver<grpc.clockInOut.ClockinResponse>) responseObserver);
          break;
        case METHODID_CLOCK_OUT:
          serviceImpl.clockOut((grpc.clockInOut.ClockoutRequest) request,
              (io.grpc.stub.StreamObserver<grpc.clockInOut.ClockoutResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClockinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClockinBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.clockInOut.ClockInClockOutService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Clockin");
    }
  }

  private static final class ClockinFileDescriptorSupplier
      extends ClockinBaseDescriptorSupplier {
    ClockinFileDescriptorSupplier() {}
  }

  private static final class ClockinMethodDescriptorSupplier
      extends ClockinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClockinMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClockinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClockinFileDescriptorSupplier())
              .addMethod(getClockInMethod())
              .addMethod(getClockOutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
