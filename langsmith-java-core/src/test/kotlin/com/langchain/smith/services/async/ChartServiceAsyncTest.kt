// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.charts.ChartRetrieveParams
import com.langchain.smith.models.charts.ChartUpdateParams
import com.langchain.smith.models.charts.CustomChartCreate
import com.langchain.smith.models.charts.CustomChartCreatePreview
import com.langchain.smith.models.charts.CustomChartMetric
import com.langchain.smith.models.charts.CustomChartPreviewRequest
import com.langchain.smith.models.charts.CustomChartSeries
import com.langchain.smith.models.charts.CustomChartSeriesCreate
import com.langchain.smith.models.charts.CustomChartSeriesFilters
import com.langchain.smith.models.charts.CustomChartType
import com.langchain.smith.models.charts.CustomChartUpdate
import com.langchain.smith.models.charts.CustomChartsRequest
import com.langchain.smith.models.charts.HostProjectChartMetric
import com.langchain.smith.models.orgcharts.section.CustomChartsRequestBase
import com.langchain.smith.models.sessions.RunStatsGroupBy
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChartServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val customChartResponseFuture =
            chartServiceAsync.create(
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

        val customChartResponse = customChartResponseFuture.get()
        customChartResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val singleCustomChartResponseFuture =
            chartServiceAsync.retrieve(
                ChartRetrieveParams.builder()
                    .chartId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .customChartsRequest(
                        CustomChartsRequest.builder()
                            .afterIndex(0L)
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .omitData(true)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .timezone("timezone")
                            .build()
                    )
                    .build()
            )

        val singleCustomChartResponse = singleCustomChartResponseFuture.get()
        singleCustomChartResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val customChartResponseFuture =
            chartServiceAsync.update(
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
            )

        val customChartResponse = customChartResponseFuture.get()
        customChartResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val customChartsResponseFuture =
            chartServiceAsync.list(
                CustomChartsRequest.builder()
                    .afterIndex(0L)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timezone("timezone")
                    .build()
            )

        val customChartsResponse = customChartsResponseFuture.get()
        customChartsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val chartFuture = chartServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val chart = chartFuture.get()
        chart.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun preview() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val chartServiceAsync = client.charts()

        val singleCustomChartResponseBaseFuture =
            chartServiceAsync.preview(
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

        val singleCustomChartResponseBase = singleCustomChartResponseBaseFuture.get()
        singleCustomChartResponseBase.validate()
    }
}
