// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Stripe customer address. */
class StripeCustomerAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val city: JsonField<String>,
    private val country: JsonField<String>,
    private val line1: JsonField<String>,
    private val postalCode: JsonField<String>,
    private val line2: JsonField<String>,
    private val state: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code")
        @ExcludeMissing
        postalCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
    ) : this(city, country, line1, postalCode, line2, state, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun city(): String = city.getRequired("city")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun line1(): String = line1.getRequired("line1")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun postalCode(): String = postalCode.getRequired("postal_code")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun line2(): Optional<String> = line2.getOptional("line2")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<String> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [city].
     *
     * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [line1].
     *
     * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    /**
     * Returns the raw JSON value of [postalCode].
     *
     * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    /**
     * Returns the raw JSON value of [line2].
     *
     * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
         * Returns a mutable builder for constructing an instance of [StripeCustomerAddress].
         *
         * The following fields are required:
         * ```java
         * .city()
         * .country()
         * .line1()
         * .postalCode()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StripeCustomerAddress]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var line1: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var line2: JsonField<String> = JsonMissing.of()
        private var state: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stripeCustomerAddress: StripeCustomerAddress) = apply {
            city = stripeCustomerAddress.city
            country = stripeCustomerAddress.country
            line1 = stripeCustomerAddress.line1
            postalCode = stripeCustomerAddress.postalCode
            line2 = stripeCustomerAddress.line2
            state = stripeCustomerAddress.state
            additionalProperties = stripeCustomerAddress.additionalProperties.toMutableMap()
        }

        fun city(city: String) = city(JsonField.of(city))

        /**
         * Sets [Builder.city] to an arbitrary JSON value.
         *
         * You should usually call [Builder.city] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun city(city: JsonField<String>) = apply { this.city = city }

        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun line1(line1: String) = line1(JsonField.of(line1))

        /**
         * Sets [Builder.line1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line1] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

        /**
         * Sets [Builder.postalCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        /** Alias for calling [Builder.line2] with `line2.orElse(null)`. */
        fun line2(line2: Optional<String>) = line2(line2.getOrNull())

        /**
         * Sets [Builder.line2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.line2] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        fun state(state: String?) = state(JsonField.ofNullable(state))

        /** Alias for calling [Builder.state] with `state.orElse(null)`. */
        fun state(state: Optional<String>) = state(state.getOrNull())

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<String>) = apply { this.state = state }

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
         * Returns an immutable instance of [StripeCustomerAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .city()
         * .country()
         * .line1()
         * .postalCode()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StripeCustomerAddress =
            StripeCustomerAddress(
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("line1", line1),
                checkRequired("postalCode", postalCode),
                line2,
                state,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StripeCustomerAddress = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        line1()
        postalCode()
        line2()
        state()
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
        (if (city.asKnown().isPresent) 1 else 0) +
            (if (country.asKnown().isPresent) 1 else 0) +
            (if (line1.asKnown().isPresent) 1 else 0) +
            (if (postalCode.asKnown().isPresent) 1 else 0) +
            (if (line2.asKnown().isPresent) 1 else 0) +
            (if (state.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StripeCustomerAddress &&
            city == other.city &&
            country == other.country &&
            line1 == other.line1 &&
            postalCode == other.postalCode &&
            line2 == other.line2 &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(city, country, line1, postalCode, line2, state, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StripeCustomerAddress{city=$city, country=$country, line1=$line1, postalCode=$postalCode, line2=$line2, state=$state, additionalProperties=$additionalProperties}"
}
