// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.public_.runs

import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * **Alpha:** The request and response contract may change; Returns one run within the trace
 * identified by the share token. The request supplies only the run ID and that run's exact
 * start_time coordinate.
 */
class RunRetrieveParams
private constructor(
    private val shareToken: String,
    private val runId: String?,
    private val selects: List<String>,
    private val startTime: OffsetDateTime,
    private val accept: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun shareToken(): String = shareToken

    fun runId(): Optional<String> = Optional.ofNullable(runId)

    /** repeatable public run fields to include */
    fun selects(): List<String> = selects

    /** Run start_time coordinate (RFC3339) */
    fun startTime(): OffsetDateTime = startTime

    fun accept(): Optional<String> = Optional.ofNullable(accept)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .shareToken()
         * .selects()
         * .startTime()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunRetrieveParams]. */
    class Builder internal constructor() {

        private var shareToken: String? = null
        private var runId: String? = null
        private var selects: MutableList<String>? = null
        private var startTime: OffsetDateTime? = null
        private var accept: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runRetrieveParams: RunRetrieveParams) = apply {
            shareToken = runRetrieveParams.shareToken
            runId = runRetrieveParams.runId
            selects = runRetrieveParams.selects.toMutableList()
            startTime = runRetrieveParams.startTime
            accept = runRetrieveParams.accept
            additionalHeaders = runRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams = runRetrieveParams.additionalQueryParams.toBuilder()
        }

        fun shareToken(shareToken: String) = apply { this.shareToken = shareToken }

        fun runId(runId: String?) = apply { this.runId = runId }

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        /** repeatable public run fields to include */
        fun selects(selects: List<String>) = apply { this.selects = selects.toMutableList() }

        /**
         * Adds a single [String] to [selects].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSelect(select: String) = apply {
            selects = (selects ?: mutableListOf()).apply { add(select) }
        }

        /** Run start_time coordinate (RFC3339) */
        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

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
         * Returns an immutable instance of [RunRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .shareToken()
         * .selects()
         * .startTime()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunRetrieveParams =
            RunRetrieveParams(
                checkRequired("shareToken", shareToken),
                runId,
                checkRequired("selects", selects).toImmutable(),
                checkRequired("startTime", startTime),
                accept,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> shareToken
            1 -> runId ?: ""
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
                selects.forEach { put("selects", it) }
                put("start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(startTime))
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunRetrieveParams &&
            shareToken == other.shareToken &&
            runId == other.runId &&
            selects == other.selects &&
            startTime == other.startTime &&
            accept == other.accept &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            shareToken,
            runId,
            selects,
            startTime,
            accept,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RunRetrieveParams{shareToken=$shareToken, runId=$runId, selects=$selects, startTime=$startTime, accept=$accept, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
