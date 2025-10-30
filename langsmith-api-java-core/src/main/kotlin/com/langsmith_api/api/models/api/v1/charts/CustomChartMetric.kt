// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException

/** Metrics you can chart. Feedback metrics are not available for organization-scoped charts. */
class CustomChartMetric @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val RUN_COUNT = of("run_count")

        @JvmField val LATENCY_P50 = of("latency_p50")

        @JvmField val LATENCY_P99 = of("latency_p99")

        @JvmField val LATENCY_AVG = of("latency_avg")

        @JvmField val FIRST_TOKEN_P50 = of("first_token_p50")

        @JvmField val FIRST_TOKEN_P99 = of("first_token_p99")

        @JvmField val TOTAL_TOKENS = of("total_tokens")

        @JvmField val PROMPT_TOKENS = of("prompt_tokens")

        @JvmField val COMPLETION_TOKENS = of("completion_tokens")

        @JvmField val MEDIAN_TOKENS = of("median_tokens")

        @JvmField val COMPLETION_TOKENS_P50 = of("completion_tokens_p50")

        @JvmField val PROMPT_TOKENS_P50 = of("prompt_tokens_p50")

        @JvmField val TOKENS_P99 = of("tokens_p99")

        @JvmField val COMPLETION_TOKENS_P99 = of("completion_tokens_p99")

        @JvmField val PROMPT_TOKENS_P99 = of("prompt_tokens_p99")

        @JvmField val FEEDBACK = of("feedback")

        @JvmField val FEEDBACK_SCORE_AVG = of("feedback_score_avg")

        @JvmField val FEEDBACK_VALUES = of("feedback_values")

        @JvmField val TOTAL_COST = of("total_cost")

        @JvmField val PROMPT_COST = of("prompt_cost")

        @JvmField val COMPLETION_COST = of("completion_cost")

        @JvmField val ERROR_RATE = of("error_rate")

        @JvmField val STREAMING_RATE = of("streaming_rate")

        @JvmField val COST_P50 = of("cost_p50")

        @JvmField val COST_P99 = of("cost_p99")

        @JvmStatic fun of(value: String) = CustomChartMetric(JsonField.of(value))
    }

    /** An enum containing [CustomChartMetric]'s known values. */
    enum class Known {
        RUN_COUNT,
        LATENCY_P50,
        LATENCY_P99,
        LATENCY_AVG,
        FIRST_TOKEN_P50,
        FIRST_TOKEN_P99,
        TOTAL_TOKENS,
        PROMPT_TOKENS,
        COMPLETION_TOKENS,
        MEDIAN_TOKENS,
        COMPLETION_TOKENS_P50,
        PROMPT_TOKENS_P50,
        TOKENS_P99,
        COMPLETION_TOKENS_P99,
        PROMPT_TOKENS_P99,
        FEEDBACK,
        FEEDBACK_SCORE_AVG,
        FEEDBACK_VALUES,
        TOTAL_COST,
        PROMPT_COST,
        COMPLETION_COST,
        ERROR_RATE,
        STREAMING_RATE,
        COST_P50,
        COST_P99,
    }

    /**
     * An enum containing [CustomChartMetric]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CustomChartMetric] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        RUN_COUNT,
        LATENCY_P50,
        LATENCY_P99,
        LATENCY_AVG,
        FIRST_TOKEN_P50,
        FIRST_TOKEN_P99,
        TOTAL_TOKENS,
        PROMPT_TOKENS,
        COMPLETION_TOKENS,
        MEDIAN_TOKENS,
        COMPLETION_TOKENS_P50,
        PROMPT_TOKENS_P50,
        TOKENS_P99,
        COMPLETION_TOKENS_P99,
        PROMPT_TOKENS_P99,
        FEEDBACK,
        FEEDBACK_SCORE_AVG,
        FEEDBACK_VALUES,
        TOTAL_COST,
        PROMPT_COST,
        COMPLETION_COST,
        ERROR_RATE,
        STREAMING_RATE,
        COST_P50,
        COST_P99,
        /**
         * An enum member indicating that [CustomChartMetric] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            RUN_COUNT -> Value.RUN_COUNT
            LATENCY_P50 -> Value.LATENCY_P50
            LATENCY_P99 -> Value.LATENCY_P99
            LATENCY_AVG -> Value.LATENCY_AVG
            FIRST_TOKEN_P50 -> Value.FIRST_TOKEN_P50
            FIRST_TOKEN_P99 -> Value.FIRST_TOKEN_P99
            TOTAL_TOKENS -> Value.TOTAL_TOKENS
            PROMPT_TOKENS -> Value.PROMPT_TOKENS
            COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
            MEDIAN_TOKENS -> Value.MEDIAN_TOKENS
            COMPLETION_TOKENS_P50 -> Value.COMPLETION_TOKENS_P50
            PROMPT_TOKENS_P50 -> Value.PROMPT_TOKENS_P50
            TOKENS_P99 -> Value.TOKENS_P99
            COMPLETION_TOKENS_P99 -> Value.COMPLETION_TOKENS_P99
            PROMPT_TOKENS_P99 -> Value.PROMPT_TOKENS_P99
            FEEDBACK -> Value.FEEDBACK
            FEEDBACK_SCORE_AVG -> Value.FEEDBACK_SCORE_AVG
            FEEDBACK_VALUES -> Value.FEEDBACK_VALUES
            TOTAL_COST -> Value.TOTAL_COST
            PROMPT_COST -> Value.PROMPT_COST
            COMPLETION_COST -> Value.COMPLETION_COST
            ERROR_RATE -> Value.ERROR_RATE
            STREAMING_RATE -> Value.STREAMING_RATE
            COST_P50 -> Value.COST_P50
            COST_P99 -> Value.COST_P99
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            RUN_COUNT -> Known.RUN_COUNT
            LATENCY_P50 -> Known.LATENCY_P50
            LATENCY_P99 -> Known.LATENCY_P99
            LATENCY_AVG -> Known.LATENCY_AVG
            FIRST_TOKEN_P50 -> Known.FIRST_TOKEN_P50
            FIRST_TOKEN_P99 -> Known.FIRST_TOKEN_P99
            TOTAL_TOKENS -> Known.TOTAL_TOKENS
            PROMPT_TOKENS -> Known.PROMPT_TOKENS
            COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
            MEDIAN_TOKENS -> Known.MEDIAN_TOKENS
            COMPLETION_TOKENS_P50 -> Known.COMPLETION_TOKENS_P50
            PROMPT_TOKENS_P50 -> Known.PROMPT_TOKENS_P50
            TOKENS_P99 -> Known.TOKENS_P99
            COMPLETION_TOKENS_P99 -> Known.COMPLETION_TOKENS_P99
            PROMPT_TOKENS_P99 -> Known.PROMPT_TOKENS_P99
            FEEDBACK -> Known.FEEDBACK
            FEEDBACK_SCORE_AVG -> Known.FEEDBACK_SCORE_AVG
            FEEDBACK_VALUES -> Known.FEEDBACK_VALUES
            TOTAL_COST -> Known.TOTAL_COST
            PROMPT_COST -> Known.PROMPT_COST
            COMPLETION_COST -> Known.COMPLETION_COST
            ERROR_RATE -> Known.ERROR_RATE
            STREAMING_RATE -> Known.STREAMING_RATE
            COST_P50 -> Known.COST_P50
            COST_P99 -> Known.COST_P99
            else -> throw LangsmithApiInvalidDataException("Unknown CustomChartMetric: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            LangsmithApiInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): CustomChartMetric = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomChartMetric && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
