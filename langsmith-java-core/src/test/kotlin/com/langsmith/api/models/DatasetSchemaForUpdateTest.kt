// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetSchemaForUpdateTest {

    @Test
    fun createDatasetSchemaForUpdate() {
        val datasetSchemaForUpdate =
            DatasetSchemaForUpdate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("string")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetSchemaForUpdate.DataType.KV)
                .description("string")
                .build()
        assertThat(datasetSchemaForUpdate).isNotNull
        assertThat(datasetSchemaForUpdate.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetSchemaForUpdate.name()).isEqualTo("string")
        assertThat(datasetSchemaForUpdate.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetSchemaForUpdate.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(datasetSchemaForUpdate.dataType()).contains(DatasetSchemaForUpdate.DataType.KV)
        assertThat(datasetSchemaForUpdate.description()).contains("string")
    }
}
