// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartCreatePreviewTest {

    @Test
    fun create() {
        val customChartCreatePreview =
            CustomChartCreatePreview.builder()
                .addSeries(
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
                )
                .commonFilters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .build()

        assertThat(customChartCreatePreview.series())
            .containsExactly(
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
            )
        assertThat(customChartCreatePreview.commonFilters())
            .contains(
                CustomChartSeriesFilters.builder()
                    .filter("filter")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartCreatePreview =
            CustomChartCreatePreview.builder()
                .addSeries(
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
                )
                .commonFilters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .build()

        val roundtrippedCustomChartCreatePreview =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartCreatePreview),
                jacksonTypeRef<CustomChartCreatePreview>(),
            )

        assertThat(roundtrippedCustomChartCreatePreview).isEqualTo(customChartCreatePreview)
    }
}
