// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.public_.datasets.runs.RunStats
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class RunStatsResponseTest {

    @Test
    fun ofRunStats() {
        val runStats =
            RunStats.builder()
                .completionCost("completion_cost")
                .completionCostDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .completionTokens(0L)
                .completionTokensP50(0L)
                .completionTokensP99(0L)
                .costP50("cost_p50")
                .costP99("cost_p99")
                .errorRate(0.0)
                .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                .firstTokenP50(0.0)
                .firstTokenP99(0.0)
                .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latencyP50(0.0)
                .latencyP99(0.0)
                .medianTokens(0L)
                .promptCost("prompt_cost")
                .promptCostDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokenDetails(JsonValue.from(mapOf<String, Any>()))
                .promptTokens(0L)
                .promptTokensP50(0L)
                .promptTokensP99(0L)
                .runCount(0L)
                .addRunFacet(JsonValue.from(mapOf<String, Any>()))
                .streamingRate(0.0)
                .tokensP99(0L)
                .totalCost("total_cost")
                .totalTokens(0L)
                .build()

        val runStatsResponse = RunStatsResponse.ofRunStats(runStats)

        assertThat(runStatsResponse.runStats()).contains(runStats)
        assertThat(runStatsResponse.unionMember1()).isEmpty
    }

    @Test
    fun ofRunStatsRoundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsResponse =
            RunStatsResponse.ofRunStats(
                RunStats.builder()
                    .completionCost("completion_cost")
                    .completionCostDetails(JsonValue.from(mapOf<String, Any>()))
                    .completionTokenDetails(JsonValue.from(mapOf<String, Any>()))
                    .completionTokens(0L)
                    .completionTokensP50(0L)
                    .completionTokensP99(0L)
                    .costP50("cost_p50")
                    .costP99("cost_p99")
                    .errorRate(0.0)
                    .feedbackStats(JsonValue.from(mapOf<String, Any>()))
                    .firstTokenP50(0.0)
                    .firstTokenP99(0.0)
                    .lastRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latencyP50(0.0)
                    .latencyP99(0.0)
                    .medianTokens(0L)
                    .promptCost("prompt_cost")
                    .promptCostDetails(JsonValue.from(mapOf<String, Any>()))
                    .promptTokenDetails(JsonValue.from(mapOf<String, Any>()))
                    .promptTokens(0L)
                    .promptTokensP50(0L)
                    .promptTokensP99(0L)
                    .runCount(0L)
                    .addRunFacet(JsonValue.from(mapOf<String, Any>()))
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
    fun ofUnionMember1() {
        val unionMember1 =
            RunStatsResponse.UnionMember1.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "completion_cost" to "completion_cost",
                            "completion_cost_details" to mapOf<String, Any>(),
                            "completion_token_details" to mapOf<String, Any>(),
                            "completion_tokens" to 0,
                            "completion_tokens_p50" to 0,
                            "completion_tokens_p99" to 0,
                            "cost_p50" to "cost_p50",
                            "cost_p99" to "cost_p99",
                            "error_rate" to 0,
                            "feedback_stats" to mapOf<String, Any>(),
                            "first_token_p50" to 0,
                            "first_token_p99" to 0,
                            "last_run_start_time" to "2019-12-27T18:11:19.117Z",
                            "latency_p50" to 0,
                            "latency_p99" to 0,
                            "median_tokens" to 0,
                            "prompt_cost" to "prompt_cost",
                            "prompt_cost_details" to mapOf<String, Any>(),
                            "prompt_token_details" to mapOf<String, Any>(),
                            "prompt_tokens" to 0,
                            "prompt_tokens_p50" to 0,
                            "prompt_tokens_p99" to 0,
                            "run_count" to 0,
                            "run_facets" to listOf(mapOf<String, Any>()),
                            "streaming_rate" to 0,
                            "tokens_p99" to 0,
                            "total_cost" to "total_cost",
                            "total_tokens" to 0,
                        )
                    ),
                )
                .build()

        val runStatsResponse = RunStatsResponse.ofUnionMember1(unionMember1)

        assertThat(runStatsResponse.runStats()).isEmpty
        assertThat(runStatsResponse.unionMember1()).contains(unionMember1)
    }

    @Test
    fun ofUnionMember1Roundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsResponse =
            RunStatsResponse.ofUnionMember1(
                RunStatsResponse.UnionMember1.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "completion_cost" to "completion_cost",
                                "completion_cost_details" to mapOf<String, Any>(),
                                "completion_token_details" to mapOf<String, Any>(),
                                "completion_tokens" to 0,
                                "completion_tokens_p50" to 0,
                                "completion_tokens_p99" to 0,
                                "cost_p50" to "cost_p50",
                                "cost_p99" to "cost_p99",
                                "error_rate" to 0,
                                "feedback_stats" to mapOf<String, Any>(),
                                "first_token_p50" to 0,
                                "first_token_p99" to 0,
                                "last_run_start_time" to "2019-12-27T18:11:19.117Z",
                                "latency_p50" to 0,
                                "latency_p99" to 0,
                                "median_tokens" to 0,
                                "prompt_cost" to "prompt_cost",
                                "prompt_cost_details" to mapOf<String, Any>(),
                                "prompt_token_details" to mapOf<String, Any>(),
                                "prompt_tokens" to 0,
                                "prompt_tokens_p50" to 0,
                                "prompt_tokens_p99" to 0,
                                "run_count" to 0,
                                "run_facets" to listOf(mapOf<String, Any>()),
                                "streaming_rate" to 0,
                                "tokens_p99" to 0,
                                "total_cost" to "total_cost",
                                "total_tokens" to 0,
                            )
                        ),
                    )
                    .build()
            )

        val roundtrippedRunStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStatsResponse),
                jacksonTypeRef<RunStatsResponse>(),
            )

        assertThat(roundtrippedRunStatsResponse).isEqualTo(runStatsResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val runStatsResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<RunStatsResponse>())

        val e = assertThrows<LangsmithApiInvalidDataException> { runStatsResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
