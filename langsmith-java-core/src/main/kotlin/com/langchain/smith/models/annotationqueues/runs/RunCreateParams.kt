// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add Runs To Annotation Queue */
class RunCreateParams
private constructor(
    private val queueId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): Optional<String> = Optional.ofNullable(queueId)

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunCreateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunCreateParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runCreateParams: RunCreateParams) = apply {
            queueId = runCreateParams.queueId
            body = runCreateParams.body
            additionalHeaders = runCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = runCreateParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String?) = apply { this.queueId = queueId }

        /** Alias for calling [Builder.queueId] with `queueId.orElse(null)`. */
        fun queueId(queueId: Optional<String>) = queueId(queueId.getOrNull())

        fun body(body: Body) = apply { this.body = body }

        /** Alias for calling [body] with `Body.ofStrings(strings)`. */
        fun bodyOfStrings(strings: List<String>) = body(Body.ofStrings(strings))

        /**
         * Alias for calling [body] with
         * `Body.ofAnnotationQueueRunAddSchemas(annotationQueueRunAddSchemas)`.
         */
        fun bodyOfAnnotationQueueRunAddSchemas(
            annotationQueueRunAddSchemas: List<Body.AnnotationQueueRunAddSchema>
        ) = body(Body.ofAnnotationQueueRunAddSchemas(annotationQueueRunAddSchemas))

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
         * Returns an immutable instance of [RunCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunCreateParams =
            RunCreateParams(
                queueId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val strings: List<String>? = null,
        private val annotationQueueRunAddSchemas: List<AnnotationQueueRunAddSchema>? = null,
        private val _json: JsonValue? = null,
    ) {

        fun strings(): Optional<List<String>> = Optional.ofNullable(strings)

        fun annotationQueueRunAddSchemas(): Optional<List<AnnotationQueueRunAddSchema>> =
            Optional.ofNullable(annotationQueueRunAddSchemas)

        fun isStrings(): Boolean = strings != null

        fun isAnnotationQueueRunAddSchemas(): Boolean = annotationQueueRunAddSchemas != null

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        fun asAnnotationQueueRunAddSchemas(): List<AnnotationQueueRunAddSchema> =
            annotationQueueRunAddSchemas.getOrThrow("annotationQueueRunAddSchemas")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                strings != null -> visitor.visitStrings(strings)
                annotationQueueRunAddSchemas != null ->
                    visitor.visitAnnotationQueueRunAddSchemas(annotationQueueRunAddSchemas)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitStrings(strings: List<String>) {}

                    override fun visitAnnotationQueueRunAddSchemas(
                        annotationQueueRunAddSchemas: List<AnnotationQueueRunAddSchema>
                    ) {
                        annotationQueueRunAddSchemas.forEach { it.validate() }
                    }
                }
            )
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
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitStrings(strings: List<String>) = strings.size

                    override fun visitAnnotationQueueRunAddSchemas(
                        annotationQueueRunAddSchemas: List<AnnotationQueueRunAddSchema>
                    ) = annotationQueueRunAddSchemas.sumOf { it.validity().toInt() }

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                strings == other.strings &&
                annotationQueueRunAddSchemas == other.annotationQueueRunAddSchemas
        }

        override fun hashCode(): Int = Objects.hash(strings, annotationQueueRunAddSchemas)

        override fun toString(): String =
            when {
                strings != null -> "Body{strings=$strings}"
                annotationQueueRunAddSchemas != null ->
                    "Body{annotationQueueRunAddSchemas=$annotationQueueRunAddSchemas}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic fun ofStrings(strings: List<String>) = Body(strings = strings.toImmutable())

            @JvmStatic
            fun ofAnnotationQueueRunAddSchemas(
                annotationQueueRunAddSchemas: List<AnnotationQueueRunAddSchema>
            ) = Body(annotationQueueRunAddSchemas = annotationQueueRunAddSchemas.toImmutable())
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitStrings(strings: List<String>): T

            fun visitAnnotationQueueRunAddSchemas(
                annotationQueueRunAddSchemas: List<AnnotationQueueRunAddSchema>
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<List<String>>())?.let {
                                Body(strings = it, _json = json)
                            },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<List<AnnotationQueueRunAddSchema>>(),
                                )
                                ?.let { Body(annotationQueueRunAddSchemas = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.strings != null -> generator.writeObject(value.strings)
                    value.annotationQueueRunAddSchemas != null ->
                        generator.writeObject(value.annotationQueueRunAddSchemas)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        /** Schema for adding a run to an annotation queue with optional metadata. */
        class AnnotationQueueRunAddSchema
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val runId: JsonField<String>,
            private val parentRunId: JsonField<String>,
            private val sessionId: JsonField<String>,
            private val startTime: JsonField<OffsetDateTime>,
            private val traceId: JsonField<String>,
            private val traceTier: JsonField<TraceTier>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("parent_run_id")
                @ExcludeMissing
                parentRunId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("session_id")
                @ExcludeMissing
                sessionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("start_time")
                @ExcludeMissing
                startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("trace_id")
                @ExcludeMissing
                traceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_tier")
                @ExcludeMissing
                traceTier: JsonField<TraceTier> = JsonMissing.of(),
            ) : this(runId, parentRunId, sessionId, startTime, traceId, traceTier, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun runId(): String = runId.getRequired("run_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun parentRunId(): Optional<String> = parentRunId.getOptional("parent_run_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceId(): Optional<String> = traceId.getOptional("trace_id")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun traceTier(): Optional<TraceTier> = traceTier.getOptional("trace_tier")

            /**
             * Returns the raw JSON value of [runId].
             *
             * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

            /**
             * Returns the raw JSON value of [parentRunId].
             *
             * Unlike [parentRunId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("parent_run_id")
            @ExcludeMissing
            fun _parentRunId(): JsonField<String> = parentRunId

            /**
             * Returns the raw JSON value of [sessionId].
             *
             * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("session_id")
            @ExcludeMissing
            fun _sessionId(): JsonField<String> = sessionId

            /**
             * Returns the raw JSON value of [startTime].
             *
             * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_time")
            @ExcludeMissing
            fun _startTime(): JsonField<OffsetDateTime> = startTime

            /**
             * Returns the raw JSON value of [traceId].
             *
             * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

            /**
             * Returns the raw JSON value of [traceTier].
             *
             * Unlike [traceTier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("trace_tier")
            @ExcludeMissing
            fun _traceTier(): JsonField<TraceTier> = traceTier

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [AnnotationQueueRunAddSchema].
                 *
                 * The following fields are required:
                 * ```java
                 * .runId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AnnotationQueueRunAddSchema]. */
            class Builder internal constructor() {

                private var runId: JsonField<String>? = null
                private var parentRunId: JsonField<String> = JsonMissing.of()
                private var sessionId: JsonField<String> = JsonMissing.of()
                private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
                private var traceId: JsonField<String> = JsonMissing.of()
                private var traceTier: JsonField<TraceTier> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(annotationQueueRunAddSchema: AnnotationQueueRunAddSchema) =
                    apply {
                        runId = annotationQueueRunAddSchema.runId
                        parentRunId = annotationQueueRunAddSchema.parentRunId
                        sessionId = annotationQueueRunAddSchema.sessionId
                        startTime = annotationQueueRunAddSchema.startTime
                        traceId = annotationQueueRunAddSchema.traceId
                        traceTier = annotationQueueRunAddSchema.traceTier
                        additionalProperties =
                            annotationQueueRunAddSchema.additionalProperties.toMutableMap()
                    }

                fun runId(runId: String) = runId(JsonField.of(runId))

                /**
                 * Sets [Builder.runId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.runId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun runId(runId: JsonField<String>) = apply { this.runId = runId }

                fun parentRunId(parentRunId: String?) =
                    parentRunId(JsonField.ofNullable(parentRunId))

                /** Alias for calling [Builder.parentRunId] with `parentRunId.orElse(null)`. */
                fun parentRunId(parentRunId: Optional<String>) =
                    parentRunId(parentRunId.getOrNull())

                /**
                 * Sets [Builder.parentRunId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.parentRunId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun parentRunId(parentRunId: JsonField<String>) = apply {
                    this.parentRunId = parentRunId
                }

                fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

                /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
                fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

                /**
                 * Sets [Builder.sessionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sessionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

                fun startTime(startTime: OffsetDateTime?) =
                    startTime(JsonField.ofNullable(startTime))

                /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
                fun startTime(startTime: Optional<OffsetDateTime>) =
                    startTime(startTime.getOrNull())

                /**
                 * Sets [Builder.startTime] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                    this.startTime = startTime
                }

                fun traceId(traceId: String?) = traceId(JsonField.ofNullable(traceId))

                /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
                fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

                /**
                 * Sets [Builder.traceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

                fun traceTier(traceTier: TraceTier?) = traceTier(JsonField.ofNullable(traceTier))

                /** Alias for calling [Builder.traceTier] with `traceTier.orElse(null)`. */
                fun traceTier(traceTier: Optional<TraceTier>) = traceTier(traceTier.getOrNull())

                /**
                 * Sets [Builder.traceTier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.traceTier] with a well-typed [TraceTier] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun traceTier(traceTier: JsonField<TraceTier>) = apply {
                    this.traceTier = traceTier
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AnnotationQueueRunAddSchema].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .runId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AnnotationQueueRunAddSchema =
                    AnnotationQueueRunAddSchema(
                        checkRequired("runId", runId),
                        parentRunId,
                        sessionId,
                        startTime,
                        traceId,
                        traceTier,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AnnotationQueueRunAddSchema = apply {
                if (validated) {
                    return@apply
                }

                runId()
                parentRunId()
                sessionId()
                startTime()
                traceId()
                traceTier().ifPresent { it.validate() }
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
            @JvmSynthetic
            internal fun validity(): Int =
                (if (runId.asKnown().isPresent) 1 else 0) +
                    (if (parentRunId.asKnown().isPresent) 1 else 0) +
                    (if (sessionId.asKnown().isPresent) 1 else 0) +
                    (if (startTime.asKnown().isPresent) 1 else 0) +
                    (if (traceId.asKnown().isPresent) 1 else 0) +
                    (traceTier.asKnown().getOrNull()?.validity() ?: 0)

            class TraceTier @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val LONGLIVED = of("longlived")

                    @JvmField val SHORTLIVED = of("shortlived")

                    @JvmStatic fun of(value: String) = TraceTier(JsonField.of(value))
                }

                /** An enum containing [TraceTier]'s known values. */
                enum class Known {
                    LONGLIVED,
                    SHORTLIVED,
                }

                /**
                 * An enum containing [TraceTier]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TraceTier] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    LONGLIVED,
                    SHORTLIVED,
                    /**
                     * An enum member indicating that [TraceTier] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        LONGLIVED -> Value.LONGLIVED
                        SHORTLIVED -> Value.SHORTLIVED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        LONGLIVED -> Known.LONGLIVED
                        SHORTLIVED -> Known.SHORTLIVED
                        else -> throw LangChainInvalidDataException("Unknown TraceTier: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): TraceTier = apply {
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

                    return other is TraceTier && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AnnotationQueueRunAddSchema &&
                    runId == other.runId &&
                    parentRunId == other.parentRunId &&
                    sessionId == other.sessionId &&
                    startTime == other.startTime &&
                    traceId == other.traceId &&
                    traceTier == other.traceTier &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    runId,
                    parentRunId,
                    sessionId,
                    startTime,
                    traceId,
                    traceTier,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AnnotationQueueRunAddSchema{runId=$runId, parentRunId=$parentRunId, sessionId=$sessionId, startTime=$startTime, traceId=$traceId, traceTier=$traceTier, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunCreateParams &&
            queueId == other.queueId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunCreateParams{queueId=$queueId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
