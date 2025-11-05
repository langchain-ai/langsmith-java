// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunUpdateResponseTest {

    @Test
    fun create() {
        val runUpdateResponse =
            RunUpdateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runUpdateResponse =
            RunUpdateResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()

        val roundtrippedRunUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runUpdateResponse),
                jacksonTypeRef<RunUpdateResponse>(),
            )

        assertThat(roundtrippedRunUpdateResponse).isEqualTo(runUpdateResponse)
    }
}
