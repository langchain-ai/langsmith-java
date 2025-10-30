// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.MultipartField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/**
 * Upload examples from a CSV file.
 *
 * Note: For non-csv upload, please use the POST /v1/platform/datasets/{dataset_id}/examples
 * endpoint which provides more efficient upload.
 */
class ExampleUploadFromCsvParams
private constructor(
    private val datasetId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inputKeys(): List<String> = body.inputKeys()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadataKeys(): Optional<List<String>> = body.metadataKeys()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputKeys(): Optional<List<String>> = body.outputKeys()

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
     * Returns the raw multipart value of [metadataKeys].
     *
     * Unlike [metadataKeys], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _metadataKeys(): MultipartField<List<String>> = body._metadataKeys()

    /**
     * Returns the raw multipart value of [outputKeys].
     *
     * Unlike [outputKeys], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _outputKeys(): MultipartField<List<String>> = body._outputKeys()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleUploadFromCsvParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * .inputKeys()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleUploadFromCsvParams]. */
    class Builder internal constructor() {

        private var datasetId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleUploadFromCsvParams: ExampleUploadFromCsvParams) = apply {
            datasetId = exampleUploadFromCsvParams.datasetId
            body = exampleUploadFromCsvParams.body.toBuilder()
            additionalHeaders = exampleUploadFromCsvParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleUploadFromCsvParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: String?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [inputKeys]
         * - [metadataKeys]
         * - [outputKeys]
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
         * Returns an immutable instance of [ExampleUploadFromCsvParams].
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
        fun build(): ExampleUploadFromCsvParams =
            ExampleUploadFromCsvParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "input_keys" to _inputKeys(),
                "metadata_keys" to _metadataKeys(),
                "output_keys" to _outputKeys(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val inputKeys: MultipartField<List<String>>,
        private val metadataKeys: MultipartField<List<String>>,
        private val outputKeys: MultipartField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun inputKeys(): List<String> = inputKeys.value.getRequired("input_keys")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadataKeys(): Optional<List<String>> = metadataKeys.value.getOptional("metadata_keys")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun outputKeys(): Optional<List<String>> = outputKeys.value.getOptional("output_keys")

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
         * Returns the raw multipart value of [metadataKeys].
         *
         * Unlike [metadataKeys], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata_keys")
        @ExcludeMissing
        fun _metadataKeys(): MultipartField<List<String>> = metadataKeys

        /**
         * Returns the raw multipart value of [outputKeys].
         *
         * Unlike [outputKeys], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("output_keys")
        @ExcludeMissing
        fun _outputKeys(): MultipartField<List<String>> = outputKeys

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
            private var metadataKeys: MultipartField<MutableList<String>>? = null
            private var outputKeys: MultipartField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                inputKeys = body.inputKeys.map { it.toMutableList() }
                metadataKeys = body.metadataKeys.map { it.toMutableList() }
                outputKeys = body.outputKeys.map { it.toMutableList() }
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
                    (metadataKeys ?: MultipartField.of(null)).map { it.toImmutable() },
                    (outputKeys ?: MultipartField.of(null)).map { it.toImmutable() },
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
            metadataKeys()
            outputKeys()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                inputKeys == other.inputKeys &&
                metadataKeys == other.metadataKeys &&
                outputKeys == other.outputKeys &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(file, inputKeys, metadataKeys, outputKeys, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, inputKeys=$inputKeys, metadataKeys=$metadataKeys, outputKeys=$outputKeys, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleUploadFromCsvParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExampleUploadFromCsvParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
