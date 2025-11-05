// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.sessions.RunStatsGroupBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartCreateTest {

    @Test
    fun create() {
        val customChartCreate =
            CustomChartCreate.builder()
                .chartType(CustomChartType.LINE)
                .addSeries(
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
                )
                .title("title")
                .commonFilters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .description("description")
                .index(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(customChartCreate.chartType()).isEqualTo(CustomChartType.LINE)
        assertThat(customChartCreate.series())
            .containsExactly(
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
            )
        assertThat(customChartCreate.title()).isEqualTo("title")
        assertThat(customChartCreate.commonFilters())
            .contains(
                CustomChartSeriesFilters.builder()
                    .filter("filter")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .build()
            )
        assertThat(customChartCreate.description()).contains("description")
        assertThat(customChartCreate.index()).contains(0L)
        assertThat(customChartCreate._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(customChartCreate.sectionId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartCreate =
            CustomChartCreate.builder()
                .chartType(CustomChartType.LINE)
                .addSeries(
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
                )
                .title("title")
                .commonFilters(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
                .description("description")
                .index(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedCustomChartCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartCreate),
                jacksonTypeRef<CustomChartCreate>(),
            )

        assertThat(roundtrippedCustomChartCreate).isEqualTo(customChartCreate)
    }
}
