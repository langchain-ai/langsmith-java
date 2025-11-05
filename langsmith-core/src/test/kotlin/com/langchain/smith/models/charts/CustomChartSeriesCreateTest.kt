// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.sessions.RunStatsGroupBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartSeriesCreateTest {

    @Test
    fun create() {
        val customChartSeriesCreate =
            CustomChartSeriesCreate.builder()
                .metric(CustomChartMetric.RUN_COUNT)
                .name("name")
                .feedbackKey("feedback_key")
                .filters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(customChartSeriesCreate.metric()).isEqualTo(CustomChartMetric.RUN_COUNT)
        assertThat(customChartSeriesCreate.name()).isEqualTo("name")
        assertThat(customChartSeriesCreate.feedbackKey()).contains("feedback_key")
        assertThat(customChartSeriesCreate.filters())
            .contains(
                CustomChartSeriesFilters.builder()
                    .filter("filter")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .build()
            )
        assertThat(customChartSeriesCreate.groupBy())
            .contains(
                RunStatsGroupBy.builder()
                    .attribute(RunStatsGroupBy.Attribute.NAME)
                    .maxGroups(0L)
                    .path("path")
                    .build()
            )
        assertThat(customChartSeriesCreate.projectMetric())
            .contains(HostProjectChartMetric.MEMORY_USAGE)
        assertThat(customChartSeriesCreate.workspaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartSeriesCreate =
            CustomChartSeriesCreate.builder()
                .metric(CustomChartMetric.RUN_COUNT)
                .name("name")
                .feedbackKey("feedback_key")
                .filters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCustomChartSeriesCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartSeriesCreate),
                jacksonTypeRef<CustomChartSeriesCreate>(),
            )

        assertThat(roundtrippedCustomChartSeriesCreate).isEqualTo(customChartSeriesCreate)
    }
}
