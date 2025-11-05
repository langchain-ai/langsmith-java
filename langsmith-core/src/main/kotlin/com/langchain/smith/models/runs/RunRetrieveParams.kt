// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Get a specific run. */
class RunRetrieveParams
private constructor(
    private val runId: String?,
    private val excludeS3StoredAttributes: Boolean?,
    private val excludeSerialized: Boolean?,
    private val sessionId: String?,
    private val startTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun runId(): Optional<String> = Optional.ofNullable(runId)

    fun excludeS3StoredAttributes(): Optional<Boolean> =
        Optional.ofNullable(excludeS3StoredAttributes)

    fun excludeSerialized(): Optional<Boolean> = Optional.ofNullable(excludeSerialized)

    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RunRetrieveParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RunRetrieveParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRetrieveParams]. */
    class Builder internal constructor() {

        private var runId: String? = null
        private var excludeS3StoredAttributes: Boolean? = null
        private var excludeSerialized: Boolean? = null
        private var sessionId: String? = null
        private var startTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runRetrieveParams: RunRetrieveParams) = apply {
            runId = runRetrieveParams.runId
            excludeS3StoredAttributes = runRetrieveParams.excludeS3StoredAttributes
            excludeSerialized = runRetrieveParams.excludeSerialized
            sessionId = runRetrieveParams.sessionId
            startTime = runRetrieveParams.startTime
            additionalHeaders = runRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = runRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun runId(runId: String?) = apply { this.runId = runId }

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Boolean?) = apply {
            this.excludeS3StoredAttributes = excludeS3StoredAttributes
        }

        /**
         * Alias for [Builder.excludeS3StoredAttributes].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Boolean) =
            excludeS3StoredAttributes(excludeS3StoredAttributes as Boolean?)

        /**
         * Alias for calling [Builder.excludeS3StoredAttributes] with
         * `excludeS3StoredAttributes.orElse(null)`.
         */
        fun excludeS3StoredAttributes(excludeS3StoredAttributes: Optional<Boolean>) =
            excludeS3StoredAttributes(excludeS3StoredAttributes.getOrNull())

        fun excludeSerialized(excludeSerialized: Boolean?) = apply {
            this.excludeSerialized = excludeSerialized
        }

        /**
         * Alias for [Builder.excludeSerialized].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun excludeSerialized(excludeSerialized: Boolean) =
            excludeSerialized(excludeSerialized as Boolean?)

        /** Alias for calling [Builder.excludeSerialized] with `excludeSerialized.orElse(null)`. */
        fun excludeSerialized(excludeSerialized: Optional<Boolean>) =
            excludeSerialized(excludeSerialized.getOrNull())

        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        fun startTime(startTime: OffsetDateTime?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

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
         * Returns an immutable instance of [RunRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RunRetrieveParams =
            RunRetrieveParams(
                runId,
                excludeS3StoredAttributes,
                excludeSerialized,
                sessionId,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> runId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                excludeS3StoredAttributes?.let {
                    put("exclude_s3_stored_attributes", it.toString())
                }
                excludeSerialized?.let { put("exclude_serialized", it.toString()) }
                sessionId?.let { put("session_id", it) }
                startTime?.let {
                    put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRetrieveParams &&
            runId == other.runId &&
            excludeS3StoredAttributes == other.excludeS3StoredAttributes &&
            excludeSerialized == other.excludeSerialized &&
            sessionId == other.sessionId &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            runId,
            excludeS3StoredAttributes,
            excludeSerialized,
            sessionId,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunRetrieveParams{runId=$runId, excludeS3StoredAttributes=$excludeS3StoredAttributes, excludeSerialized=$excludeSerialized, sessionId=$sessionId, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
