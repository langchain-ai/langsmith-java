// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs.logs

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.errors.LangsmithInvalidDataException

class EPromptOptimizationJobLogType
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val INFO = of("info")

        @JvmField val RESULT = of("result")

        @JvmField val ERROR = of("error")

        @JvmField val LINK = of("link")

        @JvmStatic fun of(value: String) = EPromptOptimizationJobLogType(JsonField.of(value))
    }

    /** An enum containing [EPromptOptimizationJobLogType]'s known values. */
    enum class Known {
        INFO,
        RESULT,
        ERROR,
        LINK,
    }

    /**
     * An enum containing [EPromptOptimizationJobLogType]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [EPromptOptimizationJobLogType] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        INFO,
        RESULT,
        ERROR,
        LINK,
        /**
         * An enum member indicating that [EPromptOptimizationJobLogType] was instantiated with an
         * unknown value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            INFO -> Value.INFO
            RESULT -> Value.RESULT
            ERROR -> Value.ERROR
            LINK -> Value.LINK
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LangsmithInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            INFO -> Known.INFO
            RESULT -> Known.RESULT
            ERROR -> Known.ERROR
            LINK -> Known.LINK
            else ->
                throw LangsmithInvalidDataException("Unknown EPromptOptimizationJobLogType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LangsmithInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LangsmithInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): EPromptOptimizationJobLogType = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EPromptOptimizationJobLogType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
