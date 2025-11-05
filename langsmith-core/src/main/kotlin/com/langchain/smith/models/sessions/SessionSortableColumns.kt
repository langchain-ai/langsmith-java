// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.errors.LangChainInvalidDataException

class SessionSortableColumns
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

        @JvmField val NAME = of("name")

        @JvmField val START_TIME = of("start_time")

        @JvmField val LAST_RUN_START_TIME = of("last_run_start_time")

        @JvmField val LATENCY_P50 = of("latency_p50")

        @JvmField val LATENCY_P99 = of("latency_p99")

        @JvmField val ERROR_RATE = of("error_rate")

        @JvmField val FEEDBACK = of("feedback")

        @JvmField val RUNS_COUNT = of("runs_count")

        @JvmStatic fun of(value: String) = SessionSortableColumns(JsonField.of(value))
    }

    /** An enum containing [SessionSortableColumns]'s known values. */
    enum class Known {
        NAME,
        START_TIME,
        LAST_RUN_START_TIME,
        LATENCY_P50,
        LATENCY_P99,
        ERROR_RATE,
        FEEDBACK,
        RUNS_COUNT,
    }

    /**
     * An enum containing [SessionSortableColumns]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [SessionSortableColumns] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        NAME,
        START_TIME,
        LAST_RUN_START_TIME,
        LATENCY_P50,
        LATENCY_P99,
        ERROR_RATE,
        FEEDBACK,
        RUNS_COUNT,
        /**
         * An enum member indicating that [SessionSortableColumns] was instantiated with an unknown
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
            NAME -> Value.NAME
            START_TIME -> Value.START_TIME
            LAST_RUN_START_TIME -> Value.LAST_RUN_START_TIME
            LATENCY_P50 -> Value.LATENCY_P50
            LATENCY_P99 -> Value.LATENCY_P99
            ERROR_RATE -> Value.ERROR_RATE
            FEEDBACK -> Value.FEEDBACK
            RUNS_COUNT -> Value.RUNS_COUNT
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LangChainInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            NAME -> Known.NAME
            START_TIME -> Known.START_TIME
            LAST_RUN_START_TIME -> Known.LAST_RUN_START_TIME
            LATENCY_P50 -> Known.LATENCY_P50
            LATENCY_P99 -> Known.LATENCY_P99
            ERROR_RATE -> Known.ERROR_RATE
            FEEDBACK -> Known.FEEDBACK
            RUNS_COUNT -> Known.RUNS_COUNT
            else -> throw LangChainInvalidDataException("Unknown SessionSortableColumns: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LangChainInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LangChainInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): SessionSortableColumns = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionSortableColumns && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
