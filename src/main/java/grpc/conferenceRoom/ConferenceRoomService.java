// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ConferenceRoom.proto

package grpc.conferenceRoom;

public final class ConferenceRoomService {
  private ConferenceRoomService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAvailableRoomsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAvailableRoomsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAvailableRoomsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAvailableRoomsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookConferenceRoomRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookConferenceRoomRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BookConferenceRoomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BookConferenceRoomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LiveOccupancyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LiveOccupancyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LiveOccupancyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LiveOccupancyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024ConferenceRoom.proto\":\n\030GetAvailableRo" +
      "omsRequest\022\014\n\004date\030\001 \001(\t\022\020\n\010timeslot\030\002 \001" +
      "(\t\"7\n\031GetAvailableRoomsResponse\022\032\n\022confe" +
      "renceRoomName\030\002 \001(\t\"W\n\031BookConferenceRoo" +
      "mRequest\022\014\n\004date\030\001 \001(\t\022\020\n\010timeslot\030\002 \001(\t" +
      "\022\032\n\022conferenceRoomName\030\004 \001(\t\"-\n\032BookConf" +
      "erenceRoomResponse\022\017\n\007message\030\001 \001(\t\")\n\024L" +
      "iveOccupancyRequest\022\021\n\tnumPeople\030\001 \001(\005\"/" +
      "\n\025LiveOccupancyResponse\022\026\n\016totalOccupanc" +
      "y\030\001 \001(\0052\376\001\n\016ConferenceRoom\022N\n\021GetAvailab" +
      "leRooms\022\031.GetAvailableRoomsRequest\032\032.Get" +
      "AvailableRoomsResponse\"\0000\001\022O\n\022BookConfer" +
      "enceRoom\022\032.BookConferenceRoomRequest\032\033.B" +
      "ookConferenceRoomResponse\"\000\022K\n\026Calculate" +
      "LiveOccupancy\022\025.LiveOccupancyRequest\032\026.L" +
      "iveOccupancyResponse\"\000(\001B.\n\023grpc.confere" +
      "nceRoomB\025ConferenceRoomServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GetAvailableRoomsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetAvailableRoomsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAvailableRoomsRequest_descriptor,
        new java.lang.String[] { "Date", "Timeslot", });
    internal_static_GetAvailableRoomsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetAvailableRoomsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAvailableRoomsResponse_descriptor,
        new java.lang.String[] { "ConferenceRoomName", });
    internal_static_BookConferenceRoomRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_BookConferenceRoomRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookConferenceRoomRequest_descriptor,
        new java.lang.String[] { "Date", "Timeslot", "ConferenceRoomName", });
    internal_static_BookConferenceRoomResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_BookConferenceRoomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BookConferenceRoomResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_LiveOccupancyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_LiveOccupancyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LiveOccupancyRequest_descriptor,
        new java.lang.String[] { "NumPeople", });
    internal_static_LiveOccupancyResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_LiveOccupancyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LiveOccupancyResponse_descriptor,
        new java.lang.String[] { "TotalOccupancy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
