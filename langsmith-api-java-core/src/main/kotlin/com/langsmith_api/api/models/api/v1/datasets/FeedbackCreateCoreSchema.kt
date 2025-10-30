// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.BaseDeserializer
import com.langsmith_api.api.core.BaseSerializer
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.allMaxBy
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.getOrThrow
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.feedback.ApiFeedbackSource
import com.langsmith_api.api.models.api.v1.feedback.AppFeedbackSource
import com.langsmith_api.api.models.api.v1.feedback.AutoEvalFeedbackSource
import com.langsmith_api.api.models.api.v1.feedback.ModelFeedbackSource
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema used for creating feedback without run id or session id. */
class FeedbackCreateCoreSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val key: JsonField<String>,
    private val id: JsonField<String>,
    private val comment: JsonField<String>,
    private val comparativeExperimentId: JsonField<String>,
    private val correction: JsonField<Correction>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val feedbackGroupId: JsonField<String>,
    private val feedbackSource: JsonField<FeedbackSource>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val score: JsonField<Score>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("comparative_experiment_id")
        @ExcludeMissing
        comparativeExperimentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correction")
        @ExcludeMissing
        correction: JsonField<Correction> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("extra") @ExcludeMissing extra: JsonValue = JsonMissing.of(),
        @JsonProperty("feedback_config")
        @ExcludeMissing
        feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
        @JsonProperty("feedback_group_id")
        @ExcludeMissing
        feedbackGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feedback_source")
        @ExcludeMissing
        feedbackSource: JsonField<FeedbackSource> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Score> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(
        key,
        id,
        comment,
        comparativeExperimentId,
        correction,
        createdAt,
        extra,
        feedbackConfig,
        feedbackGroupId,
        feedbackSource,
        modifiedAt,
        score,
        value,
        mutableMapOf(),
    )

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun comparativeExperimentId(): Optional<String> =
        comparativeExperimentId.getOptional("comparative_experiment_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun correction(): Optional<Correction> = correction.getOptional("correction")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = feedbackConfig.getOptional("feedback_config")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feedbackGroupId(): Optional<String> = feedbackGroupId.getOptional("feedback_group_id")

    /**
     * Feedback from the LangChainPlus App.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feedbackSource(): Optional<FeedbackSource> = feedbackSource.getOptional("feedback_source")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun score(): Optional<Score> = score.getOptional("score")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

    /**
     * Returns the raw JSON value of [comparativeExperimentId].
     *
     * Unlike [comparativeExperimentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("comparative_experiment_id")
    @ExcludeMissing
    fun _comparativeExperimentId(): JsonField<String> = comparativeExperimentId

    /**
     * Returns the raw JSON value of [correction].
     *
     * Unlike [correction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correction")
    @ExcludeMissing
    fun _correction(): JsonField<Correction> = correction

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_config")
    @ExcludeMissing
    fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

    /**
     * Returns the raw JSON value of [feedbackGroupId].
     *
     * Unlike [feedbackGroupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_group_id")
    @ExcludeMissing
    fun _feedbackGroupId(): JsonField<String> = feedbackGroupId

    /**
     * Returns the raw JSON value of [feedbackSource].
     *
     * Unlike [feedbackSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_source")
    @ExcludeMissing
    fun _feedbackSource(): JsonField<FeedbackSource> = feedbackSource

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Score> = score

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value> = value

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FeedbackCreateCoreSchema].
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackCreateCoreSchema]. */
    class Builder internal constructor() {

        private var key: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var comment: JsonField<String> = JsonMissing.of()
        private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
        private var correction: JsonField<Correction> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
        private var feedbackGroupId: JsonField<String> = JsonMissing.of()
        private var feedbackSource: JsonField<FeedbackSource> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var score: JsonField<Score> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackCreateCoreSchema: FeedbackCreateCoreSchema) = apply {
            key = feedbackCreateCoreSchema.key
            id = feedbackCreateCoreSchema.id
            comment = feedbackCreateCoreSchema.comment
            comparativeExperimentId = feedbackCreateCoreSchema.comparativeExperimentId
            correction = feedbackCreateCoreSchema.correction
            createdAt = feedbackCreateCoreSchema.createdAt
            extra = feedbackCreateCoreSchema.extra
            feedbackConfig = feedbackCreateCoreSchema.feedbackConfig
            feedbackGroupId = feedbackCreateCoreSchema.feedbackGroupId
            feedbackSource = feedbackCreateCoreSchema.feedbackSource
            modifiedAt = feedbackCreateCoreSchema.modifiedAt
            score = feedbackCreateCoreSchema.score
            value = feedbackCreateCoreSchema.value
            additionalProperties = feedbackCreateCoreSchema.additionalProperties.toMutableMap()
        }

        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

        /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
        fun comment(comment: Optional<String>) = comment(comment.getOrNull())

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { this.comment = comment }

        fun comparativeExperimentId(comparativeExperimentId: String?) =
            comparativeExperimentId(JsonField.ofNullable(comparativeExperimentId))

        /**
         * Alias for calling [Builder.comparativeExperimentId] with
         * `comparativeExperimentId.orElse(null)`.
         */
        fun comparativeExperimentId(comparativeExperimentId: Optional<String>) =
            comparativeExperimentId(comparativeExperimentId.getOrNull())

        /**
         * Sets [Builder.comparativeExperimentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comparativeExperimentId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun comparativeExperimentId(comparativeExperimentId: JsonField<String>) = apply {
            this.comparativeExperimentId = comparativeExperimentId
        }

        fun correction(correction: Correction?) = correction(JsonField.ofNullable(correction))

        /** Alias for calling [Builder.correction] with `correction.orElse(null)`. */
        fun correction(correction: Optional<Correction>) = correction(correction.getOrNull())

        /**
         * Sets [Builder.correction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correction] with a well-typed [Correction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correction(correction: JsonField<Correction>) = apply { this.correction = correction }

        /** Alias for calling [correction] with `Correction.ofJsonValue(jsonValue)`. */
        fun correction(jsonValue: JsonValue) = correction(Correction.ofJsonValue(jsonValue))

        /** Alias for calling [correction] with `Correction.ofString(string)`. */
        fun correction(string: String) = correction(Correction.ofString(string))

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun feedbackConfig(feedbackConfig: FeedbackConfig?) =
            feedbackConfig(JsonField.ofNullable(feedbackConfig))

        /** Alias for calling [Builder.feedbackConfig] with `feedbackConfig.orElse(null)`. */
        fun feedbackConfig(feedbackConfig: Optional<FeedbackConfig>) =
            feedbackConfig(feedbackConfig.getOrNull())

        /**
         * Sets [Builder.feedbackConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackConfig] with a well-typed [FeedbackConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackConfig(feedbackConfig: JsonField<FeedbackConfig>) = apply {
            this.feedbackConfig = feedbackConfig
        }

        fun feedbackGroupId(feedbackGroupId: String?) =
            feedbackGroupId(JsonField.ofNullable(feedbackGroupId))

        /** Alias for calling [Builder.feedbackGroupId] with `feedbackGroupId.orElse(null)`. */
        fun feedbackGroupId(feedbackGroupId: Optional<String>) =
            feedbackGroupId(feedbackGroupId.getOrNull())

        /**
         * Sets [Builder.feedbackGroupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackGroupId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackGroupId(feedbackGroupId: JsonField<String>) = apply {
            this.feedbackGroupId = feedbackGroupId
        }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(feedbackSource: FeedbackSource?) =
            feedbackSource(JsonField.ofNullable(feedbackSource))

        /** Alias for calling [Builder.feedbackSource] with `feedbackSource.orElse(null)`. */
        fun feedbackSource(feedbackSource: Optional<FeedbackSource>) =
            feedbackSource(feedbackSource.getOrNull())

        /**
         * Sets [Builder.feedbackSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackSource] with a well-typed [FeedbackSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackSource(feedbackSource: JsonField<FeedbackSource>) = apply {
            this.feedbackSource = feedbackSource
        }

        /** Alias for calling [feedbackSource] with `FeedbackSource.ofApp(app)`. */
        fun feedbackSource(app: AppFeedbackSource) = feedbackSource(FeedbackSource.ofApp(app))

        /** Alias for calling [feedbackSource] with `FeedbackSource.ofApi(api)`. */
        fun feedbackSource(api: ApiFeedbackSource) = feedbackSource(FeedbackSource.ofApi(api))

        /** Alias for calling [feedbackSource] with `FeedbackSource.ofModel(model)`. */
        fun feedbackSource(model: ModelFeedbackSource) =
            feedbackSource(FeedbackSource.ofModel(model))

        /** Alias for calling [feedbackSource] with `FeedbackSource.ofAutoEval(autoEval)`. */
        fun feedbackSource(autoEval: AutoEvalFeedbackSource) =
            feedbackSource(FeedbackSource.ofAutoEval(autoEval))

        fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

        /**
         * Sets [Builder.modifiedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
        }

        fun score(score: Score?) = score(JsonField.ofNullable(score))

        /** Alias for calling [Builder.score] with `score.orElse(null)`. */
        fun score(score: Optional<Score>) = score(score.getOrNull())

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Score] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Score>) = apply { this.score = score }

        /** Alias for calling [score] with `Score.ofNumber(number)`. */
        fun score(number: Double) = score(Score.ofNumber(number))

        /** Alias for calling [score] with `Score.ofBool(bool)`. */
        fun score(bool: Boolean) = score(Score.ofBool(bool))

        fun value(value: Value?) = value(JsonField.ofNullable(value))

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Value>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { this.value = value }

        /** Alias for calling [value] with `Value.ofNumber(number)`. */
        fun value(number: Double) = value(Value.ofNumber(number))

        /** Alias for calling [value] with `Value.ofBool(bool)`. */
        fun value(bool: Boolean) = value(Value.ofBool(bool))

        /** Alias for calling [value] with `Value.ofString(string)`. */
        fun value(string: String) = value(Value.ofString(string))

        /** Alias for calling [value] with `Value.ofJson(json)`. */
        fun value(json: JsonValue) = value(Value.ofJson(json))

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [FeedbackCreateCoreSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackCreateCoreSchema =
            FeedbackCreateCoreSchema(
                checkRequired("key", key),
                id,
                comment,
                comparativeExperimentId,
                correction,
                createdAt,
                extra,
                feedbackConfig,
                feedbackGroupId,
                feedbackSource,
                modifiedAt,
                score,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackCreateCoreSchema = apply {
        if (validated) {
            return@apply
        }

        key()
        id()
        comment()
        comparativeExperimentId()
        correction().ifPresent { it.validate() }
        createdAt()
        feedbackConfig().ifPresent { it.validate() }
        feedbackGroupId()
        feedbackSource().ifPresent { it.validate() }
        modifiedAt()
        score().ifPresent { it.validate() }
        value().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LangsmithApiInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (key.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
            (correction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (feedbackGroupId.asKnown().isPresent) 1 else 0) +
            (feedbackSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (score.asKnown().getOrNull()?.validity() ?: 0) +
            (value.asKnown().getOrNull()?.validity() ?: 0)

    @JsonDeserialize(using = Correction.Deserializer::class)
    @JsonSerialize(using = Correction.Serializer::class)
    class Correction
    private constructor(
        private val jsonValue: JsonValue? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isJsonValue(): Boolean = jsonValue != null

        fun isString(): Boolean = string != null

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                string != null -> visitor.visitString(string)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Correction = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitJsonValue(jsonValue: JsonValue) {}

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitJsonValue(jsonValue: JsonValue) = 1

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Correction && jsonValue == other.jsonValue && string == other.string
        }

        override fun hashCode(): Int = Objects.hash(jsonValue, string)

        override fun toString(): String =
            when {
                jsonValue != null -> "Correction{jsonValue=$jsonValue}"
                string != null -> "Correction{string=$string}"
                _json != null -> "Correction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Correction")
            }

        companion object {

            @JvmStatic fun ofJsonValue(jsonValue: JsonValue) = Correction(jsonValue = jsonValue)

            @JvmStatic fun ofString(string: String) = Correction(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Correction] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitJsonValue(jsonValue: JsonValue): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Correction] to a value of type [T].
             *
             * An instance of [Correction] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Correction: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Correction>(Correction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Correction {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Correction(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Correction(jsonValue = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Correction(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Correction>(Correction::class) {

            override fun serialize(
                value: Correction,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Correction")
                }
            }
        }
    }

    /** Feedback from the LangChainPlus App. */
    @JsonDeserialize(using = FeedbackSource.Deserializer::class)
    @JsonSerialize(using = FeedbackSource.Serializer::class)
    class FeedbackSource
    private constructor(
        private val app: AppFeedbackSource? = null,
        private val api: ApiFeedbackSource? = null,
        private val model: ModelFeedbackSource? = null,
        private val autoEval: AutoEvalFeedbackSource? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Feedback from the LangChainPlus App. */
        fun app(): Optional<AppFeedbackSource> = Optional.ofNullable(app)

        /** API feedback source. */
        fun api(): Optional<ApiFeedbackSource> = Optional.ofNullable(api)

        /** Model feedback source. */
        fun model(): Optional<ModelFeedbackSource> = Optional.ofNullable(model)

        /** Auto eval feedback source. */
        fun autoEval(): Optional<AutoEvalFeedbackSource> = Optional.ofNullable(autoEval)

        fun isApp(): Boolean = app != null

        fun isApi(): Boolean = api != null

        fun isModel(): Boolean = model != null

        fun isAutoEval(): Boolean = autoEval != null

        /** Feedback from the LangChainPlus App. */
        fun asApp(): AppFeedbackSource = app.getOrThrow("app")

        /** API feedback source. */
        fun asApi(): ApiFeedbackSource = api.getOrThrow("api")

        /** Model feedback source. */
        fun asModel(): ModelFeedbackSource = model.getOrThrow("model")

        /** Auto eval feedback source. */
        fun asAutoEval(): AutoEvalFeedbackSource = autoEval.getOrThrow("autoEval")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                app != null -> visitor.visitApp(app)
                api != null -> visitor.visitApi(api)
                model != null -> visitor.visitModel(model)
                autoEval != null -> visitor.visitAutoEval(autoEval)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): FeedbackSource = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitApp(app: AppFeedbackSource) {
                        app.validate()
                    }

                    override fun visitApi(api: ApiFeedbackSource) {
                        api.validate()
                    }

                    override fun visitModel(model: ModelFeedbackSource) {
                        model.validate()
                    }

                    override fun visitAutoEval(autoEval: AutoEvalFeedbackSource) {
                        autoEval.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitApp(app: AppFeedbackSource) = app.validity()

                    override fun visitApi(api: ApiFeedbackSource) = api.validity()

                    override fun visitModel(model: ModelFeedbackSource) = model.validity()

                    override fun visitAutoEval(autoEval: AutoEvalFeedbackSource) =
                        autoEval.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackSource &&
                app == other.app &&
                api == other.api &&
                model == other.model &&
                autoEval == other.autoEval
        }

        override fun hashCode(): Int = Objects.hash(app, api, model, autoEval)

        override fun toString(): String =
            when {
                app != null -> "FeedbackSource{app=$app}"
                api != null -> "FeedbackSource{api=$api}"
                model != null -> "FeedbackSource{model=$model}"
                autoEval != null -> "FeedbackSource{autoEval=$autoEval}"
                _json != null -> "FeedbackSource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FeedbackSource")
            }

        companion object {

            /** Feedback from the LangChainPlus App. */
            @JvmStatic fun ofApp(app: AppFeedbackSource) = FeedbackSource(app = app)

            /** API feedback source. */
            @JvmStatic fun ofApi(api: ApiFeedbackSource) = FeedbackSource(api = api)

            /** Model feedback source. */
            @JvmStatic fun ofModel(model: ModelFeedbackSource) = FeedbackSource(model = model)

            /** Auto eval feedback source. */
            @JvmStatic
            fun ofAutoEval(autoEval: AutoEvalFeedbackSource) = FeedbackSource(autoEval = autoEval)
        }

        /**
         * An interface that defines how to map each variant of [FeedbackSource] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            /** Feedback from the LangChainPlus App. */
            fun visitApp(app: AppFeedbackSource): T

            /** API feedback source. */
            fun visitApi(api: ApiFeedbackSource): T

            /** Model feedback source. */
            fun visitModel(model: ModelFeedbackSource): T

            /** Auto eval feedback source. */
            fun visitAutoEval(autoEval: AutoEvalFeedbackSource): T

            /**
             * Maps an unknown variant of [FeedbackSource] to a value of type [T].
             *
             * An instance of [FeedbackSource] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown FeedbackSource: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FeedbackSource>(FeedbackSource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FeedbackSource {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AppFeedbackSource>())?.let {
                                FeedbackSource(app = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ApiFeedbackSource>())?.let {
                                FeedbackSource(api = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<ModelFeedbackSource>())?.let {
                                FeedbackSource(model = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<AutoEvalFeedbackSource>())?.let {
                                FeedbackSource(autoEval = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> FeedbackSource(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<FeedbackSource>(FeedbackSource::class) {

            override fun serialize(
                value: FeedbackSource,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.app != null -> generator.writeObject(value.app)
                    value.api != null -> generator.writeObject(value.api)
                    value.model != null -> generator.writeObject(value.model)
                    value.autoEval != null -> generator.writeObject(value.autoEval)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FeedbackSource")
                }
            }
        }
    }

    @JsonDeserialize(using = Score.Deserializer::class)
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val number: Double? = null,
        private val bool: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Score = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitBool(bool: Boolean) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Score && number == other.number && bool == other.bool
        }

        override fun hashCode(): Int = Objects.hash(number, bool)

        override fun toString(): String =
            when {
                number != null -> "Score{number=$number}"
                bool != null -> "Score{bool=$bool}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Score(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Score(bool = bool)
        }

        /** An interface that defines how to map each variant of [Score] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            /**
             * Maps an unknown variant of [Score] to a value of type [T].
             *
             * An instance of [Score] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Score: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Score>(Score::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Score {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Score(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Score(bool = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from string).
                    0 -> Score(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Score>(Score::class) {

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.bool != null -> generator.writeObject(value.bool)
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
        private val number: Double? = null,
        private val bool: Boolean? = null,
        private val string: String? = null,
        private val json: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun json(): Optional<JsonValue> = Optional.ofNullable(json)

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun isString(): Boolean = string != null

        fun isJson(): Boolean = json != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun asString(): String = string.getOrThrow("string")

        fun asJson(): JsonValue = json.getOrThrow("json")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                string != null -> visitor.visitString(string)
                json != null -> visitor.visitJson(json)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Value = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNumber(number: Double) {}

                    override fun visitBool(bool: Boolean) {}

                    override fun visitString(string: String) {}

                    override fun visitJson(json: JsonValue) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangsmithApiInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitNumber(number: Double) = 1

                    override fun visitBool(bool: Boolean) = 1

                    override fun visitString(string: String) = 1

                    override fun visitJson(json: JsonValue) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Value &&
                number == other.number &&
                bool == other.bool &&
                string == other.string &&
                json == other.json
        }

        override fun hashCode(): Int = Objects.hash(number, bool, string, json)

        override fun toString(): String =
            when {
                number != null -> "Value{number=$number}"
                bool != null -> "Value{bool=$bool}"
                string != null -> "Value{string=$string}"
                json != null -> "Value{json=$json}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)

            @JvmStatic fun ofString(string: String) = Value(string = string)

            @JvmStatic fun ofJson(json: JsonValue) = Value(json = json)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            fun visitString(string: String): T

            fun visitJson(json: JsonValue): T

            /**
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangsmithApiInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangsmithApiInvalidDataException("Unknown Value: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Value(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Value(bool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Value(string = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<JsonValue>())?.let {
                                Value(json = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants.
                    0 -> Value(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Value>(Value::class) {

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.number != null -> generator.writeObject(value.number)
                    value.bool != null -> generator.writeObject(value.bool)
                    value.string != null -> generator.writeObject(value.string)
                    value.json != null -> generator.writeObject(value.json)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackCreateCoreSchema &&
            key == other.key &&
            id == other.id &&
            comment == other.comment &&
            comparativeExperimentId == other.comparativeExperimentId &&
            correction == other.correction &&
            createdAt == other.createdAt &&
            extra == other.extra &&
            feedbackConfig == other.feedbackConfig &&
            feedbackGroupId == other.feedbackGroupId &&
            feedbackSource == other.feedbackSource &&
            modifiedAt == other.modifiedAt &&
            score == other.score &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            key,
            id,
            comment,
            comparativeExperimentId,
            correction,
            createdAt,
            extra,
            feedbackConfig,
            feedbackGroupId,
            feedbackSource,
            modifiedAt,
            score,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackCreateCoreSchema{key=$key, id=$id, comment=$comment, comparativeExperimentId=$comparativeExperimentId, correction=$correction, createdAt=$createdAt, extra=$extra, feedbackConfig=$feedbackConfig, feedbackGroupId=$feedbackGroupId, feedbackSource=$feedbackSource, modifiedAt=$modifiedAt, score=$score, value=$value, additionalProperties=$additionalProperties}"
}
