// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback

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
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Schema for getting feedback. */
class FeedbackSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val key: JsonField<String>,
    private val comment: JsonField<String>,
    private val comparativeExperimentId: JsonField<String>,
    private val correction: JsonField<Correction>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val extra: JsonValue,
    private val feedbackGroupId: JsonField<String>,
    private val feedbackSource: JsonField<FeedbackSource>,
    private val feedbackThreadId: JsonField<String>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val runId: JsonField<String>,
    private val score: JsonField<Score>,
    private val sessionId: JsonField<String>,
    private val startTime: JsonField<OffsetDateTime>,
    private val traceId: JsonField<String>,
    private val value: JsonField<Value>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("feedback_group_id")
        @ExcludeMissing
        feedbackGroupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feedback_source")
        @ExcludeMissing
        feedbackSource: JsonField<FeedbackSource> = JsonMissing.of(),
        @JsonProperty("feedback_thread_id")
        @ExcludeMissing
        feedbackThreadId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("score") @ExcludeMissing score: JsonField<Score> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_time")
        @ExcludeMissing
        startTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_id") @ExcludeMissing traceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
    ) : this(
        id,
        key,
        comment,
        comparativeExperimentId,
        correction,
        createdAt,
        extra,
        feedbackGroupId,
        feedbackSource,
        feedbackThreadId,
        modifiedAt,
        runId,
        score,
        sessionId,
        startTime,
        traceId,
        value,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun key(): String = key.getRequired("key")

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

    @JsonProperty("extra") @ExcludeMissing fun _extra(): JsonValue = extra

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackGroupId(): Optional<String> = feedbackGroupId.getOptional("feedback_group_id")

    /**
     * The feedback source loaded from the database.
     *
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackSource(): Optional<FeedbackSource> = feedbackSource.getOptional("feedback_source")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackThreadId(): Optional<String> = feedbackThreadId.getOptional("feedback_thread_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun modifiedAt(): Optional<OffsetDateTime> = modifiedAt.getOptional("modified_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runId(): Optional<String> = runId.getOptional("run_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun score(): Optional<Score> = score.getOptional("score")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTime(): Optional<OffsetDateTime> = startTime.getOptional("start_time")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun traceId(): Optional<String> = traceId.getOptional("trace_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = value.getOptional("value")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

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
     * Returns the raw JSON value of [feedbackThreadId].
     *
     * Unlike [feedbackThreadId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("feedback_thread_id")
    @ExcludeMissing
    fun _feedbackThreadId(): JsonField<String> = feedbackThreadId

    /**
     * Returns the raw JSON value of [modifiedAt].
     *
     * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modified_at")
    @ExcludeMissing
    fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Score> = score

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [startTime].
     *
     * Unlike [startTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_time")
    @ExcludeMissing
    fun _startTime(): JsonField<OffsetDateTime> = startTime

    /**
     * Returns the raw JSON value of [traceId].
     *
     * Unlike [traceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trace_id") @ExcludeMissing fun _traceId(): JsonField<String> = traceId

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
         * Returns a mutable builder for constructing an instance of [FeedbackSchema].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .key()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackSchema]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var key: JsonField<String>? = null
        private var comment: JsonField<String> = JsonMissing.of()
        private var comparativeExperimentId: JsonField<String> = JsonMissing.of()
        private var correction: JsonField<Correction> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var extra: JsonValue = JsonMissing.of()
        private var feedbackGroupId: JsonField<String> = JsonMissing.of()
        private var feedbackSource: JsonField<FeedbackSource> = JsonMissing.of()
        private var feedbackThreadId: JsonField<String> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var runId: JsonField<String> = JsonMissing.of()
        private var score: JsonField<Score> = JsonMissing.of()
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var startTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var traceId: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Value> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackSchema: FeedbackSchema) = apply {
            id = feedbackSchema.id
            key = feedbackSchema.key
            comment = feedbackSchema.comment
            comparativeExperimentId = feedbackSchema.comparativeExperimentId
            correction = feedbackSchema.correction
            createdAt = feedbackSchema.createdAt
            extra = feedbackSchema.extra
            feedbackGroupId = feedbackSchema.feedbackGroupId
            feedbackSource = feedbackSchema.feedbackSource
            feedbackThreadId = feedbackSchema.feedbackThreadId
            modifiedAt = feedbackSchema.modifiedAt
            runId = feedbackSchema.runId
            score = feedbackSchema.score
            sessionId = feedbackSchema.sessionId
            startTime = feedbackSchema.startTime
            traceId = feedbackSchema.traceId
            value = feedbackSchema.value
            additionalProperties = feedbackSchema.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

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

        /** The feedback source loaded from the database. */
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

        fun feedbackThreadId(feedbackThreadId: String?) =
            feedbackThreadId(JsonField.ofNullable(feedbackThreadId))

        /** Alias for calling [Builder.feedbackThreadId] with `feedbackThreadId.orElse(null)`. */
        fun feedbackThreadId(feedbackThreadId: Optional<String>) =
            feedbackThreadId(feedbackThreadId.getOrNull())

        /**
         * Sets [Builder.feedbackThreadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackThreadId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackThreadId(feedbackThreadId: JsonField<String>) = apply {
            this.feedbackThreadId = feedbackThreadId
        }

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

        fun runId(runId: String?) = runId(JsonField.ofNullable(runId))

        /** Alias for calling [Builder.runId] with `runId.orElse(null)`. */
        fun runId(runId: Optional<String>) = runId(runId.getOrNull())

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

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

        fun sessionId(sessionId: String?) = sessionId(JsonField.ofNullable(sessionId))

        /** Alias for calling [Builder.sessionId] with `sessionId.orElse(null)`. */
        fun sessionId(sessionId: Optional<String>) = sessionId(sessionId.getOrNull())

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun startTime(startTime: OffsetDateTime?) = startTime(JsonField.ofNullable(startTime))

        /** Alias for calling [Builder.startTime] with `startTime.orElse(null)`. */
        fun startTime(startTime: Optional<OffsetDateTime>) = startTime(startTime.getOrNull())

        /**
         * Sets [Builder.startTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTime(startTime: JsonField<OffsetDateTime>) = apply { this.startTime = startTime }

        fun traceId(traceId: String?) = traceId(JsonField.ofNullable(traceId))

        /** Alias for calling [Builder.traceId] with `traceId.orElse(null)`. */
        fun traceId(traceId: Optional<String>) = traceId(traceId.getOrNull())

        /**
         * Sets [Builder.traceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.traceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun traceId(traceId: JsonField<String>) = apply { this.traceId = traceId }

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
         * Returns an immutable instance of [FeedbackSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .key()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackSchema =
            FeedbackSchema(
                checkRequired("id", id),
                checkRequired("key", key),
                comment,
                comparativeExperimentId,
                correction,
                createdAt,
                extra,
                feedbackGroupId,
                feedbackSource,
                feedbackThreadId,
                modifiedAt,
                runId,
                score,
                sessionId,
                startTime,
                traceId,
                value,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackSchema = apply {
        if (validated) {
            return@apply
        }

        id()
        key()
        comment()
        comparativeExperimentId()
        correction().ifPresent { it.validate() }
        createdAt()
        feedbackGroupId()
        feedbackSource().ifPresent { it.validate() }
        feedbackThreadId()
        modifiedAt()
        runId()
        score().ifPresent { it.validate() }
        sessionId()
        startTime()
        traceId()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (key.asKnown().isPresent) 1 else 0) +
            (if (comment.asKnown().isPresent) 1 else 0) +
            (if (comparativeExperimentId.asKnown().isPresent) 1 else 0) +
            (correction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (feedbackGroupId.asKnown().isPresent) 1 else 0) +
            (feedbackSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (feedbackThreadId.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (score.asKnown().getOrNull()?.validity() ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (startTime.asKnown().isPresent) 1 else 0) +
            (if (traceId.asKnown().isPresent) 1 else 0) +
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

    /** The feedback source loaded from the database. */
    class FeedbackSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val lsUserId: JsonField<String>,
        private val metadata: JsonValue,
        private val type: JsonField<String>,
        private val userId: JsonField<String>,
        private val userName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ls_user_id")
            @ExcludeMissing
            lsUserId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata") @ExcludeMissing metadata: JsonValue = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_id") @ExcludeMissing userId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_name")
            @ExcludeMissing
            userName: JsonField<String> = JsonMissing.of(),
        ) : this(lsUserId, metadata, type, userId, userName, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lsUserId(): Optional<String> = lsUserId.getOptional("ls_user_id")

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonValue = metadata

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<String> = type.getOptional("type")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userId(): Optional<String> = userId.getOptional("user_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun userName(): Optional<String> = userName.getOptional("user_name")

        /**
         * Returns the raw JSON value of [lsUserId].
         *
         * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [userId].
         *
         * Unlike [userId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_id") @ExcludeMissing fun _userId(): JsonField<String> = userId

        /**
         * Returns the raw JSON value of [userName].
         *
         * Unlike [userName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_name") @ExcludeMissing fun _userName(): JsonField<String> = userName

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

            /** Returns a mutable builder for constructing an instance of [FeedbackSource]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackSource]. */
        class Builder internal constructor() {

            private var lsUserId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonValue = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var userId: JsonField<String> = JsonMissing.of()
            private var userName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackSource: FeedbackSource) = apply {
                lsUserId = feedbackSource.lsUserId
                metadata = feedbackSource.metadata
                type = feedbackSource.type
                userId = feedbackSource.userId
                userName = feedbackSource.userName
                additionalProperties = feedbackSource.additionalProperties.toMutableMap()
            }

            fun lsUserId(lsUserId: String?) = lsUserId(JsonField.ofNullable(lsUserId))

            /** Alias for calling [Builder.lsUserId] with `lsUserId.orElse(null)`. */
            fun lsUserId(lsUserId: Optional<String>) = lsUserId(lsUserId.getOrNull())

            /**
             * Sets [Builder.lsUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

            fun metadata(metadata: JsonValue) = apply { this.metadata = metadata }

            fun type(type: String?) = type(JsonField.ofNullable(type))

            /** Alias for calling [Builder.type] with `type.orElse(null)`. */
            fun type(type: Optional<String>) = type(type.getOrNull())

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            fun userId(userId: String?) = userId(JsonField.ofNullable(userId))

            /** Alias for calling [Builder.userId] with `userId.orElse(null)`. */
            fun userId(userId: Optional<String>) = userId(userId.getOrNull())

            /**
             * Sets [Builder.userId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userId(userId: JsonField<String>) = apply { this.userId = userId }

            fun userName(userName: String?) = userName(JsonField.ofNullable(userName))

            /** Alias for calling [Builder.userName] with `userName.orElse(null)`. */
            fun userName(userName: Optional<String>) = userName(userName.getOrNull())

            /**
             * Sets [Builder.userName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userName(userName: JsonField<String>) = apply { this.userName = userName }

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
             * Returns an immutable instance of [FeedbackSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeedbackSource =
                FeedbackSource(
                    lsUserId,
                    metadata,
                    type,
                    userId,
                    userName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FeedbackSource = apply {
            if (validated) {
                return@apply
            }

            lsUserId()
            type()
            userId()
            userName()
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
            (if (lsUserId.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (if (userId.asKnown().isPresent) 1 else 0) +
                (if (userName.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackSource &&
                lsUserId == other.lsUserId &&
                metadata == other.metadata &&
                type == other.type &&
                userId == other.userId &&
                userName == other.userName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(lsUserId, metadata, type, userId, userName, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeedbackSource{lsUserId=$lsUserId, metadata=$metadata, type=$type, userId=$userId, userName=$userName, additionalProperties=$additionalProperties}"
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

        return other is FeedbackSchema &&
            id == other.id &&
            key == other.key &&
            comment == other.comment &&
            comparativeExperimentId == other.comparativeExperimentId &&
            correction == other.correction &&
            createdAt == other.createdAt &&
            extra == other.extra &&
            feedbackGroupId == other.feedbackGroupId &&
            feedbackSource == other.feedbackSource &&
            feedbackThreadId == other.feedbackThreadId &&
            modifiedAt == other.modifiedAt &&
            runId == other.runId &&
            score == other.score &&
            sessionId == other.sessionId &&
            startTime == other.startTime &&
            traceId == other.traceId &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            key,
            comment,
            comparativeExperimentId,
            correction,
            createdAt,
            extra,
            feedbackGroupId,
            feedbackSource,
            feedbackThreadId,
            modifiedAt,
            runId,
            score,
            sessionId,
            startTime,
            traceId,
            value,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackSchema{id=$id, key=$key, comment=$comment, comparativeExperimentId=$comparativeExperimentId, correction=$correction, createdAt=$createdAt, extra=$extra, feedbackGroupId=$feedbackGroupId, feedbackSource=$feedbackSource, feedbackThreadId=$feedbackThreadId, modifiedAt=$modifiedAt, runId=$runId, score=$score, sessionId=$sessionId, startTime=$startTime, traceId=$traceId, value=$value, additionalProperties=$additionalProperties}"
}
