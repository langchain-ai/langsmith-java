// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.members

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MemberIdentity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val lsUserId: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val userId: JsonField<String>,
    private val accessScope: JsonField<AccessScope>,
    private val avatarUrl: JsonField<String>,
    private val displayName: JsonField<String>,
    private val email: JsonField<String>,
    private val fullName: JsonField<String>,
    private val isDisabled: JsonField<Boolean>,
    private val linkedLoginMethods: JsonField<List<LinkedLoginMethod>>,
    private val orgRoleId: JsonField<String>,
    private val orgRoleName: JsonField<String>,
    private val roleId: JsonField<String>,
    private val roleName: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ls_user_id") @ExcludeMissing lsUserId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("read_only") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_scope")
        @ExcludeMissing
        accessScope: JsonField<AccessScope> = JsonMissing.of(),
        @JsonProperty("avatar_url") @ExcludeMissing avatarUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_disabled")
        @ExcludeMissing
        isDisabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("linked_login_methods")
        @ExcludeMissing
        linkedLoginMethods: JsonField<List<LinkedLoginMethod>> = JsonMissing.of(),
        @JsonProperty("org_role_id")
        @ExcludeMissing
        orgRoleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_role_name")
        @ExcludeMissing
        orgRoleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_name") @ExcludeMissing roleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        lsUserId,
        organizationId,
        readOnly,
        userId,
        accessScope,
        avatarUrl,
        displayName,
        email,
        fullName,
        isDisabled,
        linkedLoginMethods,
        orgRoleId,
        orgRoleName,
        roleId,
        roleName,
        tenantId,
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
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lsUserId(): String = lsUserId.getRequired("ls_user_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun organizationId(): String = organizationId.getRequired("organization_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun readOnly(): Boolean = readOnly.getRequired("read_only")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun userId(): String = userId.getRequired("user_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessScope(): Optional<AccessScope> = accessScope.getOptional("access_scope")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avatarUrl(): Optional<String> = avatarUrl.getOptional("avatar_url")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun displayName(): Optional<String> = displayName.getOptional("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullName(): Optional<String> = fullName.getOptional("full_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDisabled(): Optional<Boolean> = isDisabled.getOptional("is_disabled")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun linkedLoginMethods(): Optional<List<LinkedLoginMethod>> =
        linkedLoginMethods.getOptional("linked_login_methods")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgRoleId(): Optional<String> = orgRoleId.getOptional("org_role_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgRoleName(): Optional<String> = orgRoleName.getOptional("org_role_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = roleId.getOptional("role_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleName(): Optional<String> = roleName.getOptional("role_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenant_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [lsUserId].
     *
     * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [accessScope].
     *
     * Unlike [accessScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_scope")
    @ExcludeMissing
    fun _accessScope(): JsonField<AccessScope> = accessScope

    /**
     * Returns the raw JSON value of [avatarUrl].
     *
     * Unlike [avatarUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avatar_url") @ExcludeMissing fun _avatarUrl(): JsonField<String> = avatarUrl

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

    /**
     * Returns the raw JSON value of [isDisabled].
     *
     * Unlike [isDisabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_disabled") @ExcludeMissing fun _isDisabled(): JsonField<Boolean> = isDisabled

    /**
     * Returns the raw JSON value of [linkedLoginMethods].
     *
     * Unlike [linkedLoginMethods], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("linked_login_methods")
    @ExcludeMissing
    fun _linkedLoginMethods(): JsonField<List<LinkedLoginMethod>> = linkedLoginMethods

    /**
     * Returns the raw JSON value of [orgRoleId].
     *
     * Unlike [orgRoleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_role_id") @ExcludeMissing fun _orgRoleId(): JsonField<String> = orgRoleId

    /**
     * Returns the raw JSON value of [orgRoleName].
     *
     * Unlike [orgRoleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_role_name")
    @ExcludeMissing
    fun _orgRoleName(): JsonField<String> = orgRoleName

    /**
     * Returns the raw JSON value of [roleId].
     *
     * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

    /**
     * Returns the raw JSON value of [roleName].
     *
     * Unlike [roleName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("role_name") @ExcludeMissing fun _roleName(): JsonField<String> = roleName

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

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
         * Returns a mutable builder for constructing an instance of [MemberIdentity].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lsUserId()
         * .organizationId()
         * .readOnly()
         * .userId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberIdentity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var lsUserId: JsonField<String>? = null
        private var organizationId: JsonField<String>? = null
        private var readOnly: JsonField<Boolean>? = null
        private var userId: JsonField<String>? = null
        private var accessScope: JsonField<AccessScope> = JsonMissing.of()
        private var avatarUrl: JsonField<String> = JsonMissing.of()
        private var displayName: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var isDisabled: JsonField<Boolean> = JsonMissing.of()
        private var linkedLoginMethods: JsonField<MutableList<LinkedLoginMethod>>? = null
        private var orgRoleId: JsonField<String> = JsonMissing.of()
        private var orgRoleName: JsonField<String> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var roleName: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberIdentity: MemberIdentity) = apply {
            id = memberIdentity.id
            createdAt = memberIdentity.createdAt
            lsUserId = memberIdentity.lsUserId
            organizationId = memberIdentity.organizationId
            readOnly = memberIdentity.readOnly
            userId = memberIdentity.userId
            accessScope = memberIdentity.accessScope
            avatarUrl = memberIdentity.avatarUrl
            displayName = memberIdentity.displayName
            email = memberIdentity.email
            fullName = memberIdentity.fullName
            isDisabled = memberIdentity.isDisabled
            linkedLoginMethods = memberIdentity.linkedLoginMethods.map { it.toMutableList() }
            orgRoleId = memberIdentity.orgRoleId
            orgRoleName = memberIdentity.orgRoleName
            roleId = memberIdentity.roleId
            roleName = memberIdentity.roleName
            tenantId = memberIdentity.tenantId
            additionalProperties = memberIdentity.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun lsUserId(lsUserId: String) = lsUserId(JsonField.of(lsUserId))

        /**
         * Sets [Builder.lsUserId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lsUserId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

        fun organizationId(organizationId: String) = organizationId(JsonField.of(organizationId))

        /**
         * Sets [Builder.organizationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizationId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizationId(organizationId: JsonField<String>) = apply {
            this.organizationId = organizationId
        }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        /**
         * Sets [Builder.readOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

        fun userId(userId: String) = userId(JsonField.of(userId))

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun accessScope(accessScope: AccessScope) = accessScope(JsonField.of(accessScope))

        /**
         * Sets [Builder.accessScope] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accessScope] with a well-typed [AccessScope] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accessScope(accessScope: JsonField<AccessScope>) = apply {
            this.accessScope = accessScope
        }

        fun avatarUrl(avatarUrl: String?) = avatarUrl(JsonField.ofNullable(avatarUrl))

        /** Alias for calling [Builder.avatarUrl] with `avatarUrl.orElse(null)`. */
        fun avatarUrl(avatarUrl: Optional<String>) = avatarUrl(avatarUrl.getOrNull())

        /**
         * Sets [Builder.avatarUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avatarUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun avatarUrl(avatarUrl: JsonField<String>) = apply { this.avatarUrl = avatarUrl }

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

        fun fullName(fullName: String?) = fullName(JsonField.ofNullable(fullName))

        /** Alias for calling [Builder.fullName] with `fullName.orElse(null)`. */
        fun fullName(fullName: Optional<String>) = fullName(fullName.getOrNull())

        /**
         * Sets [Builder.fullName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

        fun isDisabled(isDisabled: Boolean) = isDisabled(JsonField.of(isDisabled))

        /**
         * Sets [Builder.isDisabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDisabled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDisabled(isDisabled: JsonField<Boolean>) = apply { this.isDisabled = isDisabled }

        fun linkedLoginMethods(linkedLoginMethods: List<LinkedLoginMethod>) =
            linkedLoginMethods(JsonField.of(linkedLoginMethods))

        /**
         * Sets [Builder.linkedLoginMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.linkedLoginMethods] with a well-typed
         * `List<LinkedLoginMethod>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun linkedLoginMethods(linkedLoginMethods: JsonField<List<LinkedLoginMethod>>) = apply {
            this.linkedLoginMethods = linkedLoginMethods.map { it.toMutableList() }
        }

        /**
         * Adds a single [LinkedLoginMethod] to [linkedLoginMethods].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLinkedLoginMethod(linkedLoginMethod: LinkedLoginMethod) = apply {
            linkedLoginMethods =
                (linkedLoginMethods ?: JsonField.of(mutableListOf())).also {
                    checkKnown("linkedLoginMethods", it).add(linkedLoginMethod)
                }
        }

        fun orgRoleId(orgRoleId: String?) = orgRoleId(JsonField.ofNullable(orgRoleId))

        /** Alias for calling [Builder.orgRoleId] with `orgRoleId.orElse(null)`. */
        fun orgRoleId(orgRoleId: Optional<String>) = orgRoleId(orgRoleId.getOrNull())

        /**
         * Sets [Builder.orgRoleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgRoleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orgRoleId(orgRoleId: JsonField<String>) = apply { this.orgRoleId = orgRoleId }

        fun orgRoleName(orgRoleName: String?) = orgRoleName(JsonField.ofNullable(orgRoleName))

        /** Alias for calling [Builder.orgRoleName] with `orgRoleName.orElse(null)`. */
        fun orgRoleName(orgRoleName: Optional<String>) = orgRoleName(orgRoleName.getOrNull())

        /**
         * Sets [Builder.orgRoleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgRoleName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orgRoleName(orgRoleName: JsonField<String>) = apply { this.orgRoleName = orgRoleName }

        fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

        /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
        fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

        /**
         * Sets [Builder.roleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

        fun roleName(roleName: String?) = roleName(JsonField.ofNullable(roleName))

        /** Alias for calling [Builder.roleName] with `roleName.orElse(null)`. */
        fun roleName(roleName: Optional<String>) = roleName(roleName.getOrNull())

        /**
         * Sets [Builder.roleName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roleName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun roleName(roleName: JsonField<String>) = apply { this.roleName = roleName }

        fun tenantId(tenantId: String?) = tenantId(JsonField.ofNullable(tenantId))

        /** Alias for calling [Builder.tenantId] with `tenantId.orElse(null)`. */
        fun tenantId(tenantId: Optional<String>) = tenantId(tenantId.getOrNull())

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

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
         * Returns an immutable instance of [MemberIdentity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .lsUserId()
         * .organizationId()
         * .readOnly()
         * .userId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemberIdentity =
            MemberIdentity(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("lsUserId", lsUserId),
                checkRequired("organizationId", organizationId),
                checkRequired("readOnly", readOnly),
                checkRequired("userId", userId),
                accessScope,
                avatarUrl,
                displayName,
                email,
                fullName,
                isDisabled,
                (linkedLoginMethods ?: JsonMissing.of()).map { it.toImmutable() },
                orgRoleId,
                orgRoleName,
                roleId,
                roleName,
                tenantId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MemberIdentity = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        lsUserId()
        organizationId()
        readOnly()
        userId()
        accessScope().ifPresent { it.validate() }
        avatarUrl()
        displayName()
        email()
        fullName()
        isDisabled()
        linkedLoginMethods().ifPresent { it.forEach { it.validate() } }
        orgRoleId()
        orgRoleName()
        roleId()
        roleName()
        tenantId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (lsUserId.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (accessScope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (avatarUrl.asKnown().isPresent) 1 else 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (isDisabled.asKnown().isPresent) 1 else 0) +
            (linkedLoginMethods.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (orgRoleId.asKnown().isPresent) 1 else 0) +
            (if (orgRoleName.asKnown().isPresent) 1 else 0) +
            (if (roleId.asKnown().isPresent) 1 else 0) +
            (if (roleName.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0)

    class AccessScope @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ORGANIZATION = of("organization")

            @JvmField val WORKSPACE = of("workspace")

            @JvmStatic fun of(value: String) = AccessScope(JsonField.of(value))
        }

        /** An enum containing [AccessScope]'s known values. */
        enum class Known {
            ORGANIZATION,
            WORKSPACE,
        }

        /**
         * An enum containing [AccessScope]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccessScope] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORGANIZATION,
            WORKSPACE,
            /**
             * An enum member indicating that [AccessScope] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ORGANIZATION -> Value.ORGANIZATION
                WORKSPACE -> Value.WORKSPACE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ORGANIZATION -> Known.ORGANIZATION
                WORKSPACE -> Known.WORKSPACE
                else -> throw LangChainInvalidDataException("Unknown AccessScope: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): AccessScope = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccessScope && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class LinkedLoginMethod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val lsUserId: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val emailConfirmedAt: JsonField<OffsetDateTime>,
        private val firstName: JsonField<String>,
        private val fullName: JsonField<String>,
        private val isDisabled: JsonField<Boolean>,
        private val lastName: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val providerUserId: JsonField<String>,
        private val provisioningMethod: JsonField<ProvisioningMethod>,
        private val samlProviderId: JsonField<String>,
        private val username: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ls_user_id")
            @ExcludeMissing
            lsUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email_confirmed_at")
            @ExcludeMissing
            emailConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("first_name")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("full_name")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_disabled")
            @ExcludeMissing
            isDisabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("last_name")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("provider_user_id")
            @ExcludeMissing
            providerUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provisioning_method")
            @ExcludeMissing
            provisioningMethod: JsonField<ProvisioningMethod> = JsonMissing.of(),
            @JsonProperty("saml_provider_id")
            @ExcludeMissing
            samlProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("username") @ExcludeMissing username: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            createdAt,
            lsUserId,
            updatedAt,
            email,
            emailConfirmedAt,
            firstName,
            fullName,
            isDisabled,
            lastName,
            provider,
            providerUserId,
            provisioningMethod,
            samlProviderId,
            username,
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
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lsUserId(): String = lsUserId.getRequired("ls_user_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun email(): Optional<String> = email.getOptional("email")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun emailConfirmedAt(): Optional<OffsetDateTime> =
            emailConfirmedAt.getOptional("email_confirmed_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = firstName.getOptional("first_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fullName(): Optional<String> = fullName.getOptional("full_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isDisabled(): Optional<Boolean> = isDisabled.getOptional("is_disabled")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = lastName.getOptional("last_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provider(): Optional<Provider> = provider.getOptional("provider")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun providerUserId(): Optional<String> = providerUserId.getOptional("provider_user_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun provisioningMethod(): Optional<ProvisioningMethod> =
            provisioningMethod.getOptional("provisioning_method")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun samlProviderId(): Optional<String> = samlProviderId.getOptional("saml_provider_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun username(): Optional<String> = username.getOptional("username")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [lsUserId].
         *
         * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [emailConfirmedAt].
         *
         * Unlike [emailConfirmedAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("email_confirmed_at")
        @ExcludeMissing
        fun _emailConfirmedAt(): JsonField<OffsetDateTime> = emailConfirmedAt

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("first_name") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [isDisabled].
         *
         * Unlike [isDisabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_disabled")
        @ExcludeMissing
        fun _isDisabled(): JsonField<Boolean> = isDisabled

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("last_name") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [providerUserId].
         *
         * Unlike [providerUserId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("provider_user_id")
        @ExcludeMissing
        fun _providerUserId(): JsonField<String> = providerUserId

        /**
         * Returns the raw JSON value of [provisioningMethod].
         *
         * Unlike [provisioningMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("provisioning_method")
        @ExcludeMissing
        fun _provisioningMethod(): JsonField<ProvisioningMethod> = provisioningMethod

        /**
         * Returns the raw JSON value of [samlProviderId].
         *
         * Unlike [samlProviderId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("saml_provider_id")
        @ExcludeMissing
        fun _samlProviderId(): JsonField<String> = samlProviderId

        /**
         * Returns the raw JSON value of [username].
         *
         * Unlike [username], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("username") @ExcludeMissing fun _username(): JsonField<String> = username

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
             * Returns a mutable builder for constructing an instance of [LinkedLoginMethod].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .lsUserId()
             * .updatedAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LinkedLoginMethod]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var lsUserId: JsonField<String>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var emailConfirmedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var isDisabled: JsonField<Boolean> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var provider: JsonField<Provider> = JsonMissing.of()
            private var providerUserId: JsonField<String> = JsonMissing.of()
            private var provisioningMethod: JsonField<ProvisioningMethod> = JsonMissing.of()
            private var samlProviderId: JsonField<String> = JsonMissing.of()
            private var username: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(linkedLoginMethod: LinkedLoginMethod) = apply {
                id = linkedLoginMethod.id
                createdAt = linkedLoginMethod.createdAt
                lsUserId = linkedLoginMethod.lsUserId
                updatedAt = linkedLoginMethod.updatedAt
                email = linkedLoginMethod.email
                emailConfirmedAt = linkedLoginMethod.emailConfirmedAt
                firstName = linkedLoginMethod.firstName
                fullName = linkedLoginMethod.fullName
                isDisabled = linkedLoginMethod.isDisabled
                lastName = linkedLoginMethod.lastName
                provider = linkedLoginMethod.provider
                providerUserId = linkedLoginMethod.providerUserId
                provisioningMethod = linkedLoginMethod.provisioningMethod
                samlProviderId = linkedLoginMethod.samlProviderId
                username = linkedLoginMethod.username
                additionalProperties = linkedLoginMethod.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun lsUserId(lsUserId: String) = lsUserId(JsonField.of(lsUserId))

            /**
             * Sets [Builder.lsUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun email(email: String?) = email(JsonField.ofNullable(email))

            /** Alias for calling [Builder.email] with `email.orElse(null)`. */
            fun email(email: Optional<String>) = email(email.getOrNull())

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun emailConfirmedAt(emailConfirmedAt: OffsetDateTime?) =
                emailConfirmedAt(JsonField.ofNullable(emailConfirmedAt))

            /**
             * Alias for calling [Builder.emailConfirmedAt] with `emailConfirmedAt.orElse(null)`.
             */
            fun emailConfirmedAt(emailConfirmedAt: Optional<OffsetDateTime>) =
                emailConfirmedAt(emailConfirmedAt.getOrNull())

            /**
             * Sets [Builder.emailConfirmedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailConfirmedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun emailConfirmedAt(emailConfirmedAt: JsonField<OffsetDateTime>) = apply {
                this.emailConfirmedAt = emailConfirmedAt
            }

            fun firstName(firstName: String?) = firstName(JsonField.ofNullable(firstName))

            /** Alias for calling [Builder.firstName] with `firstName.orElse(null)`. */
            fun firstName(firstName: Optional<String>) = firstName(firstName.getOrNull())

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun fullName(fullName: String?) = fullName(JsonField.ofNullable(fullName))

            /** Alias for calling [Builder.fullName] with `fullName.orElse(null)`. */
            fun fullName(fullName: Optional<String>) = fullName(fullName.getOrNull())

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            fun isDisabled(isDisabled: Boolean?) = isDisabled(JsonField.ofNullable(isDisabled))

            /**
             * Alias for [Builder.isDisabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isDisabled(isDisabled: Boolean) = isDisabled(isDisabled as Boolean?)

            /** Alias for calling [Builder.isDisabled] with `isDisabled.orElse(null)`. */
            fun isDisabled(isDisabled: Optional<Boolean>) = isDisabled(isDisabled.getOrNull())

            /**
             * Sets [Builder.isDisabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDisabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDisabled(isDisabled: JsonField<Boolean>) = apply { this.isDisabled = isDisabled }

            fun lastName(lastName: String?) = lastName(JsonField.ofNullable(lastName))

            /** Alias for calling [Builder.lastName] with `lastName.orElse(null)`. */
            fun lastName(lastName: Optional<String>) = lastName(lastName.getOrNull())

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun provider(provider: Provider?) = provider(JsonField.ofNullable(provider))

            /** Alias for calling [Builder.provider] with `provider.orElse(null)`. */
            fun provider(provider: Optional<Provider>) = provider(provider.getOrNull())

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            fun providerUserId(providerUserId: String?) =
                providerUserId(JsonField.ofNullable(providerUserId))

            /** Alias for calling [Builder.providerUserId] with `providerUserId.orElse(null)`. */
            fun providerUserId(providerUserId: Optional<String>) =
                providerUserId(providerUserId.getOrNull())

            /**
             * Sets [Builder.providerUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerUserId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerUserId(providerUserId: JsonField<String>) = apply {
                this.providerUserId = providerUserId
            }

            fun provisioningMethod(provisioningMethod: ProvisioningMethod?) =
                provisioningMethod(JsonField.ofNullable(provisioningMethod))

            /**
             * Alias for calling [Builder.provisioningMethod] with
             * `provisioningMethod.orElse(null)`.
             */
            fun provisioningMethod(provisioningMethod: Optional<ProvisioningMethod>) =
                provisioningMethod(provisioningMethod.getOrNull())

            /**
             * Sets [Builder.provisioningMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provisioningMethod] with a well-typed
             * [ProvisioningMethod] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun provisioningMethod(provisioningMethod: JsonField<ProvisioningMethod>) = apply {
                this.provisioningMethod = provisioningMethod
            }

            fun samlProviderId(samlProviderId: String?) =
                samlProviderId(JsonField.ofNullable(samlProviderId))

            /** Alias for calling [Builder.samlProviderId] with `samlProviderId.orElse(null)`. */
            fun samlProviderId(samlProviderId: Optional<String>) =
                samlProviderId(samlProviderId.getOrNull())

            /**
             * Sets [Builder.samlProviderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.samlProviderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun samlProviderId(samlProviderId: JsonField<String>) = apply {
                this.samlProviderId = samlProviderId
            }

            fun username(username: String?) = username(JsonField.ofNullable(username))

            /** Alias for calling [Builder.username] with `username.orElse(null)`. */
            fun username(username: Optional<String>) = username(username.getOrNull())

            /**
             * Sets [Builder.username] to an arbitrary JSON value.
             *
             * You should usually call [Builder.username] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun username(username: JsonField<String>) = apply { this.username = username }

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
             * Returns an immutable instance of [LinkedLoginMethod].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .createdAt()
             * .lsUserId()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LinkedLoginMethod =
                LinkedLoginMethod(
                    checkRequired("id", id),
                    checkRequired("createdAt", createdAt),
                    checkRequired("lsUserId", lsUserId),
                    checkRequired("updatedAt", updatedAt),
                    email,
                    emailConfirmedAt,
                    firstName,
                    fullName,
                    isDisabled,
                    lastName,
                    provider,
                    providerUserId,
                    provisioningMethod,
                    samlProviderId,
                    username,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): LinkedLoginMethod = apply {
            if (validated) {
                return@apply
            }

            id()
            createdAt()
            lsUserId()
            updatedAt()
            email()
            emailConfirmedAt()
            firstName()
            fullName()
            isDisabled()
            lastName()
            provider().ifPresent { it.validate() }
            providerUserId()
            provisioningMethod().ifPresent { it.validate() }
            samlProviderId()
            username()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (lsUserId.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (if (email.asKnown().isPresent) 1 else 0) +
                (if (emailConfirmedAt.asKnown().isPresent) 1 else 0) +
                (if (firstName.asKnown().isPresent) 1 else 0) +
                (if (fullName.asKnown().isPresent) 1 else 0) +
                (if (isDisabled.asKnown().isPresent) 1 else 0) +
                (if (lastName.asKnown().isPresent) 1 else 0) +
                (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (if (providerUserId.asKnown().isPresent) 1 else 0) +
                (provisioningMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (samlProviderId.asKnown().isPresent) 1 else 0) +
                (if (username.asKnown().isPresent) 1 else 0)

        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val EMAIL = of("email")

                @JvmField val SUPABASE_NON_SSO = of("supabase:non-sso")

                @JvmField val SUPABASE_SSO = of("supabase:sso")

                @JvmField val OIDC = of("oidc")

                @JvmField val CUSTOM_OIDC = of("custom-oidc")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                EMAIL,
                SUPABASE_NON_SSO,
                SUPABASE_SSO,
                OIDC,
                CUSTOM_OIDC,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                EMAIL,
                SUPABASE_NON_SSO,
                SUPABASE_SSO,
                OIDC,
                CUSTOM_OIDC,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    EMAIL -> Value.EMAIL
                    SUPABASE_NON_SSO -> Value.SUPABASE_NON_SSO
                    SUPABASE_SSO -> Value.SUPABASE_SSO
                    OIDC -> Value.OIDC
                    CUSTOM_OIDC -> Value.CUSTOM_OIDC
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    EMAIL -> Known.EMAIL
                    SUPABASE_NON_SSO -> Known.SUPABASE_NON_SSO
                    SUPABASE_SSO -> Known.SUPABASE_SSO
                    OIDC -> Known.OIDC
                    CUSTOM_OIDC -> Known.CUSTOM_OIDC
                    else -> throw LangChainInvalidDataException("Unknown Provider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Provider = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ProvisioningMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SCIM = of("scim")

                @JvmField val SAML_JIT = of("saml:jit")

                @JvmField val BOOTSTRAP = of("bootstrap")

                @JvmStatic fun of(value: String) = ProvisioningMethod(JsonField.of(value))
            }

            /** An enum containing [ProvisioningMethod]'s known values. */
            enum class Known {
                SCIM,
                SAML_JIT,
                BOOTSTRAP,
            }

            /**
             * An enum containing [ProvisioningMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ProvisioningMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SCIM,
                SAML_JIT,
                BOOTSTRAP,
                /**
                 * An enum member indicating that [ProvisioningMethod] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SCIM -> Value.SCIM
                    SAML_JIT -> Value.SAML_JIT
                    BOOTSTRAP -> Value.BOOTSTRAP
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    SCIM -> Known.SCIM
                    SAML_JIT -> Known.SAML_JIT
                    BOOTSTRAP -> Known.BOOTSTRAP
                    else ->
                        throw LangChainInvalidDataException("Unknown ProvisioningMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ProvisioningMethod = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProvisioningMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LinkedLoginMethod &&
                id == other.id &&
                createdAt == other.createdAt &&
                lsUserId == other.lsUserId &&
                updatedAt == other.updatedAt &&
                email == other.email &&
                emailConfirmedAt == other.emailConfirmedAt &&
                firstName == other.firstName &&
                fullName == other.fullName &&
                isDisabled == other.isDisabled &&
                lastName == other.lastName &&
                provider == other.provider &&
                providerUserId == other.providerUserId &&
                provisioningMethod == other.provisioningMethod &&
                samlProviderId == other.samlProviderId &&
                username == other.username &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                createdAt,
                lsUserId,
                updatedAt,
                email,
                emailConfirmedAt,
                firstName,
                fullName,
                isDisabled,
                lastName,
                provider,
                providerUserId,
                provisioningMethod,
                samlProviderId,
                username,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LinkedLoginMethod{id=$id, createdAt=$createdAt, lsUserId=$lsUserId, updatedAt=$updatedAt, email=$email, emailConfirmedAt=$emailConfirmedAt, firstName=$firstName, fullName=$fullName, isDisabled=$isDisabled, lastName=$lastName, provider=$provider, providerUserId=$providerUserId, provisioningMethod=$provisioningMethod, samlProviderId=$samlProviderId, username=$username, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberIdentity &&
            id == other.id &&
            createdAt == other.createdAt &&
            lsUserId == other.lsUserId &&
            organizationId == other.organizationId &&
            readOnly == other.readOnly &&
            userId == other.userId &&
            accessScope == other.accessScope &&
            avatarUrl == other.avatarUrl &&
            displayName == other.displayName &&
            email == other.email &&
            fullName == other.fullName &&
            isDisabled == other.isDisabled &&
            linkedLoginMethods == other.linkedLoginMethods &&
            orgRoleId == other.orgRoleId &&
            orgRoleName == other.orgRoleName &&
            roleId == other.roleId &&
            roleName == other.roleName &&
            tenantId == other.tenantId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            lsUserId,
            organizationId,
            readOnly,
            userId,
            accessScope,
            avatarUrl,
            displayName,
            email,
            fullName,
            isDisabled,
            linkedLoginMethods,
            orgRoleId,
            orgRoleName,
            roleId,
            roleName,
            tenantId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberIdentity{id=$id, createdAt=$createdAt, lsUserId=$lsUserId, organizationId=$organizationId, readOnly=$readOnly, userId=$userId, accessScope=$accessScope, avatarUrl=$avatarUrl, displayName=$displayName, email=$email, fullName=$fullName, isDisabled=$isDisabled, linkedLoginMethods=$linkedLoginMethods, orgRoleId=$orgRoleId, orgRoleName=$orgRoleName, roleId=$roleId, roleName=$roleName, tenantId=$tenantId, additionalProperties=$additionalProperties}"
}
