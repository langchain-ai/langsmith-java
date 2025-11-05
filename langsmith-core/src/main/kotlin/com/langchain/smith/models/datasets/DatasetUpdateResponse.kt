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

class DatasetUpdateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val dataType: JsonField<DataType>,
    private val description: JsonField<String>,
    private val externallyManaged: JsonField<Boolean>,
    private val inputsSchemaDefinition: JsonValue,
    private val outputsSchemaDefinition: JsonValue,
    private val transformations: JsonField<List<DatasetTransformation>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("outputs_schema_definition")
        @ExcludeMissing
        outputsSchemaDefinition: JsonValue = JsonMissing.of(),
        @JsonProperty("transformations")
        @ExcludeMissing
        transformations: JsonField<List<DatasetTransformation>> = JsonMissing.of(),
    ) : this(
        id,
        name,
        tenantId,
        createdAt,
        dataType,
        description,
        externallyManaged,
        inputsSchemaDefinition,
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
    fun name(): String = name.getRequired("name")

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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [DatasetUpdateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetUpdateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var tenantId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataType: JsonField<DataType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var externallyManaged: JsonField<Boolean> = JsonMissing.of()
        private var inputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var outputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var transformations: JsonField<MutableList<DatasetTransformation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetUpdateResponse: DatasetUpdateResponse) = apply {
            id = datasetUpdateResponse.id
            name = datasetUpdateResponse.name
            tenantId = datasetUpdateResponse.tenantId
            createdAt = datasetUpdateResponse.createdAt
            dataType = datasetUpdateResponse.dataType
            description = datasetUpdateResponse.description
            externallyManaged = datasetUpdateResponse.externallyManaged
            inputsSchemaDefinition = datasetUpdateResponse.inputsSchemaDefinition
            outputsSchemaDefinition = datasetUpdateResponse.outputsSchemaDefinition
            transformations = datasetUpdateResponse.transformations.map { it.toMutableList() }
            additionalProperties = datasetUpdateResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [DatasetUpdateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetUpdateResponse =
            DatasetUpdateResponse(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("tenantId", tenantId),
                createdAt,
                dataType,
                description,
                externallyManaged,
                inputsSchemaDefinition,
                outputsSchemaDefinition,
                (transformations ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DatasetUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        tenantId()
        createdAt()
        dataType().ifPresent { it.validate() }
        description()
        externallyManaged()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dataType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (externallyManaged.asKnown().isPresent) 1 else 0) +
            (transformations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetUpdateResponse &&
            id == other.id &&
            name == other.name &&
            tenantId == other.tenantId &&
            createdAt == other.createdAt &&
            dataType == other.dataType &&
            description == other.description &&
            externallyManaged == other.externallyManaged &&
            inputsSchemaDefinition == other.inputsSchemaDefinition &&
            outputsSchemaDefinition == other.outputsSchemaDefinition &&
            transformations == other.transformations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            tenantId,
            createdAt,
            dataType,
            description,
            externallyManaged,
            inputsSchemaDefinition,
            outputsSchemaDefinition,
            transformations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DatasetUpdateResponse{id=$id, name=$name, tenantId=$tenantId, createdAt=$createdAt, dataType=$dataType, description=$description, externallyManaged=$externallyManaged, inputsSchemaDefinition=$inputsSchemaDefinition, outputsSchemaDefinition=$outputsSchemaDefinition, transformations=$transformations, additionalProperties=$additionalProperties}"
}
