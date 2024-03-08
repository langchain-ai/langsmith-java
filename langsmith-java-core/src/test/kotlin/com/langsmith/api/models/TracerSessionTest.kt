// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TracerSessionTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createTracerSession() { // templates/JavaSDK/entities/testing.ts:18:13
        val tracerSession =
            TracerSession.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .completionCost(42.23)
                .completionTokens(123L)
                .defaultDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .errorRate(42.23)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(42.23)
                .firstTokenP99(42.23)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .lastRunStartTimeLive(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(42.23)
                .latencyP99(42.23)
                .name("string")
                .promptCost(42.23)
                .promptTokens(123L)
                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runCount(123L)
                .runFacets(listOf(JsonValue.from(mapOf<String, Any>())))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .streamingRate(42.23)
                .testRunNumber(123L)
                .totalCost(42.23)
                .totalTokens(123L)
                .build()
        assertThat(tracerSession).isNotNull
        assertThat(tracerSession.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.tenantId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.completionCost()).contains(42.23)
        assertThat(tracerSession.completionTokens()).contains(123L)
        assertThat(tracerSession.defaultDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.description()).contains("string")
        assertThat(tracerSession.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.errorRate()).contains(42.23)
        assertThat(tracerSession._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession._feedbackStats()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession.firstTokenP50()).contains(42.23)
        assertThat(tracerSession.firstTokenP99()).contains(42.23)
        assertThat(tracerSession.lastRunStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.lastRunStartTimeLive())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.latencyP50()).contains(42.23)
        assertThat(tracerSession.latencyP99()).contains(42.23)
        assertThat(tracerSession.name()).contains("string")
        assertThat(tracerSession.promptCost()).contains(42.23)
        assertThat(tracerSession.promptTokens()).contains(123L)
        assertThat(tracerSession.referenceDatasetId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(tracerSession.runCount()).contains(123L)
        assertThat(tracerSession.runFacets().get())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(tracerSession.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tracerSession.streamingRate()).contains(42.23)
        assertThat(tracerSession.testRunNumber()).contains(123L)
        assertThat(tracerSession.totalCost()).contains(42.23)
        assertThat(tracerSession.totalTokens()).contains(123L)
    }
}
