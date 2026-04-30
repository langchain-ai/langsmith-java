// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.RunStatsResponse
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
        assertThat(client.evaluators()).isNotNull()
        assertThat(client.feedback()).isNotNull()
        assertThat(client.public_()).isNotNull()
        assertThat(client.annotationQueues()).isNotNull()
        assertThat(client.info()).isNotNull()
        assertThat(client.workspaces()).isNotNull()
        assertThat(client.repos()).isNotNull()
        assertThat(client.commits()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.sandboxes()).isNotNull()
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
    fun runStatsResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsResponse =
            RunStatsResponse.ofRunStats(
                RunStatsResponse.RunStats.builder()
                    .completionCost("completion_cost")
                    .completionCostDetails(
                        RunStatsResponse.RunStats.CompletionCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .completionTokenDetails(
                        RunStatsResponse.RunStats.CompletionTokenDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .completionTokens(0L)
                    .completionTokensP50(0L)
                    .completionTokensP99(0L)
                    .costP50("cost_p50")
                    .costP99("cost_p99")
                    .errorRate(0.0)
                    .feedbackStats(
                        RunStatsResponse.RunStats.FeedbackStats.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .firstTokenP50(0.0)
                    .firstTokenP99(0.0)
                    .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latencyP50(0.0)
                    .latencyP99(0.0)
                    .medianTokens(0L)
                    .promptCost("prompt_cost")
                    .promptCostDetails(
                        RunStatsResponse.RunStats.PromptCostDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .promptTokenDetails(
                        RunStatsResponse.RunStats.PromptTokenDetails.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .promptTokens(0L)
                    .promptTokensP50(0L)
                    .promptTokensP99(0L)
                    .runCount(0L)
                    .addRunFacet(
                        RunStatsResponse.RunStats.RunFacet.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .streamingRate(0.0)
                    .tokensP99(0L)
                    .totalCost("total_cost")
                    .totalTokens(0L)
                    .build()
            )

        val roundtrippedRunStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStatsResponse),
                jacksonTypeRef<RunStatsResponse>(),
            )

        assertThat(roundtrippedRunStatsResponse).isEqualTo(runStatsResponse)
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
