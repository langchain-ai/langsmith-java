// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
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
import com.langsmith.api.core.BaseDeserializer
import com.langsmith.api.core.BaseSerializer
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.getOrThrow
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class FeedbackUpdateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val feedbackId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val comment: String?,
    private val correction: JsonValue?,
    private val feedbackConfig: FeedbackConfig?,
    private val score: Score?,
    private val value: Value?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun feedbackId(): String = feedbackId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun comment(): Optional<String> = Optional.ofNullable(comment)

    fun correction(): Optional<JsonValue> = Optional.ofNullable(correction)

    fun feedbackConfig(): Optional<FeedbackConfig> = Optional.ofNullable(feedbackConfig)

    fun score(): Optional<Score> = Optional.ofNullable(score)

    fun value(): Optional<Value> = Optional.ofNullable(value)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): FeedbackUpdateBody { // templates/JavaSDK/entities/params.ts:165:16
        return FeedbackUpdateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            comment, // templates/JavaSDK/entities/params.ts:180:26
            correction,
            feedbackConfig,
            score,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> feedbackId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    /** Schema used for updating feedback */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = FeedbackUpdateBody.Builder::class)
    @NoAutoDetect
    class FeedbackUpdateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val comment: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val correction: JsonValue?,
        private val feedbackConfig: FeedbackConfig?,
        private val score: Score?,
        private val value: Value?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("comment") // templates/JavaSDK/entities/objects.ts:113:14
        fun comment(): String? = comment

        @JsonProperty("correction") // templates/JavaSDK/entities/objects.ts:113:14
        fun correction(): JsonValue? = correction

        @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:113:14
        fun feedbackConfig(): FeedbackConfig? = feedbackConfig

        @JsonProperty("score") // templates/JavaSDK/entities/objects.ts:113:14
        fun score(): Score? = score

        @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:113:14
        fun value(): Value? = value

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is FeedbackUpdateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.comment == other.comment &&
                this.correction == other.correction &&
                this.feedbackConfig == other.feedbackConfig &&
                this.score == other.score &&
                this.value == other.value &&
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
                        comment, // templates/JavaSDK/entities/fields.ts:163:19
                        correction,
                        feedbackConfig,
                        score,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackUpdateBody{comment=$comment, correction=$correction, feedbackConfig=$feedbackConfig, score=$score, value=$value, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var comment: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var correction: JsonValue? = null
            private var feedbackConfig: FeedbackConfig? = null
            private var score: Score? = null
            private var value: Value? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackUpdateBody: FeedbackUpdateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.comment =
                        feedbackUpdateBody
                            .comment // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.correction = feedbackUpdateBody.correction
                    this.feedbackConfig = feedbackUpdateBody.feedbackConfig
                    this.score = feedbackUpdateBody.score
                    this.value = feedbackUpdateBody.value
                    additionalProperties(feedbackUpdateBody.additionalProperties)
                }

            @JsonProperty("comment") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun comment(comment: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.comment = comment
            }

            @JsonProperty("correction") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun correction(correction: JsonValue) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.correction = correction
                }

            @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun feedbackConfig(feedbackConfig: FeedbackConfig) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.feedbackConfig = feedbackConfig
                }

            @JsonProperty("score") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun score(score: Score) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.score = score
            }

            @JsonProperty("value") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun value(value: Value) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.value = value
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

            fun build(): FeedbackUpdateBody =
                FeedbackUpdateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    comment, // templates/JavaSDK/entities/objects.ts:326:30
                    correction,
                    feedbackConfig,
                    score,
                    value,
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

        return other is FeedbackUpdateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.feedbackId == other.feedbackId &&
            this.comment == other.comment &&
            this.correction == other.correction &&
            this.feedbackConfig == other.feedbackConfig &&
            this.score == other.score &&
            this.value == other.value &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            feedbackId, // templates/JavaSDK/entities/fields.ts:163:19
            comment,
            correction,
            feedbackConfig,
            score,
            value,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FeedbackUpdateParams{feedbackId=$feedbackId, comment=$comment, correction=$correction, feedbackConfig=$feedbackConfig, score=$score, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var feedbackId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var comment: String? = null
        private var correction: JsonValue? = null
        private var feedbackConfig: FeedbackConfig? = null
        private var score: Score? = null
        private var value: Value? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(feedbackUpdateParams: FeedbackUpdateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.feedbackId =
                    feedbackUpdateParams
                        .feedbackId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.comment = feedbackUpdateParams.comment
                this.correction = feedbackUpdateParams.correction
                this.feedbackConfig = feedbackUpdateParams.feedbackConfig
                this.score = feedbackUpdateParams.score
                this.value = feedbackUpdateParams.value
                additionalQueryParams(feedbackUpdateParams.additionalQueryParams)
                additionalHeaders(feedbackUpdateParams.additionalHeaders)
                additionalBodyProperties(feedbackUpdateParams.additionalBodyProperties)
            }

        fun feedbackId(feedbackId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.feedbackId = feedbackId
        }

        fun comment(comment: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.comment = comment
        }

        fun correction(correction: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.correction = correction
            }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.feedbackConfig = feedbackConfig
            }

        fun score(score: Score) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.score = score
        }

        fun score(double: Double) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.score = Score.ofDouble(double)
        }

        fun score(boolean: Boolean) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.score = Score.ofBoolean(boolean)
        }

        fun value(value: Value) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.value = value
        }

        fun value(double: Double) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.value = Value.ofDouble(double)
        }

        fun value(boolean: Boolean) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.value = Value.ofBoolean(boolean)
        }

        fun value(string: String) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.value = Value.ofString(string)
        }

        fun value(jsonValue: JsonValue) = apply { // templates/JavaSDK/entities/params.ts:659:30
            this.value = Value.ofJsonValue(jsonValue)
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

        fun build(): FeedbackUpdateParams =
            FeedbackUpdateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(feedbackId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`feedbackId` is required but was not set"
                },
                comment,
                correction,
                feedbackConfig,
                score,
                value,
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

    @JsonDeserialize(
        using = Score.Deserializer::class
    ) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13
    @JsonSerialize(using = Score.Serializer::class)
    class Score
    private constructor(
        private val double: Double? = null,
        private val boolean: Boolean? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

        fun double(): Optional<Double> =
            Optional.ofNullable(double) // templates/JavaSDK/entities/unions.ts:89:12 //
        // templates/JavaSDK/entities/unions.ts:89:12

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun isDouble(): Boolean = double != null // templates/JavaSDK/entities/unions.ts:104:12 //
        // templates/JavaSDK/entities/unions.ts:104:12

        fun isBoolean(): Boolean = boolean != null

        fun asDouble(): Double =
            double.getOrThrow("double") // templates/JavaSDK/entities/unions.ts:113:12 //
        // templates/JavaSDK/entities/unions.ts:113:12

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
            return when { // templates/JavaSDK/entities/unions.ts:134:30
                double != null ->
                    visitor.visitDouble(double) // templates/JavaSDK/entities/unions.ts:134:30 //
                // templates/JavaSDK/entities/unions.ts:134:30
                boolean != null -> visitor.visitBoolean(boolean)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Score = apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    double == null && boolean == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown Score: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Score && // templates/JavaSDK/entities/fields.ts:143:33
                this.double == other.double &&
                this.boolean == other.boolean
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            return Objects.hash(double, boolean)
        }

        override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
            return when { // templates/JavaSDK/entities/unions.ts:188:16
                double != null ->
                    "Score{double=$double}" // templates/JavaSDK/entities/unions.ts:188:16 //
                // templates/JavaSDK/entities/unions.ts:188:16
                boolean != null -> "Score{boolean=$boolean}"
                _json != null -> "Score{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Score")
            }
        }

        companion object { // templates/JavaSDK/entities/unions.ts:201:10

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
            // templates/JavaSDK/entities/unions.ts:201:10
            fun ofDouble(double: Double) = Score(double = double)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofBoolean(boolean: Boolean) = Score(boolean = boolean)
        }

        interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10

            fun visitDouble(double: Double): T // templates/JavaSDK/entities/unions.ts:211:10

            fun visitBoolean(boolean: Boolean): T

            fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
                throw LangSmithInvalidDataException("Unknown Score: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<Score>(
                Score::class
            ) { // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): Score { // templates/JavaSDK/entities/unions.ts:244:14 //
                // templates/JavaSDK/entities/unions.ts:240:10
                val json =
                    JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:250:28
                tryDeserialize(node, jacksonTypeRef<Double>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Score(double = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Boolean>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Score(boolean = it, _json = json)
                    }

                return Score(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<Score>(Score::class) { // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10

            override fun serialize(
                value: Score,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) { // templates/JavaSDK/entities/unions.ts:273:14 //
                // templates/JavaSDK/entities/unions.ts:269:10
                when { // templates/JavaSDK/entities/unions.ts:278:24
                    value.double != null ->
                        generator.writeObject(
                            value.double
                        ) // templates/JavaSDK/entities/unions.ts:278:24 //
                    // templates/JavaSDK/entities/unions.ts:278:24
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Score")
                }
            }
        }
    }

    @JsonDeserialize(
        using = Value.Deserializer::class
    ) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13
    @JsonSerialize(using = Value.Serializer::class)
    class Value
    private constructor( // templates/JavaSDK/entities/unions.ts:68:13
        private val double: Double? = null, // templates/JavaSDK/entities/unions.ts:68:13 //
        // templates/JavaSDK/entities/unions.ts:68:13
        private val boolean: Boolean? = null,
        private val string: String? = null,
        private val jsonValue: JsonValue? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

        fun double(): Optional<Double> =
            Optional.ofNullable(double) // templates/JavaSDK/entities/unions.ts:89:12 //
        // templates/JavaSDK/entities/unions.ts:89:12

        fun boolean(): Optional<Boolean> = Optional.ofNullable(boolean)

        fun string(): Optional<String> = Optional.ofNullable(string)

        fun jsonValue(): Optional<JsonValue> = Optional.ofNullable(jsonValue)

        fun isDouble(): Boolean = double != null // templates/JavaSDK/entities/unions.ts:104:12 //
        // templates/JavaSDK/entities/unions.ts:104:12

        fun isBoolean(): Boolean = boolean != null

        fun isString(): Boolean = string != null

        fun isJsonValue(): Boolean = jsonValue != null

        fun asDouble(): Double =
            double.getOrThrow("double") // templates/JavaSDK/entities/unions.ts:113:12 //
        // templates/JavaSDK/entities/unions.ts:113:12

        fun asBoolean(): Boolean = boolean.getOrThrow("boolean")

        fun asString(): String = string.getOrThrow("string")

        fun asJsonValue(): JsonValue = jsonValue.getOrThrow("jsonValue")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
            return when { // templates/JavaSDK/entities/unions.ts:134:30
                double != null ->
                    visitor.visitDouble(double) // templates/JavaSDK/entities/unions.ts:134:30 //
                // templates/JavaSDK/entities/unions.ts:134:30
                boolean != null -> visitor.visitBoolean(boolean)
                string != null -> visitor.visitString(string)
                jsonValue != null -> visitor.visitJsonValue(jsonValue)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): Value = apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    double == null && boolean == null && string == null && jsonValue == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown Value: $_json")
                }
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Value && // templates/JavaSDK/entities/fields.ts:143:33
                this.double == other.double &&
                this.boolean == other.boolean &&
                this.string == other.string &&
                this.jsonValue == other.jsonValue
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                // templates/JavaSDK/entities/fields.ts:181:14
                double, // templates/JavaSDK/entities/fields.ts:163:19
                boolean,
                string,
                jsonValue,
            )
        }

        override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
            return when { // templates/JavaSDK/entities/unions.ts:188:16
                double != null ->
                    "Value{double=$double}" // templates/JavaSDK/entities/unions.ts:188:16 //
                // templates/JavaSDK/entities/unions.ts:188:16
                boolean != null -> "Value{boolean=$boolean}"
                string != null -> "Value{string=$string}"
                jsonValue != null -> "Value{jsonValue=$jsonValue}"
                _json != null -> "Value{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Value")
            }
        }

        companion object { // templates/JavaSDK/entities/unions.ts:201:10

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
            // templates/JavaSDK/entities/unions.ts:201:10
            fun ofDouble(double: Double) = Value(double = double)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofBoolean(boolean: Boolean) = Value(boolean = boolean)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofString(string: String) = Value(string = string)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofJsonValue(jsonValue: JsonValue) = Value(jsonValue = jsonValue)
        }

        interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10

            fun visitDouble(double: Double): T // templates/JavaSDK/entities/unions.ts:211:10

            fun visitBoolean(boolean: Boolean): T

            fun visitString(string: String): T

            fun visitJsonValue(jsonValue: JsonValue): T

            fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
                throw LangSmithInvalidDataException("Unknown Value: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<Value>(
                Value::class
            ) { // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): Value { // templates/JavaSDK/entities/unions.ts:244:14 //
                // templates/JavaSDK/entities/unions.ts:240:10
                val json =
                    JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:250:28
                tryDeserialize(node, jacksonTypeRef<Double>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(double = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<Boolean>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(boolean = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<String>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(string = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<JsonValue>())
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return Value(jsonValue = it, _json = json)
                    }

                return Value(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<Value>(Value::class) { // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10

            override fun serialize(
                value: Value,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) { // templates/JavaSDK/entities/unions.ts:273:14 //
                // templates/JavaSDK/entities/unions.ts:269:10
                when { // templates/JavaSDK/entities/unions.ts:278:24
                    value.double != null ->
                        generator.writeObject(
                            value.double
                        ) // templates/JavaSDK/entities/unions.ts:278:24 //
                    // templates/JavaSDK/entities/unions.ts:278:24
                    value.boolean != null -> generator.writeObject(value.boolean)
                    value.string != null -> generator.writeObject(value.string)
                    value.jsonValue != null -> generator.writeObject(value.jsonValue)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Value")
                }
            }
        }
    }
}
