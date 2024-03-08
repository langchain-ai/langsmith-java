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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** AnnotationQueueRun schema. */
@JsonDeserialize(builder = AnnotationQueueRunSchema.Builder::class)
@NoAutoDetect
class AnnotationQueueRunSchema
private constructor(
    private val runId: JsonField<String>,
    private val queueId: JsonField<String>,
    private val lastReviewedTime: JsonField<OffsetDateTime>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun runId(): String = runId.getRequired("run_id")

    fun queueId(): String = queueId.getRequired("queue_id")

    fun lastReviewedTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastReviewedTime.getNullable("last_reviewed_time"))

    fun addedAt(): Optional<OffsetDateTime> = Optional.ofNullable(addedAt.getNullable("added_at"))

    fun id(): String = id.getRequired("id")

    @JsonProperty("run_id") @ExcludeMissing fun _runId() = runId

    @JsonProperty("queue_id") @ExcludeMissing fun _queueId() = queueId

    @JsonProperty("last_reviewed_time") @ExcludeMissing fun _lastReviewedTime() = lastReviewedTime

    @JsonProperty("added_at") @ExcludeMissing fun _addedAt() = addedAt

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AnnotationQueueRunSchema = apply {
        if (!validated) {
            runId()
            queueId()
            lastReviewedTime()
            addedAt()
            id()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRunSchema &&
            this.runId == other.runId &&
            this.queueId == other.queueId &&
            this.lastReviewedTime == other.lastReviewedTime &&
            this.addedAt == other.addedAt &&
            this.id == other.id &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    runId,
                    queueId,
                    lastReviewedTime,
                    addedAt,
                    id,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AnnotationQueueRunSchema{runId=$runId, queueId=$queueId, lastReviewedTime=$lastReviewedTime, addedAt=$addedAt, id=$id, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var runId: JsonField<String> = JsonMissing.of()
        private var queueId: JsonField<String> = JsonMissing.of()
        private var lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRunSchema: AnnotationQueueRunSchema) = apply {
            this.runId = annotationQueueRunSchema.runId
            this.queueId = annotationQueueRunSchema.queueId
            this.lastReviewedTime = annotationQueueRunSchema.lastReviewedTime
            this.addedAt = annotationQueueRunSchema.addedAt
            this.id = annotationQueueRunSchema.id
            additionalProperties(annotationQueueRunSchema.additionalProperties)
        }

        fun runId(runId: String) = runId(JsonField.of(runId))

        @JsonProperty("run_id")
        @ExcludeMissing
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun queueId(queueId: String) = queueId(JsonField.of(queueId))

        @JsonProperty("queue_id")
        @ExcludeMissing
        fun queueId(queueId: JsonField<String>) = apply { this.queueId = queueId }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime) =
            lastReviewedTime(JsonField.of(lastReviewedTime))

        @JsonProperty("last_reviewed_time")
        @ExcludeMissing
        fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) = apply {
            this.lastReviewedTime = lastReviewedTime
        }

        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        @JsonProperty("added_at")
        @ExcludeMissing
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

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

        fun build(): AnnotationQueueRunSchema =
            AnnotationQueueRunSchema(
                runId,
                queueId,
                lastReviewedTime,
                addedAt,
                id,
                additionalProperties.toUnmodifiable(),
            )
    }
}
