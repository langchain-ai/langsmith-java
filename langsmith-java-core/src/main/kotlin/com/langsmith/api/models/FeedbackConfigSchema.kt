// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = FeedbackConfigSchema.Builder::class)
@NoAutoDetect
class FeedbackConfigSchema
private constructor(
    private val feedbackKey: JsonField<String>,
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val tenantId: JsonField<String>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    fun feedbackConfig(): FeedbackConfig = feedbackConfig.getRequired("feedback_config")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

    @JsonProperty("feedback_key") @ExcludeMissing fun _feedbackKey() = feedbackKey

    @JsonProperty("feedback_config") @ExcludeMissing fun _feedbackConfig() = feedbackConfig

    @JsonProperty("tenant_id") @ExcludeMissing fun _tenantId() = tenantId

    @JsonProperty("modified_at") @ExcludeMissing fun _modifiedAt() = modifiedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FeedbackConfigSchema = apply {
        if (!validated) {
            feedbackKey()
            feedbackConfig().validate()
            tenantId()
            modifiedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FeedbackConfigSchema &&
            this.feedbackKey == other.feedbackKey &&
            this.feedbackConfig == other.feedbackConfig &&
            this.tenantId == other.tenantId &&
            this.modifiedAt == other.modifiedAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    feedbackKey,
                    feedbackConfig,
                    tenantId,
                    modifiedAt,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "FeedbackConfigSchema{feedbackKey=$feedbackKey, feedbackConfig=$feedbackConfig, tenantId=$tenantId, modifiedAt=$modifiedAt, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var feedbackKey: JsonField<String> = JsonMissing.of()
        private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(feedbackConfigSchema: FeedbackConfigSchema) = apply {
            this.feedbackKey = feedbackConfigSchema.feedbackKey
            this.feedbackConfig = feedbackConfigSchema.feedbackConfig
            this.tenantId = feedbackConfigSchema.tenantId
            this.modifiedAt = feedbackConfigSchema.modifiedAt
            additionalProperties(feedbackConfigSchema.additionalProperties)
        }

        fun feedbackKey(feedbackKey: String) = feedbackKey(JsonField.of(feedbackKey))

        @JsonProperty("feedback_key")
        @ExcludeMissing
        fun feedbackKey(feedbackKey: JsonField<String>) = apply { this.feedbackKey = feedbackKey }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            feedbackConfig(JsonField.of(feedbackConfig))

        @JsonProperty("feedback_config")
        @ExcludeMissing
        fun feedbackConfig(feedbackConfig: JsonField<FeedbackConfig>) = apply {
            this.feedbackConfig = feedbackConfig
        }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        @JsonProperty("tenant_id")
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun modifiedAt(modifiedAt: OffsetDateTime) = modifiedAt(JsonField.of(modifiedAt))

        @JsonProperty("modified_at")
        @ExcludeMissing
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) = apply {
            this.modifiedAt = modifiedAt
        }

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

        fun build(): FeedbackConfigSchema =
            FeedbackConfigSchema(
                feedbackKey,
                feedbackConfig,
                tenantId,
                modifiedAt,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = FeedbackConfig.Builder::class)
    @NoAutoDetect
    class FeedbackConfig
    private constructor(
        private val type: JsonField<Type>,
        private val min: JsonField<Double>,
        private val max: JsonField<Double>,
        private val categories: JsonField<List<Category>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Enum for feedback types. */
        fun type(): Type = type.getRequired("type")

        fun min(): Optional<Double> = Optional.ofNullable(min.getNullable("min"))

        fun max(): Optional<Double> = Optional.ofNullable(max.getNullable("max"))

        fun categories(): Optional<List<Category>> =
            Optional.ofNullable(categories.getNullable("categories"))

        /** Enum for feedback types. */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("min") @ExcludeMissing fun _min() = min

        @JsonProperty("max") @ExcludeMissing fun _max() = max

        @JsonProperty("categories") @ExcludeMissing fun _categories() = categories

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackConfig = apply {
            if (!validated) {
                type()
                min()
                max()
                categories().map { it.forEach { it.validate() } }
                validated = true
            }
        }

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

            private var type: JsonField<Type> = JsonMissing.of()
            private var min: JsonField<Double> = JsonMissing.of()
            private var max: JsonField<Double> = JsonMissing.of()
            private var categories: JsonField<List<Category>> = JsonMissing.of()
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
            fun type(type: Type) = type(JsonField.of(type))

            /** Enum for feedback types. */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun min(min: Double) = min(JsonField.of(min))

            @JsonProperty("min")
            @ExcludeMissing
            fun min(min: JsonField<Double>) = apply { this.min = min }

            fun max(max: Double) = max(JsonField.of(max))

            @JsonProperty("max")
            @ExcludeMissing
            fun max(max: JsonField<Double>) = apply { this.max = max }

            fun categories(categories: List<Category>) = categories(JsonField.of(categories))

            @JsonProperty("categories")
            @ExcludeMissing
            fun categories(categories: JsonField<List<Category>>) = apply {
                this.categories = categories
            }

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
                    type,
                    min,
                    max,
                    categories.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

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
            private val value: JsonField<Double>,
            private val label: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun value(): Double = value.getRequired("value")

            fun label(): Optional<String> = Optional.ofNullable(label.getNullable("label"))

            @JsonProperty("value") @ExcludeMissing fun _value() = value

            @JsonProperty("label") @ExcludeMissing fun _label() = label

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Category = apply {
                if (!validated) {
                    value()
                    label()
                    validated = true
                }
            }

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

                private var value: JsonField<Double> = JsonMissing.of()
                private var label: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(category: Category) = apply {
                    this.value = category.value
                    this.label = category.label
                    additionalProperties(category.additionalProperties)
                }

                fun value(value: Double) = value(JsonField.of(value))

                @JsonProperty("value")
                @ExcludeMissing
                fun value(value: JsonField<Double>) = apply { this.value = value }

                fun label(label: String) = label(JsonField.of(label))

                @JsonProperty("label")
                @ExcludeMissing
                fun label(label: JsonField<String>) = apply { this.label = label }

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
                        value,
                        label,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
