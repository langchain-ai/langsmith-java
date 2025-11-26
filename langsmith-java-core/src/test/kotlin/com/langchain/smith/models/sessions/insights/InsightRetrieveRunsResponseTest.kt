// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions.insights

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InsightRetrieveRunsResponseTest {

    @Test
    fun create() {
        val insightRetrieveRunsResponse =
            InsightRetrieveRunsResponse.builder()
                .offset(0L)
                .addRun(
                    InsightRetrieveRunsResponse.Run.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(insightRetrieveRunsResponse.offset()).contains(0L)
        assertThat(insightRetrieveRunsResponse.runs())
            .containsExactly(
                InsightRetrieveRunsResponse.Run.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val insightRetrieveRunsResponse =
            InsightRetrieveRunsResponse.builder()
                .offset(0L)
                .addRun(
                    InsightRetrieveRunsResponse.Run.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedInsightRetrieveRunsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(insightRetrieveRunsResponse),
                jacksonTypeRef<InsightRetrieveRunsResponse>(),
            )

        assertThat(roundtrippedInsightRetrieveRunsResponse).isEqualTo(insightRetrieveRunsResponse)
    }
}
