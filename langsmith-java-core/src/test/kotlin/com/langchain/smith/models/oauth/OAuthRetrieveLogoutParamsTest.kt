// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.oauth

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OAuthRetrieveLogoutParamsTest {

    @Test
    fun create() {
        OAuthRetrieveLogoutParams.builder().provider(OAuthProvider.CUSTOM_OIDC).build()
    }

    @Test
    fun pathParams() {
        val params = OAuthRetrieveLogoutParams.builder().provider(OAuthProvider.CUSTOM_OIDC).build()

        assertThat(params._pathParam(0)).isEqualTo("custom-oidc")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
