// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .extendTraceRetention(true)
            .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extendTraceRetention(true)
                .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("extend_trace_retention", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extendTraceRetention(true)
                .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RunCreateParams.Body.ofRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyOfRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RunCreateParams.Body.ofRunsUuidArray(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            )
    }
}
