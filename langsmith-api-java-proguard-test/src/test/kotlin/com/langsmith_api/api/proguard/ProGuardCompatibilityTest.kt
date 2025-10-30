// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.charts.CustomChartMetric
import com.langsmith_api.api.models.api.v1.charts.CustomChartSeries
import com.langsmith_api.api.models.api.v1.charts.CustomChartSeriesFilters
import com.langsmith_api.api.models.api.v1.charts.CustomChartType
import com.langsmith_api.api.models.api.v1.charts.CustomChartsDataPoint
import com.langsmith_api.api.models.api.v1.charts.HostProjectChartMetric
import com.langsmith_api.api.models.api.v1.charts.SingleCustomChartResponse
import com.langsmith_api.api.models.api.v1.datasets.runs.ExampleWithRuns
import com.langsmith_api.api.models.api.v1.datasets.runs.RunCreateResponse
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TraceTier
import com.langsmith_api.api.models.api.v1.runs.RunSchema
import com.langsmith_api.api.models.api.v1.runs.RunTypeEnum
import com.langsmith_api.api.models.api.v1.sessions.CustomChartsSection
import com.langsmith_api.api.models.api.v1.sessions.SessionSortableColumns
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/langsmith-api-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.api()).isNotNull()
        assertThat(client.datasets()).isNotNull()
        assertThat(client.feedback()).isNotNull()
        assertThat(client.runs()).isNotNull()
        assertThat(client.platform()).isNotNull()
    }

    @Test
    fun customChartsSectionRoundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSection =
            CustomChartsSection.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addChart(
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
                )
                .title("title")
                .description("description")
                .index(0L)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addSubSection(
                    CustomChartsSection.SubSection.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addChart(
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
                        )
                        .index(0L)
                        .title("title")
                        .description("description")
                        .build()
                )
                .build()

        val roundtrippedCustomChartsSection =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsSection),
                jacksonTypeRef<CustomChartsSection>(),
            )

        assertThat(roundtrippedCustomChartsSection).isEqualTo(customChartsSection)
    }

    @Test
    fun runCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val runCreateResponse =
            RunCreateResponse.ofExampleWithRuns(
                listOf(
                    ExampleWithRuns.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .name("name")
                        .addRun(
                            RunSchema.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .appPath("app_path")
                                .dottedOrder("dotted_order")
                                .name("name")
                                .runType(RunTypeEnum.TOOL)
                                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("status")
                                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .completionCost("completion_cost")
                                .completionCostDetails(
                                    RunSchema.CompletionCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .completionTokenDetails(
                                    RunSchema.CompletionTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .completionTokens(0L)
                                .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error("error")
                                .addEvent(JsonValue.from(mapOf<String, Any>()))
                                .executionOrder(1L)
                                .extra(JsonValue.from(mapOf<String, Any>()))
                                .feedbackStats(
                                    RunSchema.FeedbackStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .inDataset(true)
                                .inputs(JsonValue.from(mapOf<String, Any>()))
                                .inputsPreview("inputs_preview")
                                .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                                .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .outputs(JsonValue.from(mapOf<String, Any>()))
                                .outputsPreview("outputs_preview")
                                .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .promptCost("prompt_cost")
                                .promptCostDetails(
                                    RunSchema.PromptCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .promptTokenDetails(
                                    RunSchema.PromptTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .promptTokens(0L)
                                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .s3Urls(JsonValue.from(mapOf<String, Any>()))
                                .serialized(JsonValue.from(mapOf<String, Any>()))
                                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .addTag("string")
                                .threadId("thread_id")
                                .totalCost("total_cost")
                                .totalTokens(0L)
                                .traceFirstReceivedAt(
                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                )
                                .traceMaxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceMinStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .traceTier(TraceTier.LONGLIVED)
                                .traceUpgrade(true)
                                .ttlSeconds(0L)
                                .build()
                        )
                        .attachmentUrls(JsonValue.from(mapOf<String, Any>()))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )

        val roundtrippedRunCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runCreateResponse),
                jacksonTypeRef<RunCreateResponse>(),
            )

        assertThat(roundtrippedRunCreateResponse).isEqualTo(runCreateResponse)
    }

    @Test
    fun sessionSortableColumnsRoundtrip() {
        val jsonMapper = jsonMapper()
        val sessionSortableColumns = SessionSortableColumns.NAME

        val roundtrippedSessionSortableColumns =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionSortableColumns),
                jacksonTypeRef<SessionSortableColumns>(),
            )

        assertThat(roundtrippedSessionSortableColumns).isEqualTo(sessionSortableColumns)
    }
}
