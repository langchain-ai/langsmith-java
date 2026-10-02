// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class AgentAddress
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val environment: JsonField<Environment>,
    private val kind: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("environment")
        @ExcludeMissing
        environment: JsonField<Environment> = JsonMissing.of(),
        @JsonProperty("kind") @ExcludeMissing kind: JsonValue = JsonMissing.of(),
    ) : this(id, environment, kind, mutableMapOf())

    /**
     * `id` is the Agent's user-assigned id.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * `environment` is the Agent environment.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun environment(): Environment = environment.getRequired("environment")

    /**
     * Expected to always return the following:
     * ```java
     * JsonValue.from("AGENT")
     * ```
     *
     * However, this method can be useful for debugging and logging (e.g. if the server responded
     * with an unexpected value).
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonValue = kind

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [environment].
     *
     * Unlike [environment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("environment")
    @ExcludeMissing
    fun _environment(): JsonField<Environment> = environment

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
         * Returns a mutable builder for constructing an instance of [AgentAddress].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .environment()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AgentAddress]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var environment: JsonField<Environment>? = null
        private var kind: JsonValue = JsonValue.from("AGENT")
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(agentAddress: AgentAddress) = apply {
            id = agentAddress.id
            environment = agentAddress.environment
            kind = agentAddress.kind
            additionalProperties = agentAddress.additionalProperties.toMutableMap()
        }

        /** `id` is the Agent's user-assigned id. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** `environment` is the Agent environment. */
        fun environment(environment: Environment) = environment(JsonField.of(environment))

        /**
         * Sets [Builder.environment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.environment] with a well-typed [Environment] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun environment(environment: JsonField<Environment>) = apply {
            this.environment = environment
        }

        /**
         * Sets the field to an arbitrary JSON value.
         *
         * It is usually unnecessary to call this method because the field defaults to the
         * following:
         * ```java
         * JsonValue.from("AGENT")
         * ```
         *
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kind(kind: JsonValue) = apply { this.kind = kind }

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
         * Returns an immutable instance of [AgentAddress].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .environment()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgentAddress =
            AgentAddress(
                checkRequired("id", id),
                checkRequired("environment", environment),
                kind,
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
    fun validate(): AgentAddress = apply {
        if (validated) {
            return@apply
        }

        id()
        environment().validate()
        _kind().let {
            if (it != JsonValue.from("AGENT")) {
                throw LangChainInvalidDataException("'kind' is invalid, received $it")
            }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (environment.asKnown().getOrNull()?.validity() ?: 0) +
            kind.let { if (it == JsonValue.from("AGENT")) 1 else 0 }

    /** `environment` is the Agent environment. */
    class Environment @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val LOCAL = of("LOCAL")

            @JvmField val DEVELOPMENT = of("DEVELOPMENT")

            @JvmField val STAGING = of("STAGING")

            @JvmField val PRODUCTION = of("PRODUCTION")

            @JvmStatic fun of(value: String) = Environment(JsonField.of(value))
        }

        /** An enum containing [Environment]'s known values. */
        enum class Known {
            LOCAL,
            DEVELOPMENT,
            STAGING,
            PRODUCTION,
        }

        /**
         * An enum containing [Environment]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Environment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOCAL,
            DEVELOPMENT,
            STAGING,
            PRODUCTION,
            /**
             * An enum member indicating that [Environment] was instantiated with an unknown value.
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
                LOCAL -> Value.LOCAL
                DEVELOPMENT -> Value.DEVELOPMENT
                STAGING -> Value.STAGING
                PRODUCTION -> Value.PRODUCTION
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
                LOCAL -> Known.LOCAL
                DEVELOPMENT -> Known.DEVELOPMENT
                STAGING -> Known.STAGING
                PRODUCTION -> Known.PRODUCTION
                else -> throw LangChainInvalidDataException("Unknown Environment: $value")
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
        fun validate(): Environment = apply {
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

            return other is Environment && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgentAddress &&
            id == other.id &&
            environment == other.environment &&
            kind == other.kind &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, environment, kind, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgentAddress{id=$id, environment=$environment, kind=$kind, additionalProperties=$additionalProperties}"
}
