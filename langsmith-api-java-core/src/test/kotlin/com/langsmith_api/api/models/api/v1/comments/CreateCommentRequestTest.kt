// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.comments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreateCommentRequestTest {

    @Test
    fun create() {
        val createCommentRequest = CreateCommentRequest.builder().content("content").build()

        assertThat(createCommentRequest.content()).isEqualTo("content")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createCommentRequest = CreateCommentRequest.builder().content("content").build()

        val roundtrippedCreateCommentRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createCommentRequest),
                jacksonTypeRef<CreateCommentRequest>(),
            )

        assertThat(roundtrippedCreateCommentRequest).isEqualTo(createCommentRequest)
    }
}
