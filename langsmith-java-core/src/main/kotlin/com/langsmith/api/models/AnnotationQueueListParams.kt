// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class AnnotationQueueListParams
constructor(
    private val ids: List<String>?,
    private val limit: Long?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.ids?.let { params.put("ids", listOf(it.joinToString(separator = ","))) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.name?.let { params.put("name", listOf(it.toString())) }
        this.nameContains?.let { params.put("name_contains", listOf(it.toString())) }
        this.offset?.let { params.put("offset", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueListParams &&
            this.ids == other.ids &&
            this.limit == other.limit &&
            this.name == other.name &&
            this.nameContains == other.nameContains &&
            this.offset == other.offset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            ids,
            limit,
            name,
            nameContains,
            offset,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AnnotationQueueListParams{ids=$ids, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var ids: MutableList<String> = mutableListOf()
        private var limit: Long? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueListParams: AnnotationQueueListParams) = apply {
            this.ids(annotationQueueListParams.ids ?: listOf())
            this.limit = annotationQueueListParams.limit
            this.name = annotationQueueListParams.name
            this.nameContains = annotationQueueListParams.nameContains
            this.offset = annotationQueueListParams.offset
            additionalQueryParams(annotationQueueListParams.additionalQueryParams)
            additionalHeaders(annotationQueueListParams.additionalHeaders)
        }

        fun ids(ids: List<String>) = apply {
            this.ids.clear()
            this.ids.addAll(ids)
        }

        fun addId(id: String) = apply { this.ids.add(id) }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun name(name: String) = apply { this.name = name }

        fun nameContains(nameContains: String) = apply { this.nameContains = nameContains }

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

        fun build(): AnnotationQueueListParams =
            AnnotationQueueListParams(
                if (ids.size == 0) null else ids.toUnmodifiable(),
                limit,
                name,
                nameContains,
                offset,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
