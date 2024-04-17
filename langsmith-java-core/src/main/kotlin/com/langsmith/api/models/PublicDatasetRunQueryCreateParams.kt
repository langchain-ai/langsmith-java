// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.Enum
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class PublicDatasetRunQueryCreateParams
constructor(
    private val shareToken: String,
    private val id: List<String>?,
    private val cursor: String?,
    private val endTime: OffsetDateTime?,
    private val error: Boolean?,
    private val executionOrder: Long?,
    private val filter: String?,
    private val isRoot: Boolean?,
    private val limit: Long?,
    private val parentRun: String?,
    private val query: String?,
    private val referenceExample: List<String>?,
    private val runType: RunType?,
    private val select: List<Select>?,
    private val session: List<String>?,
    private val startTime: OffsetDateTime?,
    private val trace: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun shareToken(): String = shareToken

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun error(): Optional<Boolean> = Optional.ofNullable(error)

    fun executionOrder(): Optional<Long> = Optional.ofNullable(executionOrder)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun isRoot(): Optional<Boolean> = Optional.ofNullable(isRoot)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun parentRun(): Optional<String> = Optional.ofNullable(parentRun)

    fun query(): Optional<String> = Optional.ofNullable(query)

    fun referenceExample(): Optional<List<String>> = Optional.ofNullable(referenceExample)

    fun runType(): Optional<RunType> = Optional.ofNullable(runType)

    fun select(): Optional<List<Select>> = Optional.ofNullable(select)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    fun trace(): Optional<String> = Optional.ofNullable(trace)

    @JvmSynthetic
    internal fun getBody(): PublicDatasetRunQueryCreateBody {
        return PublicDatasetRunQueryCreateBody(
            id,
            cursor,
            endTime,
            error,
            executionOrder,
            filter,
            isRoot,
            limit,
            parentRun,
            query,
            referenceExample,
            runType,
            select,
            session,
            startTime,
            trace,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> shareToken
            else -> ""
        }
    }

    /** Query params for run endpoints. */
    @JsonDeserialize(builder = PublicDatasetRunQueryCreateBody.Builder::class)
    @NoAutoDetect
    class PublicDatasetRunQueryCreateBody
    internal constructor(
        private val id: List<String>?,
        private val cursor: String?,
        private val endTime: OffsetDateTime?,
        private val error: Boolean?,
        private val executionOrder: Long?,
        private val filter: String?,
        private val isRoot: Boolean?,
        private val limit: Long?,
        private val parentRun: String?,
        private val query: String?,
        private val referenceExample: List<String>?,
        private val runType: RunType?,
        private val select: List<Select>?,
        private val session: List<String>?,
        private val startTime: OffsetDateTime?,
        private val trace: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("id") fun id(): List<String>? = id

        @JsonProperty("cursor") fun cursor(): String? = cursor

        @JsonProperty("end_time") fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("error") fun error(): Boolean? = error

        @JsonProperty("execution_order") fun executionOrder(): Long? = executionOrder

        @JsonProperty("filter") fun filter(): String? = filter

        @JsonProperty("is_root") fun isRoot(): Boolean? = isRoot

        @JsonProperty("limit") fun limit(): Long? = limit

        @JsonProperty("parent_run") fun parentRun(): String? = parentRun

        @JsonProperty("query") fun query(): String? = query

        @JsonProperty("reference_example") fun referenceExample(): List<String>? = referenceExample

        /** Enum for run types. */
        @JsonProperty("run_type") fun runType(): RunType? = runType

        @JsonProperty("select") fun select(): List<Select>? = select

        @JsonProperty("session") fun session(): List<String>? = session

        @JsonProperty("start_time") fun startTime(): OffsetDateTime? = startTime

        @JsonProperty("trace") fun trace(): String? = trace

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PublicDatasetRunQueryCreateBody &&
                this.id == other.id &&
                this.cursor == other.cursor &&
                this.endTime == other.endTime &&
                this.error == other.error &&
                this.executionOrder == other.executionOrder &&
                this.filter == other.filter &&
                this.isRoot == other.isRoot &&
                this.limit == other.limit &&
                this.parentRun == other.parentRun &&
                this.query == other.query &&
                this.referenceExample == other.referenceExample &&
                this.runType == other.runType &&
                this.select == other.select &&
                this.session == other.session &&
                this.startTime == other.startTime &&
                this.trace == other.trace &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
                        cursor,
                        endTime,
                        error,
                        executionOrder,
                        filter,
                        isRoot,
                        limit,
                        parentRun,
                        query,
                        referenceExample,
                        runType,
                        select,
                        session,
                        startTime,
                        trace,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PublicDatasetRunQueryCreateBody{id=$id, cursor=$cursor, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, limit=$limit, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, select=$select, session=$session, startTime=$startTime, trace=$trace, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: List<String>? = null
            private var cursor: String? = null
            private var endTime: OffsetDateTime? = null
            private var error: Boolean? = null
            private var executionOrder: Long? = null
            private var filter: String? = null
            private var isRoot: Boolean? = null
            private var limit: Long? = null
            private var parentRun: String? = null
            private var query: String? = null
            private var referenceExample: List<String>? = null
            private var runType: RunType? = null
            private var select: List<Select>? = null
            private var session: List<String>? = null
            private var startTime: OffsetDateTime? = null
            private var trace: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(publicDatasetRunQueryCreateBody: PublicDatasetRunQueryCreateBody) =
                apply {
                    this.id = publicDatasetRunQueryCreateBody.id
                    this.cursor = publicDatasetRunQueryCreateBody.cursor
                    this.endTime = publicDatasetRunQueryCreateBody.endTime
                    this.error = publicDatasetRunQueryCreateBody.error
                    this.executionOrder = publicDatasetRunQueryCreateBody.executionOrder
                    this.filter = publicDatasetRunQueryCreateBody.filter
                    this.isRoot = publicDatasetRunQueryCreateBody.isRoot
                    this.limit = publicDatasetRunQueryCreateBody.limit
                    this.parentRun = publicDatasetRunQueryCreateBody.parentRun
                    this.query = publicDatasetRunQueryCreateBody.query
                    this.referenceExample = publicDatasetRunQueryCreateBody.referenceExample
                    this.runType = publicDatasetRunQueryCreateBody.runType
                    this.select = publicDatasetRunQueryCreateBody.select
                    this.session = publicDatasetRunQueryCreateBody.session
                    this.startTime = publicDatasetRunQueryCreateBody.startTime
                    this.trace = publicDatasetRunQueryCreateBody.trace
                    additionalProperties(publicDatasetRunQueryCreateBody.additionalProperties)
                }

            @JsonProperty("id") fun id(id: List<String>) = apply { this.id = id }

            @JsonProperty("cursor") fun cursor(cursor: String) = apply { this.cursor = cursor }

            @JsonProperty("end_time")
            fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

            @JsonProperty("error") fun error(error: Boolean) = apply { this.error = error }

            @JsonProperty("execution_order")
            fun executionOrder(executionOrder: Long) = apply {
                this.executionOrder = executionOrder
            }

            @JsonProperty("filter") fun filter(filter: String) = apply { this.filter = filter }

            @JsonProperty("is_root") fun isRoot(isRoot: Boolean) = apply { this.isRoot = isRoot }

            @JsonProperty("limit") fun limit(limit: Long) = apply { this.limit = limit }

            @JsonProperty("parent_run")
            fun parentRun(parentRun: String) = apply { this.parentRun = parentRun }

            @JsonProperty("query") fun query(query: String) = apply { this.query = query }

            @JsonProperty("reference_example")
            fun referenceExample(referenceExample: List<String>) = apply {
                this.referenceExample = referenceExample
            }

            /** Enum for run types. */
            @JsonProperty("run_type")
            fun runType(runType: RunType) = apply { this.runType = runType }

            @JsonProperty("select")
            fun select(select: List<Select>) = apply { this.select = select }

            @JsonProperty("session")
            fun session(session: List<String>) = apply { this.session = session }

            @JsonProperty("start_time")
            fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

            @JsonProperty("trace") fun trace(trace: String) = apply { this.trace = trace }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PublicDatasetRunQueryCreateBody =
                PublicDatasetRunQueryCreateBody(
                    id?.toUnmodifiable(),
                    cursor,
                    endTime,
                    error,
                    executionOrder,
                    filter,
                    isRoot,
                    limit,
                    parentRun,
                    query,
                    referenceExample?.toUnmodifiable(),
                    runType,
                    select?.toUnmodifiable(),
                    session?.toUnmodifiable(),
                    startTime,
                    trace,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDatasetRunQueryCreateParams &&
            this.shareToken == other.shareToken &&
            this.id == other.id &&
            this.cursor == other.cursor &&
            this.endTime == other.endTime &&
            this.error == other.error &&
            this.executionOrder == other.executionOrder &&
            this.filter == other.filter &&
            this.isRoot == other.isRoot &&
            this.limit == other.limit &&
            this.parentRun == other.parentRun &&
            this.query == other.query &&
            this.referenceExample == other.referenceExample &&
            this.runType == other.runType &&
            this.select == other.select &&
            this.session == other.session &&
            this.startTime == other.startTime &&
            this.trace == other.trace &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            shareToken,
            id,
            cursor,
            endTime,
            error,
            executionOrder,
            filter,
            isRoot,
            limit,
            parentRun,
            query,
            referenceExample,
            runType,
            select,
            session,
            startTime,
            trace,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PublicDatasetRunQueryCreateParams{shareToken=$shareToken, id=$id, cursor=$cursor, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, limit=$limit, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, select=$select, session=$session, startTime=$startTime, trace=$trace, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var shareToken: String? = null
        private var id: MutableList<String> = mutableListOf()
        private var cursor: String? = null
        private var endTime: OffsetDateTime? = null
        private var error: Boolean? = null
        private var executionOrder: Long? = null
        private var filter: String? = null
        private var isRoot: Boolean? = null
        private var limit: Long? = null
        private var parentRun: String? = null
        private var query: String? = null
        private var referenceExample: MutableList<String> = mutableListOf()
        private var runType: RunType? = null
        private var select: MutableList<Select> = mutableListOf()
        private var session: MutableList<String> = mutableListOf()
        private var startTime: OffsetDateTime? = null
        private var trace: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDatasetRunQueryCreateParams: PublicDatasetRunQueryCreateParams) =
            apply {
                this.shareToken = publicDatasetRunQueryCreateParams.shareToken
                this.id(publicDatasetRunQueryCreateParams.id ?: listOf())
                this.cursor = publicDatasetRunQueryCreateParams.cursor
                this.endTime = publicDatasetRunQueryCreateParams.endTime
                this.error = publicDatasetRunQueryCreateParams.error
                this.executionOrder = publicDatasetRunQueryCreateParams.executionOrder
                this.filter = publicDatasetRunQueryCreateParams.filter
                this.isRoot = publicDatasetRunQueryCreateParams.isRoot
                this.limit = publicDatasetRunQueryCreateParams.limit
                this.parentRun = publicDatasetRunQueryCreateParams.parentRun
                this.query = publicDatasetRunQueryCreateParams.query
                this.referenceExample(
                    publicDatasetRunQueryCreateParams.referenceExample ?: listOf()
                )
                this.runType = publicDatasetRunQueryCreateParams.runType
                this.select(publicDatasetRunQueryCreateParams.select ?: listOf())
                this.session(publicDatasetRunQueryCreateParams.session ?: listOf())
                this.startTime = publicDatasetRunQueryCreateParams.startTime
                this.trace = publicDatasetRunQueryCreateParams.trace
                additionalQueryParams(publicDatasetRunQueryCreateParams.additionalQueryParams)
                additionalHeaders(publicDatasetRunQueryCreateParams.additionalHeaders)
                additionalBodyProperties(publicDatasetRunQueryCreateParams.additionalBodyProperties)
            }

        fun shareToken(shareToken: String) = apply { this.shareToken = shareToken }

        fun id(id: List<String>) = apply {
            this.id.clear()
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { this.id.add(id) }

        fun cursor(cursor: String) = apply { this.cursor = cursor }

        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        fun error(error: Boolean) = apply { this.error = error }

        fun executionOrder(executionOrder: Long) = apply { this.executionOrder = executionOrder }

        fun filter(filter: String) = apply { this.filter = filter }

        fun isRoot(isRoot: Boolean) = apply { this.isRoot = isRoot }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun parentRun(parentRun: String) = apply { this.parentRun = parentRun }

        fun query(query: String) = apply { this.query = query }

        fun referenceExample(referenceExample: List<String>) = apply {
            this.referenceExample.clear()
            this.referenceExample.addAll(referenceExample)
        }

        fun addReferenceExample(referenceExample: String) = apply {
            this.referenceExample.add(referenceExample)
        }

        /** Enum for run types. */
        fun runType(runType: RunType) = apply { this.runType = runType }

        fun select(select: List<Select>) = apply {
            this.select.clear()
            this.select.addAll(select)
        }

        fun addSelect(select: Select) = apply { this.select.add(select) }

        fun session(session: List<String>) = apply {
            this.session.clear()
            this.session.addAll(session)
        }

        fun addSession(session: String) = apply { this.session.add(session) }

        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

        fun trace(trace: String) = apply { this.trace = trace }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): PublicDatasetRunQueryCreateParams =
            PublicDatasetRunQueryCreateParams(
                checkNotNull(shareToken) { "`shareToken` is required but was not set" },
                if (id.size == 0) null else id.toUnmodifiable(),
                cursor,
                endTime,
                error,
                executionOrder,
                filter,
                isRoot,
                limit,
                parentRun,
                query,
                if (referenceExample.size == 0) null else referenceExample.toUnmodifiable(),
                runType,
                if (select.size == 0) null else select.toUnmodifiable(),
                if (session.size == 0) null else session.toUnmodifiable(),
                startTime,
                trace,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class RunType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RunType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val TOOL = RunType(JsonField.of("tool"))

            @JvmField val CHAIN = RunType(JsonField.of("chain"))

            @JvmField val LLM = RunType(JsonField.of("llm"))

            @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

            @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

            @JvmField val PROMPT = RunType(JsonField.of("prompt"))

            @JvmField val PARSER = RunType(JsonField.of("parser"))

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        enum class Known {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        enum class Value {
            TOOL,
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TOOL -> Value.TOOL
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TOOL -> Known.TOOL
                CHAIN -> Known.CHAIN
                LLM -> Known.LLM
                RETRIEVER -> Known.RETRIEVER
                EMBEDDING -> Known.EMBEDDING
                PROMPT -> Known.PROMPT
                PARSER -> Known.PARSER
                else -> throw LangSmithInvalidDataException("Unknown RunType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Select
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Select && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ID = Select(JsonField.of("id"))

            @JvmField val NAME = Select(JsonField.of("name"))

            @JvmField val RUN_TYPE = Select(JsonField.of("run_type"))

            @JvmField val START_TIME = Select(JsonField.of("start_time"))

            @JvmField val END_TIME = Select(JsonField.of("end_time"))

            @JvmField val STATUS = Select(JsonField.of("status"))

            @JvmField val ERROR = Select(JsonField.of("error"))

            @JvmField val EXTRA = Select(JsonField.of("extra"))

            @JvmField val EVENTS = Select(JsonField.of("events"))

            @JvmField val INPUTS = Select(JsonField.of("inputs"))

            @JvmField val INPUTS_S3_URLS = Select(JsonField.of("inputs_s3_urls"))

            @JvmField val OUTPUTS = Select(JsonField.of("outputs"))

            @JvmField val OUTPUTS_S3_URLS = Select(JsonField.of("outputs_s3_urls"))

            @JvmField val PARENT_RUN_ID = Select(JsonField.of("parent_run_id"))

            @JvmField val MANIFEST_ID = Select(JsonField.of("manifest_id"))

            @JvmField val MANIFEST_S3_ID = Select(JsonField.of("manifest_s3_id"))

            @JvmField val SESSION_ID = Select(JsonField.of("session_id"))

            @JvmField val SERIALIZED = Select(JsonField.of("serialized"))

            @JvmField val REFERENCE_EXAMPLE_ID = Select(JsonField.of("reference_example_id"))

            @JvmField val TOTAL_TOKENS = Select(JsonField.of("total_tokens"))

            @JvmField val PROMPT_TOKENS = Select(JsonField.of("prompt_tokens"))

            @JvmField val COMPLETION_TOKENS = Select(JsonField.of("completion_tokens"))

            @JvmField val TOTAL_COST = Select(JsonField.of("total_cost"))

            @JvmField val PROMPT_COST = Select(JsonField.of("prompt_cost"))

            @JvmField val COMPLETION_COST = Select(JsonField.of("completion_cost"))

            @JvmField val FIRST_TOKEN_TIME = Select(JsonField.of("first_token_time"))

            @JvmField val TRACE_ID = Select(JsonField.of("trace_id"))

            @JvmField val DOTTED_ORDER = Select(JsonField.of("dotted_order"))

            @JvmField val LAST_QUEUED_AT = Select(JsonField.of("last_queued_at"))

            @JvmField val FEEDBACK_STATS = Select(JsonField.of("feedback_stats"))

            @JvmField val CHILD_RUN_IDS = Select(JsonField.of("child_run_ids"))

            @JvmField val PARENT_RUN_IDS = Select(JsonField.of("parent_run_ids"))

            @JvmField val TAGS = Select(JsonField.of("tags"))

            @JvmField val IN_DATASET = Select(JsonField.of("in_dataset"))

            @JvmField val APP_PATH = Select(JsonField.of("app_path"))

            @JvmField val SHARE_TOKEN = Select(JsonField.of("share_token"))

            @JvmStatic fun of(value: String) = Select(JsonField.of(value))
        }

        enum class Known {
            ID,
            NAME,
            RUN_TYPE,
            START_TIME,
            END_TIME,
            STATUS,
            ERROR,
            EXTRA,
            EVENTS,
            INPUTS,
            INPUTS_S3_URLS,
            OUTPUTS,
            OUTPUTS_S3_URLS,
            PARENT_RUN_ID,
            MANIFEST_ID,
            MANIFEST_S3_ID,
            SESSION_ID,
            SERIALIZED,
            REFERENCE_EXAMPLE_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            FIRST_TOKEN_TIME,
            TRACE_ID,
            DOTTED_ORDER,
            LAST_QUEUED_AT,
            FEEDBACK_STATS,
            CHILD_RUN_IDS,
            PARENT_RUN_IDS,
            TAGS,
            IN_DATASET,
            APP_PATH,
            SHARE_TOKEN,
        }

        enum class Value {
            ID,
            NAME,
            RUN_TYPE,
            START_TIME,
            END_TIME,
            STATUS,
            ERROR,
            EXTRA,
            EVENTS,
            INPUTS,
            INPUTS_S3_URLS,
            OUTPUTS,
            OUTPUTS_S3_URLS,
            PARENT_RUN_ID,
            MANIFEST_ID,
            MANIFEST_S3_ID,
            SESSION_ID,
            SERIALIZED,
            REFERENCE_EXAMPLE_ID,
            TOTAL_TOKENS,
            PROMPT_TOKENS,
            COMPLETION_TOKENS,
            TOTAL_COST,
            PROMPT_COST,
            COMPLETION_COST,
            FIRST_TOKEN_TIME,
            TRACE_ID,
            DOTTED_ORDER,
            LAST_QUEUED_AT,
            FEEDBACK_STATS,
            CHILD_RUN_IDS,
            PARENT_RUN_IDS,
            TAGS,
            IN_DATASET,
            APP_PATH,
            SHARE_TOKEN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ID -> Value.ID
                NAME -> Value.NAME
                RUN_TYPE -> Value.RUN_TYPE
                START_TIME -> Value.START_TIME
                END_TIME -> Value.END_TIME
                STATUS -> Value.STATUS
                ERROR -> Value.ERROR
                EXTRA -> Value.EXTRA
                EVENTS -> Value.EVENTS
                INPUTS -> Value.INPUTS
                INPUTS_S3_URLS -> Value.INPUTS_S3_URLS
                OUTPUTS -> Value.OUTPUTS
                OUTPUTS_S3_URLS -> Value.OUTPUTS_S3_URLS
                PARENT_RUN_ID -> Value.PARENT_RUN_ID
                MANIFEST_ID -> Value.MANIFEST_ID
                MANIFEST_S3_ID -> Value.MANIFEST_S3_ID
                SESSION_ID -> Value.SESSION_ID
                SERIALIZED -> Value.SERIALIZED
                REFERENCE_EXAMPLE_ID -> Value.REFERENCE_EXAMPLE_ID
                TOTAL_TOKENS -> Value.TOTAL_TOKENS
                PROMPT_TOKENS -> Value.PROMPT_TOKENS
                COMPLETION_TOKENS -> Value.COMPLETION_TOKENS
                TOTAL_COST -> Value.TOTAL_COST
                PROMPT_COST -> Value.PROMPT_COST
                COMPLETION_COST -> Value.COMPLETION_COST
                FIRST_TOKEN_TIME -> Value.FIRST_TOKEN_TIME
                TRACE_ID -> Value.TRACE_ID
                DOTTED_ORDER -> Value.DOTTED_ORDER
                LAST_QUEUED_AT -> Value.LAST_QUEUED_AT
                FEEDBACK_STATS -> Value.FEEDBACK_STATS
                CHILD_RUN_IDS -> Value.CHILD_RUN_IDS
                PARENT_RUN_IDS -> Value.PARENT_RUN_IDS
                TAGS -> Value.TAGS
                IN_DATASET -> Value.IN_DATASET
                APP_PATH -> Value.APP_PATH
                SHARE_TOKEN -> Value.SHARE_TOKEN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ID -> Known.ID
                NAME -> Known.NAME
                RUN_TYPE -> Known.RUN_TYPE
                START_TIME -> Known.START_TIME
                END_TIME -> Known.END_TIME
                STATUS -> Known.STATUS
                ERROR -> Known.ERROR
                EXTRA -> Known.EXTRA
                EVENTS -> Known.EVENTS
                INPUTS -> Known.INPUTS
                INPUTS_S3_URLS -> Known.INPUTS_S3_URLS
                OUTPUTS -> Known.OUTPUTS
                OUTPUTS_S3_URLS -> Known.OUTPUTS_S3_URLS
                PARENT_RUN_ID -> Known.PARENT_RUN_ID
                MANIFEST_ID -> Known.MANIFEST_ID
                MANIFEST_S3_ID -> Known.MANIFEST_S3_ID
                SESSION_ID -> Known.SESSION_ID
                SERIALIZED -> Known.SERIALIZED
                REFERENCE_EXAMPLE_ID -> Known.REFERENCE_EXAMPLE_ID
                TOTAL_TOKENS -> Known.TOTAL_TOKENS
                PROMPT_TOKENS -> Known.PROMPT_TOKENS
                COMPLETION_TOKENS -> Known.COMPLETION_TOKENS
                TOTAL_COST -> Known.TOTAL_COST
                PROMPT_COST -> Known.PROMPT_COST
                COMPLETION_COST -> Known.COMPLETION_COST
                FIRST_TOKEN_TIME -> Known.FIRST_TOKEN_TIME
                TRACE_ID -> Known.TRACE_ID
                DOTTED_ORDER -> Known.DOTTED_ORDER
                LAST_QUEUED_AT -> Known.LAST_QUEUED_AT
                FEEDBACK_STATS -> Known.FEEDBACK_STATS
                CHILD_RUN_IDS -> Known.CHILD_RUN_IDS
                PARENT_RUN_IDS -> Known.PARENT_RUN_IDS
                TAGS -> Known.TAGS
                IN_DATASET -> Known.IN_DATASET
                APP_PATH -> Known.APP_PATH
                SHARE_TOKEN -> Known.SHARE_TOKEN
                else -> throw LangSmithInvalidDataException("Unknown Select: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
