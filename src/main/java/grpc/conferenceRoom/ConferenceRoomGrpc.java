package grpc.conferenceRoom;

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
    comments = "Source: ConferenceRoom.proto")
public final class ConferenceRoomGrpc {

  private ConferenceRoomGrpc() {}

  public static final String SERVICE_NAME = "ConferenceRoom";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.conferenceRoom.GetAvailableRoomsRequest,
      grpc.conferenceRoom.GetAvailableRoomsResponse> getGetAvailableRoomsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableRooms",
      requestType = grpc.conferenceRoom.GetAvailableRoomsRequest.class,
      responseType = grpc.conferenceRoom.GetAvailableRoomsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.conferenceRoom.GetAvailableRoomsRequest,
      grpc.conferenceRoom.GetAvailableRoomsResponse> getGetAvailableRoomsMethod() {
    io.grpc.MethodDescriptor<grpc.conferenceRoom.GetAvailableRoomsRequest, grpc.conferenceRoom.GetAvailableRoomsResponse> getGetAvailableRoomsMethod;
    if ((getGetAvailableRoomsMethod = ConferenceRoomGrpc.getGetAvailableRoomsMethod) == null) {
      synchronized (ConferenceRoomGrpc.class) {
        if ((getGetAvailableRoomsMethod = ConferenceRoomGrpc.getGetAvailableRoomsMethod) == null) {
          ConferenceRoomGrpc.getGetAvailableRoomsMethod = getGetAvailableRoomsMethod = 
              io.grpc.MethodDescriptor.<grpc.conferenceRoom.GetAvailableRoomsRequest, grpc.conferenceRoom.GetAvailableRoomsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ConferenceRoom", "GetAvailableRooms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.GetAvailableRoomsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.GetAvailableRoomsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConferenceRoomMethodDescriptorSupplier("GetAvailableRooms"))
                  .build();
          }
        }
     }
     return getGetAvailableRoomsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.conferenceRoom.BookConferenceRoomRequest,
      grpc.conferenceRoom.BookConferenceRoomResponse> getBookConferenceRoomMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookConferenceRoom",
      requestType = grpc.conferenceRoom.BookConferenceRoomRequest.class,
      responseType = grpc.conferenceRoom.BookConferenceRoomResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.conferenceRoom.BookConferenceRoomRequest,
      grpc.conferenceRoom.BookConferenceRoomResponse> getBookConferenceRoomMethod() {
    io.grpc.MethodDescriptor<grpc.conferenceRoom.BookConferenceRoomRequest, grpc.conferenceRoom.BookConferenceRoomResponse> getBookConferenceRoomMethod;
    if ((getBookConferenceRoomMethod = ConferenceRoomGrpc.getBookConferenceRoomMethod) == null) {
      synchronized (ConferenceRoomGrpc.class) {
        if ((getBookConferenceRoomMethod = ConferenceRoomGrpc.getBookConferenceRoomMethod) == null) {
          ConferenceRoomGrpc.getBookConferenceRoomMethod = getBookConferenceRoomMethod = 
              io.grpc.MethodDescriptor.<grpc.conferenceRoom.BookConferenceRoomRequest, grpc.conferenceRoom.BookConferenceRoomResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ConferenceRoom", "BookConferenceRoom"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.BookConferenceRoomRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.BookConferenceRoomResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ConferenceRoomMethodDescriptorSupplier("BookConferenceRoom"))
                  .build();
          }
        }
     }
     return getBookConferenceRoomMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.conferenceRoom.OccupancyDataRequest,
      grpc.conferenceRoom.Empty> getSendOccupancyDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendOccupancyData",
      requestType = grpc.conferenceRoom.OccupancyDataRequest.class,
      responseType = grpc.conferenceRoom.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.conferenceRoom.OccupancyDataRequest,
      grpc.conferenceRoom.Empty> getSendOccupancyDataMethod() {
    io.grpc.MethodDescriptor<grpc.conferenceRoom.OccupancyDataRequest, grpc.conferenceRoom.Empty> getSendOccupancyDataMethod;
    if ((getSendOccupancyDataMethod = ConferenceRoomGrpc.getSendOccupancyDataMethod) == null) {
      synchronized (ConferenceRoomGrpc.class) {
        if ((getSendOccupancyDataMethod = ConferenceRoomGrpc.getSendOccupancyDataMethod) == null) {
          ConferenceRoomGrpc.getSendOccupancyDataMethod = getSendOccupancyDataMethod = 
              io.grpc.MethodDescriptor.<grpc.conferenceRoom.OccupancyDataRequest, grpc.conferenceRoom.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ConferenceRoom", "SendOccupancyData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.OccupancyDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.conferenceRoom.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ConferenceRoomMethodDescriptorSupplier("SendOccupancyData"))
                  .build();
          }
        }
     }
     return getSendOccupancyDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConferenceRoomStub newStub(io.grpc.Channel channel) {
    return new ConferenceRoomStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConferenceRoomBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConferenceRoomBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConferenceRoomFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConferenceRoomFutureStub(channel);
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static abstract class ConferenceRoomImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Server stream rpc
     *Client requests available conference rooms, server returns a stream of available rooms
     * </pre>
     */
    public void getAvailableRooms(grpc.conferenceRoom.GetAvailableRoomsRequest request,
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.GetAvailableRoomsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAvailableRoomsMethod(), responseObserver);
    }

    /**
     * <pre>
     *Unary rpc
     *Client books a conference room, server returns confirmation message
     * </pre>
     */
    public void bookConferenceRoom(grpc.conferenceRoom.BookConferenceRoomRequest request,
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.BookConferenceRoomResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookConferenceRoomMethod(), responseObserver);
    }

