// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso.emailverification

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationStatusParamsTest {

    @Test
    fun create() {
        EmailVerificationStatusParams.builder()
            .email("email")
            .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            EmailVerificationStatusParams.builder()
                .email("email")
                .samlProviderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("email")
        assertThat(body.samlProviderId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
