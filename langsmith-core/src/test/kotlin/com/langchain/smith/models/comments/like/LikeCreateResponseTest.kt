// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.comments.like

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LikeCreateResponseTest {

    @Test
    fun create() {
        val likeCreateResponse = LikeCreateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val likeCreateResponse = LikeCreateResponse.builder().build()

        val roundtrippedLikeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(likeCreateResponse),
                jacksonTypeRef<LikeCreateResponse>(),
            )

        assertThat(roundtrippedLikeCreateResponse).isEqualTo(likeCreateResponse)
    }
}
