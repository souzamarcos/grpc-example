// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package br.marcos.message;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_message_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_message_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_message_MessageResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\007message\"\036\n\016MessageReque" +
      "st\022\014\n\004name\030\001 \001(\t\"\"\n\017MessageResponse\022\017\n\007m" +
      "essage\030\001 \001(\t2Q\n\016MessageService\022?\n\010SayHel" +
      "lo\022\027.message.MessageRequest\032\030.message.Me" +
      "ssageResponse\"\000B(\n\021br.marcos.messageB\014Me" +
      "ssageProtoP\001\242\002\002MPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_message_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_message_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_message_MessageRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_message_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_message_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_message_MessageResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}