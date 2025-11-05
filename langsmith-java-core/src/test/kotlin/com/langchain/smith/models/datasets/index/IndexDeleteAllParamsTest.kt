// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.index

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexDeleteAllParamsTest {

    @Test
    fun create() {
        IndexDeleteAllParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
    }

    @Test
    fun pathParams() {
        val params =
            IndexDeleteAllParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
