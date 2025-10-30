// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langsmith_api.api.core.Enum
import com.langsmith_api.api.core.ExcludeMissing
import com.langsmith_api.api.core.JsonField
import com.langsmith_api.api.core.JsonMissing
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.checkKnown
import com.langsmith_api.api.core.checkRequired
import com.langsmith_api.api.core.toImmutable
import com.langsmith_api.api.errors.LangsmithApiInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class RequestBodyForRunsGenerateQuery
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val query: JsonField<String>,
    private val feedbackKeys: JsonField<List<FeedbackKey>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("query") @ExcludeMissing query: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feedback_keys")
        @ExcludeMissing
        feedbackKeys: JsonField<List<FeedbackKey>> = JsonMissing.of(),
    ) : this(query, feedbackKeys, mutableMapOf())

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun query(): String = query.getRequired("query")

    /**
     * @throws LangsmithApiInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feedbackKeys(): Optional<List<FeedbackKey>> = feedbackKeys.getOptional("feedback_keys")

    /**
     * Returns the raw JSON value of [query].
     *
     * Unlike [query], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("query") @ExcludeMissing fun _query(): JsonField<String> = query

    /**
     * Returns the raw JSON value of [feedbackKeys].
     *
     * Unlike [feedbackKeys], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_keys")
    @ExcludeMissing
    fun _feedbackKeys(): JsonField<List<FeedbackKey>> = feedbackKeys

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
         * [RequestBodyForRunsGenerateQuery].
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RequestBodyForRunsGenerateQuery]. */
    class Builder internal constructor() {

        private var query: JsonField<String>? = null
        private var feedbackKeys: JsonField<MutableList<FeedbackKey>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(requestBodyForRunsGenerateQuery: RequestBodyForRunsGenerateQuery) =
            apply {
                query = requestBodyForRunsGenerateQuery.query
                feedbackKeys =
                    requestBodyForRunsGenerateQuery.feedbackKeys.map { it.toMutableList() }
                additionalProperties =
                    requestBodyForRunsGenerateQuery.additionalProperties.toMutableMap()
            }

        fun query(query: String) = query(JsonField.of(query))

        /**
         * Sets [Builder.query] to an arbitrary JSON value.
         *
         * You should usually call [Builder.query] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun query(query: JsonField<String>) = apply { this.query = query }

        fun feedbackKeys(feedbackKeys: List<FeedbackKey>) = feedbackKeys(JsonField.of(feedbackKeys))

        /**
         * Sets [Builder.feedbackKeys] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKeys] with a well-typed `List<FeedbackKey>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun feedbackKeys(feedbackKeys: JsonField<List<FeedbackKey>>) = apply {
            this.feedbackKeys = feedbackKeys.map { it.toMutableList() }
        }

        /**
         * Adds a single [FeedbackKey] to [feedbackKeys].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeedbackKey(feedbackKey: FeedbackKey) = apply {
            feedbackKeys =
                (feedbackKeys ?: JsonField.of(mutableListOf())).also {
                    checkKnown("feedbackKeys", it).add(feedbackKey)
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
         * Returns an immutable instance of [RequestBodyForRunsGenerateQuery].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .query()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RequestBodyForRunsGenerateQuery =
            RequestBodyForRunsGenerateQuery(
                checkRequired("query", query),
                (feedbackKeys ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): RequestBodyForRunsGenerateQuery = apply {
        if (validated) {
            return@apply
        }

        query()
        feedbackKeys().ifPresent { it.forEach { it.validate() } }
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
        (if (query.asKnown().isPresent) 1 else 0) +
            (feedbackKeys.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class FeedbackKey @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val USER_SCORE = of("user_score")

            @JvmField val USER_EDITED = of("user_edited")

            @JvmField val USER_REMOVED = of("user_removed")

            @JvmField val USER_OPENED_RUN = of("user_opened_run")

            @JvmField val USER_SELECTED_RUN = of("user_selected_run")

            @JvmField val RESULTS_SIZE = of("results_size")

            @JvmField val VALID_FILTER = of("valid_filter")

            @JvmStatic fun of(value: String) = FeedbackKey(JsonField.of(value))
        }

        /** An enum containing [FeedbackKey]'s known values. */
        enum class Known {
            USER_SCORE,
            USER_EDITED,
            USER_REMOVED,
            USER_OPENED_RUN,
            USER_SELECTED_RUN,
            RESULTS_SIZE,
            VALID_FILTER,
        }

        /**
         * An enum containing [FeedbackKey]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FeedbackKey] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USER_SCORE,
            USER_EDITED,
            USER_REMOVED,
            USER_OPENED_RUN,
            USER_SELECTED_RUN,
            RESULTS_SIZE,
            VALID_FILTER,
            /**
             * An enum member indicating that [FeedbackKey] was instantiated with an unknown value.
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
                USER_SCORE -> Value.USER_SCORE
                USER_EDITED -> Value.USER_EDITED
                USER_REMOVED -> Value.USER_REMOVED
                USER_OPENED_RUN -> Value.USER_OPENED_RUN
                USER_SELECTED_RUN -> Value.USER_SELECTED_RUN
                RESULTS_SIZE -> Value.RESULTS_SIZE
                VALID_FILTER -> Value.VALID_FILTER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                USER_SCORE -> Known.USER_SCORE
                USER_EDITED -> Known.USER_EDITED
                USER_REMOVED -> Known.USER_REMOVED
                USER_OPENED_RUN -> Known.USER_OPENED_RUN
                USER_SELECTED_RUN -> Known.USER_SELECTED_RUN
                RESULTS_SIZE -> Known.RESULTS_SIZE
                VALID_FILTER -> Known.VALID_FILTER
                else -> throw LangsmithApiInvalidDataException("Unknown FeedbackKey: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LangsmithApiInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                LangsmithApiInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): FeedbackKey = apply {
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
            } catch (e: LangsmithApiInvalidDataException) {
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

            return other is FeedbackKey && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RequestBodyForRunsGenerateQuery &&
            query == other.query &&
            feedbackKeys == other.feedbackKeys &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(query, feedbackKeys, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RequestBodyForRunsGenerateQuery{query=$query, feedbackKeys=$feedbackKeys, additionalProperties=$additionalProperties}"
}
