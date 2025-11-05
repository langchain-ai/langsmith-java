// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.datasets.examples

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.MultipartField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name
import kotlin.jvm.optionals.getOrNull

/**
 * This endpoint allows clients to update existing examples in a specified dataset by sending a
 * multipart/form-data PATCH request. Each form part contains either JSON-encoded data or binary
 * attachment files to update an example.
 */
class ExampleUpdateParams
private constructor(
    private val datasetId: JsonValue?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun datasetId(): Optional<JsonValue> = Optional.ofNullable(datasetId)

    /**
     * The Example update info as JSON. Can have fields 'metadata', 'split'
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun exampleId(): InputStream = body.exampleId()

    /**
     * New file attachment named {name}
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIdAttachmentName(): Optional<InputStream> = body.exampleIdAttachmentName()

    /**
     * JSON describing attachment operations (retain, rename)
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIdAttachmentsOperations(): Optional<InputStream> =
        body.exampleIdAttachmentsOperations()

    /**
     * The updated Example inputs as JSON
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIdInputs(): Optional<InputStream> = body.exampleIdInputs()

    /**
     * The updated Example outputs as JSON
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exampleIdOutputs(): Optional<InputStream> = body.exampleIdOutputs()

    /**
     * Returns the raw multipart value of [exampleId].
     *
     * Unlike [exampleId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _exampleId(): MultipartField<InputStream> = body._exampleId()

    /**
     * Returns the raw multipart value of [exampleIdAttachmentName].
     *
     * Unlike [exampleIdAttachmentName], this method doesn't throw if the multipart field has an
     * unexpected type.
     */
    fun _exampleIdAttachmentName(): MultipartField<InputStream> = body._exampleIdAttachmentName()

    /**
     * Returns the raw multipart value of [exampleIdAttachmentsOperations].
     *
     * Unlike [exampleIdAttachmentsOperations], this method doesn't throw if the multipart field has
     * an unexpected type.
     */
    fun _exampleIdAttachmentsOperations(): MultipartField<InputStream> =
        body._exampleIdAttachmentsOperations()

    /**
     * Returns the raw multipart value of [exampleIdInputs].
     *
     * Unlike [exampleIdInputs], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _exampleIdInputs(): MultipartField<InputStream> = body._exampleIdInputs()

    /**
     * Returns the raw multipart value of [exampleIdOutputs].
     *
     * Unlike [exampleIdOutputs], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _exampleIdOutputs(): MultipartField<InputStream> = body._exampleIdOutputs()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .exampleId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleUpdateParams]. */
    class Builder internal constructor() {

        private var datasetId: JsonValue? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleUpdateParams: ExampleUpdateParams) = apply {
            datasetId = exampleUpdateParams.datasetId
            body = exampleUpdateParams.body.toBuilder()
            additionalHeaders = exampleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun datasetId(datasetId: JsonValue?) = apply { this.datasetId = datasetId }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<JsonValue>) = datasetId(datasetId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [exampleId]
         * - [exampleIdAttachmentName]
         * - [exampleIdAttachmentsOperations]
         * - [exampleIdInputs]
         * - [exampleIdOutputs]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Example update info as JSON. Can have fields 'metadata', 'split' */
        fun exampleId(exampleId: InputStream) = apply { body.exampleId(exampleId) }

        /**
         * Sets [Builder.exampleId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.exampleId] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleId(exampleId: MultipartField<InputStream>) = apply { body.exampleId(exampleId) }

        /** The Example update info as JSON. Can have fields 'metadata', 'split' */
        fun exampleId(exampleId: ByteArray) = apply { body.exampleId(exampleId) }

        /** The Example update info as JSON. Can have fields 'metadata', 'split' */
        fun exampleId(path: Path) = apply { body.exampleId(path) }

        /** New file attachment named {name} */
        fun exampleIdAttachmentName(exampleIdAttachmentName: InputStream) = apply {
            body.exampleIdAttachmentName(exampleIdAttachmentName)
        }

        /**
         * Sets [Builder.exampleIdAttachmentName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.exampleIdAttachmentName] with a well-typed [InputStream]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun exampleIdAttachmentName(exampleIdAttachmentName: MultipartField<InputStream>) = apply {
            body.exampleIdAttachmentName(exampleIdAttachmentName)
        }

        /** New file attachment named {name} */
        fun exampleIdAttachmentName(exampleIdAttachmentName: ByteArray) = apply {
            body.exampleIdAttachmentName(exampleIdAttachmentName)
        }

        /** New file attachment named {name} */
        fun exampleIdAttachmentName(path: Path) = apply { body.exampleIdAttachmentName(path) }

        /** JSON describing attachment operations (retain, rename) */
        fun exampleIdAttachmentsOperations(exampleIdAttachmentsOperations: InputStream) = apply {
            body.exampleIdAttachmentsOperations(exampleIdAttachmentsOperations)
        }

        /**
         * Sets [Builder.exampleIdAttachmentsOperations] to an arbitrary multipart value.
         *
         * You should usually call [Builder.exampleIdAttachmentsOperations] with a well-typed
         * [InputStream] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun exampleIdAttachmentsOperations(
            exampleIdAttachmentsOperations: MultipartField<InputStream>
        ) = apply { body.exampleIdAttachmentsOperations(exampleIdAttachmentsOperations) }

        /** JSON describing attachment operations (retain, rename) */
        fun exampleIdAttachmentsOperations(exampleIdAttachmentsOperations: ByteArray) = apply {
            body.exampleIdAttachmentsOperations(exampleIdAttachmentsOperations)
        }

        /** JSON describing attachment operations (retain, rename) */
        fun exampleIdAttachmentsOperations(path: Path) = apply {
            body.exampleIdAttachmentsOperations(path)
        }

        /** The updated Example inputs as JSON */
        fun exampleIdInputs(exampleIdInputs: InputStream) = apply {
            body.exampleIdInputs(exampleIdInputs)
        }

        /**
         * Sets [Builder.exampleIdInputs] to an arbitrary multipart value.
         *
         * You should usually call [Builder.exampleIdInputs] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleIdInputs(exampleIdInputs: MultipartField<InputStream>) = apply {
            body.exampleIdInputs(exampleIdInputs)
        }

        /** The updated Example inputs as JSON */
        fun exampleIdInputs(exampleIdInputs: ByteArray) = apply {
            body.exampleIdInputs(exampleIdInputs)
        }

        /** The updated Example inputs as JSON */
        fun exampleIdInputs(path: Path) = apply { body.exampleIdInputs(path) }

        /** The updated Example outputs as JSON */
        fun exampleIdOutputs(exampleIdOutputs: InputStream) = apply {
            body.exampleIdOutputs(exampleIdOutputs)
        }

        /**
         * Sets [Builder.exampleIdOutputs] to an arbitrary multipart value.
         *
         * You should usually call [Builder.exampleIdOutputs] with a well-typed [InputStream] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun exampleIdOutputs(exampleIdOutputs: MultipartField<InputStream>) = apply {
            body.exampleIdOutputs(exampleIdOutputs)
        }

        /** The updated Example outputs as JSON */
        fun exampleIdOutputs(exampleIdOutputs: ByteArray) = apply {
            body.exampleIdOutputs(exampleIdOutputs)
        }

        /** The updated Example outputs as JSON */
        fun exampleIdOutputs(path: Path) = apply { body.exampleIdOutputs(path) }

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
         * Returns an immutable instance of [ExampleUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .exampleId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExampleUpdateParams =
            ExampleUpdateParams(
                datasetId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "{example_id}" to _exampleId(),
                "{example_id}.attachment.{name}" to _exampleIdAttachmentName(),
                "{example_id}.attachments_operations" to _exampleIdAttachmentsOperations(),
                "{example_id}.inputs" to _exampleIdInputs(),
                "{example_id}.outputs" to _exampleIdOutputs(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> datasetId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val exampleId: MultipartField<InputStream>,
        private val exampleIdAttachmentName: MultipartField<InputStream>,
        private val exampleIdAttachmentsOperations: MultipartField<InputStream>,
        private val exampleIdInputs: MultipartField<InputStream>,
        private val exampleIdOutputs: MultipartField<InputStream>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * The Example update info as JSON. Can have fields 'metadata', 'split'
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun exampleId(): InputStream = exampleId.value.getRequired("{example_id}")

        /**
         * New file attachment named {name}
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleIdAttachmentName(): Optional<InputStream> =
            exampleIdAttachmentName.value.getOptional("{example_id}.attachment.{name}")

        /**
         * JSON describing attachment operations (retain, rename)
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleIdAttachmentsOperations(): Optional<InputStream> =
            exampleIdAttachmentsOperations.value.getOptional("{example_id}.attachments_operations")

        /**
         * The updated Example inputs as JSON
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleIdInputs(): Optional<InputStream> =
            exampleIdInputs.value.getOptional("{example_id}.inputs")

        /**
         * The updated Example outputs as JSON
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun exampleIdOutputs(): Optional<InputStream> =
            exampleIdOutputs.value.getOptional("{example_id}.outputs")

        /**
         * Returns the raw multipart value of [exampleId].
         *
         * Unlike [exampleId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("{example_id}")
        @ExcludeMissing
        fun _exampleId(): MultipartField<InputStream> = exampleId

        /**
         * Returns the raw multipart value of [exampleIdAttachmentName].
         *
         * Unlike [exampleIdAttachmentName], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("{example_id}.attachment.{name}")
        @ExcludeMissing
        fun _exampleIdAttachmentName(): MultipartField<InputStream> = exampleIdAttachmentName

        /**
         * Returns the raw multipart value of [exampleIdAttachmentsOperations].
         *
         * Unlike [exampleIdAttachmentsOperations], this method doesn't throw if the multipart field
         * has an unexpected type.
         */
        @JsonProperty("{example_id}.attachments_operations")
        @ExcludeMissing
        fun _exampleIdAttachmentsOperations(): MultipartField<InputStream> =
            exampleIdAttachmentsOperations

        /**
         * Returns the raw multipart value of [exampleIdInputs].
         *
         * Unlike [exampleIdInputs], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("{example_id}.inputs")
        @ExcludeMissing
        fun _exampleIdInputs(): MultipartField<InputStream> = exampleIdInputs

        /**
         * Returns the raw multipart value of [exampleIdOutputs].
         *
         * Unlike [exampleIdOutputs], this method doesn't throw if the multipart field has an
         * unexpected type.
         */
        @JsonProperty("{example_id}.outputs")
        @ExcludeMissing
        fun _exampleIdOutputs(): MultipartField<InputStream> = exampleIdOutputs

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
             * .exampleId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var exampleId: MultipartField<InputStream>? = null
            private var exampleIdAttachmentName: MultipartField<InputStream> =
                MultipartField.of(null)
            private var exampleIdAttachmentsOperations: MultipartField<InputStream> =
                MultipartField.of(null)
            private var exampleIdInputs: MultipartField<InputStream> = MultipartField.of(null)
            private var exampleIdOutputs: MultipartField<InputStream> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                exampleId = body.exampleId
                exampleIdAttachmentName = body.exampleIdAttachmentName
                exampleIdAttachmentsOperations = body.exampleIdAttachmentsOperations
                exampleIdInputs = body.exampleIdInputs
                exampleIdOutputs = body.exampleIdOutputs
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Example update info as JSON. Can have fields 'metadata', 'split' */
            fun exampleId(exampleId: InputStream) = exampleId(MultipartField.of(exampleId))

            /**
             * Sets [Builder.exampleId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.exampleId] with a well-typed [InputStream] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun exampleId(exampleId: MultipartField<InputStream>) = apply {
                this.exampleId = exampleId
            }

            /** The Example update info as JSON. Can have fields 'metadata', 'split' */
            fun exampleId(exampleId: ByteArray) = exampleId(exampleId.inputStream())

            /** The Example update info as JSON. Can have fields 'metadata', 'split' */
            fun exampleId(path: Path) =
                exampleId(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** New file attachment named {name} */
            fun exampleIdAttachmentName(exampleIdAttachmentName: InputStream) =
                exampleIdAttachmentName(MultipartField.of(exampleIdAttachmentName))

            /**
             * Sets [Builder.exampleIdAttachmentName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.exampleIdAttachmentName] with a well-typed
             * [InputStream] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun exampleIdAttachmentName(exampleIdAttachmentName: MultipartField<InputStream>) =
                apply {
                    this.exampleIdAttachmentName = exampleIdAttachmentName
                }

            /** New file attachment named {name} */
            fun exampleIdAttachmentName(exampleIdAttachmentName: ByteArray) =
                exampleIdAttachmentName(exampleIdAttachmentName.inputStream())

            /** New file attachment named {name} */
            fun exampleIdAttachmentName(path: Path) =
                exampleIdAttachmentName(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** JSON describing attachment operations (retain, rename) */
            fun exampleIdAttachmentsOperations(exampleIdAttachmentsOperations: InputStream) =
                exampleIdAttachmentsOperations(MultipartField.of(exampleIdAttachmentsOperations))

            /**
             * Sets [Builder.exampleIdAttachmentsOperations] to an arbitrary multipart value.
             *
             * You should usually call [Builder.exampleIdAttachmentsOperations] with a well-typed
             * [InputStream] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun exampleIdAttachmentsOperations(
                exampleIdAttachmentsOperations: MultipartField<InputStream>
            ) = apply { this.exampleIdAttachmentsOperations = exampleIdAttachmentsOperations }

            /** JSON describing attachment operations (retain, rename) */
            fun exampleIdAttachmentsOperations(exampleIdAttachmentsOperations: ByteArray) =
                exampleIdAttachmentsOperations(exampleIdAttachmentsOperations.inputStream())

            /** JSON describing attachment operations (retain, rename) */
            fun exampleIdAttachmentsOperations(path: Path) =
                exampleIdAttachmentsOperations(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** The updated Example inputs as JSON */
            fun exampleIdInputs(exampleIdInputs: InputStream) =
                exampleIdInputs(MultipartField.of(exampleIdInputs))

            /**
             * Sets [Builder.exampleIdInputs] to an arbitrary multipart value.
             *
             * You should usually call [Builder.exampleIdInputs] with a well-typed [InputStream]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exampleIdInputs(exampleIdInputs: MultipartField<InputStream>) = apply {
                this.exampleIdInputs = exampleIdInputs
            }

            /** The updated Example inputs as JSON */
            fun exampleIdInputs(exampleIdInputs: ByteArray) =
                exampleIdInputs(exampleIdInputs.inputStream())

            /** The updated Example inputs as JSON */
            fun exampleIdInputs(path: Path) =
                exampleIdInputs(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** The updated Example outputs as JSON */
            fun exampleIdOutputs(exampleIdOutputs: InputStream) =
                exampleIdOutputs(MultipartField.of(exampleIdOutputs))

            /**
             * Sets [Builder.exampleIdOutputs] to an arbitrary multipart value.
             *
             * You should usually call [Builder.exampleIdOutputs] with a well-typed [InputStream]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun exampleIdOutputs(exampleIdOutputs: MultipartField<InputStream>) = apply {
                this.exampleIdOutputs = exampleIdOutputs
            }

            /** The updated Example outputs as JSON */
            fun exampleIdOutputs(exampleIdOutputs: ByteArray) =
                exampleIdOutputs(exampleIdOutputs.inputStream())

            /** The updated Example outputs as JSON */
            fun exampleIdOutputs(path: Path) =
                exampleIdOutputs(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

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
             * .exampleId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("exampleId", exampleId),
                    exampleIdAttachmentName,
                    exampleIdAttachmentsOperations,
                    exampleIdInputs,
                    exampleIdOutputs,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            exampleId()
            exampleIdAttachmentName()
            exampleIdAttachmentsOperations()
            exampleIdInputs()
            exampleIdOutputs()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                exampleId == other.exampleId &&
                exampleIdAttachmentName == other.exampleIdAttachmentName &&
                exampleIdAttachmentsOperations == other.exampleIdAttachmentsOperations &&
                exampleIdInputs == other.exampleIdInputs &&
                exampleIdOutputs == other.exampleIdOutputs &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                exampleId,
                exampleIdAttachmentName,
                exampleIdAttachmentsOperations,
                exampleIdInputs,
                exampleIdOutputs,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{exampleId=$exampleId, exampleIdAttachmentName=$exampleIdAttachmentName, exampleIdAttachmentsOperations=$exampleIdAttachmentsOperations, exampleIdInputs=$exampleIdInputs, exampleIdOutputs=$exampleIdOutputs, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleUpdateParams &&
            datasetId == other.datasetId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(datasetId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExampleUpdateParams{datasetId=$datasetId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
