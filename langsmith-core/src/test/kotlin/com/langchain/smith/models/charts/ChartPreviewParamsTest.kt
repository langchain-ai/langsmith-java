// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.langchain.smith.models.orgcharts.section.CustomChartsRequestBase
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartPreviewParamsTest {

    @Test
    fun create() {
        ChartPreviewParams.builder()
            .customChartPreviewRequest(
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
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ChartPreviewParams.builder()
                .customChartPreviewRequest(
                    CustomChartPreviewRequest.builder()
                        .bucketInfo(
                            CustomChartsRequestBase.builder()
                                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .omitData(true)
                                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .stride(
                                    TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                                )
                                .timezone("timezone")
                                .build()
                        )
                        .chart(
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
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChartPreviewParams.builder()
                .customChartPreviewRequest(
                    CustomChartPreviewRequest.builder()
                        .bucketInfo(CustomChartsRequestBase.builder().build())
                        .chart(
                            CustomChartCreatePreview.builder()
                                .addSeries(
                                    CustomChartSeries.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .metric(CustomChartMetric.RUN_COUNT)
                                        .name("name")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartPreviewRequest.builder()
                    .bucketInfo(CustomChartsRequestBase.builder().build())
                    .chart(
                        CustomChartCreatePreview.builder()
                            .addSeries(
                                CustomChartSeries.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .metric(CustomChartMetric.RUN_COUNT)
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
