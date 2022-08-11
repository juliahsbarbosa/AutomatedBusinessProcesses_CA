package grpc.printer;

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
 * Defining the service containing methods
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Printer.proto")
public final class PrinterGrpc {

  private PrinterGrpc() {}

  public static final String SERVICE_NAME = "Printer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.printer.scanDocumentRequest,
      grpc.printer.scanDocumentResponse> getScanDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanDocument",
      requestType = grpc.printer.scanDocumentRequest.class,
      responseType = grpc.printer.scanDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.printer.scanDocumentRequest,
      grpc.printer.scanDocumentResponse> getScanDocumentMethod() {
    io.grpc.MethodDescriptor<grpc.printer.scanDocumentRequest, grpc.printer.scanDocumentResponse> getScanDocumentMethod;
    if ((getScanDocumentMethod = PrinterGrpc.getScanDocumentMethod) == null) {
      synchronized (PrinterGrpc.class) {
        if ((getScanDocumentMethod = PrinterGrpc.getScanDocumentMethod) == null) {
          PrinterGrpc.getScanDocumentMethod = getScanDocumentMethod = 
              io.grpc.MethodDescriptor.<grpc.printer.scanDocumentRequest, grpc.printer.scanDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Printer", "ScanDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.printer.scanDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.printer.scanDocumentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrinterMethodDescriptorSupplier("ScanDocument"))
                  .build();
          }
        }
     }
     return getScanDocumentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrinterStub newStub(io.grpc.Channel channel) {
    return new PrinterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrinterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrinterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrinterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrinterFutureStub(channel);
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static abstract class PrinterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Client Streaming rpc
     *Client scans a stream of documents, server returns confirmation message
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.printer.scanDocumentRequest> scanDocument(
        io.grpc.stub.StreamObserver<grpc.printer.scanDocumentResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getScanDocumentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScanDocumentMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.printer.scanDocumentRequest,
                grpc.printer.scanDocumentResponse>(
                  this, METHODID_SCAN_DOCUMENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class PrinterStub extends io.grpc.stub.AbstractStub<PrinterStub> {
    private PrinterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterStub(channel, callOptions);
    }

    /**
     * <pre>
     *Client Streaming rpc
     *Client scans a stream of documents, server returns confirmation message
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.printer.scanDocumentRequest> scanDocument(
        io.grpc.stub.StreamObserver<grpc.printer.scanDocumentResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getScanDocumentMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class PrinterBlockingStub extends io.grpc.stub.AbstractStub<PrinterBlockingStub> {
    private PrinterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class PrinterFutureStub extends io.grpc.stub.AbstractStub<PrinterFutureStub> {
    private PrinterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SCAN_DOCUMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrinterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrinterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCAN_DOCUMENT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.scanDocument(
              (io.grpc.stub.StreamObserver<grpc.printer.scanDocumentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PrinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrinterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.printer.PrinterService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Printer");
    }
  }

  private static final class PrinterFileDescriptorSupplier
      extends PrinterBaseDescriptorSupplier {
    PrinterFileDescriptorSupplier() {}
  }

  private static final class PrinterMethodDescriptorSupplier
      extends PrinterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrinterMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrinterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrinterFileDescriptorSupplier())
              .addMethod(getScanDocumentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
