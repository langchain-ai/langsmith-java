// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartSeriesTest {

    @Test
    fun create() {
        val customChartSeries =
            CustomChartSeries.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    CustomChartSeries.GroupBy.builder()
                        .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                        .build()
                )
                .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(customChartSeries.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartSeries.metric()).isEqualTo(CustomChartMetric.RUN_COUNT)
        assertThat(customChartSeries.name()).isEqualTo("name")
        assertThat(customChartSeries.feedbackKey()).contains("feedback_key")
        assertThat(customChartSeries.filters())
            .contains(
                CustomChartSeriesFilters.builder()
                    .filter("filter")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .build()
            )
        assertThat(customChartSeries.groupBy())
            .contains(
                CustomChartSeries.GroupBy.builder()
                    .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                    .maxGroups(0L)
                    .path("path")
                    .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                    .build()
            )
        assertThat(customChartSeries.projectMetric()).contains(HostProjectChartMetric.MEMORY_USAGE)
        assertThat(customChartSeries.workspaceId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartSeries =
            CustomChartSeries.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    CustomChartSeries.GroupBy.builder()
                        .attribute(CustomChartSeries.GroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .setBy(CustomChartSeries.GroupBy.SetBy.SECTION)
                        .build()
                )
                .projectMetric(HostProjectChartMetric.MEMORY_USAGE)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCustomChartSeries =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartSeries),
                jacksonTypeRef<CustomChartSeries>(),
            )

        assertThat(roundtrippedCustomChartSeries).isEqualTo(customChartSeries)
    }
}
