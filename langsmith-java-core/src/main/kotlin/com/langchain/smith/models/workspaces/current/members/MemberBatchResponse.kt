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

class MemberBatchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val accessScope: JsonField<AccessScope>,
    private val fullName: JsonField<String>,
    private val orgRoleId: JsonField<String>,
    private val orgRoleName: JsonField<String>,
    private val organizationId: JsonField<String>,
    private val password: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val roleId: JsonField<String>,
    private val roleName: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val userId: JsonField<String>,
    private val workspaceIds: JsonField<List<String>>,
    private val workspaceRoleId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_scope")
        @ExcludeMissing
        accessScope: JsonField<AccessScope> = JsonMissing.of(),
        @JsonProperty("full_name") @ExcludeMissing fullName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_role_id")
        @ExcludeMissing
        orgRoleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("org_role_name")
        @ExcludeMissing
        orgRoleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("password") @ExcludeMissing password: JsonField<String> = JsonMissing.of(),
        @JsonProperty("read_only") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("role_name") @ExcludeMissing roleName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_ids")
        @ExcludeMissing
        workspaceIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("workspace_role_id")
        @ExcludeMissing
        workspaceRoleId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        email,
        accessScope,
        fullName,
        orgRoleId,
        orgRoleName,
        organizationId,
        password,
        readOnly,
        roleId,
        roleName,
        tenantId,
        userId,
        workspaceIds,
        workspaceRoleId,
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
    fun email(): String = email.getRequired("email")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accessScope(): Optional<AccessScope> = accessScope.getOptional("access_scope")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullName(): Optional<String> = fullName.getOptional("full_name")

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
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun password(): Optional<String> = password.getOptional("password")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun userId(): Optional<String> = userId.getOptional("user_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceIds(): Optional<List<String>> = workspaceIds.getOptional("workspace_ids")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceRoleId(): Optional<String> = workspaceRoleId.getOptional("workspace_role_id")

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
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [accessScope].
     *
     * Unlike [accessScope], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("access_scope")
    @ExcludeMissing
    fun _accessScope(): JsonField<AccessScope> = accessScope

    /**
     * Returns the raw JSON value of [fullName].
     *
     * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_name") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

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
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [password].
     *
     * Unlike [password], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("password") @ExcludeMissing fun _password(): JsonField<String> = password

    /**
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

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

    /**
     * Returns the raw JSON value of [userId].
     *
     * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

    /**
     * Returns the raw JSON value of [workspaceIds].
     *
     * Unlike [workspaceIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_ids")
    @ExcludeMissing
    fun _workspaceIds(): JsonField<List<String>> = workspaceIds

    /**
     * Returns the raw JSON value of [workspaceRoleId].
     *
     * Unlike [workspaceRoleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_role_id")
    @ExcludeMissing
    fun _workspaceRoleId(): JsonField<String> = workspaceRoleId

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
         * Returns a mutable builder for constructing an instance of [MemberBatchResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .email()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MemberBatchResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String>? = null
        private var accessScope: JsonField<AccessScope> = JsonMissing.of()
        private var fullName: JsonField<String> = JsonMissing.of()
        private var orgRoleId: JsonField<String> = JsonMissing.of()
        private var orgRoleName: JsonField<String> = JsonMissing.of()
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var password: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var roleName: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var userId: JsonField<String> = JsonMissing.of()
        private var workspaceIds: JsonField<MutableList<String>>? = null
        private var workspaceRoleId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(memberBatchResponse: MemberBatchResponse) = apply {
            id = memberBatchResponse.id
            createdAt = memberBatchResponse.createdAt
            email = memberBatchResponse.email
            accessScope = memberBatchResponse.accessScope
            fullName = memberBatchResponse.fullName
            orgRoleId = memberBatchResponse.orgRoleId
            orgRoleName = memberBatchResponse.orgRoleName
            organizationId = memberBatchResponse.organizationId
            password = memberBatchResponse.password
            readOnly = memberBatchResponse.readOnly
            roleId = memberBatchResponse.roleId
            roleName = memberBatchResponse.roleName
            tenantId = memberBatchResponse.tenantId
            userId = memberBatchResponse.userId
            workspaceIds = memberBatchResponse.workspaceIds.map { it.toMutableList() }
            workspaceRoleId = memberBatchResponse.workspaceRoleId
            additionalProperties = memberBatchResponse.additionalProperties.toMutableMap()
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

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

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

        fun organizationId(organizationId: String?) =
            organizationId(JsonField.ofNullable(organizationId))

        /** Alias for calling [Builder.organizationId] with `organizationId.orElse(null)`. */
        fun organizationId(organizationId: Optional<String>) =
            organizationId(organizationId.getOrNull())

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

        fun password(password: String?) = password(JsonField.ofNullable(password))

        /** Alias for calling [Builder.password] with `password.orElse(null)`. */
        fun password(password: Optional<String>) = password(password.getOrNull())

        /**
         * Sets [Builder.password] to an arbitrary JSON value.
         *
         * You should usually call [Builder.password] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun password(password: JsonField<String>) = apply { this.password = password }

        fun readOnly(readOnly: Boolean) = readOnly(JsonField.of(readOnly))

        /**
         * Sets [Builder.readOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.readOnly] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun readOnly(readOnly: JsonField<Boolean>) = apply { this.readOnly = readOnly }

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

        fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

        /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
        fun userId(userId: Optional<String>) = userId(userId.getOrNull())

        /**
         * Sets [Builder.userId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun userId(userId: JsonField<String>) = apply { this.userId = userId }

        fun workspaceIds(workspaceIds: List<String>?) =
            workspaceIds(JsonField.ofNullable(workspaceIds))

        /** Alias for calling [Builder.workspaceIds] with `workspaceIds.orElse(null)`. */
        fun workspaceIds(workspaceIds: Optional<List<String>>) =
            workspaceIds(workspaceIds.getOrNull())

        /**
         * Sets [Builder.workspaceIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workspaceIds(workspaceIds: JsonField<List<String>>) = apply {
            this.workspaceIds = workspaceIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [workspaceIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWorkspaceId(workspaceId: String) = apply {
            workspaceIds =
                (workspaceIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("workspaceIds", it).add(workspaceId)
                }
        }

        fun workspaceRoleId(workspaceRoleId: String?) =
            workspaceRoleId(JsonField.ofNullable(workspaceRoleId))

        /** Alias for calling [Builder.workspaceRoleId] with `workspaceRoleId.orElse(null)`. */
        fun workspaceRoleId(workspaceRoleId: Optional<String>) =
            workspaceRoleId(workspaceRoleId.getOrNull())

        /**
         * Sets [Builder.workspaceRoleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceRoleId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workspaceRoleId(workspaceRoleId: JsonField<String>) = apply {
            this.workspaceRoleId = workspaceRoleId
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
         * Returns an immutable instance of [MemberBatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .email()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MemberBatchResponse =
            MemberBatchResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("email", email),
                accessScope,
                fullName,
                orgRoleId,
                orgRoleName,
                organizationId,
                password,
                readOnly,
                roleId,
                roleName,
                tenantId,
                userId,
                (workspaceIds ?: JsonMissing.of()).map { it.toImmutable() },
                workspaceRoleId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MemberBatchResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        email()
        accessScope().ifPresent { it.validate() }
        fullName()
        orgRoleId()
        orgRoleName()
        organizationId()
        password()
        readOnly()
        roleId()
        roleName()
        tenantId()
        userId()
        workspaceIds()
        workspaceRoleId()
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
            (if (email.asKnown().isPresent) 1 else 0) +
            (accessScope.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fullName.asKnown().isPresent) 1 else 0) +
            (if (orgRoleId.asKnown().isPresent) 1 else 0) +
            (if (orgRoleName.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (password.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (if (roleId.asKnown().isPresent) 1 else 0) +
            (if (roleName.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (userId.asKnown().isPresent) 1 else 0) +
            (workspaceIds.asKnown().getOrNull()?.size ?: 0) +
            (if (workspaceRoleId.asKnown().isPresent) 1 else 0)

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MemberBatchResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            email == other.email &&
            accessScope == other.accessScope &&
            fullName == other.fullName &&
            orgRoleId == other.orgRoleId &&
            orgRoleName == other.orgRoleName &&
            organizationId == other.organizationId &&
            password == other.password &&
            readOnly == other.readOnly &&
            roleId == other.roleId &&
            roleName == other.roleName &&
            tenantId == other.tenantId &&
            userId == other.userId &&
            workspaceIds == other.workspaceIds &&
            workspaceRoleId == other.workspaceRoleId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            email,
            accessScope,
            fullName,
            orgRoleId,
            orgRoleName,
            organizationId,
            password,
            readOnly,
            roleId,
            roleName,
            tenantId,
            userId,
            workspaceIds,
            workspaceRoleId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MemberBatchResponse{id=$id, createdAt=$createdAt, email=$email, accessScope=$accessScope, fullName=$fullName, orgRoleId=$orgRoleId, orgRoleName=$orgRoleName, organizationId=$organizationId, password=$password, readOnly=$readOnly, roleId=$roleId, roleName=$roleName, tenantId=$tenantId, userId=$userId, workspaceIds=$workspaceIds, workspaceRoleId=$workspaceRoleId, additionalProperties=$additionalProperties}"
}
