package com.redhat.challenge.discount;

import com.redhat.challenge.discount.model.DiscountCodeType;
import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import com.redhat.challenge.discount.model.DiscountCode;

@AutoProtoSchemaBuilder(
    includeClasses = {DiscountCode.class, DiscountCodeType.class},
    schemaPackageName = "discount",
    schemaFileName = "discountCodes.proto",
    schemaFilePath = "target/")
interface DiscountCodeSchema extends GeneratedSchema{

}