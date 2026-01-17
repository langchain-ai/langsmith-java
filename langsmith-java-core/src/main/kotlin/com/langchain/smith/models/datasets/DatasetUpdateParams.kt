// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a specific dataset. */
class DatasetUpdateParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<Description> = body.description()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputsSchemaDefinition(): Optional<InputsSchemaDefinition> = body.inputsSchemaDefinition()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<Name> = body.name()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputsSchemaDefinition(): Optional<OutputsSchemaDefinition> =
        body.outputsSchemaDefinition()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patchExamples(): Optional<PatchExamples> = body.patchExamples()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformations(): Optional<Transformations> = body.transformations()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<Description> = body._description()

    /**
     * Returns the raw JSON value of [inputsSchemaDefinition].
     *
     * Unlike [inputsSchemaDefinition], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _inputsSchemaDefinition(): JsonField<InputsSchemaDefinition> =
        body._inputsSchemaDefinition()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<Name> = body._name()

    /**
     * Returns the raw JSON value of [outputsSchemaDefinition].
     *
     * Unlike [outputsSchemaDefinition], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _outputsSchemaDefinition(): JsonField<OutputsSchemaDefinition> =
        body._outputsSchemaDefinition()

    /**
     * Returns the raw JSON value of [patchExamples].
     *
     * Unlike [patchExamples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _patchExamples(): JsonField<PatchExamples> = body._patchExamples()

    /**
     * Returns the raw JSON value of [transformations].
     *
     * Unlike [transformations], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transformations(): JsonField<Transformations> = body._transformations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): DatasetUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [DatasetUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetUpdateParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetUpdateParams: DatasetUpdateParams) = apply {
            datasetId = datasetUpdateParams.datasetId
            body = datasetUpdateParams.body.toBuilder()
            additionalHeaders = datasetUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetUpdateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [inputsSchemaDefinition]
         * - [metadata]
         * - [name]
         * - [outputsSchemaDefinition]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun description(description: Description?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<Description>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [Description] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun description(description: JsonField<Description>) = apply {
            body.description(description)
        }

        /** Alias for calling [description] with `Description.ofString(string)`. */
        fun description(string: String) = apply { body.description(string) }

        /** Alias for calling [description] with `Description.ofMissing(missing)`. */
        fun description(missing: Missing) = apply { body.description(missing) }

        fun inputsSchemaDefinition(inputsSchemaDefinition: InputsSchemaDefinition?) = apply {
            body.inputsSchemaDefinition(inputsSchemaDefinition)
        }

        /**
         * Alias for calling [Builder.inputsSchemaDefinition] with
         * `inputsSchemaDefinition.orElse(null)`.
         */
        fun inputsSchemaDefinition(inputsSchemaDefinition: Optional<InputsSchemaDefinition>) =
            inputsSchemaDefinition(inputsSchemaDefinition.getOrNull())

        /**
         * Sets [Builder.inputsSchemaDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputsSchemaDefinition] with a well-typed
         * [InputsSchemaDefinition] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun inputsSchemaDefinition(inputsSchemaDefinition: JsonField<InputsSchemaDefinition>) =
            apply {
                body.inputsSchemaDefinition(inputsSchemaDefinition)
            }

        /**
         * Alias for calling [inputsSchemaDefinition] with
         * `InputsSchemaDefinition.ofUnionMember0(unionMember0)`.
         */
        fun inputsSchemaDefinition(unionMember0: InputsSchemaDefinition.UnionMember0) = apply {
            body.inputsSchemaDefinition(unionMember0)
        }

        /**
         * Alias for calling [inputsSchemaDefinition] with
         * `InputsSchemaDefinition.ofMissing(missing)`.
         */
        fun inputsSchemaDefinition(missing: Missing) = apply {
            body.inputsSchemaDefinition(missing)
        }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Alias for calling [metadata] with `Metadata.ofUnionMember0(unionMember0)`. */
        fun metadata(unionMember0: Metadata.UnionMember0) = apply { body.metadata(unionMember0) }

        /** Alias for calling [metadata] with `Metadata.ofMissing(missing)`. */
        fun metadata(missing: Missing) = apply { body.metadata(missing) }

        fun name(name: Name?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<Name>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [Name] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<Name>) = apply { body.name(name) }

        /** Alias for calling [name] with `Name.ofString(string)`. */
        fun name(string: String) = apply { body.name(string) }

        /** Alias for calling [name] with `Name.ofMissing(missing)`. */
        fun name(missing: Missing) = apply { body.name(missing) }

        fun outputsSchemaDefinition(outputsSchemaDefinition: OutputsSchemaDefinition?) = apply {
            body.outputsSchemaDefinition(outputsSchemaDefinition)
        }

        /**
         * Alias for calling [Builder.outputsSchemaDefinition] with
         * `outputsSchemaDefinition.orElse(null)`.
         */
        fun outputsSchemaDefinition(outputsSchemaDefinition: Optional<OutputsSchemaDefinition>) =
            outputsSchemaDefinition(outputsSchemaDefinition.getOrNull())

        /**
         * Sets [Builder.outputsSchemaDefinition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputsSchemaDefinition] with a well-typed
         * [OutputsSchemaDefinition] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun outputsSchemaDefinition(outputsSchemaDefinition: JsonField<OutputsSchemaDefinition>) =
            apply {
                body.outputsSchemaDefinition(outputsSchemaDefinition)
            }

        /**
         * Alias for calling [outputsSchemaDefinition] with
         * `OutputsSchemaDefinition.ofUnionMember0(unionMember0)`.
         */
        fun outputsSchemaDefinition(unionMember0: OutputsSchemaDefinition.UnionMember0) = apply {
            body.outputsSchemaDefinition(unionMember0)
        }

        /**
         * Alias for calling [outputsSchemaDefinition] with
         * `OutputsSchemaDefinition.ofMissing(missing)`.
         */
        fun outputsSchemaDefinition(missing: Missing) = apply {
            body.outputsSchemaDefinition(missing)
        }

        fun patchExamples(patchExamples: PatchExamples?) = apply {
            body.patchExamples(patchExamples)
        }

        /** Alias for calling [Builder.patchExamples] with `patchExamples.orElse(null)`. */
        fun patchExamples(patchExamples: Optional<PatchExamples>) =
            patchExamples(patchExamples.getOrNull())

        /**
         * Sets [Builder.patchExamples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patchExamples] with a well-typed [PatchExamples] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patchExamples(patchExamples: JsonField<PatchExamples>) = apply {
            body.patchExamples(patchExamples)
        }

        fun transformations(transformations: Transformations?) = apply {
            body.transformations(transformations)
        }

        /** Alias for calling [Builder.transformations] with `transformations.orElse(null)`. */
        fun transformations(transformations: Optional<Transformations>) =
            transformations(transformations.getOrNull())

        /**
         * Sets [Builder.transformations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformations] with a well-typed [Transformations]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transformations(transformations: JsonField<Transformations>) = apply {
            body.transformations(transformations)
        }

        /** Alias for calling [transformations] with `Transformations.ofDataset(dataset)`. */
        fun transformationsOfDataset(dataset: List<DatasetTransformation>) = apply {
            body.transformationsOfDataset(dataset)
        }

        /** Alias for calling [transformations] with `Transformations.ofMissing(missing)`. */
        fun transformations(missing: Missing) = apply { body.transformations(missing) }

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
         * Returns an immutable instance of [DatasetUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DatasetUpdateParams =
            DatasetUpdateParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Update class for Dataset. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<Description>,
        private val inputsSchemaDefinition: JsonField<InputsSchemaDefinition>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<Name>,
        private val outputsSchemaDefinition: JsonField<OutputsSchemaDefinition>,
        private val patchExamples: JsonField<PatchExamples>,
        private val transformations: JsonField<Transformations>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<Description> = JsonMissing.of(),
            @JsonProperty("inputs_schema_definition")
            @ExcludeMissing
            inputsSchemaDefinition: JsonField<InputsSchemaDefinition> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
            @JsonProperty("outputs_schema_definition")
            @ExcludeMissing
            outputsSchemaDefinition: JsonField<OutputsSchemaDefinition> = JsonMissing.of(),
            @JsonProperty("patch_examples")
            @ExcludeMissing
            patchExamples: JsonField<PatchExamples> = JsonMissing.of(),
            @JsonProperty("transformations")
            @ExcludeMissing
            transformations: JsonField<Transformations> = JsonMissing.of(),
        ) : this(
            description,
            inputsSchemaDefinition,
            metadata,
            name,
            outputsSchemaDefinition,
            patchExamples,
            transformations,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<Description> = description.getOptional("description")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputsSchemaDefinition(): Optional<InputsSchemaDefinition> =
            inputsSchemaDefinition.getOptional("inputs_schema_definition")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<Name> = name.getOptional("name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputsSchemaDefinition(): Optional<OutputsSchemaDefinition> =
            outputsSchemaDefinition.getOptional("outputs_schema_definition")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun patchExamples(): Optional<PatchExamples> = patchExamples.getOptional("patch_examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transformations(): Optional<Transformations> =
            transformations.getOptional("transformations")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<Description> = description

        /**
         * Returns the raw JSON value of [inputsSchemaDefinition].
         *
         * Unlike [inputsSchemaDefinition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("inputs_schema_definition")
        @ExcludeMissing
        fun _inputsSchemaDefinition(): JsonField<InputsSchemaDefinition> = inputsSchemaDefinition

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

        /**
         * Returns the raw JSON value of [outputsSchemaDefinition].
         *
         * Unlike [outputsSchemaDefinition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("outputs_schema_definition")
        @ExcludeMissing
        fun _outputsSchemaDefinition(): JsonField<OutputsSchemaDefinition> = outputsSchemaDefinition

        /**
         * Returns the raw JSON value of [patchExamples].
         *
         * Unlike [patchExamples], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("patch_examples")
        @ExcludeMissing
        fun _patchExamples(): JsonField<PatchExamples> = patchExamples

        /**
         * Returns the raw JSON value of [transformations].
         *
         * Unlike [transformations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transformations")
        @ExcludeMissing
        fun _transformations(): JsonField<Transformations> = transformations

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var description: JsonField<Description> = JsonMissing.of()
            private var inputsSchemaDefinition: JsonField<InputsSchemaDefinition> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<Name> = JsonMissing.of()
            private var outputsSchemaDefinition: JsonField<OutputsSchemaDefinition> =
                JsonMissing.of()
            private var patchExamples: JsonField<PatchExamples> = JsonMissing.of()
            private var transformations: JsonField<Transformations> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                description = body.description
                inputsSchemaDefinition = body.inputsSchemaDefinition
                metadata = body.metadata
                name = body.name
                outputsSchemaDefinition = body.outputsSchemaDefinition
                patchExamples = body.patchExamples
                transformations = body.transformations
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun description(description: Description?) =
                description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<Description>) =
                description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [Description] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<Description>) = apply {
                this.description = description
            }

            /** Alias for calling [description] with `Description.ofString(string)`. */
            fun description(string: String) = description(Description.ofString(string))

            /** Alias for calling [description] with `Description.ofMissing(missing)`. */
            fun description(missing: Missing) = description(Description.ofMissing(missing))

            fun inputsSchemaDefinition(inputsSchemaDefinition: InputsSchemaDefinition?) =
                inputsSchemaDefinition(JsonField.ofNullable(inputsSchemaDefinition))

            /**
             * Alias for calling [Builder.inputsSchemaDefinition] with
             * `inputsSchemaDefinition.orElse(null)`.
             */
            fun inputsSchemaDefinition(inputsSchemaDefinition: Optional<InputsSchemaDefinition>) =
                inputsSchemaDefinition(inputsSchemaDefinition.getOrNull())

            /**
             * Sets [Builder.inputsSchemaDefinition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inputsSchemaDefinition] with a well-typed
             * [InputsSchemaDefinition] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun inputsSchemaDefinition(inputsSchemaDefinition: JsonField<InputsSchemaDefinition>) =
                apply {
                    this.inputsSchemaDefinition = inputsSchemaDefinition
                }

            /**
             * Alias for calling [inputsSchemaDefinition] with
             * `InputsSchemaDefinition.ofUnionMember0(unionMember0)`.
             */
            fun inputsSchemaDefinition(unionMember0: InputsSchemaDefinition.UnionMember0) =
                inputsSchemaDefinition(InputsSchemaDefinition.ofUnionMember0(unionMember0))

            /**
             * Alias for calling [inputsSchemaDefinition] with
             * `InputsSchemaDefinition.ofMissing(missing)`.
             */
            fun inputsSchemaDefinition(missing: Missing) =
                inputsSchemaDefinition(InputsSchemaDefinition.ofMissing(missing))

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Alias for calling [metadata] with `Metadata.ofUnionMember0(unionMember0)`. */
            fun metadata(unionMember0: Metadata.UnionMember0) =
                metadata(Metadata.ofUnionMember0(unionMember0))

            /** Alias for calling [metadata] with `Metadata.ofMissing(missing)`. */
            fun metadata(missing: Missing) = metadata(Metadata.ofMissing(missing))

            fun name(name: Name?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<Name>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [Name] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<Name>) = apply { this.name = name }

            /** Alias for calling [name] with `Name.ofString(string)`. */
            fun name(string: String) = name(Name.ofString(string))

            /** Alias for calling [name] with `Name.ofMissing(missing)`. */
            fun name(missing: Missing) = name(Name.ofMissing(missing))

            fun outputsSchemaDefinition(outputsSchemaDefinition: OutputsSchemaDefinition?) =
                outputsSchemaDefinition(JsonField.ofNullable(outputsSchemaDefinition))

            /**
             * Alias for calling [Builder.outputsSchemaDefinition] with
             * `outputsSchemaDefinition.orElse(null)`.
             */
            fun outputsSchemaDefinition(
                outputsSchemaDefinition: Optional<OutputsSchemaDefinition>
            ) = outputsSchemaDefinition(outputsSchemaDefinition.getOrNull())

            /**
             * Sets [Builder.outputsSchemaDefinition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.outputsSchemaDefinition] with a well-typed
             * [OutputsSchemaDefinition] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun outputsSchemaDefinition(
                outputsSchemaDefinition: JsonField<OutputsSchemaDefinition>
            ) = apply { this.outputsSchemaDefinition = outputsSchemaDefinition }

            /**
             * Alias for calling [outputsSchemaDefinition] with
             * `OutputsSchemaDefinition.ofUnionMember0(unionMember0)`.
             */
            fun outputsSchemaDefinition(unionMember0: OutputsSchemaDefinition.UnionMember0) =
                outputsSchemaDefinition(OutputsSchemaDefinition.ofUnionMember0(unionMember0))

            /**
             * Alias for calling [outputsSchemaDefinition] with
             * `OutputsSchemaDefinition.ofMissing(missing)`.
             */
            fun outputsSchemaDefinition(missing: Missing) =
                outputsSchemaDefinition(OutputsSchemaDefinition.ofMissing(missing))

            fun patchExamples(patchExamples: PatchExamples?) =
                patchExamples(JsonField.ofNullable(patchExamples))

            /** Alias for calling [Builder.patchExamples] with `patchExamples.orElse(null)`. */
            fun patchExamples(patchExamples: Optional<PatchExamples>) =
                patchExamples(patchExamples.getOrNull())

            /**
             * Sets [Builder.patchExamples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.patchExamples] with a well-typed [PatchExamples]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun patchExamples(patchExamples: JsonField<PatchExamples>) = apply {
                this.patchExamples = patchExamples
            }

            fun transformations(transformations: Transformations?) =
                transformations(JsonField.ofNullable(transformations))

            /** Alias for calling [Builder.transformations] with `transformations.orElse(null)`. */
            fun transformations(transformations: Optional<Transformations>) =
                transformations(transformations.getOrNull())

            /**
             * Sets [Builder.transformations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transformations] with a well-typed [Transformations]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transformations(transformations: JsonField<Transformations>) = apply {
                this.transformations = transformations
            }

            /** Alias for calling [transformations] with `Transformations.ofDataset(dataset)`. */
            fun transformationsOfDataset(dataset: List<DatasetTransformation>) =
                transformations(Transformations.ofDataset(dataset))

            /** Alias for calling [transformations] with `Transformations.ofMissing(missing)`. */
            fun transformations(missing: Missing) =
                transformations(Transformations.ofMissing(missing))

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
             */
            fun build(): Body =
                Body(
                    description,
                    inputsSchemaDefinition,
                    metadata,
                    name,
                    outputsSchemaDefinition,
                    patchExamples,
                    transformations,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description().ifPresent { it.validate() }
            inputsSchemaDefinition().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            name().ifPresent { it.validate() }
            outputsSchemaDefinition().ifPresent { it.validate() }
            patchExamples().ifPresent { it.validate() }
            transformations().ifPresent { it.validate() }
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
            (description.asKnown().getOrNull()?.validity() ?: 0) +
                (inputsSchemaDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (name.asKnown().getOrNull()?.validity() ?: 0) +
                (outputsSchemaDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                (patchExamples.asKnown().getOrNull()?.validity() ?: 0) +
                (transformations.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                inputsSchemaDefinition == other.inputsSchemaDefinition &&
                metadata == other.metadata &&
                name == other.name &&
                outputsSchemaDefinition == other.outputsSchemaDefinition &&
                patchExamples == other.patchExamples &&
                transformations == other.transformations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                inputsSchemaDefinition,
                metadata,
                name,
                outputsSchemaDefinition,
                patchExamples,
                transformations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, inputsSchemaDefinition=$inputsSchemaDefinition, metadata=$metadata, name=$name, outputsSchemaDefinition=$outputsSchemaDefinition, patchExamples=$patchExamples, transformations=$transformations, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Description.Deserializer::class)
    @JsonSerialize(using = Description.Serializer::class)
    class Description
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Description = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Description && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Description{string=$string}"
                missing != null -> "Description{missing=$missing}"
                _json != null -> "Description{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Description")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Description(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Description(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Description] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Description] to a value of type [T].
             *
             * An instance of [Description] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Description: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Description>(Description::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Description {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Description(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Description(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Description(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Description>(Description::class) {

            override fun serialize(
                value: Description,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Description")
                }
            }
        }
    }

    @JsonDeserialize(using = InputsSchemaDefinition.Deserializer::class)
    @JsonSerialize(using = InputsSchemaDefinition.Serializer::class)
    class InputsSchemaDefinition
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isMissing(): Boolean = missing != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InputsSchemaDefinition = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InputsSchemaDefinition &&
                unionMember0 == other.unionMember0 &&
                missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, missing)

        override fun toString(): String =
            when {
                unionMember0 != null -> "InputsSchemaDefinition{unionMember0=$unionMember0}"
                missing != null -> "InputsSchemaDefinition{missing=$missing}"
                _json != null -> "InputsSchemaDefinition{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InputsSchemaDefinition")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                InputsSchemaDefinition(unionMember0 = unionMember0)

            @JvmStatic fun ofMissing(missing: Missing) = InputsSchemaDefinition(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [InputsSchemaDefinition] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [InputsSchemaDefinition] to a value of type [T].
             *
             * An instance of [InputsSchemaDefinition] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown InputsSchemaDefinition: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<InputsSchemaDefinition>(InputsSchemaDefinition::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InputsSchemaDefinition {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                InputsSchemaDefinition(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                InputsSchemaDefinition(missing = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> InputsSchemaDefinition(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<InputsSchemaDefinition>(InputsSchemaDefinition::class) {

            override fun serialize(
                value: InputsSchemaDefinition,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InputsSchemaDefinition")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = Metadata.Deserializer::class)
    @JsonSerialize(using = Metadata.Serializer::class)
    class Metadata
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isMissing(): Boolean = missing != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                unionMember0 == other.unionMember0 &&
                missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, missing)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Metadata{unionMember0=$unionMember0}"
                missing != null -> "Metadata{missing=$missing}"
                _json != null -> "Metadata{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Metadata")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Metadata(unionMember0 = unionMember0)

            @JvmStatic fun ofMissing(missing: Missing) = Metadata(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Metadata] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Metadata] to a value of type [T].
             *
             * An instance of [Metadata] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Metadata: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Metadata>(Metadata::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Metadata {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Metadata(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Metadata(missing = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Metadata(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Metadata>(Metadata::class) {

            override fun serialize(
                value: Metadata,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Metadata")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    @JsonDeserialize(using = Name.Deserializer::class)
    @JsonSerialize(using = Name.Serializer::class)
    class Name
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Name = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Name && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "Name{string=$string}"
                missing != null -> "Name{missing=$missing}"
                _json != null -> "Name{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Name")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Name(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = Name(missing = missing)
        }

        /** An interface that defines how to map each variant of [Name] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Name] to a value of type [T].
             *
             * An instance of [Name] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Name: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Name>(Name::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Name {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Name(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Name(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Name(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Name>(Name::class) {

            override fun serialize(
                value: Name,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Name")
                }
            }
        }
    }

    @JsonDeserialize(using = OutputsSchemaDefinition.Deserializer::class)
    @JsonSerialize(using = OutputsSchemaDefinition.Serializer::class)
    class OutputsSchemaDefinition
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isMissing(): Boolean = missing != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): OutputsSchemaDefinition = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OutputsSchemaDefinition &&
                unionMember0 == other.unionMember0 &&
                missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, missing)

        override fun toString(): String =
            when {
                unionMember0 != null -> "OutputsSchemaDefinition{unionMember0=$unionMember0}"
                missing != null -> "OutputsSchemaDefinition{missing=$missing}"
                _json != null -> "OutputsSchemaDefinition{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid OutputsSchemaDefinition")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) =
                OutputsSchemaDefinition(unionMember0 = unionMember0)

            @JvmStatic fun ofMissing(missing: Missing) = OutputsSchemaDefinition(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [OutputsSchemaDefinition] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [OutputsSchemaDefinition] to a value of type [T].
             *
             * An instance of [OutputsSchemaDefinition] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown OutputsSchemaDefinition: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<OutputsSchemaDefinition>(OutputsSchemaDefinition::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): OutputsSchemaDefinition {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                OutputsSchemaDefinition(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                OutputsSchemaDefinition(missing = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> OutputsSchemaDefinition(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<OutputsSchemaDefinition>(OutputsSchemaDefinition::class) {

            override fun serialize(
                value: OutputsSchemaDefinition,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid OutputsSchemaDefinition")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    class PatchExamples
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PatchExamples]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PatchExamples]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(patchExamples: PatchExamples) = apply {
                additionalProperties = patchExamples.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [PatchExamples].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PatchExamples = PatchExamples(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): PatchExamples = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PatchExamples && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PatchExamples{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Transformations.Deserializer::class)
    @JsonSerialize(using = Transformations.Serializer::class)
    class Transformations
    private constructor(
        private val dataset: List<DatasetTransformation>? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun dataset(): Optional<List<DatasetTransformation>> = Optional.ofNullable(dataset)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isDataset(): Boolean = dataset != null

        fun isMissing(): Boolean = missing != null

        fun asDataset(): List<DatasetTransformation> = dataset.getOrThrow("dataset")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                dataset != null -> visitor.visitDataset(dataset)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Transformations = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataset(dataset: List<DatasetTransformation>) {
                        dataset.forEach { it.validate() }
                    }

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitDataset(dataset: List<DatasetTransformation>) =
                        dataset.sumOf { it.validity().toInt() }

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Transformations && dataset == other.dataset && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(dataset, missing)

        override fun toString(): String =
            when {
                dataset != null -> "Transformations{dataset=$dataset}"
                missing != null -> "Transformations{missing=$missing}"
                _json != null -> "Transformations{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Transformations")
            }

        companion object {

            @JvmStatic
            fun ofDataset(dataset: List<DatasetTransformation>) =
                Transformations(dataset = dataset.toImmutable())

            @JvmStatic fun ofMissing(missing: Missing) = Transformations(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [Transformations] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitDataset(dataset: List<DatasetTransformation>): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [Transformations] to a value of type [T].
             *
             * An instance of [Transformations] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Transformations: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Transformations>(Transformations::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Transformations {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                Transformations(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<DatasetTransformation>>())
                                ?.let { Transformations(dataset = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Transformations(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Transformations>(Transformations::class) {

            override fun serialize(
                value: Transformations,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dataset != null -> generator.writeObject(value.dataset)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Transformations")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetUpdateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetUpdateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
