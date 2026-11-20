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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AnnotationQueueItemKeyReviews
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val answer: JsonField<AnnotationQueueItemAnswer>,
    private val final_: JsonField<AnnotationQueueItemAnswer>,
    private val finalSetAt: JsonField<OffsetDateTime>,
    private val finalSetBy: JsonField<String>,
    private val hasFinal: JsonField<Boolean>,
    private val key: JsonField<String>,
    private val reviews: JsonField<List<Review>>,
    private val state: JsonField<AnnotationQueueItemAgreementState>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("answer")
        @ExcludeMissing
        answer: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of(),
        @JsonProperty("final")
        @ExcludeMissing
        final_: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of(),
        @JsonProperty("final_set_at")
        @ExcludeMissing
        finalSetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("final_set_by")
        @ExcludeMissing
        finalSetBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_final") @ExcludeMissing hasFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reviews")
        @ExcludeMissing
        reviews: JsonField<List<Review>> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        state: JsonField<AnnotationQueueItemAgreementState> = JsonMissing.of(),
    ) : this(answer, final_, finalSetAt, finalSetBy, hasFinal, key, reviews, state, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answer(): Optional<AnnotationQueueItemAnswer> = answer.getOptional("answer")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun final_(): Optional<AnnotationQueueItemAnswer> = final_.getOptional("final")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finalSetAt(): Optional<OffsetDateTime> = finalSetAt.getOptional("final_set_at")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun finalSetBy(): Optional<String> = finalSetBy.getOptional("final_set_by")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hasFinal(): Optional<Boolean> = hasFinal.getOptional("has_final")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun key(): Optional<String> = key.getOptional("key")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reviews(): Optional<List<Review>> = reviews.getOptional("reviews")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun state(): Optional<AnnotationQueueItemAgreementState> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [answer].
     *
     * Unlike [answer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("answer")
    @ExcludeMissing
    fun _answer(): JsonField<AnnotationQueueItemAnswer> = answer

    /**
     * Returns the raw JSON value of [final_].
     *
     * Unlike [final_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("final")
    @ExcludeMissing
    fun _final_(): JsonField<AnnotationQueueItemAnswer> = final_

    /**
     * Returns the raw JSON value of [finalSetAt].
     *
     * Unlike [finalSetAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("final_set_at")
    @ExcludeMissing
    fun _finalSetAt(): JsonField<OffsetDateTime> = finalSetAt

    /**
     * Returns the raw JSON value of [finalSetBy].
     *
     * Unlike [finalSetBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("final_set_by") @ExcludeMissing fun _finalSetBy(): JsonField<String> = finalSetBy

    /**
     * Returns the raw JSON value of [hasFinal].
     *
     * Unlike [hasFinal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("has_final") @ExcludeMissing fun _hasFinal(): JsonField<Boolean> = hasFinal

    /**
     * Returns the raw JSON value of [key].
     *
     * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

    /**
     * Returns the raw JSON value of [reviews].
     *
     * Unlike [reviews], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reviews") @ExcludeMissing fun _reviews(): JsonField<List<Review>> = reviews

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state")
    @ExcludeMissing
    fun _state(): JsonField<AnnotationQueueItemAgreementState> = state

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
         * [AnnotationQueueItemKeyReviews].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AnnotationQueueItemKeyReviews]. */
    class Builder internal constructor() {

        private var answer: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of()
        private var final_: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of()
        private var finalSetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var finalSetBy: JsonField<String> = JsonMissing.of()
        private var hasFinal: JsonField<Boolean> = JsonMissing.of()
        private var key: JsonField<String> = JsonMissing.of()
        private var reviews: JsonField<MutableList<Review>>? = null
        private var state: JsonField<AnnotationQueueItemAgreementState> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueItemKeyReviews: AnnotationQueueItemKeyReviews) = apply {
            answer = annotationQueueItemKeyReviews.answer
            final_ = annotationQueueItemKeyReviews.final_
            finalSetAt = annotationQueueItemKeyReviews.finalSetAt
            finalSetBy = annotationQueueItemKeyReviews.finalSetBy
            hasFinal = annotationQueueItemKeyReviews.hasFinal
            key = annotationQueueItemKeyReviews.key
            reviews = annotationQueueItemKeyReviews.reviews.map { it.toMutableList() }
            state = annotationQueueItemKeyReviews.state
            additionalProperties = annotationQueueItemKeyReviews.additionalProperties.toMutableMap()
        }

        fun answer(answer: AnnotationQueueItemAnswer) = answer(JsonField.of(answer))

        /**
         * Sets [Builder.answer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answer] with a well-typed [AnnotationQueueItemAnswer]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun answer(answer: JsonField<AnnotationQueueItemAnswer>) = apply { this.answer = answer }

        fun final_(final_: AnnotationQueueItemAnswer) = final_(JsonField.of(final_))

        /**
         * Sets [Builder.final_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.final_] with a well-typed [AnnotationQueueItemAnswer]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun final_(final_: JsonField<AnnotationQueueItemAnswer>) = apply { this.final_ = final_ }

        fun finalSetAt(finalSetAt: OffsetDateTime) = finalSetAt(JsonField.of(finalSetAt))

        /**
         * Sets [Builder.finalSetAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalSetAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun finalSetAt(finalSetAt: JsonField<OffsetDateTime>) = apply {
            this.finalSetAt = finalSetAt
        }

        fun finalSetBy(finalSetBy: String) = finalSetBy(JsonField.of(finalSetBy))

        /**
         * Sets [Builder.finalSetBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.finalSetBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun finalSetBy(finalSetBy: JsonField<String>) = apply { this.finalSetBy = finalSetBy }

        fun hasFinal(hasFinal: Boolean) = hasFinal(JsonField.of(hasFinal))

        /**
         * Sets [Builder.hasFinal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasFinal] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun hasFinal(hasFinal: JsonField<Boolean>) = apply { this.hasFinal = hasFinal }

        fun key(key: String) = key(JsonField.of(key))

        /**
         * Sets [Builder.key] to an arbitrary JSON value.
         *
         * You should usually call [Builder.key] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun key(key: JsonField<String>) = apply { this.key = key }

        fun reviews(reviews: List<Review>) = reviews(JsonField.of(reviews))

        /**
         * Sets [Builder.reviews] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reviews] with a well-typed `List<Review>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reviews(reviews: JsonField<List<Review>>) = apply {
            this.reviews = reviews.map { it.toMutableList() }
        }

        /**
         * Adds a single [Review] to [reviews].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addReview(review: Review) = apply {
            reviews =
                (reviews ?: JsonField.of(mutableListOf())).also {
                    checkKnown("reviews", it).add(review)
                }
        }

        fun state(state: AnnotationQueueItemAgreementState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed
         * [AnnotationQueueItemAgreementState] value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<AnnotationQueueItemAgreementState>) = apply {
            this.state = state
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
         * Returns an immutable instance of [AnnotationQueueItemKeyReviews].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AnnotationQueueItemKeyReviews =
            AnnotationQueueItemKeyReviews(
                answer,
                final_,
                finalSetAt,
                finalSetBy,
                hasFinal,
                key,
                (reviews ?: JsonMissing.of()).map { it.toImmutable() },
                state,
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
    fun validate(): AnnotationQueueItemKeyReviews = apply {
        if (validated) {
            return@apply
        }

        answer().ifPresent { it.validate() }
        final_().ifPresent { it.validate() }
        finalSetAt()
        finalSetBy()
        hasFinal()
        key()
        reviews().ifPresent { it.forEach { it.validate() } }
        state().ifPresent { it.validate() }
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
        (answer.asKnown().getOrNull()?.validity() ?: 0) +
            (final_.asKnown().getOrNull()?.validity() ?: 0) +
            (if (finalSetAt.asKnown().isPresent) 1 else 0) +
            (if (finalSetBy.asKnown().isPresent) 1 else 0) +
            (if (hasFinal.asKnown().isPresent) 1 else 0) +
            (if (key.asKnown().isPresent) 1 else 0) +
            (reviews.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0)

    class Review
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val answer: JsonField<AnnotationQueueItemAnswer>,
        private val lsUserId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("answer")
            @ExcludeMissing
            answer: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of(),
            @JsonProperty("ls_user_id")
            @ExcludeMissing
            lsUserId: JsonField<String> = JsonMissing.of(),
        ) : this(answer, lsUserId, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun answer(): Optional<AnnotationQueueItemAnswer> = answer.getOptional("answer")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun lsUserId(): Optional<String> = lsUserId.getOptional("ls_user_id")

        /**
         * Returns the raw JSON value of [answer].
         *
         * Unlike [answer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("answer")
        @ExcludeMissing
        fun _answer(): JsonField<AnnotationQueueItemAnswer> = answer

        /**
         * Returns the raw JSON value of [lsUserId].
         *
         * Unlike [lsUserId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ls_user_id") @ExcludeMissing fun _lsUserId(): JsonField<String> = lsUserId

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

            /** Returns a mutable builder for constructing an instance of [Review]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Review]. */
        class Builder internal constructor() {

            private var answer: JsonField<AnnotationQueueItemAnswer> = JsonMissing.of()
            private var lsUserId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(review: Review) = apply {
                answer = review.answer
                lsUserId = review.lsUserId
                additionalProperties = review.additionalProperties.toMutableMap()
            }

            fun answer(answer: AnnotationQueueItemAnswer) = answer(JsonField.of(answer))

            /**
             * Sets [Builder.answer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.answer] with a well-typed
             * [AnnotationQueueItemAnswer] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun answer(answer: JsonField<AnnotationQueueItemAnswer>) = apply {
                this.answer = answer
            }

            fun lsUserId(lsUserId: String) = lsUserId(JsonField.of(lsUserId))

            /**
             * Sets [Builder.lsUserId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lsUserId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lsUserId(lsUserId: JsonField<String>) = apply { this.lsUserId = lsUserId }

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
             * Returns an immutable instance of [Review].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Review = Review(answer, lsUserId, additionalProperties.toMutableMap())
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
        fun validate(): Review = apply {
            if (validated) {
                return@apply
            }

            answer().ifPresent { it.validate() }
            lsUserId()
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
            (answer.asKnown().getOrNull()?.validity() ?: 0) +
                (if (lsUserId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Review &&
                answer == other.answer &&
                lsUserId == other.lsUserId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(answer, lsUserId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Review{answer=$answer, lsUserId=$lsUserId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueItemKeyReviews &&
            answer == other.answer &&
            final_ == other.final_ &&
            finalSetAt == other.finalSetAt &&
            finalSetBy == other.finalSetBy &&
            hasFinal == other.hasFinal &&
            key == other.key &&
            reviews == other.reviews &&
            state == other.state &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            answer,
            final_,
            finalSetAt,
            finalSetBy,
            hasFinal,
            key,
            reviews,
            state,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AnnotationQueueItemKeyReviews{answer=$answer, final_=$final_, finalSetAt=$finalSetAt, finalSetBy=$finalSetBy, hasFinal=$hasFinal, key=$key, reviews=$reviews, state=$state, additionalProperties=$additionalProperties}"
}
