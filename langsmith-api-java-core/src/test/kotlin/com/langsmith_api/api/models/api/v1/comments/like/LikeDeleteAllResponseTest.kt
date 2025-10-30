// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.comments.like

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LikeDeleteAllResponseTest {

    @Test
    fun create() {
        val likeDeleteAllResponse = LikeDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val likeDeleteAllResponse = LikeDeleteAllResponse.builder().build()

        val roundtrippedLikeDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(likeDeleteAllResponse),
                jacksonTypeRef<LikeDeleteAllResponse>(),
            )

        assertThat(roundtrippedLikeDeleteAllResponse).isEqualTo(likeDeleteAllResponse)
    }
}
