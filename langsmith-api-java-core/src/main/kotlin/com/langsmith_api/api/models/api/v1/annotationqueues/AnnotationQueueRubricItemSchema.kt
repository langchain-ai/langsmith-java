// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.annotationqueues

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueRubricItemSchema
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackKey: JsonField<String>,
    private val description: JsonField<String>,
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
        @JsonProperty("score_descriptions")
        @ExcludeMissing
        scoreDescriptions: JsonField<ScoreDescriptions> = JsonMissing.of(),
        @JsonProperty("value_descriptions")
        @ExcludeMissing
        valueDescriptions: JsonField<ValueDescriptions> = JsonMissing.of(),
    ) : this(feedbackKey, description, scoreDescriptions, valueDescriptions, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun scoreDescriptions(): Optional<ScoreDescriptions> =
        scoreDescriptions.getOptional("score_descriptions")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
        private var scoreDescriptions: JsonField<ScoreDescriptions> = JsonMissing.of()
        private var valueDescriptions: JsonField<ValueDescriptions> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueRubricItemSchema: AnnotationQueueRubricItemSchema) =
            apply {
                feedbackKey = annotationQueueRubricItemSchema.feedbackKey
                description = annotationQueueRubricItemSchema.description
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
                scoreDescriptions,
                valueDescriptions,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AnnotationQueueRubricItemSchema = apply {
        if (validated) {
            return@apply
        }

        feedbackKey()
        description()
        scoreDescriptions().ifPresent { it.validate() }
        valueDescriptions().ifPresent { it.validate() }
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
            (if (description.asKnown().isPresent) 1 else 0) +
            (scoreDescriptions.asKnown().getOrNull()?.validity() ?: 0) +
            (valueDescriptions.asKnown().getOrNull()?.validity() ?: 0)

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
            scoreDescriptions == other.scoreDescriptions &&
            valueDescriptions == other.valueDescriptions &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            feedbackKey,
            description,
            scoreDescriptions,
            valueDescriptions,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueRubricItemSchema{feedbackKey=$feedbackKey, description=$description, scoreDescriptions=$scoreDescriptions, valueDescriptions=$valueDescriptions, additionalProperties=$additionalProperties}"
}
