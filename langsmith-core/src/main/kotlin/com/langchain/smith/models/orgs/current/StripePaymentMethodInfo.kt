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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Stripe customer billing info. */
class StripePaymentMethodInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val brand: JsonField<String>,
    private val email: JsonField<String>,
    private val expMonth: JsonField<Long>,
    private val expYear: JsonField<Long>,
    private val last4: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exp_month") @ExcludeMissing expMonth: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("exp_year") @ExcludeMissing expYear: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
    ) : this(brand, email, expMonth, expYear, last4, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun brand(): Optional<String> = brand.getOptional("brand")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expMonth(): Optional<Long> = expMonth.getOptional("exp_month")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expYear(): Optional<Long> = expYear.getOptional("exp_year")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun last4(): Optional<String> = last4.getOptional("last4")

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<String> = brand

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [expMonth].
     *
     * Unlike [expMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_month") @ExcludeMissing fun _expMonth(): JsonField<Long> = expMonth

    /**
     * Returns the raw JSON value of [expYear].
     *
     * Unlike [expYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exp_year") @ExcludeMissing fun _expYear(): JsonField<Long> = expYear

    /**
     * Returns the raw JSON value of [last4].
     *
     * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

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

        /** Returns a mutable builder for constructing an instance of [StripePaymentMethodInfo]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StripePaymentMethodInfo]. */
    class Builder internal constructor() {

        private var brand: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<Long> = JsonMissing.of()
        private var expYear: JsonField<Long> = JsonMissing.of()
        private var last4: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(stripePaymentMethodInfo: StripePaymentMethodInfo) = apply {
            brand = stripePaymentMethodInfo.brand
            email = stripePaymentMethodInfo.email
            expMonth = stripePaymentMethodInfo.expMonth
            expYear = stripePaymentMethodInfo.expYear
            last4 = stripePaymentMethodInfo.last4
            additionalProperties = stripePaymentMethodInfo.additionalProperties.toMutableMap()
        }

        fun brand(brand: String?) = brand(JsonField.ofNullable(brand))

        /** Alias for calling [Builder.brand] with `brand.orElse(null)`. */
        fun brand(brand: Optional<String>) = brand(brand.getOrNull())

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<String>) = apply { this.brand = brand }

        fun email(email: String?) = email(JsonField.ofNullable(email))

        /** Alias for calling [Builder.email] with `email.orElse(null)`. */
        fun email(email: Optional<String>) = email(email.getOrNull())

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun expMonth(expMonth: Long?) = expMonth(JsonField.ofNullable(expMonth))

        /**
         * Alias for [Builder.expMonth].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expMonth(expMonth: Long) = expMonth(expMonth as Long?)

        /** Alias for calling [Builder.expMonth] with `expMonth.orElse(null)`. */
        fun expMonth(expMonth: Optional<Long>) = expMonth(expMonth.getOrNull())

        /**
         * Sets [Builder.expMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expMonth] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expMonth(expMonth: JsonField<Long>) = apply { this.expMonth = expMonth }

        fun expYear(expYear: Long?) = expYear(JsonField.ofNullable(expYear))

        /**
         * Alias for [Builder.expYear].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun expYear(expYear: Long) = expYear(expYear as Long?)

        /** Alias for calling [Builder.expYear] with `expYear.orElse(null)`. */
        fun expYear(expYear: Optional<Long>) = expYear(expYear.getOrNull())

        /**
         * Sets [Builder.expYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expYear] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expYear(expYear: JsonField<Long>) = apply { this.expYear = expYear }

        fun last4(last4: String?) = last4(JsonField.ofNullable(last4))

        /** Alias for calling [Builder.last4] with `last4.orElse(null)`. */
        fun last4(last4: Optional<String>) = last4(last4.getOrNull())

        /**
         * Sets [Builder.last4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

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
         * Returns an immutable instance of [StripePaymentMethodInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StripePaymentMethodInfo =
            StripePaymentMethodInfo(
                brand,
                email,
                expMonth,
                expYear,
                last4,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StripePaymentMethodInfo = apply {
        if (validated) {
            return@apply
        }

        brand()
        email()
        expMonth()
        expYear()
        last4()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (brand.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (expMonth.asKnown().isPresent) 1 else 0) +
            (if (expYear.asKnown().isPresent) 1 else 0) +
            (if (last4.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StripePaymentMethodInfo &&
            brand == other.brand &&
            email == other.email &&
            expMonth == other.expMonth &&
            expYear == other.expYear &&
            last4 == other.last4 &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(brand, email, expMonth, expYear, last4, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StripePaymentMethodInfo{brand=$brand, email=$email, expMonth=$expMonth, expYear=$expYear, last4=$last4, additionalProperties=$additionalProperties}"
}
