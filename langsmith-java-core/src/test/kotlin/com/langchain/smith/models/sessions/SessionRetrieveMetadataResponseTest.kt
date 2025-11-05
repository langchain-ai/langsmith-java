// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRetrieveMetadataResponseTest {

    @Test
    fun create() {
        val sessionRetrieveMetadataResponse =
            SessionRetrieveMetadataResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionRetrieveMetadataResponse =
            SessionRetrieveMetadataResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                .build()

        val roundtrippedSessionRetrieveMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionRetrieveMetadataResponse),
                jacksonTypeRef<SessionRetrieveMetadataResponse>(),
            )

        assertThat(roundtrippedSessionRetrieveMetadataResponse)
            .isEqualTo(sessionRetrieveMetadataResponse)
    }
}
