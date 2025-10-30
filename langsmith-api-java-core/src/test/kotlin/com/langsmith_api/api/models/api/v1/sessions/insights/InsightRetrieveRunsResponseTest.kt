// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightRetrieveRunsResponseTest {

    @Test
    fun create() {
        val insightRetrieveRunsResponse =
            InsightRetrieveRunsResponse.builder()
                .offset(0L)
                .addRun(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(insightRetrieveRunsResponse.offset()).contains(0L)
        assertThat(insightRetrieveRunsResponse.runs())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightRetrieveRunsResponse =
            InsightRetrieveRunsResponse.builder()
                .offset(0L)
                .addRun(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedInsightRetrieveRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightRetrieveRunsResponse),
                jacksonTypeRef<InsightRetrieveRunsResponse>(),
            )

        assertThat(roundtrippedInsightRetrieveRunsResponse).isEqualTo(insightRetrieveRunsResponse)
    }
}
