// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.coreos.jetcd.api;

public interface PermissionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authpb.Permission)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.authpb.Permission.Type permType = 1;</code>
   */
  int getPermTypeValue();
  /**
   * <code>.authpb.Permission.Type permType = 1;</code>
   */
  com.coreos.jetcd.api.Permission.Type getPermType();

  /**
   * <code>bytes key = 2;</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes range_end = 3;</code>
   */
  com.google.protobuf.ByteString getRangeEnd();
}