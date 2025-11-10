// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.datasets

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
import com.langchain.smith.models.datasets.DatasetTransformation
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Public schema for datasets.
 *
 * Doesn't currently include session counts/stats since public test project sharing is not yet
 * shipped
 */
class DatasetListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val exampleCount: JsonField<Long>,
    private val name: JsonField<String>,
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
        @JsonProperty("example_count")
        @ExcludeMissing
        exampleCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
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
        exampleCount,
        name,
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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exampleCount(): Long = exampleCount.getRequired("example_count")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * Enum for dataset data types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataType(): Optional<DataType> = dataType.getOptional("data_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
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
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [DatasetListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exampleCount()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var exampleCount: JsonField<Long>? = null
        private var name: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dataType: JsonField<DataType> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var externallyManaged: JsonField<Boolean> = JsonMissing.of()
        private var inputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var outputsSchemaDefinition: JsonValue = JsonMissing.of()
        private var transformations: JsonField<MutableList<DatasetTransformation>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetListResponse: DatasetListResponse) = apply {
            id = datasetListResponse.id
            exampleCount = datasetListResponse.exampleCount
            name = datasetListResponse.name
            createdAt = datasetListResponse.createdAt
            dataType = datasetListResponse.dataType
            description = datasetListResponse.description
            externallyManaged = datasetListResponse.externallyManaged
            inputsSchemaDefinition = datasetListResponse.inputsSchemaDefinition
            outputsSchemaDefinition = datasetListResponse.outputsSchemaDefinition
            transformations = datasetListResponse.transformations.map { it.toMutableList() }
            additionalProperties = datasetListResponse.additionalProperties.toMutableMap()
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

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [DatasetListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .exampleCount()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetListResponse =
            DatasetListResponse(
                checkRequired("id", id),
                checkRequired("exampleCount", exampleCount),
                checkRequired("name", name),
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

    fun validate(): DatasetListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        exampleCount()
        name()
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
            (if (exampleCount.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (dataType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (externallyManaged.asKnown().isPresent) 1 else 0) +
            (transformations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** Enum for dataset data types. */
    class DataType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val KV = of("kv")

            @JvmField val LLM = of("llm")

            @JvmField val CHAT = of("chat")

            @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
        }

        /** An enum containing [DataType]'s known values. */
        enum class Known {
            KV,
            LLM,
            CHAT,
        }

        /**
         * An enum containing [DataType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DataType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            KV,
            LLM,
            CHAT,
            /** An enum member indicating that [DataType] was instantiated with an unknown value. */
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
                KV -> Value.KV
                LLM -> Value.LLM
                CHAT -> Value.CHAT
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
                KV -> Known.KV
                LLM -> Known.LLM
                CHAT -> Known.CHAT
                else -> throw LangChainInvalidDataException("Unknown DataType: $value")
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

        fun validate(): DataType = apply {
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

            return other is DataType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetListResponse &&
            id == other.id &&
            exampleCount == other.exampleCount &&
            name == other.name &&
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
            exampleCount,
            name,
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
        "DatasetListResponse{id=$id, exampleCount=$exampleCount, name=$name, createdAt=$createdAt, dataType=$dataType, description=$description, externallyManaged=$externallyManaged, inputsSchemaDefinition=$inputsSchemaDefinition, outputsSchemaDefinition=$outputsSchemaDefinition, transformations=$transformations, additionalProperties=$additionalProperties}"
}
