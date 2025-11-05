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
import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Set Company Info */
class BusinessInfoBusinessInfoParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Stripe customer billing information.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun companyInfo(): Optional<StripeBusinessBillingInfo> = body.companyInfo()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceEmail(): Optional<String> = body.invoiceEmail()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isBusiness(): Optional<Boolean> = body.isBusiness()

    /**
     * Stripe tax ID.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxId(): Optional<StripeTaxId> = body.taxId()

    /**
     * Returns the raw JSON value of [companyInfo].
     *
     * Unlike [companyInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _companyInfo(): JsonField<StripeBusinessBillingInfo> = body._companyInfo()

    /**
     * Returns the raw JSON value of [invoiceEmail].
     *
     * Unlike [invoiceEmail], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceEmail(): JsonField<String> = body._invoiceEmail()

    /**
     * Returns the raw JSON value of [isBusiness].
     *
     * Unlike [isBusiness], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isBusiness(): JsonField<Boolean> = body._isBusiness()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<StripeTaxId> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BusinessInfoBusinessInfoParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [BusinessInfoBusinessInfoParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BusinessInfoBusinessInfoParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(businessInfoBusinessInfoParams: BusinessInfoBusinessInfoParams) = apply {
            body = businessInfoBusinessInfoParams.body.toBuilder()
            additionalHeaders = businessInfoBusinessInfoParams.additionalHeaders.toBuilder()
            additionalQueryParams = businessInfoBusinessInfoParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [companyInfo]
         * - [invoiceEmail]
         * - [isBusiness]
         * - [taxId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Stripe customer billing information. */
        fun companyInfo(companyInfo: StripeBusinessBillingInfo?) = apply {
            body.companyInfo(companyInfo)
        }

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
            body.companyInfo(companyInfo)
        }

        fun invoiceEmail(invoiceEmail: String?) = apply { body.invoiceEmail(invoiceEmail) }

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
            body.invoiceEmail(invoiceEmail)
        }

        fun isBusiness(isBusiness: Boolean) = apply { body.isBusiness(isBusiness) }

        /**
         * Sets [Builder.isBusiness] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isBusiness] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isBusiness(isBusiness: JsonField<Boolean>) = apply { body.isBusiness(isBusiness) }

        /** Stripe tax ID. */
        fun taxId(taxId: StripeTaxId?) = apply { body.taxId(taxId) }

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<StripeTaxId>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [StripeTaxId] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxId(taxId: JsonField<StripeTaxId>) = apply { body.taxId(taxId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [BusinessInfoBusinessInfoParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BusinessInfoBusinessInfoParams =
            BusinessInfoBusinessInfoParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun companyInfo(): Optional<StripeBusinessBillingInfo> =
            companyInfo.getOptional("company_info")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceEmail(): Optional<String> = invoiceEmail.getOptional("invoice_email")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isBusiness(): Optional<Boolean> = isBusiness.getOptional("is_business")

        /**
         * Stripe tax ID.
         *
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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
         * Unlike [invoiceEmail], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_email")
        @ExcludeMissing
        fun _invoiceEmail(): JsonField<String> = invoiceEmail

        /**
         * Returns the raw JSON value of [isBusiness].
         *
         * Unlike [isBusiness], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_business")
        @ExcludeMissing
        fun _isBusiness(): JsonField<Boolean> = isBusiness

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var companyInfo: JsonField<StripeBusinessBillingInfo> = JsonMissing.of()
            private var invoiceEmail: JsonField<String> = JsonMissing.of()
            private var isBusiness: JsonField<Boolean> = JsonMissing.of()
            private var taxId: JsonField<StripeTaxId> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                companyInfo = body.companyInfo
                invoiceEmail = body.invoiceEmail
                isBusiness = body.isBusiness
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * [StripeBusinessBillingInfo] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun companyInfo(companyInfo: JsonField<StripeBusinessBillingInfo>) = apply {
                this.companyInfo = companyInfo
            }

            fun invoiceEmail(invoiceEmail: String?) =
                invoiceEmail(JsonField.ofNullable(invoiceEmail))

            /** Alias for calling [Builder.invoiceEmail] with `invoiceEmail.orElse(null)`. */
            fun invoiceEmail(invoiceEmail: Optional<String>) =
                invoiceEmail(invoiceEmail.getOrNull())

            /**
             * Sets [Builder.invoiceEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceEmail] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceEmail(invoiceEmail: JsonField<String>) = apply {
                this.invoiceEmail = invoiceEmail
            }

            fun isBusiness(isBusiness: Boolean) = isBusiness(JsonField.of(isBusiness))

            /**
             * Sets [Builder.isBusiness] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isBusiness] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isBusiness(isBusiness: JsonField<Boolean>) = apply { this.isBusiness = isBusiness }

            /** Stripe tax ID. */
            fun taxId(taxId: StripeTaxId?) = taxId(JsonField.ofNullable(taxId))

            /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
            fun taxId(taxId: Optional<StripeTaxId>) = taxId(taxId.getOrNull())

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [StripeTaxId] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    companyInfo,
                    invoiceEmail,
                    isBusiness,
                    taxId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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
            (companyInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (if (invoiceEmail.asKnown().isPresent) 1 else 0) +
                (if (isBusiness.asKnown().isPresent) 1 else 0) +
                (taxId.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
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
            "Body{companyInfo=$companyInfo, invoiceEmail=$invoiceEmail, isBusiness=$isBusiness, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessInfoBusinessInfoParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BusinessInfoBusinessInfoParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
