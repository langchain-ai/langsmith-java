// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.langchain.smith.core.ExcludeMissing
import com.langchain.smith.core.JsonField
import com.langchain.smith.core.JsonMissing
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.toImmutable
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

class ResponseBodyForRunsGenerateQuery
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val feedbackUrls: JsonField<FeedbackUrls>,
    private val filter: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("feedback_urls")
        @ExcludeMissing
        feedbackUrls: JsonField<FeedbackUrls> = JsonMissing.of(),
        @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
    ) : this(feedbackUrls, filter, mutableMapOf())

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackUrls(): FeedbackUrls = feedbackUrls.getRequired("feedback_urls")

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filter(): String = filter.getRequired("filter")

    /**
     * Returns the raw JSON value of [feedbackUrls].
     *
     * Unlike [feedbackUrls], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feedback_urls")
    @ExcludeMissing
    fun _feedbackUrls(): JsonField<FeedbackUrls> = feedbackUrls

    /**
     * Returns the raw JSON value of [filter].
     *
     * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

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
         * [ResponseBodyForRunsGenerateQuery].
         *
         * The following fields are required:
         * ```java
         * .feedbackUrls()
         * .filter()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResponseBodyForRunsGenerateQuery]. */
    class Builder internal constructor() {

        private var feedbackUrls: JsonField<FeedbackUrls>? = null
        private var filter: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responseBodyForRunsGenerateQuery: ResponseBodyForRunsGenerateQuery) =
            apply {
                feedbackUrls = responseBodyForRunsGenerateQuery.feedbackUrls
                filter = responseBodyForRunsGenerateQuery.filter
                additionalProperties =
                    responseBodyForRunsGenerateQuery.additionalProperties.toMutableMap()
            }

        fun feedbackUrls(feedbackUrls: FeedbackUrls) = feedbackUrls(JsonField.of(feedbackUrls))

        /**
         * Sets [Builder.feedbackUrls] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackUrls] with a well-typed [FeedbackUrls] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feedbackUrls(feedbackUrls: JsonField<FeedbackUrls>) = apply {
            this.feedbackUrls = feedbackUrls
        }

        fun filter(filter: String) = filter(JsonField.of(filter))

        /**
         * Sets [Builder.filter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filter] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun filter(filter: JsonField<String>) = apply { this.filter = filter }

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
         * Returns an immutable instance of [ResponseBodyForRunsGenerateQuery].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .feedbackUrls()
         * .filter()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseBodyForRunsGenerateQuery =
            ResponseBodyForRunsGenerateQuery(
                checkRequired("feedbackUrls", feedbackUrls),
                checkRequired("filter", filter),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ResponseBodyForRunsGenerateQuery = apply {
        if (validated) {
            return@apply
        }

        feedbackUrls().validate()
        filter()
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
        (feedbackUrls.asKnown().getOrNull()?.validity() ?: 0) +
            (if (filter.asKnown().isPresent) 1 else 0)

    class FeedbackUrls
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

            /** Returns a mutable builder for constructing an instance of [FeedbackUrls]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeedbackUrls]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackUrls: FeedbackUrls) = apply {
                additionalProperties = feedbackUrls.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [FeedbackUrls].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeedbackUrls = FeedbackUrls(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): FeedbackUrls = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackUrls && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "FeedbackUrls{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponseBodyForRunsGenerateQuery &&
            feedbackUrls == other.feedbackUrls &&
            filter == other.filter &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(feedbackUrls, filter, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponseBodyForRunsGenerateQuery{feedbackUrls=$feedbackUrls, filter=$filter, additionalProperties=$additionalProperties}"
}
