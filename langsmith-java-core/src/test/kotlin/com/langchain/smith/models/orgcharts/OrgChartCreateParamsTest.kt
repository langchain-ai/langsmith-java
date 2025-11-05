// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgcharts

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.charts.CustomChartCreate
import com.langchain.smith.models.charts.CustomChartMetric
import com.langchain.smith.models.charts.CustomChartSeriesCreate
import com.langchain.smith.models.charts.CustomChartSeriesFilters
import com.langchain.smith.models.charts.CustomChartType
import com.langchain.smith.models.charts.HostProjectChartMetric
import com.langchain.smith.models.sessions.RunStatsGroupBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgChartCreateParamsTest {

    @Test
    fun create() {
        OrgChartCreateParams.builder()
            .customChartCreate(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrgChartCreateParams.builder()
                .customChartCreate(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrgChartCreateParams.builder()
                .customChartCreate(
                    CustomChartCreate.builder()
                        .chartType(CustomChartType.LINE)
                        .addSeries(
                            CustomChartSeriesCreate.builder()
                                .metric(CustomChartMetric.RUN_COUNT)
                                .name("name")
                                .build()
                        )
                        .title("title")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartCreate.builder()
                    .chartType(CustomChartType.LINE)
                    .addSeries(
                        CustomChartSeriesCreate.builder()
                            .metric(CustomChartMetric.RUN_COUNT)
                            .name("name")
                            .build()
                    )
                    .title("title")
                    .build()
            )
    }
}
