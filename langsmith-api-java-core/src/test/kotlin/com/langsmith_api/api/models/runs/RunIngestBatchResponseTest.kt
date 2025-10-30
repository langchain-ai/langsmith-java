// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunIngestBatchResponseTest {

    @Test
    fun create() {
        val runIngestBatchResponse =
            RunIngestBatchResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runIngestBatchResponse =
            RunIngestBatchResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from(mapOf("message" to "message")))
                .build()

        val roundtrippedRunIngestBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runIngestBatchResponse),
                jacksonTypeRef<RunIngestBatchResponse>(),
            )

        assertThat(roundtrippedRunIngestBatchResponse).isEqualTo(runIngestBatchResponse)
    }
}
