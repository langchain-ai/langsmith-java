// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionDeleteResponseTest {

    @Test
    fun create() {
        val sessionDeleteResponse = SessionDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionDeleteResponse = SessionDeleteResponse.builder().build()

        val roundtrippedSessionDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionDeleteResponse),
                jacksonTypeRef<SessionDeleteResponse>(),
            )

        assertThat(roundtrippedSessionDeleteResponse).isEqualTo(sessionDeleteResponse)
    }
}
