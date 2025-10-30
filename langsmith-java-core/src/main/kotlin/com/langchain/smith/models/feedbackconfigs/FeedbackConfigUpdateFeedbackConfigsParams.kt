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
import com.langchain.smith.core.Params
import com.langchain.smith.core.checkRequired
import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import com.langchain.smith.errors.LangsmithInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update Feedback Config Endpoint */
class FeedbackConfigUpdateFeedbackConfigsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun feedbackKey(): String = body.feedbackKey()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun feedbackConfig(): Optional<FeedbackConfig> = body.feedbackConfig()

    /**
     * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isLowerScoreBetter(): Optional<Boolean> = body.isLowerScoreBetter()

    /**
     * Returns the raw JSON value of [feedbackKey].
     *
     * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feedbackKey(): JsonField<String> = body._feedbackKey()

    /**
     * Returns the raw JSON value of [feedbackConfig].
     *
     * Unlike [feedbackConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _feedbackConfig(): JsonField<FeedbackConfig> = body._feedbackConfig()

    /**
     * Returns the raw JSON value of [isLowerScoreBetter].
     *
     * Unlike [isLowerScoreBetter], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _isLowerScoreBetter(): JsonField<Boolean> = body._isLowerScoreBetter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FeedbackConfigUpdateFeedbackConfigsParams].
         *
         * The following fields are required:
         * ```java
         * .feedbackKey()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FeedbackConfigUpdateFeedbackConfigsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            feedbackConfigUpdateFeedbackConfigsParams: FeedbackConfigUpdateFeedbackConfigsParams
        ) = apply {
            body = feedbackConfigUpdateFeedbackConfigsParams.body.toBuilder()
            additionalHeaders =
                feedbackConfigUpdateFeedbackConfigsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                feedbackConfigUpdateFeedbackConfigsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [feedbackKey]
         * - [feedbackConfig]
         * - [isLowerScoreBetter]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun feedbackKey(feedbackKey: String) = apply { body.feedbackKey(feedbackKey) }

        /**
         * Sets [Builder.feedbackKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feedbackKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { body.feedbackKey(feedbackKey) }

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

        fun isLowerScoreBetter(isLowerScoreBetter: Boolean?) = apply {
            body.isLowerScoreBetter(isLowerScoreBetter)
        }

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
            body.isLowerScoreBetter(isLowerScoreBetter)
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
         * Returns an immutable instance of [FeedbackConfigUpdateFeedbackConfigsParams].
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
        fun build(): FeedbackConfigUpdateFeedbackConfigsParams =
            FeedbackConfigUpdateFeedbackConfigsParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val feedbackKey: JsonField<String>,
        private val feedbackConfig: JsonField<FeedbackConfig>,
        private val isLowerScoreBetter: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("feedback_key")
            @ExcludeMissing
            feedbackKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("feedback_config")
            @ExcludeMissing
            feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of(),
            @JsonProperty("is_lower_score_better")
            @ExcludeMissing
            isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of(),
        ) : this(feedbackKey, feedbackConfig, isLowerScoreBetter, mutableMapOf())

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun feedbackConfig(): Optional<FeedbackConfig> =
            feedbackConfig.getOptional("feedback_config")

        /**
         * @throws LangsmithInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isLowerScoreBetter(): Optional<Boolean> =
            isLowerScoreBetter.getOptional("is_lower_score_better")

        /**
         * Returns the raw JSON value of [feedbackKey].
         *
         * Unlike [feedbackKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feedback_key")
        @ExcludeMissing
        fun _feedbackKey(): JsonField<String> = feedbackKey

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .feedbackKey()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var feedbackKey: JsonField<String>? = null
            private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
            private var isLowerScoreBetter: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                feedbackKey = body.feedbackKey
                feedbackConfig = body.feedbackConfig
                isLowerScoreBetter = body.isLowerScoreBetter
                additionalProperties = body.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("feedbackKey", feedbackKey),
                    feedbackConfig,
                    isLowerScoreBetter,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            feedbackKey()
            feedbackConfig().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (feedbackKey.asKnown().isPresent) 1 else 0) +
                (feedbackConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (isLowerScoreBetter.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                feedbackKey == other.feedbackKey &&
                feedbackConfig == other.feedbackConfig &&
                isLowerScoreBetter == other.isLowerScoreBetter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(feedbackKey, feedbackConfig, isLowerScoreBetter, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{feedbackKey=$feedbackKey, feedbackConfig=$feedbackConfig, isLowerScoreBetter=$isLowerScoreBetter, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfigUpdateFeedbackConfigsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "FeedbackConfigUpdateFeedbackConfigsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
