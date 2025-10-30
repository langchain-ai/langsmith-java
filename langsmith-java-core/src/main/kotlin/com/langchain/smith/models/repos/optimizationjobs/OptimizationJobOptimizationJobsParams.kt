// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

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
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.repos.DemoConfig
import com.langchain.smith.models.repos.EPromptOptimizationAlgorithm
import com.langchain.smith.models.repos.PromptimConfig
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create a new prompt optimization job. */
class OptimizationJobOptimizationJobsParams
private constructor(
    private val owner: String,
    private val repo: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun owner(): String = owner

    fun repo(): Optional<String> = Optional.ofNullable(repo)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun algorithm(): EPromptOptimizationAlgorithm = body.algorithm()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun config(): Config = body.config()

    /**
     * Returns the raw JSON value of [algorithm].
     *
     * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _algorithm(): JsonField<EPromptOptimizationAlgorithm> = body._algorithm()

    /**
     * Returns the raw JSON value of [config].
     *
     * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _config(): JsonField<Config> = body._config()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OptimizationJobOptimizationJobsParams].
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .algorithm()
         * .config()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptimizationJobOptimizationJobsParams]. */
    class Builder internal constructor() {

        private var owner: String? = null
        private var repo: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            optimizationJobOptimizationJobsParams: OptimizationJobOptimizationJobsParams
        ) = apply {
            owner = optimizationJobOptimizationJobsParams.owner
            repo = optimizationJobOptimizationJobsParams.repo
            body = optimizationJobOptimizationJobsParams.body.toBuilder()
            additionalHeaders = optimizationJobOptimizationJobsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                optimizationJobOptimizationJobsParams.additionalQueryParams.toBuilder()
        }

        fun owner(owner: String) = apply { this.owner = owner }

        fun repo(repo: String?) = apply { this.repo = repo }

        /** Alias for calling [Builder.repo] with `repo.orElse(null)`. */
        fun repo(repo: Optional<String>) = repo(repo.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [algorithm]
         * - [config]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun algorithm(algorithm: EPromptOptimizationAlgorithm) = apply { body.algorithm(algorithm) }

        /**
         * Sets [Builder.algorithm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithm] with a well-typed
         * [EPromptOptimizationAlgorithm] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun algorithm(algorithm: JsonField<EPromptOptimizationAlgorithm>) = apply {
            body.algorithm(algorithm)
        }

        fun config(config: Config) = apply { body.config(config) }

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { body.config(config) }

        /** Alias for calling [config] with `Config.ofPromptim(promptim)`. */
        fun config(promptim: PromptimConfig) = apply { body.config(promptim) }

        /** Alias for calling [config] with `Config.ofDemo(demo)`. */
        fun config(demo: DemoConfig) = apply { body.config(demo) }

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
         * Returns an immutable instance of [OptimizationJobOptimizationJobsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .owner()
         * .algorithm()
         * .config()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptimizationJobOptimizationJobsParams =
            OptimizationJobOptimizationJobsParams(
                checkRequired("owner", owner),
                repo,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> owner
            1 -> repo ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val algorithm: JsonField<EPromptOptimizationAlgorithm>,
        private val config: JsonField<Config>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("algorithm")
            @ExcludeMissing
            algorithm: JsonField<EPromptOptimizationAlgorithm> = JsonMissing.of(),
            @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        ) : this(algorithm, config, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun algorithm(): EPromptOptimizationAlgorithm = algorithm.getRequired("algorithm")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun config(): Config = config.getRequired("config")

        /**
         * Returns the raw JSON value of [algorithm].
         *
         * Unlike [algorithm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("algorithm")
        @ExcludeMissing
        fun _algorithm(): JsonField<EPromptOptimizationAlgorithm> = algorithm

        /**
         * Returns the raw JSON value of [config].
         *
         * Unlike [config], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("config") @ExcludeMissing fun _config(): JsonField<Config> = config

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
             * .algorithm()
             * .config()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var algorithm: JsonField<EPromptOptimizationAlgorithm>? = null
            private var config: JsonField<Config>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                algorithm = body.algorithm
                config = body.config
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun algorithm(algorithm: EPromptOptimizationAlgorithm) =
                algorithm(JsonField.of(algorithm))

            /**
             * Sets [Builder.algorithm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.algorithm] with a well-typed
             * [EPromptOptimizationAlgorithm] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun algorithm(algorithm: JsonField<EPromptOptimizationAlgorithm>) = apply {
                this.algorithm = algorithm
            }

            fun config(config: Config) = config(JsonField.of(config))

            /**
             * Sets [Builder.config] to an arbitrary JSON value.
             *
             * You should usually call [Builder.config] with a well-typed [Config] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun config(config: JsonField<Config>) = apply { this.config = config }

            /** Alias for calling [config] with `Config.ofPromptim(promptim)`. */
            fun config(promptim: PromptimConfig) = config(Config.ofPromptim(promptim))

            /** Alias for calling [config] with `Config.ofDemo(demo)`. */
            fun config(demo: DemoConfig) = config(Config.ofDemo(demo))

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
             * .algorithm()
             * .config()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("algorithm", algorithm),
                    checkRequired("config", config),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            algorithm().validate()
            config().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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
            (algorithm.asKnown().getOrNull()?.validity() ?: 0) +
                (config.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                algorithm == other.algorithm &&
                config == other.config &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(algorithm, config, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{algorithm=$algorithm, config=$config, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = Config.Deserializer::class)
    @JsonSerialize(using = Config.Serializer::class)
    class Config
    private constructor(
        private val promptim: PromptimConfig? = null,
        private val demo: DemoConfig? = null,
        private val _json: JsonValue? = null,
    ) {

        fun promptim(): Optional<PromptimConfig> = Optional.ofNullable(promptim)

        fun demo(): Optional<DemoConfig> = Optional.ofNullable(demo)

        fun isPromptim(): Boolean = promptim != null

        fun isDemo(): Boolean = demo != null

        fun asPromptim(): PromptimConfig = promptim.getOrThrow("promptim")

        fun asDemo(): DemoConfig = demo.getOrThrow("demo")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                promptim != null -> visitor.visitPromptim(promptim)
                demo != null -> visitor.visitDemo(demo)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Config = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitPromptim(promptim: PromptimConfig) {
                        promptim.validate()
                    }

                    override fun visitDemo(demo: DemoConfig) {
                        demo.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithInvalidDataException) {
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
                    override fun visitPromptim(promptim: PromptimConfig) = promptim.validity()

                    override fun visitDemo(demo: DemoConfig) = demo.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Config && promptim == other.promptim && demo == other.demo
        }

        override fun hashCode(): Int = Objects.hash(promptim, demo)

        override fun toString(): String =
            when {
                promptim != null -> "Config{promptim=$promptim}"
                demo != null -> "Config{demo=$demo}"
                _json != null -> "Config{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Config")
            }

        companion object {

            @JvmStatic fun ofPromptim(promptim: PromptimConfig) = Config(promptim = promptim)

            @JvmStatic fun ofDemo(demo: DemoConfig) = Config(demo = demo)
        }

        /** An interface that defines how to map each variant of [Config] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitPromptim(promptim: PromptimConfig): T

            fun visitDemo(demo: DemoConfig): T

            /**
             * Maps an unknown variant of [Config] to a value of type [T].
             *
             * An instance of [Config] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithInvalidDataException("Unknown Config: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Config>(Config::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Config {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<PromptimConfig>())?.let {
                                Config(promptim = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<DemoConfig>())?.let {
                                Config(demo = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Config(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Config>(Config::class) {

            override fun serialize(
                value: Config,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.promptim != null -> generator.writeObject(value.promptim)
                    value.demo != null -> generator.writeObject(value.demo)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Config")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptimizationJobOptimizationJobsParams &&
            owner == other.owner &&
            repo == other.repo &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(owner, repo, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OptimizationJobOptimizationJobsParams{owner=$owner, repo=$repo, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
