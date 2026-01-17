// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples.validate

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
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Validation result for Example, combining fields from Create/Base/Update schemas. */
class ExampleValidationResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val datasetId: JsonField<String>,
    private val inputs: JsonField<Inputs>,
    private val metadata: JsonField<Metadata>,
    private val outputs: JsonField<Outputs>,
    private val overwrite: JsonField<Boolean>,
    private val sourceRunId: JsonField<String>,
    private val split: JsonField<Split>,
    private val useSourceRunIo: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dataset_id") @ExcludeMissing datasetId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inputs") @ExcludeMissing inputs: JsonField<Inputs> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("outputs") @ExcludeMissing outputs: JsonField<Outputs> = JsonMissing.of(),
        @JsonProperty("overwrite") @ExcludeMissing overwrite: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("source_run_id")
        @ExcludeMissing
        sourceRunId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("split") @ExcludeMissing split: JsonField<Split> = JsonMissing.of(),
        @JsonProperty("use_source_run_io")
        @ExcludeMissing
        useSourceRunIo: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        datasetId,
        inputs,
        metadata,
        outputs,
        overwrite,
        sourceRunId,
        split,
        useSourceRunIo,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun datasetId(): Optional<String> = datasetId.getOptional("dataset_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inputs(): Optional<Inputs> = inputs.getOptional("inputs")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outputs(): Optional<Outputs> = outputs.getOptional("outputs")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overwrite(): Optional<Boolean> = overwrite.getOptional("overwrite")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceRunId(): Optional<String> = sourceRunId.getOptional("source_run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun split(): Optional<Split> = split.getOptional("split")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun useSourceRunIo(): Optional<Boolean> = useSourceRunIo.getOptional("use_source_run_io")

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
     * Returns the raw JSON value of [datasetId].
     *
     * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataset_id") @ExcludeMissing fun _datasetId(): JsonField<String> = datasetId

    /**
     * Returns the raw JSON value of [inputs].
     *
     * Unlike [inputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inputs") @ExcludeMissing fun _inputs(): JsonField<Inputs> = inputs

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [outputs].
     *
     * Unlike [outputs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outputs") @ExcludeMissing fun _outputs(): JsonField<Outputs> = outputs

    /**
     * Returns the raw JSON value of [overwrite].
     *
     * Unlike [overwrite], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overwrite") @ExcludeMissing fun _overwrite(): JsonField<Boolean> = overwrite

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
     * Returns the raw JSON value of [useSourceRunIo].
     *
     * Unlike [useSourceRunIo], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [ExampleValidationResult]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExampleValidationResult]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var datasetId: JsonField<String> = JsonMissing.of()
        private var inputs: JsonField<Inputs> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var outputs: JsonField<Outputs> = JsonMissing.of()
        private var overwrite: JsonField<Boolean> = JsonMissing.of()
        private var sourceRunId: JsonField<String> = JsonMissing.of()
        private var split: JsonField<Split> = JsonMissing.of()
        private var useSourceRunIo: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleValidationResult: ExampleValidationResult) = apply {
            id = exampleValidationResult.id
            createdAt = exampleValidationResult.createdAt
            datasetId = exampleValidationResult.datasetId
            inputs = exampleValidationResult.inputs
            metadata = exampleValidationResult.metadata
            outputs = exampleValidationResult.outputs
            overwrite = exampleValidationResult.overwrite
            sourceRunId = exampleValidationResult.sourceRunId
            split = exampleValidationResult.split
            useSourceRunIo = exampleValidationResult.useSourceRunIo
            additionalProperties = exampleValidationResult.additionalProperties.toMutableMap()
        }

        fun id(id: String?) = id(JsonField.ofNullable(id))

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime?) = createdAt(JsonField.ofNullable(createdAt))

        /** Alias for calling [Builder.createdAt] with `createdAt.orElse(null)`. */
        fun createdAt(createdAt: Optional<OffsetDateTime>) = createdAt(createdAt.getOrNull())

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun datasetId(datasetId: String?) = datasetId(JsonField.ofNullable(datasetId))

        /** Alias for calling [Builder.datasetId] with `datasetId.orElse(null)`. */
        fun datasetId(datasetId: Optional<String>) = datasetId(datasetId.getOrNull())

        /**
         * Sets [Builder.datasetId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.datasetId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

        fun inputs(inputs: Inputs?) = inputs(JsonField.ofNullable(inputs))

        /** Alias for calling [Builder.inputs] with `inputs.orElse(null)`. */
        fun inputs(inputs: Optional<Inputs>) = inputs(inputs.getOrNull())

        /**
         * Sets [Builder.inputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inputs] with a well-typed [Inputs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inputs(inputs: JsonField<Inputs>) = apply { this.inputs = inputs }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun outputs(outputs: Outputs?) = outputs(JsonField.ofNullable(outputs))

        /** Alias for calling [Builder.outputs] with `outputs.orElse(null)`. */
        fun outputs(outputs: Optional<Outputs>) = outputs(outputs.getOrNull())

        /**
         * Sets [Builder.outputs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outputs] with a well-typed [Outputs] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outputs(outputs: JsonField<Outputs>) = apply { this.outputs = outputs }

        fun overwrite(overwrite: Boolean) = overwrite(JsonField.of(overwrite))

        /**
         * Sets [Builder.overwrite] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overwrite] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun overwrite(overwrite: JsonField<Boolean>) = apply { this.overwrite = overwrite }

        fun sourceRunId(sourceRunId: String?) = sourceRunId(JsonField.ofNullable(sourceRunId))

        /** Alias for calling [Builder.sourceRunId] with `sourceRunId.orElse(null)`. */
        fun sourceRunId(sourceRunId: Optional<String>) = sourceRunId(sourceRunId.getOrNull())

        /**
         * Sets [Builder.sourceRunId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceRunId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceRunId(sourceRunId: JsonField<String>) = apply { this.sourceRunId = sourceRunId }

        fun split(split: Split?) = split(JsonField.ofNullable(split))

        /** Alias for calling [Builder.split] with `split.orElse(null)`. */
        fun split(split: Optional<Split>) = split(split.getOrNull())

        /**
         * Sets [Builder.split] to an arbitrary JSON value.
         *
         * You should usually call [Builder.split] with a well-typed [Split] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun split(split: JsonField<Split>) = apply { this.split = split }

        /** Alias for calling [split] with `Split.ofStrings(strings)`. */
        fun splitOfStrings(strings: List<String>) = split(Split.ofStrings(strings))

        /** Alias for calling [split] with `Split.ofString(string)`. */
        fun split(string: String) = split(Split.ofString(string))

        fun useSourceRunIo(useSourceRunIo: Boolean) = useSourceRunIo(JsonField.of(useSourceRunIo))

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
         * Returns an immutable instance of [ExampleValidationResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExampleValidationResult =
            ExampleValidationResult(
                id,
                createdAt,
                datasetId,
                inputs,
                metadata,
                outputs,
                overwrite,
                sourceRunId,
                split,
                useSourceRunIo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExampleValidationResult = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        datasetId()
        inputs().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        outputs().ifPresent { it.validate() }
        overwrite()
        sourceRunId()
        split().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (datasetId.asKnown().isPresent) 1 else 0) +
            (inputs.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (outputs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (overwrite.asKnown().isPresent) 1 else 0) +
            (if (sourceRunId.asKnown().isPresent) 1 else 0) +
            (split.asKnown().getOrNull()?.validity() ?: 0) +
            (if (useSourceRunIo.asKnown().isPresent) 1 else 0)

    class Inputs
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

            /** Returns a mutable builder for constructing an instance of [Inputs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Inputs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(inputs: Inputs) = apply {
                additionalProperties = inputs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Inputs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Inputs = Inputs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Inputs = apply {
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

            return other is Inputs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Inputs{additionalProperties=$additionalProperties}"
    }

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

    class Outputs
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

            /** Returns a mutable builder for constructing an instance of [Outputs]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Outputs]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(outputs: Outputs) = apply {
                additionalProperties = outputs.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Outputs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Outputs = Outputs(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Outputs = apply {
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

            return other is Outputs && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Outputs{additionalProperties=$additionalProperties}"
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

        return other is ExampleValidationResult &&
            id == other.id &&
            createdAt == other.createdAt &&
            datasetId == other.datasetId &&
            inputs == other.inputs &&
            metadata == other.metadata &&
            outputs == other.outputs &&
            overwrite == other.overwrite &&
            sourceRunId == other.sourceRunId &&
            split == other.split &&
            useSourceRunIo == other.useSourceRunIo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            datasetId,
            inputs,
            metadata,
            outputs,
            overwrite,
            sourceRunId,
            split,
            useSourceRunIo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExampleValidationResult{id=$id, createdAt=$createdAt, datasetId=$datasetId, inputs=$inputs, metadata=$metadata, outputs=$outputs, overwrite=$overwrite, sourceRunId=$sourceRunId, split=$split, useSourceRunIo=$useSourceRunIo, additionalProperties=$additionalProperties}"
}
