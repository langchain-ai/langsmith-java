// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.businessinfo

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
import kotlin.jvm.optionals.getOrNull

class BusinessInfoRetrieveBusinessInfoResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val companyInfo: JsonField<StripeBusinessBillingInfo>,
    private val invoiceEmail: JsonField<String>,
    private val isBusiness: JsonField<Boolean>,
    private val taxId: JsonField<StripeTaxId>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("company_info")
        @ExcludeMissing
        companyInfo: JsonField<StripeBusinessBillingInfo> = JsonMissing.of(),
        @JsonProperty("invoice_email")
        @ExcludeMissing
        invoiceEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_business")
        @ExcludeMissing
        isBusiness: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<StripeTaxId> = JsonMissing.of(),
    ) : this(companyInfo, invoiceEmail, isBusiness, taxId, mutableMapOf())

    /**
     * Stripe customer billing information.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyInfo(): Optional<StripeBusinessBillingInfo> = companyInfo.getOptional("company_info")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceEmail(): Optional<String> = invoiceEmail.getOptional("invoice_email")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isBusiness(): Optional<Boolean> = isBusiness.getOptional("is_business")

    /**
     * Stripe tax ID.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxId(): Optional<StripeTaxId> = taxId.getOptional("tax_id")

    /**
     * Returns the raw JSON value of [companyInfo].
     *
     * Unlike [companyInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company_info")
    @ExcludeMissing
    fun _companyInfo(): JsonField<StripeBusinessBillingInfo> = companyInfo

    /**
     * Returns the raw JSON value of [invoiceEmail].
     *
     * Unlike [invoiceEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_email")
    @ExcludeMissing
    fun _invoiceEmail(): JsonField<String> = invoiceEmail

    /**
     * Returns the raw JSON value of [isBusiness].
     *
     * Unlike [isBusiness], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_business") @ExcludeMissing fun _isBusiness(): JsonField<Boolean> = isBusiness

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<StripeTaxId> = taxId

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
         * Returns a mutable builder for constructing an instance of
         * [BusinessInfoRetrieveBusinessInfoResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BusinessInfoRetrieveBusinessInfoResponse]. */
    class Builder internal constructor() {

        private var companyInfo: JsonField<StripeBusinessBillingInfo> = JsonMissing.of()
        private var invoiceEmail: JsonField<String> = JsonMissing.of()
        private var isBusiness: JsonField<Boolean> = JsonMissing.of()
        private var taxId: JsonField<StripeTaxId> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            businessInfoRetrieveBusinessInfoResponse: BusinessInfoRetrieveBusinessInfoResponse
        ) = apply {
            companyInfo = businessInfoRetrieveBusinessInfoResponse.companyInfo
            invoiceEmail = businessInfoRetrieveBusinessInfoResponse.invoiceEmail
            isBusiness = businessInfoRetrieveBusinessInfoResponse.isBusiness
            taxId = businessInfoRetrieveBusinessInfoResponse.taxId
            additionalProperties =
                businessInfoRetrieveBusinessInfoResponse.additionalProperties.toMutableMap()
        }

        /** Stripe customer billing information. */
        fun companyInfo(companyInfo: StripeBusinessBillingInfo?) =
            companyInfo(JsonField.ofNullable(companyInfo))

        /** Alias for calling [Builder.companyInfo] with `companyInfo.orElse(null)`. */
        fun companyInfo(companyInfo: Optional<StripeBusinessBillingInfo>) =
            companyInfo(companyInfo.getOrNull())

        /**
         * Sets [Builder.companyInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.companyInfo] with a well-typed
         * [StripeBusinessBillingInfo] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun companyInfo(companyInfo: JsonField<StripeBusinessBillingInfo>) = apply {
            this.companyInfo = companyInfo
        }

        fun invoiceEmail(invoiceEmail: String?) = invoiceEmail(JsonField.ofNullable(invoiceEmail))

        /** Alias for calling [Builder.invoiceEmail] with `invoiceEmail.orElse(null)`. */
        fun invoiceEmail(invoiceEmail: Optional<String>) = invoiceEmail(invoiceEmail.getOrNull())

        /**
         * Sets [Builder.invoiceEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceEmail] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceEmail(invoiceEmail: JsonField<String>) = apply {
            this.invoiceEmail = invoiceEmail
        }

        fun isBusiness(isBusiness: Boolean) = isBusiness(JsonField.of(isBusiness))

        /**
         * Sets [Builder.isBusiness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isBusiness] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isBusiness(isBusiness: JsonField<Boolean>) = apply { this.isBusiness = isBusiness }

        /** Stripe tax ID. */
        fun taxId(taxId: StripeTaxId?) = taxId(JsonField.ofNullable(taxId))

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<StripeTaxId>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [StripeTaxId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxId(taxId: JsonField<StripeTaxId>) = apply { this.taxId = taxId }

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
         * Returns an immutable instance of [BusinessInfoRetrieveBusinessInfoResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BusinessInfoRetrieveBusinessInfoResponse =
            BusinessInfoRetrieveBusinessInfoResponse(
                companyInfo,
                invoiceEmail,
                isBusiness,
                taxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusinessInfoRetrieveBusinessInfoResponse = apply {
        if (validated) {
            return@apply
        }

        companyInfo().ifPresent { it.validate() }
        invoiceEmail()
        isBusiness()
        taxId().ifPresent { it.validate() }
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
        (companyInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (invoiceEmail.asKnown().isPresent) 1 else 0) +
            (if (isBusiness.asKnown().isPresent) 1 else 0) +
            (taxId.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessInfoRetrieveBusinessInfoResponse &&
            companyInfo == other.companyInfo &&
            invoiceEmail == other.invoiceEmail &&
            isBusiness == other.isBusiness &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(companyInfo, invoiceEmail, isBusiness, taxId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessInfoRetrieveBusinessInfoResponse{companyInfo=$companyInfo, invoiceEmail=$invoiceEmail, isBusiness=$isBusiness, taxId=$taxId, additionalProperties=$additionalProperties}"
}
