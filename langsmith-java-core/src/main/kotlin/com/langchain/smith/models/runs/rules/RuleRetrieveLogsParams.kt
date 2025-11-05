// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.langchain.smith.core.Params
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List logs for a particular rule */
class RuleRetrieveLogsParams
private constructor(
    private val ruleId: String?,
    private val endTime: OffsetDateTime?,
    private val limit: Long?,
    private val offset: Long?,
    private val startTime: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun ruleId(): Optional<String> = Optional.ofNullable(ruleId)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): RuleRetrieveLogsParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [RuleRetrieveLogsParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RuleRetrieveLogsParams]. */
    class Builder internal constructor() {

        private var ruleId: String? = null
        private var endTime: OffsetDateTime? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var startTime: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(ruleRetrieveLogsParams: RuleRetrieveLogsParams) = apply {
            ruleId = ruleRetrieveLogsParams.ruleId
            endTime = ruleRetrieveLogsParams.endTime
            limit = ruleRetrieveLogsParams.limit
            offset = ruleRetrieveLogsParams.offset
            startTime = ruleRetrieveLogsParams.startTime
            additionalHeaders = ruleRetrieveLogsParams.additionalHeaders.toBuilder()
            additionalQueryParams = ruleRetrieveLogsParams.additionalQueryParams.toBuilder()
        }

        fun ruleId(ruleId: String?) = apply { this.ruleId = ruleId }

        /** Alias for calling [Builder.ruleId] with `ruleId.orElse(null)`. */
        fun ruleId(ruleId: Optional<String>) = ruleId(ruleId.getOrNull())

        fun endTime(endTime: OffsetDateTime?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<OffsetDateTime>) = endTime(endTime.getOrNull())

        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        fun offset(offset: Long?) = apply { this.offset = offset }

        /**
         * Alias for [Builder.offset].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun offset(offset: Long) = offset(offset as Long?)

        /** Alias for calling [Builder.offset] with `offset.orElse(null)`. */
        fun offset(offset: Optional<Long>) = offset(offset.getOrNull())

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
         * Returns an immutable instance of [RuleRetrieveLogsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): RuleRetrieveLogsParams =
            RuleRetrieveLogsParams(
                ruleId,
                endTime,
                limit,
                offset,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> ruleId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endTime?.let { put("end_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                limit?.let { put("limit", it.toString()) }
                offset?.let { put("offset", it.toString()) }
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

        return other is RuleRetrieveLogsParams &&
            ruleId == other.ruleId &&
            endTime == other.endTime &&
            limit == other.limit &&
            offset == other.offset &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            ruleId,
            endTime,
            limit,
            offset,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "RuleRetrieveLogsParams{ruleId=$ruleId, endTime=$endTime, limit=$limit, offset=$offset, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
