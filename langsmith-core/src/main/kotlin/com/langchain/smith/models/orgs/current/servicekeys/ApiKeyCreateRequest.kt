// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.servicekeys

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * API key POST schema.
 *
 * expires_at: Optional datetime when the API key will expire. workspaces: List of workspace UUIDs
 * this key can access (feature-flagged). role_id: Optional UUID of the role to assign to API key.
 * If not provided, uses default role based on read_only flag:
 * - WORKSPACE_ADMIN if read_only is False
 * - WORKSPACE_READER if read_only is True org_role_id: UUID of a org role for org-scoped keys If
 *   not provided, defaults to ORG_USER default_workspace_id: UUID of the default workspace for
 *   PATs. If not provided, uses the current logic (first available workspace).
 */
class ApiKeyCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultWorkspaceId: JsonField<String>,
    private val description: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val orgRoleId: JsonField<String>,
    private val readOnly: JsonField<Boolean>,
    private val roleId: JsonField<String>,
    private val workspaces: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_workspace_id")
        @ExcludeMissing
        defaultWorkspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("org_role_id")
        @ExcludeMissing
        orgRoleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("read_only") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("role_id") @ExcludeMissing roleId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspaces")
        @ExcludeMissing
        workspaces: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        defaultWorkspaceId,
        description,
        expiresAt,
        orgRoleId,
        readOnly,
        roleId,
        workspaces,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun defaultWorkspaceId(): Optional<String> =
        defaultWorkspaceId.getOptional("default_workspace_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgRoleId(): Optional<String> = orgRoleId.getOptional("org_role_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roleId(): Optional<String> = roleId.getOptional("role_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaces(): Optional<List<String>> = workspaces.getOptional("workspaces")

    /**
     * Returns the raw JSON value of [defaultWorkspaceId].
     *
     * Unlike [defaultWorkspaceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_workspace_id")
    @ExcludeMissing
    fun _defaultWorkspaceId(): JsonField<String> = defaultWorkspaceId

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [orgRoleId].
     *
     * Unlike [orgRoleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("org_role_id") @ExcludeMissing fun _orgRoleId(): JsonField<String> = orgRoleId

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
     * Returns the raw JSON value of [workspaces].
     *
     * Unlike [workspaces], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspaces")
    @ExcludeMissing
    fun _workspaces(): JsonField<List<String>> = workspaces

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

        /** Returns a mutable builder for constructing an instance of [ApiKeyCreateRequest]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyCreateRequest]. */
    class Builder internal constructor() {

        private var defaultWorkspaceId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var orgRoleId: JsonField<String> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var roleId: JsonField<String> = JsonMissing.of()
        private var workspaces: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyCreateRequest: ApiKeyCreateRequest) = apply {
            defaultWorkspaceId = apiKeyCreateRequest.defaultWorkspaceId
            description = apiKeyCreateRequest.description
            expiresAt = apiKeyCreateRequest.expiresAt
            orgRoleId = apiKeyCreateRequest.orgRoleId
            readOnly = apiKeyCreateRequest.readOnly
            roleId = apiKeyCreateRequest.roleId
            workspaces = apiKeyCreateRequest.workspaces.map { it.toMutableList() }
            additionalProperties = apiKeyCreateRequest.additionalProperties.toMutableMap()
        }

        fun defaultWorkspaceId(defaultWorkspaceId: String?) =
            defaultWorkspaceId(JsonField.ofNullable(defaultWorkspaceId))

        /**
         * Alias for calling [Builder.defaultWorkspaceId] with `defaultWorkspaceId.orElse(null)`.
         */
        fun defaultWorkspaceId(defaultWorkspaceId: Optional<String>) =
            defaultWorkspaceId(defaultWorkspaceId.getOrNull())

        /**
         * Sets [Builder.defaultWorkspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultWorkspaceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun defaultWorkspaceId(defaultWorkspaceId: JsonField<String>) = apply {
            this.defaultWorkspaceId = defaultWorkspaceId
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

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

        fun workspaces(workspaces: List<String>?) = workspaces(JsonField.ofNullable(workspaces))

        /** Alias for calling [Builder.workspaces] with `workspaces.orElse(null)`. */
        fun workspaces(workspaces: Optional<List<String>>) = workspaces(workspaces.getOrNull())

        /**
         * Sets [Builder.workspaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaces] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workspaces(workspaces: JsonField<List<String>>) = apply {
            this.workspaces = workspaces.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [workspaces].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWorkspace(workspace: String) = apply {
            workspaces =
                (workspaces ?: JsonField.of(mutableListOf())).also {
                    checkKnown("workspaces", it).add(workspace)
                }
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
         * Returns an immutable instance of [ApiKeyCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ApiKeyCreateRequest =
            ApiKeyCreateRequest(
                defaultWorkspaceId,
                description,
                expiresAt,
                orgRoleId,
                readOnly,
                roleId,
                (workspaces ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiKeyCreateRequest = apply {
        if (validated) {
            return@apply
        }

        defaultWorkspaceId()
        description()
        expiresAt()
        orgRoleId()
        readOnly()
        roleId()
        workspaces()
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
        (if (defaultWorkspaceId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (orgRoleId.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (if (roleId.asKnown().isPresent) 1 else 0) +
            (workspaces.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyCreateRequest &&
            defaultWorkspaceId == other.defaultWorkspaceId &&
            description == other.description &&
            expiresAt == other.expiresAt &&
            orgRoleId == other.orgRoleId &&
            readOnly == other.readOnly &&
            roleId == other.roleId &&
            workspaces == other.workspaces &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultWorkspaceId,
            description,
            expiresAt,
            orgRoleId,
            readOnly,
            roleId,
            workspaces,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyCreateRequest{defaultWorkspaceId=$defaultWorkspaceId, description=$description, expiresAt=$expiresAt, orgRoleId=$orgRoleId, readOnly=$readOnly, roleId=$roleId, workspaces=$workspaces, additionalProperties=$additionalProperties}"
}
