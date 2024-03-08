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

class PublicDatasetRunStatCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val shareToken: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
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

    fun shareToken(): String = shareToken // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

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

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody():
        PublicDatasetRunStatCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return PublicDatasetRunStatCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            id, // templates/JavaSDK/entities/params.ts:180:26
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

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> shareToken // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    /** Query params for run endpoints. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = PublicDatasetRunStatCreateBody.Builder::class)
    @NoAutoDetect
    class PublicDatasetRunStatCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val id: List<String>?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
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

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:113:14
        fun id(): List<String>? = id

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

        @JsonProperty("parent_run") // templates/JavaSDK/entities/objects.ts:113:14
        fun parentRun(): String? = parentRun

        @JsonProperty("query") // templates/JavaSDK/entities/objects.ts:113:14
        fun query(): String? = query

        @JsonProperty("reference_example") // templates/JavaSDK/entities/objects.ts:113:14
        fun referenceExample(): List<String>? = referenceExample

        /** Enum for run types. */
        @JsonProperty("run_type") // templates/JavaSDK/entities/objects.ts:113:14
        fun runType(): RunType? = runType

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

            return other is
                PublicDatasetRunStatCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
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

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        id, // templates/JavaSDK/entities/fields.ts:163:19
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
            "PublicDatasetRunStatCreateBody{id=$id, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, session=$session, startTime=$startTime, trace=$trace, additionalProperties=$additionalProperties}"

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

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(publicDatasetRunStatCreateBody: PublicDatasetRunStatCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.id =
                        publicDatasetRunStatCreateBody
                            .id // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.endTime = publicDatasetRunStatCreateBody.endTime
                    this.error = publicDatasetRunStatCreateBody.error
                    this.executionOrder = publicDatasetRunStatCreateBody.executionOrder
                    this.filter = publicDatasetRunStatCreateBody.filter
                    this.isRoot = publicDatasetRunStatCreateBody.isRoot
                    this.parentRun = publicDatasetRunStatCreateBody.parentRun
                    this.query = publicDatasetRunStatCreateBody.query
                    this.referenceExample = publicDatasetRunStatCreateBody.referenceExample
                    this.runType = publicDatasetRunStatCreateBody.runType
                    this.session = publicDatasetRunStatCreateBody.session
                    this.startTime = publicDatasetRunStatCreateBody.startTime
                    this.trace = publicDatasetRunStatCreateBody.trace
                    additionalProperties(publicDatasetRunStatCreateBody.additionalProperties)
                }

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun id(id: List<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
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

            fun build(): PublicDatasetRunStatCreateBody =
                PublicDatasetRunStatCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    id?.toUnmodifiable(), // templates/JavaSDK/entities/objects.ts:326:30
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

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is
            PublicDatasetRunStatCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.shareToken == other.shareToken &&
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

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            shareToken, // templates/JavaSDK/entities/fields.ts:163:19
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
        "PublicDatasetRunStatCreateParams{shareToken=$shareToken, id=$id, endTime=$endTime, error=$error, executionOrder=$executionOrder, filter=$filter, isRoot=$isRoot, parentRun=$parentRun, query=$query, referenceExample=$referenceExample, runType=$runType, session=$session, startTime=$startTime, trace=$trace, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var shareToken: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
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

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(publicDatasetRunStatCreateParams: PublicDatasetRunStatCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.shareToken =
                    publicDatasetRunStatCreateParams
                        .shareToken // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.id(publicDatasetRunStatCreateParams.id ?: listOf())
                this.endTime = publicDatasetRunStatCreateParams.endTime
                this.error = publicDatasetRunStatCreateParams.error
                this.executionOrder = publicDatasetRunStatCreateParams.executionOrder
                this.filter = publicDatasetRunStatCreateParams.filter
                this.isRoot = publicDatasetRunStatCreateParams.isRoot
                this.parentRun = publicDatasetRunStatCreateParams.parentRun
                this.query = publicDatasetRunStatCreateParams.query
                this.referenceExample(publicDatasetRunStatCreateParams.referenceExample ?: listOf())
                this.runType = publicDatasetRunStatCreateParams.runType
                this.session(publicDatasetRunStatCreateParams.session ?: listOf())
                this.startTime = publicDatasetRunStatCreateParams.startTime
                this.trace = publicDatasetRunStatCreateParams.trace
                additionalQueryParams(publicDatasetRunStatCreateParams.additionalQueryParams)
                additionalHeaders(publicDatasetRunStatCreateParams.additionalHeaders)
                additionalBodyProperties(publicDatasetRunStatCreateParams.additionalBodyProperties)
            }

        fun shareToken(shareToken: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.shareToken = shareToken
        }

        fun id(id: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.id.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.id.add(id)
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

        fun build(): PublicDatasetRunStatCreateParams =
            PublicDatasetRunStatCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(shareToken) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`shareToken` is required but was not set"
                },
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
}
