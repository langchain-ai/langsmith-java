// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.splits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SplitCreateParamsTest {

    @Test
    fun create() {
        SplitCreateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .splitName("split_name")
            .remove(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SplitCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitName("split_name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SplitCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitName("split_name")
                .remove(true)
                .build()

        val body = params._body()

        assertThat(body.examples()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.splitName()).isEqualTo("split_name")
        assertThat(body.remove()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SplitCreateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .splitName("split_name")
                .build()

        val body = params._body()

        assertThat(body.examples()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.splitName()).isEqualTo("split_name")
    }
}
