// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class TraceAggregates
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val firstTokenTime: JsonField<OffsetDateTime>,
    private val totalCost: JsonField<Double>,
    private val totalTokens: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("first_token_time")
        @ExcludeMissing
        firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total_cost") @ExcludeMissing totalCost: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("total_tokens")
        @ExcludeMissing
        totalTokens: JsonField<Long> = JsonMissing.of(),
    ) : this(firstTokenTime, totalCost, totalTokens, mutableMapOf())

    /**
     * `first_token_time` is when the first output token was produced anywhere in the trace
     * (RFC3339), when recorded.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstTokenTime(): Optional<OffsetDateTime> = firstTokenTime.getOptional("first_token_time")

    /**
     * `total_cost` is total estimated USD cost across every run in the trace.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCost(): Optional<Double> = totalCost.getOptional("total_cost")

    /**
     * `total_tokens` is prompt plus completion tokens summed across every run in the trace.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalTokens(): Optional<Long> = totalTokens.getOptional("total_tokens")

    /**
     * Returns the raw JSON value of [firstTokenTime].
     *
     * Unlike [firstTokenTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("first_token_time")
    @ExcludeMissing
    fun _firstTokenTime(): JsonField<OffsetDateTime> = firstTokenTime

    /**
     * Returns the raw JSON value of [totalCost].
     *
     * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_cost") @ExcludeMissing fun _totalCost(): JsonField<Double> = totalCost

    /**
     * Returns the raw JSON value of [totalTokens].
     *
     * Unlike [totalTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_tokens") @ExcludeMissing fun _totalTokens(): JsonField<Long> = totalTokens

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

        /** Returns a mutable builder for constructing an instance of [TraceAggregates]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TraceAggregates]. */
    class Builder internal constructor() {

        private var firstTokenTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var totalCost: JsonField<Double> = JsonMissing.of()
        private var totalTokens: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(traceAggregates: TraceAggregates) = apply {
            firstTokenTime = traceAggregates.firstTokenTime
            totalCost = traceAggregates.totalCost
            totalTokens = traceAggregates.totalTokens
            additionalProperties = traceAggregates.additionalProperties.toMutableMap()
        }

        /**
         * `first_token_time` is when the first output token was produced anywhere in the trace
         * (RFC3339), when recorded.
         */
        fun firstTokenTime(firstTokenTime: OffsetDateTime) =
            firstTokenTime(JsonField.of(firstTokenTime))

        /**
         * Sets [Builder.firstTokenTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstTokenTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun firstTokenTime(firstTokenTime: JsonField<OffsetDateTime>) = apply {
            this.firstTokenTime = firstTokenTime
        }

        /** `total_cost` is total estimated USD cost across every run in the trace. */
        fun totalCost(totalCost: Double) = totalCost(JsonField.of(totalCost))

        /**
         * Sets [Builder.totalCost] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCost] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalCost(totalCost: JsonField<Double>) = apply { this.totalCost = totalCost }

        /** `total_tokens` is prompt plus completion tokens summed across every run in the trace. */
        fun totalTokens(totalTokens: Long) = totalTokens(JsonField.of(totalTokens))

        /**
         * Sets [Builder.totalTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalTokens] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * Returns an immutable instance of [TraceAggregates].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TraceAggregates =
            TraceAggregates(
                firstTokenTime,
                totalCost,
                totalTokens,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): TraceAggregates = apply {
        if (validated) {
            return@apply
        }

        firstTokenTime()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (firstTokenTime.asKnown().isPresent) 1 else 0) +
            (if (totalCost.asKnown().isPresent) 1 else 0) +
            (if (totalTokens.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TraceAggregates &&
            firstTokenTime == other.firstTokenTime &&
            totalCost == other.totalCost &&
            totalTokens == other.totalTokens &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(firstTokenTime, totalCost, totalTokens, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TraceAggregates{firstTokenTime=$firstTokenTime, totalCost=$totalCost, totalTokens=$totalTokens, additionalProperties=$additionalProperties}"
}
