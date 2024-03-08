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
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects

class FeedbackConfigCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val feedbackConfig: FeedbackConfig, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val feedbackKey: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun feedbackConfig(): FeedbackConfig =
        feedbackConfig // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun feedbackKey(): String = feedbackKey

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody():
        FeedbackConfigCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return FeedbackConfigCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            feedbackConfig, // templates/JavaSDK/entities/params.ts:180:26
            feedbackKey,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(
        builder = FeedbackConfigCreateBody.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class FeedbackConfigCreateBody
    internal constructor(
        private val feedbackConfig: FeedbackConfig?,
        private val feedbackKey: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:113:14
        fun feedbackConfig(): FeedbackConfig? = feedbackConfig

        @JsonProperty("feedback_key") // templates/JavaSDK/entities/objects.ts:113:14
        fun feedbackKey(): String? = feedbackKey

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is
                FeedbackConfigCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.feedbackConfig == other.feedbackConfig &&
                this.feedbackKey == other.feedbackKey &&
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
                        feedbackConfig, // templates/JavaSDK/entities/fields.ts:163:19
                        feedbackKey,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackConfigCreateBody{feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var feedbackConfig: FeedbackConfig? =
                null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var feedbackKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackConfigCreateBody: FeedbackConfigCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.feedbackConfig =
                        feedbackConfigCreateBody
                            .feedbackConfig // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.feedbackKey = feedbackConfigCreateBody.feedbackKey
                    additionalProperties(feedbackConfigCreateBody.additionalProperties)
                }

            @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun feedbackConfig(feedbackConfig: FeedbackConfig) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.feedbackConfig = feedbackConfig
                }

            @JsonProperty("feedback_key") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun feedbackKey(feedbackKey: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.feedbackKey = feedbackKey
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

            fun build(): FeedbackConfigCreateBody =
                FeedbackConfigCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(
                        feedbackConfig
                    ) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`feedbackConfig` is required but was not set"
                    },
                    checkNotNull(feedbackKey) { // templates/JavaSDK/entities/objects.ts:358:13
                        "`feedbackKey` is required but was not set"
                    },
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is FeedbackConfigCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.feedbackConfig == other.feedbackConfig &&
            this.feedbackKey == other.feedbackKey &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            feedbackConfig, // templates/JavaSDK/entities/fields.ts:163:19
            feedbackKey,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FeedbackConfigCreateParams{feedbackConfig=$feedbackConfig, feedbackKey=$feedbackKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var feedbackConfig: FeedbackConfig? =
            null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var feedbackKey: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(feedbackConfigCreateParams: FeedbackConfigCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.feedbackConfig =
                    feedbackConfigCreateParams
                        .feedbackConfig // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.feedbackKey = feedbackConfigCreateParams.feedbackKey
                additionalQueryParams(feedbackConfigCreateParams.additionalQueryParams)
                additionalHeaders(feedbackConfigCreateParams.additionalHeaders)
                additionalBodyProperties(feedbackConfigCreateParams.additionalBodyProperties)
            }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.feedbackConfig = feedbackConfig
            }

        fun feedbackKey(feedbackKey: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.feedbackKey = feedbackKey
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:703:24
                this.additionalQueryParams.clear() // templates/JavaSDK/entities/params.ts:703:24 //
                // templates/JavaSDK/entities/params.ts:703:24
                putAllQueryParams(additionalQueryParams)
            }

        fun putQueryParam(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:713:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putQueryParams(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:723:24
                this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:733:24
                additionalQueryParams.forEach(this::putQueryParams)
            }

        fun removeQueryParam(name: String) = apply { // templates/JavaSDK/entities/params.ts:743:24
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:755:24
                this.additionalHeaders.clear() // templates/JavaSDK/entities/params.ts:755:24 //
                // templates/JavaSDK/entities/params.ts:755:24
                putAllHeaders(additionalHeaders)
            }

        fun putHeader(name: String, value: String) =
            apply { // templates/JavaSDK/entities/params.ts:765:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
            }

        fun putHeaders(name: String, values: Iterable<String>) =
            apply { // templates/JavaSDK/entities/params.ts:775:24
                this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
            }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply { // templates/JavaSDK/entities/params.ts:785:24
                additionalHeaders.forEach(this::putHeaders)
            }

        fun removeHeader(name: String) = apply { // templates/JavaSDK/entities/params.ts:795:24
            this.additionalHeaders.put(name, mutableListOf())
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties
                    .clear() // templates/JavaSDK/entities/params.ts:809:28 //
                // templates/JavaSDK/entities/params.ts:809:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:822:28
                this.additionalBodyProperties.put(key, value)
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply { // templates/JavaSDK/entities/params.ts:832:28
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): FeedbackConfigCreateParams =
            FeedbackConfigCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(feedbackConfig) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`feedbackConfig` is required but was not set"
                },
                checkNotNull(feedbackKey) { // templates/JavaSDK/entities/params.ts:844:13
                    "`feedbackKey` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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
        private val type: Type?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val min: Double?,
        private val max: Double?,
        private val categories: List<FeedbackCategory>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        /** Enum for feedback types. */
        @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:113:14
        fun type(): Type? = type

        @JsonProperty("min") // templates/JavaSDK/entities/objects.ts:113:14
        fun min(): Double? = min

        @JsonProperty("max") // templates/JavaSDK/entities/objects.ts:113:14
        fun max(): Double? = max

        @JsonProperty("categories") // templates/JavaSDK/entities/objects.ts:113:14
        fun categories(): List<FeedbackCategory>? = categories

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var type: Type? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var min: Double? = null
            private var max: Double? = null
            private var categories: List<FeedbackCategory>? = null
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
            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
            fun type(type: Type) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.type = type
            }

            @JsonProperty("min") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun min(min: Double) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.min = min
            }

            @JsonProperty("max") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun max(max: Double) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.max = max
            }

            @JsonProperty("categories") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun categories(categories: List<FeedbackCategory>) =
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
                    checkNotNull(type) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`type` is required but was not set"
                    },
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
            private val value: Double?,
            private val label: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:113:14
            fun value(): Double? = value

            @JsonProperty("label") // templates/JavaSDK/entities/objects.ts:113:14
            fun label(): String? = label

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                private var value: Double? = null // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var label: String? = null
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

                @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                fun value(value: Double) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.value = value
                }

                @JsonProperty("label") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                fun label(label: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
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
                        checkNotNull(value) { // templates/JavaSDK/entities/objects.ts:358:13 //
                            // templates/JavaSDK/entities/objects.ts:326:30
                            "`value` is required but was not set"
                        },
                        label,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }
    }
}
