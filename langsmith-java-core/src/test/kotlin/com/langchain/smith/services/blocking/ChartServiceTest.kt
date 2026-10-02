// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.charts.ChartPreviewParams
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChartServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun preview() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val chartService = client.charts()

        val response =
            chartService.preview(
                ChartPreviewParams.builder()
                    .bucketInfo(
                        ChartPreviewParams.BucketInfo.builder()
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .omitData(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                            .timezone("timezone")
                            .build()
                    )
                    .chart(
                        ChartPreviewParams.Chart.builder()
                            .addSeries(
                                ChartPreviewParams.Chart.Series.builder()
                                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .name("name")
                                    .feedbackKey("feedback_key")
                                    .filterDefinition(
                                        ChartPreviewParams.Chart.Series.FilterDefinition
                                            .CustomChartFilterByTracingProject
                                            .builder()
                                            .addProjectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .runFilter("run_filter")
                                            .traceFilter("trace_filter")
                                            .treeFilter("tree_filter")
                                            .build()
                                    )
                                    .filters(
                                        ChartPreviewParams.Chart.Series.Filters.builder()
                                            .filter("filter")
                                            .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                            .traceFilter("trace_filter")
                                            .treeFilter("tree_filter")
                                            .build()
                                    )
                                    .groupBy(
                                        ChartPreviewParams.Chart.Series.GroupBy.builder()
                                            .attribute(
                                                ChartPreviewParams.Chart.Series.GroupBy.Attribute
                                                    .NAME
                                            )
                                            .maxGroups(0L)
                                            .path("path")
                                            .setBy(
                                                ChartPreviewParams.Chart.Series.GroupBy.SetBy
                                                    .SECTION
                                            )
                                            .build()
                                    )
                                    .addGroupByDefinition(
                                        ChartPreviewParams.Chart.Series.GroupByDefinition
                                            .CustomChartGroupByPlain
                                            .builder()
                                            .attribute(
                                                ChartPreviewParams.Chart.Series.GroupByDefinition
                                                    .CustomChartGroupByPlain
                                                    .Attribute
                                                    .NAME
                                            )
                                            .build()
                                    )
                                    .metadata(
                                        ChartPreviewParams.Chart.Series.Metadata.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .metric(ChartPreviewParams.Chart.Series.Metric.RUN_COUNT)
                                    .metricDefinition(
                                        ChartPreviewParams.Chart.Series.MetricDefinition
                                            .CustomChartFeedbackCountMetric
                                            .builder()
                                            .params(
                                                ChartPreviewParams.Chart.Series.MetricDefinition
                                                    .CustomChartFeedbackCountMetric
                                                    .Params
                                                    .builder()
                                                    .feedbackKey("feedback_key")
                                                    .build()
                                            )
                                            .filter("filter")
                                            .type(
                                                ChartPreviewParams.Chart.Series.MetricDefinition
                                                    .CustomChartFeedbackCountMetric
                                                    .Type
                                                    .COUNT
                                            )
                                            .build()
                                    )
                                    .projectMetric(
                                        ChartPreviewParams.Chart.Series.ProjectMetric.MEMORY_USAGE
                                    )
                                    .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                    .build()
                            )
                            .commonFilters(
                                ChartPreviewParams.Chart.CommonFilters.builder()
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

        response.validate()
    }
}
