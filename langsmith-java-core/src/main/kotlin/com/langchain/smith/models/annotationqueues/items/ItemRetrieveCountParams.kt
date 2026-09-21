// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns the number of annotation queue items in one status bucket. The two time windows are
 * independent: start_time/end_time bound when an item was archived, min_start_time/max_start_time
 * bound when its trace ran. Items with no trace start time are excluded when either of the latter
 * is set.
 */
class ItemRetrieveCountParams
private constructor(
    private val queueId: String?,
    private val status: String,
    private val endTime: String?,
    private val maxStartTime: OffsetDateTime?,
    private val minStartTime: OffsetDateTime?,
    private val startTime: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun queueId(): Optional<String> = Optional.ofNullable(queueId)

    /** Count bucket: all, needs_my_review, needs_others_review, or archived. */
    fun status(): String = status

    /** Archived strictly before this time. Only used when status=archived */
    fun endTime(): Optional<String> = Optional.ofNullable(endTime)

    /** Trace started at or before this time */
    fun maxStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(maxStartTime)

    /** Trace started at or after this time */
    fun minStartTime(): Optional<OffsetDateTime> = Optional.ofNullable(minStartTime)

    /** Archived strictly after this time. Only used when status=archived */
    fun startTime(): Optional<String> = Optional.ofNullable(startTime)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ItemRetrieveCountParams].
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemRetrieveCountParams]. */
    class Builder internal constructor() {

        private var queueId: String? = null
        private var status: String? = null
        private var endTime: String? = null
        private var maxStartTime: OffsetDateTime? = null
        private var minStartTime: OffsetDateTime? = null
        private var startTime: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(itemRetrieveCountParams: ItemRetrieveCountParams) = apply {
            queueId = itemRetrieveCountParams.queueId
            status = itemRetrieveCountParams.status
            endTime = itemRetrieveCountParams.endTime
            maxStartTime = itemRetrieveCountParams.maxStartTime
            minStartTime = itemRetrieveCountParams.minStartTime
            startTime = itemRetrieveCountParams.startTime
            additionalHeaders = itemRetrieveCountParams.additionalHeaders.toBuilder()
            additionalQueryParams = itemRetrieveCountParams.additionalQueryParams.toBuilder()
        }

        fun queueId(queueId: String?) = apply { this.queueId = queueId }

        /** Alias for calling [Builder.queueId] with `queueId.orElse(null)`. */
        fun queueId(queueId: Optional<String>) = queueId(queueId.getOrNull())

        /** Count bucket: all, needs_my_review, needs_others_review, or archived. */
        fun status(status: String) = apply { this.status = status }

        /** Archived strictly before this time. Only used when status=archived */
        fun endTime(endTime: String?) = apply { this.endTime = endTime }

        /** Alias for calling [Builder.endTime] with `endTime.orElse(null)`. */
        fun endTime(endTime: Optional<String>) = endTime(endTime.getOrNull())

        /** Trace started at or before this time */
        fun maxStartTime(maxStartTime: OffsetDateTime?) = apply { this.maxStartTime = maxStartTime }

        /** Alias for calling [Builder.maxStartTime] with `maxStartTime.orElse(null)`. */
        fun maxStartTime(maxStartTime: Optional<OffsetDateTime>) =
            maxStartTime(maxStartTime.getOrNull())

        /** Trace started at or after this time */
        fun minStartTime(minStartTime: OffsetDateTime?) = apply { this.minStartTime = minStartTime }

        /** Alias for calling [Builder.minStartTime] with `minStartTime.orElse(null)`. */
        fun minStartTime(minStartTime: Optional<OffsetDateTime>) =
            minStartTime(minStartTime.getOrNull())

        /** Archived strictly after this time. Only used when status=archived */
        fun startTime(startTime: String?) = apply { this.startTime = startTime }

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<String>) = startTime(startTime.getOrNull())

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
         * Returns an immutable instance of [ItemRetrieveCountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ItemRetrieveCountParams =
            ItemRetrieveCountParams(
                queueId,
                checkRequired("status", status),
                endTime,
                maxStartTime,
                minStartTime,
                startTime,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> queueId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("status", status)
                endTime?.let { put("end_time", it) }
                maxStartTime?.let {
                    put("max_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                minStartTime?.let {
                    put("min_start_time", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                startTime?.let { put("start_time", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemRetrieveCountParams &&
            queueId == other.queueId &&
            status == other.status &&
            endTime == other.endTime &&
            maxStartTime == other.maxStartTime &&
            minStartTime == other.minStartTime &&
            startTime == other.startTime &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            queueId,
            status,
            endTime,
            maxStartTime,
            minStartTime,
            startTime,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "ItemRetrieveCountParams{queueId=$queueId, status=$status, endTime=$endTime, maxStartTime=$maxStartTime, minStartTime=$minStartTime, startTime=$startTime, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
