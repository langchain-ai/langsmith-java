// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Add Runs To Annotation Queue By Key */
class RunCreateByKeyParams
private constructor(
    private val queueId: String?,
    private val extendTraceRetention: Boolean?,
    private val body: List<Body>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): Optional<String> = Optional.ofNullable(queueId)

    fun extendTraceRetention(): Optional<Boolean> = Optional.ofNullable(extendTraceRetention)

    fun body(): List<Body> = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunCreateByKeyParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunCreateByKeyParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var extendTraceRetention: Boolean? = null
        private var body: MutableList<Body>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runCreateByKeyParams: RunCreateByKeyParams) = apply {
            queueId = runCreateByKeyParams.queueId
            extendTraceRetention = runCreateByKeyParams.extendTraceRetention
            body = runCreateByKeyParams.body.toMutableList()
            additionalHeaders = runCreateByKeyParams.additionalHeaders.toBuilder()
            additionalQueryParams = runCreateByKeyParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String?) = apply { this.queueId = queueId }

        /** Alias for calling [Builder.queueId] with `queueId.orElse(null)`. */
        fun queueId(queueId: Optional<String>) = queueId(queueId.getOrNull())

        fun extendTraceRetention(extendTraceRetention: Boolean?) = apply {
            this.extendTraceRetention = extendTraceRetention
        }

        /**
         * Alias for [Builder.extendTraceRetention].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun extendTraceRetention(extendTraceRetention: Boolean) =
            extendTraceRetention(extendTraceRetention as Boolean?)

        /**
         * Alias for calling [Builder.extendTraceRetention] with
         * `extendTraceRetention.orElse(null)`.
         */
        fun extendTraceRetention(extendTraceRetention: Optional<Boolean>) =
            extendTraceRetention(extendTraceRetention.getOrNull())

        fun body(body: List<Body>) = apply { this.body = body.toMutableList() }

        /**
         * Adds a single [Body] to [Builder.body].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBody(body: Body) = apply {
            this.body = (this.body ?: mutableListOf()).apply { add(body) }
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
         * Returns an immutable instance of [RunCreateByKeyParams].
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
        fun build(): RunCreateByKeyParams =
            RunCreateByKeyParams(
                queueId,
                extendTraceRetention,
                checkRequired("body", body).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Body> = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                extendTraceRetention?.let { put("extend_trace_retention", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Add run to AQ by SmithDB key. is_root derived server-side (LSAQ-141). */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val runId: JsonField<String>,
        private val sessionId: JsonField<String>,
        private val startTime: JsonField<OffsetDateTime>,
        private val sourceProposedExampleId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("session_id")
            @ExcludeMissing
            sessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_time")
            @ExcludeMissing
            startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("source_proposed_example_id")
            @ExcludeMissing
            sourceProposedExampleId: JsonField<String> = JsonMissing.of(),
        ) : this(runId, sessionId, startTime, sourceProposedExampleId, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun runId(): String = runId.getRequired("run_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sessionId(): String = sessionId.getRequired("session_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startTime(): OffsetDateTime = startTime.getRequired("start_time")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sourceProposedExampleId(): Optional<String> =
            sourceProposedExampleId.getOptional("source_proposed_example_id")

        /**
         * Returns the raw JSON value of [runId].
         *
         * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

        /**
         * Returns the raw JSON value of [sessionId].
         *
         * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

        /**
         * Returns the raw JSON value of [startTime].
         *
         * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_time")
        @ExcludeMissing
        fun _startTime(): JsonField<OffsetDateTime> = startTime

        /**
         * Returns the raw JSON value of [sourceProposedExampleId].
         *
         * Unlike [sourceProposedExampleId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("source_proposed_example_id")
        @ExcludeMissing
        fun _sourceProposedExampleId(): JsonField<String> = sourceProposedExampleId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .runId()
             * .sessionId()
             * .startTime()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var runId: JsonField<String>? = null
            private var sessionId: JsonField<String>? = null
            private var startTime: JsonField<OffsetDateTime>? = null
            private var sourceProposedExampleId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                runId = body.runId
                sessionId = body.sessionId
                startTime = body.startTime
                sourceProposedExampleId = body.sourceProposedExampleId
                additionalProperties = body.additionalProperties.toMutableMap()
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

            fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

            /**
             * Sets [Builder.sessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

            fun startTime(startTime: OffsetDateTime) = startTime(JsonField.of(startTime))

            /**
             * Sets [Builder.startTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startTime(startTime: JsonField<OffsetDateTime>) = apply {
                this.startTime = startTime
            }

            fun sourceProposedExampleId(sourceProposedExampleId: String?) =
                sourceProposedExampleId(JsonField.ofNullable(sourceProposedExampleId))

            /**
             * Alias for calling [Builder.sourceProposedExampleId] with
             * `sourceProposedExampleId.orElse(null)`.
             */
            fun sourceProposedExampleId(sourceProposedExampleId: Optional<String>) =
                sourceProposedExampleId(sourceProposedExampleId.getOrNull())

            /**
             * Sets [Builder.sourceProposedExampleId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceProposedExampleId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sourceProposedExampleId(sourceProposedExampleId: JsonField<String>) = apply {
                this.sourceProposedExampleId = sourceProposedExampleId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .runId()
             * .sessionId()
             * .startTime()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("runId", runId),
                    checkRequired("sessionId", sessionId),
                    checkRequired("startTime", startTime),
                    sourceProposedExampleId,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            runId()
            sessionId()
            startTime()
            sourceProposedExampleId()
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
                (if (sessionId.asKnown().isPresent) 1 else 0) +
                (if (startTime.asKnown().isPresent) 1 else 0) +
                (if (sourceProposedExampleId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                runId == other.runId &&
                sessionId == other.sessionId &&
                startTime == other.startTime &&
                sourceProposedExampleId == other.sourceProposedExampleId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(runId, sessionId, startTime, sourceProposedExampleId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{runId=$runId, sessionId=$sessionId, startTime=$startTime, sourceProposedExampleId=$sourceProposedExampleId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunCreateByKeyParams &&
            queueId == other.queueId &&
            extendTraceRetention == other.extendTraceRetention &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(queueId, extendTraceRetention, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunCreateByKeyParams{queueId=$queueId, extendTraceRetention=$extendTraceRetention, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
