// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Printer.proto

package grpc.printer;

/**
 * <pre>
 * Defining the data types
 * </pre>
 *
 * Protobuf type {@code PrintsAllDocumentsRequest}
 */
public  final class PrintsAllDocumentsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PrintsAllDocumentsRequest)
    PrintsAllDocumentsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PrintsAllDocumentsRequest.newBuilder() to construct.
  private PrintsAllDocumentsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PrintsAllDocumentsRequest() {
    documentName_ = "";
    copies_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PrintsAllDocumentsRequest(
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

            documentName_ = s;
            break;
          }
          case 16: {

            copies_ = input.readInt32();
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
    return grpc.printer.PrinterService.internal_static_PrintsAllDocumentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.printer.PrinterService.internal_static_PrintsAllDocumentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.printer.PrintsAllDocumentsRequest.class, grpc.printer.PrintsAllDocumentsRequest.Builder.class);
  }

  public static final int DOCUMENTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object documentName_;
  /**
   * <code>string documentName = 1;</code>
   */
  public java.lang.String getDocumentName() {
    java.lang.Object ref = documentName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      documentName_ = s;
      return s;
    }
  }
  /**
   * <code>string documentName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getDocumentNameBytes() {
    java.lang.Object ref = documentName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      documentName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COPIES_FIELD_NUMBER = 2;
  private int copies_;
  /**
   * <code>int32 copies = 2;</code>
   */
  public int getCopies() {
    return copies_;
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
    if (!getDocumentNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, documentName_);
    }
    if (copies_ != 0) {
      output.writeInt32(2, copies_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDocumentNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, documentName_);
    }
    if (copies_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, copies_);
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
    if (!(obj instanceof grpc.printer.PrintsAllDocumentsRequest)) {
      return super.equals(obj);
    }
    grpc.printer.PrintsAllDocumentsRequest other = (grpc.printer.PrintsAllDocumentsRequest) obj;

    boolean result = true;
    result = result && getDocumentName()
        .equals(other.getDocumentName());
    result = result && (getCopies()
        == other.getCopies());
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
    hash = (37 * hash) + DOCUMENTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDocumentName().hashCode();
    hash = (37 * hash) + COPIES_FIELD_NUMBER;
    hash = (53 * hash) + getCopies();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.printer.PrintsAllDocumentsRequest parseFrom(
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
  public static Builder newBuilder(grpc.printer.PrintsAllDocumentsRequest prototype) {
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
   * <pre>
   * Defining the data types
   * </pre>
   *
   * Protobuf type {@code PrintsAllDocumentsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PrintsAllDocumentsRequest)
      grpc.printer.PrintsAllDocumentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.printer.PrinterService.internal_static_PrintsAllDocumentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.printer.PrinterService.internal_static_PrintsAllDocumentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.printer.PrintsAllDocumentsRequest.class, grpc.printer.PrintsAllDocumentsRequest.Builder.class);
    }

    // Construct using grpc.printer.PrintsAllDocumentsRequest.newBuilder()
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
      documentName_ = "";

      copies_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.printer.PrinterService.internal_static_PrintsAllDocumentsRequest_descriptor;
    }

    @java.lang.Override
    public grpc.printer.PrintsAllDocumentsRequest getDefaultInstanceForType() {
      return grpc.printer.PrintsAllDocumentsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.printer.PrintsAllDocumentsRequest build() {
      grpc.printer.PrintsAllDocumentsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.printer.PrintsAllDocumentsRequest buildPartial() {
      grpc.printer.PrintsAllDocumentsRequest result = new grpc.printer.PrintsAllDocumentsRequest(this);
      result.documentName_ = documentName_;
      result.copies_ = copies_;
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
      if (other instanceof grpc.printer.PrintsAllDocumentsRequest) {
        return mergeFrom((grpc.printer.PrintsAllDocumentsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.printer.PrintsAllDocumentsRequest other) {
      if (other == grpc.printer.PrintsAllDocumentsRequest.getDefaultInstance()) return this;
      if (!other.getDocumentName().isEmpty()) {
        documentName_ = other.documentName_;
        onChanged();
      }
      if (other.getCopies() != 0) {
        setCopies(other.getCopies());
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
      grpc.printer.PrintsAllDocumentsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.printer.PrintsAllDocumentsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object documentName_ = "";
    /**
     * <code>string documentName = 1;</code>
     */
    public java.lang.String getDocumentName() {
      java.lang.Object ref = documentName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        documentName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string documentName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getDocumentNameBytes() {
      java.lang.Object ref = documentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        documentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string documentName = 1;</code>
     */
    public Builder setDocumentName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      documentName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string documentName = 1;</code>
     */
    public Builder clearDocumentName() {
      
      documentName_ = getDefaultInstance().getDocumentName();
      onChanged();
      return this;
    }
    /**
     * <code>string documentName = 1;</code>
     */
    public Builder setDocumentNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      documentName_ = value;
      onChanged();
      return this;
    }

    private int copies_ ;
    /**
     * <code>int32 copies = 2;</code>
     */
    public int getCopies() {
      return copies_;
    }
    /**
     * <code>int32 copies = 2;</code>
     */
    public Builder setCopies(int value) {
      
      copies_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 copies = 2;</code>
     */
    public Builder clearCopies() {
      
      copies_ = 0;
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


    // @@protoc_insertion_point(builder_scope:PrintsAllDocumentsRequest)
  }

  // @@protoc_insertion_point(class_scope:PrintsAllDocumentsRequest)
  private static final grpc.printer.PrintsAllDocumentsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.printer.PrintsAllDocumentsRequest();
  }

  public static grpc.printer.PrintsAllDocumentsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PrintsAllDocumentsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PrintsAllDocumentsRequest>() {
    @java.lang.Override
    public PrintsAllDocumentsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PrintsAllDocumentsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PrintsAllDocumentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PrintsAllDocumentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.printer.PrintsAllDocumentsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

