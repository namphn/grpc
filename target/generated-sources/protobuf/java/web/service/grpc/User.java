// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package web.service.grpc;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateUserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"|\n\021CreateUserRequest\022\021\n\tuse" +
      "rEmail\030\001 \001(\t\022\020\n\010userName\030\002 \001(\t\022\024\n\014userPa" +
      "ssword\030\003 \001(\t\022\023\n\013userAddress\030\004 \001(\t\022\027\n\017use" +
      "rPhoneNumber\030\005 \001(\t\"7\n\022CreateUserResponse" +
      "\022\016\n\006userId\030\001 \001(\t\022\021\n\tuserEmail\030\002 \001(\t2D\n\013U" +
      "serService\0225\n\ncreateUser\022\022.CreateUserReq" +
      "uest\032\023.CreateUserResponseB\027\n\020web.service" +
      ".grpcP\001\210\001\001b\006proto3"
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
    internal_static_CreateUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateUserRequest_descriptor,
        new java.lang.String[] { "UserEmail", "UserName", "UserPassword", "UserAddress", "UserPhoneNumber", });
    internal_static_CreateUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CreateUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateUserResponse_descriptor,
        new java.lang.String[] { "UserId", "UserEmail", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
