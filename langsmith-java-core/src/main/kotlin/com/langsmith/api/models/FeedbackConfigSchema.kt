// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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

@JsonDeserialize(
    builder = FeedbackConfigSchema.Builder::class
) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
// templates/JavaSDK/entities/objects.ts:76:13
@NoAutoDetect
class FeedbackConfigSchema
private constructor( // templates/JavaSDK/entities/objects.ts:76:13
    private val feedbackKey: JsonField<String>, // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    private val feedbackConfig: JsonField<FeedbackConfig>,
    private val tenantId: JsonField<String>,
    private val modifiedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
    // templates/JavaSDK/entities/objects.ts:76:13

    private var hashCode: Int = 0

    fun feedbackKey(): String = feedbackKey.getRequired("feedback_key")

    fun feedbackConfig(): FeedbackConfig = feedbackConfig.getRequired("feedback_config")

    fun tenantId(): String = tenantId.getRequired("tenant_id")

    fun modifiedAt(): OffsetDateTime = modifiedAt.getRequired("modified_at")

    @JsonProperty("feedback_key") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _feedbackKey() = feedbackKey

    @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _feedbackConfig() = feedbackConfig

    @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _tenantId() = tenantId

    @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:166:16
    @ExcludeMissing
    fun _modifiedAt() = modifiedAt

    @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
    // templates/JavaSDK/entities/objects.ts:180:12
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): FeedbackConfigSchema = apply { // templates/JavaSDK/entities/objects.ts:198:28
        if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:198:28 //
            // templates/JavaSDK/entities/objects.ts:198:28
            feedbackKey() // templates/JavaSDK/entities/objects.ts:201:20 //
            // templates/JavaSDK/entities/objects.ts:201:20
            feedbackConfig().validate()
            tenantId()
            modifiedAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is FeedbackConfigSchema && // templates/JavaSDK/entities/fields.ts:143:33
            this.feedbackKey == other.feedbackKey &&
            this.feedbackConfig == other.feedbackConfig &&
            this.tenantId == other.tenantId &&
            this.modifiedAt == other.modifiedAt &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
            // templates/JavaSDK/entities/fields.ts:174:16 //
            // templates/JavaSDK/entities/fields.ts:174:16
            hashCode =
                Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                    // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:175:16
                    feedbackKey, // templates/JavaSDK/entities/fields.ts:163:19
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

    companion object { // templates/JavaSDK/entities/objects.ts:217:10

        @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
        // templates/JavaSDK/entities/objects.ts:217:10
        fun builder() = Builder()
    }

    class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10 //
        // templates/JavaSDK/entities/objects.ts:224:10

        private var feedbackKey: JsonField<String> =
            JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:226:16 //
        // templates/JavaSDK/entities/objects.ts:224:10
        private var feedbackConfig: JsonField<FeedbackConfig> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var modifiedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
        internal fun from(feedbackConfigSchema: FeedbackConfigSchema) =
            apply { // templates/JavaSDK/entities/objects.ts:240:30
                this.feedbackKey =
                    feedbackConfigSchema
                        .feedbackKey // templates/JavaSDK/entities/objects.ts:240:30 //
                // templates/JavaSDK/entities/objects.ts:240:30
                this.feedbackConfig = feedbackConfigSchema.feedbackConfig
                this.tenantId = feedbackConfigSchema.tenantId
                this.modifiedAt = feedbackConfigSchema.modifiedAt
                additionalProperties(feedbackConfigSchema.additionalProperties)
            }

        fun feedbackKey(feedbackKey: String) =
            feedbackKey(JsonField.of(feedbackKey)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("feedback_key") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun feedbackKey(feedbackKey: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.feedbackKey = feedbackKey
            }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            feedbackConfig(
                JsonField.of(feedbackConfig)
            ) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun feedbackConfig(feedbackConfig: JsonField<FeedbackConfig>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.feedbackConfig = feedbackConfig
            }

        fun tenantId(tenantId: String) =
            tenantId(JsonField.of(tenantId)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("tenant_id") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun tenantId(tenantId: JsonField<String>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.tenantId = tenantId
            }

        fun modifiedAt(modifiedAt: OffsetDateTime) =
            modifiedAt(JsonField.of(modifiedAt)) // templates/JavaSDK/entities/objects.ts:252:20

        @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:264:20
        @ExcludeMissing
        fun modifiedAt(modifiedAt: JsonField<OffsetDateTime>) =
            apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.modifiedAt = modifiedAt
            }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                // templates/JavaSDK/entities/objects.ts:290:30
                this.additionalProperties.putAll(additionalProperties)
            }

        @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
        fun putAdditionalProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/objects.ts:304:30
                this.additionalProperties.put(key, value)
            }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/objects.ts:316:30
                this.additionalProperties.putAll(additionalProperties)
            }

        fun build(): FeedbackConfigSchema =
            FeedbackConfigSchema( // templates/JavaSDK/entities/objects.ts:326:30
                feedbackKey, // templates/JavaSDK/entities/objects.ts:326:30
                feedbackConfig,
                tenantId,
                modifiedAt,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(
        builder = FeedbackConfig.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class FeedbackConfig
    private constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val type: JsonField<Type>, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val min: JsonField<Double>,
        private val max: JsonField<Double>,
        private val categories: JsonField<List<FeedbackCategory>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        private var hashCode: Int = 0

        /** Enum for feedback types. */
        fun type(): Type = type.getRequired("type")

        fun min(): Optional<Double> = Optional.ofNullable(min.getNullable("min"))

        fun max(): Optional<Double> = Optional.ofNullable(max.getNullable("max"))

        fun categories(): Optional<List<FeedbackCategory>> =
            Optional.ofNullable(categories.getNullable("categories"))

        /** Enum for feedback types. */
        @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _type() = type

        @JsonProperty("min") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _min() = min

        @JsonProperty("max") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _max() = max

        @JsonProperty("categories") // templates/JavaSDK/entities/objects.ts:166:16
        @ExcludeMissing
        fun _categories() = categories

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): FeedbackConfig = apply { // templates/JavaSDK/entities/objects.ts:198:28
            if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:198:28 //
                // templates/JavaSDK/entities/objects.ts:198:28
                type() // templates/JavaSDK/entities/objects.ts:201:20 //
                // templates/JavaSDK/entities/objects.ts:201:20
                min()
                max()
                categories().map { it.forEach { it.validate() } }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is FeedbackConfig && // templates/JavaSDK/entities/fields.ts:143:33
                this.type == other.type &&
                this.min == other.min &&
                this.max == other.max &&
                this.categories == other.categories &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode =
                    Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                        // templates/JavaSDK/entities/fields.ts:175:16 //
                        // templates/JavaSDK/entities/fields.ts:175:16
                        type, // templates/JavaSDK/entities/fields.ts:163:19
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

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var type: JsonField<Type> =
                JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var min: JsonField<Double> = JsonMissing.of()
            private var max: JsonField<Double> = JsonMissing.of()
            private var categories: JsonField<List<FeedbackCategory>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackConfig: FeedbackConfig) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.type =
                        feedbackConfig.type // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.min = feedbackConfig.min
                    this.max = feedbackConfig.max
                    this.categories = feedbackConfig.categories
                    additionalProperties(feedbackConfig.additionalProperties)
                }

            /** Enum for feedback types. */
            // templates/JavaSDK/entities/objects.ts:252:20
            fun type(type: Type) = type(JsonField.of(type))

            /** Enum for feedback types. */
            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun type(type: JsonField<Type>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.type = type
                }

            fun min(min: Double) =
                min(JsonField.of(min)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("min") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun min(min: JsonField<Double>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.min = min
                }

            fun max(max: Double) =
                max(JsonField.of(max)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("max") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun max(max: JsonField<Double>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.max = max
                }

            fun categories(categories: List<FeedbackCategory>) =
                categories(JsonField.of(categories)) // templates/JavaSDK/entities/objects.ts:252:20

            @JsonProperty("categories") // templates/JavaSDK/entities/objects.ts:264:20
            @ExcludeMissing
            fun categories(categories: JsonField<List<FeedbackCategory>>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.categories = categories
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties
                        .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                    // templates/JavaSDK/entities/objects.ts:290:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:304:30
                    this.additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply { // templates/JavaSDK/entities/objects.ts:316:30
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun build(): FeedbackConfig =
                FeedbackConfig( // templates/JavaSDK/entities/objects.ts:326:30
                    type, // templates/JavaSDK/entities/objects.ts:326:30
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
        ) { // templates/JavaSDK/entities/enums.ts:56:13 //
            // templates/JavaSDK/entities/enums.ts:56:13 //
            // templates/JavaSDK/entities/enums.ts:56:13

            @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10
            // //
            // templates/JavaSDK/entities/enums.ts:56:13
            fun _value(): JsonField<String> = value

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is Type && // templates/JavaSDK/entities/fields.ts:143:33
                    this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object { // templates/JavaSDK/entities/enums.ts:71:10

                @JvmField
                val CONTINUOUS =
                    Type(JsonField.of("continuous")) // templates/JavaSDK/entities/enums.ts:71:10

                @JvmField val CATEGORICAL = Type(JsonField.of("categorical"))

                @JvmField val FREEFORM = Type(JsonField.of("freeform"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
                CONTINUOUS, // templates/JavaSDK/entities/enums.ts:78:10 //
                // templates/JavaSDK/entities/enums.ts:78:10
                CATEGORICAL,
                FREEFORM,
            }

            enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
                CONTINUOUS, // templates/JavaSDK/entities/enums.ts:82:10 //
                // templates/JavaSDK/entities/enums.ts:82:10
                CATEGORICAL,
                FREEFORM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                    CONTINUOUS -> Value.CONTINUOUS // templates/JavaSDK/entities/enums.ts:54:10 //
                    // templates/JavaSDK/entities/enums.ts:54:10
                    CATEGORICAL -> Value.CATEGORICAL
                    FREEFORM -> Value.FREEFORM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                    CONTINUOUS -> Known.CONTINUOUS // templates/JavaSDK/entities/enums.ts:54:10 //
                    // templates/JavaSDK/entities/enums.ts:54:10
                    CATEGORICAL -> Known.CATEGORICAL
                    FREEFORM -> Known.FREEFORM
                    else -> throw LangSmithInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /** Specific value and label pair for feedback */
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @JsonDeserialize(builder = FeedbackCategory.Builder::class)
        @NoAutoDetect
        class FeedbackCategory
        private constructor(
            private val value: JsonField<Double>,
            private val label: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            fun value(): Double = value.getRequired("value")

            fun label(): Optional<String> = Optional.ofNullable(label.getNullable("label"))

            @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _value() = value

            @JsonProperty("label") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _label() = label

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FeedbackCategory =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        value() // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:201:20
                        label()
                        validated = true
                    }
                }

            fun toBuilder() = Builder().from(this)

            override fun equals(
                other: Any?
            ): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
                if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                    return true
                }

                return other is FeedbackCategory && // templates/JavaSDK/entities/fields.ts:143:33
                    this.value == other.value &&
                    this.label == other.label &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
                if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16 //
                    // templates/JavaSDK/entities/fields.ts:174:16
                    hashCode =
                        Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                            // templates/JavaSDK/entities/fields.ts:175:16 //
                            // templates/JavaSDK/entities/fields.ts:175:16
                            value, // templates/JavaSDK/entities/fields.ts:163:19
                            label,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FeedbackCategory{value=$value, label=$label, additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var value: JsonField<Double> =
                    JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var label: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(feedbackCategory: FeedbackCategory) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.value =
                            feedbackCategory
                                .value // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.label = feedbackCategory.label
                        additionalProperties(feedbackCategory.additionalProperties)
                    }

                fun value(value: Double) =
                    value(JsonField.of(value)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun value(value: JsonField<Double>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.value = value
                    }

                fun label(label: String) =
                    label(JsonField.of(label)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("label") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun label(label: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.label = label
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties
                            .clear() // templates/JavaSDK/entities/objects.ts:290:30 //
                        // templates/JavaSDK/entities/objects.ts:290:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                @JsonAnySetter // templates/JavaSDK/entities/objects.ts:299:14
                fun putAdditionalProperty(key: String, value: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:304:30
                        this.additionalProperties.put(key, value)
                    }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply { // templates/JavaSDK/entities/objects.ts:316:30
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FeedbackCategory =
                    FeedbackCategory( // templates/JavaSDK/entities/objects.ts:326:30
                        value, // templates/JavaSDK/entities/objects.ts:326:30
                        label,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
