// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.tokens

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenRetrieveResponseTest {

    @Test
    fun create() {
        val tokenRetrieveResponse = TokenRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tokenRetrieveResponse = TokenRetrieveResponse.builder().build()

        val roundtrippedTokenRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tokenRetrieveResponse),
                jacksonTypeRef<TokenRetrieveResponse>(),
            )

        assertThat(roundtrippedTokenRetrieveResponse).isEqualTo(tokenRetrieveResponse)
    }
}
