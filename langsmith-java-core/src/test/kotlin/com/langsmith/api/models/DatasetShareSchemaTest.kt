// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DatasetShareSchemaTest {

    @Test
    fun createDatasetShareSchema() {
        val datasetShareSchema =
            DatasetShareSchema.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(datasetShareSchema).isNotNull
        assertThat(datasetShareSchema.datasetId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(datasetShareSchema.shareToken())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
