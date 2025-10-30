// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentUpdateLoginMethodsParamsTest {

    @Test
    fun create() {
        CurrentUpdateLoginMethodsParams.builder().ssoOnly(true).build()
    }

    @Test
    fun body() {
        val params = CurrentUpdateLoginMethodsParams.builder().ssoOnly(true).build()

        val body = params._body()

        assertThat(body.ssoOnly()).isEqualTo(true)
    }
}
