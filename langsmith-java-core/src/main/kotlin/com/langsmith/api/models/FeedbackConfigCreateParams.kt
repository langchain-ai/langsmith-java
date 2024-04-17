// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.Enum
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects

class FeedbackConfigCreateParams
constructor(
    private val feedbackConfig: FeedbackConfig,
    private val feedbackKey: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun feedbackConfig(): FeedbackConfig = feedbackConfig

    fun feedbackKey(): String = feedbackKey

    @JvmSynthetic
    internal fun getBody(): FeedbackConfigCreateBody {
        return FeedbackConfigCreateBody(
            feedbackConfig,
            feedbackKey,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = FeedbackConfigCreateBody.Builder::class)
    @NoAutoDetect
    class FeedbackConfigCreateBody
    internal constructor(
        private val feedbackConfig: FeedbackConfig?,
        private val feedbackKey: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("feedback_config") fun feedbackConfig(): FeedbackConfig? = feedbackConfig

        @JsonProperty("feedback_key") fun feedbackKey(): String? = feedbackKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackConfigCreateBody &&
                this.feedbackConfig == other.feedbackConfig &&
                this.feedbackKey == other.feedbackKey &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        feedbackConfig,
                        feedbackKey,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackConfigCreateBody{feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var feedbackConfig: FeedbackConfig? = null
            private var feedbackKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackConfigCreateBody: FeedbackConfigCreateBody) = apply {
                this.feedbackConfig = feedbackConfigCreateBody.feedbackConfig
                this.feedbackKey = feedbackConfigCreateBody.feedbackKey
                additionalProperties(feedbackConfigCreateBody.additionalProperties)
            }

            @JsonProperty("feedback_config")
            fun feedbackConfig(feedbackConfig: FeedbackConfig) = apply {
                this.feedbackConfig = feedbackConfig
            }

            @JsonProperty("feedback_key")
            fun feedbackKey(feedbackKey: String) = apply { this.feedbackKey = feedbackKey }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FeedbackConfigCreateBody =
                FeedbackConfigCreateBody(
                    checkNotNull(feedbackConfig) { "`feedbackConfig` is required but was not set" },
                    checkNotNull(feedbackKey) { "`feedbackKey` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfigCreateParams &&
            this.feedbackConfig == other.feedbackConfig &&
            this.feedbackKey == other.feedbackKey &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            feedbackConfig,
            feedbackKey,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FeedbackConfigCreateParams{feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var feedbackConfig: FeedbackConfig? = null
        private var feedbackKey: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackConfigCreateParams: FeedbackConfigCreateParams) = apply {
            this.feedbackConfig = feedbackConfigCreateParams.feedbackConfig
            this.feedbackKey = feedbackConfigCreateParams.feedbackKey
            additionalQueryParams(feedbackConfigCreateParams.additionalQueryParams)
            additionalHeaders(feedbackConfigCreateParams.additionalHeaders)
            additionalBodyProperties(feedbackConfigCreateParams.additionalBodyProperties)
        }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) = apply {
            this.feedbackConfig = feedbackConfig
        }

        fun feedbackKey(feedbackKey: String) = apply { this.feedbackKey = feedbackKey }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FeedbackConfigCreateParams =
            FeedbackConfigCreateParams(
                checkNotNull(feedbackConfig) { "`feedbackConfig` is required but was not set" },
                checkNotNull(feedbackKey) { "`feedbackKey` is required but was not set" },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = FeedbackConfig.Builder::class)
    @NoAutoDetect
    class FeedbackConfig
    private constructor(
        private val type: Type?,
        private val min: Double?,
        private val max: Double?,
        private val categories: List<Category>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** Enum for feedback types. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("min") fun min(): Double? = min

        @JsonProperty("max") fun max(): Double? = max

        @JsonProperty("categories") fun categories(): List<Category>? = categories

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeedbackConfig &&
                this.type == other.type &&
                this.min == other.min &&
                this.max == other.max &&
                this.categories == other.categories &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        type,
                        min,
                        max,
                        categories,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackConfig{type=$type, min=$min, max=$max, categories=$categories, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var min: Double? = null
            private var max: Double? = null
            private var categories: List<Category>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(feedbackConfig: FeedbackConfig) = apply {
                this.type = feedbackConfig.type
                this.min = feedbackConfig.min
                this.max = feedbackConfig.max
                this.categories = feedbackConfig.categories
                additionalProperties(feedbackConfig.additionalProperties)
            }

            /** Enum for feedback types. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("min") fun min(min: Double) = apply { this.min = min }

            @JsonProperty("max") fun max(max: Double) = apply { this.max = max }

            @JsonProperty("categories")
            fun categories(categories: List<Category>) = apply { this.categories = categories }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): FeedbackConfig =
                FeedbackConfig(
                    checkNotNull(type) { "`type` is required but was not set" },
                    min,
                    max,
                    categories?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CONTINUOUS = Type(JsonField.of("continuous"))

                @JvmField val CATEGORICAL = Type(JsonField.of("categorical"))

                @JvmField val FREEFORM = Type(JsonField.of("freeform"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
            }

            enum class Value {
                CONTINUOUS,
                CATEGORICAL,
                FREEFORM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CONTINUOUS -> Value.CONTINUOUS
                    CATEGORICAL -> Value.CATEGORICAL
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CONTINUOUS -> Known.CONTINUOUS
                    CATEGORICAL -> Known.CATEGORICAL
                    FREEFORM -> Known.FREEFORM
                    else -> throw LangSmithInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Specific value and label pair for feedback */
        @JsonDeserialize(builder = Category.Builder::class)
        @NoAutoDetect
        class Category
        private constructor(
            private val value: Double?,
            private val label: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0

            @JsonProperty("value") fun value(): Double? = value

            @JsonProperty("label") fun label(): String? = label

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category &&
                    this.value == other.value &&
                    this.label == other.label &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            value,
                            label,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "Category{value=$value, label=$label, additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var value: Double? = null
                private var label: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(category: Category) = apply {
                    this.value = category.value
                    this.label = category.label
                    additionalProperties(category.additionalProperties)
                }

                @JsonProperty("value") fun value(value: Double) = apply { this.value = value }

                @JsonProperty("label") fun label(label: String) = apply { this.label = label }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Category =
                    Category(
                        checkNotNull(value) { "`value` is required but was not set" },
                        label,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
