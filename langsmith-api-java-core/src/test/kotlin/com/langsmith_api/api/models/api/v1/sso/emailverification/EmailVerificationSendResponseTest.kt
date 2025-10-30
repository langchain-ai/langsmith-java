// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sso.emailverification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationSendResponseTest {

    @Test
    fun create() {
        val emailVerificationSendResponse = EmailVerificationSendResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailVerificationSendResponse = EmailVerificationSendResponse.builder().build()

        val roundtrippedEmailVerificationSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailVerificationSendResponse),
                jacksonTypeRef<EmailVerificationSendResponse>(),
            )

        assertThat(roundtrippedEmailVerificationSendResponse)
            .isEqualTo(emailVerificationSendResponse)
    }
}
