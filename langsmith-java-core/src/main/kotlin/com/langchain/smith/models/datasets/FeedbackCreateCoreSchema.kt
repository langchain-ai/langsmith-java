// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

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
import com.langchain.smith.core.BaseDeserializer
import com.langchain.smith.core.BaseSerializer
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.feedback.ApiFeedbackSource
import com.langchain.smith.models.feedback.AppFeedbackSource
import com.langchain.smith.models.feedback.AutoEvalFeedbackSource
import com.langchain.smith.models.feedback.ModelFeedbackSource
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
    private val extra: JsonField<Extra>,
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
        @JsonProperty("extra") @ExcludeMissing extra: JsonField<Extra> = JsonMissing.of(),
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
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = comment.getOptional("comment")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comparativeExperimentId(): Optional<String> =
        comparativeExperimentId.getOptional("comparative_experiment_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correction(): Optional<Correction> = correction.getOptional("correction")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extra(): Optional<Extra> = extra.getOptional("extra")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = feedbackConfig.getOptional("feedback_config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackGroupId(): Optional<String> = feedbackGroupId.getOptional("feedback_group_id")

    /**
     * Feedback from the LangChainPlus App.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackSource(): Optional<FeedbackSource> = feedbackSource.getOptional("feedback_source")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun score(): Optional<Score> = score.getOptional("score")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
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
     * Returns the raw JSON value of [extra].
     *
     * Unlike [extra], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonField<Extra> = extra

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
        private var extra: JsonField<Extra> = JsonMissing.of()
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

        /** Alias for calling [correction] with `Correction.ofUnionMember0(unionMember0)`. */
        fun correction(unionMember0: Correction.UnionMember0) =
            correction(Correction.ofUnionMember0(unionMember0))

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

        fun extra(extra: Extra?) = extra(JsonField.ofNullable(extra))

        /** Alias for calling [Builder.extra] with `extra.orElse(null)`. */
        fun extra(extra: Optional<Extra>) = extra(extra.getOrNull())

        /**
         * Sets [Builder.extra] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extra] with a well-typed [Extra] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun extra(extra: JsonField<Extra>) = apply { this.extra = extra }

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

        /** Alias for calling [value] with `Value.ofUnionMember3(unionMember3)`. */
        fun value(unionMember3: Value.UnionMember3) = value(Value.ofUnionMember3(unionMember3))

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
        extra().ifPresent { it.validate() }
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
        } catch (e: LangChainInvalidDataException) {
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
            (extra.asKnown().getOrNull()?.validity() ?: 0) +
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
        private val unionMember0: UnionMember0? = null,
        private val string: String? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isString(): Boolean = string != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asString(): String = string.getOrThrow("string")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitString(string: String) {}
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
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
                    override fun visitUnionMember0(unionMember0: UnionMember0) =
                        unionMember0.validity()

                    override fun visitString(string: String) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Correction &&
                unionMember0 == other.unionMember0 &&
                string == other.string
        }

        override fun hashCode(): Int = Objects.hash(unionMember0, string)

        override fun toString(): String =
            when {
                unionMember0 != null -> "Correction{unionMember0=$unionMember0}"
                string != null -> "Correction{string=$string}"
                _json != null -> "Correction{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Correction")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Correction(unionMember0 = unionMember0)

            @JvmStatic fun ofString(string: String) = Correction(string = string)
        }

        /**
         * An interface that defines how to map each variant of [Correction] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitString(string: String): T

            /**
             * Maps an unknown variant of [Correction] to a value of type [T].
             *
             * An instance of [Correction] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Correction: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Correction>(Correction::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Correction {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember0>())?.let {
                                Correction(unionMember0 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Correction(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
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
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.string != null -> generator.writeObject(value.string)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Correction")
                }
            }
        }

        class UnionMember0
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember0]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember0].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember0 = UnionMember0(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember0 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember0{additionalProperties=$additionalProperties}"
        }
    }

    class Extra
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Extra]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Extra]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(extra: Extra) = apply {
                additionalProperties = extra.additionalProperties.toMutableMap()
            }

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
             * Returns an immutable instance of [Extra].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Extra = Extra(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Extra = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Extra && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Extra{additionalProperties=$additionalProperties}"
    }

    class FeedbackConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val type: JsonField<Type>,
        private val categories: JsonField<List<Category>>,
        private val max: JsonField<Double>,
        private val min: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("categories")
            @ExcludeMissing
            categories: JsonField<List<Category>> = JsonMissing.of(),
            @JsonProperty("max") @ExcludeMissing max: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("min") @ExcludeMissing min: JsonField<Double> = JsonMissing.of(),
        ) : this(type, categories, max, min, mutableMapOf())

        /**
         * Enum for feedback types.
         *
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun categories(): Optional<List<Category>> = categories.getOptional("categories")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun max(): Optional<Double> = max.getOptional("max")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun min(): Optional<Double> = min.getOptional("min")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [categories].
         *
         * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("categories")
        @ExcludeMissing
        fun _categories(): JsonField<List<Category>> = categories

        /**
         * Returns the raw JSON value of [max].
         *
         * Unlike [max], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max") @ExcludeMissing fun _max(): JsonField<Double> = max

        /**
         * Returns the raw JSON value of [min].
         *
         * Unlike [min], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min") @ExcludeMissing fun _min(): JsonField<Double> = min

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
             * Returns a mutable builder for constructing an instance of [FeedbackConfig].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackConfig]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var categories: JsonField<MutableList<Category>>? = null
            private var max: JsonField<Double> = JsonMissing.of()
            private var min: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackConfig: FeedbackConfig) = apply {
                type = feedbackConfig.type
                categories = feedbackConfig.categories.map { it.toMutableList() }
                max = feedbackConfig.max
                min = feedbackConfig.min
                additionalProperties = feedbackConfig.additionalProperties.toMutableMap()
            }

            /** Enum for feedback types. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun categories(categories: List<Category>?) =
                categories(JsonField.ofNullable(categories))

            /** Alias for calling [Builder.categories] with `categories.orElse(null)`. */
            fun categories(categories: Optional<List<Category>>) =
                categories(categories.getOrNull())

            /**
             * Sets [Builder.categories] to an arbitrary JSON value.
             *
             * You should usually call [Builder.categories] with a well-typed `List<Category>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun categories(categories: JsonField<List<Category>>) = apply {
                this.categories = categories.map { it.toMutableList() }
            }

            /**
             * Adds a single [Category] to [categories].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCategory(category: Category) = apply {
                categories =
                    (categories ?: JsonField.of(mutableListOf())).also {
                        checkKnown("categories", it).add(category)
                    }
            }

            fun max(max: Double?) = max(JsonField.ofNullable(max))

            /**
             * Alias for [Builder.max].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun max(max: Double) = max(max as Double?)

            /** Alias for calling [Builder.max] with `max.orElse(null)`. */
            fun max(max: Optional<Double>) = max(max.getOrNull())

            /**
             * Sets [Builder.max] to an arbitrary JSON value.
             *
             * You should usually call [Builder.max] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun max(max: JsonField<Double>) = apply { this.max = max }

            fun min(min: Double?) = min(JsonField.ofNullable(min))

            /**
             * Alias for [Builder.min].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun min(min: Double) = min(min as Double?)

            /** Alias for calling [Builder.min] with `min.orElse(null)`. */
            fun min(min: Optional<Double>) = min(min.getOrNull())

            /**
             * Sets [Builder.min] to an arbitrary JSON value.
             *
             * You should usually call [Builder.min] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun min(min: JsonField<Double>) = apply { this.min = min }

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
             * Returns an immutable instance of [FeedbackConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FeedbackConfig =
                FeedbackConfig(
                    checkRequired("type", type),
                    (categories ?: JsonMissing.of()).map { it.toImmutable() },
                    max,
                    min,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FeedbackConfig = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            categories().ifPresent { it.forEach { it.validate() } }
            max()
            min()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (max.asKnown().isPresent) 1 else 0) +
                (if (min.asKnown().isPresent) 1 else 0)

        /** Enum for feedback types. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONTINUOUS = of("continuous")

                @JvmField val CATEGORICAL = of("categorical")

                @JvmField val FREEFORM = of("freeform")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CONTINUOUS -> Value.CONTINUOUS
                    CATEGORICAL -> Value.CATEGORICAL
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LangChainInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CONTINUOUS -> Known.CONTINUOUS
                    CATEGORICAL -> Known.CATEGORICAL
                    FREEFORM -> Known.FREEFORM
                    else -> throw LangChainInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LangChainInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LangChainInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Specific value and label pair for feedback */
        class Category
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val value: JsonField<Double>,
            private val label: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("value") @ExcludeMissing value: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("label") @ExcludeMissing label: JsonField<String> = JsonMissing.of(),
            ) : this(value, label, mutableMapOf())

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): Double = value.getRequired("value")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun label(): Optional<String> = label.getOptional("label")

            /**
             * Returns the raw JSON value of [value].
             *
             * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

            /**
             * Returns the raw JSON value of [label].
             *
             * Unlike [label], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("label") @ExcludeMissing fun _label(): JsonField<String> = label

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
                 * Returns a mutable builder for constructing an instance of [Category].
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Category]. */
            class Builder internal constructor() {

                private var value: JsonField<Double>? = null
                private var label: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(category: Category) = apply {
                    value = category.value
                    label = category.label
                    additionalProperties = category.additionalProperties.toMutableMap()
                }

                fun value(value: Double) = value(JsonField.of(value))

                /**
                 * Sets [Builder.value] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.value] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun label(label: String?) = label(JsonField.ofNullable(label))

                /** Alias for calling [Builder.label] with `label.orElse(null)`. */
                fun label(label: Optional<String>) = label(label.getOrNull())

                /**
                 * Sets [Builder.label] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.label] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun label(label: JsonField<String>) = apply { this.label = label }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Category].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Category =
                    Category(
                        checkRequired("value", value),
                        label,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                value()
                label()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                (if (value.asKnown().isPresent) 1 else 0) +
                    (if (label.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category &&
                    value == other.value &&
                    label == other.label &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(value, label, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Category{value=$value, label=$label, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackConfig &&
                type == other.type &&
                categories == other.categories &&
                max == other.max &&
                min == other.min &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(type, categories, max, min, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeedbackConfig{type=$type, categories=$categories, max=$max, min=$min, additionalProperties=$additionalProperties}"
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
            } catch (e: LangChainInvalidDataException) {
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
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown FeedbackSource: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FeedbackSource>(FeedbackSource::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FeedbackSource {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

                when (type) {
                    "app" -> {
                        return tryDeserialize(node, jacksonTypeRef<AppFeedbackSource>())?.let {
                            FeedbackSource(app = it, _json = json)
                        } ?: FeedbackSource(_json = json)
                    }
                    "api" -> {
                        return tryDeserialize(node, jacksonTypeRef<ApiFeedbackSource>())?.let {
                            FeedbackSource(api = it, _json = json)
                        } ?: FeedbackSource(_json = json)
                    }
                    "model" -> {
                        return tryDeserialize(node, jacksonTypeRef<ModelFeedbackSource>())?.let {
                            FeedbackSource(model = it, _json = json)
                        } ?: FeedbackSource(_json = json)
                    }
                    "auto_eval" -> {
                        return tryDeserialize(node, jacksonTypeRef<AutoEvalFeedbackSource>())?.let {
                            FeedbackSource(autoEval = it, _json = json)
                        } ?: FeedbackSource(_json = json)
                    }
                }

                return FeedbackSource(_json = json)
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
            } catch (e: LangChainInvalidDataException) {
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
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Score: $json")
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
        private val unionMember3: UnionMember3? = null,
        private val _json: JsonValue? = null,
    ) {

        fun number(): Optional<Double> = Optional.ofNullable(number)

        fun bool(): Optional<Boolean> = Optional.ofNullable(bool)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun unionMember3(): Optional<UnionMember3> = Optional.ofNullable(unionMember3)

        fun isNumber(): Boolean = number != null

        fun isBool(): Boolean = bool != null

        fun isString(): Boolean = string != null

        fun isUnionMember3(): Boolean = unionMember3 != null

        fun asNumber(): Double = number.getOrThrow("number")

        fun asBool(): Boolean = bool.getOrThrow("bool")

        fun asString(): String = string.getOrThrow("string")

        fun asUnionMember3(): UnionMember3 = unionMember3.getOrThrow("unionMember3")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                number != null -> visitor.visitNumber(number)
                bool != null -> visitor.visitBool(bool)
                string != null -> visitor.visitString(string)
                unionMember3 != null -> visitor.visitUnionMember3(unionMember3)
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

                    override fun visitUnionMember3(unionMember3: UnionMember3) {
                        unionMember3.validate()
                    }
                }
            )
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LangChainInvalidDataException) {
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

                    override fun visitUnionMember3(unionMember3: UnionMember3) =
                        unionMember3.validity()

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
                unionMember3 == other.unionMember3
        }

        override fun hashCode(): Int = Objects.hash(number, bool, string, unionMember3)

        override fun toString(): String =
            when {
                number != null -> "Value{number=$number}"
                bool != null -> "Value{bool=$bool}"
                string != null -> "Value{string=$string}"
                unionMember3 != null -> "Value{unionMember3=$unionMember3}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }

        companion object {

            @JvmStatic fun ofNumber(number: Double) = Value(number = number)

            @JvmStatic fun ofBool(bool: Boolean) = Value(bool = bool)

            @JvmStatic fun ofString(string: String) = Value(string = string)

            @JvmStatic
            fun ofUnionMember3(unionMember3: UnionMember3) = Value(unionMember3 = unionMember3)
        }

        /** An interface that defines how to map each variant of [Value] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitNumber(number: Double): T

            fun visitBool(bool: Boolean): T

            fun visitString(string: String): T

            fun visitUnionMember3(unionMember3: UnionMember3): T

            /**
             * Maps an unknown variant of [Value] to a value of type [T].
             *
             * An instance of [Value] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown Value: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Value>(Value::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Value {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember3>())?.let {
                                Value(unionMember3 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Double>())?.let {
                                Value(number = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<Boolean>())?.let {
                                Value(bool = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                Value(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from array).
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
                    value.unionMember3 != null -> generator.writeObject(value.unionMember3)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }

        class UnionMember3
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [UnionMember3]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember3]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember3: UnionMember3) = apply {
                    additionalProperties = unionMember3.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [UnionMember3].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): UnionMember3 = UnionMember3(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): UnionMember3 = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LangChainInvalidDataException) {
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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is UnionMember3 && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "UnionMember3{additionalProperties=$additionalProperties}"
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
