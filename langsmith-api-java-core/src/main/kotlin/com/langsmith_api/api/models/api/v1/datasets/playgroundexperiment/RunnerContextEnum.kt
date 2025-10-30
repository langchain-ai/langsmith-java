// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException

class RunnerContextEnum @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val LANGSMITH_UI = of("langsmith_ui")

        @JvmField val LANGSMITH_ALIGN_EVALS = of("langsmith_align_evals")

        @JvmStatic fun of(value: String) = RunnerContextEnum(JsonField.of(value))
    }

    /** An enum containing [RunnerContextEnum]'s known values. */
    enum class Known {
        LANGSMITH_UI,
        LANGSMITH_ALIGN_EVALS,
    }

    /**
     * An enum containing [RunnerContextEnum]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [RunnerContextEnum] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        LANGSMITH_UI,
        LANGSMITH_ALIGN_EVALS,
        /**
         * An enum member indicating that [RunnerContextEnum] was instantiated with an unknown
         * value.
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
            LANGSMITH_UI -> Value.LANGSMITH_UI
            LANGSMITH_ALIGN_EVALS -> Value.LANGSMITH_ALIGN_EVALS
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            LANGSMITH_UI -> Known.LANGSMITH_UI
            LANGSMITH_ALIGN_EVALS -> Known.LANGSMITH_ALIGN_EVALS
            else -> throw LangsmithApiInvalidDataException("Unknown RunnerContextEnum: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            LangsmithApiInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): RunnerContextEnum = apply {
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
        } catch (e: LangsmithApiInvalidDataException) {
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

        return other is RunnerContextEnum && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
