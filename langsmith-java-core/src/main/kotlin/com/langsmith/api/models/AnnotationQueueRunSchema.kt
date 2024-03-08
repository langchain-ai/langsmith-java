// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = AnnotationQueueRunSchema.Builder::class)
@NoAutoDetect
class AnnotationQueueRunSchema
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val runId: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val queueId: JsonField<String>,
    private val lastReviewedTime: JsonField<OffsetDateTime>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun runId(): String = runId.getRequired("run_id")

    fun queueId(): String = queueId.getRequired("queue_id")

    fun lastReviewedTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(lastReviewedTime.getNullable("last_reviewed_time"))

    fun addedAt(): Optional<OffsetDateTime> = Optional.ofNullable(addedAt.getNullable("added_at"))

    fun id(): String = id.getRequired("id")

    @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _runId() = runId

    @JsonProperty("queue_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _queueId() = queueId

    @JsonProperty("last_reviewed_time") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _lastReviewedTime() = lastReviewedTime

    @JsonProperty("added_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _addedAt() = addedAt

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AnnotationQueueRunSchema =
        apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                runId() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
                queueId()
                lastReviewedTime()
                addedAt()
                id()
                validated = true
            }
        }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is AnnotationQueueRunSchema && // templates/JavaSDK/entities/fields.ts:143:33
            this.runId == other.runId &&
            this.queueId == other.queueId &&
            this.lastReviewedTime == other.lastReviewedTime &&
            this.addedAt == other.addedAt &&
            this.id == other.id &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    runId, // templates/JavaSDK/entities/fields.ts:163:19
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

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var runId: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var queueId: JsonField<String> = JsonMissing.of()
        private var lastReviewedTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var addedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(annotationQueueRunSchema: AnnotationQueueRunSchema) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.runId =
                    annotationQueueRunSchema
                        .runId // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.queueId = annotationQueueRunSchema.queueId
                this.lastReviewedTime = annotationQueueRunSchema.lastReviewedTime
                this.addedAt = annotationQueueRunSchema.addedAt
                this.id = annotationQueueRunSchema.id
                additionalProperties(annotationQueueRunSchema.additionalProperties)
            }

        fun runId(runId: String) =
            runId(JsonField.of(runId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun runId(runId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runId = runId
            }

        fun queueId(queueId: String) =
            queueId(JsonField.of(queueId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("queue_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun queueId(queueId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.queueId = queueId
            }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime) =
            lastReviewedTime(
                JsonField.of(lastReviewedTime)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("last_reviewed_time") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun lastReviewedTime(lastReviewedTime: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.lastReviewedTime = lastReviewedTime
            }

        fun addedAt(addedAt: OffsetDateTime) =
            addedAt(JsonField.of(addedAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("added_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun addedAt(addedAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.addedAt = addedAt
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): AnnotationQueueRunSchema =
            AnnotationQueueRunSchema( // templates/JavaSDK/entities/objects.ts:326:30
                runId, // templates/JavaSDK/entities/objects.ts:326:30
                queueId,
                lastReviewedTime,
                addedAt,
                id,
                additionalProperties.toUnmodifiable(),
            )
    }
}
