// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionTest {

    @Test
    fun create() {
        val session =
            Session.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        assertThat(session.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(session.name()).isEqualTo("name")
        assertThat(session.startTime()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(session.completionCost()).contains(0.0)
        assertThat(session.completionTokens()).contains(0L)
        assertThat(session.defaultDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(session.description()).contains("description")
        assertThat(session.endTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.errorRate()).contains(0.0)
        assertThat(session.experimentProgress())
            .contains(
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
        assertThat(session.extra())
            .contains(
                Session.Extra.builder().putAdditionalProperty("foo", JsonValue.from("bar")).build()
            )
        assertThat(session.feedbackStats())
            .contains(
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
        assertThat(session.firstTokenP50()).contains(0.0)
        assertThat(session.firstTokenP99()).contains(0.0)
        assertThat(session.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.lastRunStartTimeLive())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(session.latencyP50()).contains(0.0)
        assertThat(session.latencyP99()).contains(0.0)
        assertThat(session.promptCost()).contains(0.0)
        assertThat(session.promptTokens()).contains(0L)
        assertThat(session.referenceDatasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(session.runCount()).contains(0L)
        assertThat(session.runFacets().getOrNull())
            .containsExactly(
                Session.RunFacet.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(session.sessionFeedbackStats())
            .contains(
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
        assertThat(session.streamingRate()).contains(0.0)
        assertThat(session.testRunNumber()).contains(0L)
        assertThat(session.totalCost()).contains(0.0)
        assertThat(session.totalTokens()).contains(0L)
        assertThat(session.traceTier()).contains(Session.TraceTier.LONG_LIVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val session =
            Session.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        val roundtrippedSession =
            jsonMapper.readValue(jsonMapper.writeValueAsString(session), jacksonTypeRef<Session>())

        assertThat(roundtrippedSession).isEqualTo(session)
    }
}
