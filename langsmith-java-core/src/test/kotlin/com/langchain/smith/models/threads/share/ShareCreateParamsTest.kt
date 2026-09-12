// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads.share

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ShareCreateParamsTest {

    @Test
    fun create() {
        ShareCreateParams.builder()
            .threadId("thread_id")
            .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ShareCreateParams.builder()
                .threadId("thread_id")
                .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("thread_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ShareCreateParams.builder()
                .threadId("thread_id")
                .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }
}
