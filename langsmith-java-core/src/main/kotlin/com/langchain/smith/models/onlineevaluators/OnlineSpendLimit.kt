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

class OnlineSpendLimit
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val limitUsd: JsonField<Double>,
    private val utilizationPct: JsonField<Double>,
    private val window: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("limit_usd") @ExcludeMissing limitUsd: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("utilization_pct")
        @ExcludeMissing
        utilizationPct: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("window") @ExcludeMissing window: JsonField<String> = JsonMissing.of(),
    ) : this(limitUsd, utilizationPct, window, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitUsd(): Optional<Double> = limitUsd.getOptional("limit_usd")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun utilizationPct(): Optional<Double> = utilizationPct.getOptional("utilization_pct")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun window(): Optional<String> = window.getOptional("window")

    /**
     * Returns the raw JSON value of [limitUsd].
     *
     * Unlike [limitUsd], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("limit_usd") @ExcludeMissing fun _limitUsd(): JsonField<Double> = limitUsd

    /**
     * Returns the raw JSON value of [utilizationPct].
     *
     * Unlike [utilizationPct], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("utilization_pct")
    @ExcludeMissing
    fun _utilizationPct(): JsonField<Double> = utilizationPct

    /**
     * Returns the raw JSON value of [window].
     *
     * Unlike [window], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("window") @ExcludeMissing fun _window(): JsonField<String> = window

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

        /** Returns a mutable builder for constructing an instance of [OnlineSpendLimit]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OnlineSpendLimit]. */
    class Builder internal constructor() {

        private var limitUsd: JsonField<Double> = JsonMissing.of()
        private var utilizationPct: JsonField<Double> = JsonMissing.of()
        private var window: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(onlineSpendLimit: OnlineSpendLimit) = apply {
            limitUsd = onlineSpendLimit.limitUsd
            utilizationPct = onlineSpendLimit.utilizationPct
            window = onlineSpendLimit.window
            additionalProperties = onlineSpendLimit.additionalProperties.toMutableMap()
        }

        fun limitUsd(limitUsd: Double) = limitUsd(JsonField.of(limitUsd))

        /**
         * Sets [Builder.limitUsd] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitUsd] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun limitUsd(limitUsd: JsonField<Double>) = apply { this.limitUsd = limitUsd }

        fun utilizationPct(utilizationPct: Double) = utilizationPct(JsonField.of(utilizationPct))

        /**
         * Sets [Builder.utilizationPct] to an arbitrary JSON value.
         *
         * You should usually call [Builder.utilizationPct] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun utilizationPct(utilizationPct: JsonField<Double>) = apply {
            this.utilizationPct = utilizationPct
        }

        fun window(window: String) = window(JsonField.of(window))

        /**
         * Sets [Builder.window] to an arbitrary JSON value.
         *
         * You should usually call [Builder.window] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun window(window: JsonField<String>) = apply { this.window = window }

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
         * Returns an immutable instance of [OnlineSpendLimit].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): OnlineSpendLimit =
            OnlineSpendLimit(limitUsd, utilizationPct, window, additionalProperties.toMutableMap())
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
    fun validate(): OnlineSpendLimit = apply {
        if (validated) {
            return@apply
        }

        limitUsd()
        utilizationPct()
        window()
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
        (if (limitUsd.asKnown().isPresent) 1 else 0) +
            (if (utilizationPct.asKnown().isPresent) 1 else 0) +
            (if (window.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OnlineSpendLimit &&
            limitUsd == other.limitUsd &&
            utilizationPct == other.utilizationPct &&
            window == other.window &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(limitUsd, utilizationPct, window, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OnlineSpendLimit{limitUsd=$limitUsd, utilizationPct=$utilizationPct, window=$window, additionalProperties=$additionalProperties}"
}
