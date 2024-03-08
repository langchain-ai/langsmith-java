// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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

class RunStatCreateParams
constructor(
    private val id: List<String>?,
    private val endTime: OffsetDateTime?,
    private val error: Boolean?,
    private val executionOrder: Long?,
    private val filter: String?,
    private val isRoot: Boolean?,
    private val parentRun: String?,
    private val query: String?,
    private val referenceExample: List<String>?,
    private val runType: RunType?,
    private val session: List<String>?,
    private val startTime: OffsetDateTime?,
    private val trace: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun error(): Optional<Boolean> = Optional.ofNullable(error)

    fun executionOrder(): Optional<Long> = Optional.ofNullable(executionOrder)

    fun filter(): Optional<String> = Optional.ofNullable(filter)

    fun isRoot(): Optional<Boolean> = Optional.ofNullable(isRoot)

    fun parentRun(): Optional<String> = Optional.ofNullable(parentRun)

    fun query(): Optional<String> = Optional.ofNullable(query)

    fun referenceExample(): Optional<List<String>> = Optional.ofNullable(referenceExample)

    fun runType(): Optional<RunType> = Optional.ofNullable(runType)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    fun trace(): Optional<String> = Optional.ofNullable(trace)

    @JvmSynthetic
    internal fun getBody(): RunStatCreateBody {
        return RunStatCreateBody(
            id,
            endTime,
            error,
            executionOrder,
            filter,
            isRoot,
            parentRun,
            query,
            referenceExample,
            runType,
            session,
            startTime,
            trace,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Query params for run endpoints. */
    @JsonDeserialize(builder = RunStatCreateBody.Builder::class)
    @NoAutoDetect
    class RunStatCreateBody
    internal constructor(
        private val id: List<String>?,
        private val endTime: OffsetDateTime?,
        private val error: Boolean?,
        private val executionOrder: Long?,
        private val filter: String?,
        private val isRoot: Boolean?,
        private val parentRun: String?,
        private val query: String?,
        private val referenceExample: List<String>?,
        private val runType: RunType?,
        private val session: List<String>?,
        private val startTime: OffsetDateTime?,
        private val trace: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("id") fun id(): List<String>? = id

        @JsonProperty("end_time") fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("error") fun error(): Boolean? = error

        @JsonProperty("execution_order") fun executionOrder(): Long? = executionOrder

        @JsonProperty("filter") fun filter(): String? = filter

        @JsonProperty("is_root") fun isRoot(): Boolean? = isRoot

        @JsonProperty("parent_run") fun parentRun(): String? = parentRun

        @JsonProperty("query") fun query(): String? = query

        @JsonProperty("reference_example") fun referenceExample(): List<String>? = referenceExample

        /** Enum for run types. */
        @JsonProperty("run_type") fun runType(): RunType? = runType

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

            return other is RunStatCreateBody &&
                this.id == other.id &&
                this.endTime == other.endTime &&
                this.error == other.error &&
                this.executionOrder == other.executionOrder &&
                this.filter == other.filter &&
                this.isRoot == other.isRoot &&
                this.parentRun == other.parentRun &&
                this.query == other.query &&
                this.referenceExample == other.referenceExample &&
                this.runType == other.runType &&
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
                        endTime,
                        error,
                        executionOrder,
                        filter,
                        isRoot,
                        parentRun,
                        query,
                        referenceExample,
                        runType,
                        session,
                        startTime,
                        trace,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "RunStatCreateBody{id=$id, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, session=$session, startTime=$startTime, trace=$trace, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: List<String>? = null
            private var endTime: OffsetDateTime? = null
            private var error: Boolean? = null
            private var executionOrder: Long? = null
            private var filter: String? = null
            private var isRoot: Boolean? = null
            private var parentRun: String? = null
            private var query: String? = null
            private var referenceExample: List<String>? = null
            private var runType: RunType? = null
            private var session: List<String>? = null
            private var startTime: OffsetDateTime? = null
            private var trace: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(runStatCreateBody: RunStatCreateBody) = apply {
                this.id = runStatCreateBody.id
                this.endTime = runStatCreateBody.endTime
                this.error = runStatCreateBody.error
                this.executionOrder = runStatCreateBody.executionOrder
                this.filter = runStatCreateBody.filter
                this.isRoot = runStatCreateBody.isRoot
                this.parentRun = runStatCreateBody.parentRun
                this.query = runStatCreateBody.query
                this.referenceExample = runStatCreateBody.referenceExample
                this.runType = runStatCreateBody.runType
                this.session = runStatCreateBody.session
                this.startTime = runStatCreateBody.startTime
                this.trace = runStatCreateBody.trace
                additionalProperties(runStatCreateBody.additionalProperties)
            }

            @JsonProperty("id") fun id(id: List<String>) = apply { this.id = id }

            @JsonProperty("end_time")
            fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

            @JsonProperty("error") fun error(error: Boolean) = apply { this.error = error }

            @JsonProperty("execution_order")
            fun executionOrder(executionOrder: Long) = apply {
                this.executionOrder = executionOrder
            }

            @JsonProperty("filter") fun filter(filter: String) = apply { this.filter = filter }

            @JsonProperty("is_root") fun isRoot(isRoot: Boolean) = apply { this.isRoot = isRoot }

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

            fun build(): RunStatCreateBody =
                RunStatCreateBody(
                    id?.toUnmodifiable(),
                    endTime,
                    error,
                    executionOrder,
                    filter,
                    isRoot,
                    parentRun,
                    query,
                    referenceExample?.toUnmodifiable(),
                    runType,
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

        return other is RunStatCreateParams &&
            this.id == other.id &&
            this.endTime == other.endTime &&
            this.error == other.error &&
            this.executionOrder == other.executionOrder &&
            this.filter == other.filter &&
            this.isRoot == other.isRoot &&
            this.parentRun == other.parentRun &&
            this.query == other.query &&
            this.referenceExample == other.referenceExample &&
            this.runType == other.runType &&
            this.session == other.session &&
            this.startTime == other.startTime &&
            this.trace == other.trace &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            id,
            endTime,
            error,
            executionOrder,
            filter,
            isRoot,
            parentRun,
            query,
            referenceExample,
            runType,
            session,
            startTime,
            trace,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "RunStatCreateParams{id=$id, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, session=$session, startTime=$startTime, trace=$trace, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: MutableList<String> = mutableListOf()
        private var endTime: OffsetDateTime? = null
        private var error: Boolean? = null
        private var executionOrder: Long? = null
        private var filter: String? = null
        private var isRoot: Boolean? = null
        private var parentRun: String? = null
        private var query: String? = null
        private var referenceExample: MutableList<String> = mutableListOf()
        private var runType: RunType? = null
        private var session: MutableList<String> = mutableListOf()
        private var startTime: OffsetDateTime? = null
        private var trace: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(runStatCreateParams: RunStatCreateParams) = apply {
            this.id(runStatCreateParams.id ?: listOf())
            this.endTime = runStatCreateParams.endTime
            this.error = runStatCreateParams.error
            this.executionOrder = runStatCreateParams.executionOrder
            this.filter = runStatCreateParams.filter
            this.isRoot = runStatCreateParams.isRoot
            this.parentRun = runStatCreateParams.parentRun
            this.query = runStatCreateParams.query
            this.referenceExample(runStatCreateParams.referenceExample ?: listOf())
            this.runType = runStatCreateParams.runType
            this.session(runStatCreateParams.session ?: listOf())
            this.startTime = runStatCreateParams.startTime
            this.trace = runStatCreateParams.trace
            additionalQueryParams(runStatCreateParams.additionalQueryParams)
            additionalHeaders(runStatCreateParams.additionalHeaders)
            additionalBodyProperties(runStatCreateParams.additionalBodyProperties)
        }

        fun id(id: List<String>) = apply {
            this.id.clear()
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { this.id.add(id) }

        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        fun error(error: Boolean) = apply { this.error = error }

        fun executionOrder(executionOrder: Long) = apply { this.executionOrder = executionOrder }

        fun filter(filter: String) = apply { this.filter = filter }

        fun isRoot(isRoot: Boolean) = apply { this.isRoot = isRoot }

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

        fun build(): RunStatCreateParams =
            RunStatCreateParams(
                if (id.size == 0) null else id.toUnmodifiable(),
                endTime,
                error,
                executionOrder,
                filter,
                isRoot,
                parentRun,
                query,
                if (referenceExample.size == 0) null else referenceExample.toUnmodifiable(),
                runType,
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
    ) {

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
}
