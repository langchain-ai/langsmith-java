// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces

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

/** Tenant schema. */
class WorkspaceCreateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val displayName: JsonField<String>,
    private val isDeleted: JsonField<Boolean>,
    private val isPersonal: JsonField<Boolean>,
    private val organizationId: JsonField<String>,
    private val tenantHandle: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_deleted")
        @ExcludeMissing
        isDeleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_personal")
        @ExcludeMissing
        isPersonal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("organization_id")
        @ExcludeMissing
        organizationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_handle")
        @ExcludeMissing
        tenantHandle: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        displayName,
        isDeleted,
        isPersonal,
        organizationId,
        tenantHandle,
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
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDeleted(): Boolean = isDeleted.getRequired("is_deleted")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPersonal(): Boolean = isPersonal.getRequired("is_personal")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizationId(): Optional<String> = organizationId.getOptional("organization_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantHandle(): Optional<String> = tenantHandle.getOptional("tenant_handle")

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
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [isDeleted].
     *
     * Unlike [isDeleted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_deleted") @ExcludeMissing fun _isDeleted(): JsonField<Boolean> = isDeleted

    /**
     * Returns the raw JSON value of [isPersonal].
     *
     * Unlike [isPersonal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_personal") @ExcludeMissing fun _isPersonal(): JsonField<Boolean> = isPersonal

    /**
     * Returns the raw JSON value of [organizationId].
     *
     * Unlike [organizationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization_id")
    @ExcludeMissing
    fun _organizationId(): JsonField<String> = organizationId

    /**
     * Returns the raw JSON value of [tenantHandle].
     *
     * Unlike [tenantHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_handle")
    @ExcludeMissing
    fun _tenantHandle(): JsonField<String> = tenantHandle

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
         * Returns a mutable builder for constructing an instance of [WorkspaceCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .isDeleted()
         * .isPersonal()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WorkspaceCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var displayName: JsonField<String>? = null
        private var isDeleted: JsonField<Boolean>? = null
        private var isPersonal: JsonField<Boolean>? = null
        private var organizationId: JsonField<String> = JsonMissing.of()
        private var tenantHandle: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(workspaceCreateResponse: WorkspaceCreateResponse) = apply {
            id = workspaceCreateResponse.id
            createdAt = workspaceCreateResponse.createdAt
            displayName = workspaceCreateResponse.displayName
            isDeleted = workspaceCreateResponse.isDeleted
            isPersonal = workspaceCreateResponse.isPersonal
            organizationId = workspaceCreateResponse.organizationId
            tenantHandle = workspaceCreateResponse.tenantHandle
            additionalProperties = workspaceCreateResponse.additionalProperties.toMutableMap()
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

        fun displayName(displayName: String) = displayName(JsonField.of(displayName))

        /**
         * Sets [Builder.displayName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun displayName(displayName: JsonField<String>) = apply { this.displayName = displayName }

        fun isDeleted(isDeleted: Boolean) = isDeleted(JsonField.of(isDeleted))

        /**
         * Sets [Builder.isDeleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDeleted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDeleted(isDeleted: JsonField<Boolean>) = apply { this.isDeleted = isDeleted }

        fun isPersonal(isPersonal: Boolean) = isPersonal(JsonField.of(isPersonal))

        /**
         * Sets [Builder.isPersonal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPersonal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPersonal(isPersonal: JsonField<Boolean>) = apply { this.isPersonal = isPersonal }

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

        fun tenantHandle(tenantHandle: String?) = tenantHandle(JsonField.ofNullable(tenantHandle))

        /** Alias for calling [Builder.tenantHandle] with `tenantHandle.orElse(null)`. */
        fun tenantHandle(tenantHandle: Optional<String>) = tenantHandle(tenantHandle.getOrNull())

        /**
         * Sets [Builder.tenantHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tenantHandle(tenantHandle: JsonField<String>) = apply {
            this.tenantHandle = tenantHandle
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
         * Returns an immutable instance of [WorkspaceCreateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .displayName()
         * .isDeleted()
         * .isPersonal()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WorkspaceCreateResponse =
            WorkspaceCreateResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("displayName", displayName),
                checkRequired("isDeleted", isDeleted),
                checkRequired("isPersonal", isPersonal),
                organizationId,
                tenantHandle,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WorkspaceCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        displayName()
        isDeleted()
        isPersonal()
        organizationId()
        tenantHandle()
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
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (isDeleted.asKnown().isPresent) 1 else 0) +
            (if (isPersonal.asKnown().isPresent) 1 else 0) +
            (if (organizationId.asKnown().isPresent) 1 else 0) +
            (if (tenantHandle.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WorkspaceCreateResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            displayName == other.displayName &&
            isDeleted == other.isDeleted &&
            isPersonal == other.isPersonal &&
            organizationId == other.organizationId &&
            tenantHandle == other.tenantHandle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            displayName,
            isDeleted,
            isPersonal,
            organizationId,
            tenantHandle,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WorkspaceCreateResponse{id=$id, createdAt=$createdAt, displayName=$displayName, isDeleted=$isDeleted, isPersonal=$isPersonal, organizationId=$organizationId, tenantHandle=$tenantHandle, additionalProperties=$additionalProperties}"
}
