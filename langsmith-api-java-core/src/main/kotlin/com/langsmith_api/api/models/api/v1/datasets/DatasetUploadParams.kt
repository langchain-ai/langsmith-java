// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.MultipartField
import com.langsmith_api.api.core.Params
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.http.Headers
import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/** Create a new dataset from a CSV file. */
class DatasetUploadParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputKeys(): List<String> = body.inputKeys()

    /**
     * Enum for dataset data types.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun dataType(): Optional<DataType> = body.dataType()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputKeyMappings(): Optional<String> = body.inputKeyMappings()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun inputsSchemaDefinition(): Optional<String> = body.inputsSchemaDefinition()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadataKeyMappings(): Optional<String> = body.metadataKeyMappings()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadataKeys(): Optional<List<String>> = body.metadataKeys()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputKeyMappings(): Optional<String> = body.outputKeyMappings()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputKeys(): Optional<List<String>> = body.outputKeys()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun outputsSchemaDefinition(): Optional<String> = body.outputsSchemaDefinition()

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transformations(): Optional<String> = body.transformations()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [inputKeys].
     *
     * Unlike [inputKeys], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _inputKeys(): MultipartField<List<String>> = body._inputKeys()

    /**
     * Returns the raw multipart value of [dataType].
     *
     * Unlike [dataType], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _dataType(): MultipartField<DataType> = body._dataType()

    /**
     * Returns the raw multipart value of [description].
     *
     * Unlike [description], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _description(): MultipartField<String> = body._description()

    /**
     * Returns the raw multipart value of [inputKeyMappings].
     *
     * Unlike [inputKeyMappings], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _inputKeyMappings(): MultipartField<String> = body._inputKeyMappings()

    /**
     * Returns the raw multipart value of [inputsSchemaDefinition].
     *
     * Unlike [inputsSchemaDefinition], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _inputsSchemaDefinition(): MultipartField<String> = body._inputsSchemaDefinition()

    /**
     * Returns the raw multipart value of [metadataKeyMappings].
     *
     * Unlike [metadataKeyMappings], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _metadataKeyMappings(): MultipartField<String> = body._metadataKeyMappings()

    /**
     * Returns the raw multipart value of [metadataKeys].
     *
     * Unlike [metadataKeys], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _metadataKeys(): MultipartField<List<String>> = body._metadataKeys()

    /**
     * Returns the raw multipart value of [name].
     *
     * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _name(): MultipartField<String> = body._name()

    /**
     * Returns the raw multipart value of [outputKeyMappings].
     *
     * Unlike [outputKeyMappings], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _outputKeyMappings(): MultipartField<String> = body._outputKeyMappings()

    /**
     * Returns the raw multipart value of [outputKeys].
     *
     * Unlike [outputKeys], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _outputKeys(): MultipartField<List<String>> = body._outputKeys()

    /**
     * Returns the raw multipart value of [outputsSchemaDefinition].
     *
     * Unlike [outputsSchemaDefinition], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _outputsSchemaDefinition(): MultipartField<String> = body._outputsSchemaDefinition()

    /**
     * Returns the raw multipart value of [transformations].
     *
     * Unlike [transformations], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _transformations(): MultipartField<String> = body._transformations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DatasetUploadParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * .inputKeys()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetUploadParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetUploadParams: DatasetUploadParams) = apply {
            body = datasetUploadParams.body.toBuilder()
            additionalHeaders = datasetUploadParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetUploadParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [inputKeys]
         * - [dataType]
         * - [description]
         * - [inputKeyMappings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        fun file(file: ByteArray) = apply { body.file(file) }

        fun file(path: Path) = apply { body.file(path) }

        fun inputKeys(inputKeys: List<String>) = apply { body.inputKeys(inputKeys) }

        /**
         * Sets [Builder.inputKeys] to an arbitrary multipart value.
         *
         * You should usually call [Builder.inputKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputKeys(inputKeys: MultipartField<List<String>>) = apply { body.inputKeys(inputKeys) }

        /**
         * Adds a single [String] to [inputKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInputKey(inputKey: String) = apply { body.addInputKey(inputKey) }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType) = apply { body.dataType(dataType) }

        /**
         * Sets [Builder.dataType] to an arbitrary multipart value.
         *
         * You should usually call [Builder.dataType] with a well-typed [DataType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataType(dataType: MultipartField<DataType>) = apply { body.dataType(dataType) }

        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary multipart value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: MultipartField<String>) = apply {
            body.description(description)
        }

        fun inputKeyMappings(inputKeyMappings: String?) = apply {
            body.inputKeyMappings(inputKeyMappings)
        }

        /** Alias for calling [Builder.inputKeyMappings] with `inputKeyMappings.orElse(null)`. */
        fun inputKeyMappings(inputKeyMappings: Optional<String>) =
            inputKeyMappings(inputKeyMappings.getOrNull())

        /**
         * Sets [Builder.inputKeyMappings] to an arbitrary multipart value.
         *
         * You should usually call [Builder.inputKeyMappings] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputKeyMappings(inputKeyMappings: MultipartField<String>) = apply {
            body.inputKeyMappings(inputKeyMappings)
        }

        fun inputsSchemaDefinition(inputsSchemaDefinition: String?) = apply {
            body.inputsSchemaDefinition(inputsSchemaDefinition)
        }

        /**
         * Alias for calling [Builder.inputsSchemaDefinition] with
         * `inputsSchemaDefinition.orElse(null)`.
         */
        fun inputsSchemaDefinition(inputsSchemaDefinition: Optional<String>) =
            inputsSchemaDefinition(inputsSchemaDefinition.getOrNull())

        /**
         * Sets [Builder.inputsSchemaDefinition] to an arbitrary multipart value.
         *
         * You should usually call [Builder.inputsSchemaDefinition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun inputsSchemaDefinition(inputsSchemaDefinition: MultipartField<String>) = apply {
            body.inputsSchemaDefinition(inputsSchemaDefinition)
        }

        fun metadataKeyMappings(metadataKeyMappings: String?) = apply {
            body.metadataKeyMappings(metadataKeyMappings)
        }

        /**
         * Alias for calling [Builder.metadataKeyMappings] with `metadataKeyMappings.orElse(null)`.
         */
        fun metadataKeyMappings(metadataKeyMappings: Optional<String>) =
            metadataKeyMappings(metadataKeyMappings.getOrNull())

        /**
         * Sets [Builder.metadataKeyMappings] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadataKeyMappings] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadataKeyMappings(metadataKeyMappings: MultipartField<String>) = apply {
            body.metadataKeyMappings(metadataKeyMappings)
        }

        fun metadataKeys(metadataKeys: List<String>) = apply { body.metadataKeys(metadataKeys) }

        /**
         * Sets [Builder.metadataKeys] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadataKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun metadataKeys(metadataKeys: MultipartField<List<String>>) = apply {
            body.metadataKeys(metadataKeys)
        }

        /**
         * Adds a single [String] to [metadataKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetadataKey(metadataKey: String) = apply { body.addMetadataKey(metadataKey) }

        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary multipart value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: MultipartField<String>) = apply { body.name(name) }

        fun outputKeyMappings(outputKeyMappings: String?) = apply {
            body.outputKeyMappings(outputKeyMappings)
        }

        /** Alias for calling [Builder.outputKeyMappings] with `outputKeyMappings.orElse(null)`. */
        fun outputKeyMappings(outputKeyMappings: Optional<String>) =
            outputKeyMappings(outputKeyMappings.getOrNull())

        /**
         * Sets [Builder.outputKeyMappings] to an arbitrary multipart value.
         *
         * You should usually call [Builder.outputKeyMappings] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputKeyMappings(outputKeyMappings: MultipartField<String>) = apply {
            body.outputKeyMappings(outputKeyMappings)
        }

        fun outputKeys(outputKeys: List<String>) = apply { body.outputKeys(outputKeys) }

        /**
         * Sets [Builder.outputKeys] to an arbitrary multipart value.
         *
         * You should usually call [Builder.outputKeys] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun outputKeys(outputKeys: MultipartField<List<String>>) = apply {
            body.outputKeys(outputKeys)
        }

        /**
         * Adds a single [String] to [outputKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOutputKey(outputKey: String) = apply { body.addOutputKey(outputKey) }

        fun outputsSchemaDefinition(outputsSchemaDefinition: String?) = apply {
            body.outputsSchemaDefinition(outputsSchemaDefinition)
        }

        /**
         * Alias for calling [Builder.outputsSchemaDefinition] with
         * `outputsSchemaDefinition.orElse(null)`.
         */
        fun outputsSchemaDefinition(outputsSchemaDefinition: Optional<String>) =
            outputsSchemaDefinition(outputsSchemaDefinition.getOrNull())

        /**
         * Sets [Builder.outputsSchemaDefinition] to an arbitrary multipart value.
         *
         * You should usually call [Builder.outputsSchemaDefinition] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outputsSchemaDefinition(outputsSchemaDefinition: MultipartField<String>) = apply {
            body.outputsSchemaDefinition(outputsSchemaDefinition)
        }

        fun transformations(transformations: String?) = apply {
            body.transformations(transformations)
        }

        /** Alias for calling [Builder.transformations] with `transformations.orElse(null)`. */
        fun transformations(transformations: Optional<String>) =
            transformations(transformations.getOrNull())

        /**
         * Sets [Builder.transformations] to an arbitrary multipart value.
         *
         * You should usually call [Builder.transformations] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transformations(transformations: MultipartField<String>) = apply {
            body.transformations(transformations)
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
         * Returns an immutable instance of [DatasetUploadParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .file()
         * .inputKeys()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetUploadParams =
            DatasetUploadParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "input_keys" to _inputKeys(),
                "data_type" to _dataType(),
                "description" to _description(),
                "input_key_mappings" to _inputKeyMappings(),
                "inputs_schema_definition" to _inputsSchemaDefinition(),
                "metadata_key_mappings" to _metadataKeyMappings(),
                "metadata_keys" to _metadataKeys(),
                "name" to _name(),
                "output_key_mappings" to _outputKeyMappings(),
                "output_keys" to _outputKeys(),
                "outputs_schema_definition" to _outputsSchemaDefinition(),
                "transformations" to _transformations(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val inputKeys: MultipartField<List<String>>,
        private val dataType: MultipartField<DataType>,
        private val description: MultipartField<String>,
        private val inputKeyMappings: MultipartField<String>,
        private val inputsSchemaDefinition: MultipartField<String>,
        private val metadataKeyMappings: MultipartField<String>,
        private val metadataKeys: MultipartField<List<String>>,
        private val name: MultipartField<String>,
        private val outputKeyMappings: MultipartField<String>,
        private val outputKeys: MultipartField<List<String>>,
        private val outputsSchemaDefinition: MultipartField<String>,
        private val transformations: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputKeys(): List<String> = inputKeys.value.getRequired("input_keys")

        /**
         * Enum for dataset data types.
         *
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun dataType(): Optional<DataType> = dataType.value.getOptional("data_type")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.value.getOptional("description")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun inputKeyMappings(): Optional<String> =
            inputKeyMappings.value.getOptional("input_key_mappings")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun inputsSchemaDefinition(): Optional<String> =
            inputsSchemaDefinition.value.getOptional("inputs_schema_definition")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadataKeyMappings(): Optional<String> =
            metadataKeyMappings.value.getOptional("metadata_key_mappings")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadataKeys(): Optional<List<String>> = metadataKeys.value.getOptional("metadata_keys")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.value.getOptional("name")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun outputKeyMappings(): Optional<String> =
            outputKeyMappings.value.getOptional("output_key_mappings")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun outputKeys(): Optional<List<String>> = outputKeys.value.getOptional("output_keys")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun outputsSchemaDefinition(): Optional<String> =
            outputsSchemaDefinition.value.getOptional("outputs_schema_definition")

        /**
         * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun transformations(): Optional<String> =
            transformations.value.getOptional("transformations")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [inputKeys].
         *
         * Unlike [inputKeys], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("input_keys")
        @ExcludeMissing
        fun _inputKeys(): MultipartField<List<String>> = inputKeys

        /**
         * Returns the raw multipart value of [dataType].
         *
         * Unlike [dataType], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("data_type")
        @ExcludeMissing
        fun _dataType(): MultipartField<DataType> = dataType

        /**
         * Returns the raw multipart value of [description].
         *
         * Unlike [description], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): MultipartField<String> = description

        /**
         * Returns the raw multipart value of [inputKeyMappings].
         *
         * Unlike [inputKeyMappings], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("input_key_mappings")
        @ExcludeMissing
        fun _inputKeyMappings(): MultipartField<String> = inputKeyMappings

        /**
         * Returns the raw multipart value of [inputsSchemaDefinition].
         *
         * Unlike [inputsSchemaDefinition], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("inputs_schema_definition")
        @ExcludeMissing
        fun _inputsSchemaDefinition(): MultipartField<String> = inputsSchemaDefinition

        /**
         * Returns the raw multipart value of [metadataKeyMappings].
         *
         * Unlike [metadataKeyMappings], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("metadata_key_mappings")
        @ExcludeMissing
        fun _metadataKeyMappings(): MultipartField<String> = metadataKeyMappings

        /**
         * Returns the raw multipart value of [metadataKeys].
         *
         * Unlike [metadataKeys], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata_keys")
        @ExcludeMissing
        fun _metadataKeys(): MultipartField<List<String>> = metadataKeys

        /**
         * Returns the raw multipart value of [name].
         *
         * Unlike [name], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): MultipartField<String> = name

        /**
         * Returns the raw multipart value of [outputKeyMappings].
         *
         * Unlike [outputKeyMappings], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("output_key_mappings")
        @ExcludeMissing
        fun _outputKeyMappings(): MultipartField<String> = outputKeyMappings

        /**
         * Returns the raw multipart value of [outputKeys].
         *
         * Unlike [outputKeys], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("output_keys")
        @ExcludeMissing
        fun _outputKeys(): MultipartField<List<String>> = outputKeys

        /**
         * Returns the raw multipart value of [outputsSchemaDefinition].
         *
         * Unlike [outputsSchemaDefinition], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("outputs_schema_definition")
        @ExcludeMissing
        fun _outputsSchemaDefinition(): MultipartField<String> = outputsSchemaDefinition

        /**
         * Returns the raw multipart value of [transformations].
         *
         * Unlike [transformations], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("transformations")
        @ExcludeMissing
        fun _transformations(): MultipartField<String> = transformations

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
             * .file()
             * .inputKeys()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var inputKeys: MultipartField<MutableList<String>>? = null
            private var dataType: MultipartField<DataType> = MultipartField.of(null)
            private var description: MultipartField<String> = MultipartField.of(null)
            private var inputKeyMappings: MultipartField<String> = MultipartField.of(null)
            private var inputsSchemaDefinition: MultipartField<String> = MultipartField.of(null)
            private var metadataKeyMappings: MultipartField<String> = MultipartField.of(null)
            private var metadataKeys: MultipartField<MutableList<String>>? = null
            private var name: MultipartField<String> = MultipartField.of(null)
            private var outputKeyMappings: MultipartField<String> = MultipartField.of(null)
            private var outputKeys: MultipartField<MutableList<String>>? = null
            private var outputsSchemaDefinition: MultipartField<String> = MultipartField.of(null)
            private var transformations: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                inputKeys = body.inputKeys.map { it.toMutableList() }
                dataType = body.dataType
                description = body.description
                inputKeyMappings = body.inputKeyMappings
                inputsSchemaDefinition = body.inputsSchemaDefinition
                metadataKeyMappings = body.metadataKeyMappings
                metadataKeys = body.metadataKeys.map { it.toMutableList() }
                name = body.name
                outputKeyMappings = body.outputKeyMappings
                outputKeys = body.outputKeys.map { it.toMutableList() }
                outputsSchemaDefinition = body.outputsSchemaDefinition
                transformations = body.transformations
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            fun file(file: ByteArray) = file(file.inputStream())

            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            fun inputKeys(inputKeys: List<String>) = inputKeys(MultipartField.of(inputKeys))

            /**
             * Sets [Builder.inputKeys] to an arbitrary multipart value.
             *
             * You should usually call [Builder.inputKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputKeys(inputKeys: MultipartField<List<String>>) = apply {
                this.inputKeys = inputKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [inputKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addInputKey(inputKey: String) = apply {
                inputKeys =
                    (inputKeys ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("inputKeys", it).add(inputKey)
                    }
            }

            /** Enum for dataset data types. */
            fun dataType(dataType: DataType) = dataType(MultipartField.of(dataType))

            /**
             * Sets [Builder.dataType] to an arbitrary multipart value.
             *
             * You should usually call [Builder.dataType] with a well-typed [DataType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dataType(dataType: MultipartField<DataType>) = apply { this.dataType = dataType }

            fun description(description: String?) = description(MultipartField.of(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary multipart value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: MultipartField<String>) = apply {
                this.description = description
            }

            fun inputKeyMappings(inputKeyMappings: String?) =
                inputKeyMappings(MultipartField.of(inputKeyMappings))

            /**
             * Alias for calling [Builder.inputKeyMappings] with `inputKeyMappings.orElse(null)`.
             */
            fun inputKeyMappings(inputKeyMappings: Optional<String>) =
                inputKeyMappings(inputKeyMappings.getOrNull())

            /**
             * Sets [Builder.inputKeyMappings] to an arbitrary multipart value.
             *
             * You should usually call [Builder.inputKeyMappings] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inputKeyMappings(inputKeyMappings: MultipartField<String>) = apply {
                this.inputKeyMappings = inputKeyMappings
            }

            fun inputsSchemaDefinition(inputsSchemaDefinition: String?) =
                inputsSchemaDefinition(MultipartField.of(inputsSchemaDefinition))

            /**
             * Alias for calling [Builder.inputsSchemaDefinition] with
             * `inputsSchemaDefinition.orElse(null)`.
             */
            fun inputsSchemaDefinition(inputsSchemaDefinition: Optional<String>) =
                inputsSchemaDefinition(inputsSchemaDefinition.getOrNull())

            /**
             * Sets [Builder.inputsSchemaDefinition] to an arbitrary multipart value.
             *
             * You should usually call [Builder.inputsSchemaDefinition] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun inputsSchemaDefinition(inputsSchemaDefinition: MultipartField<String>) = apply {
                this.inputsSchemaDefinition = inputsSchemaDefinition
            }

            fun metadataKeyMappings(metadataKeyMappings: String?) =
                metadataKeyMappings(MultipartField.of(metadataKeyMappings))

            /**
             * Alias for calling [Builder.metadataKeyMappings] with
             * `metadataKeyMappings.orElse(null)`.
             */
            fun metadataKeyMappings(metadataKeyMappings: Optional<String>) =
                metadataKeyMappings(metadataKeyMappings.getOrNull())

            /**
             * Sets [Builder.metadataKeyMappings] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadataKeyMappings] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun metadataKeyMappings(metadataKeyMappings: MultipartField<String>) = apply {
                this.metadataKeyMappings = metadataKeyMappings
            }

            fun metadataKeys(metadataKeys: List<String>) =
                metadataKeys(MultipartField.of(metadataKeys))

            /**
             * Sets [Builder.metadataKeys] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadataKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadataKeys(metadataKeys: MultipartField<List<String>>) = apply {
                this.metadataKeys = metadataKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [metadataKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addMetadataKey(metadataKey: String) = apply {
                metadataKeys =
                    (metadataKeys ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("metadataKeys", it).add(metadataKey)
                    }
            }

            fun name(name: String?) = name(MultipartField.of(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary multipart value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: MultipartField<String>) = apply { this.name = name }

            fun outputKeyMappings(outputKeyMappings: String?) =
                outputKeyMappings(MultipartField.of(outputKeyMappings))

            /**
             * Alias for calling [Builder.outputKeyMappings] with `outputKeyMappings.orElse(null)`.
             */
            fun outputKeyMappings(outputKeyMappings: Optional<String>) =
                outputKeyMappings(outputKeyMappings.getOrNull())

            /**
             * Sets [Builder.outputKeyMappings] to an arbitrary multipart value.
             *
             * You should usually call [Builder.outputKeyMappings] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputKeyMappings(outputKeyMappings: MultipartField<String>) = apply {
                this.outputKeyMappings = outputKeyMappings
            }

            fun outputKeys(outputKeys: List<String>) = outputKeys(MultipartField.of(outputKeys))

            /**
             * Sets [Builder.outputKeys] to an arbitrary multipart value.
             *
             * You should usually call [Builder.outputKeys] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun outputKeys(outputKeys: MultipartField<List<String>>) = apply {
                this.outputKeys = outputKeys.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [outputKeys].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOutputKey(outputKey: String) = apply {
                outputKeys =
                    (outputKeys ?: MultipartField.of(mutableListOf())).also {
                        checkKnown("outputKeys", it).add(outputKey)
                    }
            }

            fun outputsSchemaDefinition(outputsSchemaDefinition: String?) =
                outputsSchemaDefinition(MultipartField.of(outputsSchemaDefinition))

            /**
             * Alias for calling [Builder.outputsSchemaDefinition] with
             * `outputsSchemaDefinition.orElse(null)`.
             */
            fun outputsSchemaDefinition(outputsSchemaDefinition: Optional<String>) =
                outputsSchemaDefinition(outputsSchemaDefinition.getOrNull())

            /**
             * Sets [Builder.outputsSchemaDefinition] to an arbitrary multipart value.
             *
             * You should usually call [Builder.outputsSchemaDefinition] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun outputsSchemaDefinition(outputsSchemaDefinition: MultipartField<String>) = apply {
                this.outputsSchemaDefinition = outputsSchemaDefinition
            }

            fun transformations(transformations: String?) =
                transformations(MultipartField.of(transformations))

            /** Alias for calling [Builder.transformations] with `transformations.orElse(null)`. */
            fun transformations(transformations: Optional<String>) =
                transformations(transformations.getOrNull())

            /**
             * Sets [Builder.transformations] to an arbitrary multipart value.
             *
             * You should usually call [Builder.transformations] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transformations(transformations: MultipartField<String>) = apply {
                this.transformations = transformations
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
             * .file()
             * .inputKeys()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("file", file),
                    checkRequired("inputKeys", inputKeys).map { it.toImmutable() },
                    dataType,
                    description,
                    inputKeyMappings,
                    inputsSchemaDefinition,
                    metadataKeyMappings,
                    (metadataKeys ?: MultipartField.of(null)).map { it.toImmutable() },
                    name,
                    outputKeyMappings,
                    (outputKeys ?: MultipartField.of(null)).map { it.toImmutable() },
                    outputsSchemaDefinition,
                    transformations,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            inputKeys()
            dataType().ifPresent { it.validate() }
            description()
            inputKeyMappings()
            inputsSchemaDefinition()
            metadataKeyMappings()
            metadataKeys()
            name()
            outputKeyMappings()
            outputKeys()
            outputsSchemaDefinition()
            transformations()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                inputKeys == other.inputKeys &&
                dataType == other.dataType &&
                description == other.description &&
                inputKeyMappings == other.inputKeyMappings &&
                inputsSchemaDefinition == other.inputsSchemaDefinition &&
                metadataKeyMappings == other.metadataKeyMappings &&
                metadataKeys == other.metadataKeys &&
                name == other.name &&
                outputKeyMappings == other.outputKeyMappings &&
                outputKeys == other.outputKeys &&
                outputsSchemaDefinition == other.outputsSchemaDefinition &&
                transformations == other.transformations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                file,
                inputKeys,
                dataType,
                description,
                inputKeyMappings,
                inputsSchemaDefinition,
                metadataKeyMappings,
                metadataKeys,
                name,
                outputKeyMappings,
                outputKeys,
                outputsSchemaDefinition,
                transformations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, inputKeys=$inputKeys, dataType=$dataType, description=$description, inputKeyMappings=$inputKeyMappings, inputsSchemaDefinition=$inputsSchemaDefinition, metadataKeyMappings=$metadataKeyMappings, metadataKeys=$metadataKeys, name=$name, outputKeyMappings=$outputKeyMappings, outputKeys=$outputKeys, outputsSchemaDefinition=$outputsSchemaDefinition, transformations=$transformations, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetUploadParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetUploadParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
