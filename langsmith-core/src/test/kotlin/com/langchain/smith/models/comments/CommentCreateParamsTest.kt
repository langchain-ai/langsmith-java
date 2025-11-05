// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.comments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentCreateParamsTest {

    @Test
    fun create() {
        CommentCreateParams.builder()
            .owner("owner")
            .repo("repo")
            .createCommentRequest(CreateCommentRequest.builder().content("content").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CommentCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .createCommentRequest(CreateCommentRequest.builder().content("content").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CreateCommentRequest.builder().content("content").build())
    }
}
