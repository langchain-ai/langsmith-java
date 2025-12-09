// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.playgroundexperiment

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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Configuration for a `Runnable`.
 *
 * See the
 * [reference docs](https://reference.langchain.com/python/langchain_core/runnables/#langchain_core.runnables.RunnableConfig)
 * for more details.
 */
class RunnableConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val callbacks: JsonField<Callbacks>,
    private val configurable: JsonField<Configurable>,
    private val maxConcurrency: JsonField<Long>,
    private val metadata: JsonField<Metadata>,
    private val recursionLimit: JsonField<Long>,
    private val runId: JsonField<String>,
    private val runName: JsonField<String>,
    private val tags: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("callbacks")
        @ExcludeMissing
        callbacks: JsonField<Callbacks> = JsonMissing.of(),
        @JsonProperty("configurable")
        @ExcludeMissing
        configurable: JsonField<Configurable> = JsonMissing.of(),
        @JsonProperty("max_concurrency")
        @ExcludeMissing
        maxConcurrency: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("recursion_limit")
        @ExcludeMissing
        recursionLimit: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_name") @ExcludeMissing runName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        callbacks,
        configurable,
        maxConcurrency,
        metadata,
        recursionLimit,
        runId,
        runName,
        tags,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbacks(): Optional<Callbacks> = callbacks.getOptional("callbacks")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configurable(): Optional<Configurable> = configurable.getOptional("configurable")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxConcurrency(): Optional<Long> = maxConcurrency.getOptional("max_concurrency")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recursionLimit(): Optional<Long> = recursionLimit.getOptional("recursion_limit")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runId(): Optional<String> = runId.getOptional("run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runName(): Optional<String> = runName.getOptional("run_name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = tags.getOptional("tags")

    /**
     * Returns the raw JSON value of [callbacks].
     *
     * Unlike [callbacks], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callbacks") @ExcludeMissing fun _callbacks(): JsonField<Callbacks> = callbacks

    /**
     * Returns the raw JSON value of [configurable].
     *
     * Unlike [configurable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configurable")
    @ExcludeMissing
    fun _configurable(): JsonField<Configurable> = configurable

    /**
     * Returns the raw JSON value of [maxConcurrency].
     *
     * Unlike [maxConcurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_concurrency")
    @ExcludeMissing
    fun _maxConcurrency(): JsonField<Long> = maxConcurrency

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [recursionLimit].
     *
     * Unlike [recursionLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recursion_limit")
    @ExcludeMissing
    fun _recursionLimit(): JsonField<Long> = recursionLimit

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [runName].
     *
     * Unlike [runName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_name") @ExcludeMissing fun _runName(): JsonField<String> = runName

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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

        /** Returns a mutable builder for constructing an instance of [RunnableConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunnableConfig]. */
    class Builder internal constructor() {

        private var callbacks: JsonField<Callbacks> = JsonMissing.of()
        private var configurable: JsonField<Configurable> = JsonMissing.of()
        private var maxConcurrency: JsonField<Long> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var recursionLimit: JsonField<Long> = JsonMissing.of()
        private var runId: JsonField<String> = JsonMissing.of()
        private var runName: JsonField<String> = JsonMissing.of()
        private var tags: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runnableConfig: RunnableConfig) = apply {
            callbacks = runnableConfig.callbacks
            configurable = runnableConfig.configurable
            maxConcurrency = runnableConfig.maxConcurrency
            metadata = runnableConfig.metadata
            recursionLimit = runnableConfig.recursionLimit
            runId = runnableConfig.runId
            runName = runnableConfig.runName
            tags = runnableConfig.tags.map { it.toMutableList() }
            additionalProperties = runnableConfig.additionalProperties.toMutableMap()
        }

        fun callbacks(callbacks: Callbacks?) = callbacks(JsonField.ofNullable(callbacks))

        /** Alias for calling [Builder.callbacks] with `callbacks.orElse(null)`. */
        fun callbacks(callbacks: Optional<Callbacks>) = callbacks(callbacks.getOrNull())

        /**
         * Sets [Builder.callbacks] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbacks] with a well-typed [Callbacks] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbacks(callbacks: JsonField<Callbacks>) = apply { this.callbacks = callbacks }

        /** Alias for calling [callbacks] with `Callbacks.ofJsonValues(jsonValues)`. */
        fun callbacksOfJsonValues(jsonValues: List<JsonValue>) =
            callbacks(Callbacks.ofJsonValues(jsonValues))

        /** Alias for calling [callbacks] with `Callbacks.ofJsonValue(jsonValue)`. */
        fun callbacks(jsonValue: JsonValue) = callbacks(Callbacks.ofJsonValue(jsonValue))

        fun configurable(configurable: Configurable) = configurable(JsonField.of(configurable))

        /**
         * Sets [Builder.configurable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configurable] with a well-typed [Configurable] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configurable(configurable: JsonField<Configurable>) = apply {
            this.configurable = configurable
        }

        fun maxConcurrency(maxConcurrency: Long?) =
            maxConcurrency(JsonField.ofNullable(maxConcurrency))

        /**
         * Alias for [Builder.maxConcurrency].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxConcurrency(maxConcurrency: Long) = maxConcurrency(maxConcurrency as Long?)

        /** Alias for calling [Builder.maxConcurrency] with `maxConcurrency.orElse(null)`. */
        fun maxConcurrency(maxConcurrency: Optional<Long>) =
            maxConcurrency(maxConcurrency.getOrNull())

        /**
         * Sets [Builder.maxConcurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxConcurrency] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxConcurrency(maxConcurrency: JsonField<Long>) = apply {
            this.maxConcurrency = maxConcurrency
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun recursionLimit(recursionLimit: Long) = recursionLimit(JsonField.of(recursionLimit))

        /**
         * Sets [Builder.recursionLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recursionLimit] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recursionLimit(recursionLimit: JsonField<Long>) = apply {
            this.recursionLimit = recursionLimit
        }

        fun runId(runId: String?) = runId(JsonField.ofNullable(runId))

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun runName(runName: String) = runName(JsonField.of(runName))

        /**
         * Sets [Builder.runName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runName(runName: JsonField<String>) = apply { this.runName = runName }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply {
            this.tags = tags.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply {
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
         * Returns an immutable instance of [RunnableConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunnableConfig =
            RunnableConfig(
                callbacks,
                configurable,
                maxConcurrency,
                metadata,
                recursionLimit,
                runId,
                runName,
                (tags ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunnableConfig = apply {
        if (validated) {
            return@apply
        }

        callbacks().ifPresent { it.validate() }
        configurable().ifPresent { it.validate() }
        maxConcurrency()
        metadata().ifPresent { it.validate() }
        recursionLimit()
        runId()
        runName()
        tags()
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
        (callbacks.asKnown().getOrNull()?.validity() ?: 0) +
            (configurable.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxConcurrency.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recursionLimit.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (runName.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0)

    @JsonDeserialize(using = Callbacks.Deserializer::class)
    @JsonSerialize(using = Callbacks.Serializer::class)
    class Callbacks
    private constructor(
        private val jsonValues: List<JsonValue>? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun jsonValues(): Optional<List<JsonValue>> = Optional.ofNullable(jsonValues)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isJsonValues(): Boolean = jsonValues != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asJsonValues(): List<JsonValue> = jsonValues.getOrThrow("jsonValues")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                jsonValues != null -> visitor.visitJsonValues(jsonValues)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Callbacks = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonValues(jsonValues: List<JsonValue>) {}

                    override fun visitJsonValue(jsonValue: JsonValue) {}
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
                    override fun visitJsonValues(jsonValues: List<JsonValue>) = jsonValues.size

                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Callbacks &&
                jsonValues == other.jsonValues &&
                jsonValue == other.jsonValue
        }

        override fun hashCode(): Int = Objects.hash(jsonValues, jsonValue)

        override fun toString(): String =
            when {
                jsonValues != null -> "Callbacks{jsonValues=$jsonValues}"
                jsonValue != null -> "Callbacks{jsonValue=$jsonValue}"
                _json != null -> "Callbacks{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Callbacks")
            }

        companion object {

            @JvmStatic
            fun ofJsonValues(jsonValues: List<JsonValue>) =
                Callbacks(jsonValues = jsonValues.toImmutable())

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Callbacks(jsonValue = jsonValue)
        }

        /**
         * An interface that defines how to map each variant of [Callbacks] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitJsonValues(jsonValues: List<JsonValue>): T

            fun visitJsonValue(jsonValue: JsonValue): T

            /**
             * Maps an unknown variant of [Callbacks] to a value of type [T].
             *
             * An instance of [Callbacks] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Callbacks: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Callbacks>(Callbacks::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Callbacks {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<List<JsonValue>>())?.let {
                                Callbacks(jsonValues = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Callbacks(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Callbacks(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Callbacks>(Callbacks::class) {

            override fun serialize(
                value: Callbacks,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonValues != null -> generator.writeObject(value.jsonValues)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Callbacks")
                }
            }
        }
    }

    class Configurable
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

            /** Returns a mutable builder for constructing an instance of [Configurable]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Configurable]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configurable: Configurable) = apply {
                additionalProperties = configurable.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Configurable].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Configurable = Configurable(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Configurable = apply {
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

            return other is Configurable && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Configurable{additionalProperties=$additionalProperties}"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunnableConfig &&
            callbacks == other.callbacks &&
            configurable == other.configurable &&
            maxConcurrency == other.maxConcurrency &&
            metadata == other.metadata &&
            recursionLimit == other.recursionLimit &&
            runId == other.runId &&
            runName == other.runName &&
            tags == other.tags &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            callbacks,
            configurable,
            maxConcurrency,
            metadata,
            recursionLimit,
            runId,
            runName,
            tags,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunnableConfig{callbacks=$callbacks, configurable=$configurable, maxConcurrency=$maxConcurrency, metadata=$metadata, recursionLimit=$recursionLimit, runId=$runId, runName=$runName, tags=$tags, additionalProperties=$additionalProperties}"
}
