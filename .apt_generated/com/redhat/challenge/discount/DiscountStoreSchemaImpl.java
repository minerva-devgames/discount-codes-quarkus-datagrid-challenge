/*
 Generated by org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor
 for class com.redhat.challenge.discount.DiscountStoreSchema
 annotated with @org.infinispan.protostream.annotations.AutoProtoSchemaBuilder(includeClasses = {com.redhat.challenge.discount.model.DiscountCode.class}, schemaPackageName = "discounts")
 */

package com.redhat.challenge.discount;

/**
 * WARNING: Generated code! Do not edit!
 */
@javax.annotation.Generated(
   value = "org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor",
   comments = "Please do not edit this file!"
)
@org.infinispan.protostream.annotations.impl.processor.OriginatingClasses({
   com.redhat.challenge.discount.model.DiscountCode.class
})
/*@org.infinispan.protostream.annotations.AutoProtoSchemaBuilder(
   className = "DiscountStoreSchemaImpl",
   schemaFileName = "DiscountStoreSchema.proto",
   schemaFilePath = "",
   schemaPackageName = "discounts",
   service = true,
   marshallersOnly = false,
   autoImportClasses = false,
   includeClasses = {
      com.redhat.challenge.discount.model.DiscountCode.class
   }
)*/
@SuppressWarnings("all")
public class DiscountStoreSchemaImpl implements com.redhat.challenge.discount.DiscountStoreSchema {

   private static final String PROTO_SCHEMA = "// File name: DiscountStoreSchema.proto\n" +
   "// Generated from : com.redhat.challenge.discount.DiscountStoreSchema\n" +
   "\n" +
   "syntax = \"proto2\";\n" +
   "\n" +
   "package discounts;\n" +
   "\n" +
   "\n" +
   "\n" +
   "message DiscountCode {\n" +
   "}\n" +
   "";
   
   @Override
   public String getProtoFileName() { return "DiscountStoreSchema.proto"; }
   
   @Override
   public String getProtoFile() { return PROTO_SCHEMA; }
   
   @Override
   public void registerSchema(org.infinispan.protostream.SerializationContext serCtx) {
      serCtx.registerProtoFiles(org.infinispan.protostream.FileDescriptorSource.fromString(getProtoFileName(), getProtoFile()));
   }
   
   @Override
   public void registerMarshallers(org.infinispan.protostream.SerializationContext serCtx) {
      serCtx.registerMarshaller(new com.redhat.challenge.discount.model.DiscountCode$___Marshaller_ea05ac68ae6e0968cebdc007441422b7ece3477198c744426d1816a57665b76a());
   }
}