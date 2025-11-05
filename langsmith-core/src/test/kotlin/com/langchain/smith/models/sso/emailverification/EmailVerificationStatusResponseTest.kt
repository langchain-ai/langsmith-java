// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sso.emailverification

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailVerificationStatusResponseTest {

    @Test
    fun create() {
        val emailVerificationStatusResponse =
            EmailVerificationStatusResponse.builder()
                .emailConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(emailVerificationStatusResponse.emailConfirmedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailVerificationStatusResponse =
            EmailVerificationStatusResponse.builder()
                .emailConfirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedEmailVerificationStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailVerificationStatusResponse),
                jacksonTypeRef<EmailVerificationStatusResponse>(),
            )

        assertThat(roundtrippedEmailVerificationStatusResponse)
            .isEqualTo(emailVerificationStatusResponse)
    }
}
