// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionResolveResponseTest {

    @Test
    fun create() {
        val sessionResolveResponse =
            SessionResolveResponse.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(sessionResolveResponse.sessionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionResolveResponse =
            SessionResolveResponse.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedSessionResolveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionResolveResponse),
                jacksonTypeRef<SessionResolveResponse>(),
            )

        assertThat(roundtrippedSessionResolveResponse).isEqualTo(sessionResolveResponse)
    }
}
