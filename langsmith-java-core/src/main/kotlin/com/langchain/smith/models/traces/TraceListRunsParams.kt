// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.traces

import com.fasterxml.jackson.annotation.JsonCreator
import com.langchain.smith.core.Enum
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Alpha:** The request and response contract may change; Returns runs for a trace ID within
 * min/max start time. Optional `filter`; repeatable `selects` to select fields to return.
 */
class TraceListRunsParams
private constructor(
    private val traceId: String?,
    private val projectId: String,
    private val filter: String?,
    private val maxStartTime: OffsetDateTime?,
    private val minStartTime: OffsetDateTime?,
    private val selects: List<Select>?,
    private val accept: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun traceId(): Optional<String> = Optional.ofNullable(traceId)

    /** `project_id` is the UUID of the tracing project that owns the trace. */
    fun projectId(): String = projectId

    /**
     * `filter` narrows which runs within this trace are returned, using a LangSmith filter
     * expression evaluated against each run. For example: `eq(run_type, "llm")` for LLM runs only,
     * or `eq(status, "error")` for failed runs. See
     * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
     */
    fun filter(): Optional<String> = Optional.ofNullable(filter)

    /**
     * `max_start_time` is the optional inclusive upper bound for run `start_time` (RFC3339
     * date-time). Required together with `min_start_time`.
     */
    fun maxStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(maxStartTime)

    /**
     * `min_start_time` is the optional inclusive lower bound for run `start_time` (RFC3339
     * date-time). Required together with `max_start_time`.
     */
    fun minStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(minStartTime)

    /**
     * `selects` lists which properties to include on each returned run (repeatable query
     * parameter). Accepts any value of the `RunSelectField` enum. If omitted, only `id` is
     * returned.
     */
    fun selects(): Optional<List<Select>> = Optional.ofNullable(selects)

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TraceListRunsParams].
         *
         * The following fields are required:
         * ```java
         * .projectId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TraceListRunsParams]. */
    class Builder internal constructor() {

        private var traceId: String? = null
        private var projectId: String? = null
        private var filter: String? = null
        private var maxStartTime: OffsetDateTime? = null
        private var minStartTime: OffsetDateTime? = null
        private var selects: MutableList<Select>? = null
        private var accept: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(traceListRunsParams: TraceListRunsParams) = apply {
            traceId = traceListRunsParams.traceId
            projectId = traceListRunsParams.projectId
            filter = traceListRunsParams.filter
            maxStartTime = traceListRunsParams.maxStartTime
            minStartTime = traceListRunsParams.minStartTime
            selects = traceListRunsParams.selects?.toMutableList()
            accept = traceListRunsParams.accept
            additionalHeaders = traceListRunsParams.additionalHeaders.toBuilder()
            additionalQueryParams = traceListRunsParams.additionalQueryParams.toBuilder()
        }

        fun traceId(traceId: String?) = apply { this.traceId = traceId }

        /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
        fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

        /** `project_id` is the UUID of the tracing project that owns the trace. */
        fun projectId(projectId: String) = apply { this.projectId = projectId }

        /**
         * `filter` narrows which runs within this trace are returned, using a LangSmith filter
         * expression evaluated against each run. For example: `eq(run_type, "llm")` for LLM runs
         * only, or `eq(status, "error")` for failed runs. See
         * https://docs.langchain.com/langsmith/trace-query-syntax#filter-query-language for syntax.
         */
        fun filter(filter: String?) = apply { this.filter = filter }

        /** Alias for calling [Builder.filter] with `filter.orElse(null)`. */
        fun filter(filter: Optional<String>) = filter(filter.getOrNull())

        /**
         * `max_start_time` is the optional inclusive upper bound for run `start_time` (RFC3339
         * date-time). Required together with `min_start_time`.
         */
        fun maxStartTime(maxStartTime: OffsetDateTime?) = apply { this.maxStartTime = maxStartTime }

        /** Alias for calling [Builder.maxStartTime] with `maxStartTime.orElse(null)`. */
        fun maxStartTime(maxStartTime: Optional<OffsetDateTime>) =
            maxStartTime(maxStartTime.getOrNull())

        /**
         * `min_start_time` is the optional inclusive lower bound for run `start_time` (RFC3339
         * date-time). Required together with `max_start_time`.
         */
        fun minStartTime(minStartTime: OffsetDateTime?) = apply { this.minStartTime = minStartTime }

        /** Alias for calling [Builder.minStartTime] with `minStartTime.orElse(null)`. */
        fun minStartTime(minStartTime: Optional<OffsetDateTime>) =
            minStartTime(minStartTime.getOrNull())

        /**
         * `selects` lists which properties to include on each returned run (repeatable query
         * parameter). Accepts any value of the `RunSelectField` enum. If omitted, only `id` is
         * returned.
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

        fun accept(accept: String?) = apply { this.accept = accept }

        /** Alias for calling [Builder.accept] with `accept.orElse(null)`. */
        fun accept(accept: Optional<String>) = accept(accept.getOrNull())

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
         * Returns an immutable instance of [TraceListRunsParams].
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
        fun build(): TraceListRunsParams =
            TraceListRunsParams(
                traceId,
                checkRequired("projectId", projectId),
                filter,
                maxStartTime,
                minStartTime,
                selects?.toImmutable(),
                accept,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> traceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                accept?.let { put("Accept", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("project_id", projectId)
                filter?.let { put("filter", it) }
                maxStartTime?.let {
                    put("max_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                minStartTime?.let {
                    put("min_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
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

            @JvmField val ID = of("ID")

            @JvmField val NAME = of("NAME")

            @JvmField val RUN_TYPE = of("RUN_TYPE")

            @JvmField val STATUS = of("STATUS")

            @JvmField val START_TIME = of("START_TIME")

            @JvmField val END_TIME = of("END_TIME")

            @JvmField val LATENCY_SECONDS = of("LATENCY_SECONDS")

            @JvmField val FIRST_TOKEN_TIME = of("FIRST_TOKEN_TIME")

            @JvmField val ERROR = of("ERROR")

            @JvmField val ERROR_PREVIEW = of("ERROR_PREVIEW")

            @JvmField val EXTRA = of("EXTRA")

            @JvmField val METADATA = of("METADATA")

            @JvmField val EVENTS = of("EVENTS")

            @JvmField val INPUTS = of("INPUTS")

            @JvmField val INPUTS_PREVIEW = of("INPUTS_PREVIEW")

            @JvmField val OUTPUTS = of("OUTPUTS")

            @JvmField val OUTPUTS_PREVIEW = of("OUTPUTS_PREVIEW")

            @JvmField val MANIFEST = of("MANIFEST")

            @JvmField val PARENT_RUN_IDS = of("PARENT_RUN_IDS")

            @JvmField val PROJECT_ID = of("PROJECT_ID")

            @JvmField val TRACE_ID = of("TRACE_ID")

            @JvmField val THREAD_ID = of("THREAD_ID")

            @JvmField val DOTTED_ORDER = of("DOTTED_ORDER")

            @JvmField val IS_ROOT = of("IS_ROOT")

            @JvmField val REFERENCE_EXAMPLE_ID = of("REFERENCE_EXAMPLE_ID")

            @JvmField val REFERENCE_DATASET_ID = of("REFERENCE_DATASET_ID")

            @JvmField val TOTAL_TOKENS = of("TOTAL_TOKENS")

            @JvmField val PROMPT_TOKENS = of("PROMPT_TOKENS")

            @JvmField val COMPLETION_TOKENS = of("COMPLETION_TOKENS")

            @JvmField val TOTAL_COST = of("TOTAL_COST")

            @JvmField val PROMPT_COST = of("PROMPT_COST")

            @JvmField val COMPLETION_COST = of("COMPLETION_COST")

            @JvmField val PROMPT_TOKEN_DETAILS = of("PROMPT_TOKEN_DETAILS")

            @JvmField val COMPLETION_TOKEN_DETAILS = of("COMPLETION_TOKEN_DETAILS")

            @JvmField val PROMPT_COST_DETAILS = of("PROMPT_COST_DETAILS")

            @JvmField val COMPLETION_COST_DETAILS = of("COMPLETION_COST_DETAILS")

            @JvmField val PRICE_MODEL_ID = of("PRICE_MODEL_ID")

            @JvmField val TAGS = of("TAGS")

            @JvmField val APP_PATH = of("APP_PATH")

            @JvmField val ATTACHMENTS = of("ATTACHMENTS")

            @JvmField val THREAD_EVALUATION_TIME = of("THREAD_EVALUATION_TIME")

            @JvmField val IS_IN_DATASET = of("IS_IN_DATASET")

            @JvmField val SHARE_URL = of("SHARE_URL")

            @JvmField val FEEDBACK_STATS = of("FEEDBACK_STATS")

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        /** An enum containing [Select]'s known values. */
        enum class Known {
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            MANIFEST,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            APP_PATH,
            ATTACHMENTS,
            THREAD_EVALUATION_TIME,
            IS_IN_DATASET,
            SHARE_URL,
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
            ID,
            NAME,
            RUN_TYPE,
            STATUS,
            START_TIME,
            END_TIME,
            LATENCY_SECONDS,
            FIRST_TOKEN_TIME,
            ERROR,
            ERROR_PREVIEW,
            EXTRA,
            METADATA,
            EVENTS,
            INPUTS,
            INPUTS_PREVIEW,
            OUTPUTS,
            OUTPUTS_PREVIEW,
            MANIFEST,
            PARENT_RUN_IDS,
            PROJECT_ID,
            TRACE_ID,
            THREAD_ID,
            DOTTED_ORDER,
            IS_ROOT,
            REFERENCE_EXAMPLE_ID,
            REFERENCE_DATASET_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            PROMPT_TOKEN_DETAILS,
            COMPLETION_TOKEN_DETAILS,
            PROMPT_COST_DETAILS,
            COMPLETION_COST_DETAILS,
            PRICE_MODEL_ID,
            TAGS,
            APP_PATH,
            ATTACHMENTS,
            THREAD_EVALUATION_TIME,
            IS_IN_DATASET,
            SHARE_URL,
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
                ID -> Value.ID
                NAME -> Value.NAME
                RUN_TYPE -> Value.RUN_TYPE
                STATUS -> Value.STATUS
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                LATENCY_SECONDS -> Value.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                ERROR -> Value.ERROR
                ERROR_PREVIEW -> Value.ERROR_PREVIEW
                EXTRA -> Value.EXTRA
                METADATA -> Value.METADATA
                EVENTS -> Value.EVENTS
                INPUTS -> Value.INPUTS
                INPUTS_PREVIEW -> Value.INPUTS_PREVIEW
                OUTPUTS -> Value.OUTPUTS
                OUTPUTS_PREVIEW -> Value.OUTPUTS_PREVIEW
                MANIFEST -> Value.MANIFEST
                PARENT_RUN_IDS -> Value.PARENT_RUN_IDS
                PROJECT_ID -> Value.PROJECT_ID
                TRACE_ID -> Value.TRACE_ID
                THREAD_ID -> Value.THREAD_ID
                DOTTED_ORDER -> Value.DOTTED_ORDER
                IS_ROOT -> Value.IS_ROOT
                REFERENCE_EXAMPLE_ID -> Value.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Value.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Value.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Value.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Value.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Value.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Value.PRICE_MODEL_ID
                TAGS -> Value.TAGS
                APP_PATH -> Value.APP_PATH
                ATTACHMENTS -> Value.ATTACHMENTS
                THREAD_EVALUATION_TIME -> Value.THREAD_EVALUATION_TIME
                IS_IN_DATASET -> Value.IS_IN_DATASET
                SHARE_URL -> Value.SHARE_URL
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
                ID -> Known.ID
                NAME -> Known.NAME
                RUN_TYPE -> Known.RUN_TYPE
                STATUS -> Known.STATUS
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                LATENCY_SECONDS -> Known.LATENCY_SECONDS
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                ERROR -> Known.ERROR
                ERROR_PREVIEW -> Known.ERROR_PREVIEW
                EXTRA -> Known.EXTRA
                METADATA -> Known.METADATA
                EVENTS -> Known.EVENTS
                INPUTS -> Known.INPUTS
                INPUTS_PREVIEW -> Known.INPUTS_PREVIEW
                OUTPUTS -> Known.OUTPUTS
                OUTPUTS_PREVIEW -> Known.OUTPUTS_PREVIEW
                MANIFEST -> Known.MANIFEST
                PARENT_RUN_IDS -> Known.PARENT_RUN_IDS
                PROJECT_ID -> Known.PROJECT_ID
                TRACE_ID -> Known.TRACE_ID
                THREAD_ID -> Known.THREAD_ID
                DOTTED_ORDER -> Known.DOTTED_ORDER
                IS_ROOT -> Known.IS_ROOT
                REFERENCE_EXAMPLE_ID -> Known.REFERENCE_EXAMPLE_ID
                REFERENCE_DATASET_ID -> Known.REFERENCE_DATASET_ID
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                PROMPT_TOKEN_DETAILS -> Known.PROMPT_TOKEN_DETAILS
                COMPLETION_TOKEN_DETAILS -> Known.COMPLETION_TOKEN_DETAILS
                PROMPT_COST_DETAILS -> Known.PROMPT_COST_DETAILS
                COMPLETION_COST_DETAILS -> Known.COMPLETION_COST_DETAILS
                PRICE_MODEL_ID -> Known.PRICE_MODEL_ID
                TAGS -> Known.TAGS
                APP_PATH -> Known.APP_PATH
                ATTACHMENTS -> Known.ATTACHMENTS
                THREAD_EVALUATION_TIME -> Known.THREAD_EVALUATION_TIME
                IS_IN_DATASET -> Known.IS_IN_DATASET
                SHARE_URL -> Known.SHARE_URL
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

        return other is TraceListRunsParams &&
            traceId == other.traceId &&
            projectId == other.projectId &&
            filter == other.filter &&
            maxStartTime == other.maxStartTime &&
            minStartTime == other.minStartTime &&
            selects == other.selects &&
            accept == other.accept &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            traceId,
            projectId,
            filter,
            maxStartTime,
            minStartTime,
            selects,
            accept,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "TraceListRunsParams{traceId=$traceId, projectId=$projectId, filter=$filter, maxStartTime=$maxStartTime, minStartTime=$minStartTime, selects=$selects, accept=$accept, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
