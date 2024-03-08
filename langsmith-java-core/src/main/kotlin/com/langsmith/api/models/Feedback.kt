// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith.api.core.BaseDeserializer
import com.langsmith.api.core.BaseSerializer
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.getOrThrow
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** Schema for getting feedback. */
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@JsonDeserialize(builder = Feedback.Builder::class)
@NoAutoDetect
class Feedback
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val createdAt:
        JsonField<OffsetDateTime>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val runId: JsonField<String>,
    private val key: JsonField<String>,
    private val score: JsonField<Score>,
    private val value: JsonField<Value>,
    private val comment: JsonField<String>,
    private val correction: JsonValue,
    private val id: JsonField<String>,
    private val feedbackSource: JsonField<FeedbackSource>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun modifiedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(modifiedAt.getNullable("modified_at"))

    fun runId(): String = runId.getRequired("run_id")

    fun key(): String = key.getRequired("key")

    fun score(): Optional<Score> = Optional.ofNullable(score.getNullable("score"))

    fun value(): Optional<Value> = Optional.ofNullable(value.getNullable("value"))

    fun comment(): Optional<String> = Optional.ofNullable(comment.getNullable("comment"))

    fun id(): String = id.getRequired("id")

    /** The feedback source loaded from the database. */
    fun feedbackSource(): Optional<FeedbackSource> =
        Optional.ofNullable(feedbackSource.getNullable("feedback_source"))

    @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _modifiedAt() = modifiedAt

    @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _runId() = runId

    @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _key() = key

    @JsonProperty("score") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _score() = score

    @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _value() = value

    @JsonProperty("comment") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _comment() = comment

    @JsonProperty("correction") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _correction() = correction

    @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _id() = id

    /** The feedback source loaded from the database. */
    @JsonProperty("feedback_source") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _feedbackSource() = feedbackSource

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Feedback = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            createdAt() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            modifiedAt()
            runId()
            key()
            score()
            value()
            comment()
            id()
            feedbackSource().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is Feedback && // templates/JavaSDK/entities/fields.ts:143:33
            this.createdAt == other.createdAt &&
            this.modifiedAt == other.modifiedAt &&
            this.runId == other.runId &&
            this.key == other.key &&
            this.score == other.score &&
            this.value == other.value &&
            this.comment == other.comment &&
            this.correction == other.correction &&
            this.id == other.id &&
            this.feedbackSource == other.feedbackSource &&
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
                    createdAt, // templates/JavaSDK/entities/fields.ts:163:19
                    modifiedAt,
                    runId,
                    key,
                    score,
                    value,
                    comment,
                    correction,
                    id,
                    feedbackSource,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Feedback{createdAt=$createdAt, modifiedAt=$modifiedAt, runId=$runId, key=$key, score=$score, value=$value, comment=$comment, correction=$correction, id=$id, feedbackSource=$feedbackSource, additionalProperties=$additionalProperties}"

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var createdAt: JsonField<OffsetDateTime> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var runId: JsonField<String> = JsonMissing.of()
        private var key: JsonField<String> = JsonMissing.of()
        private var score: JsonField<Score> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var comment: JsonField<String> = JsonMissing.of()
        private var correction: JsonValue = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var feedbackSource: JsonField<FeedbackSource> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(feedback: Feedback) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.createdAt =
                    feedback.createdAt // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.modifiedAt = feedback.modifiedAt
                this.runId = feedback.runId
                this.key = feedback.key
                this.score = feedback.score
                this.value = feedback.value
                this.comment = feedback.comment
                this.correction = feedback.correction
                this.id = feedback.id
                this.feedbackSource = feedback.feedbackSource
                additionalProperties(feedback.additionalProperties)
            }

        fun createdAt(createdAt: OffsetDateTime) =
            createdAt(JsonField.of(createdAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.createdAt = createdAt
            }

        fun modifiedAt(modifiedAt: OffsetDateTime) =
            modifiedAt(JsonField.of(modifiedAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.modifiedAt = modifiedAt
            }

        fun runId(runId: String) =
            runId(JsonField.of(runId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun runId(runId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runId = runId
            }

        fun key(key: String) =
            key(JsonField.of(key)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun key(key: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.key = key
        }

        fun score(score: Score) =
            score(JsonField.of(score)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("score") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun score(score: JsonField<Score>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.score = score
        }

        fun value(value: Value) =
            value(JsonField.of(value)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun value(value: JsonField<Value>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.value = value
        }

        fun comment(comment: String) =
            comment(JsonField.of(comment)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("comment") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun comment(comment: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.comment = comment
            }

        @JsonProperty("correction") // templates/JavaSDK/entities/objects.ts:264:20 //
        // templates/JavaSDK/entities/objects.ts:252:20
        @ExcludeMissing
        fun correction(correction: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.correction = correction
            }

        fun id(id: String) = id(JsonField.of(id)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply { // templates/JavaSDK/entities/objects.ts:275:36
            this.id = id
        }

        /** The feedback source loaded from the database. */
        // templates/JavaSDK/entities/objects.ts:252:20
        fun feedbackSource(feedbackSource: FeedbackSource) =
            feedbackSource(JsonField.of(feedbackSource))

        /** The feedback source loaded from the database. */
        @JsonProperty("feedback_source") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun feedbackSource(feedbackSource: JsonField<FeedbackSource>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.feedbackSource = feedbackSource
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

        fun build(): Feedback =
            Feedback( // templates/JavaSDK/entities/objects.ts:326:30
                createdAt, // templates/JavaSDK/entities/objects.ts:326:30
                modifiedAt,
                runId,
                key,
                score,
                value,
                comment,
                correction,
                id,
                feedbackSource,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The feedback source loaded from the database. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = FeedbackSource.Builder::class)
    @NoAutoDetect
    class FeedbackSource
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val type: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val metadata: JsonValue,
        private val userId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        private var hashCode: Int = 0

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _type() = type

        @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _metadata() = metadata

        @JsonProperty("user_id") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _userId() = userId

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackSource = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                type() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
                userId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is FeedbackSource && // templates/JavaSDK/entities/fields.ts:143:33
                this.type == other.type &&
                this.metadata == other.metadata &&
                this.userId == other.userId &&
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
                        type, // templates/JavaSDK/entities/fields.ts:163:19
                        metadata,
                        userId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackSource{type=$type, metadata=$metadata, userId=$userId, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var type: JsonField<String> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var metadata: JsonValue = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackSource: FeedbackSource) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.type =
                        feedbackSource.type // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.metadata = feedbackSource.metadata
                    this.userId = feedbackSource.userId
                    additionalProperties(feedbackSource.additionalProperties)
                }

            fun type(type: String) =
                type(JsonField.of(type)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun type(type: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.type = type
                }

            @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            @ExcludeMissing
            fun metadata(metadata: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.metadata = metadata
                }

            fun userId(userId: String) =
                userId(JsonField.of(userId)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("user_id") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun userId(userId: JsonField<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.userId = userId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
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

            fun build(): FeedbackSource =
                FeedbackSource( // templates/JavaSDK/entities/objects.ts:326:30
                    type, // templates/JavaSDK/entities/objects.ts:326:30
                    metadata,
                    userId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(
        using = Score.Deserializer::class
    ) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

        fun double(): Optional<Double> =
            Optional.ofNullable(double) // templates/JavaSDK/entities/unions.ts:89:12 //
        // templates/JavaSDK/entities/unions.ts:89:12

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun isDouble(): Boolean = double != null // templates/JavaSDK/entities/unions.ts:104:12 //
        // templates/JavaSDK/entities/unions.ts:104:12

        fun isBoolean(): Boolean = boolean != null

        fun asDouble(): Double =
            double.getOrThrow("double") // templates/JavaSDK/entities/unions.ts:113:12 //
        // templates/JavaSDK/entities/unions.ts:113:12

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
            return when { // templates/JavaSDK/entities/unions.ts:134:30
                double != null ->
                    visitor.visitDouble(double) // templates/JavaSDK/entities/unions.ts:134:30 //
                // templates/JavaSDK/entities/unions.ts:134:30
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Score = apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    double == null && boolean == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown Score: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Score && // templates/JavaSDK/entities/fields.ts:143:33
                this.double == other.double &&
                this.boolean == other.boolean
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            return Objects.hash(double, boolean)
        }

        override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
            return when { // templates/JavaSDK/entities/unions.ts:188:16
                double != null ->
                    "Score{double=$double}" // templates/JavaSDK/entities/unions.ts:188:16 //
                // templates/JavaSDK/entities/unions.ts:188:16
                boolean != null -> "Score{boolean=$boolean}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }
        }

        companion object { // templates/JavaSDK/entities/unions.ts:201:10

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
            // templates/JavaSDK/entities/unions.ts:201:10
            fun ofDouble(double: Double) = Score(double = double)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofBoolean(boolean: Boolean) = Score(boolean = boolean)
        }

        interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10

            fun visitDouble(double: Double): T // templates/JavaSDK/entities/unions.ts:211:10

            fun visitBoolean(boolean: Boolean): T

            fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
                throw LangSmithInvalidDataException("Unknown Score: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<Score>(
                Score::class
            ) { // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): Score { // templates/JavaSDK/entities/unions.ts:244:14 //
                // templates/JavaSDK/entities/unions.ts:240:10
                val json =
                    JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:250:28
                tryDeserialize(node, jacksonTypeRef<Double>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Score(double = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Boolean>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Score(boolean = it, _json = json)
                    }

                return Score(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<Score>(Score::class) { // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) { // templates/JavaSDK/entities/unions.ts:273:14 //
                // templates/JavaSDK/entities/unions.ts:269:10
                when { // templates/JavaSDK/entities/unions.ts:278:24
                    value.double != null ->
                        generator.writeObject(
                            value.double
                        ) // templates/JavaSDK/entities/unions.ts:278:24 //
                    // templates/JavaSDK/entities/unions.ts:278:24
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Score")
                }
            }
        }
    }

    @JsonDeserialize(
        using = Value.Deserializer::class
    ) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor( // templates/JavaSDK/entities/unions.ts:68:13
        private val double: Double? = null, // templates/JavaSDK/entities/unions.ts:68:13 //
        // templates/JavaSDK/entities/unions.ts:68:13
        private val boolean: Boolean? = null,
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

        fun double(): Optional<Double> =
            Optional.ofNullable(double) // templates/JavaSDK/entities/unions.ts:89:12 //
        // templates/JavaSDK/entities/unions.ts:89:12

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isDouble(): Boolean = double != null // templates/JavaSDK/entities/unions.ts:104:12 //
        // templates/JavaSDK/entities/unions.ts:104:12

        fun isBoolean(): Boolean = boolean != null

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asDouble(): Double =
            double.getOrThrow("double") // templates/JavaSDK/entities/unions.ts:113:12 //
        // templates/JavaSDK/entities/unions.ts:113:12

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
            return when { // templates/JavaSDK/entities/unions.ts:134:30
                double != null ->
                    visitor.visitDouble(double) // templates/JavaSDK/entities/unions.ts:134:30 //
                // templates/JavaSDK/entities/unions.ts:134:30
                boolean != null -> visitor.visitBoolean(boolean)
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Value = apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    double == null && boolean == null && string == null && jsonValue == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown Value: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Value && // templates/JavaSDK/entities/fields.ts:143:33
                this.double == other.double &&
                this.boolean == other.boolean &&
                this.string == other.string &&
                this.jsonValue == other.jsonValue
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                // templates/JavaSDK/entities/fields.ts:181:14
                double, // templates/JavaSDK/entities/fields.ts:163:19
                boolean,
                string,
                jsonValue,
            )
        }

        override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
            return when { // templates/JavaSDK/entities/unions.ts:188:16
                double != null ->
                    "Value{double=$double}" // templates/JavaSDK/entities/unions.ts:188:16 //
                // templates/JavaSDK/entities/unions.ts:188:16
                boolean != null -> "Value{boolean=$boolean}"
                string != null -> "Value{string=$string}"
                jsonValue != null -> "Value{jsonValue=$jsonValue}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }
        }

        companion object { // templates/JavaSDK/entities/unions.ts:201:10

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
            // templates/JavaSDK/entities/unions.ts:201:10
            fun ofDouble(double: Double) = Value(double = double)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofString(string: String) = Value(string = string)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofJsonValue(jsonValue: JsonValue) = Value(jsonValue = jsonValue)
        }

        interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10

            fun visitDouble(double: Double): T // templates/JavaSDK/entities/unions.ts:211:10

            fun visitBoolean(boolean: Boolean): T

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
                throw LangSmithInvalidDataException("Unknown Value: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<Value>(
                Value::class
            ) { // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): Value { // templates/JavaSDK/entities/unions.ts:244:14 //
                // templates/JavaSDK/entities/unions.ts:240:10
                val json =
                    JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:250:28
                tryDeserialize(node, jacksonTypeRef<Double>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(double = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Boolean>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(boolean = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<String>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(string = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(jsonValue = it, _json = json)
                    }

                return Value(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<Value>(Value::class) { // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) { // templates/JavaSDK/entities/unions.ts:273:14 //
                // templates/JavaSDK/entities/unions.ts:269:10
                when { // templates/JavaSDK/entities/unions.ts:278:24
                    value.double != null ->
                        generator.writeObject(
                            value.double
                        ) // templates/JavaSDK/entities/unions.ts:278:24 //
                    // templates/JavaSDK/entities/unions.ts:278:24
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }
}
