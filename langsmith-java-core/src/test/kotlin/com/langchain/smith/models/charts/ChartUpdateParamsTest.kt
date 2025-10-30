// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.sessions.RunStatsGroupBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartUpdateParamsTest {

    @Test
    fun create() {
        ChartUpdateParams.builder()
            .chartId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customChartUpdate(
                CustomChartUpdate.builder()
                    .chartType(CustomChartType.LINE)
                    .commonFilters(
                        CustomChartSeriesFilters.builder()
                            .filter("filter")
                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .build()
                    )
                    .description("string")
                    .index(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .seriesOfCustomChartSeriesUpdates(
                        listOf(
                            CustomChartUpdate.Series.CustomChartSeriesUpdate.builder()
                                .metric(CustomChartMetric.RUN_COUNT)
                                .name("name")
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    )
                    .title("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChartUpdateParams.builder()
                .chartId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartUpdate(CustomChartUpdate.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChartUpdateParams.builder()
                .chartId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartUpdate(
                    CustomChartUpdate.builder()
                        .chartType(CustomChartType.LINE)
                        .commonFilters(
                            CustomChartSeriesFilters.builder()
                                .filter("filter")
                                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .description("string")
                        .index(0L)
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .seriesOfCustomChartSeriesUpdates(
                            listOf(
                                CustomChartUpdate.Series.CustomChartSeriesUpdate.builder()
                                    .metric(CustomChartMetric.RUN_COUNT)
                                    .name("name")
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        )
                        .title("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartUpdate.builder()
                    .chartType(CustomChartType.LINE)
                    .commonFilters(
                        CustomChartSeriesFilters.builder()
                            .filter("filter")
                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .build()
                    )
                    .description("string")
                    .index(0L)
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .seriesOfCustomChartSeriesUpdates(
                        listOf(
                            CustomChartUpdate.Series.CustomChartSeriesUpdate.builder()
                                .metric(CustomChartMetric.RUN_COUNT)
                                .name("name")
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                    )
                    .title("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChartUpdateParams.builder()
                .chartId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartUpdate(CustomChartUpdate.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CustomChartUpdate.builder().build())
    }
}
