// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveCallbackResponseTest {

    @Test
    fun create() {
        val oauthRetrieveCallbackResponse = OAuthRetrieveCallbackResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveCallbackResponse = OAuthRetrieveCallbackResponse.builder().build()

        val roundtrippedOAuthRetrieveCallbackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveCallbackResponse),
                jacksonTypeRef<OAuthRetrieveCallbackResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveCallbackResponse)
            .isEqualTo(oauthRetrieveCallbackResponse)
    }
}
