// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionListV2PageResponseTest {

    @Test
    fun create() {
        val sessionListV2PageResponse =
            SessionListV2PageResponse.builder()
                .addItem(
                    Session.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Session.Type.PROJECT)
                        .completionCost(0.0)
                        .completionTokens(0L)
                        .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorRate(0.0)
                        .experimentProgress(
                            Session.ExperimentProgress.builder()
                                .evaluatorProgress(
                                    Session.ExperimentProgress.EvaluatorProgress.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .expectedRunCount(0L)
                                .runProgress(0.0)
                                .build()
                        )
                        .extra(
                            Session.Extra.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .feedbackStats(
                            Session.FeedbackStats.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "avg" to 0,
                                            "contains_thread_feedback" to true,
                                            "errors" to 0,
                                            "max" to 0,
                                            "median" to 0,
                                            "min" to 0,
                                            "n" to 0,
                                            "stdev" to 0,
                                            "type" to "PRIMARY",
                                            "values" to mapOf("foo" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .firstTokenP50(0.0)
                        .firstTokenP99(0.0)
                        .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latencyP50(0.0)
                        .latencyP99(0.0)
                        .longlivedTtlDays(0L)
                        .promptCost(0.0)
                        .promptTokens(0L)
                        .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runCount(0L)
                        .addRunFacet(
                            Session.RunFacet.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .sessionFeedbackStats(
                            Session.SessionFeedbackStats.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "avg" to 0,
                                            "contains_thread_feedback" to true,
                                            "errors" to 0,
                                            "max" to 0,
                                            "median" to 0,
                                            "min" to 0,
                                            "n" to 0,
                                            "stdev" to 0,
                                            "type" to "PRIMARY",
                                            "values" to mapOf("foo" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .streamingRate(0.0)
                        .testRunNumber(0L)
                        .totalCost(0.0)
                        .totalTokens(0L)
                        .traceTier(Session.TraceTier.LONG_LIVED)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(sessionListV2PageResponse.items())
            .containsExactly(
                Session.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(Session.Type.PROJECT)
                    .completionCost(0.0)
                    .completionTokens(0L)
                    .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .errorRate(0.0)
                    .experimentProgress(
                        Session.ExperimentProgress.builder()
                            .evaluatorProgress(
                                Session.ExperimentProgress.EvaluatorProgress.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .expectedRunCount(0L)
                            .runProgress(0.0)
                            .build()
                    )
                    .extra(
                        Session.Extra.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .feedbackStats(
                        Session.FeedbackStats.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "avg" to 0,
                                        "contains_thread_feedback" to true,
                                        "errors" to 0,
                                        "max" to 0,
                                        "median" to 0,
                                        "min" to 0,
                                        "n" to 0,
                                        "stdev" to 0,
                                        "type" to "PRIMARY",
                                        "values" to mapOf("foo" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .firstTokenP50(0.0)
                    .firstTokenP99(0.0)
                    .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latencyP50(0.0)
                    .latencyP99(0.0)
                    .longlivedTtlDays(0L)
                    .promptCost(0.0)
                    .promptTokens(0L)
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runCount(0L)
                    .addRunFacet(
                        Session.RunFacet.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .sessionFeedbackStats(
                        Session.SessionFeedbackStats.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "avg" to 0,
                                        "contains_thread_feedback" to true,
                                        "errors" to 0,
                                        "max" to 0,
                                        "median" to 0,
                                        "min" to 0,
                                        "n" to 0,
                                        "stdev" to 0,
                                        "type" to "PRIMARY",
                                        "values" to mapOf("foo" to 0),
                                    )
                                ),
                            )
                            .build()
                    )
                    .streamingRate(0.0)
                    .testRunNumber(0L)
                    .totalCost(0.0)
                    .totalTokens(0L)
                    .traceTier(Session.TraceTier.LONG_LIVED)
                    .build()
            )
        assertThat(sessionListV2PageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionListV2PageResponse =
            SessionListV2PageResponse.builder()
                .addItem(
                    Session.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .type(Session.Type.PROJECT)
                        .completionCost(0.0)
                        .completionTokens(0L)
                        .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .description("description")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .errorRate(0.0)
                        .experimentProgress(
                            Session.ExperimentProgress.builder()
                                .evaluatorProgress(
                                    Session.ExperimentProgress.EvaluatorProgress.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .expectedRunCount(0L)
                                .runProgress(0.0)
                                .build()
                        )
                        .extra(
                            Session.Extra.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .feedbackStats(
                            Session.FeedbackStats.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "avg" to 0,
                                            "contains_thread_feedback" to true,
                                            "errors" to 0,
                                            "max" to 0,
                                            "median" to 0,
                                            "min" to 0,
                                            "n" to 0,
                                            "stdev" to 0,
                                            "type" to "PRIMARY",
                                            "values" to mapOf("foo" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .firstTokenP50(0.0)
                        .firstTokenP99(0.0)
                        .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latencyP50(0.0)
                        .latencyP99(0.0)
                        .longlivedTtlDays(0L)
                        .promptCost(0.0)
                        .promptTokens(0L)
                        .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .runCount(0L)
                        .addRunFacet(
                            Session.RunFacet.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .sessionFeedbackStats(
                            Session.SessionFeedbackStats.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "avg" to 0,
                                            "contains_thread_feedback" to true,
                                            "errors" to 0,
                                            "max" to 0,
                                            "median" to 0,
                                            "min" to 0,
                                            "n" to 0,
                                            "stdev" to 0,
                                            "type" to "PRIMARY",
                                            "values" to mapOf("foo" to 0),
                                        )
                                    ),
                                )
                                .build()
                        )
                        .streamingRate(0.0)
                        .testRunNumber(0L)
                        .totalCost(0.0)
                        .totalTokens(0L)
                        .traceTier(Session.TraceTier.LONG_LIVED)
                        .build()
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedSessionListV2PageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionListV2PageResponse),
                jacksonTypeRef<SessionListV2PageResponse>(),
            )

        assertThat(roundtrippedSessionListV2PageResponse).isEqualTo(sessionListV2PageResponse)
    }
}
