// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueItemAnswer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val score: JsonField<Double>,
    private val scores: JsonField<List<Double>>,
    private val value: JsonField<String>,
    private val values: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("score") @ExcludeMissing score: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("scores") @ExcludeMissing scores: JsonField<List<Double>> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("values") @ExcludeMissing values: JsonField<List<String>> = JsonMissing.of(),
    ) : this(score, scores, value, values, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun score(): Optional<Double> = score.getOptional("score")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scores(): Optional<List<Double>> = scores.getOptional("scores")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<String> = value.getOptional("value")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun values(): Optional<List<String>> = values.getOptional("values")

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

    /**
     * Returns the raw JSON value of [scores].
     *
     * Unlike [scores], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scores") @ExcludeMissing fun _scores(): JsonField<List<Double>> = scores

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [values].
     *
     * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
         * Returns a mutable builder for constructing an instance of [AnnotationQueueItemAnswer].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueItemAnswer]. */
    class Builder internal constructor() {

        private var score: JsonField<Double> = JsonMissing.of()
        private var scores: JsonField<MutableList<Double>>? = null
        private var value: JsonField<String> = JsonMissing.of()
        private var values: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueItemAnswer: AnnotationQueueItemAnswer) = apply {
            score = annotationQueueItemAnswer.score
            scores = annotationQueueItemAnswer.scores.map { it.toMutableList() }
            value = annotationQueueItemAnswer.value
            values = annotationQueueItemAnswer.values.map { it.toMutableList() }
            additionalProperties = annotationQueueItemAnswer.additionalProperties.toMutableMap()
        }

        fun score(score: Double) = score(JsonField.of(score))

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Double>) = apply { this.score = score }

        fun scores(scores: List<Double>) = scores(JsonField.of(scores))

        /**
         * Sets [Builder.scores] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scores] with a well-typed `List<Double>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scores(scores: JsonField<List<Double>>) = apply {
            this.scores = scores.map { it.toMutableList() }
        }

        /**
         * Adds a single [Double] to [scores].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScore(score: Double) = apply {
            scores =
                (scores ?: JsonField.of(mutableListOf())).also {
                    checkKnown("scores", it).add(score)
                }
        }

        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        fun values(values: List<String>) = values(JsonField.of(values))

        /**
         * Sets [Builder.values] to an arbitrary JSON value.
         *
         * You should usually call [Builder.values] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun values(values: JsonField<List<String>>) = apply {
            this.values = values.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [values].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValue(value: String) = apply {
            values =
                (values ?: JsonField.of(mutableListOf())).also {
                    checkKnown("values", it).add(value)
                }
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
         * Returns an immutable instance of [AnnotationQueueItemAnswer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AnnotationQueueItemAnswer =
            AnnotationQueueItemAnswer(
                score,
                (scores ?: JsonMissing.of()).map { it.toImmutable() },
                value,
                (values ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): AnnotationQueueItemAnswer = apply {
        if (validated) {
            return@apply
        }

        score()
        scores()
        value()
        values()
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
        (if (score.asKnown().isPresent) 1 else 0) +
            (scores.asKnown().getOrNull()?.size ?: 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (values.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueItemAnswer &&
            score == other.score &&
            scores == other.scores &&
            value == other.value &&
            values == other.values &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(score, scores, value, values, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueItemAnswer{score=$score, scores=$scores, value=$value, values=$values, additionalProperties=$additionalProperties}"
}
