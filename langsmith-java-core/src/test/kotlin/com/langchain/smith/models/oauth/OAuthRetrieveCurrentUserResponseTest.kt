// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveCurrentUserResponseTest {

    @Test
    fun create() {
        val oauthRetrieveCurrentUserResponse = OAuthRetrieveCurrentUserResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveCurrentUserResponse = OAuthRetrieveCurrentUserResponse.builder().build()

        val roundtrippedOAuthRetrieveCurrentUserResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveCurrentUserResponse),
                jacksonTypeRef<OAuthRetrieveCurrentUserResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveCurrentUserResponse)
            .isEqualTo(oauthRetrieveCurrentUserResponse)
    }
}
