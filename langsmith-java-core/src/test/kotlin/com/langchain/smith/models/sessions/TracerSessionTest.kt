// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.orgs.ttlsettings.TraceTier
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TracerSessionTest {

    @Test
    fun create() {
        val tracerSession =
            TracerSession.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .completionCost("completion_cost")
                .completionTokens(0L)
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorRate(0.0)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(0.0)
                .firstTokenP99(0.0)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(0.0)
                .latencyP99(0.0)
                .name("name")
                .promptCost("prompt_cost")
                .promptTokens(0L)
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runCount(0L)
                .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                .sessionFeedbackStats(JsonValue.from(mapOf<String, Any>()))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .streamingRate(0.0)
                .testRunNumber(0L)
                .totalCost("total_cost")
                .totalTokens(0L)
                .traceTier(TraceTier.LONGLIVED)
                .build()

        assertThat(tracerSession.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.completionCost()).contains("completion_cost")
        assertThat(tracerSession.completionTokens()).contains(0L)
        assertThat(tracerSession.defaultDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.description()).contains("description")
        assertThat(tracerSession.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.errorRate()).contains(0.0)
        assertThat(tracerSession._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession._feedbackStats()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession.firstTokenP50()).contains(0.0)
        assertThat(tracerSession.firstTokenP99()).contains(0.0)
        assertThat(tracerSession.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.lastRunStartTimeLive())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.latencyP50()).contains(0.0)
        assertThat(tracerSession.latencyP99()).contains(0.0)
        assertThat(tracerSession.name()).contains("name")
        assertThat(tracerSession.promptCost()).contains("prompt_cost")
        assertThat(tracerSession.promptTokens()).contains(0L)
        assertThat(tracerSession.referenceDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.runCount()).contains(0L)
        assertThat(tracerSession.runFacets().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession._sessionFeedbackStats())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.streamingRate()).contains(0.0)
        assertThat(tracerSession.testRunNumber()).contains(0L)
        assertThat(tracerSession.totalCost()).contains("total_cost")
        assertThat(tracerSession.totalTokens()).contains(0L)
        assertThat(tracerSession.traceTier()).contains(TraceTier.LONGLIVED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tracerSession =
            TracerSession.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .completionCost("completion_cost")
                .completionTokens(0L)
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorRate(0.0)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(0.0)
                .firstTokenP99(0.0)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(0.0)
                .latencyP99(0.0)
                .name("name")
                .promptCost("prompt_cost")
                .promptTokens(0L)
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runCount(0L)
                .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                .sessionFeedbackStats(JsonValue.from(mapOf<String, Any>()))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .streamingRate(0.0)
                .testRunNumber(0L)
                .totalCost("total_cost")
                .totalTokens(0L)
                .traceTier(TraceTier.LONGLIVED)
                .build()

        val roundtrippedTracerSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tracerSession),
                jacksonTypeRef<TracerSession>(),
            )

        assertThat(roundtrippedTracerSession).isEqualTo(tracerSession)
    }
}
