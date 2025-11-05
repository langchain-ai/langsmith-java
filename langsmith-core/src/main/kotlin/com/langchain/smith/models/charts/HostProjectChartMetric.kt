// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.errors.LangChainInvalidDataException

/** LGP Metrics you can chart. */
class HostProjectChartMetric
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

        @JvmField val MEMORY_USAGE = of("memory_usage")

        @JvmField val CPU_USAGE = of("cpu_usage")

        @JvmField val DISK_USAGE = of("disk_usage")

        @JvmField val RESTART_COUNT = of("restart_count")

        @JvmField val REPLICA_COUNT = of("replica_count")

        @JvmField val WORKER_COUNT = of("worker_count")

        @JvmField val LG_RUN_COUNT = of("lg_run_count")

        @JvmField val RESPONSES_PER_SECOND = of("responses_per_second")

        @JvmField val ERROR_RESPONSES_PER_SECOND = of("error_responses_per_second")

        @JvmField val P95_LATENCY = of("p95_latency")

        @JvmStatic fun of(value: String) = HostProjectChartMetric(JsonField.of(value))
    }

    /** An enum containing [HostProjectChartMetric]'s known values. */
    enum class Known {
        MEMORY_USAGE,
        CPU_USAGE,
        DISK_USAGE,
        RESTART_COUNT,
        REPLICA_COUNT,
        WORKER_COUNT,
        LG_RUN_COUNT,
        RESPONSES_PER_SECOND,
        ERROR_RESPONSES_PER_SECOND,
        P95_LATENCY,
    }

    /**
     * An enum containing [HostProjectChartMetric]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [HostProjectChartMetric] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        MEMORY_USAGE,
        CPU_USAGE,
        DISK_USAGE,
        RESTART_COUNT,
        REPLICA_COUNT,
        WORKER_COUNT,
        LG_RUN_COUNT,
        RESPONSES_PER_SECOND,
        ERROR_RESPONSES_PER_SECOND,
        P95_LATENCY,
        /**
         * An enum member indicating that [HostProjectChartMetric] was instantiated with an unknown
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
            MEMORY_USAGE -> Value.MEMORY_USAGE
            CPU_USAGE -> Value.CPU_USAGE
            DISK_USAGE -> Value.DISK_USAGE
            RESTART_COUNT -> Value.RESTART_COUNT
            REPLICA_COUNT -> Value.REPLICA_COUNT
            WORKER_COUNT -> Value.WORKER_COUNT
            LG_RUN_COUNT -> Value.LG_RUN_COUNT
            RESPONSES_PER_SECOND -> Value.RESPONSES_PER_SECOND
            ERROR_RESPONSES_PER_SECOND -> Value.ERROR_RESPONSES_PER_SECOND
            P95_LATENCY -> Value.P95_LATENCY
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
            MEMORY_USAGE -> Known.MEMORY_USAGE
            CPU_USAGE -> Known.CPU_USAGE
            DISK_USAGE -> Known.DISK_USAGE
            RESTART_COUNT -> Known.RESTART_COUNT
            REPLICA_COUNT -> Known.REPLICA_COUNT
            WORKER_COUNT -> Known.WORKER_COUNT
            LG_RUN_COUNT -> Known.LG_RUN_COUNT
            RESPONSES_PER_SECOND -> Known.RESPONSES_PER_SECOND
            ERROR_RESPONSES_PER_SECOND -> Known.ERROR_RESPONSES_PER_SECOND
            P95_LATENCY -> Known.P95_LATENCY
            else -> throw LangChainInvalidDataException("Unknown HostProjectChartMetric: $value")
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

    fun validate(): HostProjectChartMetric = apply {
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

        return other is HostProjectChartMetric && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
