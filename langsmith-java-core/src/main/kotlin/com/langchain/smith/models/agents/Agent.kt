// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.agents

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Agent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val agentType: JsonField<AgentType>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val environments: JsonField<List<Environment>>,
    private val name: JsonField<String>,
    private val sourceType: JsonField<SourceType>,
    private val tagKeyId: JsonField<String>,
    private val tagValueId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("agent_type")
        @ExcludeMissing
        agentType: JsonField<AgentType> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("environments")
        @ExcludeMissing
        environments: JsonField<List<Environment>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_type")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("tag_key_id") @ExcludeMissing tagKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tag_value_id")
        @ExcludeMissing
        tagValueId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        agentType,
        createdAt,
        environments,
        name,
        sourceType,
        tagKeyId,
        tagValueId,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentType(): AgentType = agentType.getRequired("agent_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun environments(): List<Environment> = environments.getRequired("environments")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sourceType(): SourceType = sourceType.getRequired("source_type")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagKeyId(): Optional<String> = tagKeyId.getOptional("tag_key_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagValueId(): Optional<String> = tagValueId.getOptional("tag_value_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [agentType].
     *
     * Unlike [agentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agent_type") @ExcludeMissing fun _agentType(): JsonField<AgentType> = agentType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [environments].
     *
     * Unlike [environments], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("environments")
    @ExcludeMissing
    fun _environments(): JsonField<List<Environment>> = environments

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_type")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    /**
     * Returns the raw JSON value of [tagKeyId].
     *
     * Unlike [tagKeyId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_key_id") @ExcludeMissing fun _tagKeyId(): JsonField<String> = tagKeyId

    /**
     * Returns the raw JSON value of [tagValueId].
     *
     * Unlike [tagValueId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tag_value_id") @ExcludeMissing fun _tagValueId(): JsonField<String> = tagValueId

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
         * Returns a mutable builder for constructing an instance of [Agent].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentType()
         * .createdAt()
         * .environments()
         * .name()
         * .sourceType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Agent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var agentType: JsonField<AgentType>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var environments: JsonField<MutableList<Environment>>? = null
        private var name: JsonField<String>? = null
        private var sourceType: JsonField<SourceType>? = null
        private var tagKeyId: JsonField<String> = JsonMissing.of()
        private var tagValueId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agent: Agent) = apply {
            id = agent.id
            agentType = agent.agentType
            createdAt = agent.createdAt
            environments = agent.environments.map { it.toMutableList() }
            name = agent.name
            sourceType = agent.sourceType
            tagKeyId = agent.tagKeyId
            tagValueId = agent.tagValueId
            additionalProperties = agent.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun agentType(agentType: AgentType) = agentType(JsonField.of(agentType))

        /**
         * Sets [Builder.agentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentType] with a well-typed [AgentType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agentType(agentType: JsonField<AgentType>) = apply { this.agentType = agentType }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun environments(environments: List<Environment>) = environments(JsonField.of(environments))

        /**
         * Sets [Builder.environments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environments] with a well-typed `List<Environment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun environments(environments: JsonField<List<Environment>>) = apply {
            this.environments = environments.map { it.toMutableList() }
        }

        /**
         * Adds a single [Environment] to [environments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEnvironment(environment: Environment) = apply {
            environments =
                (environments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("environments", it).add(environment)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        fun tagKeyId(tagKeyId: String?) = tagKeyId(JsonField.ofNullable(tagKeyId))

        /** Alias for calling [Builder.tagKeyId] with `tagKeyId.orElse(null)`. */
        fun tagKeyId(tagKeyId: Optional<String>) = tagKeyId(tagKeyId.getOrNull())

        /**
         * Sets [Builder.tagKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagKeyId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagKeyId(tagKeyId: JsonField<String>) = apply { this.tagKeyId = tagKeyId }

        fun tagValueId(tagValueId: String?) = tagValueId(JsonField.ofNullable(tagValueId))

        /** Alias for calling [Builder.tagValueId] with `tagValueId.orElse(null)`. */
        fun tagValueId(tagValueId: Optional<String>) = tagValueId(tagValueId.getOrNull())

        /**
         * Sets [Builder.tagValueId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagValueId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tagValueId(tagValueId: JsonField<String>) = apply { this.tagValueId = tagValueId }

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
         * Returns an immutable instance of [Agent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .agentType()
         * .createdAt()
         * .environments()
         * .name()
         * .sourceType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Agent =
            Agent(
                checkRequired("id", id),
                checkRequired("agentType", agentType),
                checkRequired("createdAt", createdAt),
                checkRequired("environments", environments).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("sourceType", sourceType),
                tagKeyId,
                tagValueId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Agent = apply {
        if (validated) {
            return@apply
        }

        id()
        agentType().validate()
        createdAt()
        environments().forEach { it.validate() }
        name()
        sourceType().validate()
        tagKeyId()
        tagValueId()
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
            (agentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (environments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (tagKeyId.asKnown().isPresent) 1 else 0) +
            (if (tagValueId.asKnown().isPresent) 1 else 0)

    class AgentType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CUSTOM = of("CUSTOM")

            @JvmField val CODING = of("CODING")

            @JvmStatic fun of(value: String) = AgentType(JsonField.of(value))
        }

        /** An enum containing [AgentType]'s known values. */
        enum class Known {
            CUSTOM,
            CODING,
        }

        /**
         * An enum containing [AgentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AgentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOM,
            CODING,
            /**
             * An enum member indicating that [AgentType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                CUSTOM -> Value.CUSTOM
                CODING -> Value.CODING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CUSTOM -> Known.CUSTOM
                CODING -> Known.CODING
                else -> throw LangChainInvalidDataException("Unknown AgentType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): AgentType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AgentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Environment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val agentId: JsonField<String>,
        private val environment: JsonField<InnerEnvironment>,
        private val tracerSessionId: JsonField<String>,
        private val tracerSessionName: JsonField<String>,
        private val runtimeBindings: JsonField<List<RuntimeBinding>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("agent_id") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("environment")
            @ExcludeMissing
            environment: JsonField<InnerEnvironment> = JsonMissing.of(),
            @JsonProperty("tracer_session_id")
            @ExcludeMissing
            tracerSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tracer_session_name")
            @ExcludeMissing
            tracerSessionName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("runtime_bindings")
            @ExcludeMissing
            runtimeBindings: JsonField<List<RuntimeBinding>> = JsonMissing.of(),
        ) : this(
            id,
            agentId,
            environment,
            tracerSessionId,
            tracerSessionName,
            runtimeBindings,
            mutableMapOf(),
        )

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agentId(): String = agentId.getRequired("agent_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun environment(): InnerEnvironment = environment.getRequired("environment")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tracerSessionId(): String = tracerSessionId.getRequired("tracer_session_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tracerSessionName(): String = tracerSessionName.getRequired("tracer_session_name")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun runtimeBindings(): Optional<List<RuntimeBinding>> =
            runtimeBindings.getOptional("runtime_bindings")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [agentId].
         *
         * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agent_id") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

        /**
         * Returns the raw JSON value of [environment].
         *
         * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("environment")
        @ExcludeMissing
        fun _environment(): JsonField<InnerEnvironment> = environment

        /**
         * Returns the raw JSON value of [tracerSessionId].
         *
         * Unlike [tracerSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tracer_session_id")
        @ExcludeMissing
        fun _tracerSessionId(): JsonField<String> = tracerSessionId

        /**
         * Returns the raw JSON value of [tracerSessionName].
         *
         * Unlike [tracerSessionName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tracer_session_name")
        @ExcludeMissing
        fun _tracerSessionName(): JsonField<String> = tracerSessionName

        /**
         * Returns the raw JSON value of [runtimeBindings].
         *
         * Unlike [runtimeBindings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("runtime_bindings")
        @ExcludeMissing
        fun _runtimeBindings(): JsonField<List<RuntimeBinding>> = runtimeBindings

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
             * Returns a mutable builder for constructing an instance of [Environment].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agentId()
             * .environment()
             * .tracerSessionId()
             * .tracerSessionName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Environment]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var agentId: JsonField<String>? = null
            private var environment: JsonField<InnerEnvironment>? = null
            private var tracerSessionId: JsonField<String>? = null
            private var tracerSessionName: JsonField<String>? = null
            private var runtimeBindings: JsonField<MutableList<RuntimeBinding>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(environment: Environment) = apply {
                id = environment.id
                agentId = environment.agentId
                this.environment = environment.environment
                tracerSessionId = environment.tracerSessionId
                tracerSessionName = environment.tracerSessionName
                runtimeBindings = environment.runtimeBindings.map { it.toMutableList() }
                additionalProperties = environment.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun agentId(agentId: String) = agentId(JsonField.of(agentId))

            /**
             * Sets [Builder.agentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

            fun environment(environment: InnerEnvironment) = environment(JsonField.of(environment))

            /**
             * Sets [Builder.environment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.environment] with a well-typed [InnerEnvironment]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun environment(environment: JsonField<InnerEnvironment>) = apply {
                this.environment = environment
            }

            fun tracerSessionId(tracerSessionId: String) =
                tracerSessionId(JsonField.of(tracerSessionId))

            /**
             * Sets [Builder.tracerSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tracerSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tracerSessionId(tracerSessionId: JsonField<String>) = apply {
                this.tracerSessionId = tracerSessionId
            }

            fun tracerSessionName(tracerSessionName: String) =
                tracerSessionName(JsonField.of(tracerSessionName))

            /**
             * Sets [Builder.tracerSessionName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tracerSessionName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tracerSessionName(tracerSessionName: JsonField<String>) = apply {
                this.tracerSessionName = tracerSessionName
            }

            fun runtimeBindings(runtimeBindings: List<RuntimeBinding>) =
                runtimeBindings(JsonField.of(runtimeBindings))

            /**
             * Sets [Builder.runtimeBindings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runtimeBindings] with a well-typed
             * `List<RuntimeBinding>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun runtimeBindings(runtimeBindings: JsonField<List<RuntimeBinding>>) = apply {
                this.runtimeBindings = runtimeBindings.map { it.toMutableList() }
            }

            /**
             * Adds a single [RuntimeBinding] to [runtimeBindings].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRuntimeBinding(runtimeBinding: RuntimeBinding) = apply {
                runtimeBindings =
                    (runtimeBindings ?: JsonField.of(mutableListOf())).also {
                        checkKnown("runtimeBindings", it).add(runtimeBinding)
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
             * Returns an immutable instance of [Environment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .agentId()
             * .environment()
             * .tracerSessionId()
             * .tracerSessionName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Environment =
                Environment(
                    checkRequired("id", id),
                    checkRequired("agentId", agentId),
                    checkRequired("environment", environment),
                    checkRequired("tracerSessionId", tracerSessionId),
                    checkRequired("tracerSessionName", tracerSessionName),
                    (runtimeBindings ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Environment = apply {
            if (validated) {
                return@apply
            }

            id()
            agentId()
            environment().validate()
            tracerSessionId()
            tracerSessionName()
            runtimeBindings().ifPresent { it.forEach { it.validate() } }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (agentId.asKnown().isPresent) 1 else 0) +
                (environment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (tracerSessionId.asKnown().isPresent) 1 else 0) +
                (if (tracerSessionName.asKnown().isPresent) 1 else 0) +
                (runtimeBindings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        class InnerEnvironment
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val LOCAL = of("LOCAL")

                @JvmField val DEVELOPMENT = of("DEVELOPMENT")

                @JvmField val STAGING = of("STAGING")

                @JvmField val PRODUCTION = of("PRODUCTION")

                @JvmStatic fun of(value: String) = InnerEnvironment(JsonField.of(value))
            }

            /** An enum containing [InnerEnvironment]'s known values. */
            enum class Known {
                LOCAL,
                DEVELOPMENT,
                STAGING,
                PRODUCTION,
            }

            /**
             * An enum containing [InnerEnvironment]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [InnerEnvironment] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LOCAL,
                DEVELOPMENT,
                STAGING,
                PRODUCTION,
                /**
                 * An enum member indicating that [InnerEnvironment] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    LOCAL -> Value.LOCAL
                    DEVELOPMENT -> Value.DEVELOPMENT
                    STAGING -> Value.STAGING
                    PRODUCTION -> Value.PRODUCTION
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    LOCAL -> Known.LOCAL
                    DEVELOPMENT -> Known.DEVELOPMENT
                    STAGING -> Known.STAGING
                    PRODUCTION -> Known.PRODUCTION
                    else -> throw LangChainInvalidDataException("Unknown InnerEnvironment: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InnerEnvironment = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerEnvironment && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RuntimeBinding
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val agentEnvironmentId: JsonField<String>,
            private val sourceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("agent_environment_id")
                @ExcludeMissing
                agentEnvironmentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("source_id")
                @ExcludeMissing
                sourceId: JsonField<String> = JsonMissing.of(),
            ) : this(id, agentEnvironmentId, sourceId, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun agentEnvironmentId(): String =
                agentEnvironmentId.getRequired("agent_environment_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sourceId(): String = sourceId.getRequired("source_id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [agentEnvironmentId].
             *
             * Unlike [agentEnvironmentId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("agent_environment_id")
            @ExcludeMissing
            fun _agentEnvironmentId(): JsonField<String> = agentEnvironmentId

            /**
             * Returns the raw JSON value of [sourceId].
             *
             * Unlike [sourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("source_id") @ExcludeMissing fun _sourceId(): JsonField<String> = sourceId

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
                 * Returns a mutable builder for constructing an instance of [RuntimeBinding].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .agentEnvironmentId()
                 * .sourceId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuntimeBinding]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var agentEnvironmentId: JsonField<String>? = null
                private var sourceId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(runtimeBinding: RuntimeBinding) = apply {
                    id = runtimeBinding.id
                    agentEnvironmentId = runtimeBinding.agentEnvironmentId
                    sourceId = runtimeBinding.sourceId
                    additionalProperties = runtimeBinding.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun agentEnvironmentId(agentEnvironmentId: String) =
                    agentEnvironmentId(JsonField.of(agentEnvironmentId))

                /**
                 * Sets [Builder.agentEnvironmentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.agentEnvironmentId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun agentEnvironmentId(agentEnvironmentId: JsonField<String>) = apply {
                    this.agentEnvironmentId = agentEnvironmentId
                }

                fun sourceId(sourceId: String) = sourceId(JsonField.of(sourceId))

                /**
                 * Sets [Builder.sourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceId(sourceId: JsonField<String>) = apply { this.sourceId = sourceId }

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
                 * Returns an immutable instance of [RuntimeBinding].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .agentEnvironmentId()
                 * .sourceId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RuntimeBinding =
                    RuntimeBinding(
                        checkRequired("id", id),
                        checkRequired("agentEnvironmentId", agentEnvironmentId),
                        checkRequired("sourceId", sourceId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): RuntimeBinding = apply {
                if (validated) {
                    return@apply
                }

                id()
                agentEnvironmentId()
                sourceId()
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
                (if (id.asKnown().isPresent) 1 else 0) +
                    (if (agentEnvironmentId.asKnown().isPresent) 1 else 0) +
                    (if (sourceId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RuntimeBinding &&
                    id == other.id &&
                    agentEnvironmentId == other.agentEnvironmentId &&
                    sourceId == other.sourceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(id, agentEnvironmentId, sourceId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuntimeBinding{id=$id, agentEnvironmentId=$agentEnvironmentId, sourceId=$sourceId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Environment &&
                id == other.id &&
                agentId == other.agentId &&
                environment == other.environment &&
                tracerSessionId == other.tracerSessionId &&
                tracerSessionName == other.tracerSessionName &&
                runtimeBindings == other.runtimeBindings &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                agentId,
                environment,
                tracerSessionId,
                tracerSessionName,
                runtimeBindings,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Environment{id=$id, agentId=$agentId, environment=$environment, tracerSessionId=$tracerSessionId, tracerSessionName=$tracerSessionName, runtimeBindings=$runtimeBindings, additionalProperties=$additionalProperties}"
    }

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LSD = of("LSD")

            @JvmField val MDA = of("MDA")

            @JvmField val EXTERNAL = of("EXTERNAL")

            @JvmField val FLEET = of("FLEET")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            LSD,
            MDA,
            EXTERNAL,
            FLEET,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LSD,
            MDA,
            EXTERNAL,
            FLEET,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                LSD -> Value.LSD
                MDA -> Value.MDA
                EXTERNAL -> Value.EXTERNAL
                FLEET -> Value.FLEET
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                LSD -> Known.LSD
                MDA -> Known.MDA
                EXTERNAL -> Known.EXTERNAL
                FLEET -> Known.FLEET
                else -> throw LangChainInvalidDataException("Unknown SourceType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangChainInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): SourceType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Agent &&
            id == other.id &&
            agentType == other.agentType &&
            createdAt == other.createdAt &&
            environments == other.environments &&
            name == other.name &&
            sourceType == other.sourceType &&
            tagKeyId == other.tagKeyId &&
            tagValueId == other.tagValueId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            agentType,
            createdAt,
            environments,
            name,
            sourceType,
            tagKeyId,
            tagValueId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Agent{id=$id, agentType=$agentType, createdAt=$createdAt, environments=$environments, name=$name, sourceType=$sourceType, tagKeyId=$tagKeyId, tagValueId=$tagValueId, additionalProperties=$additionalProperties}"
}
