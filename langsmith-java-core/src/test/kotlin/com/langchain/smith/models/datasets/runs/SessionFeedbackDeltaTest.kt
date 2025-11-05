// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionFeedbackDeltaTest {

    @Test
    fun create() {
        val sessionFeedbackDelta =
            SessionFeedbackDelta.builder()
                .feedbackDeltas(
                    SessionFeedbackDelta.FeedbackDeltas.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "improved_examples" to
                                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                                    "regressed_examples" to
                                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(sessionFeedbackDelta.feedbackDeltas())
            .isEqualTo(
                SessionFeedbackDelta.FeedbackDeltas.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "improved_examples" to
                                    listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                                "regressed_examples" to
                                    listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionFeedbackDelta =
            SessionFeedbackDelta.builder()
                .feedbackDeltas(
                    SessionFeedbackDelta.FeedbackDeltas.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "improved_examples" to
                                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                                    "regressed_examples" to
                                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"),
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedSessionFeedbackDelta =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionFeedbackDelta),
                jacksonTypeRef<SessionFeedbackDelta>(),
            )

        assertThat(roundtrippedSessionFeedbackDelta).isEqualTo(sessionFeedbackDelta)
    }
}
