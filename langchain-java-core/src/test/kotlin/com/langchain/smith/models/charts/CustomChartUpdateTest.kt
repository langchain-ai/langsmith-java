// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.sessions.RunStatsGroupBy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartUpdateTest {

    @Test
    fun create() {
        val customChartUpdate =
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

        assertThat(customChartUpdate.chartType())
            .contains(CustomChartUpdate.ChartType.ofCustom(CustomChartType.LINE))
        assertThat(customChartUpdate.commonFilters())
            .contains(
                CustomChartUpdate.CommonFilters.ofCustomChartSeries(
                    CustomChartSeriesFilters.builder()
                        .filter("filter")
                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .traceFilter("trace_filter")
                        .treeFilter("tree_filter")
                        .build()
                )
            )
        assertThat(customChartUpdate.description())
            .contains(CustomChartUpdate.Description.ofString("string"))
        assertThat(customChartUpdate.index()).contains(CustomChartUpdate.Index.ofInteger(0L))
        assertThat(customChartUpdate.metadata())
            .contains(CustomChartUpdate.Metadata.ofJsonValue(JsonValue.from(mapOf<String, Any>())))
        assertThat(customChartUpdate.sectionId())
            .contains(CustomChartUpdate.SectionId.ofString("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
        assertThat(customChartUpdate.series())
            .contains(
                CustomChartUpdate.Series.ofCustomChartSeriesUpdates(
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
            )
        assertThat(customChartUpdate.title()).contains(CustomChartUpdate.Title.ofString("string"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartUpdate =
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

        val roundtrippedCustomChartUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartUpdate),
                jacksonTypeRef<CustomChartUpdate>(),
            )

        assertThat(roundtrippedCustomChartUpdate).isEqualTo(customChartUpdate)
    }
}
