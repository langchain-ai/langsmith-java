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
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a dataset.
 *
 * Only the fields in the request change; omitted fields keep their value. Setting a schema or
 * transformations checks every existing example against the result. Returns 400, leaving the
 * dataset unchanged, if an example does not match, the dataset is not a key-value dataset, or a
 * transformation points into inputs or outputs that have no schema. The X-Updated-Examples-Count
 * response header holds the number of examples changed through patch_examples. Returns 404 if the
 * dataset does not exist and 409 if the new name is already used.
 */
class DatasetUpdateParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * ID of the experiment used as the baseline when comparing experiments on this dataset. Must be
     * an experiment run on this dataset, otherwise returns 400. Null clears it. Omit to keep the
     * current baseline.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun baselineExperimentId(): Optional<String> = body.baselineExperimentId()

    /**
     * New dataset description. Null clears it. Omit to keep the current description.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * JSON Schema that example inputs must match. Replaces the current inputs schema as a whole;
     * null removes it, which returns 400 while transformations still point into inputs. Only
     * key-value datasets support schemas. Every existing example must match the new schema,
     * otherwise the request returns 400 with the IDs of the examples that do not, and nothing is
     * changed. Omit to keep the current schema.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputsSchemaDefinition(): Optional<InputsSchemaDefinition> = body.inputsSchemaDefinition()

    /**
     * Dataset metadata as a JSON object. Replaces the current metadata as a whole; keys are not
     * merged. Send an empty object to clear it. Omit to keep the current metadata.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * New dataset name. Must be unique in the workspace; a name already used by another dataset
     * returns 409. Null returns 400. Omit to keep the current name.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * JSON Schema that example outputs must match. Replaces the current outputs schema as a whole;
     * null removes it, which returns 400 while transformations still point into outputs. Only
     * key-value datasets support schemas. Every existing example must match the new schema,
     * otherwise the request returns 400 with the IDs of the examples that do not, and nothing is
     * changed. Omit to keep the current schema.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputsSchemaDefinition(): Optional<OutputsSchemaDefinition> =
        body.outputsSchemaDefinition()

    /**
     * Example updates keyed by example ID, applied in the same transaction so existing examples can
     * be fixed to match a new schema. Only used when the request also sets
     * inputs_schema_definition, outputs_schema_definition, or transformations and the dataset ends
     * up with at least one schema; otherwise it is ignored. Each update replaces the inputs,
     * outputs, metadata, or split it sets and keeps the rest; attachment operations are ignored. An
     * ID that is not an example in this dataset returns 404.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun patchExamples(): Optional<PatchExamples> = body.patchExamples()

    /**
     * Transformations applied to new examples, each a path into inputs or outputs and a
     * transformation type. Replaces the whole current list; null or an empty list removes all of
     * them. Existing examples are not transformed. Requires a schema on the inputs or outputs the
     * path points into, otherwise returns 400. Omit to keep the current list.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformations(): Optional<List<DatasetTransformation>> = body.transformations()

    /**
     * Returns the raw JSON value of [baselineExperimentId].
     *
     * Unlike [baselineExperimentId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _baselineExperimentId(): JsonField<String> = body._baselineExperimentId()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

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
    fun _name(): JsonField<String> = body._name()

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
    fun _transformations(): JsonField<List<DatasetTransformation>> = body._transformations()

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
         * - [baselineExperimentId]
         * - [description]
         * - [inputsSchemaDefinition]
         * - [metadata]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * ID of the experiment used as the baseline when comparing experiments on this dataset.
         * Must be an experiment run on this dataset, otherwise returns 400. Null clears it. Omit to
         * keep the current baseline.
         */
        fun baselineExperimentId(baselineExperimentId: String?) = apply {
            body.baselineExperimentId(baselineExperimentId)
        }

        /**
         * Alias for calling [Builder.baselineExperimentId] with
         * `baselineExperimentId.orElse(null)`.
         */
        fun baselineExperimentId(baselineExperimentId: Optional<String>) =
            baselineExperimentId(baselineExperimentId.getOrNull())

        /**
         * Sets [Builder.baselineExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.baselineExperimentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun baselineExperimentId(baselineExperimentId: JsonField<String>) = apply {
            body.baselineExperimentId(baselineExperimentId)
        }

        /** New dataset description. Null clears it. Omit to keep the current description. */
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

        /**
         * JSON Schema that example inputs must match. Replaces the current inputs schema as a
         * whole; null removes it, which returns 400 while transformations still point into inputs.
         * Only key-value datasets support schemas. Every existing example must match the new
         * schema, otherwise the request returns 400 with the IDs of the examples that do not, and
         * nothing is changed. Omit to keep the current schema.
         */
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
         * Dataset metadata as a JSON object. Replaces the current metadata as a whole; keys are not
         * merged. Send an empty object to clear it. Omit to keep the current metadata.
         */
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

        /**
         * New dataset name. Must be unique in the workspace; a name already used by another dataset
         * returns 409. Null returns 400. Omit to keep the current name.
         */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * JSON Schema that example outputs must match. Replaces the current outputs schema as a
         * whole; null removes it, which returns 400 while transformations still point into outputs.
         * Only key-value datasets support schemas. Every existing example must match the new
         * schema, otherwise the request returns 400 with the IDs of the examples that do not, and
         * nothing is changed. Omit to keep the current schema.
         */
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
         * Example updates keyed by example ID, applied in the same transaction so existing examples
         * can be fixed to match a new schema. Only used when the request also sets
         * inputs_schema_definition, outputs_schema_definition, or transformations and the dataset
         * ends up with at least one schema; otherwise it is ignored. Each update replaces the
         * inputs, outputs, metadata, or split it sets and keeps the rest; attachment operations are
         * ignored. An ID that is not an example in this dataset returns 404.
         */
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

        /**
         * Transformations applied to new examples, each a path into inputs or outputs and a
         * transformation type. Replaces the whole current list; null or an empty list removes all
         * of them. Existing examples are not transformed. Requires a schema on the inputs or
         * outputs the path points into, otherwise returns 400. Omit to keep the current list.
         */
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
        private val baselineExperimentId: JsonField<String>,
        private val description: JsonField<String>,
        private val inputsSchemaDefinition: JsonField<InputsSchemaDefinition>,
        private val metadata: JsonField<Metadata>,
        private val name: JsonField<String>,
        private val outputsSchemaDefinition: JsonField<OutputsSchemaDefinition>,
        private val patchExamples: JsonField<PatchExamples>,
        private val transformations: JsonField<List<DatasetTransformation>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("baseline_experiment_id")
            @ExcludeMissing
            baselineExperimentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs_schema_definition")
            @ExcludeMissing
            inputsSchemaDefinition: JsonField<InputsSchemaDefinition> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("outputs_schema_definition")
            @ExcludeMissing
            outputsSchemaDefinition: JsonField<OutputsSchemaDefinition> = JsonMissing.of(),
            @JsonProperty("patch_examples")
            @ExcludeMissing
            patchExamples: JsonField<PatchExamples> = JsonMissing.of(),
            @JsonProperty("transformations")
            @ExcludeMissing
            transformations: JsonField<List<DatasetTransformation>> = JsonMissing.of(),
        ) : this(
            baselineExperimentId,
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
         * ID of the experiment used as the baseline when comparing experiments on this dataset.
         * Must be an experiment run on this dataset, otherwise returns 400. Null clears it. Omit to
         * keep the current baseline.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun baselineExperimentId(): Optional<String> =
            baselineExperimentId.getOptional("baseline_experiment_id")

        /**
         * New dataset description. Null clears it. Omit to keep the current description.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * JSON Schema that example inputs must match. Replaces the current inputs schema as a
         * whole; null removes it, which returns 400 while transformations still point into inputs.
         * Only key-value datasets support schemas. Every existing example must match the new
         * schema, otherwise the request returns 400 with the IDs of the examples that do not, and
         * nothing is changed. Omit to keep the current schema.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun inputsSchemaDefinition(): Optional<InputsSchemaDefinition> =
            inputsSchemaDefinition.getOptional("inputs_schema_definition")

        /**
         * Dataset metadata as a JSON object. Replaces the current metadata as a whole; keys are not
         * merged. Send an empty object to clear it. Omit to keep the current metadata.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * New dataset name. Must be unique in the workspace; a name already used by another dataset
         * returns 409. Null returns 400. Omit to keep the current name.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * JSON Schema that example outputs must match. Replaces the current outputs schema as a
         * whole; null removes it, which returns 400 while transformations still point into outputs.
         * Only key-value datasets support schemas. Every existing example must match the new
         * schema, otherwise the request returns 400 with the IDs of the examples that do not, and
         * nothing is changed. Omit to keep the current schema.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputsSchemaDefinition(): Optional<OutputsSchemaDefinition> =
            outputsSchemaDefinition.getOptional("outputs_schema_definition")

        /**
         * Example updates keyed by example ID, applied in the same transaction so existing examples
         * can be fixed to match a new schema. Only used when the request also sets
         * inputs_schema_definition, outputs_schema_definition, or transformations and the dataset
         * ends up with at least one schema; otherwise it is ignored. Each update replaces the
         * inputs, outputs, metadata, or split it sets and keeps the rest; attachment operations are
         * ignored. An ID that is not an example in this dataset returns 404.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun patchExamples(): Optional<PatchExamples> = patchExamples.getOptional("patch_examples")

        /**
         * Transformations applied to new examples, each a path into inputs or outputs and a
         * transformation type. Replaces the whole current list; null or an empty list removes all
         * of them. Existing examples are not transformed. Requires a schema on the inputs or
         * outputs the path points into, otherwise returns 400. Omit to keep the current list.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transformations(): Optional<List<DatasetTransformation>> =
            transformations.getOptional("transformations")

        /**
         * Returns the raw JSON value of [baselineExperimentId].
         *
         * Unlike [baselineExperimentId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("baseline_experiment_id")
        @ExcludeMissing
        fun _baselineExperimentId(): JsonField<String> = baselineExperimentId

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var baselineExperimentId: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var inputsSchemaDefinition: JsonField<InputsSchemaDefinition> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var outputsSchemaDefinition: JsonField<OutputsSchemaDefinition> =
                JsonMissing.of()
            private var patchExamples: JsonField<PatchExamples> = JsonMissing.of()
            private var transformations: JsonField<MutableList<DatasetTransformation>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                baselineExperimentId = body.baselineExperimentId
                description = body.description
                inputsSchemaDefinition = body.inputsSchemaDefinition
                metadata = body.metadata
                name = body.name
                outputsSchemaDefinition = body.outputsSchemaDefinition
                patchExamples = body.patchExamples
                transformations = body.transformations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * ID of the experiment used as the baseline when comparing experiments on this dataset.
             * Must be an experiment run on this dataset, otherwise returns 400. Null clears it.
             * Omit to keep the current baseline.
             */
            fun baselineExperimentId(baselineExperimentId: String?) =
                baselineExperimentId(JsonField.ofNullable(baselineExperimentId))

            /**
             * Alias for calling [Builder.baselineExperimentId] with
             * `baselineExperimentId.orElse(null)`.
             */
            fun baselineExperimentId(baselineExperimentId: Optional<String>) =
                baselineExperimentId(baselineExperimentId.getOrNull())

            /**
             * Sets [Builder.baselineExperimentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.baselineExperimentId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun baselineExperimentId(baselineExperimentId: JsonField<String>) = apply {
                this.baselineExperimentId = baselineExperimentId
            }

            /** New dataset description. Null clears it. Omit to keep the current description. */
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

            /**
             * JSON Schema that example inputs must match. Replaces the current inputs schema as a
             * whole; null removes it, which returns 400 while transformations still point into
             * inputs. Only key-value datasets support schemas. Every existing example must match
             * the new schema, otherwise the request returns 400 with the IDs of the examples that
             * do not, and nothing is changed. Omit to keep the current schema.
             */
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
             * Dataset metadata as a JSON object. Replaces the current metadata as a whole; keys are
             * not merged. Send an empty object to clear it. Omit to keep the current metadata.
             */
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

            /**
             * New dataset name. Must be unique in the workspace; a name already used by another
             * dataset returns 409. Null returns 400. Omit to keep the current name.
             */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * JSON Schema that example outputs must match. Replaces the current outputs schema as a
             * whole; null removes it, which returns 400 while transformations still point into
             * outputs. Only key-value datasets support schemas. Every existing example must match
             * the new schema, otherwise the request returns 400 with the IDs of the examples that
             * do not, and nothing is changed. Omit to keep the current schema.
             */
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
             * Example updates keyed by example ID, applied in the same transaction so existing
             * examples can be fixed to match a new schema. Only used when the request also sets
             * inputs_schema_definition, outputs_schema_definition, or transformations and the
             * dataset ends up with at least one schema; otherwise it is ignored. Each update
             * replaces the inputs, outputs, metadata, or split it sets and keeps the rest;
             * attachment operations are ignored. An ID that is not an example in this dataset
             * returns 404.
             */
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

            /**
             * Transformations applied to new examples, each a path into inputs or outputs and a
             * transformation type. Replaces the whole current list; null or an empty list removes
             * all of them. Existing examples are not transformed. Requires a schema on the inputs
             * or outputs the path points into, otherwise returns 400. Omit to keep the current
             * list.
             */
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
             */
            fun build(): Body =
                Body(
                    baselineExperimentId,
                    description,
                    inputsSchemaDefinition,
                    metadata,
                    name,
                    outputsSchemaDefinition,
                    patchExamples,
                    (transformations ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            baselineExperimentId()
            description()
            inputsSchemaDefinition().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            name()
            outputsSchemaDefinition().ifPresent { it.validate() }
            patchExamples().ifPresent { it.validate() }
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
            (if (baselineExperimentId.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (inputsSchemaDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (outputsSchemaDefinition.asKnown().getOrNull()?.validity() ?: 0) +
                (patchExamples.asKnown().getOrNull()?.validity() ?: 0) +
                (transformations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                baselineExperimentId == other.baselineExperimentId &&
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
                baselineExperimentId,
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
            "Body{baselineExperimentId=$baselineExperimentId, description=$description, inputsSchemaDefinition=$inputsSchemaDefinition, metadata=$metadata, name=$name, outputsSchemaDefinition=$outputsSchemaDefinition, patchExamples=$patchExamples, transformations=$transformations, additionalProperties=$additionalProperties}"
    }

    /**
     * JSON Schema that example inputs must match. Replaces the current inputs schema as a whole;
     * null removes it, which returns 400 while transformations still point into inputs. Only
     * key-value datasets support schemas. Every existing example must match the new schema,
     * otherwise the request returns 400 with the IDs of the examples that do not, and nothing is
     * changed. Omit to keep the current schema.
     */
    class InputsSchemaDefinition
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

            /**
             * Returns a mutable builder for constructing an instance of [InputsSchemaDefinition].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InputsSchemaDefinition]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputsSchemaDefinition: InputsSchemaDefinition) = apply {
                additionalProperties = inputsSchemaDefinition.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [InputsSchemaDefinition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InputsSchemaDefinition =
                InputsSchemaDefinition(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InputsSchemaDefinition = apply {
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

            return other is InputsSchemaDefinition &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InputsSchemaDefinition{additionalProperties=$additionalProperties}"
    }

    /**
     * Dataset metadata as a JSON object. Replaces the current metadata as a whole; keys are not
     * merged. Send an empty object to clear it. Omit to keep the current metadata.
     */
    class Metadata
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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Metadata = apply {
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /**
     * JSON Schema that example outputs must match. Replaces the current outputs schema as a whole;
     * null removes it, which returns 400 while transformations still point into outputs. Only
     * key-value datasets support schemas. Every existing example must match the new schema,
     * otherwise the request returns 400 with the IDs of the examples that do not, and nothing is
     * changed. Omit to keep the current schema.
     */
    class OutputsSchemaDefinition
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

            /**
             * Returns a mutable builder for constructing an instance of [OutputsSchemaDefinition].
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OutputsSchemaDefinition]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputsSchemaDefinition: OutputsSchemaDefinition) = apply {
                additionalProperties = outputsSchemaDefinition.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OutputsSchemaDefinition].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OutputsSchemaDefinition =
                OutputsSchemaDefinition(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): OutputsSchemaDefinition = apply {
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

            return other is OutputsSchemaDefinition &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OutputsSchemaDefinition{additionalProperties=$additionalProperties}"
    }

    /**
     * Example updates keyed by example ID, applied in the same transaction so existing examples can
     * be fixed to match a new schema. Only used when the request also sets
     * inputs_schema_definition, outputs_schema_definition, or transformations and the dataset ends
     * up with at least one schema; otherwise it is ignored. Each update replaces the inputs,
     * outputs, metadata, or split it sets and keeps the rest; attachment operations are ignored. An
     * ID that is not an example in this dataset returns 404.
     */
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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
