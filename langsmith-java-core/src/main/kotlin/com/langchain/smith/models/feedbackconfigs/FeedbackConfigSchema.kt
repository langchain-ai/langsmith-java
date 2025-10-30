// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedbackconfigs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FeedbackConfigSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val feedbackKey: JsonField<String>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val tenantId: JsonField<String>,
    private val isLowerScoreBetter: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_config")
        @ExcludeMissing
        feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
        @JsonProperty("feedback_key")
        @ExcludeMissing
        feedbackKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modified_at")
        @ExcludeMissing
        modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("tenant_id") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_lower_score_better")
        @ExcludeMissing
        isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of(),
    ) : this(feedbackConfig, feedbackKey, modifiedAt, tenantId, isLowerScoreBetter, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackConfig(): FeedbackConfig = feedbackConfig.getRequired("feedback_config")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tenantId(): String = tenantId.getRequired("tenant_id")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLowerScoreBetter(): Optional<Boolean> =
        isLowerScoreBetter.getOptional("is_lower_score_better")

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_config")
    @ExcludeMissing
    fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

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
     * Unlike [isLowerScoreBetter], this method doesn't throw if the JSON field has an unexpected
     * type.
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
         * Returns a mutable builder for constructing an instance of [FeedbackConfigSchema].
         *
         * The following fields are required:
         * ```java
         * .feedbackConfig()
         * .feedbackKey()
         * .modifiedAt()
         * .tenantId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackConfigSchema]. */
    class Builder internal constructor() {

        private var feedbackConfig: JsonField<FeedbackConfig>? = null
        private var feedbackKey: JsonField<String>? = null
        private var modifiedAt: JsonField<OffsetDateTime>? = null
        private var tenantId: JsonField<String>? = null
        private var isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackConfigSchema: FeedbackConfigSchema) = apply {
            feedbackConfig = feedbackConfigSchema.feedbackConfig
            feedbackKey = feedbackConfigSchema.feedbackKey
            modifiedAt = feedbackConfigSchema.modifiedAt
            tenantId = feedbackConfigSchema.tenantId
            isLowerScoreBetter = feedbackConfigSchema.isLowerScoreBetter
            additionalProperties = feedbackConfigSchema.additionalProperties.toMutableMap()
        }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            feedbackConfig(JsonField.of(feedbackConfig))

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

        fun feedbackKey(feedbackKey: String) = feedbackKey(JsonField.of(feedbackKey))

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { this.feedbackKey = feedbackKey }

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
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * Alias for calling [Builder.isLowerScoreBetter] with `isLowerScoreBetter.orElse(null)`.
         */
        fun isLowerScoreBetter(isLowerScoreBetter: Optional<Boolean>) =
            isLowerScoreBetter(isLowerScoreBetter.getOrNull())

        /**
         * Sets [Builder.isLowerScoreBetter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLowerScoreBetter] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * Returns an immutable instance of [FeedbackConfigSchema].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackConfig()
         * .feedbackKey()
         * .modifiedAt()
         * .tenantId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FeedbackConfigSchema =
            FeedbackConfigSchema(
                checkRequired("feedbackConfig", feedbackConfig),
                checkRequired("feedbackKey", feedbackKey),
                checkRequired("modifiedAt", modifiedAt),
                checkRequired("tenantId", tenantId),
                isLowerScoreBetter,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FeedbackConfigSchema = apply {
        if (validated) {
            return@apply
        }

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
        } catch (e: LangsmithInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (feedbackKey.asKnown().isPresent) 1 else 0) +
            (if (modifiedAt.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (isLowerScoreBetter.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfigSchema &&
            feedbackConfig == other.feedbackConfig &&
            feedbackKey == other.feedbackKey &&
            modifiedAt == other.modifiedAt &&
            tenantId == other.tenantId &&
            isLowerScoreBetter == other.isLowerScoreBetter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
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
        "FeedbackConfigSchema{feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, modifiedAt=$modifiedAt, tenantId=$tenantId, isLowerScoreBetter=$isLowerScoreBetter, additionalProperties=$additionalProperties}"
}
