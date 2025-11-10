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
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new dataset. */
class DatasetCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = body.createdAt()

    /**
     * Enum for dataset data types.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataType(): Optional<DataType> = body.dataType()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externallyManaged(): Optional<Boolean> = body.externallyManaged()

    fun _extra(): JsonValue = body._extra()

    fun _inputsSchemaDefinition(): JsonValue = body._inputsSchemaDefinition()

    fun _outputsSchemaDefinition(): JsonValue = body._outputsSchemaDefinition()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformations(): Optional<List<DatasetTransformation>> = body.transformations()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _id(): JsonField<String> = body._id()

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _createdAt(): JsonField<OffsetDateTime> = body._createdAt()

    /**
     * Returns the raw JSON value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataType(): JsonField<DataType> = body._dataType()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [externallyManaged].
     *
     * Unlike [externallyManaged], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _externallyManaged(): JsonField<Boolean> = body._externallyManaged()

    /**
     * Returns the raw JSON value of [transformations].
     *
     * Unlike [transformations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transformations(): JsonField<List<DatasetTransformation>> = body._transformations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetCreateParams: DatasetCreateParams) = apply {
            body = datasetCreateParams.body.toBuilder()
            additionalHeaders = datasetCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [id]
         * - [createdAt]
         * - [dataType]
         * - [description]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun id(id: String?) = apply { body.id(id) }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { body.id(id) }

        fun createdAt(createdAt: OffsetDateTime) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { body.createdAt(createdAt) }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType) = apply { body.dataType(dataType) }

        /**
         * Sets [Builder.dataType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataType] with a well-typed [DataType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataType(dataType: JsonField<DataType>) = apply { body.dataType(dataType) }

        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        fun externallyManaged(externallyManaged: Boolean?) = apply {
            body.externallyManaged(externallyManaged)
        }

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
            body.externallyManaged(externallyManaged)
        }

        fun extra(extra: JsonValue) = apply { body.extra(extra) }

        fun inputsSchemaDefinition(inputsSchemaDefinition: JsonValue) = apply {
            body.inputsSchemaDefinition(inputsSchemaDefinition)
        }

        fun outputsSchemaDefinition(outputsSchemaDefinition: JsonValue) = apply {
            body.outputsSchemaDefinition(outputsSchemaDefinition)
        }

        fun transformations(transformations: List<DatasetTransformation>?) = apply {
            body.transformations(transformations)
        }

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
            body.transformations(transformations)
        }

        /**
         * Adds a single [DatasetTransformation] to [transformations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTransformation(transformation: DatasetTransformation) = apply {
            body.addTransformation(transformation)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [DatasetCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetCreateParams =
            DatasetCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create class for Dataset. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val dataType: JsonField<DataType>,
        private val description: JsonField<String>,
        private val externallyManaged: JsonField<Boolean>,
        private val extra: JsonValue,
        private val inputsSchemaDefinition: JsonValue,
        private val outputsSchemaDefinition: JsonValue,
        private val transformations: JsonField<List<DatasetTransformation>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("data_type")
            @ExcludeMissing
            dataType: JsonField<DataType> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("externally_managed")
            @ExcludeMissing
            externallyManaged: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
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
            name,
            id,
            createdAt,
            dataType,
            description,
            externallyManaged,
            extra,
            inputsSchemaDefinition,
            outputsSchemaDefinition,
            transformations,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

        /**
         * Enum for dataset data types.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dataType(): Optional<DataType> = dataType.getOptional("data_type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externallyManaged(): Optional<Boolean> =
            externallyManaged.getOptional("externally_managed")

        @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

        @JsonProperty("inputs_schema_definition")
        @ExcludeMissing
        fun _inputsSchemaDefinition(): JsonValue = inputsSchemaDefinition

        @JsonProperty("outputs_schema_definition")
        @ExcludeMissing
        fun _outputsSchemaDefinition(): JsonValue = outputsSchemaDefinition

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transformations(): Optional<List<DatasetTransformation>> =
            transformations.getOptional("transformations")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
         * Unlike [transformations], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dataType: JsonField<DataType> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var externallyManaged: JsonField<Boolean> = JsonMissing.of()
            private var extra: JsonValue = JsonMissing.of()
            private var inputsSchemaDefinition: JsonValue = JsonMissing.of()
            private var outputsSchemaDefinition: JsonValue = JsonMissing.of()
            private var transformations: JsonField<MutableList<DatasetTransformation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                id = body.id
                createdAt = body.createdAt
                dataType = body.dataType
                description = body.description
                externallyManaged = body.externallyManaged
                extra = body.extra
                inputsSchemaDefinition = body.inputsSchemaDefinition
                outputsSchemaDefinition = body.outputsSchemaDefinition
                transformations = body.transformations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun id(id: String?) = id(JsonField.ofNullable(id))

            /** Alias for calling [Builder.id] with `id.orElse(null)`. */
            fun id(id: Optional<String>) = id(id.getOrNull())

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

            /** Enum for dataset data types. */
            fun dataType(dataType: DataType) = dataType(JsonField.of(dataType))

            /**
             * Sets [Builder.dataType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataType] with a well-typed [DataType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataType(dataType: JsonField<DataType>) = apply { this.dataType = dataType }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun externallyManaged(externallyManaged: Boolean?) =
                externallyManaged(JsonField.ofNullable(externallyManaged))

            /**
             * Alias for [Builder.externallyManaged].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun externallyManaged(externallyManaged: Boolean) =
                externallyManaged(externallyManaged as Boolean?)

            /**
             * Alias for calling [Builder.externallyManaged] with `externallyManaged.orElse(null)`.
             */
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

            fun extra(extra: JsonValue) = apply { this.extra = extra }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    id,
                    createdAt,
                    dataType,
                    description,
                    externallyManaged,
                    extra,
                    inputsSchemaDefinition,
                    outputsSchemaDefinition,
                    (transformations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            id()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (name.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (dataType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (externallyManaged.asKnown().isPresent) 1 else 0) +
                (transformations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                id == other.id &&
                createdAt == other.createdAt &&
                dataType == other.dataType &&
                description == other.description &&
                externallyManaged == other.externallyManaged &&
                extra == other.extra &&
                inputsSchemaDefinition == other.inputsSchemaDefinition &&
                outputsSchemaDefinition == other.outputsSchemaDefinition &&
                transformations == other.transformations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                id,
                createdAt,
                dataType,
                description,
                externallyManaged,
                extra,
                inputsSchemaDefinition,
                outputsSchemaDefinition,
                transformations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, id=$id, createdAt=$createdAt, dataType=$dataType, description=$description, externallyManaged=$externallyManaged, extra=$extra, inputsSchemaDefinition=$inputsSchemaDefinition, outputsSchemaDefinition=$outputsSchemaDefinition, transformations=$transformations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
