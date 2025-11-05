// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for an organization in postgres for list views. */
class OrganizationPgSchemaSlim
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val disabled: JsonField<Boolean>,
    private val displayName: JsonField<String>,
    private val isPersonal: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdByLsUserId: JsonField<String>,
    private val createdByUserId: JsonField<String>,
    private val defaultSsoProvision: JsonField<Boolean>,
    private val jitProvisioningEnabled: JsonField<Boolean>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val patCreationDisabled: JsonField<Boolean>,
    private val publicSharingDisabled: JsonField<Boolean>,
    private val ssoLoginSlug: JsonField<String>,
    private val ssoOnly: JsonField<Boolean>,
    private val tier: JsonField<PaymentPlanTier>,
    private val workspaceAdminCanInviteToOrg: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("disabled") @ExcludeMissing disabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_personal")
        @ExcludeMissing
        isPersonal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by_ls_user_id")
        @ExcludeMissing
        createdByLsUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_by_user_id")
        @ExcludeMissing
        createdByUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("default_sso_provision")
        @ExcludeMissing
        defaultSsoProvision: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("jit_provisioning_enabled")
        @ExcludeMissing
        jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("pat_creation_disabled")
        @ExcludeMissing
        patCreationDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("public_sharing_disabled")
        @ExcludeMissing
        publicSharingDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("sso_login_slug")
        @ExcludeMissing
        ssoLoginSlug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sso_only") @ExcludeMissing ssoOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing tier: JsonField<PaymentPlanTier> = JsonMissing.of(),
        @JsonProperty("workspace_admin_can_invite_to_org")
        @ExcludeMissing
        workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        disabled,
        displayName,
        isPersonal,
        createdAt,
        createdByLsUserId,
        createdByUserId,
        defaultSsoProvision,
        jitProvisioningEnabled,
        modifiedAt,
        patCreationDisabled,
        publicSharingDisabled,
        ssoLoginSlug,
        ssoOnly,
        tier,
        workspaceAdminCanInviteToOrg,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disabled(): Boolean = disabled.getRequired("disabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPersonal(): Boolean = isPersonal.getRequired("is_personal")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByLsUserId(): Optional<String> =
        createdByLsUserId.getOptional("created_by_ls_user_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdByUserId(): Optional<String> = createdByUserId.getOptional("created_by_user_id")

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
    fun jitProvisioningEnabled(): Optional<Boolean> =
        jitProvisioningEnabled.getOptional("jit_provisioning_enabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

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
    fun publicSharingDisabled(): Optional<Boolean> =
        publicSharingDisabled.getOptional("public_sharing_disabled")

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
    fun workspaceAdminCanInviteToOrg(): Optional<Boolean> =
        workspaceAdminCanInviteToOrg.getOptional("workspace_admin_can_invite_to_org")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
     * Returns the raw JSON value of [isPersonal].
     *
     * Unlike [isPersonal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_personal") @ExcludeMissing fun _isPersonal(): JsonField<Boolean> = isPersonal

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdByLsUserId].
     *
     * Unlike [createdByLsUserId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("created_by_ls_user_id")
    @ExcludeMissing
    fun _createdByLsUserId(): JsonField<String> = createdByLsUserId

    /**
     * Returns the raw JSON value of [createdByUserId].
     *
     * Unlike [createdByUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by_user_id")
    @ExcludeMissing
    fun _createdByUserId(): JsonField<String> = createdByUserId

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
     * Returns the raw JSON value of [jitProvisioningEnabled].
     *
     * Unlike [jitProvisioningEnabled], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("jit_provisioning_enabled")
    @ExcludeMissing
    fun _jitProvisioningEnabled(): JsonField<Boolean> = jitProvisioningEnabled

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

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
     * Returns the raw JSON value of [publicSharingDisabled].
     *
     * Unlike [publicSharingDisabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("public_sharing_disabled")
    @ExcludeMissing
    fun _publicSharingDisabled(): JsonField<Boolean> = publicSharingDisabled

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
         * Returns a mutable builder for constructing an instance of [OrganizationPgSchemaSlim].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .disabled()
         * .displayName()
         * .isPersonal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrganizationPgSchemaSlim]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var disabled: JsonField<Boolean>? = null
        private var displayName: JsonField<String>? = null
        private var isPersonal: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdByLsUserId: JsonField<String> = JsonMissing.of()
        private var createdByUserId: JsonField<String> = JsonMissing.of()
        private var defaultSsoProvision: JsonField<Boolean> = JsonMissing.of()
        private var jitProvisioningEnabled: JsonField<Boolean> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var patCreationDisabled: JsonField<Boolean> = JsonMissing.of()
        private var publicSharingDisabled: JsonField<Boolean> = JsonMissing.of()
        private var ssoLoginSlug: JsonField<String> = JsonMissing.of()
        private var ssoOnly: JsonField<Boolean> = JsonMissing.of()
        private var tier: JsonField<PaymentPlanTier> = JsonMissing.of()
        private var workspaceAdminCanInviteToOrg: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(organizationPgSchemaSlim: OrganizationPgSchemaSlim) = apply {
            id = organizationPgSchemaSlim.id
            disabled = organizationPgSchemaSlim.disabled
            displayName = organizationPgSchemaSlim.displayName
            isPersonal = organizationPgSchemaSlim.isPersonal
            createdAt = organizationPgSchemaSlim.createdAt
            createdByLsUserId = organizationPgSchemaSlim.createdByLsUserId
            createdByUserId = organizationPgSchemaSlim.createdByUserId
            defaultSsoProvision = organizationPgSchemaSlim.defaultSsoProvision
            jitProvisioningEnabled = organizationPgSchemaSlim.jitProvisioningEnabled
            modifiedAt = organizationPgSchemaSlim.modifiedAt
            patCreationDisabled = organizationPgSchemaSlim.patCreationDisabled
            publicSharingDisabled = organizationPgSchemaSlim.publicSharingDisabled
            ssoLoginSlug = organizationPgSchemaSlim.ssoLoginSlug
            ssoOnly = organizationPgSchemaSlim.ssoOnly
            tier = organizationPgSchemaSlim.tier
            workspaceAdminCanInviteToOrg = organizationPgSchemaSlim.workspaceAdminCanInviteToOrg
            additionalProperties = organizationPgSchemaSlim.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun disabled(disabled: Boolean) = disabled(JsonField.of(disabled))

        /**
         * Sets [Builder.disabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun disabled(disabled: JsonField<Boolean>) = apply { this.disabled = disabled }

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

        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun createdByLsUserId(createdByLsUserId: String?) =
            createdByLsUserId(JsonField.ofNullable(createdByLsUserId))

        /** Alias for calling [Builder.createdByLsUserId] with `createdByLsUserId.orElse(null)`. */
        fun createdByLsUserId(createdByLsUserId: Optional<String>) =
            createdByLsUserId(createdByLsUserId.getOrNull())

        /**
         * Sets [Builder.createdByLsUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByLsUserId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByLsUserId(createdByLsUserId: JsonField<String>) = apply {
            this.createdByLsUserId = createdByLsUserId
        }

        fun createdByUserId(createdByUserId: String?) =
            createdByUserId(JsonField.ofNullable(createdByUserId))

        /** Alias for calling [Builder.createdByUserId] with `createdByUserId.orElse(null)`. */
        fun createdByUserId(createdByUserId: Optional<String>) =
            createdByUserId(createdByUserId.getOrNull())

        /**
         * Sets [Builder.createdByUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdByUserId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdByUserId(createdByUserId: JsonField<String>) = apply {
            this.createdByUserId = createdByUserId
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

        fun modifiedAt(modifiedAt: OffsetDateTime?) = modifiedAt(JsonField.ofNullable(modifiedAt))

        /** Alias for calling [Builder.modifiedAt] with `modifiedAt.orElse(null)`. */
        fun modifiedAt(modifiedAt: Optional<OffsetDateTime>) = modifiedAt(modifiedAt.getOrNull())

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
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
         * Returns an immutable instance of [OrganizationPgSchemaSlim].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .disabled()
         * .displayName()
         * .isPersonal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrganizationPgSchemaSlim =
            OrganizationPgSchemaSlim(
                checkRequired("id", id),
                checkRequired("disabled", disabled),
                checkRequired("displayName", displayName),
                checkRequired("isPersonal", isPersonal),
                createdAt,
                createdByLsUserId,
                createdByUserId,
                defaultSsoProvision,
                jitProvisioningEnabled,
                modifiedAt,
                patCreationDisabled,
                publicSharingDisabled,
                ssoLoginSlug,
                ssoOnly,
                tier,
                workspaceAdminCanInviteToOrg,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OrganizationPgSchemaSlim = apply {
        if (validated) {
            return@apply
        }

        id()
        disabled()
        displayName()
        isPersonal()
        createdAt()
        createdByLsUserId()
        createdByUserId()
        defaultSsoProvision()
        jitProvisioningEnabled()
        modifiedAt()
        patCreationDisabled()
        publicSharingDisabled()
        ssoLoginSlug()
        ssoOnly()
        tier().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (disabled.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (isPersonal.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (createdByLsUserId.asKnown().isPresent) 1 else 0) +
            (if (createdByUserId.asKnown().isPresent) 1 else 0) +
            (if (defaultSsoProvision.asKnown().isPresent) 1 else 0) +
            (if (jitProvisioningEnabled.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (patCreationDisabled.asKnown().isPresent) 1 else 0) +
            (if (publicSharingDisabled.asKnown().isPresent) 1 else 0) +
            (if (ssoLoginSlug.asKnown().isPresent) 1 else 0) +
            (if (ssoOnly.asKnown().isPresent) 1 else 0) +
            (tier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceAdminCanInviteToOrg.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrganizationPgSchemaSlim &&
            id == other.id &&
            disabled == other.disabled &&
            displayName == other.displayName &&
            isPersonal == other.isPersonal &&
            createdAt == other.createdAt &&
            createdByLsUserId == other.createdByLsUserId &&
            createdByUserId == other.createdByUserId &&
            defaultSsoProvision == other.defaultSsoProvision &&
            jitProvisioningEnabled == other.jitProvisioningEnabled &&
            modifiedAt == other.modifiedAt &&
            patCreationDisabled == other.patCreationDisabled &&
            publicSharingDisabled == other.publicSharingDisabled &&
            ssoLoginSlug == other.ssoLoginSlug &&
            ssoOnly == other.ssoOnly &&
            tier == other.tier &&
            workspaceAdminCanInviteToOrg == other.workspaceAdminCanInviteToOrg &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            disabled,
            displayName,
            isPersonal,
            createdAt,
            createdByLsUserId,
            createdByUserId,
            defaultSsoProvision,
            jitProvisioningEnabled,
            modifiedAt,
            patCreationDisabled,
            publicSharingDisabled,
            ssoLoginSlug,
            ssoOnly,
            tier,
            workspaceAdminCanInviteToOrg,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrganizationPgSchemaSlim{id=$id, disabled=$disabled, displayName=$displayName, isPersonal=$isPersonal, createdAt=$createdAt, createdByLsUserId=$createdByLsUserId, createdByUserId=$createdByUserId, defaultSsoProvision=$defaultSsoProvision, jitProvisioningEnabled=$jitProvisioningEnabled, modifiedAt=$modifiedAt, patCreationDisabled=$patCreationDisabled, publicSharingDisabled=$publicSharingDisabled, ssoLoginSlug=$ssoLoginSlug, ssoOnly=$ssoOnly, tier=$tier, workspaceAdminCanInviteToOrg=$workspaceAdminCanInviteToOrg, additionalProperties=$additionalProperties}"
}
