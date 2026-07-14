// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.threads

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Alpha:** The request and response contract may change; Compute aggregate stats for a single
 * thread (turn count, latency percentiles, token/cost sums, and detail breakdowns) within a
 * project.
 */
class ThreadStatsParams
private constructor(
    private val threadId: String?,
    private val selects: List<Select>,
    private val sessionId: String,
    private val filter: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<String> = Optional.ofNullable(threadId)

    /**
     * `selects` lists which aggregate stats to compute and return (repeatable query parameter). At
     * least one value is required. Accepts any value of `SingleThreadStatsSelectField`.
     */
    fun selects(): List<Select> = selects

    /** `session_id` is the tracing project (session) UUID (required). */
    fun sessionId(): String = sessionId

    /**
     * `filter` narrows which of the thread's traces are aggregated, using a LangSmith filter
     * expression. For example: lt(start_time, "2025-01-01T00:00:00Z") or eq(trace_id,
     * "0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328"). See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadStatsParams].
         *
         * The following fields are required:
         * ```java
         * .selects()
         * .sessionId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadStatsParams]. */
    class Builder internal constructor() {

        private var threadId: String? = null
        private var selects: MutableList<Select>? = null
        private var sessionId: String? = null
        private var filter: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadStatsParams: ThreadStatsParams) = apply {
            threadId = threadStatsParams.threadId
            selects = threadStatsParams.selects.toMutableList()
            sessionId = threadStatsParams.sessionId
            filter = threadStatsParams.filter
            additionalHeaders = threadStatsParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadStatsParams.additionalQueryParams.toBuilder()
        }

        fun threadId(threadId: String?) = apply { this.threadId = threadId }

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * `selects` lists which aggregate stats to compute and return (repeatable query parameter).
         * At least one value is required. Accepts any value of `SingleThreadStatsSelectField`.
         */
        fun selects(selects: List<Select>) = apply { this.selects = selects.toMutableList() }

        /**
         * Adds a single [Select] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply {
            selects = (selects ?: mutableListOf()).apply { add(select) }
        }

        /** `session_id` is the tracing project (session) UUID (required). */
        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        /**
         * `filter` narrows which of the thread's traces are aggregated, using a LangSmith filter
         * expression. For example: lt(start_time, "2025-01-01T00:00:00Z") or eq(trace_id,
         * "0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ThreadStatsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .selects()
         * .sessionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadStatsParams =
            ThreadStatsParams(
                threadId,
                checkRequired("selects", selects).toImmutable(),
                checkRequired("sessionId", sessionId),
                filter,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> threadId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                selects.forEach { put("selects", it.toString()) }
                put("session_id", sessionId)
                filter?.let { put("filter", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Select @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TURNS = of("TURNS")

            @JvmField val FIRST_START_TIME = of("FIRST_START_TIME")

            @JvmField val LAST_START_TIME = of("LAST_START_TIME")

            @JvmField val LAST_END_TIME = of("LAST_END_TIME")

            @JvmField val LATENCY_P50 = of("LATENCY_P50")

            @JvmField val LATENCY_P99 = of("LATENCY_P99")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val FEEDBACK_STATS = of("FEEDBACK_STATS")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            TURNS,
            FIRST_START_TIME,
            LAST_START_TIME,
            LAST_END_TIME,
            LATENCY_P50,
            LATENCY_P99,
            PROMPT_TOKENS,
            PROMPT_COST,
            COMPLETION_TOKENS,
            COMPLETION_COST,
            TOTAL_TOKENS,
            TOTAL_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            FEEDBACK_STATS,
        }

        /**
         * An enum containing [Select]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Select] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TURNS,
            FIRST_START_TIME,
            LAST_START_TIME,
            LAST_END_TIME,
            LATENCY_P50,
            LATENCY_P99,
            PROMPT_TOKENS,
            PROMPT_COST,
            COMPLETION_TOKENS,
            COMPLETION_COST,
            TOTAL_TOKENS,
            TOTAL_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            FEEDBACK_STATS,
            /** An enum member indicating that [Select] was instantiated with an unknown value. */
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
                TURNS -> Value.TURNS
                FIRST_START_TIME -> Value.FIRST_START_TIME
                LAST_START_TIME -> Value.LAST_START_TIME
                LAST_END_TIME -> Value.LAST_END_TIME
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                COMPLETION_COST -> Value.COMPLETION_COST
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
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
                TURNS -> Known.TURNS
                FIRST_START_TIME -> Known.FIRST_START_TIME
                LAST_START_TIME -> Known.LAST_START_TIME
                LAST_END_TIME -> Known.LAST_END_TIME
                LATENCY_P50 -> Known.LATENCY_P50
                LATENCY_P99 -> Known.LATENCY_P99
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                COMPLETION_COST -> Known.COMPLETION_COST
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                else -> throw LangChainInvalidDataException("Unknown Select: $value")
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
        fun validate(): Select = apply {
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

            return other is Select && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ThreadStatsParams &&
            threadId == other.threadId &&
            selects == other.selects &&
            sessionId == other.sessionId &&
            filter == other.filter &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(threadId, selects, sessionId, filter, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ThreadStatsParams{threadId=$threadId, selects=$selects, sessionId=$sessionId, filter=$filter, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
