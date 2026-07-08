// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TraceAggregatesTest {

    @Test
    fun create() {
        val traceAggregates =
            TraceAggregates.builder()
                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .totalCost(0.0)
                .totalTokens(0L)
                .build()

        assertThat(traceAggregates.firstTokenTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(traceAggregates.totalCost()).contains(0.0)
        assertThat(traceAggregates.totalTokens()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val traceAggregates =
            TraceAggregates.builder()
                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .totalCost(0.0)
                .totalTokens(0L)
                .build()

        val roundtrippedTraceAggregates =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(traceAggregates),
                jacksonTypeRef<TraceAggregates>(),
            )

        assertThat(roundtrippedTraceAggregates).isEqualTo(traceAggregates)
    }
}
