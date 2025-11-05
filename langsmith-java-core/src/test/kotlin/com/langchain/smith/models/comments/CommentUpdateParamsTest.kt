// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentUpdateParamsTest {

    @Test
    fun create() {
        CommentUpdateParams.builder()
            .owner("owner")
            .repo("repo")
            .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createCommentRequest(CreateCommentRequest.builder().content("content").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommentUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateCommentRequest.builder().content("content").build())
    }
}
