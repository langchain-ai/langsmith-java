// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects

class AnnotationQueueRunCreateParams
constructor(
    private val queueId: String,
    private val body: List<String>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun queueId(): String = queueId

    fun body(): List<String> = body

    @JvmSynthetic
    internal fun getBody(): List<String> {
        return body
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> queueId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AnnotationQueueRunCreateBody.Builder::class)
    @NoAutoDetect
    class AnnotationQueueRunCreateBody
    internal constructor(
        private val body: List<String>?,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("body") fun body(): List<String>? = body

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnnotationQueueRunCreateBody && this.body == other.body
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(body)
            }
            return hashCode
        }

        override fun toString() = "AnnotationQueueRunCreateBody{body=$body}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var body: List<String>? = null

            @JvmSynthetic
            internal fun from(annotationQueueRunCreateBody: AnnotationQueueRunCreateBody) = apply {
                this.body = annotationQueueRunCreateBody.body
            }

            @JsonProperty("body") fun body(body: List<String>) = apply { this.body = body }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRunCreateParams &&
            this.queueId == other.queueId &&
            this.body == other.body &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            queueId,
            body,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "AnnotationQueueRunCreateParams{queueId=$queueId, body=$body, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var queueId: String? = null
        private var body: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRunCreateParams: AnnotationQueueRunCreateParams) = apply {
            this.queueId = annotationQueueRunCreateParams.queueId
            this.body(annotationQueueRunCreateParams.body)
            additionalQueryParams(annotationQueueRunCreateParams.additionalQueryParams)
            additionalHeaders(annotationQueueRunCreateParams.additionalHeaders)
        }

        fun queueId(queueId: String) = apply { this.queueId = queueId }

        fun body(body: List<String>) = apply {
            this.body.clear()
            this.body.addAll(body)
        }

        fun addBody(body: String) = apply { this.body.add(body) }

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

        fun build(): AnnotationQueueRunCreateParams =
            AnnotationQueueRunCreateParams(
                checkNotNull(queueId) { "`queueId` is required but was not set" },
                checkNotNull(body) { "`body` is required but was not set" }.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
