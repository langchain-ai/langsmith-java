// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.alerts

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AlertActionBase
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val config: JsonValue,
    private val target: JsonField<Target>,
    private val id: JsonField<String>,
    private val alertRuleId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("config") @ExcludeMissing config: JsonValue = JsonMissing.of(),
        @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("alert_rule_id")
        @ExcludeMissing
        alertRuleId: JsonField<String> = JsonMissing.of(),
    ) : this(config, target, id, alertRuleId, mutableMapOf())

    @JsonProperty("config") @ExcludeMissing fun _config(): JsonValue = config

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun target(): Target = target.getRequired("target")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun alertRuleId(): Optional<String> = alertRuleId.getOptional("alert_rule_id")

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [alertRuleId].
     *
     * Unlike [alertRuleId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("alert_rule_id")
    @ExcludeMissing
    fun _alertRuleId(): JsonField<String> = alertRuleId

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
         * Returns a mutable builder for constructing an instance of [AlertActionBase].
         *
         * The following fields are required:
         * ```java
         * .config()
         * .target()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertActionBase]. */
    class Builder internal constructor() {

        private var config: JsonValue? = null
        private var target: JsonField<Target>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var alertRuleId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alertActionBase: AlertActionBase) = apply {
            config = alertActionBase.config
            target = alertActionBase.target
            id = alertActionBase.id
            alertRuleId = alertActionBase.alertRuleId
            additionalProperties = alertActionBase.additionalProperties.toMutableMap()
        }

        fun config(config: JsonValue) = apply { this.config = config }

        fun target(target: Target) = target(JsonField.of(target))

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { this.target = target }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun alertRuleId(alertRuleId: String) = alertRuleId(JsonField.of(alertRuleId))

        /**
         * Sets [Builder.alertRuleId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alertRuleId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alertRuleId(alertRuleId: JsonField<String>) = apply { this.alertRuleId = alertRuleId }

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
         * Returns an immutable instance of [AlertActionBase].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .config()
         * .target()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertActionBase =
            AlertActionBase(
                checkRequired("config", config),
                checkRequired("target", target),
                id,
                alertRuleId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AlertActionBase = apply {
        if (validated) {
            return@apply
        }

        target().validate()
        id()
        alertRuleId()
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
        (target.asKnown().getOrNull()?.validity() ?: 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (alertRuleId.asKnown().isPresent) 1 else 0)

    class Target @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WEBHOOK = of("webhook")

            @JvmStatic fun of(value: String) = Target(JsonField.of(value))
        }

        /** An enum containing [Target]'s known values. */
        enum class Known {
            PAGERDUTY,
            WEBHOOK,
        }

        /**
         * An enum containing [Target]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Target] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAGERDUTY,
            WEBHOOK,
            /** An enum member indicating that [Target] was instantiated with an unknown value. */
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
                WEBHOOK -> Value.WEBHOOK
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
                PAGERDUTY -> Known.PAGERDUTY
                WEBHOOK -> Known.WEBHOOK
                else -> throw LangChainInvalidDataException("Unknown Target: $value")
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

        fun validate(): Target = apply {
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

            return other is Target && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertActionBase &&
            config == other.config &&
            target == other.target &&
            id == other.id &&
            alertRuleId == other.alertRuleId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(config, target, id, alertRuleId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AlertActionBase{config=$config, target=$target, id=$id, alertRuleId=$alertRuleId, additionalProperties=$additionalProperties}"
}
