// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.share

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetShareSchemaTest {

    @Test
    fun create() {
        val datasetShareSchema =
            DatasetShareSchema.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(datasetShareSchema.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetShareSchema.shareToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datasetShareSchema =
            DatasetShareSchema.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedDatasetShareSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datasetShareSchema),
                jacksonTypeRef<DatasetShareSchema>(),
            )

        assertThat(roundtrippedDatasetShareSchema).isEqualTo(datasetShareSchema)
    }
}
