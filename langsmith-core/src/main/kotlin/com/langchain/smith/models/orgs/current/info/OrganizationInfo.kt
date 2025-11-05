// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.info

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.orgs.PaymentPlanTier
import com.langchain.smith.models.orgs.current.OrganizationConfig
import com.langchain.smith.models.orgs.current.Wallet
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Information about an organization. */
class OrganizationInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val config: JsonField<OrganizationConfig>,
    private val isPersonal: JsonField<Boolean>,
    private val id: JsonField<String>,
    private val defaultSsoProvision: JsonField<Boolean>,
    private val disabled: JsonField<Boolean>,
    private val displayName: JsonField<String>,
    private val jitProvisioningEnabled: JsonField<Boolean>,
    private val marketplacePayoutsEnabled: JsonField<Boolean>,
    private val patCreationDisabled: JsonField<Boolean>,
    private val permissions: JsonField<List<String>>,
    private val publicSharingDisabled: JsonField<Boolean>,
    private val reachedMaxWorkspaces: JsonField<Boolean>,
    private val ssoLoginSlug: JsonField<String>,
    private val ssoOnly: JsonField<Boolean>,
    private val tier: JsonField<PaymentPlanTier>,
    private val wallet: JsonField<Wallet>,
    private val workspaceAdminCanInviteToOrg: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("config")
        @ExcludeMissing
        config: JsonField<OrganizationConfig> = JsonMissing.of(),
        @JsonProperty("is_personal")
        @ExcludeMissing
        isPersonal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_sso_provision")
        @ExcludeMissing
        defaultSsoProvision: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("disabled") @ExcludeMissing disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jit_provisioning_enabled")
        @ExcludeMissing
        jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("marketplace_payouts_enabled")
        @ExcludeMissing
        marketplacePayoutsEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("pat_creation_disabled")
        @ExcludeMissing
        patCreationDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("permissions")
        @ExcludeMissing
        permissions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("public_sharing_disabled")
        @ExcludeMissing
        publicSharingDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reached_max_workspaces")
        @ExcludeMissing
        reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sso_login_slug")
        @ExcludeMissing
        ssoLoginSlug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sso_only") @ExcludeMissing ssoOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<PaymentPlanTier> = JsonMissing.of(),
        @JsonProperty("wallet") @ExcludeMissing wallet: JsonField<Wallet> = JsonMissing.of(),
        @JsonProperty("workspace_admin_can_invite_to_org")
        @ExcludeMissing
        workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        config,
        isPersonal,
        id,
        defaultSsoProvision,
        disabled,
        displayName,
        jitProvisioningEnabled,
        marketplacePayoutsEnabled,
        patCreationDisabled,
        permissions,
        publicSharingDisabled,
        reachedMaxWorkspaces,
        ssoLoginSlug,
        ssoOnly,
        tier,
        wallet,
        workspaceAdminCanInviteToOrg,
        mutableMapOf(),
    )

    /**
     * Organization level configuration. May include any field that exists in tenant config and
     * additional fields.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): OrganizationConfig = config.getRequired("config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPersonal(): Boolean = isPersonal.getRequired("is_personal")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultSsoProvision(): Optional<Boolean> =
        defaultSsoProvision.getOptional("default_sso_provision")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun disabled(): Optional<Boolean> = disabled.getOptional("disabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jitProvisioningEnabled(): Optional<Boolean> =
        jitProvisioningEnabled.getOptional("jit_provisioning_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketplacePayoutsEnabled(): Optional<Boolean> =
        marketplacePayoutsEnabled.getOptional("marketplace_payouts_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patCreationDisabled(): Optional<Boolean> =
        patCreationDisabled.getOptional("pat_creation_disabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissions(): Optional<List<String>> = permissions.getOptional("permissions")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicSharingDisabled(): Optional<Boolean> =
        publicSharingDisabled.getOptional("public_sharing_disabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reachedMaxWorkspaces(): Optional<Boolean> =
        reachedMaxWorkspaces.getOptional("reached_max_workspaces")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ssoLoginSlug(): Optional<String> = ssoLoginSlug.getOptional("sso_login_slug")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ssoOnly(): Optional<Boolean> = ssoOnly.getOptional("sso_only")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tier(): Optional<PaymentPlanTier> = tier.getOptional("tier")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun wallet(): Optional<Wallet> = wallet.getOptional("wallet")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceAdminCanInviteToOrg(): Optional<Boolean> =
        workspaceAdminCanInviteToOrg.getOptional("workspace_admin_can_invite_to_org")

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<OrganizationConfig> = config

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
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [jitProvisioningEnabled].
     *
     * Unlike [jitProvisioningEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("jit_provisioning_enabled")
    @ExcludeMissing
    fun _jitProvisioningEnabled(): JsonField<Boolean> = jitProvisioningEnabled

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
     * Returns the raw JSON value of [patCreationDisabled].
     *
     * Unlike [patCreationDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pat_creation_disabled")
    @ExcludeMissing
    fun _patCreationDisabled(): JsonField<Boolean> = patCreationDisabled

    /**
     * Returns the raw JSON value of [permissions].
     *
     * Unlike [permissions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("permissions")
    @ExcludeMissing
    fun _permissions(): JsonField<List<String>> = permissions

    /**
     * Returns the raw JSON value of [publicSharingDisabled].
     *
     * Unlike [publicSharingDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("public_sharing_disabled")
    @ExcludeMissing
    fun _publicSharingDisabled(): JsonField<Boolean> = publicSharingDisabled

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
     * Returns the raw JSON value of [ssoLoginSlug].
     *
     * Unlike [ssoLoginSlug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sso_login_slug")
    @ExcludeMissing
    fun _ssoLoginSlug(): JsonField<String> = ssoLoginSlug

    /**
     * Returns the raw JSON value of [ssoOnly].
     *
     * Unlike [ssoOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sso_only") @ExcludeMissing fun _ssoOnly(): JsonField<Boolean> = ssoOnly

    /**
     * Returns the raw JSON value of [tier].
     *
     * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<PaymentPlanTier> = tier

    /**
     * Returns the raw JSON value of [wallet].
     *
     * Unlike [wallet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("wallet") @ExcludeMissing fun _wallet(): JsonField<Wallet> = wallet

    /**
     * Returns the raw JSON value of [workspaceAdminCanInviteToOrg].
     *
     * Unlike [workspaceAdminCanInviteToOrg], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("workspace_admin_can_invite_to_org")
    @ExcludeMissing
    fun _workspaceAdminCanInviteToOrg(): JsonField<Boolean> = workspaceAdminCanInviteToOrg

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
         * Returns a mutable builder for constructing an instance of [OrganizationInfo].
         *
         * The following fields are required:
         * ```java
         * .config()
         * .isPersonal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationInfo]. */
    class Builder internal constructor() {

        private var config: JsonField<OrganizationConfig>? = null
        private var isPersonal: JsonField<Boolean>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var defaultSsoProvision: JsonField<Boolean> = JsonMissing.of()
        private var disabled: JsonField<Boolean> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of()
        private var marketplacePayoutsEnabled: JsonField<Boolean> = JsonMissing.of()
        private var patCreationDisabled: JsonField<Boolean> = JsonMissing.of()
        private var permissions: JsonField<MutableList<String>>? = null
        private var publicSharingDisabled: JsonField<Boolean> = JsonMissing.of()
        private var reachedMaxWorkspaces: JsonField<Boolean> = JsonMissing.of()
        private var ssoLoginSlug: JsonField<String> = JsonMissing.of()
        private var ssoOnly: JsonField<Boolean> = JsonMissing.of()
        private var tier: JsonField<PaymentPlanTier> = JsonMissing.of()
        private var wallet: JsonField<Wallet> = JsonMissing.of()
        private var workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationInfo: OrganizationInfo) = apply {
            config = organizationInfo.config
            isPersonal = organizationInfo.isPersonal
            id = organizationInfo.id
            defaultSsoProvision = organizationInfo.defaultSsoProvision
            disabled = organizationInfo.disabled
            displayName = organizationInfo.displayName
            jitProvisioningEnabled = organizationInfo.jitProvisioningEnabled
            marketplacePayoutsEnabled = organizationInfo.marketplacePayoutsEnabled
            patCreationDisabled = organizationInfo.patCreationDisabled
            permissions = organizationInfo.permissions.map { it.toMutableList() }
            publicSharingDisabled = organizationInfo.publicSharingDisabled
            reachedMaxWorkspaces = organizationInfo.reachedMaxWorkspaces
            ssoLoginSlug = organizationInfo.ssoLoginSlug
            ssoOnly = organizationInfo.ssoOnly
            tier = organizationInfo.tier
            wallet = organizationInfo.wallet
            workspaceAdminCanInviteToOrg = organizationInfo.workspaceAdminCanInviteToOrg
            additionalProperties = organizationInfo.additionalProperties.toMutableMap()
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

        fun jitProvisioningEnabled(jitProvisioningEnabled: Boolean) =
            jitProvisioningEnabled(JsonField.of(jitProvisioningEnabled))

        /**
         * Sets [Builder.jitProvisioningEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jitProvisioningEnabled] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun jitProvisioningEnabled(jitProvisioningEnabled: JsonField<Boolean>) = apply {
            this.jitProvisioningEnabled = jitProvisioningEnabled
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

        fun patCreationDisabled(patCreationDisabled: Boolean) =
            patCreationDisabled(JsonField.of(patCreationDisabled))

        /**
         * Sets [Builder.patCreationDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patCreationDisabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patCreationDisabled(patCreationDisabled: JsonField<Boolean>) = apply {
            this.patCreationDisabled = patCreationDisabled
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

        fun publicSharingDisabled(publicSharingDisabled: Boolean) =
            publicSharingDisabled(JsonField.of(publicSharingDisabled))

        /**
         * Sets [Builder.publicSharingDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicSharingDisabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publicSharingDisabled(publicSharingDisabled: JsonField<Boolean>) = apply {
            this.publicSharingDisabled = publicSharingDisabled
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

        fun ssoLoginSlug(ssoLoginSlug: String?) = ssoLoginSlug(JsonField.ofNullable(ssoLoginSlug))

        /** Alias for calling [Builder.ssoLoginSlug] with `ssoLoginSlug.orElse(null)`. */
        fun ssoLoginSlug(ssoLoginSlug: Optional<String>) = ssoLoginSlug(ssoLoginSlug.getOrNull())

        /**
         * Sets [Builder.ssoLoginSlug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssoLoginSlug] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ssoLoginSlug(ssoLoginSlug: JsonField<String>) = apply {
            this.ssoLoginSlug = ssoLoginSlug
        }

        fun ssoOnly(ssoOnly: Boolean) = ssoOnly(JsonField.of(ssoOnly))

        /**
         * Sets [Builder.ssoOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ssoOnly] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ssoOnly(ssoOnly: JsonField<Boolean>) = apply { this.ssoOnly = ssoOnly }

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

        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: Boolean) =
            workspaceAdminCanInviteToOrg(JsonField.of(workspaceAdminCanInviteToOrg))

        /**
         * Sets [Builder.workspaceAdminCanInviteToOrg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceAdminCanInviteToOrg] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun workspaceAdminCanInviteToOrg(workspaceAdminCanInviteToOrg: JsonField<Boolean>) = apply {
            this.workspaceAdminCanInviteToOrg = workspaceAdminCanInviteToOrg
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
         * Returns an immutable instance of [OrganizationInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .config()
         * .isPersonal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationInfo =
            OrganizationInfo(
                checkRequired("config", config),
                checkRequired("isPersonal", isPersonal),
                id,
                defaultSsoProvision,
                disabled,
                displayName,
                jitProvisioningEnabled,
                marketplacePayoutsEnabled,
                patCreationDisabled,
                (permissions ?: JsonMissing.of()).map { it.toImmutable() },
                publicSharingDisabled,
                reachedMaxWorkspaces,
                ssoLoginSlug,
                ssoOnly,
                tier,
                wallet,
                workspaceAdminCanInviteToOrg,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationInfo = apply {
        if (validated) {
            return@apply
        }

        config().validate()
        isPersonal()
        id()
        defaultSsoProvision()
        disabled()
        displayName()
        jitProvisioningEnabled()
        marketplacePayoutsEnabled()
        patCreationDisabled()
        permissions()
        publicSharingDisabled()
        reachedMaxWorkspaces()
        ssoLoginSlug()
        ssoOnly()
        tier().ifPresent { it.validate() }
        wallet().ifPresent { it.validate() }
        workspaceAdminCanInviteToOrg()
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
        (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isPersonal.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (defaultSsoProvision.asKnown().isPresent) 1 else 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (jitProvisioningEnabled.asKnown().isPresent) 1 else 0) +
            (if (marketplacePayoutsEnabled.asKnown().isPresent) 1 else 0) +
            (if (patCreationDisabled.asKnown().isPresent) 1 else 0) +
            (permissions.asKnown().getOrNull()?.size ?: 0) +
            (if (publicSharingDisabled.asKnown().isPresent) 1 else 0) +
            (if (reachedMaxWorkspaces.asKnown().isPresent) 1 else 0) +
            (if (ssoLoginSlug.asKnown().isPresent) 1 else 0) +
            (if (ssoOnly.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (wallet.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceAdminCanInviteToOrg.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationInfo &&
            config == other.config &&
            isPersonal == other.isPersonal &&
            id == other.id &&
            defaultSsoProvision == other.defaultSsoProvision &&
            disabled == other.disabled &&
            displayName == other.displayName &&
            jitProvisioningEnabled == other.jitProvisioningEnabled &&
            marketplacePayoutsEnabled == other.marketplacePayoutsEnabled &&
            patCreationDisabled == other.patCreationDisabled &&
            permissions == other.permissions &&
            publicSharingDisabled == other.publicSharingDisabled &&
            reachedMaxWorkspaces == other.reachedMaxWorkspaces &&
            ssoLoginSlug == other.ssoLoginSlug &&
            ssoOnly == other.ssoOnly &&
            tier == other.tier &&
            wallet == other.wallet &&
            workspaceAdminCanInviteToOrg == other.workspaceAdminCanInviteToOrg &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            config,
            isPersonal,
            id,
            defaultSsoProvision,
            disabled,
            displayName,
            jitProvisioningEnabled,
            marketplacePayoutsEnabled,
            patCreationDisabled,
            permissions,
            publicSharingDisabled,
            reachedMaxWorkspaces,
            ssoLoginSlug,
            ssoOnly,
            tier,
            wallet,
            workspaceAdminCanInviteToOrg,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationInfo{config=$config, isPersonal=$isPersonal, id=$id, defaultSsoProvision=$defaultSsoProvision, disabled=$disabled, displayName=$displayName, jitProvisioningEnabled=$jitProvisioningEnabled, marketplacePayoutsEnabled=$marketplacePayoutsEnabled, patCreationDisabled=$patCreationDisabled, permissions=$permissions, publicSharingDisabled=$publicSharingDisabled, reachedMaxWorkspaces=$reachedMaxWorkspaces, ssoLoginSlug=$ssoLoginSlug, ssoOnly=$ssoOnly, tier=$tier, wallet=$wallet, workspaceAdminCanInviteToOrg=$workspaceAdminCanInviteToOrg, additionalProperties=$additionalProperties}"
}
