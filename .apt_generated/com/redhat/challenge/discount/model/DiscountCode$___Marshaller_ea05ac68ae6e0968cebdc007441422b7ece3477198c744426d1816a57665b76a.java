/*
 Generated by org.infinispan.protostream.annotations.impl.processor.MarshallerSourceCodeGenerator
 for class com.redhat.challenge.discount.model.DiscountCode
*/

package com.redhat.challenge.discount.model;

import com.redhat.challenge.discount.model.DiscountCode;

/**
 * WARNING: Generated code! Do not edit!
 *
 * @private
 */
@javax.annotation.Generated(
   value = "org.infinispan.protostream.annotations.impl.processor.AutoProtoSchemaBuilderAnnotationProcessor",
   comments = "Please do not edit this file!"
)
@SuppressWarnings("all")
public final class DiscountCode$___Marshaller_ea05ac68ae6e0968cebdc007441422b7ece3477198c744426d1816a57665b76a extends org.infinispan.protostream.annotations.impl.GeneratedMarshallerBase implements org.infinispan.protostream.ProtobufTagMarshaller<com.redhat.challenge.discount.model.DiscountCode> {

   @Override
   public Class<com.redhat.challenge.discount.model.DiscountCode> getJavaClass() { return com.redhat.challenge.discount.model.DiscountCode.class; }
   
   @Override
   public String getTypeName() { return "discounts.DiscountCode"; }
   
   @Override
   public com.redhat.challenge.discount.model.DiscountCode read(org.infinispan.protostream.ProtobufTagMarshaller.ReadContext $1) throws java.io.IOException {
      final org.infinispan.protostream.TagReader $in = $1.getReader();
      final com.redhat.challenge.discount.model.DiscountCode o = new com.redhat.challenge.discount.model.DiscountCode();
      boolean done = false;
      while (!done) {
         final int tag = $in.readTag();
         switch (tag) {
            case 0: {
               done = true;
               break;
            }
            default: {
               if (!$in.skipField(tag)) done = true;
            }
         }
      }
      return o;
   }
   
   @Override
   public void write(org.infinispan.protostream.ProtobufTagMarshaller.WriteContext $1, com.redhat.challenge.discount.model.DiscountCode $2) throws java.io.IOException {
   }
}
