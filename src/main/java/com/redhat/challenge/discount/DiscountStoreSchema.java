package com.redhat.challenge.discount;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import com.redhat.challenge.discount.model.DiscountCode;

@AutoProtoSchemaBuilder(includeClasses = {DiscountCode.class}, schemaPackageName = "discounts")
interface DiscountStoreSchema extends GeneratedSchema{

}