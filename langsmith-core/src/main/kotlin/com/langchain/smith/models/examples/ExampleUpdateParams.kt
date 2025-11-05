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
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a specific example. */
class ExampleUpdateParams
private constructor(
    private val exampleId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun exampleId(): Optional<String> = Optional.ofNullable(exampleId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun attachmentsOperations(): Optional<AttachmentsOperations> = body.attachmentsOperations()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = body.datasetId()

    fun _inputs(): JsonValue = body._inputs()

    fun _metadata(): JsonValue = body._metadata()

    fun _outputs(): JsonValue = body._outputs()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overwrite(): Optional<Boolean> = body.overwrite()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun split(): Optional<Split> = body.split()

    /**
     * Returns the raw JSON value of [attachmentsOperations].
     *
     * Unlike [attachmentsOperations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _attachmentsOperations(): JsonField<AttachmentsOperations> = body._attachmentsOperations()

    /**
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _datasetId(): JsonField<String> = body._datasetId()

    /**
     * Returns the raw JSON value of [overwrite].
     *
     * Unlike [overwrite], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overwrite(): JsonField<Boolean> = body._overwrite()

    /**
     * Returns the raw JSON value of [split].
     *
     * Unlike [split], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _split(): JsonField<Split> = body._split()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExampleUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ExampleUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleUpdateParams]. */
    class Builder internal constructor() {

        private var exampleId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(exampleUpdateParams: ExampleUpdateParams) = apply {
            exampleId = exampleUpdateParams.exampleId
            body = exampleUpdateParams.body.toBuilder()
            additionalHeaders = exampleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = exampleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun exampleId(exampleId: String?) = apply { this.exampleId = exampleId }

        /** Alias for calling [Builder.exampleId] with `exampleId.orElse(null)`. */
        fun exampleId(exampleId: Optional<String>) = exampleId(exampleId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [attachmentsOperations]
         * - [datasetId]
         * - [inputs]
         * - [metadata]
         * - [outputs]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun attachmentsOperations(attachmentsOperations: AttachmentsOperations?) = apply {
            body.attachmentsOperations(attachmentsOperations)
        }

        /**
         * Alias for calling [Builder.attachmentsOperations] with
         * `attachmentsOperations.orElse(null)`.
         */
        fun attachmentsOperations(attachmentsOperations: Optional<AttachmentsOperations>) =
            attachmentsOperations(attachmentsOperations.getOrNull())

        /**
         * Sets [Builder.attachmentsOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attachmentsOperations] with a well-typed
         * [AttachmentsOperations] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun attachmentsOperations(attachmentsOperations: JsonField<AttachmentsOperations>) = apply {
            body.attachmentsOperations(attachmentsOperations)
        }

        fun datasetId(datasetId: String?) = apply { body.datasetId(datasetId) }

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { body.datasetId(datasetId) }

        fun inputs(inputs: JsonValue) = apply { body.inputs(inputs) }

        fun metadata(metadata: JsonValue) = apply { body.metadata(metadata) }

        fun outputs(outputs: JsonValue) = apply { body.outputs(outputs) }

        fun overwrite(overwrite: Boolean) = apply { body.overwrite(overwrite) }

        /**
         * Sets [Builder.overwrite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwrite] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overwrite(overwrite: JsonField<Boolean>) = apply { body.overwrite(overwrite) }

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
         */
        fun build(): ExampleUpdateParams =
            ExampleUpdateParams(
                exampleId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> exampleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Update class for Example. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val attachmentsOperations: JsonField<AttachmentsOperations>,
        private val datasetId: JsonField<String>,
        private val inputs: JsonValue,
        private val metadata: JsonValue,
        private val outputs: JsonValue,
        private val overwrite: JsonField<Boolean>,
        private val split: JsonField<Split>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachments_operations")
            @ExcludeMissing
            attachmentsOperations: JsonField<AttachmentsOperations> = JsonMissing.of(),
            @JsonProperty("dataset_id")
            @ExcludeMissing
            datasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("inputs") @ExcludeMissing inputs: JsonValue = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("outputs") @ExcludeMissing outputs: JsonValue = JsonMissing.of(),
            @JsonProperty("overwrite")
            @ExcludeMissing
            overwrite: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("split") @ExcludeMissing split: JsonField<Split> = JsonMissing.of(),
        ) : this(
            attachmentsOperations,
            datasetId,
            inputs,
            metadata,
            outputs,
            overwrite,
            split,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attachmentsOperations(): Optional<AttachmentsOperations> =
            attachmentsOperations.getOptional("attachments_operations")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

        @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonValue = inputs

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonValue = outputs

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overwrite(): Optional<Boolean> = overwrite.getOptional("overwrite")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun split(): Optional<Split> = split.getOptional("split")

        /**
         * Returns the raw JSON value of [attachmentsOperations].
         *
         * Unlike [attachmentsOperations], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("attachments_operations")
        @ExcludeMissing
        fun _attachmentsOperations(): JsonField<AttachmentsOperations> = attachmentsOperations

        /**
         * Returns the raw JSON value of [datasetId].
         *
         * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

        /**
         * Returns the raw JSON value of [overwrite].
         *
         * Unlike [overwrite], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overwrite") @ExcludeMissing fun _overwrite(): JsonField<Boolean> = overwrite

        /**
         * Returns the raw JSON value of [split].
         *
         * Unlike [split], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("split") @ExcludeMissing fun _split(): JsonField<Split> = split

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

            private var attachmentsOperations: JsonField<AttachmentsOperations> = JsonMissing.of()
            private var datasetId: JsonField<String> = JsonMissing.of()
            private var inputs: JsonValue = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var outputs: JsonValue = JsonMissing.of()
            private var overwrite: JsonField<Boolean> = JsonMissing.of()
            private var split: JsonField<Split> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                attachmentsOperations = body.attachmentsOperations
                datasetId = body.datasetId
                inputs = body.inputs
                metadata = body.metadata
                outputs = body.outputs
                overwrite = body.overwrite
                split = body.split
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun attachmentsOperations(attachmentsOperations: AttachmentsOperations?) =
                attachmentsOperations(JsonField.ofNullable(attachmentsOperations))

            /**
             * Alias for calling [Builder.attachmentsOperations] with
             * `attachmentsOperations.orElse(null)`.
             */
            fun attachmentsOperations(attachmentsOperations: Optional<AttachmentsOperations>) =
                attachmentsOperations(attachmentsOperations.getOrNull())

            /**
             * Sets [Builder.attachmentsOperations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachmentsOperations] with a well-typed
             * [AttachmentsOperations] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun attachmentsOperations(attachmentsOperations: JsonField<AttachmentsOperations>) =
                apply {
                    this.attachmentsOperations = attachmentsOperations
                }

            fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

            /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
            fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

            /**
             * Sets [Builder.datasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

            fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            fun overwrite(overwrite: Boolean) = overwrite(JsonField.of(overwrite))

            /**
             * Sets [Builder.overwrite] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overwrite] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overwrite(overwrite: JsonField<Boolean>) = apply { this.overwrite = overwrite }

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
                    attachmentsOperations,
                    datasetId,
                    inputs,
                    metadata,
                    outputs,
                    overwrite,
                    split,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            attachmentsOperations().ifPresent { it.validate() }
            datasetId()
            overwrite()
            split().ifPresent { it.validate() }
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
            (attachmentsOperations.asKnown().getOrNull()?.validity() ?: 0) +
                (if (datasetId.asKnown().isPresent) 1 else 0) +
                (if (overwrite.asKnown().isPresent) 1 else 0) +
                (split.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                attachmentsOperations == other.attachmentsOperations &&
                datasetId == other.datasetId &&
                inputs == other.inputs &&
                metadata == other.metadata &&
                outputs == other.outputs &&
                overwrite == other.overwrite &&
                split == other.split &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachmentsOperations,
                datasetId,
                inputs,
                metadata,
                outputs,
                overwrite,
                split,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{attachmentsOperations=$attachmentsOperations, datasetId=$datasetId, inputs=$inputs, metadata=$metadata, outputs=$outputs, overwrite=$overwrite, split=$split, additionalProperties=$additionalProperties}"
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

        return other is ExampleUpdateParams &&
            exampleId == other.exampleId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(exampleId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExampleUpdateParams{exampleId=$exampleId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
