// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.share

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareDeleteParamsTest {

    @Test
    fun create() {
        ShareDeleteParams.builder()
            .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ShareDeleteParams.builder().traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ShareDeleteParams.builder()
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        val body = params._body()

        assertThat(body.sessionId()).contains("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ShareDeleteParams.builder().traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
