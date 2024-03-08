// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
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
@JsonDeserialize(builder = FeedbackSchema.Builder::class)
@NoAutoDetect
class FeedbackSchema
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
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

    private var validated: Boolean = false

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

    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("modified_at") @ExcludeMissing fun _modifiedAt() = modifiedAt

    @JsonProperty("run_id") @ExcludeMissing fun _runId() = runId

    @JsonProperty("key") @ExcludeMissing fun _key() = key

    @JsonProperty("score") @ExcludeMissing fun _score() = score

    @JsonProperty("value") @ExcludeMissing fun _value() = value

    @JsonProperty("comment") @ExcludeMissing fun _comment() = comment

    @JsonProperty("correction") @ExcludeMissing fun _correction() = correction

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The feedback source loaded from the database. */
    @JsonProperty("feedback_source") @ExcludeMissing fun _feedbackSource() = feedbackSource

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FeedbackSchema = apply {
        if (!validated) {
            createdAt()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackSchema &&
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

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    createdAt,
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
        "FeedbackSchema{createdAt=$createdAt, modifiedAt=$modifiedAt, runId=$runId, key=$key, score=$score, value=$value, comment=$comment, correction=$correction, id=$id, feedbackSource=$feedbackSource, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
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

        @JvmSynthetic
        internal fun from(feedbackSchema: FeedbackSchema) = apply {
            this.createdAt = feedbackSchema.createdAt
            this.modifiedAt = feedbackSchema.modifiedAt
            this.runId = feedbackSchema.runId
            this.key = feedbackSchema.key
            this.score = feedbackSchema.score
            this.value = feedbackSchema.value
            this.comment = feedbackSchema.comment
            this.correction = feedbackSchema.correction
            this.id = feedbackSchema.id
            this.feedbackSource = feedbackSchema.feedbackSource
            additionalProperties(feedbackSchema.additionalProperties)
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

        @JsonProperty("modified_at")
        @ExcludeMissing
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
        }

        fun runId(runId: String) = runId(JsonField.of(runId))

        @JsonProperty("run_id")
        @ExcludeMissing
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun key(key: String) = key(JsonField.of(key))

        @JsonProperty("key")
        @ExcludeMissing
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun score(score: Score) = score(JsonField.of(score))

        @JsonProperty("score")
        @ExcludeMissing
        fun score(score: JsonField<Score>) = apply { this.score = score }

        fun value(value: Value) = value(JsonField.of(value))

        @JsonProperty("value")
        @ExcludeMissing
        fun value(value: JsonField<Value>) = apply { this.value = value }

        fun comment(comment: String) = comment(JsonField.of(comment))

        @JsonProperty("comment")
        @ExcludeMissing
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        @JsonProperty("correction")
        @ExcludeMissing
        fun correction(correction: JsonValue) = apply { this.correction = correction }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The feedback source loaded from the database. */
        fun feedbackSource(feedbackSource: FeedbackSource) =
            feedbackSource(JsonField.of(feedbackSource))

        /** The feedback source loaded from the database. */
        @JsonProperty("feedback_source")
        @ExcludeMissing
        fun feedbackSource(feedbackSource: JsonField<FeedbackSource>) = apply {
            this.feedbackSource = feedbackSource
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

        fun build(): FeedbackSchema =
            FeedbackSchema(
                createdAt,
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
    @JsonDeserialize(builder = FeedbackSource.Builder::class)
    @NoAutoDetect
    class FeedbackSource
    private constructor(
        private val type: JsonField<String>,
        private val metadata: JsonValue,
        private val userId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

        fun userId(): Optional<String> = Optional.ofNullable(userId.getNullable("user_id"))

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        @JsonProperty("user_id") @ExcludeMissing fun _userId() = userId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackSource = apply {
            if (!validated) {
                type()
                userId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackSource &&
                this.type == other.type &&
                this.metadata == other.metadata &&
                this.userId == other.userId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        metadata,
                        userId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackSource{type=$type, metadata=$metadata, userId=$userId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackSource: FeedbackSource) = apply {
                this.type = feedbackSource.type
                this.metadata = feedbackSource.metadata
                this.userId = feedbackSource.userId
                additionalProperties(feedbackSource.additionalProperties)
            }

            fun type(type: String) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun userId(userId: String) = userId(JsonField.of(userId))

            @JsonProperty("user_id")
            @ExcludeMissing
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

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

            fun build(): FeedbackSource =
                FeedbackSource(
                    type,
                    metadata,
                    userId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    @JsonDeserialize(using = Score.Deserializer::class)
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun double(): Optional<Double> = Optional.ofNullable(double)

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Score = apply {
            if (!validated) {
                if (double == null && boolean == null) {
                    throw LangSmithInvalidDataException("Unknown Score: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Score && this.double == other.double && this.boolean == other.boolean
        }

        override fun hashCode(): Int {
            return Objects.hash(double, boolean)
        }

        override fun toString(): String {
            return when {
                double != null -> "Score{double=$double}"
                boolean != null -> "Score{boolean=$boolean}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }
        }

        companion object {

            @JvmStatic fun ofDouble(double: Double) = Score(double = double)

            @JvmStatic fun ofBoolean(boolean: Boolean) = Score(boolean = boolean)
        }

        interface Visitor<out T> {

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            fun unknown(json: JsonValue?): T {
                throw LangSmithInvalidDataException("Unknown Score: $json")
            }
        }

        class Deserializer : BaseDeserializer<Score>(Score::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Score {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Score(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Score(boolean = it, _json = json)
                }

                return Score(_json = json)
            }
        }

        class Serializer : BaseSerializer<Score>(Score::class) {

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.double != null -> generator.writeObject(value.double)
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Score")
                }
            }
        }
    }

    @JsonDeserialize(using = Value.Deserializer::class)
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun double(): Optional<Double> = Optional.ofNullable(double)

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isDouble(): Boolean = double != null

        fun isBoolean(): Boolean = boolean != null

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asDouble(): Double = double.getOrThrow("double")

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                double != null -> visitor.visitDouble(double)
                boolean != null -> visitor.visitBoolean(boolean)
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Value = apply {
            if (!validated) {
                if (double == null && boolean == null && string == null && jsonValue == null) {
                    throw LangSmithInvalidDataException("Unknown Value: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                this.double == other.double &&
                this.boolean == other.boolean &&
                this.string == other.string &&
                this.jsonValue == other.jsonValue
        }

        override fun hashCode(): Int {
            return Objects.hash(
                double,
                boolean,
                string,
                jsonValue,
            )
        }

        override fun toString(): String {
            return when {
                double != null -> "Value{double=$double}"
                boolean != null -> "Value{boolean=$boolean}"
                string != null -> "Value{string=$string}"
                jsonValue != null -> "Value{jsonValue=$jsonValue}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }
        }

        companion object {

            @JvmStatic fun ofDouble(double: Double) = Value(double = double)

            @JvmStatic fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

            @JvmStatic fun ofString(string: String) = Value(string = string)

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Value(jsonValue = jsonValue)
        }

        interface Visitor<out T> {

            fun visitDouble(double: Double): T

            fun visitBoolean(boolean: Boolean): T

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            fun unknown(json: JsonValue?): T {
                throw LangSmithInvalidDataException("Unknown Value: $json")
            }
        }

        class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)
                tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                    return Value(double = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                    return Value(boolean = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<String>())?.let {
                    return Value(string = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                    return Value(jsonValue = it, _json = json)
                }

                return Value(_json = json)
            }
        }

        class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.double != null -> generator.writeObject(value.double)
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
