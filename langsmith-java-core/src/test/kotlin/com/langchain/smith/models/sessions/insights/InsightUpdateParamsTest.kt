// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightUpdateParamsTest {

    @Test
    fun create() {
        InsightUpdateParams.builder()
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InsightUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InsightUpdateParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
