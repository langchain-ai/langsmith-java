// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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

class RunQueryCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val id: List<String>?, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
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
    private val select: List<RunSelect>?,
    private val session: List<String>?,
    private val startTime: OffsetDateTime?,
    private val trace: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): Optional<List<String>> =
        Optional.ofNullable(id) // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

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

    fun select(): Optional<List<RunSelect>> = Optional.ofNullable(select)

    fun session(): Optional<List<String>> = Optional.ofNullable(session)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    fun trace(): Optional<String> = Optional.ofNullable(trace)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): RunQueryCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return RunQueryCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            id, // templates/JavaSDK/entities/params.ts:180:26
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

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Query params for run endpoints. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = RunQueryCreateBody.Builder::class)
    @NoAutoDetect
    class RunQueryCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val id: List<String>?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
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
        private val select: List<RunSelect>?,
        private val session: List<String>?,
        private val startTime: OffsetDateTime?,
        private val trace: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:113:14
        fun id(): List<String>? = id

        @JsonProperty("cursor") // templates/JavaSDK/entities/objects.ts:113:14
        fun cursor(): String? = cursor

        @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:113:14
        fun error(): Boolean? = error

        @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:113:14
        fun executionOrder(): Long? = executionOrder

        @JsonProperty("filter") // templates/JavaSDK/entities/objects.ts:113:14
        fun filter(): String? = filter

        @JsonProperty("is_root") // templates/JavaSDK/entities/objects.ts:113:14
        fun isRoot(): Boolean? = isRoot

        @JsonProperty("limit") // templates/JavaSDK/entities/objects.ts:113:14
        fun limit(): Long? = limit

        @JsonProperty("parent_run") // templates/JavaSDK/entities/objects.ts:113:14
        fun parentRun(): String? = parentRun

        @JsonProperty("query") // templates/JavaSDK/entities/objects.ts:113:14
        fun query(): String? = query

        @JsonProperty("reference_example") // templates/JavaSDK/entities/objects.ts:113:14
        fun referenceExample(): List<String>? = referenceExample

        /** Enum for run types. */
        @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:113:14
        fun runType(): RunType? = runType

        @JsonProperty("select") // templates/JavaSDK/entities/objects.ts:113:14
        fun select(): List<RunSelect>? = select

        @JsonProperty("session") // templates/JavaSDK/entities/objects.ts:113:14
        fun session(): List<String>? = session

        @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun startTime(): OffsetDateTime? = startTime

        @JsonProperty("trace") // templates/JavaSDK/entities/objects.ts:113:14
        fun trace(): String? = trace

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is RunQueryCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
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

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        id, // templates/JavaSDK/entities/fields.ts:163:19
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
            "RunQueryCreateBody{id=$id, cursor=$cursor, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, limit=$limit, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, select=$select, session=$session, startTime=$startTime, trace=$trace, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var id: List<String>? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
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
            private var select: List<RunSelect>? = null
            private var session: List<String>? = null
            private var startTime: OffsetDateTime? = null
            private var trace: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(runQueryCreateBody: RunQueryCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.id =
                        runQueryCreateBody.id // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.cursor = runQueryCreateBody.cursor
                    this.endTime = runQueryCreateBody.endTime
                    this.error = runQueryCreateBody.error
                    this.executionOrder = runQueryCreateBody.executionOrder
                    this.filter = runQueryCreateBody.filter
                    this.isRoot = runQueryCreateBody.isRoot
                    this.limit = runQueryCreateBody.limit
                    this.parentRun = runQueryCreateBody.parentRun
                    this.query = runQueryCreateBody.query
                    this.referenceExample = runQueryCreateBody.referenceExample
                    this.runType = runQueryCreateBody.runType
                    this.select = runQueryCreateBody.select
                    this.session = runQueryCreateBody.session
                    this.startTime = runQueryCreateBody.startTime
                    this.trace = runQueryCreateBody.trace
                    additionalProperties(runQueryCreateBody.additionalProperties)
                }

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun id(id: List<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            @JsonProperty("cursor") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun cursor(cursor: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.cursor = cursor
            }

            @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun endTime(endTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.endTime = endTime
                }

            @JsonProperty("error") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun error(error: Boolean) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.error = error
            }

            @JsonProperty("execution_order") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun executionOrder(executionOrder: Long) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.executionOrder = executionOrder
                }

            @JsonProperty("filter") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun filter(filter: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.filter = filter
            }

            @JsonProperty("is_root") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun isRoot(isRoot: Boolean) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.isRoot = isRoot
            }

            @JsonProperty("limit") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun limit(limit: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.limit = limit
            }

            @JsonProperty("parent_run") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun parentRun(parentRun: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.parentRun = parentRun
                }

            @JsonProperty("query") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun query(query: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.query = query
            }

            @JsonProperty("reference_example") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun referenceExample(referenceExample: List<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.referenceExample = referenceExample
                }

            /** Enum for run types. */
            // templates/JavaSDK/entities/objects.ts:252:20
            @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:264:20
            fun runType(runType: RunType) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runType = runType
            }

            @JsonProperty("select") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun select(select: List<RunSelect>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.select = select
                }

            @JsonProperty("session") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun session(session: List<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.session = session
                }

            @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun startTime(startTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.startTime = startTime
                }

            @JsonProperty("trace") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun trace(trace: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.trace = trace
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): RunQueryCreateBody =
                RunQueryCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    id?.toUnmodifiable(), // templates/JavaSDK/entities/objects.ts:326:30
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

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is RunQueryCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
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

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            id, // templates/JavaSDK/entities/fields.ts:163:19
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
        "RunQueryCreateParams{id=$id, cursor=$cursor, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, limit=$limit, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, select=$select, session=$session, startTime=$startTime, trace=$trace, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var id: MutableList<String> =
            mutableListOf() // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
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
        private var select: MutableList<RunSelect> = mutableListOf()
        private var session: MutableList<String> = mutableListOf()
        private var startTime: OffsetDateTime? = null
        private var trace: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(runQueryCreateParams: RunQueryCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.id(
                    runQueryCreateParams.id ?: listOf()
                ) // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.cursor = runQueryCreateParams.cursor
                this.endTime = runQueryCreateParams.endTime
                this.error = runQueryCreateParams.error
                this.executionOrder = runQueryCreateParams.executionOrder
                this.filter = runQueryCreateParams.filter
                this.isRoot = runQueryCreateParams.isRoot
                this.limit = runQueryCreateParams.limit
                this.parentRun = runQueryCreateParams.parentRun
                this.query = runQueryCreateParams.query
                this.referenceExample(runQueryCreateParams.referenceExample ?: listOf())
                this.runType = runQueryCreateParams.runType
                this.select(runQueryCreateParams.select ?: listOf())
                this.session(runQueryCreateParams.session ?: listOf())
                this.startTime = runQueryCreateParams.startTime
                this.trace = runQueryCreateParams.trace
                additionalQueryParams(runQueryCreateParams.additionalQueryParams)
                additionalHeaders(runQueryCreateParams.additionalHeaders)
                additionalBodyProperties(runQueryCreateParams.additionalBodyProperties)
            }

        fun id(id: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.id.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.id.add(id)
        }

        fun cursor(cursor: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.cursor = cursor
        }

        fun endTime(endTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.endTime = endTime
            }

        fun error(error: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.error = error
        }

        fun executionOrder(executionOrder: Long) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.executionOrder = executionOrder
            }

        fun filter(filter: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.filter = filter
        }

        fun isRoot(isRoot: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.isRoot = isRoot
        }

        fun limit(limit: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.limit = limit
        }

        fun parentRun(parentRun: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.parentRun = parentRun
        }

        fun query(query: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.query = query
        }

        fun referenceExample(referenceExample: List<String>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.referenceExample.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.referenceExample.addAll(referenceExample)
            }

        fun addReferenceExample(referenceExample: String) =
            apply { // templates/JavaSDK/entities/params.ts:620:26
                this.referenceExample.add(referenceExample)
            }

        /** Enum for run types. */
        fun runType(runType: RunType) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.runType = runType
        }

        fun select(select: List<RunSelect>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.select.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.select.addAll(select)
        }

        fun addSelect(select: RunSelect) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.select.add(select)
        }

        fun session(session: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.session.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.session.addAll(session)
        }

        fun addSession(session: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.session.add(session)
        }

        fun startTime(startTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.startTime = startTime
            }

        fun trace(trace: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.trace = trace
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:703:24
                this.additionalQueryParams.clear() // templates/JavaSDK/entities/params.ts:703:24 //
                // templates/JavaSDK/entities/params.ts:703:24
                putAllQueryParams(additionalQueryParams)
            }

        fun putQueryParam(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:713:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putQueryParams(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:723:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:733:24
                additionalQueryParams.forEach(this::putQueryParams)
            }

        fun removeQueryParam(name: String) = apply { // templates/JavaSDK/entities/params.ts:743:24
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:755:24
                this.additionalHeaders.clear() // templates/JavaSDK/entities/params.ts:755:24 //
                // templates/JavaSDK/entities/params.ts:755:24
                putAllHeaders(additionalHeaders)
            }

        fun putHeader(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:765:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:775:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:785:24
                additionalHeaders.forEach(this::putHeaders)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/entities/params.ts:795:24
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties
                    .clear() // templates/JavaSDK/entities/params.ts:809:28 //
                // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:822:28
                this.additionalBodyProperties.put(key, value)
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:832:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): RunQueryCreateParams =
            RunQueryCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                if (id.size == 0) null
                else id.toUnmodifiable(), // templates/JavaSDK/entities/params.ts:683:22
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
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is RunType && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val TOOL = RunType(JsonField.of("tool")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val CHAIN = RunType(JsonField.of("chain"))

            @JvmField val LLM = RunType(JsonField.of("llm"))

            @JvmField val RETRIEVER = RunType(JsonField.of("retriever"))

            @JvmField val EMBEDDING = RunType(JsonField.of("embedding"))

            @JvmField val PROMPT = RunType(JsonField.of("prompt"))

            @JvmField val PARSER = RunType(JsonField.of("parser"))

            @JvmStatic fun of(value: String) = RunType(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            TOOL, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            TOOL, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            CHAIN,
            LLM,
            RETRIEVER,
            EMBEDDING,
            PROMPT,
            PARSER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                TOOL -> Value.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                CHAIN -> Value.CHAIN
                LLM -> Value.LLM
                RETRIEVER -> Value.RETRIEVER
                EMBEDDING -> Value.EMBEDDING
                PROMPT -> Value.PROMPT
                PARSER -> Value.PARSER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                TOOL -> Known.TOOL // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
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

    class RunSelect
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is RunSelect && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val ID = RunSelect(JsonField.of("id")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val NAME = RunSelect(JsonField.of("name"))

            @JvmField val RUN_TYPE = RunSelect(JsonField.of("run_type"))

            @JvmField val START_TIME = RunSelect(JsonField.of("start_time"))

            @JvmField val END_TIME = RunSelect(JsonField.of("end_time"))

            @JvmField val STATUS = RunSelect(JsonField.of("status"))

            @JvmField val ERROR = RunSelect(JsonField.of("error"))

            @JvmField val EXTRA = RunSelect(JsonField.of("extra"))

            @JvmField val EVENTS = RunSelect(JsonField.of("events"))

            @JvmField val INPUTS = RunSelect(JsonField.of("inputs"))

            @JvmField val INPUTS_S3_URLS = RunSelect(JsonField.of("inputs_s3_urls"))

            @JvmField val OUTPUTS = RunSelect(JsonField.of("outputs"))

            @JvmField val OUTPUTS_S3_URLS = RunSelect(JsonField.of("outputs_s3_urls"))

            @JvmField val PARENT_RUN_ID = RunSelect(JsonField.of("parent_run_id"))

            @JvmField val MANIFEST_ID = RunSelect(JsonField.of("manifest_id"))

            @JvmField val MANIFEST_S3_ID = RunSelect(JsonField.of("manifest_s3_id"))

            @JvmField val SESSION_ID = RunSelect(JsonField.of("session_id"))

            @JvmField val SERIALIZED = RunSelect(JsonField.of("serialized"))

            @JvmField val REFERENCE_EXAMPLE_ID = RunSelect(JsonField.of("reference_example_id"))

            @JvmField val TOTAL_TOKENS = RunSelect(JsonField.of("total_tokens"))

            @JvmField val PROMPT_TOKENS = RunSelect(JsonField.of("prompt_tokens"))

            @JvmField val COMPLETION_TOKENS = RunSelect(JsonField.of("completion_tokens"))

            @JvmField val TOTAL_COST = RunSelect(JsonField.of("total_cost"))

            @JvmField val PROMPT_COST = RunSelect(JsonField.of("prompt_cost"))

            @JvmField val COMPLETION_COST = RunSelect(JsonField.of("completion_cost"))

            @JvmField val FIRST_TOKEN_TIME = RunSelect(JsonField.of("first_token_time"))

            @JvmField val TRACE_ID = RunSelect(JsonField.of("trace_id"))

            @JvmField val DOTTED_ORDER = RunSelect(JsonField.of("dotted_order"))

            @JvmField val LAST_QUEUED_AT = RunSelect(JsonField.of("last_queued_at"))

            @JvmField val FEEDBACK_STATS = RunSelect(JsonField.of("feedback_stats"))

            @JvmField val CHILD_RUN_IDS = RunSelect(JsonField.of("child_run_ids"))

            @JvmField val PARENT_RUN_IDS = RunSelect(JsonField.of("parent_run_ids"))

            @JvmField val TAGS = RunSelect(JsonField.of("tags"))

            @JvmField val IN_DATASET = RunSelect(JsonField.of("in_dataset"))

            @JvmField val APP_PATH = RunSelect(JsonField.of("app_path"))

            @JvmField val SHARE_TOKEN = RunSelect(JsonField.of("share_token"))

            @JvmStatic fun of(value: String) = RunSelect(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            ID, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
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

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            ID, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
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
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                ID -> Value.ID // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
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
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                ID -> Known.ID // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
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
                else -> throw LangSmithInvalidDataException("Unknown RunSelect: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
