// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateParamsTest {

    @Test
    fun create() {
        RunCreateParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .bodyOfRunIdList(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyOfRunIdList(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunCreateParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .bodyOfRunIdList(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RunCreateParams.Body.ofRunIdList(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
            )
    }
}
