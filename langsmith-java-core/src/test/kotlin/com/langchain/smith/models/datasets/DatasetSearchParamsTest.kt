// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetSearchParamsTest {

    @Test
    fun create() {
        DatasetSearchParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .inputs(JsonValue.from(mapOf<String, Any>()))
            .debug(true)
            .filter("filter")
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetSearchParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetSearchParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .debug(true)
                .filter("filter")
                .limit(1L)
                .build()

        val body = params._body()

        assertThat(body._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.debug()).contains(true)
        assertThat(body.filter()).contains("filter")
        assertThat(body.limit()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetSearchParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }
}
