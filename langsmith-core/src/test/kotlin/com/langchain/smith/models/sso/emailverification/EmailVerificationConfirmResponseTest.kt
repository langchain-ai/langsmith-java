// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso.emailverification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationConfirmResponseTest {

    @Test
    fun create() {
        val emailVerificationConfirmResponse = EmailVerificationConfirmResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailVerificationConfirmResponse = EmailVerificationConfirmResponse.builder().build()

        val roundtrippedEmailVerificationConfirmResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailVerificationConfirmResponse),
                jacksonTypeRef<EmailVerificationConfirmResponse>(),
            )

        assertThat(roundtrippedEmailVerificationConfirmResponse)
            .isEqualTo(emailVerificationConfirmResponse)
    }
}
