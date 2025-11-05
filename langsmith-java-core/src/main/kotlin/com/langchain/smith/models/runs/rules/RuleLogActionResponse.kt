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
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class RuleLogActionResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val outcome: JsonField<Outcome>,
    private val payload: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("outcome") @ExcludeMissing outcome: JsonField<Outcome> = JsonMissing.of(),
        @JsonProperty("payload") @ExcludeMissing payload: JsonValue = JsonMissing.of(),
    ) : this(outcome, payload, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun outcome(): Outcome = outcome.getRequired("outcome")

    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonValue = payload

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

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
         * Returns a mutable builder for constructing an instance of [RuleLogActionResponse].
         *
         * The following fields are required:
         * ```java
         * .outcome()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleLogActionResponse]. */
    class Builder internal constructor() {

        private var outcome: JsonField<Outcome>? = null
        private var payload: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ruleLogActionResponse: RuleLogActionResponse) = apply {
            outcome = ruleLogActionResponse.outcome
            payload = ruleLogActionResponse.payload
            additionalProperties = ruleLogActionResponse.additionalProperties.toMutableMap()
        }

        fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [Outcome] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

        fun payload(payload: JsonValue) = apply { this.payload = payload }

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
         * Returns an immutable instance of [RuleLogActionResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .outcome()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RuleLogActionResponse =
            RuleLogActionResponse(
                checkRequired("outcome", outcome),
                payload,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RuleLogActionResponse = apply {
        if (validated) {
            return@apply
        }

        outcome().validate()
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
    @JvmSynthetic internal fun validity(): Int = (outcome.asKnown().getOrNull()?.validity() ?: 0)

    class Outcome @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SUCCESS = of("success")

            @JvmField val SKIPPED = of("skipped")

            @JvmField val ERROR = of("error")

            @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
        }

        /** An enum containing [Outcome]'s known values. */
        enum class Known {
            SUCCESS,
            SKIPPED,
            ERROR,
        }

        /**
         * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Outcome] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            SKIPPED,
            ERROR,
            /** An enum member indicating that [Outcome] was instantiated with an unknown value. */
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
                SUCCESS -> Value.SUCCESS
                SKIPPED -> Value.SKIPPED
                ERROR -> Value.ERROR
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
                SUCCESS -> Known.SUCCESS
                SKIPPED -> Known.SKIPPED
                ERROR -> Known.ERROR
                else -> throw LangChainInvalidDataException("Unknown Outcome: $value")
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

        fun validate(): Outcome = apply {
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

            return other is Outcome && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RuleLogActionResponse &&
            outcome == other.outcome &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(outcome, payload, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RuleLogActionResponse{outcome=$outcome, payload=$payload, additionalProperties=$additionalProperties}"
}
