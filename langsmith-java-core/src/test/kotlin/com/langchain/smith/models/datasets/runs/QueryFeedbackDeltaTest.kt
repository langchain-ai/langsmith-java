// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QueryFeedbackDeltaTest {

    @Test
    fun create() {
        val queryFeedbackDelta =
            QueryFeedbackDelta.builder()
                .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackKey("feedback_key")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    QueryFeedbackDelta.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .limit(1L)
                .offset(0L)
                .build()

        assertThat(queryFeedbackDelta.baselineSessionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queryFeedbackDelta.comparisonSessionIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queryFeedbackDelta.feedbackKey()).isEqualTo("feedback_key")
        assertThat(queryFeedbackDelta.comparativeExperimentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(queryFeedbackDelta.filters())
            .contains(
                QueryFeedbackDelta.Filters.builder()
                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                    .build()
            )
        assertThat(queryFeedbackDelta.limit()).contains(1L)
        assertThat(queryFeedbackDelta.offset()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryFeedbackDelta =
            QueryFeedbackDelta.builder()
                .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .feedbackKey("feedback_key")
                .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filters(
                    QueryFeedbackDelta.Filters.builder()
                        .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                        .build()
                )
                .limit(1L)
                .offset(0L)
                .build()

        val roundtrippedQueryFeedbackDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryFeedbackDelta),
                jacksonTypeRef<QueryFeedbackDelta>(),
            )

        assertThat(roundtrippedQueryFeedbackDelta).isEqualTo(queryFeedbackDelta)
    }
}
