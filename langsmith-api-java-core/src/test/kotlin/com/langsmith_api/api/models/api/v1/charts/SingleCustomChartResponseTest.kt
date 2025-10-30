// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleCustomChartResponseTest {

    @Test
    fun create() {
        val singleCustomChartResponse =
            SingleCustomChartResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chartType(CustomChartType.LINE)
                .addData(
                    CustomChartsDataPoint.builder()
                        .seriesId("series_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .group("group")
                        .build()
                )
                .index(0L)
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
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(singleCustomChartResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(singleCustomChartResponse.chartType()).isEqualTo(CustomChartType.LINE)
        assertThat(singleCustomChartResponse.data())
            .containsExactly(
                CustomChartsDataPoint.builder()
                    .seriesId("series_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .group("group")
                    .build()
            )
        assertThat(singleCustomChartResponse.index()).isEqualTo(0L)
        assertThat(singleCustomChartResponse.series())
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
        assertThat(singleCustomChartResponse.title()).isEqualTo("title")
        assertThat(singleCustomChartResponse.commonFilters())
            .contains(
                CustomChartSeriesFilters.builder()
                    .filter("filter")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceFilter("trace_filter")
                    .treeFilter("tree_filter")
                    .build()
            )
        assertThat(singleCustomChartResponse.description()).contains("description")
        assertThat(singleCustomChartResponse._metadata())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val singleCustomChartResponse =
            SingleCustomChartResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .chartType(CustomChartType.LINE)
                .addData(
                    CustomChartsDataPoint.builder()
                        .seriesId("series_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .group("group")
                        .build()
                )
                .index(0L)
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
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedSingleCustomChartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(singleCustomChartResponse),
                jacksonTypeRef<SingleCustomChartResponse>(),
            )

        assertThat(roundtrippedSingleCustomChartResponse).isEqualTo(singleCustomChartResponse)
    }
}
