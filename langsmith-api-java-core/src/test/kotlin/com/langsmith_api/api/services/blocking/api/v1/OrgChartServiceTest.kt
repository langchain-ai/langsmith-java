// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.charts.CustomChartCreate
import com.langsmith_api.api.models.api.v1.charts.CustomChartMetric
import com.langsmith_api.api.models.api.v1.charts.CustomChartPreviewRequest
import com.langsmith_api.api.models.api.v1.charts.CustomChartSeries
import com.langsmith_api.api.models.api.v1.charts.CustomChartSeriesFilters
import com.langsmith_api.api.models.api.v1.charts.CustomChartType
import com.langsmith_api.api.models.api.v1.charts.CustomChartUpdate
import com.langsmith_api.api.models.api.v1.charts.CustomChartsRequest
import com.langsmith_api.api.models.api.v1.charts.HostProjectChartMetric
import com.langsmith_api.api.models.api.v1.orgcharts.OrgChartUpdateParams
import com.langsmith_api.api.models.api.v1.orgcharts.section.CustomChartsRequestBase
import com.langsmith_api.api.models.api.v1.sessions.RunStatsGroupBy
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgChartServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgChartService = client.api().v1().orgCharts()

        val customChartResponse =
            orgChartService.create(
                CustomChartCreate.builder()
                    .chartType(CustomChartType.LINE)
                    .addSeries(
                        CustomChartCreate.Series.builder()
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

        customChartResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgChartService = client.api().v1().orgCharts()

        val customChartResponse =
            orgChartService.update(
                OrgChartUpdateParams.builder()
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

        customChartResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgChartService = client.api().v1().orgCharts()

        val orgChart = orgChartService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        orgChart.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun orgCharts() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgChartService = client.api().v1().orgCharts()

        val customChartsResponse =
            orgChartService.orgCharts(
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

        customChartsResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun preview() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgChartService = client.api().v1().orgCharts()

        val singleCustomChartResponseBase =
            orgChartService.preview(
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
            )

        singleCustomChartResponseBase.validate()
    }
}
