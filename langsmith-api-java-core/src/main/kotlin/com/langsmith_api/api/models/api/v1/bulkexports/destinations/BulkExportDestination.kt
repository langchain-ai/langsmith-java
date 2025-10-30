// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.bulkexports.destinations

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

class BulkExportDestination
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val config: JsonField<BulkExportDestinationS3Config>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val credentialsKeys: JsonField<List<String>>,
    private val displayName: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val destinationType: JsonField<BulkExportDestinationType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("config")
        @ExcludeMissing
        config: JsonField<BulkExportDestinationS3Config> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credentials_keys")
        @ExcludeMissing
        credentialsKeys: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("destination_type")
        @ExcludeMissing
        destinationType: JsonField<BulkExportDestinationType> = JsonMissing.of(),
    ) : this(
        id,
        config,
        createdAt,
        credentialsKeys,
        displayName,
        tenantId,
        updatedAt,
        destinationType,
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
    fun config(): BulkExportDestinationS3Config = config.getRequired("config")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialsKeys(): List<String> = credentialsKeys.getRequired("credentials_keys")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayName(): String = displayName.getRequired("display_name")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun destinationType(): Optional<BulkExportDestinationType> =
        destinationType.getOptional("destination_type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("config")
    @ExcludeMissing
    fun _config(): JsonField<BulkExportDestinationS3Config> = config

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [credentialsKeys].
     *
     * Unlike [credentialsKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentials_keys")
    @ExcludeMissing
    fun _credentialsKeys(): JsonField<List<String>> = credentialsKeys

    /**
     * Returns the raw JSON value of [displayName].
     *
     * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_name")
    @ExcludeMissing
    fun _displayName(): JsonField<String> = displayName

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [destinationType].
     *
     * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination_type")
    @ExcludeMissing
    fun _destinationType(): JsonField<BulkExportDestinationType> = destinationType

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
         * Returns a mutable builder for constructing an instance of [BulkExportDestination].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .createdAt()
         * .credentialsKeys()
         * .displayName()
         * .tenantId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BulkExportDestination]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var config: JsonField<BulkExportDestinationS3Config>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var credentialsKeys: JsonField<MutableList<String>>? = null
        private var displayName: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var destinationType: JsonField<BulkExportDestinationType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(bulkExportDestination: BulkExportDestination) = apply {
            id = bulkExportDestination.id
            config = bulkExportDestination.config
            createdAt = bulkExportDestination.createdAt
            credentialsKeys = bulkExportDestination.credentialsKeys.map { it.toMutableList() }
            displayName = bulkExportDestination.displayName
            tenantId = bulkExportDestination.tenantId
            updatedAt = bulkExportDestination.updatedAt
            destinationType = bulkExportDestination.destinationType
            additionalProperties = bulkExportDestination.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun config(config: BulkExportDestinationS3Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed
         * [BulkExportDestinationS3Config] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<BulkExportDestinationS3Config>) = apply {
            this.config = config
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun credentialsKeys(credentialsKeys: List<String>) =
            credentialsKeys(JsonField.of(credentialsKeys))

        /**
         * Sets [Builder.credentialsKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialsKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun credentialsKeys(credentialsKeys: JsonField<List<String>>) = apply {
            this.credentialsKeys = credentialsKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [credentialsKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCredentialsKey(credentialsKey: String) = apply {
            credentialsKeys =
                (credentialsKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("credentialsKeys", it).add(credentialsKey)
                }
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

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun destinationType(destinationType: BulkExportDestinationType) =
            destinationType(JsonField.of(destinationType))

        /**
         * Sets [Builder.destinationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationType] with a well-typed
         * [BulkExportDestinationType] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun destinationType(destinationType: JsonField<BulkExportDestinationType>) = apply {
            this.destinationType = destinationType
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
         * Returns an immutable instance of [BulkExportDestination].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .config()
         * .createdAt()
         * .credentialsKeys()
         * .displayName()
         * .tenantId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkExportDestination =
            BulkExportDestination(
                checkRequired("id", id),
                checkRequired("config", config),
                checkRequired("createdAt", createdAt),
                checkRequired("credentialsKeys", credentialsKeys).map { it.toImmutable() },
                checkRequired("displayName", displayName),
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                destinationType,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkExportDestination = apply {
        if (validated) {
            return@apply
        }

        id()
        config().validate()
        createdAt()
        credentialsKeys()
        displayName()
        tenantId()
        updatedAt()
        destinationType().ifPresent { it.validate() }
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
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (credentialsKeys.asKnown().getOrNull()?.size ?: 0) +
            (if (displayName.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (destinationType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BulkExportDestination &&
            id == other.id &&
            config == other.config &&
            createdAt == other.createdAt &&
            credentialsKeys == other.credentialsKeys &&
            displayName == other.displayName &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            destinationType == other.destinationType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            config,
            createdAt,
            credentialsKeys,
            displayName,
            tenantId,
            updatedAt,
            destinationType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkExportDestination{id=$id, config=$config, createdAt=$createdAt, credentialsKeys=$credentialsKeys, displayName=$displayName, tenantId=$tenantId, updatedAt=$updatedAt, destinationType=$destinationType, additionalProperties=$additionalProperties}"
}
