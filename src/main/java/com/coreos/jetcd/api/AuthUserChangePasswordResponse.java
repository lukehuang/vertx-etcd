// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

/**
 * Protobuf type {@code etcdserverpb.AuthUserChangePasswordResponse}
 */
public  final class AuthUserChangePasswordResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:etcdserverpb.AuthUserChangePasswordResponse)
    AuthUserChangePasswordResponseOrBuilder {
  // Use AuthUserChangePasswordResponse.newBuilder() to construct.
  private AuthUserChangePasswordResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AuthUserChangePasswordResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AuthUserChangePasswordResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.coreos.jetcd.api.ResponseHeader.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.coreos.jetcd.api.ResponseHeader.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AuthUserChangePasswordResponse_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AuthUserChangePasswordResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            AuthUserChangePasswordResponse.class, Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.coreos.jetcd.api.ResponseHeader header_;
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public com.coreos.jetcd.api.ResponseHeader getHeader() {
    return header_ == null ? com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
  }
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  public com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof AuthUserChangePasswordResponse)) {
      return super.equals(obj);
    }
    AuthUserChangePasswordResponse other = (AuthUserChangePasswordResponse) obj;

    boolean result = true;
    result = result && (hasHeader() == other.hasHeader());
    if (hasHeader()) {
      result = result && getHeader()
          .equals(other.getHeader());
    }
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static AuthUserChangePasswordResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthUserChangePasswordResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static AuthUserChangePasswordResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthUserChangePasswordResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static AuthUserChangePasswordResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static AuthUserChangePasswordResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(AuthUserChangePasswordResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code etcdserverpb.AuthUserChangePasswordResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:etcdserverpb.AuthUserChangePasswordResponse)
      com.coreos.jetcd.api.AuthUserChangePasswordResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AuthUserChangePasswordResponse_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AuthUserChangePasswordResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              AuthUserChangePasswordResponse.class, Builder.class);
    }

    // Construct using com.coreos.jetcd.api.AuthUserChangePasswordResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreos.jetcd.api.JetcdProto.internal_static_etcdserverpb_AuthUserChangePasswordResponse_descriptor;
    }

    public AuthUserChangePasswordResponse getDefaultInstanceForType() {
      return AuthUserChangePasswordResponse.getDefaultInstance();
    }

    public AuthUserChangePasswordResponse build() {
      AuthUserChangePasswordResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public AuthUserChangePasswordResponse buildPartial() {
      AuthUserChangePasswordResponse result = new AuthUserChangePasswordResponse(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof AuthUserChangePasswordResponse) {
        return mergeFrom((AuthUserChangePasswordResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(AuthUserChangePasswordResponse other) {
      if (other == AuthUserChangePasswordResponse.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      AuthUserChangePasswordResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (AuthUserChangePasswordResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.coreos.jetcd.api.ResponseHeader header_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder> headerBuilder_;
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeader getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(com.coreos.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder setHeader(
        com.coreos.jetcd.api.ResponseHeader.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder mergeHeader(com.coreos.jetcd.api.ResponseHeader value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.coreos.jetcd.api.ResponseHeader.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeader.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    public com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.coreos.jetcd.api.ResponseHeader.getDefaultInstance() : header_;
      }
    }
    /**
     * <code>.etcdserverpb.ResponseHeader header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.coreos.jetcd.api.ResponseHeader, com.coreos.jetcd.api.ResponseHeader.Builder, com.coreos.jetcd.api.ResponseHeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:etcdserverpb.AuthUserChangePasswordResponse)
  }

  // @@protoc_insertion_point(class_scope:etcdserverpb.AuthUserChangePasswordResponse)
  private static final AuthUserChangePasswordResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new AuthUserChangePasswordResponse();
  }

  public static AuthUserChangePasswordResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuthUserChangePasswordResponse>
      PARSER = new com.google.protobuf.AbstractParser<AuthUserChangePasswordResponse>() {
    public AuthUserChangePasswordResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthUserChangePasswordResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AuthUserChangePasswordResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<AuthUserChangePasswordResponse> getParserForType() {
    return PARSER;
  }

  public AuthUserChangePasswordResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

