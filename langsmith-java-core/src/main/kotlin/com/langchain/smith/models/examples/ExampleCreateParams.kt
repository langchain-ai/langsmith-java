// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new example. */
class ExampleCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun datasetId(): String = body.datasetId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = body.id()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<String> = body.createdAt()

    fun _inputs(): JsonValue = body._inputs()

    fun _metadata(): JsonValue = body._metadata()

    fun _outputs(): JsonValue = body._outputs()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRunId(): Optional<String> = body.sourceRunId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun split(): Optional<Split> = body.split()

    /**
     * Use Legacy Message Format for LLM runs
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useLegacyMessageFormat(): Optional<Boolean> = body.useLegacyMessageFormat()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useSourceRunAttachments(): Optional<List<String>> = body.useSourceRunAttachments()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useSourceRunIo(): Optional<Boolean> = body.useSourceRunIo()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

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
    fun _createdAt(): JsonField<String> = body._createdAt()

    /**
     * Returns the raw JSON value of [sourceRunId].
     *
     * Unlike [sourceRunId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceRunId(): JsonField<String> = body._sourceRunId()

    /**
     * Returns the raw JSON value of [split].
     *
     * Unlike [split], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _split(): JsonField<Split> = body._split()

    /**
     * Returns the raw JSON value of [useLegacyMessageFormat].
     *
     * Unlike [useLegacyMessageFormat], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _useLegacyMessageFormat(): JsonField<Boolean> = body._useLegacyMessageFormat()

    /**
     * Returns the raw JSON value of [useSourceRunAttachments].
     *
     * Unlike [useSourceRunAttachments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _useSourceRunAttachments(): JsonField<List<String>> = body._useSourceRunAttachments()

    /**
     * Returns the raw JSON value of [useSourceRunIo].
     *
     * Unlike [useSourceRunIo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _useSourceRunIo(): JsonField<Boolean> = body._useSourceRunIo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExampleCreateParams].
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleCreateParams: ExampleCreateParams) = apply {
            body = exampleCreateParams.body.toBuilder()
            additionalHeaders = exampleCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [datasetId]
         * - [id]
         * - [createdAt]
         * - [inputs]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun datasetId(datasetId: String) = apply { body.datasetId(datasetId) }

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

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

        fun createdAt(createdAt: String) = apply { body.createdAt(createdAt) }

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { body.createdAt(createdAt) }

        fun inputs(inputs: JsonValue) = apply { body.inputs(inputs) }

        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

        fun outputs(outputs: JsonValue) = apply { body.outputs(outputs) }

        fun sourceRunId(sourceRunId: String?) = apply { body.sourceRunId(sourceRunId) }

        /** Alias for calling [Builder.sourceRunId] with `sourceRunId.orElse(null)`. */
        fun sourceRunId(sourceRunId: Optional<String>) = sourceRunId(sourceRunId.getOrNull())

        /**
         * Sets [Builder.sourceRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRunId(sourceRunId: JsonField<String>) = apply { body.sourceRunId(sourceRunId) }

        fun split(split: Split?) = apply { body.split(split) }

        /** Alias for calling [Builder.split] with `split.orElse(null)`. */
        fun split(split: Optional<Split>) = split(split.getOrNull())

        /**
         * Sets [Builder.split] to an arbitrary JSON value.
         *
         * You should usually call [Builder.split] with a well-typed [Split] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun split(split: JsonField<Split>) = apply { body.split(split) }

        /** Alias for calling [split] with `Split.ofStrings(strings)`. */
        fun splitOfStrings(strings: List<String>) = apply { body.splitOfStrings(strings) }

        /** Alias for calling [split] with `Split.ofString(string)`. */
        fun split(string: String) = apply { body.split(string) }

        /** Use Legacy Message Format for LLM runs */
        fun useLegacyMessageFormat(useLegacyMessageFormat: Boolean) = apply {
            body.useLegacyMessageFormat(useLegacyMessageFormat)
        }

        /**
         * Sets [Builder.useLegacyMessageFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useLegacyMessageFormat] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun useLegacyMessageFormat(useLegacyMessageFormat: JsonField<Boolean>) = apply {
            body.useLegacyMessageFormat(useLegacyMessageFormat)
        }

        fun useSourceRunAttachments(useSourceRunAttachments: List<String>) = apply {
            body.useSourceRunAttachments(useSourceRunAttachments)
        }

        /**
         * Sets [Builder.useSourceRunAttachments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useSourceRunAttachments] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun useSourceRunAttachments(useSourceRunAttachments: JsonField<List<String>>) = apply {
            body.useSourceRunAttachments(useSourceRunAttachments)
        }

        /**
         * Adds a single [String] to [useSourceRunAttachments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUseSourceRunAttachment(useSourceRunAttachment: String) = apply {
            body.addUseSourceRunAttachment(useSourceRunAttachment)
        }

        fun useSourceRunIo(useSourceRunIo: Boolean) = apply { body.useSourceRunIo(useSourceRunIo) }

        /**
         * Sets [Builder.useSourceRunIo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.useSourceRunIo] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun useSourceRunIo(useSourceRunIo: JsonField<Boolean>) = apply {
            body.useSourceRunIo(useSourceRunIo)
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
         * Returns an immutable instance of [ExampleCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .datasetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExampleCreateParams =
            ExampleCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create class for Example. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val datasetId: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<String>,
        private val inputs: JsonValue,
        private val metadata: JsonValue,
        private val outputs: JsonValue,
        private val sourceRunId: JsonField<String>,
        private val split: JsonField<Split>,
        private val useLegacyMessageFormat: JsonField<Boolean>,
        private val useSourceRunAttachments: JsonField<List<String>>,
        private val useSourceRunIo: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
            @JsonProperty("source_run_id")
            @ExcludeMissing
            sourceRunId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("split") @ExcludeMissing split: JsonField<Split> = JsonMissing.of(),
            @JsonProperty("use_legacy_message_format")
            @ExcludeMissing
            useLegacyMessageFormat: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("use_source_run_attachments")
            @ExcludeMissing
            useSourceRunAttachments: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("use_source_run_io")
            @ExcludeMissing
            useSourceRunIo: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            datasetId,
            id,
            createdAt,
            inputs,
            metadata,
            outputs,
            sourceRunId,
            split,
            useLegacyMessageFormat,
            useSourceRunAttachments,
            useSourceRunIo,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun datasetId(): String = datasetId.getRequired("dataset_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun createdAt(): Optional<String> = createdAt.getOptional("created_at")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceRunId(): Optional<String> = sourceRunId.getOptional("source_run_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun split(): Optional<Split> = split.getOptional("split")

        /**
         * Use Legacy Message Format for LLM runs
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useLegacyMessageFormat(): Optional<Boolean> =
            useLegacyMessageFormat.getOptional("use_legacy_message_format")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useSourceRunAttachments(): Optional<List<String>> =
            useSourceRunAttachments.getOptional("use_source_run_attachments")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun useSourceRunIo(): Optional<Boolean> = useSourceRunIo.getOptional("use_source_run_io")

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

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
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

        /**
         * Returns the raw JSON value of [sourceRunId].
         *
         * Unlike [sourceRunId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source_run_id")
        @ExcludeMissing
        fun _sourceRunId(): JsonField<String> = sourceRunId

        /**
         * Returns the raw JSON value of [split].
         *
         * Unlike [split], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("split") @ExcludeMissing fun _split(): JsonField<Split> = split

        /**
         * Returns the raw JSON value of [useLegacyMessageFormat].
         *
         * Unlike [useLegacyMessageFormat], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_legacy_message_format")
        @ExcludeMissing
        fun _useLegacyMessageFormat(): JsonField<Boolean> = useLegacyMessageFormat

        /**
         * Returns the raw JSON value of [useSourceRunAttachments].
         *
         * Unlike [useSourceRunAttachments], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("use_source_run_attachments")
        @ExcludeMissing
        fun _useSourceRunAttachments(): JsonField<List<String>> = useSourceRunAttachments

        /**
         * Returns the raw JSON value of [useSourceRunIo].
         *
         * Unlike [useSourceRunIo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("use_source_run_io")
        @ExcludeMissing
        fun _useSourceRunIo(): JsonField<Boolean> = useSourceRunIo

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
             * .datasetId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var datasetId: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<String> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var sourceRunId: JsonField<String> = JsonMissing.of()
            private var split: JsonField<Split> = JsonMissing.of()
            private var useLegacyMessageFormat: JsonField<Boolean> = JsonMissing.of()
            private var useSourceRunAttachments: JsonField<MutableList<String>>? = null
            private var useSourceRunIo: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                datasetId = body.datasetId
                id = body.id
                createdAt = body.createdAt
                inputs = body.inputs
                metadata = body.metadata
                outputs = body.outputs
                sourceRunId = body.sourceRunId
                split = body.split
                useLegacyMessageFormat = body.useLegacyMessageFormat
                useSourceRunAttachments = body.useSourceRunAttachments.map { it.toMutableList() }
                useSourceRunIo = body.useSourceRunIo
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

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

            fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun sourceRunId(sourceRunId: String?) = sourceRunId(JsonField.ofNullable(sourceRunId))

            /** Alias for calling [Builder.sourceRunId] with `sourceRunId.orElse(null)`. */
            fun sourceRunId(sourceRunId: Optional<String>) = sourceRunId(sourceRunId.getOrNull())

            /**
             * Sets [Builder.sourceRunId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceRunId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceRunId(sourceRunId: JsonField<String>) = apply {
                this.sourceRunId = sourceRunId
            }

            fun split(split: Split?) = split(JsonField.ofNullable(split))

            /** Alias for calling [Builder.split] with `split.orElse(null)`. */
            fun split(split: Optional<Split>) = split(split.getOrNull())

            /**
             * Sets [Builder.split] to an arbitrary JSON value.
             *
             * You should usually call [Builder.split] with a well-typed [Split] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun split(split: JsonField<Split>) = apply { this.split = split }

            /** Alias for calling [split] with `Split.ofStrings(strings)`. */
            fun splitOfStrings(strings: List<String>) = split(Split.ofStrings(strings))

            /** Alias for calling [split] with `Split.ofString(string)`. */
            fun split(string: String) = split(Split.ofString(string))

            /** Use Legacy Message Format for LLM runs */
            fun useLegacyMessageFormat(useLegacyMessageFormat: Boolean) =
                useLegacyMessageFormat(JsonField.of(useLegacyMessageFormat))

            /**
             * Sets [Builder.useLegacyMessageFormat] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useLegacyMessageFormat] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun useLegacyMessageFormat(useLegacyMessageFormat: JsonField<Boolean>) = apply {
                this.useLegacyMessageFormat = useLegacyMessageFormat
            }

            fun useSourceRunAttachments(useSourceRunAttachments: List<String>) =
                useSourceRunAttachments(JsonField.of(useSourceRunAttachments))

            /**
             * Sets [Builder.useSourceRunAttachments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useSourceRunAttachments] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun useSourceRunAttachments(useSourceRunAttachments: JsonField<List<String>>) = apply {
                this.useSourceRunAttachments = useSourceRunAttachments.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [useSourceRunAttachments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUseSourceRunAttachment(useSourceRunAttachment: String) = apply {
                useSourceRunAttachments =
                    (useSourceRunAttachments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("useSourceRunAttachments", it).add(useSourceRunAttachment)
                    }
            }

            fun useSourceRunIo(useSourceRunIo: Boolean) =
                useSourceRunIo(JsonField.of(useSourceRunIo))

            /**
             * Sets [Builder.useSourceRunIo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.useSourceRunIo] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun useSourceRunIo(useSourceRunIo: JsonField<Boolean>) = apply {
                this.useSourceRunIo = useSourceRunIo
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
             * .datasetId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("datasetId", datasetId),
                    id,
                    createdAt,
                    inputs,
                    metadata,
                    outputs,
                    sourceRunId,
                    split,
                    useLegacyMessageFormat,
                    (useSourceRunAttachments ?: JsonMissing.of()).map { it.toImmutable() },
                    useSourceRunIo,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            datasetId()
            id()
            createdAt()
            sourceRunId()
            split().ifPresent { it.validate() }
            useLegacyMessageFormat()
            useSourceRunAttachments()
            useSourceRunIo()
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
            (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (id.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (sourceRunId.asKnown().isPresent) 1 else 0) +
                (split.asKnown().getOrNull()?.validity() ?: 0) +
                (if (useLegacyMessageFormat.asKnown().isPresent) 1 else 0) +
                (useSourceRunAttachments.asKnown().getOrNull()?.size ?: 0) +
                (if (useSourceRunIo.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                datasetId == other.datasetId &&
                id == other.id &&
                createdAt == other.createdAt &&
                inputs == other.inputs &&
                metadata == other.metadata &&
                outputs == other.outputs &&
                sourceRunId == other.sourceRunId &&
                split == other.split &&
                useLegacyMessageFormat == other.useLegacyMessageFormat &&
                useSourceRunAttachments == other.useSourceRunAttachments &&
                useSourceRunIo == other.useSourceRunIo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                datasetId,
                id,
                createdAt,
                inputs,
                metadata,
                outputs,
                sourceRunId,
                split,
                useLegacyMessageFormat,
                useSourceRunAttachments,
                useSourceRunIo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{datasetId=$datasetId, id=$id, createdAt=$createdAt, inputs=$inputs, metadata=$metadata, outputs=$outputs, sourceRunId=$sourceRunId, split=$split, useLegacyMessageFormat=$useLegacyMessageFormat, useSourceRunAttachments=$useSourceRunAttachments, useSourceRunIo=$useSourceRunIo, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Split.Deserializer::class)
    @JsonSerialize(using = Split.Serializer::class)
    class Split
    private constructor(
        private val strings: List<String>? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isStrings(): Boolean = strings != null

        fun isString(): Boolean = string != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                strings != null -> visitor.visitStrings(strings)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Split = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitStrings(strings: List<String>) {}

                    override fun visitString(string: String) {}
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
                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Split && strings == other.strings && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(strings, string)

        override fun toString(): String =
            when {
                strings != null -> "Split{strings=$strings}"
                string != null -> "Split{string=$string}"
                _json != null -> "Split{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Split")
            }

        companion object {

            @JvmStatic fun ofStrings(strings: List<String>) = Split(strings = strings.toImmutable())

            @JvmStatic fun ofString(string: String) = Split(string = string)
        }

        /** An interface that defines how to map each variant of [Split] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Split] to a value of type [T].
             *
             * An instance of [Split] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Split: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Split>(Split::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Split {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Split(strings = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Split(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> Split(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Split>(Split::class) {

            override fun serialize(
                value: Split,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.strings != null -> generator.writeObject(value.strings)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Split")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExampleCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
