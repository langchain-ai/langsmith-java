// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThreadAggregateStatsParamsTest {

    @Test
    fun create() {
        ThreadAggregateStatsParams.builder()
            .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
            .select(
                listOf(
                    ThreadAggregateStatsParams.Select.THREAD_COUNT,
                    ThreadAggregateStatsParams.Select.TRACE_COUNT,
                    ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                    ThreadAggregateStatsParams.Select.TOTAL_COST,
                )
            )
            .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .threadFilter("gte(turn_count, 3)")
            .traceFilter("eq(status, \"error\")")
            .treeFilter("has(tags, \"production\")")
            .build()
    }

    @Test
    fun body() {
        val params =
            ThreadAggregateStatsParams.builder()
                .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .select(
                    listOf(
                        ThreadAggregateStatsParams.Select.THREAD_COUNT,
                        ThreadAggregateStatsParams.Select.TRACE_COUNT,
                        ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                        ThreadAggregateStatsParams.Select.TOTAL_COST,
                    )
                )
                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .threadFilter("gte(turn_count, 3)")
                .traceFilter("eq(status, \"error\")")
                .treeFilter("has(tags, \"production\")")
                .build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
        assertThat(body.select())
            .containsExactly(
                ThreadAggregateStatsParams.Select.THREAD_COUNT,
                ThreadAggregateStatsParams.Select.TRACE_COUNT,
                ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                ThreadAggregateStatsParams.Select.TOTAL_COST,
            )
        assertThat(body.maxStartTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.minStartTime()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.threadFilter()).contains("gte(turn_count, 3)")
        assertThat(body.traceFilter()).contains("eq(status, \"error\")")
        assertThat(body.treeFilter()).contains("has(tags, \"production\")")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ThreadAggregateStatsParams.builder()
                .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                .select(
                    listOf(
                        ThreadAggregateStatsParams.Select.THREAD_COUNT,
                        ThreadAggregateStatsParams.Select.TRACE_COUNT,
                        ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                        ThreadAggregateStatsParams.Select.TOTAL_COST,
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.projectId()).isEqualTo("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
        assertThat(body.select())
            .containsExactly(
                ThreadAggregateStatsParams.Select.THREAD_COUNT,
                ThreadAggregateStatsParams.Select.TRACE_COUNT,
                ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                ThreadAggregateStatsParams.Select.TOTAL_COST,
            )
    }
}
