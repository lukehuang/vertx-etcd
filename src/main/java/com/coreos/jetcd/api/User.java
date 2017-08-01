// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.coreos.jetcd.api;

/**
 * <pre>
 * User is a single entry in the bucket authUsers
 * </pre>
 *
 * Protobuf type {@code authpb.User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:authpb.User)
    UserOrBuilder {
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private User() {
    name_ = com.google.protobuf.ByteString.EMPTY;
    password_ = com.google.protobuf.ByteString.EMPTY;
    roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private User(
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

            name_ = input.readBytes();
            break;
          }
          case 18: {

            password_ = input.readBytes();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              roles_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            roles_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        roles_ = roles_.getUnmodifiableView();
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Auth.internal_static_authpb_User_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Auth.internal_static_authpb_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            User.class, Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString name_;
  /**
   * <code>bytes name = 1;</code>
   */
  public com.google.protobuf.ByteString getName() {
    return name_;
  }

  public static final int PASSWORD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString password_;
  /**
   * <code>bytes password = 2;</code>
   */
  public com.google.protobuf.ByteString getPassword() {
    return password_;
  }

  public static final int ROLES_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList roles_;
  /**
   * <code>repeated string roles = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getRolesList() {
    return roles_;
  }
  /**
   * <code>repeated string roles = 3;</code>
   */
  public int getRolesCount() {
    return roles_.size();
  }
  /**
   * <code>repeated string roles = 3;</code>
   */
  public String getRoles(int index) {
    return roles_.get(index);
  }
  /**
   * <code>repeated string roles = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRolesBytes(int index) {
    return roles_.getByteString(index);
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
    if (!name_.isEmpty()) {
      output.writeBytes(1, name_);
    }
    if (!password_.isEmpty()) {
      output.writeBytes(2, password_);
    }
    for (int i = 0; i < roles_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, roles_.getRaw(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!name_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, name_);
    }
    if (!password_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, password_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < roles_.size(); i++) {
        dataSize += computeStringSizeNoTag(roles_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRolesList().size();
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
    if (!(obj instanceof User)) {
      return super.equals(obj);
    }
    User other = (User) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getPassword()
        .equals(other.getPassword());
    result = result && getRolesList()
        .equals(other.getRolesList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    if (getRolesCount() > 0) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + getRolesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static User parseFrom(
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
  public static Builder newBuilder(User prototype) {
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
   * <pre>
   * User is a single entry in the bucket authUsers
   * </pre>
   *
   * Protobuf type {@code authpb.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:authpb.User)
      com.coreos.jetcd.api.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Auth.internal_static_authpb_User_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Auth.internal_static_authpb_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              User.class, Builder.class);
    }

    // Construct using com.coreos.jetcd.api.User.newBuilder()
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
      name_ = com.google.protobuf.ByteString.EMPTY;

      password_ = com.google.protobuf.ByteString.EMPTY;

      roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Auth.internal_static_authpb_User_descriptor;
    }

    public User getDefaultInstanceForType() {
      return User.getDefaultInstance();
    }

    public User build() {
      User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public User buildPartial() {
      User result = new User(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.name_ = name_;
      result.password_ = password_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        roles_ = roles_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.roles_ = roles_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof User) {
        return mergeFrom((User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(User other) {
      if (other == User.getDefaultInstance()) return this;
      if (other.getName() != com.google.protobuf.ByteString.EMPTY) {
        setName(other.getName());
      }
      if (other.getPassword() != com.google.protobuf.ByteString.EMPTY) {
        setPassword(other.getPassword());
      }
      if (!other.roles_.isEmpty()) {
        if (roles_.isEmpty()) {
          roles_ = other.roles_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureRolesIsMutable();
          roles_.addAll(other.roles_);
        }
        onChanged();
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
      User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (User) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString name_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes name = 1;</code>
     */
    public com.google.protobuf.ByteString getName() {
      return name_;
    }
    /**
     * <code>bytes name = 1;</code>
     */
    public Builder setName(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString password_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes password = 2;</code>
     */
    public com.google.protobuf.ByteString getPassword() {
      return password_;
    }
    /**
     * <code>bytes password = 2;</code>
     */
    public Builder setPassword(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes password = 2;</code>
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRolesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        roles_ = new com.google.protobuf.LazyStringArrayList(roles_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getRolesList() {
      return roles_.getUnmodifiableView();
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public int getRolesCount() {
      return roles_.size();
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public String getRoles(int index) {
      return roles_.get(index);
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRolesBytes(int index) {
      return roles_.getByteString(index);
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public Builder setRoles(
        int index, String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRolesIsMutable();
      roles_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public Builder addRoles(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRolesIsMutable();
      roles_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public Builder addAllRoles(
        Iterable<String> values) {
      ensureRolesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, roles_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public Builder clearRoles() {
      roles_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string roles = 3;</code>
     */
    public Builder addRolesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRolesIsMutable();
      roles_.add(value);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:authpb.User)
  }

  // @@protoc_insertion_point(class_scope:authpb.User)
  private static final User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new User();
  }

  public static User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  public User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

