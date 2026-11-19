// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.items

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
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

class ItemSetFinalResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val answer: JsonField<Answer>,
    private val final_: JsonField<Final>,
    private val finalSetAt: JsonField<OffsetDateTime>,
    private val finalSetBy: JsonField<String>,
    private val hasFinal: JsonField<Boolean>,
    private val key: JsonField<String>,
    private val state: JsonField<State>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("answer") @ExcludeMissing answer: JsonField<Answer> = JsonMissing.of(),
        @JsonProperty("final") @ExcludeMissing final_: JsonField<Final> = JsonMissing.of(),
        @JsonProperty("final_set_at")
        @ExcludeMissing
        finalSetAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("final_set_by")
        @ExcludeMissing
        finalSetBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("has_final") @ExcludeMissing hasFinal: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
    ) : this(answer, final_, finalSetAt, finalSetBy, hasFinal, key, state, mutableMapOf())

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun answer(): Optional<Answer> = answer.getOptional("answer")

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun final_(): Optional<Final> = final_.getOptional("final")

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
    fun state(): Optional<State> = state.getOptional("state")

    /**
     * Returns the raw JSON value of [answer].
     *
     * Unlike [answer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("answer") @ExcludeMissing fun _answer(): JsonField<Answer> = answer

    /**
     * Returns the raw JSON value of [final_].
     *
     * Unlike [final_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("final") @ExcludeMissing fun _final_(): JsonField<Final> = final_

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
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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

        /** Returns a mutable builder for constructing an instance of [ItemSetFinalResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ItemSetFinalResponse]. */
    class Builder internal constructor() {

        private var answer: JsonField<Answer> = JsonMissing.of()
        private var final_: JsonField<Final> = JsonMissing.of()
        private var finalSetAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var finalSetBy: JsonField<String> = JsonMissing.of()
        private var hasFinal: JsonField<Boolean> = JsonMissing.of()
        private var key: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(itemSetFinalResponse: ItemSetFinalResponse) = apply {
            answer = itemSetFinalResponse.answer
            final_ = itemSetFinalResponse.final_
            finalSetAt = itemSetFinalResponse.finalSetAt
            finalSetBy = itemSetFinalResponse.finalSetBy
            hasFinal = itemSetFinalResponse.hasFinal
            key = itemSetFinalResponse.key
            state = itemSetFinalResponse.state
            additionalProperties = itemSetFinalResponse.additionalProperties.toMutableMap()
        }

        fun answer(answer: Answer) = answer(JsonField.of(answer))

        /**
         * Sets [Builder.answer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.answer] with a well-typed [Answer] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun answer(answer: JsonField<Answer>) = apply { this.answer = answer }

        fun final_(final_: Final) = final_(JsonField.of(final_))

        /**
         * Sets [Builder.final_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.final_] with a well-typed [Final] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun final_(final_: JsonField<Final>) = apply { this.final_ = final_ }

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

        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

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
         * Returns an immutable instance of [ItemSetFinalResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ItemSetFinalResponse =
            ItemSetFinalResponse(
                answer,
                final_,
                finalSetAt,
                finalSetBy,
                hasFinal,
                key,
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
    fun validate(): ItemSetFinalResponse = apply {
        if (validated) {
            return@apply
        }

        answer().ifPresent { it.validate() }
        final_().ifPresent { it.validate() }
        finalSetAt()
        finalSetBy()
        hasFinal()
        key()
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
            (state.asKnown().getOrNull()?.validity() ?: 0)

    class Answer
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
            @JsonProperty("scores")
            @ExcludeMissing
            scores: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(score, scores, value, values, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scores(): Optional<List<Double>> = scores.getOptional("scores")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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

            /** Returns a mutable builder for constructing an instance of [Answer]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Answer]. */
        class Builder internal constructor() {

            private var score: JsonField<Double> = JsonMissing.of()
            private var scores: JsonField<MutableList<Double>>? = null
            private var value: JsonField<String> = JsonMissing.of()
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(answer: Answer) = apply {
                score = answer.score
                scores = answer.scores.map { it.toMutableList() }
                value = answer.value
                values = answer.values.map { it.toMutableList() }
                additionalProperties = answer.additionalProperties.toMutableMap()
            }

            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            fun scores(scores: List<Double>) = scores(JsonField.of(scores))

            /**
             * Sets [Builder.scores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scores] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Answer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Answer =
                Answer(
                    score,
                    (scores ?: JsonMissing.of()).map { it.toImmutable() },
                    value,
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Answer = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Answer &&
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
            "Answer{score=$score, scores=$scores, value=$value, values=$values, additionalProperties=$additionalProperties}"
    }

    class Final
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
            @JsonProperty("scores")
            @ExcludeMissing
            scores: JsonField<List<Double>> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(score, scores, value, values, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Double> = score.getOptional("score")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scores(): Optional<List<Double>> = scores.getOptional("scores")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
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

            /** Returns a mutable builder for constructing an instance of [Final]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Final]. */
        class Builder internal constructor() {

            private var score: JsonField<Double> = JsonMissing.of()
            private var scores: JsonField<MutableList<Double>>? = null
            private var value: JsonField<String> = JsonMissing.of()
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(final_: Final) = apply {
                score = final_.score
                scores = final_.scores.map { it.toMutableList() }
                value = final_.value
                values = final_.values.map { it.toMutableList() }
                additionalProperties = final_.additionalProperties.toMutableMap()
            }

            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

            fun scores(scores: List<Double>) = scores(JsonField.of(scores))

            /**
             * Sets [Builder.scores] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scores] with a well-typed `List<Double>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Final].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Final =
                Final(
                    score,
                    (scores ?: JsonMissing.of()).map { it.toImmutable() },
                    value,
                    (values ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Final = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Final &&
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
            "Final{score=$score, scores=$scores, value=$value, values=$values, additionalProperties=$additionalProperties}"
    }

    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AGREED = of("agreed")

            @JvmField val DISAGREED = of("disagreed")

            @JvmField val NONE = of("none")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            AGREED,
            DISAGREED,
            NONE,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGREED,
            DISAGREED,
            NONE,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AGREED -> Value.AGREED
                DISAGREED -> Value.DISAGREED
                NONE -> Value.NONE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangChainInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AGREED -> Known.AGREED
                DISAGREED -> Known.DISAGREED
                NONE -> Known.NONE
                else -> throw LangChainInvalidDataException("Unknown State: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangChainInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LangChainInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): State = apply {
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

            return other is State && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ItemSetFinalResponse &&
            answer == other.answer &&
            final_ == other.final_ &&
            finalSetAt == other.finalSetAt &&
            finalSetBy == other.finalSetBy &&
            hasFinal == other.hasFinal &&
            key == other.key &&
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
            state,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ItemSetFinalResponse{answer=$answer, final_=$final_, finalSetAt=$finalSetAt, finalSetBy=$finalSetBy, hasFinal=$hasFinal, key=$key, state=$state, additionalProperties=$additionalProperties}"
}
