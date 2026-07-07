// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import com.langchain.smith.models.runs.ResponseBodyForRunsGenerateQuery
import com.langchain.smith.models.runs.RunStatsResponse
import com.langchain.smith.models.runs.RunTypeEnum
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
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()

        assertThat(client).isNotNull()
        assertThat(client.sessions()).isNotNull()
        assertThat(client.examples()).isNotNull()
        assertThat(client.datasets()).isNotNull()
        assertThat(client.runs()).isNotNull()
        assertThat(client.threads()).isNotNull()
        assertThat(client.traces()).isNotNull()
        assertThat(client.evaluators()).isNotNull()
        assertThat(client.onlineEvaluators()).isNotNull()
        assertThat(client.feedback()).isNotNull()
        assertThat(client.public_()).isNotNull()
        assertThat(client.annotationQueues()).isNotNull()
        assertThat(client.info()).isNotNull()
        assertThat(client.workspaces()).isNotNull()
        assertThat(client.repos()).isNotNull()
        assertThat(client.commits()).isNotNull()
        assertThat(client.settings()).isNotNull()
        assertThat(client.issues()).isNotNull()
        assertThat(client.sandboxes()).isNotNull()
    }

    @Test
    fun responseBodyForRunsGenerateQueryRoundtrip() {
        val jsonMapper = jsonMapper()
        val responseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery.builder()
                .feedbackUrls(
                    ResponseBodyForRunsGenerateQuery.FeedbackUrls.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .filter("filter")
                .build()

        val roundtrippedResponseBodyForRunsGenerateQuery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(responseBodyForRunsGenerateQuery),
                jacksonTypeRef<ResponseBodyForRunsGenerateQuery>(),
            )

        assertThat(roundtrippedResponseBodyForRunsGenerateQuery)
            .isEqualTo(responseBodyForRunsGenerateQuery)
    }

    @Test
    fun runStatsResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsResponse =
            RunStatsResponse.ofRunStats(
                RunStatsResponse.RunStats.builder()
                    .completionCost(0.0)
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
                    .costP50(0.0)
                    .costP99(0.0)
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
                    .promptCost(0.0)
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
                    .totalCost(0.0)
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
    fun runTypeEnumRoundtrip() {
        val jsonMapper = jsonMapper()
        val runTypeEnum = RunTypeEnum.TOOL

        val roundtrippedRunTypeEnum =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runTypeEnum),
                jacksonTypeRef<RunTypeEnum>(),
            )

        assertThat(roundtrippedRunTypeEnum).isEqualTo(runTypeEnum)
    }
}
