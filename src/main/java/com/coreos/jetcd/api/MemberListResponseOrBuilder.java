// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package com.coreos.jetcd.api;

public interface MemberListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:etcdserverpb.MemberListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeader getHeader();
  /**
   * <code>.etcdserverpb.ResponseHeader header = 1;</code>
   */
  com.coreos.jetcd.api.ResponseHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<Member>
      getMembersList();
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  Member getMembers(int index);
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  java.util.List<? extends com.coreos.jetcd.api.MemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * members is a list of all members associated with the cluster.
   * </pre>
   *
   * <code>repeated .etcdserverpb.Member members = 2;</code>
   */
  com.coreos.jetcd.api.MemberOrBuilder getMembersOrBuilder(
    int index);
}
