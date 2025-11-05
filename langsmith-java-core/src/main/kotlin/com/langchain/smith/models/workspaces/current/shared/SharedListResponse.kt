// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current.shared

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
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SharedListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val entities: JsonField<List<Entity>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("entities")
        @ExcludeMissing
        entities: JsonField<List<Entity>> = JsonMissing.of()
    ) : this(entities, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entities(): List<Entity> = entities.getRequired("entities")

    /**
     * Returns the raw JSON value of [entities].
     *
     * Unlike [entities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entities") @ExcludeMissing fun _entities(): JsonField<List<Entity>> = entities

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
         * Returns a mutable builder for constructing an instance of [SharedListResponse].
         *
         * The following fields are required:
         * ```java
         * .entities()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SharedListResponse]. */
    class Builder internal constructor() {

        private var entities: JsonField<MutableList<Entity>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sharedListResponse: SharedListResponse) = apply {
            entities = sharedListResponse.entities.map { it.toMutableList() }
            additionalProperties = sharedListResponse.additionalProperties.toMutableMap()
        }

        fun entities(entities: List<Entity>) = entities(JsonField.of(entities))

        /**
         * Sets [Builder.entities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entities] with a well-typed `List<Entity>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entities(entities: JsonField<List<Entity>>) = apply {
            this.entities = entities.map { it.toMutableList() }
        }

        /**
         * Adds a single [Entity] to [entities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntity(entity: Entity) = apply {
            entities =
                (entities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entities", it).add(entity)
                }
        }

        /** Alias for calling [addEntity] with `Entity.ofRun(run)`. */
        fun addEntity(run: Entity.Run) = addEntity(Entity.ofRun(run))

        /** Alias for calling [addEntity] with `Entity.ofDataset(dataset)`. */
        fun addEntity(dataset: Entity.Dataset) = addEntity(Entity.ofDataset(dataset))

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
         * Returns an immutable instance of [SharedListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .entities()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SharedListResponse =
            SharedListResponse(
                checkRequired("entities", entities).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SharedListResponse = apply {
        if (validated) {
            return@apply
        }

        entities().forEach { it.validate() }
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
        (entities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    @JsonDeserialize(using = Entity.Deserializer::class)
    @JsonSerialize(using = Entity.Serializer::class)
    class Entity
    private constructor(
        private val run: Run? = null,
        private val dataset: Dataset? = null,
        private val _json: JsonValue? = null,
    ) {

        fun run(): Optional<Run> = Optional.ofNullable(run)

        fun dataset(): Optional<Dataset> = Optional.ofNullable(dataset)

        fun isRun(): Boolean = run != null

        fun isDataset(): Boolean = dataset != null

        fun asRun(): Run = run.getOrThrow("run")

        fun asDataset(): Dataset = dataset.getOrThrow("dataset")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                run != null -> visitor.visitRun(run)
                dataset != null -> visitor.visitDataset(dataset)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitRun(run: Run) {
                        run.validate()
                    }

                    override fun visitDataset(dataset: Dataset) {
                        dataset.validate()
                    }
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
                    override fun visitRun(run: Run) = run.validity()

                    override fun visitDataset(dataset: Dataset) = dataset.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity && run == other.run && dataset == other.dataset
        }

        override fun hashCode(): Int = Objects.hash(run, dataset)

        override fun toString(): String =
            when {
                run != null -> "Entity{run=$run}"
                dataset != null -> "Entity{dataset=$dataset}"
                _json != null -> "Entity{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Entity")
            }

        companion object {

            @JvmStatic fun ofRun(run: Run) = Entity(run = run)

            @JvmStatic fun ofDataset(dataset: Dataset) = Entity(dataset = dataset)
        }

        /** An interface that defines how to map each variant of [Entity] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitRun(run: Run): T

            fun visitDataset(dataset: Dataset): T

            /**
             * Maps an unknown variant of [Entity] to a value of type [T].
             *
             * An instance of [Entity] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Entity: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Entity>(Entity::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Entity {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "run" -> {
                        return tryDeserialize(node, jacksonTypeRef<Run>())?.let {
                            Entity(run = it, _json = json)
                        } ?: Entity(_json = json)
                    }
                    "dataset" -> {
                        return tryDeserialize(node, jacksonTypeRef<Dataset>())?.let {
                            Entity(dataset = it, _json = json)
                        } ?: Entity(_json = json)
                    }
                }

                return Entity(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Entity>(Entity::class) {

            override fun serialize(
                value: Entity,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.run != null -> generator.writeObject(value.run)
                    value.dataset != null -> generator.writeObject(value.dataset)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Entity")
                }
            }
        }

        class Run
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val runId: JsonField<String>,
            private val shareToken: JsonField<String>,
            private val type: JsonValue,
            private val runName: JsonField<String>,
            private val runType: JsonField<String>,
            private val sessionId: JsonField<String>,
            private val sessionName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("share_token")
                @ExcludeMissing
                shareToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("run_name")
                @ExcludeMissing
                runName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("run_type")
                @ExcludeMissing
                runType: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session_id")
                @ExcludeMissing
                sessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session_name")
                @ExcludeMissing
                sessionName: JsonField<String> = JsonMissing.of(),
            ) : this(
                createdAt,
                runId,
                shareToken,
                type,
                runName,
                runType,
                sessionId,
                sessionName,
                mutableMapOf(),
            )

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun runId(): String = runId.getRequired("run_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shareToken(): String = shareToken.getRequired("share_token")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("run")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun runName(): Optional<String> = runName.getOptional("run_name")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun runType(): Optional<String> = runType.getOptional("run_type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sessionName(): Optional<String> = sessionName.getOptional("session_name")

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [runId].
             *
             * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

            /**
             * Returns the raw JSON value of [shareToken].
             *
             * Unlike [shareToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("share_token")
            @ExcludeMissing
            fun _shareToken(): JsonField<String> = shareToken

            /**
             * Returns the raw JSON value of [runName].
             *
             * Unlike [runName], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("run_name") @ExcludeMissing fun _runName(): JsonField<String> = runName

            /**
             * Returns the raw JSON value of [runType].
             *
             * Unlike [runType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("run_type") @ExcludeMissing fun _runType(): JsonField<String> = runType

            /**
             * Returns the raw JSON value of [sessionId].
             *
             * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("session_id")
            @ExcludeMissing
            fun _sessionId(): JsonField<String> = sessionId

            /**
             * Returns the raw JSON value of [sessionName].
             *
             * Unlike [sessionName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("session_name")
            @ExcludeMissing
            fun _sessionName(): JsonField<String> = sessionName

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
                 * Returns a mutable builder for constructing an instance of [Run].
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .runId()
                 * .shareToken()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Run]. */
            class Builder internal constructor() {

                private var createdAt: JsonField<OffsetDateTime>? = null
                private var runId: JsonField<String>? = null
                private var shareToken: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("run")
                private var runName: JsonField<String> = JsonMissing.of()
                private var runType: JsonField<String> = JsonMissing.of()
                private var sessionId: JsonField<String> = JsonMissing.of()
                private var sessionName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(run: Run) = apply {
                    createdAt = run.createdAt
                    runId = run.runId
                    shareToken = run.shareToken
                    type = run.type
                    runName = run.runName
                    runType = run.runType
                    sessionId = run.sessionId
                    sessionName = run.sessionName
                    additionalProperties = run.additionalProperties.toMutableMap()
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun runId(runId: String) = runId(JsonField.of(runId))

                /**
                 * Sets [Builder.runId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun runId(runId: JsonField<String>) = apply { this.runId = runId }

                fun shareToken(shareToken: String) = shareToken(JsonField.of(shareToken))

                /**
                 * Sets [Builder.shareToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shareToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shareToken(shareToken: JsonField<String>) = apply {
                    this.shareToken = shareToken
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("run")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun runName(runName: String?) = runName(JsonField.ofNullable(runName))

                /** Alias for calling [Builder.runName] with `runName.orElse(null)`. */
                fun runName(runName: Optional<String>) = runName(runName.getOrNull())

                /**
                 * Sets [Builder.runName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun runName(runName: JsonField<String>) = apply { this.runName = runName }

                fun runType(runType: String?) = runType(JsonField.ofNullable(runType))

                /** Alias for calling [Builder.runType] with `runType.orElse(null)`. */
                fun runType(runType: Optional<String>) = runType(runType.getOrNull())

                /**
                 * Sets [Builder.runType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runType] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun runType(runType: JsonField<String>) = apply { this.runType = runType }

                fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

                /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
                fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

                /**
                 * Sets [Builder.sessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sessionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

                fun sessionName(sessionName: String?) =
                    sessionName(JsonField.ofNullable(sessionName))

                /** Alias for calling [Builder.sessionName] with `sessionName.orElse(null)`. */
                fun sessionName(sessionName: Optional<String>) =
                    sessionName(sessionName.getOrNull())

                /**
                 * Sets [Builder.sessionName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sessionName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sessionName(sessionName: JsonField<String>) = apply {
                    this.sessionName = sessionName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Run].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .runId()
                 * .shareToken()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Run =
                    Run(
                        checkRequired("createdAt", createdAt),
                        checkRequired("runId", runId),
                        checkRequired("shareToken", shareToken),
                        type,
                        runName,
                        runType,
                        sessionId,
                        sessionName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Run = apply {
                if (validated) {
                    return@apply
                }

                createdAt()
                runId()
                shareToken()
                _type().let {
                    if (it != JsonValue.from("run")) {
                        throw LangChainInvalidDataException("'type' is invalid, received $it")
                    }
                }
                runName()
                runType()
                sessionId()
                sessionName()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (runId.asKnown().isPresent) 1 else 0) +
                    (if (shareToken.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("run")) 1 else 0 } +
                    (if (runName.asKnown().isPresent) 1 else 0) +
                    (if (runType.asKnown().isPresent) 1 else 0) +
                    (if (sessionId.asKnown().isPresent) 1 else 0) +
                    (if (sessionName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Run &&
                    createdAt == other.createdAt &&
                    runId == other.runId &&
                    shareToken == other.shareToken &&
                    type == other.type &&
                    runName == other.runName &&
                    runType == other.runType &&
                    sessionId == other.sessionId &&
                    sessionName == other.sessionName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    createdAt,
                    runId,
                    shareToken,
                    type,
                    runName,
                    runType,
                    sessionId,
                    sessionName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Run{createdAt=$createdAt, runId=$runId, shareToken=$shareToken, type=$type, runName=$runName, runType=$runType, sessionId=$sessionId, sessionName=$sessionName, additionalProperties=$additionalProperties}"
        }

        class Dataset
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val datasetId: JsonField<String>,
            private val shareToken: JsonField<String>,
            private val type: JsonValue,
            private val datasetName: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("dataset_id")
                @ExcludeMissing
                datasetId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("share_token")
                @ExcludeMissing
                shareToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
                @JsonProperty("dataset_name")
                @ExcludeMissing
                datasetName: JsonField<String> = JsonMissing.of(),
            ) : this(createdAt, datasetId, shareToken, type, datasetName, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun datasetId(): String = datasetId.getRequired("dataset_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun shareToken(): String = shareToken.getRequired("share_token")

            /**
             * Expected to always return the following:
             * ```java
             * JsonValue.from("dataset")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun datasetName(): Optional<String> = datasetName.getOptional("dataset_name")

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [datasetId].
             *
             * Unlike [datasetId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataset_id")
            @ExcludeMissing
            fun _datasetId(): JsonField<String> = datasetId

            /**
             * Returns the raw JSON value of [shareToken].
             *
             * Unlike [shareToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("share_token")
            @ExcludeMissing
            fun _shareToken(): JsonField<String> = shareToken

            /**
             * Returns the raw JSON value of [datasetName].
             *
             * Unlike [datasetName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("dataset_name")
            @ExcludeMissing
            fun _datasetName(): JsonField<String> = datasetName

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
                 * Returns a mutable builder for constructing an instance of [Dataset].
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .datasetId()
                 * .shareToken()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dataset]. */
            class Builder internal constructor() {

                private var createdAt: JsonField<OffsetDateTime>? = null
                private var datasetId: JsonField<String>? = null
                private var shareToken: JsonField<String>? = null
                private var type: JsonValue = JsonValue.from("dataset")
                private var datasetName: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dataset: Dataset) = apply {
                    createdAt = dataset.createdAt
                    datasetId = dataset.datasetId
                    shareToken = dataset.shareToken
                    type = dataset.type
                    datasetName = dataset.datasetName
                    additionalProperties = dataset.additionalProperties.toMutableMap()
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun datasetId(datasetId: String) = datasetId(JsonField.of(datasetId))

                /**
                 * Sets [Builder.datasetId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetId(datasetId: JsonField<String>) = apply { this.datasetId = datasetId }

                fun shareToken(shareToken: String) = shareToken(JsonField.of(shareToken))

                /**
                 * Sets [Builder.shareToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shareToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun shareToken(shareToken: JsonField<String>) = apply {
                    this.shareToken = shareToken
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```java
                 * JsonValue.from("dataset")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonValue) = apply { this.type = type }

                fun datasetName(datasetName: String?) =
                    datasetName(JsonField.ofNullable(datasetName))

                /** Alias for calling [Builder.datasetName] with `datasetName.orElse(null)`. */
                fun datasetName(datasetName: Optional<String>) =
                    datasetName(datasetName.getOrNull())

                /**
                 * Sets [Builder.datasetName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.datasetName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun datasetName(datasetName: JsonField<String>) = apply {
                    this.datasetName = datasetName
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Dataset].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .createdAt()
                 * .datasetId()
                 * .shareToken()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Dataset =
                    Dataset(
                        checkRequired("createdAt", createdAt),
                        checkRequired("datasetId", datasetId),
                        checkRequired("shareToken", shareToken),
                        type,
                        datasetName,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Dataset = apply {
                if (validated) {
                    return@apply
                }

                createdAt()
                datasetId()
                shareToken()
                _type().let {
                    if (it != JsonValue.from("dataset")) {
                        throw LangChainInvalidDataException("'type' is invalid, received $it")
                    }
                }
                datasetName()
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
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                    (if (datasetId.asKnown().isPresent) 1 else 0) +
                    (if (shareToken.asKnown().isPresent) 1 else 0) +
                    type.let { if (it == JsonValue.from("dataset")) 1 else 0 } +
                    (if (datasetName.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dataset &&
                    createdAt == other.createdAt &&
                    datasetId == other.datasetId &&
                    shareToken == other.shareToken &&
                    type == other.type &&
                    datasetName == other.datasetName &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    createdAt,
                    datasetId,
                    shareToken,
                    type,
                    datasetName,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dataset{createdAt=$createdAt, datasetId=$datasetId, shareToken=$shareToken, type=$type, datasetName=$datasetName, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SharedListResponse &&
            entities == other.entities &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(entities, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SharedListResponse{entities=$entities, additionalProperties=$additionalProperties}"
}
