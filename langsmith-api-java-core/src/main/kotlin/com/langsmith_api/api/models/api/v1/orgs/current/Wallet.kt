// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects

class Wallet
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val creditBalanceMicros: JsonField<Long>,
    private val inflightBalanceMicros: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("credit_balance_micros")
        @ExcludeMissing
        creditBalanceMicros: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("inflight_balance_micros")
        @ExcludeMissing
        inflightBalanceMicros: JsonField<Long> = JsonMissing.of(),
    ) : this(creditBalanceMicros, inflightBalanceMicros, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditBalanceMicros(): Long = creditBalanceMicros.getRequired("credit_balance_micros")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inflightBalanceMicros(): Long = inflightBalanceMicros.getRequired("inflight_balance_micros")

    /**
     * Returns the raw JSON value of [creditBalanceMicros].
     *
     * Unlike [creditBalanceMicros], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("credit_balance_micros")
    @ExcludeMissing
    fun _creditBalanceMicros(): JsonField<Long> = creditBalanceMicros

    /**
     * Returns the raw JSON value of [inflightBalanceMicros].
     *
     * Unlike [inflightBalanceMicros], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("inflight_balance_micros")
    @ExcludeMissing
    fun _inflightBalanceMicros(): JsonField<Long> = inflightBalanceMicros

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

        /**
         * Returns a mutable builder for constructing an instance of [Wallet].
         *
         * The following fields are required:
         * ```java
         * .creditBalanceMicros()
         * .inflightBalanceMicros()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Wallet]. */
    class Builder internal constructor() {

        private var creditBalanceMicros: JsonField<Long>? = null
        private var inflightBalanceMicros: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(wallet: Wallet) = apply {
            creditBalanceMicros = wallet.creditBalanceMicros
            inflightBalanceMicros = wallet.inflightBalanceMicros
            additionalProperties = wallet.additionalProperties.toMutableMap()
        }

        fun creditBalanceMicros(creditBalanceMicros: Long) =
            creditBalanceMicros(JsonField.of(creditBalanceMicros))

        /**
         * Sets [Builder.creditBalanceMicros] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditBalanceMicros] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditBalanceMicros(creditBalanceMicros: JsonField<Long>) = apply {
            this.creditBalanceMicros = creditBalanceMicros
        }

        fun inflightBalanceMicros(inflightBalanceMicros: Long) =
            inflightBalanceMicros(JsonField.of(inflightBalanceMicros))

        /**
         * Sets [Builder.inflightBalanceMicros] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inflightBalanceMicros] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inflightBalanceMicros(inflightBalanceMicros: JsonField<Long>) = apply {
            this.inflightBalanceMicros = inflightBalanceMicros
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
         * Returns an immutable instance of [Wallet].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .creditBalanceMicros()
         * .inflightBalanceMicros()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Wallet =
            Wallet(
                checkRequired("creditBalanceMicros", creditBalanceMicros),
                checkRequired("inflightBalanceMicros", inflightBalanceMicros),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Wallet = apply {
        if (validated) {
            return@apply
        }

        creditBalanceMicros()
        inflightBalanceMicros()
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (creditBalanceMicros.asKnown().isPresent) 1 else 0) +
            (if (inflightBalanceMicros.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Wallet &&
            creditBalanceMicros == other.creditBalanceMicros &&
            inflightBalanceMicros == other.inflightBalanceMicros &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(creditBalanceMicros, inflightBalanceMicros, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Wallet{creditBalanceMicros=$creditBalanceMicros, inflightBalanceMicros=$inflightBalanceMicros, additionalProperties=$additionalProperties}"
}
