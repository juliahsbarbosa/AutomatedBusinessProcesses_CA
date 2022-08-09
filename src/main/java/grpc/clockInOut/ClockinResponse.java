// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClockInOut.proto

package grpc.clockInOut;

/**
 * Protobuf type {@code ClockinResponse}
 */
public  final class ClockinResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClockinResponse)
    ClockinResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClockinResponse.newBuilder() to construct.
  private ClockinResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClockinResponse() {
    employeeId_ = "";
    date_ = "";
    timein_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClockinResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            employeeId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            date_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            timein_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.clockInOut.ClockInClockOutService.internal_static_ClockinResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.clockInOut.ClockInClockOutService.internal_static_ClockinResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.clockInOut.ClockinResponse.class, grpc.clockInOut.ClockinResponse.Builder.class);
  }

  public static final int EMPLOYEEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object employeeId_;
  /**
   * <code>string employeeId = 1;</code>
   */
  public java.lang.String getEmployeeId() {
    java.lang.Object ref = employeeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employeeId_ = s;
      return s;
    }
  }
  /**
   * <code>string employeeId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEmployeeIdBytes() {
    java.lang.Object ref = employeeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      employeeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object date_;
  /**
   * <code>string date = 2;</code>
   */
  public java.lang.String getDate() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      date_ = s;
      return s;
    }
  }
  /**
   * <code>string date = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDateBytes() {
    java.lang.Object ref = date_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      date_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TIMEIN_FIELD_NUMBER = 3;
  private volatile java.lang.Object timein_;
  /**
   * <code>string timein = 3;</code>
   */
  public java.lang.String getTimein() {
    java.lang.Object ref = timein_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timein_ = s;
      return s;
    }
  }
  /**
   * <code>string timein = 3;</code>
   */
  public com.google.protobuf.ByteString
      getTimeinBytes() {
    java.lang.Object ref = timein_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timein_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getEmployeeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, employeeId_);
    }
    if (!getDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, date_);
    }
    if (!getTimeinBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timein_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmployeeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, employeeId_);
    }
    if (!getDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, date_);
    }
    if (!getTimeinBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timein_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.clockInOut.ClockinResponse)) {
      return super.equals(obj);
    }
    grpc.clockInOut.ClockinResponse other = (grpc.clockInOut.ClockinResponse) obj;

    boolean result = true;
    result = result && getEmployeeId()
        .equals(other.getEmployeeId());
    result = result && getDate()
        .equals(other.getDate());
    result = result && getTimein()
        .equals(other.getTimein());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EMPLOYEEID_FIELD_NUMBER;
    hash = (53 * hash) + getEmployeeId().hashCode();
    hash = (37 * hash) + DATE_FIELD_NUMBER;
    hash = (53 * hash) + getDate().hashCode();
    hash = (37 * hash) + TIMEIN_FIELD_NUMBER;
    hash = (53 * hash) + getTimein().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.clockInOut.ClockinResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.clockInOut.ClockinResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.clockInOut.ClockinResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.clockInOut.ClockinResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(grpc.clockInOut.ClockinResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ClockinResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClockinResponse)
      grpc.clockInOut.ClockinResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.clockInOut.ClockInClockOutService.internal_static_ClockinResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.clockInOut.ClockInClockOutService.internal_static_ClockinResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.clockInOut.ClockinResponse.class, grpc.clockInOut.ClockinResponse.Builder.class);
    }

    // Construct using grpc.clockInOut.ClockinResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      employeeId_ = "";

      date_ = "";

      timein_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.clockInOut.ClockInClockOutService.internal_static_ClockinResponse_descriptor;
    }

    @java.lang.Override
    public grpc.clockInOut.ClockinResponse getDefaultInstanceForType() {
      return grpc.clockInOut.ClockinResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.clockInOut.ClockinResponse build() {
      grpc.clockInOut.ClockinResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.clockInOut.ClockinResponse buildPartial() {
      grpc.clockInOut.ClockinResponse result = new grpc.clockInOut.ClockinResponse(this);
      result.employeeId_ = employeeId_;
      result.date_ = date_;
      result.timein_ = timein_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof grpc.clockInOut.ClockinResponse) {
        return mergeFrom((grpc.clockInOut.ClockinResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.clockInOut.ClockinResponse other) {
      if (other == grpc.clockInOut.ClockinResponse.getDefaultInstance()) return this;
      if (!other.getEmployeeId().isEmpty()) {
        employeeId_ = other.employeeId_;
        onChanged();
      }
      if (!other.getDate().isEmpty()) {
        date_ = other.date_;
        onChanged();
      }
      if (!other.getTimein().isEmpty()) {
        timein_ = other.timein_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      grpc.clockInOut.ClockinResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.clockInOut.ClockinResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object employeeId_ = "";
    /**
     * <code>string employeeId = 1;</code>
     */
    public java.lang.String getEmployeeId() {
      java.lang.Object ref = employeeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employeeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string employeeId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEmployeeIdBytes() {
      java.lang.Object ref = employeeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        employeeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string employeeId = 1;</code>
     */
    public Builder setEmployeeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      employeeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string employeeId = 1;</code>
     */
    public Builder clearEmployeeId() {
      
      employeeId_ = getDefaultInstance().getEmployeeId();
      onChanged();
      return this;
    }
    /**
     * <code>string employeeId = 1;</code>
     */
    public Builder setEmployeeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      employeeId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object date_ = "";
    /**
     * <code>string date = 2;</code>
     */
    public java.lang.String getDate() {
      java.lang.Object ref = date_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        date_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string date = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDateBytes() {
      java.lang.Object ref = date_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        date_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string date = 2;</code>
     */
    public Builder setDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      date_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string date = 2;</code>
     */
    public Builder clearDate() {
      
      date_ = getDefaultInstance().getDate();
      onChanged();
      return this;
    }
    /**
     * <code>string date = 2;</code>
     */
    public Builder setDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      date_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object timein_ = "";
    /**
     * <code>string timein = 3;</code>
     */
    public java.lang.String getTimein() {
      java.lang.Object ref = timein_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timein_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timein = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimeinBytes() {
      java.lang.Object ref = timein_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timein_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timein = 3;</code>
     */
    public Builder setTimein(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timein_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string timein = 3;</code>
     */
    public Builder clearTimein() {
      
      timein_ = getDefaultInstance().getTimein();
      onChanged();
      return this;
    }
    /**
     * <code>string timein = 3;</code>
     */
    public Builder setTimeinBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timein_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClockinResponse)
  }

  // @@protoc_insertion_point(class_scope:ClockinResponse)
  private static final grpc.clockInOut.ClockinResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.clockInOut.ClockinResponse();
  }

  public static grpc.clockInOut.ClockinResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClockinResponse>
      PARSER = new com.google.protobuf.AbstractParser<ClockinResponse>() {
    @java.lang.Override
    public ClockinResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClockinResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClockinResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClockinResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.clockInOut.ClockinResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
