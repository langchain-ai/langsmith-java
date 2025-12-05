// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.datasets.runs.ExampleWithRuns
import com.langchain.smith.models.datasets.runs.RunCreateResponse
import com.langchain.smith.models.sessions.CustomChartsSection
import com.langchain.smith.models.sessions.SessionSortableColumns
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
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/langsmith-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client =
            LangsmithOkHttpClient.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()

        assertThat(client).isNotNull()
        assertThat(client.sessions()).isNotNull()
        assertThat(client.examples()).isNotNull()
        assertThat(client.datasets()).isNotNull()
        assertThat(client.runs()).isNotNull()
        assertThat(client.feedback()).isNotNull()
        assertThat(client.public_()).isNotNull()
        assertThat(client.annotationQueues()).isNotNull()
        assertThat(client.repos()).isNotNull()
        assertThat(client.commits()).isNotNull()
        assertThat(client.settings()).isNotNull()
    }

    @Test
    fun customChartsSectionRoundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSection =
            CustomChartsSection.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addChart(
                    CustomChartsSection.Chart.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .chartType(CustomChartsSection.Chart.ChartType.LINE)
                        .addData(
                            CustomChartsSection.Chart.Data.builder()
                                .seriesId("series_id")
                                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .value(0.0)
                                .group("group")
                                .build()
                        )
                        .index(0L)
                        .addSeries(
                            CustomChartsSection.Chart.Series.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .metric(CustomChartsSection.Chart.Series.Metric.RUN_COUNT)
                                .name("name")
                                .feedbackKey("feedback_key")
                                .filters(
                                    CustomChartsSection.Chart.Series.Filters.builder()
                                        .filter("filter")
                                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .traceFilter("trace_filter")
                                        .treeFilter("tree_filter")
                                        .build()
                                )
                                .groupBy(
                                    CustomChartsSection.Chart.Series.GroupBy.builder()
                                        .attribute(
                                            CustomChartsSection.Chart.Series.GroupBy.Attribute.NAME
                                        )
                                        .maxGroups(0L)
                                        .path("path")
                                        .setBy(
                                            CustomChartsSection.Chart.Series.GroupBy.SetBy.SECTION
                                        )
                                        .build()
                                )
                                .projectMetric(
                                    CustomChartsSection.Chart.Series.ProjectMetric.MEMORY_USAGE
                                )
                                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .build()
                        )
                        .title("title")
                        .commonFilters(
                            CustomChartsSection.Chart.CommonFilters.builder()
                                .filter("filter")
                                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .description("description")
                        .metadata(
                            CustomChartsSection.Chart.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
                            CustomChartsSection.SubSection.Chart.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .chartType(CustomChartsSection.SubSection.Chart.ChartType.LINE)
                                .addData(
                                    CustomChartsSection.SubSection.Chart.Data.builder()
                                        .seriesId("series_id")
                                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .value(0.0)
                                        .group("group")
                                        .build()
                                )
                                .index(0L)
                                .addSeries(
                                    CustomChartsSection.SubSection.Chart.Series.builder()
                                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .metric(
                                            CustomChartsSection.SubSection.Chart.Series.Metric
                                                .RUN_COUNT
                                        )
                                        .name("name")
                                        .feedbackKey("feedback_key")
                                        .filters(
                                            CustomChartsSection.SubSection.Chart.Series.Filters
                                                .builder()
                                                .filter("filter")
                                                .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                                .traceFilter("trace_filter")
                                                .treeFilter("tree_filter")
                                                .build()
                                        )
                                        .groupBy(
                                            CustomChartsSection.SubSection.Chart.Series.GroupBy
                                                .builder()
                                                .attribute(
                                                    CustomChartsSection.SubSection.Chart.Series
                                                        .GroupBy
                                                        .Attribute
                                                        .NAME
                                                )
                                                .maxGroups(0L)
                                                .path("path")
                                                .setBy(
                                                    CustomChartsSection.SubSection.Chart.Series
                                                        .GroupBy
                                                        .SetBy
                                                        .SECTION
                                                )
                                                .build()
                                        )
                                        .projectMetric(
                                            CustomChartsSection.SubSection.Chart.Series
                                                .ProjectMetric
                                                .MEMORY_USAGE
                                        )
                                        .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .build()
                                )
                                .title("title")
                                .commonFilters(
                                    CustomChartsSection.SubSection.Chart.CommonFilters.builder()
                                        .filter("filter")
                                        .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                        .traceFilter("trace_filter")
                                        .treeFilter("tree_filter")
                                        .build()
                                )
                                .description("description")
                                .metadata(
                                    CustomChartsSection.SubSection.Chart.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
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
            RunCreateResponse.ofExamplesWithRuns(
                listOf(
                    ExampleWithRuns.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(
                            ExampleWithRuns.Inputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .name("name")
                        .addRun(
                            ExampleWithRuns.Run.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .appPath("app_path")
                                .dottedOrder("dotted_order")
                                .name("name")
                                .runType(ExampleWithRuns.Run.RunType.TOOL)
                                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .status("status")
                                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .completionCost("completion_cost")
                                .completionCostDetails(
                                    ExampleWithRuns.Run.CompletionCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .completionTokenDetails(
                                    ExampleWithRuns.Run.CompletionTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .completionTokens(0L)
                                .addDirectChildRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .error("error")
                                .addEvent(
                                    ExampleWithRuns.Run.Event.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .executionOrder(1L)
                                .extra(
                                    ExampleWithRuns.Run.Extra.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .feedbackStats(
                                    ExampleWithRuns.Run.FeedbackStats.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
                                        )
                                        .build()
                                )
                                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .inDataset(true)
                                .inputs(
                                    ExampleWithRuns.Run.Inputs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .inputsPreview("inputs_preview")
                                .inputsS3Urls(
                                    ExampleWithRuns.Run.InputsS3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .lastQueuedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .outputs(
                                    ExampleWithRuns.Run.Outputs.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .outputsPreview("outputs_preview")
                                .outputsS3Urls(
                                    ExampleWithRuns.Run.OutputsS3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .addParentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .priceModelId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .promptCost("prompt_cost")
                                .promptCostDetails(
                                    ExampleWithRuns.Run.PromptCostDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .promptTokenDetails(
                                    ExampleWithRuns.Run.PromptTokenDetails.builder()
                                        .putAdditionalProperty("foo", JsonValue.from(0))
                                        .build()
                                )
                                .promptTokens(0L)
                                .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .s3Urls(
                                    ExampleWithRuns.Run.S3Urls.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .serialized(
                                    ExampleWithRuns.Run.Serialized.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
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
                                .traceTier(ExampleWithRuns.Run.TraceTier.LONGLIVED)
                                .traceUpgrade(true)
                                .ttlSeconds(0L)
                                .build()
                        )
                        .attachmentUrls(
                            ExampleWithRuns.AttachmentUrls.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            ExampleWithRuns.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(
                            ExampleWithRuns.Outputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
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
