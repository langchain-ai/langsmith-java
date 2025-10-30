// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.oauth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveLogoutResponseTest {

    @Test
    fun create() {
        val oauthRetrieveLogoutResponse = OAuthRetrieveLogoutResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val oauthRetrieveLogoutResponse = OAuthRetrieveLogoutResponse.builder().build()

        val roundtrippedOAuthRetrieveLogoutResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(oauthRetrieveLogoutResponse),
                jacksonTypeRef<OAuthRetrieveLogoutResponse>(),
            )

        assertThat(roundtrippedOAuthRetrieveLogoutResponse).isEqualTo(oauthRetrieveLogoutResponse)
    }
}
