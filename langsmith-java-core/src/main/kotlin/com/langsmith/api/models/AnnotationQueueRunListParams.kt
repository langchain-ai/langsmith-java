// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class AnnotationQueueRunListParams
constructor(
    private val queueId: String,
    private val limit: Long?,
    private val offset: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun queueId(): String = queueId

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.offset?.let { params.put("offset", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> queueId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRunListParams &&
            this.queueId == other.queueId &&
            this.limit == other.limit &&
            this.offset == other.offset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            queueId,
            limit,
            offset,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AnnotationQueueRunListParams{queueId=$queueId, limit=$limit, offset=$offset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var queueId: String? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRunListParams: AnnotationQueueRunListParams) = apply {
            this.queueId = annotationQueueRunListParams.queueId
            this.limit = annotationQueueRunListParams.limit
            this.offset = annotationQueueRunListParams.offset
            additionalQueryParams(annotationQueueRunListParams.additionalQueryParams)
            additionalHeaders(annotationQueueRunListParams.additionalHeaders)
        }

        fun queueId(queueId: String) = apply { this.queueId = queueId }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun offset(offset: Long) = apply { this.offset = offset }

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

        fun build(): AnnotationQueueRunListParams =
            AnnotationQueueRunListParams(
                checkNotNull(queueId) { "`queueId` is required but was not set" },
                limit,
                offset,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
