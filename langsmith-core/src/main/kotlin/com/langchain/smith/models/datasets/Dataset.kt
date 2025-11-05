// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Dataset schema. */
class Dataset
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val exampleCount: JsonField<Long>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val name: JsonField<String>,
    private val sessionCount: JsonField<Long>,
    private val tenantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataType: JsonField<DataType>,
    private val description: JsonField<String>,
    private val externallyManaged: JsonField<Boolean>,
    private val inputsSchemaDefinition: JsonValue,
    private val lastSessionStartTime: JsonField<OffsetDateTime>,
    private val metadata: JsonValue,
    private val outputsSchemaDefinition: JsonValue,
    private val transformations: JsonField<List<DatasetTransformation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("example_count")
        @ExcludeMissing
        exampleCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_count")
        @ExcludeMissing
        sessionCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("data_type") @ExcludeMissing dataType: JsonField<DataType> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externally_managed")
        @ExcludeMissing
        externallyManaged: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("inputs_schema_definition")
        @ExcludeMissing
        inputsSchemaDefinition: JsonValue = JsonMissing.of(),
        @JsonProperty("last_session_start_time")
        @ExcludeMissing
        lastSessionStartTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
        @JsonProperty("outputs_schema_definition")
        @ExcludeMissing
        outputsSchemaDefinition: JsonValue = JsonMissing.of(),
        @JsonProperty("transformations")
        @ExcludeMissing
        transformations: JsonField<List<DatasetTransformation>> = JsonMissing.of(),
    ) : this(
        id,
        exampleCount,
        modifiedAt,
        name,
        sessionCount,
        tenantId,
        createdAt,
        dataType,
        description,
        externallyManaged,
        inputsSchemaDefinition,
        lastSessionStartTime,
        metadata,
        outputsSchemaDefinition,
        transformations,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exampleCount(): Long = exampleCount.getRequired("example_count")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionCount(): Long = sessionCount.getRequired("session_count")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Enum for dataset data types.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataType(): Optional<DataType> = dataType.getOptional("data_type")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externallyManaged(): Optional<Boolean> = externallyManaged.getOptional("externally_managed")

    @JsonProperty("inputs_schema_definition")
    @ExcludeMissing
    fun _inputsSchemaDefinition(): JsonValue = inputsSchemaDefinition

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastSessionStartTime(): Optional<OffsetDateTime> =
        lastSessionStartTime.getOptional("last_session_start_time")

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

    @JsonProperty("outputs_schema_definition")
    @ExcludeMissing
    fun _outputsSchemaDefinition(): JsonValue = outputsSchemaDefinition

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformations(): Optional<List<DatasetTransformation>> =
        transformations.getOptional("transformations")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [exampleCount].
     *
     * Unlike [exampleCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("example_count")
    @ExcludeMissing
    fun _exampleCount(): JsonField<Long> = exampleCount

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sessionCount].
     *
     * Unlike [sessionCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_count")
    @ExcludeMissing
    fun _sessionCount(): JsonField<Long> = sessionCount

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data_type") @ExcludeMissing fun _dataType(): JsonField<DataType> = dataType

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [externallyManaged].
     *
     * Unlike [externallyManaged], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("externally_managed")
    @ExcludeMissing
    fun _externallyManaged(): JsonField<Boolean> = externallyManaged

    /**
     * Returns the raw JSON value of [lastSessionStartTime].
     *
     * Unlike [lastSessionStartTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("last_session_start_time")
    @ExcludeMissing
    fun _lastSessionStartTime(): JsonField<OffsetDateTime> = lastSessionStartTime

    /**
     * Returns the raw JSON value of [transformations].
     *
     * Unlike [transformations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transformations")
    @ExcludeMissing
    fun _transformations(): JsonField<List<DatasetTransformation>> = transformations

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
         * Returns a mutable builder for constructing an instance of [Dataset].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exampleCount()
         * .modifiedAt()
         * .name()
         * .sessionCount()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Dataset]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var exampleCount: JsonField<Long>? = null
        private var modifiedAt: JsonField<OffsetDateTime>? = null
        private var name: JsonField<String>? = null
        private var sessionCount: JsonField<Long>? = null
        private var tenantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataType: JsonField<DataType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var externallyManaged: JsonField<Boolean> = JsonMissing.of()
        private var inputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var lastSessionStartTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var metadata: JsonValue = JsonMissing.of()
        private var outputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var transformations: JsonField<MutableList<DatasetTransformation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataset: Dataset) = apply {
            id = dataset.id
            exampleCount = dataset.exampleCount
            modifiedAt = dataset.modifiedAt
            name = dataset.name
            sessionCount = dataset.sessionCount
            tenantId = dataset.tenantId
            createdAt = dataset.createdAt
            dataType = dataset.dataType
            description = dataset.description
            externallyManaged = dataset.externallyManaged
            inputsSchemaDefinition = dataset.inputsSchemaDefinition
            lastSessionStartTime = dataset.lastSessionStartTime
            metadata = dataset.metadata
            outputsSchemaDefinition = dataset.outputsSchemaDefinition
            transformations = dataset.transformations.map { it.toMutableList() }
            additionalProperties = dataset.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun exampleCount(exampleCount: Long) = exampleCount(JsonField.of(exampleCount))

        /**
         * Sets [Builder.exampleCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exampleCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exampleCount(exampleCount: JsonField<Long>) = apply { this.exampleCount = exampleCount }

        fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sessionCount(sessionCount: Long) = sessionCount(JsonField.of(sessionCount))

        /**
         * Sets [Builder.sessionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionCount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionCount(sessionCount: JsonField<Long>) = apply { this.sessionCount = sessionCount }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType?) = dataType(JsonField.ofNullable(dataType))

        /** Alias for calling [Builder.dataType] with `dataType.orElse(null)`. */
        fun dataType(dataType: Optional<DataType>) = dataType(dataType.getOrNull())

        /**
         * Sets [Builder.dataType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataType] with a well-typed [DataType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataType(dataType: JsonField<DataType>) = apply { this.dataType = dataType }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun externallyManaged(externallyManaged: Boolean?) =
            externallyManaged(JsonField.ofNullable(externallyManaged))

        /**
         * Alias for [Builder.externallyManaged].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun externallyManaged(externallyManaged: Boolean) =
            externallyManaged(externallyManaged as Boolean?)

        /** Alias for calling [Builder.externallyManaged] with `externallyManaged.orElse(null)`. */
        fun externallyManaged(externallyManaged: Optional<Boolean>) =
            externallyManaged(externallyManaged.getOrNull())

        /**
         * Sets [Builder.externallyManaged] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externallyManaged] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externallyManaged(externallyManaged: JsonField<Boolean>) = apply {
            this.externallyManaged = externallyManaged
        }

        fun inputsSchemaDefinition(inputsSchemaDefinition: JsonValue) = apply {
            this.inputsSchemaDefinition = inputsSchemaDefinition
        }

        fun lastSessionStartTime(lastSessionStartTime: OffsetDateTime?) =
            lastSessionStartTime(JsonField.ofNullable(lastSessionStartTime))

        /**
         * Alias for calling [Builder.lastSessionStartTime] with
         * `lastSessionStartTime.orElse(null)`.
         */
        fun lastSessionStartTime(lastSessionStartTime: Optional<OffsetDateTime>) =
            lastSessionStartTime(lastSessionStartTime.getOrNull())

        /**
         * Sets [Builder.lastSessionStartTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastSessionStartTime] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lastSessionStartTime(lastSessionStartTime: JsonField<OffsetDateTime>) = apply {
            this.lastSessionStartTime = lastSessionStartTime
        }

        fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

        fun outputsSchemaDefinition(outputsSchemaDefinition: JsonValue) = apply {
            this.outputsSchemaDefinition = outputsSchemaDefinition
        }

        fun transformations(transformations: List<DatasetTransformation>?) =
            transformations(JsonField.ofNullable(transformations))

        /** Alias for calling [Builder.transformations] with `transformations.orElse(null)`. */
        fun transformations(transformations: Optional<List<DatasetTransformation>>) =
            transformations(transformations.getOrNull())

        /**
         * Sets [Builder.transformations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformations] with a well-typed
         * `List<DatasetTransformation>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun transformations(transformations: JsonField<List<DatasetTransformation>>) = apply {
            this.transformations = transformations.map { it.toMutableList() }
        }

        /**
         * Adds a single [DatasetTransformation] to [transformations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransformation(transformation: DatasetTransformation) = apply {
            transformations =
                (transformations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("transformations", it).add(transformation)
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
         * Returns an immutable instance of [Dataset].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exampleCount()
         * .modifiedAt()
         * .name()
         * .sessionCount()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Dataset =
            Dataset(
                checkRequired("id", id),
                checkRequired("exampleCount", exampleCount),
                checkRequired("modifiedAt", modifiedAt),
                checkRequired("name", name),
                checkRequired("sessionCount", sessionCount),
                checkRequired("tenantId", tenantId),
                createdAt,
                dataType,
                description,
                externallyManaged,
                inputsSchemaDefinition,
                lastSessionStartTime,
                metadata,
                outputsSchemaDefinition,
                (transformations ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Dataset = apply {
        if (validated) {
            return@apply
        }

        id()
        exampleCount()
        modifiedAt()
        name()
        sessionCount()
        tenantId()
        createdAt()
        dataType().ifPresent { it.validate() }
        description()
        externallyManaged()
        lastSessionStartTime()
        transformations().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (exampleCount.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (sessionCount.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dataType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (externallyManaged.asKnown().isPresent) 1 else 0) +
            (if (lastSessionStartTime.asKnown().isPresent) 1 else 0) +
            (transformations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Dataset &&
            id == other.id &&
            exampleCount == other.exampleCount &&
            modifiedAt == other.modifiedAt &&
            name == other.name &&
            sessionCount == other.sessionCount &&
            tenantId == other.tenantId &&
            createdAt == other.createdAt &&
            dataType == other.dataType &&
            description == other.description &&
            externallyManaged == other.externallyManaged &&
            inputsSchemaDefinition == other.inputsSchemaDefinition &&
            lastSessionStartTime == other.lastSessionStartTime &&
            metadata == other.metadata &&
            outputsSchemaDefinition == other.outputsSchemaDefinition &&
            transformations == other.transformations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            exampleCount,
            modifiedAt,
            name,
            sessionCount,
            tenantId,
            createdAt,
            dataType,
            description,
            externallyManaged,
            inputsSchemaDefinition,
            lastSessionStartTime,
            metadata,
            outputsSchemaDefinition,
            transformations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Dataset{id=$id, exampleCount=$exampleCount, modifiedAt=$modifiedAt, name=$name, sessionCount=$sessionCount, tenantId=$tenantId, createdAt=$createdAt, dataType=$dataType, description=$description, externallyManaged=$externallyManaged, inputsSchemaDefinition=$inputsSchemaDefinition, lastSessionStartTime=$lastSessionStartTime, metadata=$metadata, outputsSchemaDefinition=$outputsSchemaDefinition, transformations=$transformations, additionalProperties=$additionalProperties}"
}
