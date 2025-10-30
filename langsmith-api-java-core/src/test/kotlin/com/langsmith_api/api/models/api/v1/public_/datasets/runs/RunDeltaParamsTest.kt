// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.datasets.runs

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.datasets.runs.QueryFeedbackDelta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunDeltaParamsTest {

    @Test
    fun create() {
        RunDeltaParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .queryFeedbackDelta(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunDeltaParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryFeedbackDelta(
                    QueryFeedbackDelta.builder()
                        .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .feedbackKey("feedback_key")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RunDeltaParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryFeedbackDelta(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunDeltaParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .queryFeedbackDelta(
                    QueryFeedbackDelta.builder()
                        .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .feedbackKey("feedback_key")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                QueryFeedbackDelta.builder()
                    .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackKey("feedback_key")
                    .build()
            )
    }
}
