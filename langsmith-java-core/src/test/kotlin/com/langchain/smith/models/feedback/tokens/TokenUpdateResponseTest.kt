// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenUpdateResponseTest {

    @Test
    fun create() {
        val tokenUpdateResponse = TokenUpdateResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenUpdateResponse = TokenUpdateResponse.builder().build()

        val roundtrippedTokenUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenUpdateResponse),
                jacksonTypeRef<TokenUpdateResponse>(),
            )

        assertThat(roundtrippedTokenUpdateResponse).isEqualTo(tokenUpdateResponse)
    }
}
