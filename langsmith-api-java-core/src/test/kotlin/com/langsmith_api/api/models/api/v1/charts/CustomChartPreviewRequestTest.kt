// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.orgcharts.section.CustomChartsRequestBase
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartPreviewRequestTest {

    @Test
    fun create() {
        val customChartPreviewRequest =
            CustomChartPreviewRequest.builder()
                .bucketInfo(
                    CustomChartsRequestBase.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .omitData(true)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                        .timezone("timezone")
                        .build()
                )
                .chart(
                    CustomChartPreviewRequest.Chart.builder()
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
                )
                .build()

        assertThat(customChartPreviewRequest.bucketInfo())
            .isEqualTo(
                CustomChartsRequestBase.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .timezone("timezone")
                    .build()
            )
        assertThat(customChartPreviewRequest.chart())
            .isEqualTo(
                CustomChartPreviewRequest.Chart.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartPreviewRequest =
            CustomChartPreviewRequest.builder()
                .bucketInfo(
                    CustomChartsRequestBase.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .omitData(true)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                        .timezone("timezone")
                        .build()
                )
                .chart(
                    CustomChartPreviewRequest.Chart.builder()
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
                )
                .build()

        val roundtrippedCustomChartPreviewRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartPreviewRequest),
                jacksonTypeRef<CustomChartPreviewRequest>(),
            )

        assertThat(roundtrippedCustomChartPreviewRequest).isEqualTo(customChartPreviewRequest)
    }
}
