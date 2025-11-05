// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SsoRetrieveParamsTest {

    @Test
    fun create() {
        SsoRetrieveParams.builder().ssoLoginSlug("sso_login_slug").build()
    }

    @Test
    fun pathParams() {
        val params = SsoRetrieveParams.builder().ssoLoginSlug("sso_login_slug").build()

        assertThat(params._pathParam(0)).isEqualTo("sso_login_slug")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
