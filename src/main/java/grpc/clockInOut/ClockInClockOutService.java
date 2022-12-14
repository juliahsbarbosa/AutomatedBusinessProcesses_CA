// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClockInOut.proto

package grpc.clockInOut;

public final class ClockInClockOutService {
  private ClockInClockOutService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClockinRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClockinRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClockinResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClockinResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClockoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClockoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClockoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClockoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020ClockInOut.proto\"D\n\016ClockinRequest\022\022\n\n" +
      "employeeId\030\001 \001(\005\022\016\n\006dateIn\030\002 \001(\t\022\016\n\006time" +
      "In\030\003 \001(\t\"\"\n\017ClockinResponse\022\017\n\007message\030\001" +
      " \001(\t\"G\n\017ClockoutRequest\022\022\n\nemployeeId\030\001 " +
      "\001(\005\022\017\n\007dateOut\030\002 \001(\t\022\017\n\007timeOut\030\003 \001(\t\"#\n" +
      "\020ClockoutResponse\022\017\n\007message\030\001 \001(\t2l\n\007Cl" +
      "ockin\022.\n\007ClockIn\022\017.ClockinRequest\032\020.Cloc" +
      "kinResponse\"\000\0221\n\010ClockOut\022\020.ClockoutRequ" +
      "est\032\021.ClockoutResponse\"\000B+\n\017grpc.clockIn" +
      "OutB\026ClockInClockOutServiceP\001b\006proto3"
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
    internal_static_ClockinRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClockinRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClockinRequest_descriptor,
        new java.lang.String[] { "EmployeeId", "DateIn", "TimeIn", });
    internal_static_ClockinResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ClockinResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClockinResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_ClockoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ClockoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClockoutRequest_descriptor,
        new java.lang.String[] { "EmployeeId", "DateOut", "TimeOut", });
    internal_static_ClockoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ClockoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClockoutResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
