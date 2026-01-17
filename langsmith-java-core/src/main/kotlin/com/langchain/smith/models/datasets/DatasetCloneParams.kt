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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Clone a dataset. */
class DatasetCloneParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceDatasetId(): String = body.sourceDatasetId()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetDatasetId(): String = body.targetDatasetId()

    /**
     * Only modifications made on or before this time are included. If None, the latest version of
     * the dataset is used.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun asOf(): Optional<AsOf> = body.asOf()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun examples(): Optional<List<String>> = body.examples()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun split(): Optional<Split> = body.split()

    /**
     * Returns the raw JSON value of [sourceDatasetId].
     *
     * Unlike [sourceDatasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _sourceDatasetId(): JsonField<String> = body._sourceDatasetId()

    /**
     * Returns the raw JSON value of [targetDatasetId].
     *
     * Unlike [targetDatasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _targetDatasetId(): JsonField<String> = body._targetDatasetId()

    /**
     * Returns the raw JSON value of [asOf].
     *
     * Unlike [asOf], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _asOf(): JsonField<AsOf> = body._asOf()

    /**
     * Returns the raw JSON value of [examples].
     *
     * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _examples(): JsonField<List<String>> = body._examples()

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

        /**
         * Returns a mutable builder for constructing an instance of [DatasetCloneParams].
         *
         * The following fields are required:
         * ```java
         * .sourceDatasetId()
         * .targetDatasetId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DatasetCloneParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(datasetCloneParams: DatasetCloneParams) = apply {
            body = datasetCloneParams.body.toBuilder()
            additionalHeaders = datasetCloneParams.additionalHeaders.toBuilder()
            additionalQueryParams = datasetCloneParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [sourceDatasetId]
         * - [targetDatasetId]
         * - [asOf]
         * - [examples]
         * - [split]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun sourceDatasetId(sourceDatasetId: String) = apply {
            body.sourceDatasetId(sourceDatasetId)
        }

        /**
         * Sets [Builder.sourceDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceDatasetId(sourceDatasetId: JsonField<String>) = apply {
            body.sourceDatasetId(sourceDatasetId)
        }

        fun targetDatasetId(targetDatasetId: String) = apply {
            body.targetDatasetId(targetDatasetId)
        }

        /**
         * Sets [Builder.targetDatasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetDatasetId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetDatasetId(targetDatasetId: JsonField<String>) = apply {
            body.targetDatasetId(targetDatasetId)
        }

        /**
         * Only modifications made on or before this time are included. If None, the latest version
         * of the dataset is used.
         */
        fun asOf(asOf: AsOf?) = apply { body.asOf(asOf) }

        /** Alias for calling [Builder.asOf] with `asOf.orElse(null)`. */
        fun asOf(asOf: Optional<AsOf>) = asOf(asOf.getOrNull())

        /**
         * Sets [Builder.asOf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asOf] with a well-typed [AsOf] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun asOf(asOf: JsonField<AsOf>) = apply { body.asOf(asOf) }

        /** Alias for calling [asOf] with `AsOf.ofOffsetDateTime(offsetDateTime)`. */
        fun asOf(offsetDateTime: OffsetDateTime) = apply { body.asOf(offsetDateTime) }

        /** Alias for calling [asOf] with `AsOf.ofString(string)`. */
        fun asOf(string: String) = apply { body.asOf(string) }

        fun examples(examples: List<String>) = apply { body.examples(examples) }

        /**
         * Sets [Builder.examples] to an arbitrary JSON value.
         *
         * You should usually call [Builder.examples] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun examples(examples: JsonField<List<String>>) = apply { body.examples(examples) }

        /**
         * Adds a single [String] to [examples].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExample(example: String) = apply { body.addExample(example) }

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

        /** Alias for calling [split] with `Split.ofString(string)`. */
        fun split(string: String) = apply { body.split(string) }

        /** Alias for calling [split] with `Split.ofStrings(strings)`. */
        fun splitOfStrings(strings: List<String>) = apply { body.splitOfStrings(strings) }

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
         * Returns an immutable instance of [DatasetCloneParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .sourceDatasetId()
         * .targetDatasetId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DatasetCloneParams =
            DatasetCloneParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceDatasetId: JsonField<String>,
        private val targetDatasetId: JsonField<String>,
        private val asOf: JsonField<AsOf>,
        private val examples: JsonField<List<String>>,
        private val split: JsonField<Split>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("source_dataset_id")
            @ExcludeMissing
            sourceDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target_dataset_id")
            @ExcludeMissing
            targetDatasetId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("as_of") @ExcludeMissing asOf: JsonField<AsOf> = JsonMissing.of(),
            @JsonProperty("examples")
            @ExcludeMissing
            examples: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("split") @ExcludeMissing split: JsonField<Split> = JsonMissing.of(),
        ) : this(sourceDatasetId, targetDatasetId, asOf, examples, split, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceDatasetId(): String = sourceDatasetId.getRequired("source_dataset_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetDatasetId(): String = targetDatasetId.getRequired("target_dataset_id")

        /**
         * Only modifications made on or before this time are included. If None, the latest version
         * of the dataset is used.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun asOf(): Optional<AsOf> = asOf.getOptional("as_of")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun examples(): Optional<List<String>> = examples.getOptional("examples")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun split(): Optional<Split> = split.getOptional("split")

        /**
         * Returns the raw JSON value of [sourceDatasetId].
         *
         * Unlike [sourceDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("source_dataset_id")
        @ExcludeMissing
        fun _sourceDatasetId(): JsonField<String> = sourceDatasetId

        /**
         * Returns the raw JSON value of [targetDatasetId].
         *
         * Unlike [targetDatasetId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_dataset_id")
        @ExcludeMissing
        fun _targetDatasetId(): JsonField<String> = targetDatasetId

        /**
         * Returns the raw JSON value of [asOf].
         *
         * Unlike [asOf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("as_of") @ExcludeMissing fun _asOf(): JsonField<AsOf> = asOf

        /**
         * Returns the raw JSON value of [examples].
         *
         * Unlike [examples], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("examples")
        @ExcludeMissing
        fun _examples(): JsonField<List<String>> = examples

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .sourceDatasetId()
             * .targetDatasetId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var sourceDatasetId: JsonField<String>? = null
            private var targetDatasetId: JsonField<String>? = null
            private var asOf: JsonField<AsOf> = JsonMissing.of()
            private var examples: JsonField<MutableList<String>>? = null
            private var split: JsonField<Split> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                sourceDatasetId = body.sourceDatasetId
                targetDatasetId = body.targetDatasetId
                asOf = body.asOf
                examples = body.examples.map { it.toMutableList() }
                split = body.split
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun sourceDatasetId(sourceDatasetId: String) =
                sourceDatasetId(JsonField.of(sourceDatasetId))

            /**
             * Sets [Builder.sourceDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceDatasetId(sourceDatasetId: JsonField<String>) = apply {
                this.sourceDatasetId = sourceDatasetId
            }

            fun targetDatasetId(targetDatasetId: String) =
                targetDatasetId(JsonField.of(targetDatasetId))

            /**
             * Sets [Builder.targetDatasetId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetDatasetId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetDatasetId(targetDatasetId: JsonField<String>) = apply {
                this.targetDatasetId = targetDatasetId
            }

            /**
             * Only modifications made on or before this time are included. If None, the latest
             * version of the dataset is used.
             */
            fun asOf(asOf: AsOf?) = asOf(JsonField.ofNullable(asOf))

            /** Alias for calling [Builder.asOf] with `asOf.orElse(null)`. */
            fun asOf(asOf: Optional<AsOf>) = asOf(asOf.getOrNull())

            /**
             * Sets [Builder.asOf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.asOf] with a well-typed [AsOf] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun asOf(asOf: JsonField<AsOf>) = apply { this.asOf = asOf }

            /** Alias for calling [asOf] with `AsOf.ofOffsetDateTime(offsetDateTime)`. */
            fun asOf(offsetDateTime: OffsetDateTime) = asOf(AsOf.ofOffsetDateTime(offsetDateTime))

            /** Alias for calling [asOf] with `AsOf.ofString(string)`. */
            fun asOf(string: String) = asOf(AsOf.ofString(string))

            fun examples(examples: List<String>) = examples(JsonField.of(examples))

            /**
             * Sets [Builder.examples] to an arbitrary JSON value.
             *
             * You should usually call [Builder.examples] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun examples(examples: JsonField<List<String>>) = apply {
                this.examples = examples.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [examples].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExample(example: String) = apply {
                examples =
                    (examples ?: JsonField.of(mutableListOf())).also {
                        checkKnown("examples", it).add(example)
                    }
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

            /** Alias for calling [split] with `Split.ofString(string)`. */
            fun split(string: String) = split(Split.ofString(string))

            /** Alias for calling [split] with `Split.ofStrings(strings)`. */
            fun splitOfStrings(strings: List<String>) = split(Split.ofStrings(strings))

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
             * .sourceDatasetId()
             * .targetDatasetId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("sourceDatasetId", sourceDatasetId),
                    checkRequired("targetDatasetId", targetDatasetId),
                    asOf,
                    (examples ?: JsonMissing.of()).map { it.toImmutable() },
                    split,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            sourceDatasetId()
            targetDatasetId()
            asOf().ifPresent { it.validate() }
            examples()
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
            (if (sourceDatasetId.asKnown().isPresent) 1 else 0) +
                (if (targetDatasetId.asKnown().isPresent) 1 else 0) +
                (asOf.asKnown().getOrNull()?.validity() ?: 0) +
                (examples.asKnown().getOrNull()?.size ?: 0) +
                (split.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                sourceDatasetId == other.sourceDatasetId &&
                targetDatasetId == other.targetDatasetId &&
                asOf == other.asOf &&
                examples == other.examples &&
                split == other.split &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                sourceDatasetId,
                targetDatasetId,
                asOf,
                examples,
                split,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{sourceDatasetId=$sourceDatasetId, targetDatasetId=$targetDatasetId, asOf=$asOf, examples=$examples, split=$split, additionalProperties=$additionalProperties}"
    }

    /**
     * Only modifications made on or before this time are included. If None, the latest version of
     * the dataset is used.
     */
    @JsonDeserialize(using = AsOf.Deserializer::class)
    @JsonSerialize(using = AsOf.Serializer::class)
    class AsOf
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun offsetDateTime(): Optional<OffsetDateTime> = Optional.ofNullable(offsetDateTime)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isString(): Boolean = string != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AsOf = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}

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
                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AsOf && offsetDateTime == other.offsetDateTime && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(offsetDateTime, string)

        override fun toString(): String =
            when {
                offsetDateTime != null -> "AsOf{offsetDateTime=$offsetDateTime}"
                string != null -> "AsOf{string=$string}"
                _json != null -> "AsOf{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AsOf")
            }

        companion object {

            @JvmStatic
            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                AsOf(offsetDateTime = offsetDateTime)

            @JvmStatic fun ofString(string: String) = AsOf(string = string)
        }

        /** An interface that defines how to map each variant of [AsOf] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [AsOf] to a value of type [T].
             *
             * An instance of [AsOf] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown AsOf: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AsOf>(AsOf::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AsOf {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                AsOf(offsetDateTime = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                AsOf(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AsOf(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AsOf>(AsOf::class) {

            override fun serialize(
                value: AsOf,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AsOf")
                }
            }
        }
    }

    @JsonDeserialize(using = Split.Deserializer::class)
    @JsonSerialize(using = Split.Serializer::class)
    class Split
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Split = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitStrings(strings: List<String>) {}
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

                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Split && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "Split{string=$string}"
                strings != null -> "Split{strings=$strings}"
                _json != null -> "Split{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Split")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = Split(string = string)

            @JvmStatic fun ofStrings(strings: List<String>) = Split(strings = strings.toImmutable())
        }

        /** An interface that defines how to map each variant of [Split] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T

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
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Split(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Split(strings = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
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
                    value.string != null -> generator.writeObject(value.string)
                    value.strings != null -> generator.writeObject(value.strings)
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

        return other is DatasetCloneParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DatasetCloneParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
