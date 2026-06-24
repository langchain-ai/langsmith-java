// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.onlineevaluators

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class OnlineEvaluatorSpendDay
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<String>,
    private val spendUsd: JsonField<Double>,
    private val traceCount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
        @JsonProperty("spend_usd") @ExcludeMissing spendUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("trace_count") @ExcludeMissing traceCount: JsonField<Long> = JsonMissing.of(),
    ) : this(date, spendUsd, traceCount, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun date(): Optional<String> = date.getOptional("date")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun spendUsd(): Optional<Double> = spendUsd.getOptional("spend_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceCount(): Optional<Long> = traceCount.getOptional("trace_count")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

    /**
     * Returns the raw JSON value of [spendUsd].
     *
     * Unlike [spendUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("spend_usd") @ExcludeMissing fun _spendUsd(): JsonField<Double> = spendUsd

    /**
     * Returns the raw JSON value of [traceCount].
     *
     * Unlike [traceCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_count") @ExcludeMissing fun _traceCount(): JsonField<Long> = traceCount

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

        /** Returns a mutable builder for constructing an instance of [OnlineEvaluatorSpendDay]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineEvaluatorSpendDay]. */
    class Builder internal constructor() {

        private var date: JsonField<String> = JsonMissing.of()
        private var spendUsd: JsonField<Double> = JsonMissing.of()
        private var traceCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineEvaluatorSpendDay: OnlineEvaluatorSpendDay) = apply {
            date = onlineEvaluatorSpendDay.date
            spendUsd = onlineEvaluatorSpendDay.spendUsd
            traceCount = onlineEvaluatorSpendDay.traceCount
            additionalProperties = onlineEvaluatorSpendDay.additionalProperties.toMutableMap()
        }

        fun date(date: String) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<String>) = apply { this.date = date }

        fun spendUsd(spendUsd: Double) = spendUsd(JsonField.of(spendUsd))

        /**
         * Sets [Builder.spendUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.spendUsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun spendUsd(spendUsd: JsonField<Double>) = apply { this.spendUsd = spendUsd }

        fun traceCount(traceCount: Long) = traceCount(JsonField.of(traceCount))

        /**
         * Sets [Builder.traceCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceCount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceCount(traceCount: JsonField<Long>) = apply { this.traceCount = traceCount }

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
         * Returns an immutable instance of [OnlineEvaluatorSpendDay].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineEvaluatorSpendDay =
            OnlineEvaluatorSpendDay(date, spendUsd, traceCount, additionalProperties.toMutableMap())
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
    fun validate(): OnlineEvaluatorSpendDay = apply {
        if (validated) {
            return@apply
        }

        date()
        spendUsd()
        traceCount()
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
        (if (date.asKnown().isPresent) 1 else 0) +
            (if (spendUsd.asKnown().isPresent) 1 else 0) +
            (if (traceCount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineEvaluatorSpendDay &&
            date == other.date &&
            spendUsd == other.spendUsd &&
            traceCount == other.traceCount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(date, spendUsd, traceCount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineEvaluatorSpendDay{date=$date, spendUsd=$spendUsd, traceCount=$traceCount, additionalProperties=$additionalProperties}"
}
