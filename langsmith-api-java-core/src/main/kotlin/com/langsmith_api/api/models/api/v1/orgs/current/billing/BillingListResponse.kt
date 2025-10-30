// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.billing

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
import com.langsmith_api.api.models.api.v1.orgs.PaymentPlanTier
import com.langsmith_api.api.models.api.v1.orgs.current.CustomerVisiblePlanInfo
import com.langsmith_api.api.models.api.v1.orgs.current.OrganizationConfig
import com.langsmith_api.api.models.api.v1.orgs.current.StripePaymentMethodInfo
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Information about an organization's billing configuration. */
class BillingListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val config: JsonField<OrganizationConfig>,
    private val connectedToMetronome: JsonField<Boolean>,
    private val connectedToStripe: JsonField<Boolean>,
    private val displayName: JsonField<String>,
    private val isPersonal: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val currentPlan: JsonField<CustomerVisiblePlanInfo>,
    private val defaultSsoProvision: JsonField<Boolean>,
    private val disabled: JsonField<Boolean>,
    private val endOfBillingPeriod: JsonField<OffsetDateTime>,
    private val paymentMethod: JsonField<StripePaymentMethodInfo>,
    private val reachedMaxWorkspaces: JsonField<Boolean>,
    private val tier: JsonField<PaymentPlanTier>,
    private val upcomingPlan: JsonField<CustomerVisiblePlanInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("config")
        @ExcludeMissing
        config: JsonField<OrganizationConfig> = JsonMissing.of(),
        @JsonProperty("connected_to_metronome")
        @ExcludeMissing
        connectedToMetronome: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("connected_to_stripe")
        @ExcludeMissing
        connectedToStripe: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_personal")
        @ExcludeMissing
        isPersonal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("current_plan")
        @ExcludeMissing
        currentPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of(),
        @JsonProperty("default_sso_provision")
        @ExcludeMissing
        defaultSsoProvision: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("disabled") @ExcludeMissing disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("end_of_billing_period")
        @ExcludeMissing
        endOfBillingPeriod: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<StripePaymentMethodInfo> = JsonMissing.of(),
        @JsonProperty("reached_max_workspaces")
        @ExcludeMissing
        reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<PaymentPlanTier> = JsonMissing.of(),
        @JsonProperty("upcoming_plan")
        @ExcludeMissing
        upcomingPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of(),
    ) : this(
        config,
        connectedToMetronome,
        connectedToStripe,
        displayName,
        isPersonal,
        id,
        currentPlan,
        defaultSsoProvision,
        disabled,
        endOfBillingPeriod,
        paymentMethod,
        reachedMaxWorkspaces,
        tier,
        upcomingPlan,
        mutableMapOf(),
    )

    /**
     * Organization level configuration. May include any field that exists in tenant config and
     * additional fields.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): OrganizationConfig = config.getRequired("config")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectedToMetronome(): Boolean = connectedToMetronome.getRequired("connected_to_metronome")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun connectedToStripe(): Boolean = connectedToStripe.getRequired("connected_to_stripe")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPersonal(): Boolean = isPersonal.getRequired("is_personal")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * Customer visible plan information.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currentPlan(): Optional<CustomerVisiblePlanInfo> = currentPlan.getOptional("current_plan")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun defaultSsoProvision(): Optional<Boolean> =
        defaultSsoProvision.getOptional("default_sso_provision")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disabled(): Optional<Boolean> = disabled.getOptional("disabled")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endOfBillingPeriod(): Optional<OffsetDateTime> =
        endOfBillingPeriod.getOptional("end_of_billing_period")

    /**
     * Stripe customer billing info.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<StripePaymentMethodInfo> =
        paymentMethod.getOptional("payment_method")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reachedMaxWorkspaces(): Optional<Boolean> =
        reachedMaxWorkspaces.getOptional("reached_max_workspaces")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tier(): Optional<PaymentPlanTier> = tier.getOptional("tier")

    /**
     * Customer visible plan information.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun upcomingPlan(): Optional<CustomerVisiblePlanInfo> =
        upcomingPlan.getOptional("upcoming_plan")

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<OrganizationConfig> = config

    /**
     * Returns the raw JSON value of [connectedToMetronome].
     *
     * Unlike [connectedToMetronome], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connected_to_metronome")
    @ExcludeMissing
    fun _connectedToMetronome(): JsonField<Boolean> = connectedToMetronome

    /**
     * Returns the raw JSON value of [connectedToStripe].
     *
     * Unlike [connectedToStripe], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("connected_to_stripe")
    @ExcludeMissing
    fun _connectedToStripe(): JsonField<Boolean> = connectedToStripe

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [isPersonal].
     *
     * Unlike [isPersonal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_personal") @ExcludeMissing fun _isPersonal(): JsonField<Boolean> = isPersonal

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [currentPlan].
     *
     * Unlike [currentPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_plan")
    @ExcludeMissing
    fun _currentPlan(): JsonField<CustomerVisiblePlanInfo> = currentPlan

    /**
     * Returns the raw JSON value of [defaultSsoProvision].
     *
     * Unlike [defaultSsoProvision], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_sso_provision")
    @ExcludeMissing
    fun _defaultSsoProvision(): JsonField<Boolean> = defaultSsoProvision

    /**
     * Returns the raw JSON value of [disabled].
     *
     * Unlike [disabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disabled") @ExcludeMissing fun _disabled(): JsonField<Boolean> = disabled

    /**
     * Returns the raw JSON value of [endOfBillingPeriod].
     *
     * Unlike [endOfBillingPeriod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("end_of_billing_period")
    @ExcludeMissing
    fun _endOfBillingPeriod(): JsonField<OffsetDateTime> = endOfBillingPeriod

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<StripePaymentMethodInfo> = paymentMethod

    /**
     * Returns the raw JSON value of [reachedMaxWorkspaces].
     *
     * Unlike [reachedMaxWorkspaces], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reached_max_workspaces")
    @ExcludeMissing
    fun _reachedMaxWorkspaces(): JsonField<Boolean> = reachedMaxWorkspaces

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<PaymentPlanTier> = tier

    /**
     * Returns the raw JSON value of [upcomingPlan].
     *
     * Unlike [upcomingPlan], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upcoming_plan")
    @ExcludeMissing
    fun _upcomingPlan(): JsonField<CustomerVisiblePlanInfo> = upcomingPlan

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
         * Returns a mutable builder for constructing an instance of [BillingListResponse].
         *
         * The following fields are required:
         * ```java
         * .config()
         * .connectedToMetronome()
         * .connectedToStripe()
         * .displayName()
         * .isPersonal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillingListResponse]. */
    class Builder internal constructor() {

        private var config: JsonField<OrganizationConfig>? = null
        private var connectedToMetronome: JsonField<Boolean>? = null
        private var connectedToStripe: JsonField<Boolean>? = null
        private var displayName: JsonField<String>? = null
        private var isPersonal: JsonField<Boolean>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var currentPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of()
        private var defaultSsoProvision: JsonField<Boolean> = JsonMissing.of()
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var endOfBillingPeriod: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paymentMethod: JsonField<StripePaymentMethodInfo> = JsonMissing.of()
        private var reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of()
        private var tier: JsonField<PaymentPlanTier> = JsonMissing.of()
        private var upcomingPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billingListResponse: BillingListResponse) = apply {
            config = billingListResponse.config
            connectedToMetronome = billingListResponse.connectedToMetronome
            connectedToStripe = billingListResponse.connectedToStripe
            displayName = billingListResponse.displayName
            isPersonal = billingListResponse.isPersonal
            id = billingListResponse.id
            currentPlan = billingListResponse.currentPlan
            defaultSsoProvision = billingListResponse.defaultSsoProvision
            disabled = billingListResponse.disabled
            endOfBillingPeriod = billingListResponse.endOfBillingPeriod
            paymentMethod = billingListResponse.paymentMethod
            reachedMaxWorkspaces = billingListResponse.reachedMaxWorkspaces
            tier = billingListResponse.tier
            upcomingPlan = billingListResponse.upcomingPlan
            additionalProperties = billingListResponse.additionalProperties.toMutableMap()
        }

        /**
         * Organization level configuration. May include any field that exists in tenant config and
         * additional fields.
         */
        fun config(config: OrganizationConfig) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [OrganizationConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun config(config: JsonField<OrganizationConfig>) = apply { this.config = config }

        fun connectedToMetronome(connectedToMetronome: Boolean) =
            connectedToMetronome(JsonField.of(connectedToMetronome))

        /**
         * Sets [Builder.connectedToMetronome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectedToMetronome] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectedToMetronome(connectedToMetronome: JsonField<Boolean>) = apply {
            this.connectedToMetronome = connectedToMetronome
        }

        fun connectedToStripe(connectedToStripe: Boolean) =
            connectedToStripe(JsonField.of(connectedToStripe))

        /**
         * Sets [Builder.connectedToStripe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.connectedToStripe] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun connectedToStripe(connectedToStripe: JsonField<Boolean>) = apply {
            this.connectedToStripe = connectedToStripe
        }

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun isPersonal(isPersonal: Boolean) = isPersonal(JsonField.of(isPersonal))

        /**
         * Sets [Builder.isPersonal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPersonal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPersonal(isPersonal: JsonField<Boolean>) = apply { this.isPersonal = isPersonal }

        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Customer visible plan information. */
        fun currentPlan(currentPlan: CustomerVisiblePlanInfo?) =
            currentPlan(JsonField.ofNullable(currentPlan))

        /** Alias for calling [Builder.currentPlan] with `currentPlan.orElse(null)`. */
        fun currentPlan(currentPlan: Optional<CustomerVisiblePlanInfo>) =
            currentPlan(currentPlan.getOrNull())

        /**
         * Sets [Builder.currentPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentPlan] with a well-typed [CustomerVisiblePlanInfo]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun currentPlan(currentPlan: JsonField<CustomerVisiblePlanInfo>) = apply {
            this.currentPlan = currentPlan
        }

        fun defaultSsoProvision(defaultSsoProvision: Boolean) =
            defaultSsoProvision(JsonField.of(defaultSsoProvision))

        /**
         * Sets [Builder.defaultSsoProvision] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultSsoProvision] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultSsoProvision(defaultSsoProvision: JsonField<Boolean>) = apply {
            this.defaultSsoProvision = defaultSsoProvision
        }

        fun disabled(disabled: Boolean) = disabled(JsonField.of(disabled))

        /**
         * Sets [Builder.disabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

        fun endOfBillingPeriod(endOfBillingPeriod: OffsetDateTime?) =
            endOfBillingPeriod(JsonField.ofNullable(endOfBillingPeriod))

        /**
         * Alias for calling [Builder.endOfBillingPeriod] with `endOfBillingPeriod.orElse(null)`.
         */
        fun endOfBillingPeriod(endOfBillingPeriod: Optional<OffsetDateTime>) =
            endOfBillingPeriod(endOfBillingPeriod.getOrNull())

        /**
         * Sets [Builder.endOfBillingPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endOfBillingPeriod] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun endOfBillingPeriod(endOfBillingPeriod: JsonField<OffsetDateTime>) = apply {
            this.endOfBillingPeriod = endOfBillingPeriod
        }

        /** Stripe customer billing info. */
        fun paymentMethod(paymentMethod: StripePaymentMethodInfo?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /** Alias for calling [Builder.paymentMethod] with `paymentMethod.orElse(null)`. */
        fun paymentMethod(paymentMethod: Optional<StripePaymentMethodInfo>) =
            paymentMethod(paymentMethod.getOrNull())

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed
         * [StripePaymentMethodInfo] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun paymentMethod(paymentMethod: JsonField<StripePaymentMethodInfo>) = apply {
            this.paymentMethod = paymentMethod
        }

        fun reachedMaxWorkspaces(reachedMaxWorkspaces: Boolean) =
            reachedMaxWorkspaces(JsonField.of(reachedMaxWorkspaces))

        /**
         * Sets [Builder.reachedMaxWorkspaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reachedMaxWorkspaces] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reachedMaxWorkspaces(reachedMaxWorkspaces: JsonField<Boolean>) = apply {
            this.reachedMaxWorkspaces = reachedMaxWorkspaces
        }

        fun tier(tier: PaymentPlanTier?) = tier(JsonField.ofNullable(tier))

        /** Alias for calling [Builder.tier] with `tier.orElse(null)`. */
        fun tier(tier: Optional<PaymentPlanTier>) = tier(tier.getOrNull())

        /**
         * Sets [Builder.tier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tier] with a well-typed [PaymentPlanTier] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tier(tier: JsonField<PaymentPlanTier>) = apply { this.tier = tier }

        /** Customer visible plan information. */
        fun upcomingPlan(upcomingPlan: CustomerVisiblePlanInfo?) =
            upcomingPlan(JsonField.ofNullable(upcomingPlan))

        /** Alias for calling [Builder.upcomingPlan] with `upcomingPlan.orElse(null)`. */
        fun upcomingPlan(upcomingPlan: Optional<CustomerVisiblePlanInfo>) =
            upcomingPlan(upcomingPlan.getOrNull())

        /**
         * Sets [Builder.upcomingPlan] to an arbitrary JSON value.
         *
         * You should usually call [Builder.upcomingPlan] with a well-typed
         * [CustomerVisiblePlanInfo] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun upcomingPlan(upcomingPlan: JsonField<CustomerVisiblePlanInfo>) = apply {
            this.upcomingPlan = upcomingPlan
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
         * Returns an immutable instance of [BillingListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .config()
         * .connectedToMetronome()
         * .connectedToStripe()
         * .displayName()
         * .isPersonal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingListResponse =
            BillingListResponse(
                checkRequired("config", config),
                checkRequired("connectedToMetronome", connectedToMetronome),
                checkRequired("connectedToStripe", connectedToStripe),
                checkRequired("displayName", displayName),
                checkRequired("isPersonal", isPersonal),
                id,
                currentPlan,
                defaultSsoProvision,
                disabled,
                endOfBillingPeriod,
                paymentMethod,
                reachedMaxWorkspaces,
                tier,
                upcomingPlan,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BillingListResponse = apply {
        if (validated) {
            return@apply
        }

        config().validate()
        connectedToMetronome()
        connectedToStripe()
        displayName()
        isPersonal()
        id()
        currentPlan().ifPresent { it.validate() }
        defaultSsoProvision()
        disabled()
        endOfBillingPeriod()
        paymentMethod().ifPresent { it.validate() }
        reachedMaxWorkspaces()
        tier().ifPresent { it.validate() }
        upcomingPlan().ifPresent { it.validate() }
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
        (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (connectedToMetronome.asKnown().isPresent) 1 else 0) +
            (if (connectedToStripe.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (isPersonal.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (currentPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultSsoProvision.asKnown().isPresent) 1 else 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (if (endOfBillingPeriod.asKnown().isPresent) 1 else 0) +
            (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reachedMaxWorkspaces.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (upcomingPlan.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingListResponse &&
            config == other.config &&
            connectedToMetronome == other.connectedToMetronome &&
            connectedToStripe == other.connectedToStripe &&
            displayName == other.displayName &&
            isPersonal == other.isPersonal &&
            id == other.id &&
            currentPlan == other.currentPlan &&
            defaultSsoProvision == other.defaultSsoProvision &&
            disabled == other.disabled &&
            endOfBillingPeriod == other.endOfBillingPeriod &&
            paymentMethod == other.paymentMethod &&
            reachedMaxWorkspaces == other.reachedMaxWorkspaces &&
            tier == other.tier &&
            upcomingPlan == other.upcomingPlan &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            config,
            connectedToMetronome,
            connectedToStripe,
            displayName,
            isPersonal,
            id,
            currentPlan,
            defaultSsoProvision,
            disabled,
            endOfBillingPeriod,
            paymentMethod,
            reachedMaxWorkspaces,
            tier,
            upcomingPlan,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingListResponse{config=$config, connectedToMetronome=$connectedToMetronome, connectedToStripe=$connectedToStripe, displayName=$displayName, isPersonal=$isPersonal, id=$id, currentPlan=$currentPlan, defaultSsoProvision=$defaultSsoProvision, disabled=$disabled, endOfBillingPeriod=$endOfBillingPeriod, paymentMethod=$paymentMethod, reachedMaxWorkspaces=$reachedMaxWorkspaces, tier=$tier, upcomingPlan=$upcomingPlan, additionalProperties=$additionalProperties}"
}
