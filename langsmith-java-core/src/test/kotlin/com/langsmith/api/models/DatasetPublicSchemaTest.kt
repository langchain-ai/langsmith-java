// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetPublicSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createDatasetPublicSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val datasetPublicSchema =
            DatasetPublicSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .exampleCount(123L)
                .name("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetPublicSchema.DataType.KV)
                .description("string")
                .build()
        assertThat(datasetPublicSchema).isNotNull
        assertThat(datasetPublicSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetPublicSchema.exampleCount()).isEqualTo(123L)
        assertThat(datasetPublicSchema.name()).isEqualTo("string")
        assertThat(datasetPublicSchema.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetPublicSchema.dataType()).contains(DatasetPublicSchema.DataType.KV)
        assertThat(datasetPublicSchema.description()).contains("string")
    }
}
