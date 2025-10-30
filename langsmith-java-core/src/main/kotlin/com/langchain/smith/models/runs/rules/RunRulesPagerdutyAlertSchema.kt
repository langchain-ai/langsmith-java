// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

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
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RunRulesPagerdutyAlertSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val routingKey: JsonField<String>,
    private val severity: JsonField<Severity>,
    private val summary: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("routing_key")
        @ExcludeMissing
        routingKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("severity") @ExcludeMissing severity: JsonField<Severity> = JsonMissing.of(),
        @JsonProperty("summary") @ExcludeMissing summary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(routingKey, severity, summary, type, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingKey(): String = routingKey.getRequired("routing_key")

    /**
     * Enum for severity.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun severity(): Optional<Severity> = severity.getOptional("severity")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun summary(): Optional<String> = summary.getOptional("summary")

    /**
     * Enum for alert types.
     *
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Returns the raw JSON value of [routingKey].
     *
     * Unlike [routingKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_key") @ExcludeMissing fun _routingKey(): JsonField<String> = routingKey

    /**
     * Returns the raw JSON value of [severity].
     *
     * Unlike [severity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("severity") @ExcludeMissing fun _severity(): JsonField<Severity> = severity

    /**
     * Returns the raw JSON value of [summary].
     *
     * Unlike [summary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("summary") @ExcludeMissing fun _summary(): JsonField<String> = summary

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [RunRulesPagerdutyAlertSchema].
         *
         * The following fields are required:
         * ```java
         * .routingKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRulesPagerdutyAlertSchema]. */
    class Builder internal constructor() {

        private var routingKey: JsonField<String>? = null
        private var severity: JsonField<Severity> = JsonMissing.of()
        private var summary: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runRulesPagerdutyAlertSchema: RunRulesPagerdutyAlertSchema) = apply {
            routingKey = runRulesPagerdutyAlertSchema.routingKey
            severity = runRulesPagerdutyAlertSchema.severity
            summary = runRulesPagerdutyAlertSchema.summary
            type = runRulesPagerdutyAlertSchema.type
            additionalProperties = runRulesPagerdutyAlertSchema.additionalProperties.toMutableMap()
        }

        fun routingKey(routingKey: String) = routingKey(JsonField.of(routingKey))

        /**
         * Sets [Builder.routingKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingKey(routingKey: JsonField<String>) = apply { this.routingKey = routingKey }

        /** Enum for severity. */
        fun severity(severity: Severity?) = severity(JsonField.ofNullable(severity))

        /** Alias for calling [Builder.severity] with `severity.orElse(null)`. */
        fun severity(severity: Optional<Severity>) = severity(severity.getOrNull())

        /**
         * Sets [Builder.severity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.severity] with a well-typed [Severity] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun severity(severity: JsonField<Severity>) = apply { this.severity = severity }

        fun summary(summary: String?) = summary(JsonField.ofNullable(summary))

        /** Alias for calling [Builder.summary] with `summary.orElse(null)`. */
        fun summary(summary: Optional<String>) = summary(summary.getOrNull())

        /**
         * Sets [Builder.summary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.summary] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun summary(summary: JsonField<String>) = apply { this.summary = summary }

        /** Enum for alert types. */
        fun type(type: Type?) = type(JsonField.ofNullable(type))

        /** Alias for calling [Builder.type] with `type.orElse(null)`. */
        fun type(type: Optional<Type>) = type(type.getOrNull())

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [RunRulesPagerdutyAlertSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .routingKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunRulesPagerdutyAlertSchema =
            RunRulesPagerdutyAlertSchema(
                checkRequired("routingKey", routingKey),
                severity,
                summary,
                type,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RunRulesPagerdutyAlertSchema = apply {
        if (validated) {
            return@apply
        }

        routingKey()
        severity().ifPresent { it.validate() }
        summary()
        type().ifPresent { it.validate() }
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
        (if (routingKey.asKnown().isPresent) 1 else 0) +
            (severity.asKnown().getOrNull()?.validity() ?: 0) +
            (if (summary.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Enum for severity. */
    class Severity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CRITICAL = of("critical")

            @JvmField val WARNING = of("warning")

            @JvmField val ERROR = of("error")

            @JvmField val INFO = of("info")

            @JvmStatic fun of(value: String) = Severity(JsonField.of(value))
        }

        /** An enum containing [Severity]'s known values. */
        enum class Known {
            CRITICAL,
            WARNING,
            ERROR,
            INFO,
        }

        /**
         * An enum containing [Severity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Severity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CRITICAL,
            WARNING,
            ERROR,
            INFO,
            /** An enum member indicating that [Severity] was instantiated with an unknown value. */
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
                CRITICAL -> Value.CRITICAL
                WARNING -> Value.WARNING
                ERROR -> Value.ERROR
                INFO -> Value.INFO
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                CRITICAL -> Known.CRITICAL
                WARNING -> Known.WARNING
                ERROR -> Known.ERROR
                INFO -> Known.INFO
                else -> throw LangsmithInvalidDataException("Unknown Severity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Severity = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Severity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Enum for alert types. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAGERDUTY = of("pagerduty")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PAGERDUTY
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAGERDUTY,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PAGERDUTY -> Value.PAGERDUTY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PAGERDUTY -> Known.PAGERDUTY
                else -> throw LangsmithInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Type = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRulesPagerdutyAlertSchema &&
            routingKey == other.routingKey &&
            severity == other.severity &&
            summary == other.summary &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(routingKey, severity, summary, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RunRulesPagerdutyAlertSchema{routingKey=$routingKey, severity=$severity, summary=$summary, type=$type, additionalProperties=$additionalProperties}"
}
