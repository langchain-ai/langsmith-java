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
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.orgs.PaymentPlanTier
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Information about an organization. */
class CurrentListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val config: JsonField<OrganizationConfig>,
    private val connectedToMetronome: JsonField<Boolean>,
    private val connectedToStripe: JsonField<Boolean>,
    private val hasCancelled: JsonField<Boolean>,
    private val isPersonal: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val currentPlan: JsonField<CustomerVisiblePlanInfo>,
    private val defaultSsoProvision: JsonField<Boolean>,
    private val displayName: JsonField<String>,
    private val endOfBillingPeriod: JsonField<OffsetDateTime>,
    private val marketplacePayoutsEnabled: JsonField<Boolean>,
    private val paymentMethod: JsonField<StripePaymentMethodInfo>,
    private val permissions: JsonField<List<String>>,
    private val reachedMaxWorkspaces: JsonField<Boolean>,
    private val tier: JsonField<PaymentPlanTier>,
    private val upcomingPlan: JsonField<CustomerVisiblePlanInfo>,
    private val wallet: JsonField<Wallet>,
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
        @JsonProperty("has_cancelled")
        @ExcludeMissing
        hasCancelled: JsonField<Boolean> = JsonMissing.of(),
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
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_of_billing_period")
        @ExcludeMissing
        endOfBillingPeriod: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("marketplace_payouts_enabled")
        @ExcludeMissing
        marketplacePayoutsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<StripePaymentMethodInfo> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("reached_max_workspaces")
        @ExcludeMissing
        reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<PaymentPlanTier> = JsonMissing.of(),
        @JsonProperty("upcoming_plan")
        @ExcludeMissing
        upcomingPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of(),
        @JsonProperty("wallet") @ExcludeMissing wallet: JsonField<Wallet> = JsonMissing.of(),
    ) : this(
        config,
        connectedToMetronome,
        connectedToStripe,
        hasCancelled,
        isPersonal,
        id,
        currentPlan,
        defaultSsoProvision,
        displayName,
        endOfBillingPeriod,
        marketplacePayoutsEnabled,
        paymentMethod,
        permissions,
        reachedMaxWorkspaces,
        tier,
        upcomingPlan,
        wallet,
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
    fun hasCancelled(): Boolean = hasCancelled.getRequired("has_cancelled")

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
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun endOfBillingPeriod(): Optional<OffsetDateTime> =
        endOfBillingPeriod.getOptional("end_of_billing_period")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun marketplacePayoutsEnabled(): Optional<Boolean> =
        marketplacePayoutsEnabled.getOptional("marketplace_payouts_enabled")

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
    fun permissions(): Optional<List<String>> = permissions.getOptional("permissions")

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
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun wallet(): Optional<Wallet> = wallet.getOptional("wallet")

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
     * Returns the raw JSON value of [hasCancelled].
     *
     * Unlike [hasCancelled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_cancelled")
    @ExcludeMissing
    fun _hasCancelled(): JsonField<Boolean> = hasCancelled

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
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

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
     * Returns the raw JSON value of [marketplacePayoutsEnabled].
     *
     * Unlike [marketplacePayoutsEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("marketplace_payouts_enabled")
    @ExcludeMissing
    fun _marketplacePayoutsEnabled(): JsonField<Boolean> = marketplacePayoutsEnabled

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<StripePaymentMethodInfo> = paymentMethod

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<List<String>> = permissions

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

    /**
     * Returns the raw JSON value of [wallet].
     *
     * Unlike [wallet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wallet") @ExcludeMissing fun _wallet(): JsonField<Wallet> = wallet

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
         * Returns a mutable builder for constructing an instance of [CurrentListResponse].
         *
         * The following fields are required:
         * ```java
         * .config()
         * .connectedToMetronome()
         * .connectedToStripe()
         * .hasCancelled()
         * .isPersonal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrentListResponse]. */
    class Builder internal constructor() {

        private var config: JsonField<OrganizationConfig>? = null
        private var connectedToMetronome: JsonField<Boolean>? = null
        private var connectedToStripe: JsonField<Boolean>? = null
        private var hasCancelled: JsonField<Boolean>? = null
        private var isPersonal: JsonField<Boolean>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var currentPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of()
        private var defaultSsoProvision: JsonField<Boolean> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var endOfBillingPeriod: JsonField<OffsetDateTime> = JsonMissing.of()
        private var marketplacePayoutsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var paymentMethod: JsonField<StripePaymentMethodInfo> = JsonMissing.of()
        private var permissions: JsonField<MutableList<String>>? = null
        private var reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of()
        private var tier: JsonField<PaymentPlanTier> = JsonMissing.of()
        private var upcomingPlan: JsonField<CustomerVisiblePlanInfo> = JsonMissing.of()
        private var wallet: JsonField<Wallet> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currentListResponse: CurrentListResponse) = apply {
            config = currentListResponse.config
            connectedToMetronome = currentListResponse.connectedToMetronome
            connectedToStripe = currentListResponse.connectedToStripe
            hasCancelled = currentListResponse.hasCancelled
            isPersonal = currentListResponse.isPersonal
            id = currentListResponse.id
            currentPlan = currentListResponse.currentPlan
            defaultSsoProvision = currentListResponse.defaultSsoProvision
            displayName = currentListResponse.displayName
            endOfBillingPeriod = currentListResponse.endOfBillingPeriod
            marketplacePayoutsEnabled = currentListResponse.marketplacePayoutsEnabled
            paymentMethod = currentListResponse.paymentMethod
            permissions = currentListResponse.permissions.map { it.toMutableList() }
            reachedMaxWorkspaces = currentListResponse.reachedMaxWorkspaces
            tier = currentListResponse.tier
            upcomingPlan = currentListResponse.upcomingPlan
            wallet = currentListResponse.wallet
            additionalProperties = currentListResponse.additionalProperties.toMutableMap()
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

        fun hasCancelled(hasCancelled: Boolean) = hasCancelled(JsonField.of(hasCancelled))

        /**
         * Sets [Builder.hasCancelled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasCancelled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasCancelled(hasCancelled: JsonField<Boolean>) = apply {
            this.hasCancelled = hasCancelled
        }

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

        fun displayName(displayName: String?) = displayName(JsonField.ofNullable(displayName))

        /** Alias for calling [Builder.displayName] with `displayName.orElse(null)`. */
        fun displayName(displayName: Optional<String>) = displayName(displayName.getOrNull())

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

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

        fun marketplacePayoutsEnabled(marketplacePayoutsEnabled: Boolean) =
            marketplacePayoutsEnabled(JsonField.of(marketplacePayoutsEnabled))

        /**
         * Sets [Builder.marketplacePayoutsEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketplacePayoutsEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun marketplacePayoutsEnabled(marketplacePayoutsEnabled: JsonField<Boolean>) = apply {
            this.marketplacePayoutsEnabled = marketplacePayoutsEnabled
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

        fun permissions(permissions: List<String>) = permissions(JsonField.of(permissions))

        /**
         * Sets [Builder.permissions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissions(permissions: JsonField<List<String>>) = apply {
            this.permissions = permissions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [permissions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermission(permission: String) = apply {
            permissions =
                (permissions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissions", it).add(permission)
                }
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

        fun wallet(wallet: Wallet?) = wallet(JsonField.ofNullable(wallet))

        /** Alias for calling [Builder.wallet] with `wallet.orElse(null)`. */
        fun wallet(wallet: Optional<Wallet>) = wallet(wallet.getOrNull())

        /**
         * Sets [Builder.wallet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.wallet] with a well-typed [Wallet] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun wallet(wallet: JsonField<Wallet>) = apply { this.wallet = wallet }

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
         * Returns an immutable instance of [CurrentListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .config()
         * .connectedToMetronome()
         * .connectedToStripe()
         * .hasCancelled()
         * .isPersonal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrentListResponse =
            CurrentListResponse(
                checkRequired("config", config),
                checkRequired("connectedToMetronome", connectedToMetronome),
                checkRequired("connectedToStripe", connectedToStripe),
                checkRequired("hasCancelled", hasCancelled),
                checkRequired("isPersonal", isPersonal),
                id,
                currentPlan,
                defaultSsoProvision,
                displayName,
                endOfBillingPeriod,
                marketplacePayoutsEnabled,
                paymentMethod,
                (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                reachedMaxWorkspaces,
                tier,
                upcomingPlan,
                wallet,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrentListResponse = apply {
        if (validated) {
            return@apply
        }

        config().validate()
        connectedToMetronome()
        connectedToStripe()
        hasCancelled()
        isPersonal()
        id()
        currentPlan().ifPresent { it.validate() }
        defaultSsoProvision()
        displayName()
        endOfBillingPeriod()
        marketplacePayoutsEnabled()
        paymentMethod().ifPresent { it.validate() }
        permissions()
        reachedMaxWorkspaces()
        tier().ifPresent { it.validate() }
        upcomingPlan().ifPresent { it.validate() }
        wallet().ifPresent { it.validate() }
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
            (if (hasCancelled.asKnown().isPresent) 1 else 0) +
            (if (isPersonal.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (currentPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (if (defaultSsoProvision.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (endOfBillingPeriod.asKnown().isPresent) 1 else 0) +
            (if (marketplacePayoutsEnabled.asKnown().isPresent) 1 else 0) +
            (paymentMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (permissions.asKnown().getOrNull()?.size ?: 0) +
            (if (reachedMaxWorkspaces.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (upcomingPlan.asKnown().getOrNull()?.validity() ?: 0) +
            (wallet.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrentListResponse &&
            config == other.config &&
            connectedToMetronome == other.connectedToMetronome &&
            connectedToStripe == other.connectedToStripe &&
            hasCancelled == other.hasCancelled &&
            isPersonal == other.isPersonal &&
            id == other.id &&
            currentPlan == other.currentPlan &&
            defaultSsoProvision == other.defaultSsoProvision &&
            displayName == other.displayName &&
            endOfBillingPeriod == other.endOfBillingPeriod &&
            marketplacePayoutsEnabled == other.marketplacePayoutsEnabled &&
            paymentMethod == other.paymentMethod &&
            permissions == other.permissions &&
            reachedMaxWorkspaces == other.reachedMaxWorkspaces &&
            tier == other.tier &&
            upcomingPlan == other.upcomingPlan &&
            wallet == other.wallet &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            config,
            connectedToMetronome,
            connectedToStripe,
            hasCancelled,
            isPersonal,
            id,
            currentPlan,
            defaultSsoProvision,
            displayName,
            endOfBillingPeriod,
            marketplacePayoutsEnabled,
            paymentMethod,
            permissions,
            reachedMaxWorkspaces,
            tier,
            upcomingPlan,
            wallet,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrentListResponse{config=$config, connectedToMetronome=$connectedToMetronome, connectedToStripe=$connectedToStripe, hasCancelled=$hasCancelled, isPersonal=$isPersonal, id=$id, currentPlan=$currentPlan, defaultSsoProvision=$defaultSsoProvision, displayName=$displayName, endOfBillingPeriod=$endOfBillingPeriod, marketplacePayoutsEnabled=$marketplacePayoutsEnabled, paymentMethod=$paymentMethod, permissions=$permissions, reachedMaxWorkspaces=$reachedMaxWorkspaces, tier=$tier, upcomingPlan=$upcomingPlan, wallet=$wallet, additionalProperties=$additionalProperties}"
}
