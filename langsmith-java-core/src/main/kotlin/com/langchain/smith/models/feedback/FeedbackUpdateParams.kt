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
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.allMaxBy
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.getOrThrow
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace an existing feedback entry with a new, modified entry. */
class FeedbackUpdateParams
private constructor(
    private val feedbackId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun feedbackId(): Optional<String> = Optional.ofNullable(feedbackId)

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun comment(): Optional<String> = body.comment()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correction(): Optional<Correction> = body.correction()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = body.feedbackConfig()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun score(): Optional<Score> = body.score()

    /**
     * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun value(): Optional<Value> = body.value()

    /**
     * Returns the raw JSON value of [comment].
     *
     * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _comment(): JsonField<String> = body._comment()

    /**
     * Returns the raw JSON value of [correction].
     *
     * Unlike [correction], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _correction(): JsonField<Correction> = body._correction()

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feedbackConfig(): JsonField<FeedbackConfig> = body._feedbackConfig()

    /**
     * Returns the raw JSON value of [score].
     *
     * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _score(): JsonField<Score> = body._score()

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _value(): JsonField<Value> = body._value()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FeedbackUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FeedbackUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackUpdateParams]. */
    class Builder internal constructor() {

        private var feedbackId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(feedbackUpdateParams: FeedbackUpdateParams) = apply {
            feedbackId = feedbackUpdateParams.feedbackId
            body = feedbackUpdateParams.body.toBuilder()
            additionalHeaders = feedbackUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = feedbackUpdateParams.additionalQueryParams.toBuilder()
        }

        fun feedbackId(feedbackId: String?) = apply { this.feedbackId = feedbackId }

        /** Alias for calling [Builder.feedbackId] with `feedbackId.orElse(null)`. */
        fun feedbackId(feedbackId: Optional<String>) = feedbackId(feedbackId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [comment]
         * - [correction]
         * - [feedbackConfig]
         * - [score]
         * - [value]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun comment(comment: String?) = apply { body.comment(comment) }

        /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
        fun comment(comment: Optional<String>) = comment(comment.getOrNull())

        /**
         * Sets [Builder.comment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.comment] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun comment(comment: JsonField<String>) = apply { body.comment(comment) }

        fun correction(correction: Correction?) = apply { body.correction(correction) }

        /** Alias for calling [Builder.correction] with `correction.orElse(null)`. */
        fun correction(correction: Optional<Correction>) = correction(correction.getOrNull())

        /**
         * Sets [Builder.correction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correction] with a well-typed [Correction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun correction(correction: JsonField<Correction>) = apply { body.correction(correction) }

        /** Alias for calling [correction] with `Correction.ofJsonValue(jsonValue)`. */
        fun correction(jsonValue: JsonValue) = apply { body.correction(jsonValue) }

        /** Alias for calling [correction] with `Correction.ofString(string)`. */
        fun correction(string: String) = apply { body.correction(string) }

        fun feedbackConfig(feedbackConfig: FeedbackConfig?) = apply {
            body.feedbackConfig(feedbackConfig)
        }

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
            body.feedbackConfig(feedbackConfig)
        }

        fun score(score: Score?) = apply { body.score(score) }

        /** Alias for calling [Builder.score] with `score.orElse(null)`. */
        fun score(score: Optional<Score>) = score(score.getOrNull())

        /**
         * Sets [Builder.score] to an arbitrary JSON value.
         *
         * You should usually call [Builder.score] with a well-typed [Score] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun score(score: JsonField<Score>) = apply { body.score(score) }

        /** Alias for calling [score] with `Score.ofNumber(number)`. */
        fun score(number: Double) = apply { body.score(number) }

        /** Alias for calling [score] with `Score.ofBool(bool)`. */
        fun score(bool: Boolean) = apply { body.score(bool) }

        fun value(value: Value?) = apply { body.value(value) }

        /** Alias for calling [Builder.value] with `value.orElse(null)`. */
        fun value(value: Optional<Value>) = value(value.getOrNull())

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Value] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Value>) = apply { body.value(value) }

        /** Alias for calling [value] with `Value.ofNumber(number)`. */
        fun value(number: Double) = apply { body.value(number) }

        /** Alias for calling [value] with `Value.ofBool(bool)`. */
        fun value(bool: Boolean) = apply { body.value(bool) }

        /** Alias for calling [value] with `Value.ofString(string)`. */
        fun value(string: String) = apply { body.value(string) }

        /** Alias for calling [value] with `Value.ofJson(json)`. */
        fun value(json: JsonValue) = apply { body.value(json) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [FeedbackUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FeedbackUpdateParams =
            FeedbackUpdateParams(
                feedbackId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> feedbackId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Schema used for updating feedback */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val comment: JsonField<String>,
        private val correction: JsonField<Correction>,
        private val feedbackConfig: JsonField<FeedbackConfig>,
        private val score: JsonField<Score>,
        private val value: JsonField<Value>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("comment") @ExcludeMissing comment: JsonField<String> = JsonMissing.of(),
            @JsonProperty("correction")
            @ExcludeMissing
            correction: JsonField<Correction> = JsonMissing.of(),
            @JsonProperty("feedback_config")
            @ExcludeMissing
            feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Score> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value> = JsonMissing.of(),
        ) : this(comment, correction, feedbackConfig, score, value, mutableMapOf())

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun comment(): Optional<String> = comment.getOptional("comment")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correction(): Optional<Correction> = correction.getOptional("correction")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun feedbackConfig(): Optional<FeedbackConfig> =
            feedbackConfig.getOptional("feedback_config")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun score(): Optional<Score> = score.getOptional("score")

        /**
         * @throws LangChainInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<Value> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [comment].
         *
         * Unlike [comment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("comment") @ExcludeMissing fun _comment(): JsonField<String> = comment

        /**
         * Returns the raw JSON value of [correction].
         *
         * Unlike [correction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("correction")
        @ExcludeMissing
        fun _correction(): JsonField<Correction> = correction

        /**
         * Returns the raw JSON value of [feedbackConfig].
         *
         * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("feedback_config")
        @ExcludeMissing
        fun _feedbackConfig(): JsonField<FeedbackConfig> = feedbackConfig

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var comment: JsonField<String> = JsonMissing.of()
            private var correction: JsonField<Correction> = JsonMissing.of()
            private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
            private var score: JsonField<Score> = JsonMissing.of()
            private var value: JsonField<Value> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                comment = body.comment
                correction = body.correction
                feedbackConfig = body.feedbackConfig
                score = body.score
                value = body.value
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun comment(comment: String?) = comment(JsonField.ofNullable(comment))

            /** Alias for calling [Builder.comment] with `comment.orElse(null)`. */
            fun comment(comment: Optional<String>) = comment(comment.getOrNull())

            /**
             * Sets [Builder.comment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.comment] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun comment(comment: JsonField<String>) = apply { this.comment = comment }

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
            fun correction(correction: JsonField<Correction>) = apply {
                this.correction = correction
            }

            /** Alias for calling [correction] with `Correction.ofJsonValue(jsonValue)`. */
            fun correction(jsonValue: JsonValue) = correction(Correction.ofJsonValue(jsonValue))

            /** Alias for calling [correction] with `Correction.ofString(string)`. */
            fun correction(string: String) = correction(Correction.ofString(string))

            fun feedbackConfig(feedbackConfig: FeedbackConfig?) =
                feedbackConfig(JsonField.ofNullable(feedbackConfig))

            /** Alias for calling [Builder.feedbackConfig] with `feedbackConfig.orElse(null)`. */
            fun feedbackConfig(feedbackConfig: Optional<FeedbackConfig>) =
                feedbackConfig(feedbackConfig.getOrNull())

            /**
             * Sets [Builder.feedbackConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feedbackConfig] with a well-typed [FeedbackConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun feedbackConfig(feedbackConfig: JsonField<FeedbackConfig>) = apply {
                this.feedbackConfig = feedbackConfig
            }

            fun score(score: Score?) = score(JsonField.ofNullable(score))

            /** Alias for calling [Builder.score] with `score.orElse(null)`. */
            fun score(score: Optional<Score>) = score(score.getOrNull())

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Score] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    comment,
                    correction,
                    feedbackConfig,
                    score,
                    value,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            comment()
            correction().ifPresent { it.validate() }
            feedbackConfig().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (comment.asKnown().isPresent) 1 else 0) +
                (correction.asKnown().getOrNull()?.validity() ?: 0) +
                (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (score.asKnown().getOrNull()?.validity() ?: 0) +
                (value.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                comment == other.comment &&
                correction == other.correction &&
                feedbackConfig == other.feedbackConfig &&
                score == other.score &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(comment, correction, feedbackConfig, score, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{comment=$comment, correction=$correction, feedbackConfig=$feedbackConfig, score=$score, value=$value, additionalProperties=$additionalProperties}"
    }

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

        return other is FeedbackUpdateParams &&
            feedbackId == other.feedbackId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(feedbackId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackUpdateParams{feedbackId=$feedbackId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
