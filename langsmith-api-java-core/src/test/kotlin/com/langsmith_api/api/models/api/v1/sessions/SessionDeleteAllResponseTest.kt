// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionDeleteAllResponseTest {

    @Test
    fun create() {
        val sessionDeleteAllResponse = SessionDeleteAllResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionDeleteAllResponse = SessionDeleteAllResponse.builder().build()

        val roundtrippedSessionDeleteAllResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionDeleteAllResponse),
                jacksonTypeRef<SessionDeleteAllResponse>(),
            )

        assertThat(roundtrippedSessionDeleteAllResponse).isEqualTo(sessionDeleteAllResponse)
    }
}
