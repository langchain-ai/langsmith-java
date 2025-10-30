// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException

class ExampleSelect @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ID = of("id")

        @JvmField val CREATED_AT = of("created_at")

        @JvmField val MODIFIED_AT = of("modified_at")

        @JvmField val NAME = of("name")

        @JvmField val DATASET_ID = of("dataset_id")

        @JvmField val SOURCE_RUN_ID = of("source_run_id")

        @JvmField val METADATA = of("metadata")

        @JvmField val INPUTS = of("inputs")

        @JvmField val OUTPUTS = of("outputs")

        @JvmField val ATTACHMENT_URLS = of("attachment_urls")

        @JvmStatic fun of(value: String) = ExampleSelect(JsonField.of(value))
    }

    /** An enum containing [ExampleSelect]'s known values. */
    enum class Known {
        ID,
        CREATED_AT,
        MODIFIED_AT,
        NAME,
        DATASET_ID,
        SOURCE_RUN_ID,
        METADATA,
        INPUTS,
        OUTPUTS,
        ATTACHMENT_URLS,
    }

    /**
     * An enum containing [ExampleSelect]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ExampleSelect] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ID,
        CREATED_AT,
        MODIFIED_AT,
        NAME,
        DATASET_ID,
        SOURCE_RUN_ID,
        METADATA,
        INPUTS,
        OUTPUTS,
        ATTACHMENT_URLS,
        /**
         * An enum member indicating that [ExampleSelect] was instantiated with an unknown value.
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
            ID -> Value.ID
            CREATED_AT -> Value.CREATED_AT
            MODIFIED_AT -> Value.MODIFIED_AT
            NAME -> Value.NAME
            DATASET_ID -> Value.DATASET_ID
            SOURCE_RUN_ID -> Value.SOURCE_RUN_ID
            METADATA -> Value.METADATA
            INPUTS -> Value.INPUTS
            OUTPUTS -> Value.OUTPUTS
            ATTACHMENT_URLS -> Value.ATTACHMENT_URLS
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
            ID -> Known.ID
            CREATED_AT -> Known.CREATED_AT
            MODIFIED_AT -> Known.MODIFIED_AT
            NAME -> Known.NAME
            DATASET_ID -> Known.DATASET_ID
            SOURCE_RUN_ID -> Known.SOURCE_RUN_ID
            METADATA -> Known.METADATA
            INPUTS -> Known.INPUTS
            OUTPUTS -> Known.OUTPUTS
            ATTACHMENT_URLS -> Known.ATTACHMENT_URLS
            else -> throw LangsmithApiInvalidDataException("Unknown ExampleSelect: $value")
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

    fun validate(): ExampleSelect = apply {
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

        return other is ExampleSelect && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
