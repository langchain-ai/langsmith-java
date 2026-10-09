// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues

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
import com.langchain.smith.models.datasets.Missing
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueRubricItemSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackKey: JsonField<String>,
    private val description: JsonField<String>,
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val feedbackConfigId: JsonField<String>,
    private val isAssertion: JsonField<Boolean>,
    private val isRequired: JsonField<Boolean>,
    private val regexValidator: JsonField<RegexValidator>,
    private val scoreDescriptions: JsonField<ScoreDescriptions>,
    private val valueDescriptions: JsonField<ValueDescriptions>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_key")
        @ExcludeMissing
        feedbackKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feedback_config")
        @ExcludeMissing
        feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
        @JsonProperty("feedback_config_id")
        @ExcludeMissing
        feedbackConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_assertion")
        @ExcludeMissing
        isAssertion: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_required")
        @ExcludeMissing
        isRequired: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("regex_validator")
        @ExcludeMissing
        regexValidator: JsonField<RegexValidator> = JsonMissing.of(),
        @JsonProperty("score_descriptions")
        @ExcludeMissing
        scoreDescriptions: JsonField<ScoreDescriptions> = JsonMissing.of(),
        @JsonProperty("value_descriptions")
        @ExcludeMissing
        valueDescriptions: JsonField<ValueDescriptions> = JsonMissing.of(),
    ) : this(
        feedbackKey,
        description,
        feedbackConfig,
        feedbackConfigId,
        isAssertion,
        isRequired,
        regexValidator,
        scoreDescriptions,
        valueDescriptions,
        mutableMapOf(),
    )

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = feedbackConfig.getOptional("feedback_config")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackConfigId(): Optional<String> = feedbackConfigId.getOptional("feedback_config_id")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isAssertion(): Optional<Boolean> = isAssertion.getOptional("is_assertion")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRequired(): Optional<Boolean> = isRequired.getOptional("is_required")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regexValidator(): Optional<RegexValidator> = regexValidator.getOptional("regex_validator")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scoreDescriptions(): Optional<ScoreDescriptions> =
        scoreDescriptions.getOptional("score_descriptions")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun valueDescriptions(): Optional<ValueDescriptions> =
        valueDescriptions.getOptional("value_descriptions")

    /**
     * Returns the raw JSON value of [feedbackKey].
     *
     * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_key")
    @ExcludeMissing
    fun _feedbackKey(): JsonField<String> = feedbackKey

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_config")
    @ExcludeMissing
    fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

    /**
     * Returns the raw JSON value of [feedbackConfigId].
     *
     * Unlike [feedbackConfigId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("feedback_config_id")
    @ExcludeMissing
    fun _feedbackConfigId(): JsonField<String> = feedbackConfigId

    /**
     * Returns the raw JSON value of [isAssertion].
     *
     * Unlike [isAssertion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_assertion")
    @ExcludeMissing
    fun _isAssertion(): JsonField<Boolean> = isAssertion

    /**
     * Returns the raw JSON value of [isRequired].
     *
     * Unlike [isRequired], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_required") @ExcludeMissing fun _isRequired(): JsonField<Boolean> = isRequired

    /**
     * Returns the raw JSON value of [regexValidator].
     *
     * Unlike [regexValidator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regex_validator")
    @ExcludeMissing
    fun _regexValidator(): JsonField<RegexValidator> = regexValidator

    /**
     * Returns the raw JSON value of [scoreDescriptions].
     *
     * Unlike [scoreDescriptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("score_descriptions")
    @ExcludeMissing
    fun _scoreDescriptions(): JsonField<ScoreDescriptions> = scoreDescriptions

    /**
     * Returns the raw JSON value of [valueDescriptions].
     *
     * Unlike [valueDescriptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("value_descriptions")
    @ExcludeMissing
    fun _valueDescriptions(): JsonField<ValueDescriptions> = valueDescriptions

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
         * [AnnotationQueueRubricItemSchema].
         *
         * The following fields are required:
         * ```java
         * .feedbackKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueRubricItemSchema]. */
    class Builder internal constructor() {

        private var feedbackKey: JsonField<String>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
        private var feedbackConfigId: JsonField<String> = JsonMissing.of()
        private var isAssertion: JsonField<Boolean> = JsonMissing.of()
        private var isRequired: JsonField<Boolean> = JsonMissing.of()
        private var regexValidator: JsonField<RegexValidator> = JsonMissing.of()
        private var scoreDescriptions: JsonField<ScoreDescriptions> = JsonMissing.of()
        private var valueDescriptions: JsonField<ValueDescriptions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRubricItemSchema: AnnotationQueueRubricItemSchema) =
            apply {
                feedbackKey = annotationQueueRubricItemSchema.feedbackKey
                description = annotationQueueRubricItemSchema.description
                feedbackConfig = annotationQueueRubricItemSchema.feedbackConfig
                feedbackConfigId = annotationQueueRubricItemSchema.feedbackConfigId
                isAssertion = annotationQueueRubricItemSchema.isAssertion
                isRequired = annotationQueueRubricItemSchema.isRequired
                regexValidator = annotationQueueRubricItemSchema.regexValidator
                scoreDescriptions = annotationQueueRubricItemSchema.scoreDescriptions
                valueDescriptions = annotationQueueRubricItemSchema.valueDescriptions
                additionalProperties =
                    annotationQueueRubricItemSchema.additionalProperties.toMutableMap()
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

        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun feedbackConfigId(feedbackConfigId: String?) =
            feedbackConfigId(JsonField.ofNullable(feedbackConfigId))

        /** Alias for calling [Builder.feedbackConfigId] with `feedbackConfigId.orElse(null)`. */
        fun feedbackConfigId(feedbackConfigId: Optional<String>) =
            feedbackConfigId(feedbackConfigId.getOrNull())

        /**
         * Sets [Builder.feedbackConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackConfigId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackConfigId(feedbackConfigId: JsonField<String>) = apply {
            this.feedbackConfigId = feedbackConfigId
        }

        fun isAssertion(isAssertion: Boolean?) = isAssertion(JsonField.ofNullable(isAssertion))

        /**
         * Alias for [Builder.isAssertion].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isAssertion(isAssertion: Boolean) = isAssertion(isAssertion as Boolean?)

        /** Alias for calling [Builder.isAssertion] with `isAssertion.orElse(null)`. */
        fun isAssertion(isAssertion: Optional<Boolean>) = isAssertion(isAssertion.getOrNull())

        /**
         * Sets [Builder.isAssertion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isAssertion] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isAssertion(isAssertion: JsonField<Boolean>) = apply { this.isAssertion = isAssertion }

        fun isRequired(isRequired: Boolean?) = isRequired(JsonField.ofNullable(isRequired))

        /**
         * Alias for [Builder.isRequired].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun isRequired(isRequired: Boolean) = isRequired(isRequired as Boolean?)

        /** Alias for calling [Builder.isRequired] with `isRequired.orElse(null)`. */
        fun isRequired(isRequired: Optional<Boolean>) = isRequired(isRequired.getOrNull())

        /**
         * Sets [Builder.isRequired] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRequired] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRequired(isRequired: JsonField<Boolean>) = apply { this.isRequired = isRequired }

        fun regexValidator(regexValidator: RegexValidator?) =
            regexValidator(JsonField.ofNullable(regexValidator))

        /** Alias for calling [Builder.regexValidator] with `regexValidator.orElse(null)`. */
        fun regexValidator(regexValidator: Optional<RegexValidator>) =
            regexValidator(regexValidator.getOrNull())

        /**
         * Sets [Builder.regexValidator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regexValidator] with a well-typed [RegexValidator] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regexValidator(regexValidator: JsonField<RegexValidator>) = apply {
            this.regexValidator = regexValidator
        }

        /** Alias for calling [regexValidator] with `RegexValidator.ofString(string)`. */
        fun regexValidator(string: String) = regexValidator(RegexValidator.ofString(string))

        /** Alias for calling [regexValidator] with `RegexValidator.ofMissing(missing)`. */
        fun regexValidator(missing: Missing) = regexValidator(RegexValidator.ofMissing(missing))

        fun scoreDescriptions(scoreDescriptions: ScoreDescriptions?) =
            scoreDescriptions(JsonField.ofNullable(scoreDescriptions))

        /** Alias for calling [Builder.scoreDescriptions] with `scoreDescriptions.orElse(null)`. */
        fun scoreDescriptions(scoreDescriptions: Optional<ScoreDescriptions>) =
            scoreDescriptions(scoreDescriptions.getOrNull())

        /**
         * Sets [Builder.scoreDescriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scoreDescriptions] with a well-typed [ScoreDescriptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scoreDescriptions(scoreDescriptions: JsonField<ScoreDescriptions>) = apply {
            this.scoreDescriptions = scoreDescriptions
        }

        fun valueDescriptions(valueDescriptions: ValueDescriptions?) =
            valueDescriptions(JsonField.ofNullable(valueDescriptions))

        /** Alias for calling [Builder.valueDescriptions] with `valueDescriptions.orElse(null)`. */
        fun valueDescriptions(valueDescriptions: Optional<ValueDescriptions>) =
            valueDescriptions(valueDescriptions.getOrNull())

        /**
         * Sets [Builder.valueDescriptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueDescriptions] with a well-typed [ValueDescriptions]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun valueDescriptions(valueDescriptions: JsonField<ValueDescriptions>) = apply {
            this.valueDescriptions = valueDescriptions
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
         * Returns an immutable instance of [AnnotationQueueRubricItemSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AnnotationQueueRubricItemSchema =
            AnnotationQueueRubricItemSchema(
                checkRequired("feedbackKey", feedbackKey),
                description,
                feedbackConfig,
                feedbackConfigId,
                isAssertion,
                isRequired,
                regexValidator,
                scoreDescriptions,
                valueDescriptions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LangChainInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AnnotationQueueRubricItemSchema = apply {
        if (validated) {
            return@apply
        }

        feedbackKey()
        description()
        feedbackConfig().ifPresent { it.validate() }
        feedbackConfigId()
        isAssertion()
        isRequired()
        regexValidator().ifPresent { it.validate() }
        scoreDescriptions().ifPresent { it.validate() }
        valueDescriptions().ifPresent { it.validate() }
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
        (if (feedbackKey.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (feedbackConfigId.asKnown().isPresent) 1 else 0) +
            (if (isAssertion.asKnown().isPresent) 1 else 0) +
            (if (isRequired.asKnown().isPresent) 1 else 0) +
            (regexValidator.asKnown().getOrNull()?.validity() ?: 0) +
            (scoreDescriptions.asKnown().getOrNull()?.validity() ?: 0) +
            (valueDescriptions.asKnown().getOrNull()?.validity() ?: 0)

    class FeedbackConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val feedbackConfig: JsonField<InnerFeedbackConfig>,
        private val feedbackKey: JsonField<String>,
        private val modifiedAt: JsonField<OffsetDateTime>,
        private val tenantId: JsonField<String>,
        private val isLowerScoreBetter: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feedback_config")
            @ExcludeMissing
            feedbackConfig: JsonField<InnerFeedbackConfig> = JsonMissing.of(),
            @JsonProperty("feedback_key")
            @ExcludeMissing
            feedbackKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("modified_at")
            @ExcludeMissing
            modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tenant_id")
            @ExcludeMissing
            tenantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_lower_score_better")
            @ExcludeMissing
            isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            feedbackConfig,
            feedbackKey,
            modifiedAt,
            tenantId,
            isLowerScoreBetter,
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
        fun feedbackConfig(): InnerFeedbackConfig = feedbackConfig.getRequired("feedback_config")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tenantId(): String = tenantId.getRequired("tenant_id")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isLowerScoreBetter(): Optional<Boolean> =
            isLowerScoreBetter.getOptional("is_lower_score_better")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [feedbackConfig].
         *
         * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_config")
        @ExcludeMissing
        fun _feedbackConfig(): JsonField<InnerFeedbackConfig> = feedbackConfig

        /**
         * Returns the raw JSON value of [feedbackKey].
         *
         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feedback_key")
        @ExcludeMissing
        fun _feedbackKey(): JsonField<String> = feedbackKey

        /**
         * Returns the raw JSON value of [modifiedAt].
         *
         * Unlike [modifiedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("modified_at")
        @ExcludeMissing
        fun _modifiedAt(): JsonField<OffsetDateTime> = modifiedAt

        /**
         * Returns the raw JSON value of [tenantId].
         *
         * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

        /**
         * Returns the raw JSON value of [isLowerScoreBetter].
         *
         * Unlike [isLowerScoreBetter], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("is_lower_score_better")
        @ExcludeMissing
        fun _isLowerScoreBetter(): JsonField<Boolean> = isLowerScoreBetter

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
             * .id()
             * .feedbackConfig()
             * .feedbackKey()
             * .modifiedAt()
             * .tenantId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackConfig]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var feedbackConfig: JsonField<InnerFeedbackConfig>? = null
            private var feedbackKey: JsonField<String>? = null
            private var modifiedAt: JsonField<OffsetDateTime>? = null
            private var tenantId: JsonField<String>? = null
            private var isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackConfig: FeedbackConfig) = apply {
                id = feedbackConfig.id
                this.feedbackConfig = feedbackConfig.feedbackConfig
                feedbackKey = feedbackConfig.feedbackKey
                modifiedAt = feedbackConfig.modifiedAt
                tenantId = feedbackConfig.tenantId
                isLowerScoreBetter = feedbackConfig.isLowerScoreBetter
                additionalProperties = feedbackConfig.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun feedbackConfig(feedbackConfig: InnerFeedbackConfig) =
                feedbackConfig(JsonField.of(feedbackConfig))

            /**
             * Sets [Builder.feedbackConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackConfig] with a well-typed
             * [InnerFeedbackConfig] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun feedbackConfig(feedbackConfig: JsonField<InnerFeedbackConfig>) = apply {
                this.feedbackConfig = feedbackConfig
            }

            fun feedbackKey(feedbackKey: String) = feedbackKey(JsonField.of(feedbackKey))

            /**
             * Sets [Builder.feedbackKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feedbackKey(feedbackKey: JsonField<String>) = apply {
                this.feedbackKey = feedbackKey
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

            fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

            /**
             * Sets [Builder.tenantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tenantId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

            fun isLowerScoreBetter(isLowerScoreBetter: Boolean?) =
                isLowerScoreBetter(JsonField.ofNullable(isLowerScoreBetter))

            /**
             * Alias for [Builder.isLowerScoreBetter].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun isLowerScoreBetter(isLowerScoreBetter: Boolean) =
                isLowerScoreBetter(isLowerScoreBetter as Boolean?)

            /**
             * Alias for calling [Builder.isLowerScoreBetter] with
             * `isLowerScoreBetter.orElse(null)`.
             */
            fun isLowerScoreBetter(isLowerScoreBetter: Optional<Boolean>) =
                isLowerScoreBetter(isLowerScoreBetter.getOrNull())

            /**
             * Sets [Builder.isLowerScoreBetter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isLowerScoreBetter] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun isLowerScoreBetter(isLowerScoreBetter: JsonField<Boolean>) = apply {
                this.isLowerScoreBetter = isLowerScoreBetter
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
             * Returns an immutable instance of [FeedbackConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .feedbackConfig()
             * .feedbackKey()
             * .modifiedAt()
             * .tenantId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FeedbackConfig =
                FeedbackConfig(
                    checkRequired("id", id),
                    checkRequired("feedbackConfig", feedbackConfig),
                    checkRequired("feedbackKey", feedbackKey),
                    checkRequired("modifiedAt", modifiedAt),
                    checkRequired("tenantId", tenantId),
                    isLowerScoreBetter,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): FeedbackConfig = apply {
            if (validated) {
                return@apply
            }

            id()
            feedbackConfig().validate()
            feedbackKey()
            modifiedAt()
            tenantId()
            isLowerScoreBetter()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                (if (modifiedAt.asKnown().isPresent) 1 else 0) +
                (if (tenantId.asKnown().isPresent) 1 else 0) +
                (if (isLowerScoreBetter.asKnown().isPresent) 1 else 0)

        class InnerFeedbackConfig
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
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun categories(): Optional<List<Category>> = categories.getOptional("categories")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun max(): Optional<Double> = max.getOptional("max")

            /**
             * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
             * Unlike [categories], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [InnerFeedbackConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InnerFeedbackConfig]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var categories: JsonField<MutableList<Category>>? = null
                private var max: JsonField<Double> = JsonMissing.of()
                private var min: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(innerFeedbackConfig: InnerFeedbackConfig) = apply {
                    type = innerFeedbackConfig.type
                    categories = innerFeedbackConfig.categories.map { it.toMutableList() }
                    max = innerFeedbackConfig.max
                    min = innerFeedbackConfig.min
                    additionalProperties = innerFeedbackConfig.additionalProperties.toMutableMap()
                }

                /** Enum for feedback types. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.categories] with a well-typed `List<Category>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.max] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
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
                 * You should usually call [Builder.min] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun min(min: JsonField<Double>) = apply { this.min = min }

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
                 * Returns an immutable instance of [InnerFeedbackConfig].
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
                fun build(): InnerFeedbackConfig =
                    InnerFeedbackConfig(
                        checkRequired("type", type),
                        (categories ?: JsonMissing.of()).map { it.toImmutable() },
                        max,
                        min,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LangChainInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InnerFeedbackConfig = apply {
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
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTINUOUS,
                    CATEGORICAL,
                    FREEFORM,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws LangChainInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws LangChainInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LangChainInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("label")
                    @ExcludeMissing
                    label: JsonField<String> = JsonMissing.of(),
                ) : this(value, label, mutableMapOf())

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun value(): Double = value.getRequired("value")

                /**
                 * @throws LangChainInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun label(): Optional<String> = label.getOptional("label")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

                /**
                 * Returns the raw JSON value of [label].
                 *
                 * Unlike [label], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * You should usually call [Builder.value] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<Double>) = apply { this.value = value }

                    fun label(label: String?) = label(JsonField.ofNullable(label))

                    /** Alias for calling [Builder.label] with `label.orElse(null)`. */
                    fun label(label: Optional<String>) = label(label.getOrNull())

                    /**
                     * Sets [Builder.label] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.label] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LangChainInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

                private val hashCode: Int by lazy {
                    Objects.hash(value, label, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Category{value=$value, label=$label, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InnerFeedbackConfig &&
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
                "InnerFeedbackConfig{type=$type, categories=$categories, max=$max, min=$min, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackConfig &&
                id == other.id &&
                feedbackConfig == other.feedbackConfig &&
                feedbackKey == other.feedbackKey &&
                modifiedAt == other.modifiedAt &&
                tenantId == other.tenantId &&
                isLowerScoreBetter == other.isLowerScoreBetter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                feedbackConfig,
                feedbackKey,
                modifiedAt,
                tenantId,
                isLowerScoreBetter,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeedbackConfig{id=$id, feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, modifiedAt=$modifiedAt, tenantId=$tenantId, isLowerScoreBetter=$isLowerScoreBetter, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = RegexValidator.Deserializer::class)
    @JsonSerialize(using = RegexValidator.Serializer::class)
    class RegexValidator
    private constructor(
        private val string: String? = null,
        private val missing: Missing? = null,
        private val _json: JsonValue? = null,
    ) {

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun missing(): Optional<Missing> = Optional.ofNullable(missing)

        fun isString(): Boolean = string != null

        fun isMissing(): Boolean = missing != null

        fun asString(): String = string.getOrThrow("string")

        fun asMissing(): Missing = missing.getOrThrow("missing")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.langchain.smith.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = regexValidator.accept(new RegexValidator.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitString(String string) {
         *         return Optional.of(string.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws LangChainInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
         *   and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                missing != null -> visitor.visitMissing(missing)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RegexValidator = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitString(string: String) {}

                    override fun visitMissing(missing: Missing) {
                        missing.validate()
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
                    override fun visitString(string: String) = 1

                    override fun visitMissing(missing: Missing) = missing.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RegexValidator && string == other.string && missing == other.missing
        }

        override fun hashCode(): Int = Objects.hash(string, missing)

        override fun toString(): String =
            when {
                string != null -> "RegexValidator{string=$string}"
                missing != null -> "RegexValidator{missing=$missing}"
                _json != null -> "RegexValidator{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid RegexValidator")
            }

        companion object {

            @JvmStatic fun ofString(string: String) = RegexValidator(string = string)

            @JvmStatic fun ofMissing(missing: Missing) = RegexValidator(missing = missing)
        }

        /**
         * An interface that defines how to map each variant of [RegexValidator] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitMissing(missing: Missing): T

            /**
             * Maps an unknown variant of [RegexValidator] to a value of type [T].
             *
             * An instance of [RegexValidator] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LangChainInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LangChainInvalidDataException("Unknown RegexValidator: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<RegexValidator>(RegexValidator::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): RegexValidator {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<Missing>())?.let {
                                RegexValidator(missing = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<String>())?.let {
                                RegexValidator(string = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> RegexValidator(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<RegexValidator>(RegexValidator::class) {

            override fun serialize(
                value: RegexValidator,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.string != null -> generator.writeObject(value.string)
                    value.missing != null -> generator.writeObject(value.missing)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid RegexValidator")
                }
            }
        }
    }

    class ScoreDescriptions
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

            /** Returns a mutable builder for constructing an instance of [ScoreDescriptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScoreDescriptions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scoreDescriptions: ScoreDescriptions) = apply {
                additionalProperties = scoreDescriptions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ScoreDescriptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ScoreDescriptions = ScoreDescriptions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ScoreDescriptions = apply {
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

            return other is ScoreDescriptions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ScoreDescriptions{additionalProperties=$additionalProperties}"
    }

    class ValueDescriptions
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

            /** Returns a mutable builder for constructing an instance of [ValueDescriptions]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ValueDescriptions]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(valueDescriptions: ValueDescriptions) = apply {
                additionalProperties = valueDescriptions.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ValueDescriptions].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ValueDescriptions = ValueDescriptions(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ValueDescriptions = apply {
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

            return other is ValueDescriptions && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ValueDescriptions{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueRubricItemSchema &&
            feedbackKey == other.feedbackKey &&
            description == other.description &&
            feedbackConfig == other.feedbackConfig &&
            feedbackConfigId == other.feedbackConfigId &&
            isAssertion == other.isAssertion &&
            isRequired == other.isRequired &&
            regexValidator == other.regexValidator &&
            scoreDescriptions == other.scoreDescriptions &&
            valueDescriptions == other.valueDescriptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            feedbackKey,
            description,
            feedbackConfig,
            feedbackConfigId,
            isAssertion,
            isRequired,
            regexValidator,
            scoreDescriptions,
            valueDescriptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueRubricItemSchema{feedbackKey=$feedbackKey, description=$description, feedbackConfig=$feedbackConfig, feedbackConfigId=$feedbackConfigId, isAssertion=$isAssertion, isRequired=$isRequired, regexValidator=$regexValidator, scoreDescriptions=$scoreDescriptions, valueDescriptions=$valueDescriptions, additionalProperties=$additionalProperties}"
}
