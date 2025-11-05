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
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import com.langchain.smith.models.repos.DemoConfig
import com.langchain.smith.models.repos.EPromptOptimizationAlgorithm
import com.langchain.smith.models.repos.PromptimConfig
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PromptOptimizationJob
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val algorithm: JsonField<EPromptOptimizationAlgorithm>,
    private val config: JsonField<Config>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val repoId: JsonField<String>,
    private val status: JsonField<EPromptOptimizationJobStatus>,
    private val tenantId: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val results: JsonField<List<PromptOptimizationResult>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("algorithm")
        @ExcludeMissing
        algorithm: JsonField<EPromptOptimizationAlgorithm> = JsonMissing.of(),
        @JsonProperty("config") @ExcludeMissing config: JsonField<Config> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("repo_id") @ExcludeMissing repoId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<EPromptOptimizationJobStatus> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("results")
        @ExcludeMissing
        results: JsonField<List<PromptOptimizationResult>> = JsonMissing.of(),
    ) : this(
        id,
        algorithm,
        config,
        createdAt,
        repoId,
        status,
        tenantId,
        updatedAt,
        results,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

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
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun repoId(): String = repoId.getRequired("repo_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): EPromptOptimizationJobStatus = status.getRequired("status")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun results(): Optional<List<PromptOptimizationResult>> = results.getOptional("results")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [repoId].
     *
     * Unlike [repoId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("repo_id") @ExcludeMissing fun _repoId(): JsonField<String> = repoId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<EPromptOptimizationJobStatus> = status

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [results].
     *
     * Unlike [results], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("results")
    @ExcludeMissing
    fun _results(): JsonField<List<PromptOptimizationResult>> = results

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
         * Returns a mutable builder for constructing an instance of [PromptOptimizationJob].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .algorithm()
         * .config()
         * .createdAt()
         * .repoId()
         * .status()
         * .tenantId()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PromptOptimizationJob]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var algorithm: JsonField<EPromptOptimizationAlgorithm>? = null
        private var config: JsonField<Config>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var repoId: JsonField<String>? = null
        private var status: JsonField<EPromptOptimizationJobStatus>? = null
        private var tenantId: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var results: JsonField<MutableList<PromptOptimizationResult>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(promptOptimizationJob: PromptOptimizationJob) = apply {
            id = promptOptimizationJob.id
            algorithm = promptOptimizationJob.algorithm
            config = promptOptimizationJob.config
            createdAt = promptOptimizationJob.createdAt
            repoId = promptOptimizationJob.repoId
            status = promptOptimizationJob.status
            tenantId = promptOptimizationJob.tenantId
            updatedAt = promptOptimizationJob.updatedAt
            results = promptOptimizationJob.results.map { it.toMutableList() }
            additionalProperties = promptOptimizationJob.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun algorithm(algorithm: EPromptOptimizationAlgorithm) = algorithm(JsonField.of(algorithm))

        /**
         * Sets [Builder.algorithm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.algorithm] with a well-typed
         * [EPromptOptimizationAlgorithm] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun algorithm(algorithm: JsonField<EPromptOptimizationAlgorithm>) = apply {
            this.algorithm = algorithm
        }

        fun config(config: Config) = config(JsonField.of(config))

        /**
         * Sets [Builder.config] to an arbitrary JSON value.
         *
         * You should usually call [Builder.config] with a well-typed [Config] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun config(config: JsonField<Config>) = apply { this.config = config }

        /** Alias for calling [config] with `Config.ofPromptim(promptim)`. */
        fun config(promptim: PromptimConfig) = config(Config.ofPromptim(promptim))

        /** Alias for calling [config] with `Config.ofDemo(demo)`. */
        fun config(demo: DemoConfig) = config(Config.ofDemo(demo))

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun repoId(repoId: String) = repoId(JsonField.of(repoId))

        /**
         * Sets [Builder.repoId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.repoId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun repoId(repoId: JsonField<String>) = apply { this.repoId = repoId }

        fun status(status: EPromptOptimizationJobStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [EPromptOptimizationJobStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun status(status: JsonField<EPromptOptimizationJobStatus>) = apply { this.status = status }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun results(results: List<PromptOptimizationResult>) = results(JsonField.of(results))

        /**
         * Sets [Builder.results] to an arbitrary JSON value.
         *
         * You should usually call [Builder.results] with a well-typed
         * `List<PromptOptimizationResult>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun results(results: JsonField<List<PromptOptimizationResult>>) = apply {
            this.results = results.map { it.toMutableList() }
        }

        /**
         * Adds a single [PromptOptimizationResult] to [results].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResult(result: PromptOptimizationResult) = apply {
            results =
                (results ?: JsonField.of(mutableListOf())).also {
                    checkKnown("results", it).add(result)
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
         * Returns an immutable instance of [PromptOptimizationJob].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .algorithm()
         * .config()
         * .createdAt()
         * .repoId()
         * .status()
         * .tenantId()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PromptOptimizationJob =
            PromptOptimizationJob(
                checkRequired("id", id),
                checkRequired("algorithm", algorithm),
                checkRequired("config", config),
                checkRequired("createdAt", createdAt),
                checkRequired("repoId", repoId),
                checkRequired("status", status),
                checkRequired("tenantId", tenantId),
                checkRequired("updatedAt", updatedAt),
                (results ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PromptOptimizationJob = apply {
        if (validated) {
            return@apply
        }

        id()
        algorithm().validate()
        config().validate()
        createdAt()
        repoId()
        status().validate()
        tenantId()
        updatedAt()
        results().ifPresent { it.forEach { it.validate() } }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (algorithm.asKnown().getOrNull()?.validity() ?: 0) +
            (config.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (repoId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (results.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        return other is PromptOptimizationJob &&
            id == other.id &&
            algorithm == other.algorithm &&
            config == other.config &&
            createdAt == other.createdAt &&
            repoId == other.repoId &&
            status == other.status &&
            tenantId == other.tenantId &&
            updatedAt == other.updatedAt &&
            results == other.results &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            algorithm,
            config,
            createdAt,
            repoId,
            status,
            tenantId,
            updatedAt,
            results,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PromptOptimizationJob{id=$id, algorithm=$algorithm, config=$config, createdAt=$createdAt, repoId=$repoId, status=$status, tenantId=$tenantId, updatedAt=$updatedAt, results=$results, additionalProperties=$additionalProperties}"
}
