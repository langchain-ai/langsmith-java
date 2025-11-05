// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso.emailverification

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationConfirmParamsTest {

    @Test
    fun create() {
        EmailVerificationConfirmParams.builder().token("token").build()
    }

    @Test
    fun body() {
        val params = EmailVerificationConfirmParams.builder().token("token").build()

        val body = params._body()

        assertThat(body.token()).isEqualTo("token")
    }
}
