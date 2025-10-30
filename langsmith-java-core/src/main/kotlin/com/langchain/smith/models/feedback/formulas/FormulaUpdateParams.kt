// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.feedback.formulas

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.Enum
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkKnown
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Feedback Formula Ep */
class FormulaUpdateParams
private constructor(
    private val feedbackFormulaId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun feedbackFormulaId(): Optional<String> = Optional.ofNullable(feedbackFormulaId)

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregationType(): AggregationType = body.aggregationType()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = body.feedbackKey()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun formulaParts(): List<FeedbackFormulaWeightedVariable> = body.formulaParts()

    /**
     * Returns the raw JSON value of [aggregationType].
     *
     * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _aggregationType(): JsonField<AggregationType> = body._aggregationType()

    /**
     * Returns the raw JSON value of [feedbackKey].
     *
     * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feedbackKey(): JsonField<String> = body._feedbackKey()

    /**
     * Returns the raw JSON value of [formulaParts].
     *
     * Unlike [formulaParts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _formulaParts(): JsonField<List<FeedbackFormulaWeightedVariable>> = body._formulaParts()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FormulaUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * .feedbackKey()
         * .formulaParts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FormulaUpdateParams]. */
    class Builder internal constructor() {

        private var feedbackFormulaId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(formulaUpdateParams: FormulaUpdateParams) = apply {
            feedbackFormulaId = formulaUpdateParams.feedbackFormulaId
            body = formulaUpdateParams.body.toBuilder()
            additionalHeaders = formulaUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = formulaUpdateParams.additionalQueryParams.toBuilder()
        }

        fun feedbackFormulaId(feedbackFormulaId: String?) = apply {
            this.feedbackFormulaId = feedbackFormulaId
        }

        /** Alias for calling [Builder.feedbackFormulaId] with `feedbackFormulaId.orElse(null)`. */
        fun feedbackFormulaId(feedbackFormulaId: Optional<String>) =
            feedbackFormulaId(feedbackFormulaId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aggregationType]
         * - [feedbackKey]
         * - [formulaParts]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun aggregationType(aggregationType: AggregationType) = apply {
            body.aggregationType(aggregationType)
        }

        /**
         * Sets [Builder.aggregationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
            body.aggregationType(aggregationType)
        }

        fun feedbackKey(feedbackKey: String) = apply { body.feedbackKey(feedbackKey) }

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { body.feedbackKey(feedbackKey) }

        fun formulaParts(formulaParts: List<FeedbackFormulaWeightedVariable>) = apply {
            body.formulaParts(formulaParts)
        }

        /**
         * Sets [Builder.formulaParts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.formulaParts] with a well-typed
         * `List<FeedbackFormulaWeightedVariable>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun formulaParts(formulaParts: JsonField<List<FeedbackFormulaWeightedVariable>>) = apply {
            body.formulaParts(formulaParts)
        }

        /**
         * Adds a single [FeedbackFormulaWeightedVariable] to [formulaParts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormulaPart(formulaPart: FeedbackFormulaWeightedVariable) = apply {
            body.addFormulaPart(formulaPart)
        }

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
         * Returns an immutable instance of [FormulaUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregationType()
         * .feedbackKey()
         * .formulaParts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FormulaUpdateParams =
            FormulaUpdateParams(
                feedbackFormulaId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> feedbackFormulaId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val aggregationType: JsonField<AggregationType>,
        private val feedbackKey: JsonField<String>,
        private val formulaParts: JsonField<List<FeedbackFormulaWeightedVariable>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregation_type")
            @ExcludeMissing
            aggregationType: JsonField<AggregationType> = JsonMissing.of(),
            @JsonProperty("feedback_key")
            @ExcludeMissing
            feedbackKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("formula_parts")
            @ExcludeMissing
            formulaParts: JsonField<List<FeedbackFormulaWeightedVariable>> = JsonMissing.of(),
        ) : this(aggregationType, feedbackKey, formulaParts, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aggregationType(): AggregationType = aggregationType.getRequired("aggregation_type")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun formulaParts(): List<FeedbackFormulaWeightedVariable> =
            formulaParts.getRequired("formula_parts")

        /**
         * Returns the raw JSON value of [aggregationType].
         *
         * Unlike [aggregationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregation_type")
        @ExcludeMissing
        fun _aggregationType(): JsonField<AggregationType> = aggregationType

        /**
         * Returns the raw JSON value of [feedbackKey].
         *
         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feedback_key")
        @ExcludeMissing
        fun _feedbackKey(): JsonField<String> = feedbackKey

        /**
         * Returns the raw JSON value of [formulaParts].
         *
         * Unlike [formulaParts], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("formula_parts")
        @ExcludeMissing
        fun _formulaParts(): JsonField<List<FeedbackFormulaWeightedVariable>> = formulaParts

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .aggregationType()
             * .feedbackKey()
             * .formulaParts()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aggregationType: JsonField<AggregationType>? = null
            private var feedbackKey: JsonField<String>? = null
            private var formulaParts: JsonField<MutableList<FeedbackFormulaWeightedVariable>>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aggregationType = body.aggregationType
                feedbackKey = body.feedbackKey
                formulaParts = body.formulaParts.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun aggregationType(aggregationType: AggregationType) =
                aggregationType(JsonField.of(aggregationType))

            /**
             * Sets [Builder.aggregationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationType] with a well-typed [AggregationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun aggregationType(aggregationType: JsonField<AggregationType>) = apply {
                this.aggregationType = aggregationType
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

            fun formulaParts(formulaParts: List<FeedbackFormulaWeightedVariable>) =
                formulaParts(JsonField.of(formulaParts))

            /**
             * Sets [Builder.formulaParts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.formulaParts] with a well-typed
             * `List<FeedbackFormulaWeightedVariable>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun formulaParts(formulaParts: JsonField<List<FeedbackFormulaWeightedVariable>>) =
                apply {
                    this.formulaParts = formulaParts.map { it.toMutableList() }
                }

            /**
             * Adds a single [FeedbackFormulaWeightedVariable] to [formulaParts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFormulaPart(formulaPart: FeedbackFormulaWeightedVariable) = apply {
                formulaParts =
                    (formulaParts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("formulaParts", it).add(formulaPart)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .aggregationType()
             * .feedbackKey()
             * .formulaParts()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("aggregationType", aggregationType),
                    checkRequired("feedbackKey", feedbackKey),
                    checkRequired("formulaParts", formulaParts).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            aggregationType().validate()
            feedbackKey()
            formulaParts().forEach { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (aggregationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                (formulaParts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                aggregationType == other.aggregationType &&
                feedbackKey == other.feedbackKey &&
                formulaParts == other.formulaParts &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(aggregationType, feedbackKey, formulaParts, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aggregationType=$aggregationType, feedbackKey=$feedbackKey, formulaParts=$formulaParts, additionalProperties=$additionalProperties}"
    }

    class AggregationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val SUM = of("sum")

            @JvmField val AVG = of("avg")

            @JvmStatic fun of(value: String) = AggregationType(JsonField.of(value))
        }

        /** An enum containing [AggregationType]'s known values. */
        enum class Known {
            SUM,
            AVG,
        }

        /**
         * An enum containing [AggregationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AggregationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUM,
            AVG,
            /**
             * An enum member indicating that [AggregationType] was instantiated with an unknown
             * value.
             */
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
                SUM -> Value.SUM
                AVG -> Value.AVG
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                SUM -> Known.SUM
                AVG -> Known.AVG
                else -> throw LangsmithInvalidDataException("Unknown AggregationType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): AggregationType = apply {
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
            } catch (e: LangsmithInvalidDataException) {
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

            return other is AggregationType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FormulaUpdateParams &&
            feedbackFormulaId == other.feedbackFormulaId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(feedbackFormulaId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FormulaUpdateParams{feedbackFormulaId=$feedbackFormulaId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
