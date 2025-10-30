// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.servicekeys

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** API key GET schema. */
class ApiKeyGetResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val shortKey: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val lastUsedAt: JsonField<OffsetDateTime>,
    private val readOnly: JsonField<Boolean>,
    private val workspaceNames: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_key") @ExcludeMissing shortKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("last_used_at")
        @ExcludeMissing
        lastUsedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("read_only") @ExcludeMissing readOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("workspace_names")
        @ExcludeMissing
        workspaceNames: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        id,
        description,
        shortKey,
        createdAt,
        expiresAt,
        lastUsedAt,
        readOnly,
        workspaceNames,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortKey(): String = shortKey.getRequired("short_key")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lastUsedAt(): Optional<OffsetDateTime> = lastUsedAt.getOptional("last_used_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun readOnly(): Optional<Boolean> = readOnly.getOptional("read_only")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun workspaceNames(): Optional<List<String>> = workspaceNames.getOptional("workspace_names")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [shortKey].
     *
     * Unlike [shortKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_key") @ExcludeMissing fun _shortKey(): JsonField<String> = shortKey

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [lastUsedAt].
     *
     * Unlike [lastUsedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_used_at")
    @ExcludeMissing
    fun _lastUsedAt(): JsonField<OffsetDateTime> = lastUsedAt

    /**
     * Returns the raw JSON value of [readOnly].
     *
     * Unlike [readOnly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("read_only") @ExcludeMissing fun _readOnly(): JsonField<Boolean> = readOnly

    /**
     * Returns the raw JSON value of [workspaceNames].
     *
     * Unlike [workspaceNames], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_names")
    @ExcludeMissing
    fun _workspaceNames(): JsonField<List<String>> = workspaceNames

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
         * Returns a mutable builder for constructing an instance of [ApiKeyGetResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .shortKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ApiKeyGetResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var shortKey: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastUsedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var readOnly: JsonField<Boolean> = JsonMissing.of()
        private var workspaceNames: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(apiKeyGetResponse: ApiKeyGetResponse) = apply {
            id = apiKeyGetResponse.id
            description = apiKeyGetResponse.description
            shortKey = apiKeyGetResponse.shortKey
            createdAt = apiKeyGetResponse.createdAt
            expiresAt = apiKeyGetResponse.expiresAt
            lastUsedAt = apiKeyGetResponse.lastUsedAt
            readOnly = apiKeyGetResponse.readOnly
            workspaceNames = apiKeyGetResponse.workspaceNames.map { it.toMutableList() }
            additionalProperties = apiKeyGetResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun shortKey(shortKey: String) = shortKey(JsonField.of(shortKey))

        /**
         * Sets [Builder.shortKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortKey] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shortKey(shortKey: JsonField<String>) = apply { this.shortKey = shortKey }

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

        fun lastUsedAt(lastUsedAt: OffsetDateTime?) = lastUsedAt(JsonField.ofNullable(lastUsedAt))

        /** Alias for calling [Builder.lastUsedAt] with `lastUsedAt.orElse(null)`. */
        fun lastUsedAt(lastUsedAt: Optional<OffsetDateTime>) = lastUsedAt(lastUsedAt.getOrNull())

        /**
         * Sets [Builder.lastUsedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastUsedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastUsedAt(lastUsedAt: JsonField<OffsetDateTime>) = apply {
            this.lastUsedAt = lastUsedAt
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

        fun workspaceNames(workspaceNames: List<String>?) =
            workspaceNames(JsonField.ofNullable(workspaceNames))

        /** Alias for calling [Builder.workspaceNames] with `workspaceNames.orElse(null)`. */
        fun workspaceNames(workspaceNames: Optional<List<String>>) =
            workspaceNames(workspaceNames.getOrNull())

        /**
         * Sets [Builder.workspaceNames] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceNames] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workspaceNames(workspaceNames: JsonField<List<String>>) = apply {
            this.workspaceNames = workspaceNames.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [workspaceNames].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addWorkspaceName(workspaceName: String) = apply {
            workspaceNames =
                (workspaceNames ?: JsonField.of(mutableListOf())).also {
                    checkKnown("workspaceNames", it).add(workspaceName)
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
         * Returns an immutable instance of [ApiKeyGetResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .description()
         * .shortKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ApiKeyGetResponse =
            ApiKeyGetResponse(
                checkRequired("id", id),
                checkRequired("description", description),
                checkRequired("shortKey", shortKey),
                createdAt,
                expiresAt,
                lastUsedAt,
                readOnly,
                (workspaceNames ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ApiKeyGetResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        description()
        shortKey()
        createdAt()
        expiresAt()
        lastUsedAt()
        readOnly()
        workspaceNames()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (shortKey.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (lastUsedAt.asKnown().isPresent) 1 else 0) +
            (if (readOnly.asKnown().isPresent) 1 else 0) +
            (workspaceNames.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ApiKeyGetResponse &&
            id == other.id &&
            description == other.description &&
            shortKey == other.shortKey &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            lastUsedAt == other.lastUsedAt &&
            readOnly == other.readOnly &&
            workspaceNames == other.workspaceNames &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            description,
            shortKey,
            createdAt,
            expiresAt,
            lastUsedAt,
            readOnly,
            workspaceNames,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ApiKeyGetResponse{id=$id, description=$description, shortKey=$shortKey, createdAt=$createdAt, expiresAt=$expiresAt, lastUsedAt=$lastUsedAt, readOnly=$readOnly, workspaceNames=$workspaceNames, additionalProperties=$additionalProperties}"
}
