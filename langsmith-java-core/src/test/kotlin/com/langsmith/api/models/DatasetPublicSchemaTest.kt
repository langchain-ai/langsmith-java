// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetPublicSchemaTest {

    @Test
    fun createDatasetPublicSchema() {
        val datasetPublicSchema =
            DatasetPublicSchema.builder()
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
