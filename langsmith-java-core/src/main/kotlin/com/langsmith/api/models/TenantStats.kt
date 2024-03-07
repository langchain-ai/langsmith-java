// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import java.util.Objects

/** Stats for a tenant. */
@JsonDeserialize(builder = TenantStats.Builder::class)
@NoAutoDetect
class TenantStats
private constructor(
    private val tenantId: JsonField<String>,
    private val datasetCount: JsonField<Long>,
    private val tracerSessionCount: JsonField<Long>,
    private val repoCount: JsonField<Long>,
    private val annotationQueueCount: JsonField<Long>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun datasetCount(): Long = datasetCount.getRequired("dataset_count")

    fun tracerSessionCount(): Long = tracerSessionCount.getRequired("tracer_session_count")

    fun repoCount(): Long = repoCount.getRequired("repo_count")

    fun annotationQueueCount(): Long = annotationQueueCount.getRequired("annotation_queue_count")

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("dataset_count") @ExcludeMissing fun _datasetCount() = datasetCount

    @JsonProperty("tracer_session_count")
    @ExcludeMissing
    fun _tracerSessionCount() = tracerSessionCount

    @JsonProperty("repo_count") @ExcludeMissing fun _repoCount() = repoCount

    @JsonProperty("annotation_queue_count")
    @ExcludeMissing
    fun _annotationQueueCount() = annotationQueueCount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): TenantStats = apply {
        if (!validated) {
            tenantId()
            datasetCount()
            tracerSessionCount()
            repoCount()
            annotationQueueCount()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TenantStats &&
            this.tenantId == other.tenantId &&
            this.datasetCount == other.datasetCount &&
            this.tracerSessionCount == other.tracerSessionCount &&
            this.repoCount == other.repoCount &&
            this.annotationQueueCount == other.annotationQueueCount &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    tenantId,
                    datasetCount,
                    tracerSessionCount,
                    repoCount,
                    annotationQueueCount,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "TenantStats{tenantId=$tenantId, datasetCount=$datasetCount, tracerSessionCount=$tracerSessionCount, repoCount=$repoCount, annotationQueueCount=$annotationQueueCount, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var tenantId: JsonField<String> = JsonMissing.of()
        private var datasetCount: JsonField<Long> = JsonMissing.of()
        private var tracerSessionCount: JsonField<Long> = JsonMissing.of()
        private var repoCount: JsonField<Long> = JsonMissing.of()
        private var annotationQueueCount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tenantStats: TenantStats) = apply {
            this.tenantId = tenantStats.tenantId
            this.datasetCount = tenantStats.datasetCount
            this.tracerSessionCount = tenantStats.tracerSessionCount
            this.repoCount = tenantStats.repoCount
            this.annotationQueueCount = tenantStats.annotationQueueCount
            additionalProperties(tenantStats.additionalProperties)
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun datasetCount(datasetCount: Long) = datasetCount(JsonField.of(datasetCount))

        @JsonProperty("dataset_count")
        @ExcludeMissing
        fun datasetCount(datasetCount: JsonField<Long>) = apply { this.datasetCount = datasetCount }

        fun tracerSessionCount(tracerSessionCount: Long) =
            tracerSessionCount(JsonField.of(tracerSessionCount))

        @JsonProperty("tracer_session_count")
        @ExcludeMissing
        fun tracerSessionCount(tracerSessionCount: JsonField<Long>) = apply {
            this.tracerSessionCount = tracerSessionCount
        }

        fun repoCount(repoCount: Long) = repoCount(JsonField.of(repoCount))

        @JsonProperty("repo_count")
        @ExcludeMissing
        fun repoCount(repoCount: JsonField<Long>) = apply { this.repoCount = repoCount }

        fun annotationQueueCount(annotationQueueCount: Long) =
            annotationQueueCount(JsonField.of(annotationQueueCount))

        @JsonProperty("annotation_queue_count")
        @ExcludeMissing
        fun annotationQueueCount(annotationQueueCount: JsonField<Long>) = apply {
            this.annotationQueueCount = annotationQueueCount
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

        fun build(): TenantStats =
            TenantStats(
                tenantId,
                datasetCount,
                tracerSessionCount,
                repoCount,
                annotationQueueCount,
                additionalProperties.toUnmodifiable(),
            )
    }
}
