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
 * **Alpha:** The request and response contract may change; Retrieve all traces belonging to a
 * specific thread within a project.
 */
class ThreadListTracesParams
private constructor(
    private val threadId: String?,
    private val projectId: String,
    private val cursor: String?,
    private val filter: String?,
    private val pageSize: Long?,
    private val selects: List<Select>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun threadId(): Optional<String> = Optional.ofNullable(threadId)

    /** `project_id` is the tracing project UUID (required). */
    fun projectId(): String = projectId

    /**
     * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the first
     * request; pass the returned cursor to fetch the next page.
     */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /**
     * `filter` narrows which traces are returned for this thread, using a LangSmith filter
     * expression evaluated against each root trace run. For example: eq(status, "success") or
     * has(tags, "production"). See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /**
     * `page_size` is the maximum number of traces to return in this response. Defaults to 20 when
     * omitted; must be between 1 and 100 inclusive when set.
     */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * `selects` lists which properties to include on each returned trace (repeatable query
     * parameter). Accepts any value of the `ThreadTraceSelectField` enum. Properties not listed are
     * omitted from each trace object; `trace_id` is always returned.
     */
    fun selects(): Optional<List<Select>> = Optional.ofNullable(selects)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ThreadListTracesParams].
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ThreadListTracesParams]. */
    class Builder internal constructor() {

        private var threadId: String? = null
        private var projectId: String? = null
        private var cursor: String? = null
        private var filter: String? = null
        private var pageSize: Long? = null
        private var selects: MutableList<Select>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(threadListTracesParams: ThreadListTracesParams) = apply {
            threadId = threadListTracesParams.threadId
            projectId = threadListTracesParams.projectId
            cursor = threadListTracesParams.cursor
            filter = threadListTracesParams.filter
            pageSize = threadListTracesParams.pageSize
            selects = threadListTracesParams.selects?.toMutableList()
            additionalHeaders = threadListTracesParams.additionalHeaders.toBuilder()
            additionalQueryParams = threadListTracesParams.additionalQueryParams.toBuilder()
        }

        fun threadId(threadId: String?) = apply { this.threadId = threadId }

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /** `project_id` is the tracing project UUID (required). */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /**
         * `cursor` is the opaque string from a previous response's `next_cursor`. Omit on the first
         * request; pass the returned cursor to fetch the next page.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * `filter` narrows which traces are returned for this thread, using a LangSmith filter
         * expression evaluated against each root trace run. For example: eq(status, "success") or
         * has(tags, "production"). See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * `page_size` is the maximum number of traces to return in this response. Defaults to 20
         * when omitted; must be between 1 and 100 inclusive when set.
         */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * `selects` lists which properties to include on each returned trace (repeatable query
         * parameter). Accepts any value of the `ThreadTraceSelectField` enum. Properties not listed
         * are omitted from each trace object; `trace_id` is always returned.
         */
        fun selects(selects: List<Select>?) = apply { this.selects = selects?.toMutableList() }

        /** Alias for calling [Builder.selects] with `selects.orElse(null)`. */
        fun selects(selects: Optional<List<Select>>) = selects(selects.getOrNull())

        /**
         * Adds a single [Select] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: Select) = apply {
            selects = (selects ?: mutableListOf()).apply { add(select) }
        }

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
         * Returns an immutable instance of [ThreadListTracesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ThreadListTracesParams =
            ThreadListTracesParams(
                threadId,
                checkRequired("projectId", projectId),
                cursor,
                filter,
                pageSize,
                selects?.toImmutable(),
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
                put("project_id", projectId)
                cursor?.let { put("cursor", it) }
                filter?.let { put("filter", it) }
                pageSize?.let { put("page_size", it.toString()) }
                selects?.forEach { put("selects", it.toString()) }
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

            @JvmField val THREAD_ID = of("THREAD_ID")

            @JvmField val TRACE_ID = of("TRACE_ID")

            @JvmField val OP = of("OP")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val START_TIME = of("START_TIME")

            @JvmField val END_TIME = of("END_TIME")

            @JvmField val LATENCY = of("LATENCY")

            @JvmField val FIRST_TOKEN_TIME = of("FIRST_TOKEN_TIME")

            @JvmField val INPUTS_PREVIEW = of("INPUTS_PREVIEW")

            @JvmField val OUTPUTS_PREVIEW = of("OUTPUTS_PREVIEW")

            @JvmField val INPUTS = of("INPUTS")

            @JvmField val OUTPUTS = of("OUTPUTS")

            @JvmField val ERROR = of("ERROR")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val NAME = of("NAME")

            @JvmField val ERROR_PREVIEW = of("ERROR_PREVIEW")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            THREAD_ID,
            TRACE_ID,
            OP,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_TOKENS,
            START_TIME,
            END_TIME,
            LATENCY,
            FIRST_TOKEN_TIME,
            INPUTS_PREVIEW,
            OUTPUTS_PREVIEW,
            INPUTS,
            OUTPUTS,
            ERROR,
            PROMPT_COST,
            COMPLETION_COST,
            TOTAL_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            NAME,
            ERROR_PREVIEW,
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
            THREAD_ID,
            TRACE_ID,
            OP,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_TOKENS,
            START_TIME,
            END_TIME,
            LATENCY,
            FIRST_TOKEN_TIME,
            INPUTS_PREVIEW,
            OUTPUTS_PREVIEW,
            INPUTS,
            OUTPUTS,
            ERROR,
            PROMPT_COST,
            COMPLETION_COST,
            TOTAL_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            NAME,
            ERROR_PREVIEW,
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
                THREAD_ID -> Value.THREAD_ID
                TRACE_ID -> Value.TRACE_ID
                OP -> Value.OP
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                LATENCY -> Value.LATENCY
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                INPUTS_PREVIEW -> Value.INPUTS_PREVIEW
                OUTPUTS_PREVIEW -> Value.OUTPUTS_PREVIEW
                INPUTS -> Value.INPUTS
                OUTPUTS -> Value.OUTPUTS
                ERROR -> Value.ERROR
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                NAME -> Value.NAME
                ERROR_PREVIEW -> Value.ERROR_PREVIEW
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
                THREAD_ID -> Known.THREAD_ID
                TRACE_ID -> Known.TRACE_ID
                OP -> Known.OP
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                LATENCY -> Known.LATENCY
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                INPUTS_PREVIEW -> Known.INPUTS_PREVIEW
                OUTPUTS_PREVIEW -> Known.OUTPUTS_PREVIEW
                INPUTS -> Known.INPUTS
                OUTPUTS -> Known.OUTPUTS
                ERROR -> Known.ERROR
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                NAME -> Known.NAME
                ERROR_PREVIEW -> Known.ERROR_PREVIEW
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

        return other is ThreadListTracesParams &&
            threadId == other.threadId &&
            projectId == other.projectId &&
            cursor == other.cursor &&
            filter == other.filter &&
            pageSize == other.pageSize &&
            selects == other.selects &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            threadId,
            projectId,
            cursor,
            filter,
            pageSize,
            selects,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ThreadListTracesParams{threadId=$threadId, projectId=$projectId, cursor=$cursor, filter=$filter, pageSize=$pageSize, selects=$selects, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
