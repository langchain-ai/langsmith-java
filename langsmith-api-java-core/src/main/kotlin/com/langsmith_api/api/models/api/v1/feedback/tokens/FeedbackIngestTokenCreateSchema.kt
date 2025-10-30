// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.feedback.tokens

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Feedback ingest token create schema. */
class FeedbackIngestTokenCreateSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackKey: JsonField<String>,
    private val runId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val expiresIn: JsonField<TimedeltaInput>,
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_key")
        @ExcludeMissing
        feedbackKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("run_id") @ExcludeMissing runId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_in")
        @ExcludeMissing
        expiresIn: JsonField<TimedeltaInput> = JsonMissing.of(),
        @JsonProperty("feedback_config")
        @ExcludeMissing
        feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
    ) : this(feedbackKey, runId, expiresAt, expiresIn, feedbackConfig, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun runId(): String = runId.getRequired("run_id")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Timedelta input.
     *
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresIn(): Optional<TimedeltaInput> = expiresIn.getOptional("expires_in")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = feedbackConfig.getOptional("feedback_config")

    /**
     * Returns the raw JSON value of [feedbackKey].
     *
     * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_key")
    @ExcludeMissing
    fun _feedbackKey(): JsonField<String> = feedbackKey

    /**
     * Returns the raw JSON value of [runId].
     *
     * Unlike [runId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("run_id") @ExcludeMissing fun _runId(): JsonField<String> = runId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [expiresIn].
     *
     * Unlike [expiresIn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_in")
    @ExcludeMissing
    fun _expiresIn(): JsonField<TimedeltaInput> = expiresIn

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_config")
    @ExcludeMissing
    fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

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
         * Returns a mutable builder for constructing an instance of
         * [FeedbackIngestTokenCreateSchema].
         *
         * The following fields are required:
         * ```java
         * .feedbackKey()
         * .runId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackIngestTokenCreateSchema]. */
    class Builder internal constructor() {

        private var feedbackKey: JsonField<String>? = null
        private var runId: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var expiresIn: JsonField<TimedeltaInput> = JsonMissing.of()
        private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackIngestTokenCreateSchema: FeedbackIngestTokenCreateSchema) =
            apply {
                feedbackKey = feedbackIngestTokenCreateSchema.feedbackKey
                runId = feedbackIngestTokenCreateSchema.runId
                expiresAt = feedbackIngestTokenCreateSchema.expiresAt
                expiresIn = feedbackIngestTokenCreateSchema.expiresIn
                feedbackConfig = feedbackIngestTokenCreateSchema.feedbackConfig
                additionalProperties =
                    feedbackIngestTokenCreateSchema.additionalProperties.toMutableMap()
            }

        fun feedbackKey(feedbackKey: String) = feedbackKey(JsonField.of(feedbackKey))

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { this.feedbackKey = feedbackKey }

        fun runId(runId: String) = runId(JsonField.of(runId))

        /**
         * Sets [Builder.runId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun runId(runId: JsonField<String>) = apply { this.runId = runId }

        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Timedelta input. */
        fun expiresIn(expiresIn: TimedeltaInput?) = expiresIn(JsonField.ofNullable(expiresIn))

        /** Alias for calling [Builder.expiresIn] with `expiresIn.orElse(null)`. */
        fun expiresIn(expiresIn: Optional<TimedeltaInput>) = expiresIn(expiresIn.getOrNull())

        /**
         * Sets [Builder.expiresIn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresIn] with a well-typed [TimedeltaInput] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresIn(expiresIn: JsonField<TimedeltaInput>) = apply { this.expiresIn = expiresIn }

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
         * Returns an immutable instance of [FeedbackIngestTokenCreateSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackKey()
         * .runId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackIngestTokenCreateSchema =
            FeedbackIngestTokenCreateSchema(
                checkRequired("feedbackKey", feedbackKey),
                checkRequired("runId", runId),
                expiresAt,
                expiresIn,
                feedbackConfig,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackIngestTokenCreateSchema = apply {
        if (validated) {
            return@apply
        }

        feedbackKey()
        runId()
        expiresAt()
        expiresIn().ifPresent { it.validate() }
        feedbackConfig().ifPresent { it.validate() }
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
        (if (feedbackKey.asKnown().isPresent) 1 else 0) +
            (if (runId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (expiresIn.asKnown().getOrNull()?.validity() ?: 0) +
            (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackIngestTokenCreateSchema &&
            feedbackKey == other.feedbackKey &&
            runId == other.runId &&
            expiresAt == other.expiresAt &&
            expiresIn == other.expiresIn &&
            feedbackConfig == other.feedbackConfig &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(feedbackKey, runId, expiresAt, expiresIn, feedbackConfig, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FeedbackIngestTokenCreateSchema{feedbackKey=$feedbackKey, runId=$runId, expiresAt=$expiresAt, expiresIn=$expiresIn, feedbackConfig=$feedbackConfig, additionalProperties=$additionalProperties}"
}
