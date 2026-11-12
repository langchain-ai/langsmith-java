// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns one tracing project or experiment by ID. Pass include_stats=true to include run
 * statistics.
 */
class SessionRetrieveV2Params
private constructor(
    private val sessionId: String?,
    private val includeStats: Boolean?,
    private val statsStartTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun sessionId(): Optional<String> = Optional.ofNullable(sessionId)

    /** Include run statistics */
    fun includeStats(): Optional<Boolean> = Optional.ofNullable(includeStats)

    /** Only aggregate statistics at or after this time, within the last 31 days */
    fun statsStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(statsStartTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SessionRetrieveV2Params = builder().build()

        /** Returns a mutable builder for constructing an instance of [SessionRetrieveV2Params]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionRetrieveV2Params]. */
    class Builder internal constructor() {

        private var sessionId: String? = null
        private var includeStats: Boolean? = null
        private var statsStartTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(sessionRetrieveV2Params: SessionRetrieveV2Params) = apply {
            sessionId = sessionRetrieveV2Params.sessionId
            includeStats = sessionRetrieveV2Params.includeStats
            statsStartTime = sessionRetrieveV2Params.statsStartTime
            additionalHeaders = sessionRetrieveV2Params.additionalHeaders.toBuilder()
            additionalQueryParams = sessionRetrieveV2Params.additionalQueryParams.toBuilder()
        }

        fun sessionId(sessionId: String?) = apply { this.sessionId = sessionId }

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /** Include run statistics */
        fun includeStats(includeStats: Boolean?) = apply { this.includeStats = includeStats }

        /**
         * Alias for [Builder.includeStats].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeStats(includeStats: Boolean) = includeStats(includeStats as Boolean?)

        /** Alias for calling [Builder.includeStats] with `includeStats.orElse(null)`. */
        fun includeStats(includeStats: Optional<Boolean>) = includeStats(includeStats.getOrNull())

        /** Only aggregate statistics at or after this time, within the last 31 days */
        fun statsStartTime(statsStartTime: OffsetDateTime?) = apply {
            this.statsStartTime = statsStartTime
        }

        /** Alias for calling [Builder.statsStartTime] with `statsStartTime.orElse(null)`. */
        fun statsStartTime(statsStartTime: Optional<OffsetDateTime>) =
            statsStartTime(statsStartTime.getOrNull())

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
         * Returns an immutable instance of [SessionRetrieveV2Params].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SessionRetrieveV2Params =
            SessionRetrieveV2Params(
                sessionId,
                includeStats,
                statsStartTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> sessionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                includeStats?.let { put("include_stats", it.toString()) }
                statsStartTime?.let {
                    put("stats_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRetrieveV2Params &&
            sessionId == other.sessionId &&
            includeStats == other.includeStats &&
            statsStartTime == other.statsStartTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            sessionId,
            includeStats,
            statsStartTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionRetrieveV2Params{sessionId=$sessionId, includeStats=$includeStats, statsStartTime=$statsStartTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
