// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = RunStatsResponse.Deserializer::class)
@JsonSerialize(using = RunStatsResponse.Serializer::class)
class RunStatsResponse
private constructor(
    private val runStats: RunStats? = null,
    private val unionMember1: UnionMember1? = null,
    private val _json: JsonValue? = null,
) {

    fun runStats(): Optional<RunStats> = Optional.ofNullable(runStats)

    fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

    fun isRunStats(): Boolean = runStats != null

    fun isUnionMember1(): Boolean = unionMember1 != null

    fun asRunStats(): RunStats = runStats.getOrThrow("runStats")

    fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            runStats != null -> visitor.visitRunStats(runStats)
            unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): RunStatsResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitRunStats(runStats: RunStats) {
                    runStats.validate()
                }

                override fun visitUnionMember1(unionMember1: UnionMember1) {
                    unionMember1.validate()
                }
            }
        )
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangChainInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitRunStats(runStats: RunStats) = runStats.validity()

                override fun visitUnionMember1(unionMember1: UnionMember1) = unionMember1.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunStatsResponse &&
            runStats == other.runStats &&
            unionMember1 == other.unionMember1
    }

    override fun hashCode(): Int = Objects.hash(runStats, unionMember1)

    override fun toString(): String =
        when {
            runStats != null -> "RunStatsResponse{runStats=$runStats}"
            unionMember1 != null -> "RunStatsResponse{unionMember1=$unionMember1}"
            _json != null -> "RunStatsResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid RunStatsResponse")
        }

    companion object {

        @JvmStatic fun ofRunStats(runStats: RunStats) = RunStatsResponse(runStats = runStats)

        @JvmStatic
        fun ofUnionMember1(unionMember1: UnionMember1) =
            RunStatsResponse(unionMember1 = unionMember1)
    }

    /**
     * An interface that defines how to map each variant of [RunStatsResponse] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitRunStats(runStats: RunStats): T

        fun visitUnionMember1(unionMember1: UnionMember1): T

        /**
         * Maps an unknown variant of [RunStatsResponse] to a value of type [T].
         *
         * An instance of [RunStatsResponse] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LangChainInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LangChainInvalidDataException("Unknown RunStatsResponse: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<RunStatsResponse>(RunStatsResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): RunStatsResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<RunStats>())?.let {
                            RunStatsResponse(runStats = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                            RunStatsResponse(unionMember1 = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> RunStatsResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<RunStatsResponse>(RunStatsResponse::class) {

        override fun serialize(
            value: RunStatsResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.runStats != null -> generator.writeObject(value.runStats)
                value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid RunStatsResponse")
            }
        }
    }

    class RunStats
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val completionCost: JsonField<String>,
        private val completionCostDetails: JsonField<CompletionCostDetails>,
        private val completionTokenDetails: JsonField<CompletionTokenDetails>,
        private val completionTokens: JsonField<Long>,
        private val completionTokensP50: JsonField<Long>,
        private val completionTokensP99: JsonField<Long>,
        private val costP50: JsonField<String>,
        private val costP99: JsonField<String>,
        private val errorRate: JsonField<Double>,
        private val feedbackStats: JsonField<FeedbackStats>,
        private val firstTokenP50: JsonField<Double>,
        private val firstTokenP99: JsonField<Double>,
        private val lastRunStartTime: JsonField<OffsetDateTime>,
        private val latencyP50: JsonField<Double>,
        private val latencyP99: JsonField<Double>,
        private val medianTokens: JsonField<Long>,
        private val promptCost: JsonField<String>,
        private val promptCostDetails: JsonField<PromptCostDetails>,
        private val promptTokenDetails: JsonField<PromptTokenDetails>,
        private val promptTokens: JsonField<Long>,
        private val promptTokensP50: JsonField<Long>,
        private val promptTokensP99: JsonField<Long>,
        private val runCount: JsonField<Long>,
        private val runFacets: JsonField<List<RunFacet>>,
        private val streamingRate: JsonField<Double>,
        private val tokensP99: JsonField<Long>,
        private val totalCost: JsonField<String>,
        private val totalTokens: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("completion_cost")
            @ExcludeMissing
            completionCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("completion_cost_details")
            @ExcludeMissing
            completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of(),
            @JsonProperty("completion_token_details")
            @ExcludeMissing
            completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of(),
            @JsonProperty("completion_tokens")
            @ExcludeMissing
            completionTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("completion_tokens_p50")
            @ExcludeMissing
            completionTokensP50: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("completion_tokens_p99")
            @ExcludeMissing
            completionTokensP99: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("cost_p50") @ExcludeMissing costP50: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cost_p99") @ExcludeMissing costP99: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_rate")
            @ExcludeMissing
            errorRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("feedback_stats")
            @ExcludeMissing
            feedbackStats: JsonField<FeedbackStats> = JsonMissing.of(),
            @JsonProperty("first_token_p50")
            @ExcludeMissing
            firstTokenP50: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("first_token_p99")
            @ExcludeMissing
            firstTokenP99: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("last_run_start_time")
            @ExcludeMissing
            lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("latency_p50")
            @ExcludeMissing
            latencyP50: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("latency_p99")
            @ExcludeMissing
            latencyP99: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("median_tokens")
            @ExcludeMissing
            medianTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prompt_cost")
            @ExcludeMissing
            promptCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prompt_cost_details")
            @ExcludeMissing
            promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of(),
            @JsonProperty("prompt_token_details")
            @ExcludeMissing
            promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of(),
            @JsonProperty("prompt_tokens")
            @ExcludeMissing
            promptTokens: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prompt_tokens_p50")
            @ExcludeMissing
            promptTokensP50: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("prompt_tokens_p99")
            @ExcludeMissing
            promptTokensP99: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("run_count") @ExcludeMissing runCount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("run_facets")
            @ExcludeMissing
            runFacets: JsonField<List<RunFacet>> = JsonMissing.of(),
            @JsonProperty("streaming_rate")
            @ExcludeMissing
            streamingRate: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("tokens_p99")
            @ExcludeMissing
            tokensP99: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("total_cost")
            @ExcludeMissing
            totalCost: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total_tokens")
            @ExcludeMissing
            totalTokens: JsonField<Long> = JsonMissing.of(),
        ) : this(
            completionCost,
            completionCostDetails,
            completionTokenDetails,
            completionTokens,
            completionTokensP50,
            completionTokensP99,
            costP50,
            costP99,
            errorRate,
            feedbackStats,
            firstTokenP50,
            firstTokenP99,
            lastRunStartTime,
            latencyP50,
            latencyP99,
            medianTokens,
            promptCost,
            promptCostDetails,
            promptTokenDetails,
            promptTokens,
            promptTokensP50,
            promptTokensP99,
            runCount,
            runFacets,
            streamingRate,
            tokensP99,
            totalCost,
            totalTokens,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionCost(): Optional<String> = completionCost.getOptional("completion_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionCostDetails(): Optional<CompletionCostDetails> =
            completionCostDetails.getOptional("completion_cost_details")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokenDetails(): Optional<CompletionTokenDetails> =
            completionTokenDetails.getOptional("completion_token_details")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokens(): Optional<Long> = completionTokens.getOptional("completion_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokensP50(): Optional<Long> =
            completionTokensP50.getOptional("completion_tokens_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun completionTokensP99(): Optional<Long> =
            completionTokensP99.getOptional("completion_tokens_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun costP50(): Optional<String> = costP50.getOptional("cost_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun costP99(): Optional<String> = costP99.getOptional("cost_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorRate(): Optional<Double> = errorRate.getOptional("error_rate")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun feedbackStats(): Optional<FeedbackStats> = feedbackStats.getOptional("feedback_stats")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstTokenP50(): Optional<Double> = firstTokenP50.getOptional("first_token_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstTokenP99(): Optional<Double> = firstTokenP99.getOptional("first_token_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastRunStartTime(): Optional<OffsetDateTime> =
            lastRunStartTime.getOptional("last_run_start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latencyP50(): Optional<Double> = latencyP50.getOptional("latency_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latencyP99(): Optional<Double> = latencyP99.getOptional("latency_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun medianTokens(): Optional<Long> = medianTokens.getOptional("median_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptCost(): Optional<String> = promptCost.getOptional("prompt_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptCostDetails(): Optional<PromptCostDetails> =
            promptCostDetails.getOptional("prompt_cost_details")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokenDetails(): Optional<PromptTokenDetails> =
            promptTokenDetails.getOptional("prompt_token_details")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokens(): Optional<Long> = promptTokens.getOptional("prompt_tokens")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokensP50(): Optional<Long> = promptTokensP50.getOptional("prompt_tokens_p50")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun promptTokensP99(): Optional<Long> = promptTokensP99.getOptional("prompt_tokens_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runCount(): Optional<Long> = runCount.getOptional("run_count")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runFacets(): Optional<List<RunFacet>> = runFacets.getOptional("run_facets")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun streamingRate(): Optional<Double> = streamingRate.getOptional("streaming_rate")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tokensP99(): Optional<Long> = tokensP99.getOptional("tokens_p99")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalCost(): Optional<String> = totalCost.getOptional("total_cost")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

        /**
         * Returns the raw JSON value of [completionCost].
         *
         * Unlike [completionCost], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_cost")
        @ExcludeMissing
        fun _completionCost(): JsonField<String> = completionCost

        /**
         * Returns the raw JSON value of [completionCostDetails].
         *
         * Unlike [completionCostDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completion_cost_details")
        @ExcludeMissing
        fun _completionCostDetails(): JsonField<CompletionCostDetails> = completionCostDetails

        /**
         * Returns the raw JSON value of [completionTokenDetails].
         *
         * Unlike [completionTokenDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completion_token_details")
        @ExcludeMissing
        fun _completionTokenDetails(): JsonField<CompletionTokenDetails> = completionTokenDetails

        /**
         * Returns the raw JSON value of [completionTokens].
         *
         * Unlike [completionTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("completion_tokens")
        @ExcludeMissing
        fun _completionTokens(): JsonField<Long> = completionTokens

        /**
         * Returns the raw JSON value of [completionTokensP50].
         *
         * Unlike [completionTokensP50], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completion_tokens_p50")
        @ExcludeMissing
        fun _completionTokensP50(): JsonField<Long> = completionTokensP50

        /**
         * Returns the raw JSON value of [completionTokensP99].
         *
         * Unlike [completionTokensP99], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("completion_tokens_p99")
        @ExcludeMissing
        fun _completionTokensP99(): JsonField<Long> = completionTokensP99

        /**
         * Returns the raw JSON value of [costP50].
         *
         * Unlike [costP50], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost_p50") @ExcludeMissing fun _costP50(): JsonField<String> = costP50

        /**
         * Returns the raw JSON value of [costP99].
         *
         * Unlike [costP99], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost_p99") @ExcludeMissing fun _costP99(): JsonField<String> = costP99

        /**
         * Returns the raw JSON value of [errorRate].
         *
         * Unlike [errorRate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_rate") @ExcludeMissing fun _errorRate(): JsonField<Double> = errorRate

        /**
         * Returns the raw JSON value of [feedbackStats].
         *
         * Unlike [feedbackStats], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_stats")
        @ExcludeMissing
        fun _feedbackStats(): JsonField<FeedbackStats> = feedbackStats

        /**
         * Returns the raw JSON value of [firstTokenP50].
         *
         * Unlike [firstTokenP50], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_token_p50")
        @ExcludeMissing
        fun _firstTokenP50(): JsonField<Double> = firstTokenP50

        /**
         * Returns the raw JSON value of [firstTokenP99].
         *
         * Unlike [firstTokenP99], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("first_token_p99")
        @ExcludeMissing
        fun _firstTokenP99(): JsonField<Double> = firstTokenP99

        /**
         * Returns the raw JSON value of [lastRunStartTime].
         *
         * Unlike [lastRunStartTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("last_run_start_time")
        @ExcludeMissing
        fun _lastRunStartTime(): JsonField<OffsetDateTime> = lastRunStartTime

        /**
         * Returns the raw JSON value of [latencyP50].
         *
         * Unlike [latencyP50], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency_p50")
        @ExcludeMissing
        fun _latencyP50(): JsonField<Double> = latencyP50

        /**
         * Returns the raw JSON value of [latencyP99].
         *
         * Unlike [latencyP99], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latency_p99")
        @ExcludeMissing
        fun _latencyP99(): JsonField<Double> = latencyP99

        /**
         * Returns the raw JSON value of [medianTokens].
         *
         * Unlike [medianTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("median_tokens")
        @ExcludeMissing
        fun _medianTokens(): JsonField<Long> = medianTokens

        /**
         * Returns the raw JSON value of [promptCost].
         *
         * Unlike [promptCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prompt_cost")
        @ExcludeMissing
        fun _promptCost(): JsonField<String> = promptCost

        /**
         * Returns the raw JSON value of [promptCostDetails].
         *
         * Unlike [promptCostDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_cost_details")
        @ExcludeMissing
        fun _promptCostDetails(): JsonField<PromptCostDetails> = promptCostDetails

        /**
         * Returns the raw JSON value of [promptTokenDetails].
         *
         * Unlike [promptTokenDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("prompt_token_details")
        @ExcludeMissing
        fun _promptTokenDetails(): JsonField<PromptTokenDetails> = promptTokenDetails

        /**
         * Returns the raw JSON value of [promptTokens].
         *
         * Unlike [promptTokens], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens")
        @ExcludeMissing
        fun _promptTokens(): JsonField<Long> = promptTokens

        /**
         * Returns the raw JSON value of [promptTokensP50].
         *
         * Unlike [promptTokensP50], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens_p50")
        @ExcludeMissing
        fun _promptTokensP50(): JsonField<Long> = promptTokensP50

        /**
         * Returns the raw JSON value of [promptTokensP99].
         *
         * Unlike [promptTokensP99], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prompt_tokens_p99")
        @ExcludeMissing
        fun _promptTokensP99(): JsonField<Long> = promptTokensP99

        /**
         * Returns the raw JSON value of [runCount].
         *
         * Unlike [runCount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_count") @ExcludeMissing fun _runCount(): JsonField<Long> = runCount

        /**
         * Returns the raw JSON value of [runFacets].
         *
         * Unlike [runFacets], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_facets")
        @ExcludeMissing
        fun _runFacets(): JsonField<List<RunFacet>> = runFacets

        /**
         * Returns the raw JSON value of [streamingRate].
         *
         * Unlike [streamingRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("streaming_rate")
        @ExcludeMissing
        fun _streamingRate(): JsonField<Double> = streamingRate

        /**
         * Returns the raw JSON value of [tokensP99].
         *
         * Unlike [tokensP99], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tokens_p99") @ExcludeMissing fun _tokensP99(): JsonField<Long> = tokensP99

        /**
         * Returns the raw JSON value of [totalCost].
         *
         * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<String> = totalCost

        /**
         * Returns the raw JSON value of [totalTokens].
         *
         * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_tokens")
        @ExcludeMissing
        fun _totalTokens(): JsonField<Long> = totalTokens

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [RunStats]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RunStats]. */
        class Builder internal constructor() {

            private var completionCost: JsonField<String> = JsonMissing.of()
            private var completionCostDetails: JsonField<CompletionCostDetails> = JsonMissing.of()
            private var completionTokenDetails: JsonField<CompletionTokenDetails> = JsonMissing.of()
            private var completionTokens: JsonField<Long> = JsonMissing.of()
            private var completionTokensP50: JsonField<Long> = JsonMissing.of()
            private var completionTokensP99: JsonField<Long> = JsonMissing.of()
            private var costP50: JsonField<String> = JsonMissing.of()
            private var costP99: JsonField<String> = JsonMissing.of()
            private var errorRate: JsonField<Double> = JsonMissing.of()
            private var feedbackStats: JsonField<FeedbackStats> = JsonMissing.of()
            private var firstTokenP50: JsonField<Double> = JsonMissing.of()
            private var firstTokenP99: JsonField<Double> = JsonMissing.of()
            private var lastRunStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
            private var latencyP50: JsonField<Double> = JsonMissing.of()
            private var latencyP99: JsonField<Double> = JsonMissing.of()
            private var medianTokens: JsonField<Long> = JsonMissing.of()
            private var promptCost: JsonField<String> = JsonMissing.of()
            private var promptCostDetails: JsonField<PromptCostDetails> = JsonMissing.of()
            private var promptTokenDetails: JsonField<PromptTokenDetails> = JsonMissing.of()
            private var promptTokens: JsonField<Long> = JsonMissing.of()
            private var promptTokensP50: JsonField<Long> = JsonMissing.of()
            private var promptTokensP99: JsonField<Long> = JsonMissing.of()
            private var runCount: JsonField<Long> = JsonMissing.of()
            private var runFacets: JsonField<MutableList<RunFacet>>? = null
            private var streamingRate: JsonField<Double> = JsonMissing.of()
            private var tokensP99: JsonField<Long> = JsonMissing.of()
            private var totalCost: JsonField<String> = JsonMissing.of()
            private var totalTokens: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runStats: RunStats) = apply {
                completionCost = runStats.completionCost
                completionCostDetails = runStats.completionCostDetails
                completionTokenDetails = runStats.completionTokenDetails
                completionTokens = runStats.completionTokens
                completionTokensP50 = runStats.completionTokensP50
                completionTokensP99 = runStats.completionTokensP99
                costP50 = runStats.costP50
                costP99 = runStats.costP99
                errorRate = runStats.errorRate
                feedbackStats = runStats.feedbackStats
                firstTokenP50 = runStats.firstTokenP50
                firstTokenP99 = runStats.firstTokenP99
                lastRunStartTime = runStats.lastRunStartTime
                latencyP50 = runStats.latencyP50
                latencyP99 = runStats.latencyP99
                medianTokens = runStats.medianTokens
                promptCost = runStats.promptCost
                promptCostDetails = runStats.promptCostDetails
                promptTokenDetails = runStats.promptTokenDetails
                promptTokens = runStats.promptTokens
                promptTokensP50 = runStats.promptTokensP50
                promptTokensP99 = runStats.promptTokensP99
                runCount = runStats.runCount
                runFacets = runStats.runFacets.map { it.toMutableList() }
                streamingRate = runStats.streamingRate
                tokensP99 = runStats.tokensP99
                totalCost = runStats.totalCost
                totalTokens = runStats.totalTokens
                additionalProperties = runStats.additionalProperties.toMutableMap()
            }

            fun completionCost(completionCost: String?) =
                completionCost(JsonField.ofNullable(completionCost))

            /** Alias for calling [Builder.completionCost] with `completionCost.orElse(null)`. */
            fun completionCost(completionCost: Optional<String>) =
                completionCost(completionCost.getOrNull())

            /**
             * Sets [Builder.completionCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionCost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionCost(completionCost: JsonField<String>) = apply {
                this.completionCost = completionCost
            }

            fun completionCostDetails(completionCostDetails: CompletionCostDetails?) =
                completionCostDetails(JsonField.ofNullable(completionCostDetails))

            /**
             * Alias for calling [Builder.completionCostDetails] with
             * `completionCostDetails.orElse(null)`.
             */
            fun completionCostDetails(completionCostDetails: Optional<CompletionCostDetails>) =
                completionCostDetails(completionCostDetails.getOrNull())

            /**
             * Sets [Builder.completionCostDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionCostDetails] with a well-typed
             * [CompletionCostDetails] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun completionCostDetails(completionCostDetails: JsonField<CompletionCostDetails>) =
                apply {
                    this.completionCostDetails = completionCostDetails
                }

            fun completionTokenDetails(completionTokenDetails: CompletionTokenDetails?) =
                completionTokenDetails(JsonField.ofNullable(completionTokenDetails))

            /**
             * Alias for calling [Builder.completionTokenDetails] with
             * `completionTokenDetails.orElse(null)`.
             */
            fun completionTokenDetails(completionTokenDetails: Optional<CompletionTokenDetails>) =
                completionTokenDetails(completionTokenDetails.getOrNull())

            /**
             * Sets [Builder.completionTokenDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokenDetails] with a well-typed
             * [CompletionTokenDetails] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun completionTokenDetails(completionTokenDetails: JsonField<CompletionTokenDetails>) =
                apply {
                    this.completionTokenDetails = completionTokenDetails
                }

            fun completionTokens(completionTokens: Long?) =
                completionTokens(JsonField.ofNullable(completionTokens))

            /**
             * Alias for [Builder.completionTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun completionTokens(completionTokens: Long) =
                completionTokens(completionTokens as Long?)

            /**
             * Alias for calling [Builder.completionTokens] with `completionTokens.orElse(null)`.
             */
            fun completionTokens(completionTokens: Optional<Long>) =
                completionTokens(completionTokens.getOrNull())

            /**
             * Sets [Builder.completionTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionTokens(completionTokens: JsonField<Long>) = apply {
                this.completionTokens = completionTokens
            }

            fun completionTokensP50(completionTokensP50: Long?) =
                completionTokensP50(JsonField.ofNullable(completionTokensP50))

            /**
             * Alias for [Builder.completionTokensP50].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun completionTokensP50(completionTokensP50: Long) =
                completionTokensP50(completionTokensP50 as Long?)

            /**
             * Alias for calling [Builder.completionTokensP50] with
             * `completionTokensP50.orElse(null)`.
             */
            fun completionTokensP50(completionTokensP50: Optional<Long>) =
                completionTokensP50(completionTokensP50.getOrNull())

            /**
             * Sets [Builder.completionTokensP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokensP50] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionTokensP50(completionTokensP50: JsonField<Long>) = apply {
                this.completionTokensP50 = completionTokensP50
            }

            fun completionTokensP99(completionTokensP99: Long?) =
                completionTokensP99(JsonField.ofNullable(completionTokensP99))

            /**
             * Alias for [Builder.completionTokensP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun completionTokensP99(completionTokensP99: Long) =
                completionTokensP99(completionTokensP99 as Long?)

            /**
             * Alias for calling [Builder.completionTokensP99] with
             * `completionTokensP99.orElse(null)`.
             */
            fun completionTokensP99(completionTokensP99: Optional<Long>) =
                completionTokensP99(completionTokensP99.getOrNull())

            /**
             * Sets [Builder.completionTokensP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completionTokensP99] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun completionTokensP99(completionTokensP99: JsonField<Long>) = apply {
                this.completionTokensP99 = completionTokensP99
            }

            fun costP50(costP50: String?) = costP50(JsonField.ofNullable(costP50))

            /** Alias for calling [Builder.costP50] with `costP50.orElse(null)`. */
            fun costP50(costP50: Optional<String>) = costP50(costP50.getOrNull())

            /**
             * Sets [Builder.costP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costP50] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costP50(costP50: JsonField<String>) = apply { this.costP50 = costP50 }

            fun costP99(costP99: String?) = costP99(JsonField.ofNullable(costP99))

            /** Alias for calling [Builder.costP99] with `costP99.orElse(null)`. */
            fun costP99(costP99: Optional<String>) = costP99(costP99.getOrNull())

            /**
             * Sets [Builder.costP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.costP99] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun costP99(costP99: JsonField<String>) = apply { this.costP99 = costP99 }

            fun errorRate(errorRate: Double?) = errorRate(JsonField.ofNullable(errorRate))

            /**
             * Alias for [Builder.errorRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun errorRate(errorRate: Double) = errorRate(errorRate as Double?)

            /** Alias for calling [Builder.errorRate] with `errorRate.orElse(null)`. */
            fun errorRate(errorRate: Optional<Double>) = errorRate(errorRate.getOrNull())

            /**
             * Sets [Builder.errorRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorRate] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorRate(errorRate: JsonField<Double>) = apply { this.errorRate = errorRate }

            fun feedbackStats(feedbackStats: FeedbackStats?) =
                feedbackStats(JsonField.ofNullable(feedbackStats))

            /** Alias for calling [Builder.feedbackStats] with `feedbackStats.orElse(null)`. */
            fun feedbackStats(feedbackStats: Optional<FeedbackStats>) =
                feedbackStats(feedbackStats.getOrNull())

            /**
             * Sets [Builder.feedbackStats] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackStats] with a well-typed [FeedbackStats]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feedbackStats(feedbackStats: JsonField<FeedbackStats>) = apply {
                this.feedbackStats = feedbackStats
            }

            fun firstTokenP50(firstTokenP50: Double?) =
                firstTokenP50(JsonField.ofNullable(firstTokenP50))

            /**
             * Alias for [Builder.firstTokenP50].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun firstTokenP50(firstTokenP50: Double) = firstTokenP50(firstTokenP50 as Double?)

            /** Alias for calling [Builder.firstTokenP50] with `firstTokenP50.orElse(null)`. */
            fun firstTokenP50(firstTokenP50: Optional<Double>) =
                firstTokenP50(firstTokenP50.getOrNull())

            /**
             * Sets [Builder.firstTokenP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstTokenP50] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstTokenP50(firstTokenP50: JsonField<Double>) = apply {
                this.firstTokenP50 = firstTokenP50
            }

            fun firstTokenP99(firstTokenP99: Double?) =
                firstTokenP99(JsonField.ofNullable(firstTokenP99))

            /**
             * Alias for [Builder.firstTokenP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun firstTokenP99(firstTokenP99: Double) = firstTokenP99(firstTokenP99 as Double?)

            /** Alias for calling [Builder.firstTokenP99] with `firstTokenP99.orElse(null)`. */
            fun firstTokenP99(firstTokenP99: Optional<Double>) =
                firstTokenP99(firstTokenP99.getOrNull())

            /**
             * Sets [Builder.firstTokenP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstTokenP99] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstTokenP99(firstTokenP99: JsonField<Double>) = apply {
                this.firstTokenP99 = firstTokenP99
            }

            fun lastRunStartTime(lastRunStartTime: OffsetDateTime?) =
                lastRunStartTime(JsonField.ofNullable(lastRunStartTime))

            /**
             * Alias for calling [Builder.lastRunStartTime] with `lastRunStartTime.orElse(null)`.
             */
            fun lastRunStartTime(lastRunStartTime: Optional<OffsetDateTime>) =
                lastRunStartTime(lastRunStartTime.getOrNull())

            /**
             * Sets [Builder.lastRunStartTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastRunStartTime] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lastRunStartTime(lastRunStartTime: JsonField<OffsetDateTime>) = apply {
                this.lastRunStartTime = lastRunStartTime
            }

            fun latencyP50(latencyP50: Double?) = latencyP50(JsonField.ofNullable(latencyP50))

            /**
             * Alias for [Builder.latencyP50].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latencyP50(latencyP50: Double) = latencyP50(latencyP50 as Double?)

            /** Alias for calling [Builder.latencyP50] with `latencyP50.orElse(null)`. */
            fun latencyP50(latencyP50: Optional<Double>) = latencyP50(latencyP50.getOrNull())

            /**
             * Sets [Builder.latencyP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latencyP50] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latencyP50(latencyP50: JsonField<Double>) = apply { this.latencyP50 = latencyP50 }

            fun latencyP99(latencyP99: Double?) = latencyP99(JsonField.ofNullable(latencyP99))

            /**
             * Alias for [Builder.latencyP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun latencyP99(latencyP99: Double) = latencyP99(latencyP99 as Double?)

            /** Alias for calling [Builder.latencyP99] with `latencyP99.orElse(null)`. */
            fun latencyP99(latencyP99: Optional<Double>) = latencyP99(latencyP99.getOrNull())

            /**
             * Sets [Builder.latencyP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latencyP99] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latencyP99(latencyP99: JsonField<Double>) = apply { this.latencyP99 = latencyP99 }

            fun medianTokens(medianTokens: Long?) = medianTokens(JsonField.ofNullable(medianTokens))

            /**
             * Alias for [Builder.medianTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun medianTokens(medianTokens: Long) = medianTokens(medianTokens as Long?)

            /** Alias for calling [Builder.medianTokens] with `medianTokens.orElse(null)`. */
            fun medianTokens(medianTokens: Optional<Long>) = medianTokens(medianTokens.getOrNull())

            /**
             * Sets [Builder.medianTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.medianTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun medianTokens(medianTokens: JsonField<Long>) = apply {
                this.medianTokens = medianTokens
            }

            fun promptCost(promptCost: String?) = promptCost(JsonField.ofNullable(promptCost))

            /** Alias for calling [Builder.promptCost] with `promptCost.orElse(null)`. */
            fun promptCost(promptCost: Optional<String>) = promptCost(promptCost.getOrNull())

            /**
             * Sets [Builder.promptCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCost] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptCost(promptCost: JsonField<String>) = apply { this.promptCost = promptCost }

            fun promptCostDetails(promptCostDetails: PromptCostDetails?) =
                promptCostDetails(JsonField.ofNullable(promptCostDetails))

            /**
             * Alias for calling [Builder.promptCostDetails] with `promptCostDetails.orElse(null)`.
             */
            fun promptCostDetails(promptCostDetails: Optional<PromptCostDetails>) =
                promptCostDetails(promptCostDetails.getOrNull())

            /**
             * Sets [Builder.promptCostDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptCostDetails] with a well-typed
             * [PromptCostDetails] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun promptCostDetails(promptCostDetails: JsonField<PromptCostDetails>) = apply {
                this.promptCostDetails = promptCostDetails
            }

            fun promptTokenDetails(promptTokenDetails: PromptTokenDetails?) =
                promptTokenDetails(JsonField.ofNullable(promptTokenDetails))

            /**
             * Alias for calling [Builder.promptTokenDetails] with
             * `promptTokenDetails.orElse(null)`.
             */
            fun promptTokenDetails(promptTokenDetails: Optional<PromptTokenDetails>) =
                promptTokenDetails(promptTokenDetails.getOrNull())

            /**
             * Sets [Builder.promptTokenDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokenDetails] with a well-typed
             * [PromptTokenDetails] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun promptTokenDetails(promptTokenDetails: JsonField<PromptTokenDetails>) = apply {
                this.promptTokenDetails = promptTokenDetails
            }

            fun promptTokens(promptTokens: Long?) = promptTokens(JsonField.ofNullable(promptTokens))

            /**
             * Alias for [Builder.promptTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun promptTokens(promptTokens: Long) = promptTokens(promptTokens as Long?)

            /** Alias for calling [Builder.promptTokens] with `promptTokens.orElse(null)`. */
            fun promptTokens(promptTokens: Optional<Long>) = promptTokens(promptTokens.getOrNull())

            /**
             * Sets [Builder.promptTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokens] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokens(promptTokens: JsonField<Long>) = apply {
                this.promptTokens = promptTokens
            }

            fun promptTokensP50(promptTokensP50: Long?) =
                promptTokensP50(JsonField.ofNullable(promptTokensP50))

            /**
             * Alias for [Builder.promptTokensP50].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun promptTokensP50(promptTokensP50: Long) = promptTokensP50(promptTokensP50 as Long?)

            /** Alias for calling [Builder.promptTokensP50] with `promptTokensP50.orElse(null)`. */
            fun promptTokensP50(promptTokensP50: Optional<Long>) =
                promptTokensP50(promptTokensP50.getOrNull())

            /**
             * Sets [Builder.promptTokensP50] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokensP50] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokensP50(promptTokensP50: JsonField<Long>) = apply {
                this.promptTokensP50 = promptTokensP50
            }

            fun promptTokensP99(promptTokensP99: Long?) =
                promptTokensP99(JsonField.ofNullable(promptTokensP99))

            /**
             * Alias for [Builder.promptTokensP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun promptTokensP99(promptTokensP99: Long) = promptTokensP99(promptTokensP99 as Long?)

            /** Alias for calling [Builder.promptTokensP99] with `promptTokensP99.orElse(null)`. */
            fun promptTokensP99(promptTokensP99: Optional<Long>) =
                promptTokensP99(promptTokensP99.getOrNull())

            /**
             * Sets [Builder.promptTokensP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.promptTokensP99] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun promptTokensP99(promptTokensP99: JsonField<Long>) = apply {
                this.promptTokensP99 = promptTokensP99
            }

            fun runCount(runCount: Long?) = runCount(JsonField.ofNullable(runCount))

            /**
             * Alias for [Builder.runCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun runCount(runCount: Long) = runCount(runCount as Long?)

            /** Alias for calling [Builder.runCount] with `runCount.orElse(null)`. */
            fun runCount(runCount: Optional<Long>) = runCount(runCount.getOrNull())

            /**
             * Sets [Builder.runCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runCount] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runCount(runCount: JsonField<Long>) = apply { this.runCount = runCount }

            fun runFacets(runFacets: List<RunFacet>?) = runFacets(JsonField.ofNullable(runFacets))

            /** Alias for calling [Builder.runFacets] with `runFacets.orElse(null)`. */
            fun runFacets(runFacets: Optional<List<RunFacet>>) = runFacets(runFacets.getOrNull())

            /**
             * Sets [Builder.runFacets] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runFacets] with a well-typed `List<RunFacet>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun runFacets(runFacets: JsonField<List<RunFacet>>) = apply {
                this.runFacets = runFacets.map { it.toMutableList() }
            }

            /**
             * Adds a single [RunFacet] to [runFacets].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRunFacet(runFacet: RunFacet) = apply {
                runFacets =
                    (runFacets ?: JsonField.of(mutableListOf())).also {
                        checkKnown("runFacets", it).add(runFacet)
                    }
            }

            fun streamingRate(streamingRate: Double?) =
                streamingRate(JsonField.ofNullable(streamingRate))

            /**
             * Alias for [Builder.streamingRate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun streamingRate(streamingRate: Double) = streamingRate(streamingRate as Double?)

            /** Alias for calling [Builder.streamingRate] with `streamingRate.orElse(null)`. */
            fun streamingRate(streamingRate: Optional<Double>) =
                streamingRate(streamingRate.getOrNull())

            /**
             * Sets [Builder.streamingRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.streamingRate] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun streamingRate(streamingRate: JsonField<Double>) = apply {
                this.streamingRate = streamingRate
            }

            fun tokensP99(tokensP99: Long?) = tokensP99(JsonField.ofNullable(tokensP99))

            /**
             * Alias for [Builder.tokensP99].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tokensP99(tokensP99: Long) = tokensP99(tokensP99 as Long?)

            /** Alias for calling [Builder.tokensP99] with `tokensP99.orElse(null)`. */
            fun tokensP99(tokensP99: Optional<Long>) = tokensP99(tokensP99.getOrNull())

            /**
             * Sets [Builder.tokensP99] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tokensP99] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tokensP99(tokensP99: JsonField<Long>) = apply { this.tokensP99 = tokensP99 }

            fun totalCost(totalCost: String?) = totalCost(JsonField.ofNullable(totalCost))

            /** Alias for calling [Builder.totalCost] with `totalCost.orElse(null)`. */
            fun totalCost(totalCost: Optional<String>) = totalCost(totalCost.getOrNull())

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalCost(totalCost: JsonField<String>) = apply { this.totalCost = totalCost }

            fun totalTokens(totalTokens: Long?) = totalTokens(JsonField.ofNullable(totalTokens))

            /**
             * Alias for [Builder.totalTokens].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun totalTokens(totalTokens: Long) = totalTokens(totalTokens as Long?)

            /** Alias for calling [Builder.totalTokens] with `totalTokens.orElse(null)`. */
            fun totalTokens(totalTokens: Optional<Long>) = totalTokens(totalTokens.getOrNull())

            /**
             * Sets [Builder.totalTokens] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalTokens(totalTokens: JsonField<Long>) = apply { this.totalTokens = totalTokens }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [RunStats].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): RunStats =
                RunStats(
                    completionCost,
                    completionCostDetails,
                    completionTokenDetails,
                    completionTokens,
                    completionTokensP50,
                    completionTokensP99,
                    costP50,
                    costP99,
                    errorRate,
                    feedbackStats,
                    firstTokenP50,
                    firstTokenP99,
                    lastRunStartTime,
                    latencyP50,
                    latencyP99,
                    medianTokens,
                    promptCost,
                    promptCostDetails,
                    promptTokenDetails,
                    promptTokens,
                    promptTokensP50,
                    promptTokensP99,
                    runCount,
                    (runFacets ?: JsonMissing.of()).map { it.toImmutable() },
                    streamingRate,
                    tokensP99,
                    totalCost,
                    totalTokens,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RunStats = apply {
            if (validated) {
                return@apply
            }

            completionCost()
            completionCostDetails().ifPresent { it.validate() }
            completionTokenDetails().ifPresent { it.validate() }
            completionTokens()
            completionTokensP50()
            completionTokensP99()
            costP50()
            costP99()
            errorRate()
            feedbackStats().ifPresent { it.validate() }
            firstTokenP50()
            firstTokenP99()
            lastRunStartTime()
            latencyP50()
            latencyP99()
            medianTokens()
            promptCost()
            promptCostDetails().ifPresent { it.validate() }
            promptTokenDetails().ifPresent { it.validate() }
            promptTokens()
            promptTokensP50()
            promptTokensP99()
            runCount()
            runFacets().ifPresent { it.forEach { it.validate() } }
            streamingRate()
            tokensP99()
            totalCost()
            totalTokens()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (completionCost.asKnown().isPresent) 1 else 0) +
                (completionCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (completionTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (completionTokens.asKnown().isPresent) 1 else 0) +
                (if (completionTokensP50.asKnown().isPresent) 1 else 0) +
                (if (completionTokensP99.asKnown().isPresent) 1 else 0) +
                (if (costP50.asKnown().isPresent) 1 else 0) +
                (if (costP99.asKnown().isPresent) 1 else 0) +
                (if (errorRate.asKnown().isPresent) 1 else 0) +
                (feedbackStats.asKnown().getOrNull()?.validity() ?: 0) +
                (if (firstTokenP50.asKnown().isPresent) 1 else 0) +
                (if (firstTokenP99.asKnown().isPresent) 1 else 0) +
                (if (lastRunStartTime.asKnown().isPresent) 1 else 0) +
                (if (latencyP50.asKnown().isPresent) 1 else 0) +
                (if (latencyP99.asKnown().isPresent) 1 else 0) +
                (if (medianTokens.asKnown().isPresent) 1 else 0) +
                (if (promptCost.asKnown().isPresent) 1 else 0) +
                (promptCostDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (promptTokenDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (promptTokens.asKnown().isPresent) 1 else 0) +
                (if (promptTokensP50.asKnown().isPresent) 1 else 0) +
                (if (promptTokensP99.asKnown().isPresent) 1 else 0) +
                (if (runCount.asKnown().isPresent) 1 else 0) +
                (runFacets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (streamingRate.asKnown().isPresent) 1 else 0) +
                (if (tokensP99.asKnown().isPresent) 1 else 0) +
                (if (totalCost.asKnown().isPresent) 1 else 0) +
                (if (totalTokens.asKnown().isPresent) 1 else 0)

        class CompletionCostDetails
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CompletionCostDetails].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CompletionCostDetails]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(completionCostDetails: CompletionCostDetails) = apply {
                    additionalProperties = completionCostDetails.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CompletionCostDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CompletionCostDetails =
                    CompletionCostDetails(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CompletionCostDetails = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CompletionCostDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CompletionCostDetails{additionalProperties=$additionalProperties}"
        }

        class CompletionTokenDetails
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CompletionTokenDetails].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CompletionTokenDetails]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(completionTokenDetails: CompletionTokenDetails) = apply {
                    additionalProperties =
                        completionTokenDetails.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CompletionTokenDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CompletionTokenDetails =
                    CompletionTokenDetails(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): CompletionTokenDetails = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CompletionTokenDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CompletionTokenDetails{additionalProperties=$additionalProperties}"
        }

        class FeedbackStats
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [FeedbackStats]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [FeedbackStats]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(feedbackStats: FeedbackStats) = apply {
                    additionalProperties = feedbackStats.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [FeedbackStats].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): FeedbackStats = FeedbackStats(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): FeedbackStats = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeedbackStats && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "FeedbackStats{additionalProperties=$additionalProperties}"
        }

        class PromptCostDetails
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PromptCostDetails].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PromptCostDetails]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptCostDetails: PromptCostDetails) = apply {
                    additionalProperties = promptCostDetails.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PromptCostDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PromptCostDetails =
                    PromptCostDetails(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): PromptCostDetails = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PromptCostDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PromptCostDetails{additionalProperties=$additionalProperties}"
        }

        class PromptTokenDetails
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PromptTokenDetails].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PromptTokenDetails]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(promptTokenDetails: PromptTokenDetails) = apply {
                    additionalProperties = promptTokenDetails.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PromptTokenDetails].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PromptTokenDetails =
                    PromptTokenDetails(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): PromptTokenDetails = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PromptTokenDetails &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PromptTokenDetails{additionalProperties=$additionalProperties}"
        }

        class RunFacet
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [RunFacet]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RunFacet]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(runFacet: RunFacet) = apply {
                    additionalProperties = runFacet.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RunFacet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): RunFacet = RunFacet(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): RunFacet = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RunFacet && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "RunFacet{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunStats &&
                completionCost == other.completionCost &&
                completionCostDetails == other.completionCostDetails &&
                completionTokenDetails == other.completionTokenDetails &&
                completionTokens == other.completionTokens &&
                completionTokensP50 == other.completionTokensP50 &&
                completionTokensP99 == other.completionTokensP99 &&
                costP50 == other.costP50 &&
                costP99 == other.costP99 &&
                errorRate == other.errorRate &&
                feedbackStats == other.feedbackStats &&
                firstTokenP50 == other.firstTokenP50 &&
                firstTokenP99 == other.firstTokenP99 &&
                lastRunStartTime == other.lastRunStartTime &&
                latencyP50 == other.latencyP50 &&
                latencyP99 == other.latencyP99 &&
                medianTokens == other.medianTokens &&
                promptCost == other.promptCost &&
                promptCostDetails == other.promptCostDetails &&
                promptTokenDetails == other.promptTokenDetails &&
                promptTokens == other.promptTokens &&
                promptTokensP50 == other.promptTokensP50 &&
                promptTokensP99 == other.promptTokensP99 &&
                runCount == other.runCount &&
                runFacets == other.runFacets &&
                streamingRate == other.streamingRate &&
                tokensP99 == other.tokensP99 &&
                totalCost == other.totalCost &&
                totalTokens == other.totalTokens &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                completionCost,
                completionCostDetails,
                completionTokenDetails,
                completionTokens,
                completionTokensP50,
                completionTokensP99,
                costP50,
                costP99,
                errorRate,
                feedbackStats,
                firstTokenP50,
                firstTokenP99,
                lastRunStartTime,
                latencyP50,
                latencyP99,
                medianTokens,
                promptCost,
                promptCostDetails,
                promptTokenDetails,
                promptTokens,
                promptTokensP50,
                promptTokensP99,
                runCount,
                runFacets,
                streamingRate,
                tokensP99,
                totalCost,
                totalTokens,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RunStats{completionCost=$completionCost, completionCostDetails=$completionCostDetails, completionTokenDetails=$completionTokenDetails, completionTokens=$completionTokens, completionTokensP50=$completionTokensP50, completionTokensP99=$completionTokensP99, costP50=$costP50, costP99=$costP99, errorRate=$errorRate, feedbackStats=$feedbackStats, firstTokenP50=$firstTokenP50, firstTokenP99=$firstTokenP99, lastRunStartTime=$lastRunStartTime, latencyP50=$latencyP50, latencyP99=$latencyP99, medianTokens=$medianTokens, promptCost=$promptCost, promptCostDetails=$promptCostDetails, promptTokenDetails=$promptTokenDetails, promptTokens=$promptTokens, promptTokensP50=$promptTokensP50, promptTokensP99=$promptTokensP99, runCount=$runCount, runFacets=$runFacets, streamingRate=$streamingRate, tokensP99=$tokensP99, totalCost=$totalCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
    }

    class UnionMember1
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [UnionMember1]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UnionMember1]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(unionMember1: UnionMember1) = apply {
                additionalProperties = unionMember1.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [UnionMember1].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): UnionMember1 = UnionMember1(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): UnionMember1 = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UnionMember1 && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "UnionMember1{additionalProperties=$additionalProperties}"
    }
}
