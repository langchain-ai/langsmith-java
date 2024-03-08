// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class AnnotationQueueRunUpdateParams
constructor(
    private val queueId: String,
    private val queueRunId: String,
    private val addedAt: OffsetDateTime?,
    private val lastReviewedTime: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun queueId(): String = queueId

    fun queueRunId(): String = queueRunId

    fun addedAt(): Optional<OffsetDateTime> = Optional.ofNullable(addedAt)

    fun lastReviewedTime(): Optional<OffsetDateTime> = Optional.ofNullable(lastReviewedTime)

    @JvmSynthetic
    internal fun getBody(): AnnotationQueueRunUpdateBody {
        return AnnotationQueueRunUpdateBody(
            addedAt,
            lastReviewedTime,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> queueId
            1 -> queueRunId
            else -> ""
        }
    }

    @JsonDeserialize(builder = AnnotationQueueRunUpdateBody.Builder::class)
    @NoAutoDetect
    class AnnotationQueueRunUpdateBody
    internal constructor(
        private val addedAt: OffsetDateTime?,
        private val lastReviewedTime: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("added_at") fun addedAt(): OffsetDateTime? = addedAt

        @JsonProperty("last_reviewed_time")
        fun lastReviewedTime(): OffsetDateTime? = lastReviewedTime

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnnotationQueueRunUpdateBody &&
                this.addedAt == other.addedAt &&
                this.lastReviewedTime == other.lastReviewedTime &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        addedAt,
                        lastReviewedTime,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AnnotationQueueRunUpdateBody{addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var addedAt: OffsetDateTime? = null
            private var lastReviewedTime: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(annotationQueueRunUpdateBody: AnnotationQueueRunUpdateBody) = apply {
                this.addedAt = annotationQueueRunUpdateBody.addedAt
                this.lastReviewedTime = annotationQueueRunUpdateBody.lastReviewedTime
                additionalProperties(annotationQueueRunUpdateBody.additionalProperties)
            }

            @JsonProperty("added_at")
            fun addedAt(addedAt: OffsetDateTime) = apply { this.addedAt = addedAt }

            @JsonProperty("last_reviewed_time")
            fun lastReviewedTime(lastReviewedTime: OffsetDateTime) = apply {
                this.lastReviewedTime = lastReviewedTime
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): AnnotationQueueRunUpdateBody =
                AnnotationQueueRunUpdateBody(
                    addedAt,
                    lastReviewedTime,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRunUpdateParams &&
            this.queueId == other.queueId &&
            this.queueRunId == other.queueRunId &&
            this.addedAt == other.addedAt &&
            this.lastReviewedTime == other.lastReviewedTime &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            queueId,
            queueRunId,
            addedAt,
            lastReviewedTime,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AnnotationQueueRunUpdateParams{queueId=$queueId, queueRunId=$queueRunId, addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var queueId: String? = null
        private var queueRunId: String? = null
        private var addedAt: OffsetDateTime? = null
        private var lastReviewedTime: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRunUpdateParams: AnnotationQueueRunUpdateParams) = apply {
            this.queueId = annotationQueueRunUpdateParams.queueId
            this.queueRunId = annotationQueueRunUpdateParams.queueRunId
            this.addedAt = annotationQueueRunUpdateParams.addedAt
            this.lastReviewedTime = annotationQueueRunUpdateParams.lastReviewedTime
            additionalQueryParams(annotationQueueRunUpdateParams.additionalQueryParams)
            additionalHeaders(annotationQueueRunUpdateParams.additionalHeaders)
            additionalBodyProperties(annotationQueueRunUpdateParams.additionalBodyProperties)
        }

        fun queueId(queueId: String) = apply { this.queueId = queueId }

        fun queueRunId(queueRunId: String) = apply { this.queueRunId = queueRunId }

        fun addedAt(addedAt: OffsetDateTime) = apply { this.addedAt = addedAt }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime) = apply {
            this.lastReviewedTime = lastReviewedTime
        }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AnnotationQueueRunUpdateParams =
            AnnotationQueueRunUpdateParams(
                checkNotNull(queueId) { "`queueId` is required but was not set" },
                checkNotNull(queueRunId) { "`queueRunId` is required but was not set" },
                addedAt,
                lastReviewedTime,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