    /**
     * <pre>
     *Client streaming
     *Sensor sends conference room occupancy data, server returns empty
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.conferenceRoom.OccupancyDataRequest> sendOccupancyData(
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendOccupancyDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAvailableRoomsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.conferenceRoom.GetAvailableRoomsRequest,
                grpc.conferenceRoom.GetAvailableRoomsResponse>(
                  this, METHODID_GET_AVAILABLE_ROOMS)))
          .addMethod(
            getBookConferenceRoomMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.conferenceRoom.BookConferenceRoomRequest,
                grpc.conferenceRoom.BookConferenceRoomResponse>(
                  this, METHODID_BOOK_CONFERENCE_ROOM)))
          .addMethod(
            getSendOccupancyDataMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.conferenceRoom.OccupancyDataRequest,
                grpc.conferenceRoom.Empty>(
                  this, METHODID_SEND_OCCUPANCY_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class ConferenceRoomStub extends io.grpc.stub.AbstractStub<ConferenceRoomStub> {
    private ConferenceRoomStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConferenceRoomStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceRoomStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConferenceRoomStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server stream rpc
     *Client requests available conference rooms, server returns a stream of available rooms
     * </pre>
     */
    public void getAvailableRooms(grpc.conferenceRoom.GetAvailableRoomsRequest request,
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.GetAvailableRoomsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAvailableRoomsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Unary rpc
     *Client books a conference room, server returns confirmation message
     * </pre>
     */
    public void bookConferenceRoom(grpc.conferenceRoom.BookConferenceRoomRequest request,
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.BookConferenceRoomResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookConferenceRoomMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Client streaming
     *Sensor sends conference room occupancy data, server returns empty
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.conferenceRoom.OccupancyDataRequest> sendOccupancyData(
        io.grpc.stub.StreamObserver<grpc.conferenceRoom.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSendOccupancyDataMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class ConferenceRoomBlockingStub extends io.grpc.stub.AbstractStub<ConferenceRoomBlockingStub> {
    private ConferenceRoomBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConferenceRoomBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceRoomBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConferenceRoomBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Server stream rpc
     *Client requests available conference rooms, server returns a stream of available rooms
     * </pre>
     */
    public java.util.Iterator<grpc.conferenceRoom.GetAvailableRoomsResponse> getAvailableRooms(
        grpc.conferenceRoom.GetAvailableRoomsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAvailableRoomsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Unary rpc
     *Client books a conference room, server returns confirmation message
     * </pre>
     */
    public grpc.conferenceRoom.BookConferenceRoomResponse bookConferenceRoom(grpc.conferenceRoom.BookConferenceRoomRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookConferenceRoomMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining the service containing methods
   * </pre>
   */
  public static final class ConferenceRoomFutureStub extends io.grpc.stub.AbstractStub<ConferenceRoomFutureStub> {
    private ConferenceRoomFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConferenceRoomFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConferenceRoomFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConferenceRoomFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Unary rpc
     *Client books a conference room, server returns confirmation message
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.conferenceRoom.BookConferenceRoomResponse> bookConferenceRoom(
        grpc.conferenceRoom.BookConferenceRoomRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookConferenceRoomMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AVAILABLE_ROOMS = 0;
  private static final int METHODID_BOOK_CONFERENCE_ROOM = 1;
  private static final int METHODID_SEND_OCCUPANCY_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConferenceRoomImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConferenceRoomImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABLE_ROOMS:
          serviceImpl.getAvailableRooms((grpc.conferenceRoom.GetAvailableRoomsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.conferenceRoom.GetAvailableRoomsResponse>) responseObserver);
          break;
        case METHODID_BOOK_CONFERENCE_ROOM:
          serviceImpl.bookConferenceRoom((grpc.conferenceRoom.BookConferenceRoomRequest) request,
              (io.grpc.stub.StreamObserver<grpc.conferenceRoom.BookConferenceRoomResponse>) responseObserver);
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
        case METHODID_SEND_OCCUPANCY_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendOccupancyData(
              (io.grpc.stub.StreamObserver<grpc.conferenceRoom.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ConferenceRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConferenceRoomBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.conferenceRoom.ConferenceRoomService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConferenceRoom");
    }
  }

  private static final class ConferenceRoomFileDescriptorSupplier
      extends ConferenceRoomBaseDescriptorSupplier {
    ConferenceRoomFileDescriptorSupplier() {}
  }

  private static final class ConferenceRoomMethodDescriptorSupplier
      extends ConferenceRoomBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConferenceRoomMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConferenceRoomGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConferenceRoomFileDescriptorSupplier())
              .addMethod(getGetAvailableRoomsMethod())
              .addMethod(getBookConferenceRoomMethod())
              .addMethod(getSendOccupancyDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
