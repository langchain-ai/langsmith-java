// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveResponseTest {

    @Test
    fun create() {
        val oauthRetrieveResponse = OAuthRetrieveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveResponse = OAuthRetrieveResponse.builder().build()

        val roundtrippedOAuthRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveResponse),
                jacksonTypeRef<OAuthRetrieveResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveResponse).isEqualTo(oauthRetrieveResponse)
    }
}
