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
import com.langsmith.api.core.JsonMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.getOrThrow
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class FeedbackCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val key: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val runId: String,
    private val id: String?,
    private val comment: String?,
    private val correction: JsonValue?,
    private val createdAt: OffsetDateTime?,
    private val feedbackConfig: FeedbackConfig?,
    private val feedbackSource: FeedbackSource?,
    private val modifiedAt: OffsetDateTime?,
    private val score: Score?,
    private val value: Value?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun key(): String = key // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun runId(): String = runId

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun comment(): Optional<String> = Optional.ofNullable(comment)

    fun correction(): Optional<JsonValue> = Optional.ofNullable(correction)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun feedbackConfig(): Optional<FeedbackConfig> = Optional.ofNullable(feedbackConfig)

    fun feedbackSource(): Optional<FeedbackSource> = Optional.ofNullable(feedbackSource)

    fun modifiedAt(): Optional<OffsetDateTime> = Optional.ofNullable(modifiedAt)

    fun score(): Optional<Score> = Optional.ofNullable(score)

    fun value(): Optional<Value> = Optional.ofNullable(value)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): FeedbackCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return FeedbackCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            key, // templates/JavaSDK/entities/params.ts:180:26
            runId,
            id,
            comment,
            correction,
            createdAt,
            feedbackConfig,
            feedbackSource,
            modifiedAt,
            score,
            value,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Schema used for creating feedback. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = FeedbackCreateBody.Builder::class)
    @NoAutoDetect
    class FeedbackCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val key: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val runId: String?,
        private val id: String?,
        private val comment: String?,
        private val correction: JsonValue?,
        private val createdAt: OffsetDateTime?,
        private val feedbackConfig: FeedbackConfig?,
        private val feedbackSource: FeedbackSource?,
        private val modifiedAt: OffsetDateTime?,
        private val score: Score?,
        private val value: Value?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:113:14
        fun key(): String? = key

        @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:113:14
        fun runId(): String? = runId

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:113:14
        fun id(): String? = id

        @JsonProperty("comment") // templates/JavaSDK/entities/objects.ts:113:14
        fun comment(): String? = comment

        @JsonProperty("correction") // templates/JavaSDK/entities/objects.ts:113:14
        fun correction(): JsonValue? = correction

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:113:14
        fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:113:14
        fun feedbackConfig(): FeedbackConfig? = feedbackConfig

        @JsonProperty("feedback_source") // templates/JavaSDK/entities/objects.ts:113:14
        fun feedbackSource(): FeedbackSource? = feedbackSource

        @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:113:14
        fun modifiedAt(): OffsetDateTime? = modifiedAt

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

            return other is FeedbackCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.key == other.key &&
                this.runId == other.runId &&
                this.id == other.id &&
                this.comment == other.comment &&
                this.correction == other.correction &&
                this.createdAt == other.createdAt &&
                this.feedbackConfig == other.feedbackConfig &&
                this.feedbackSource == other.feedbackSource &&
                this.modifiedAt == other.modifiedAt &&
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
                        key, // templates/JavaSDK/entities/fields.ts:163:19
                        runId,
                        id,
                        comment,
                        correction,
                        createdAt,
                        feedbackConfig,
                        feedbackSource,
                        modifiedAt,
                        score,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FeedbackCreateBody{key=$key, runId=$runId, id=$id, comment=$comment, correction=$correction, createdAt=$createdAt, feedbackConfig=$feedbackConfig, feedbackSource=$feedbackSource, modifiedAt=$modifiedAt, score=$score, value=$value, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var key: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var runId: String? = null
            private var id: String? = null
            private var comment: String? = null
            private var correction: JsonValue? = null
            private var createdAt: OffsetDateTime? = null
            private var feedbackConfig: FeedbackConfig? = null
            private var feedbackSource: FeedbackSource? = null
            private var modifiedAt: OffsetDateTime? = null
            private var score: Score? = null
            private var value: Value? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(feedbackCreateBody: FeedbackCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.key =
                        feedbackCreateBody.key // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.runId = feedbackCreateBody.runId
                    this.id = feedbackCreateBody.id
                    this.comment = feedbackCreateBody.comment
                    this.correction = feedbackCreateBody.correction
                    this.createdAt = feedbackCreateBody.createdAt
                    this.feedbackConfig = feedbackCreateBody.feedbackConfig
                    this.feedbackSource = feedbackCreateBody.feedbackSource
                    this.modifiedAt = feedbackCreateBody.modifiedAt
                    this.score = feedbackCreateBody.score
                    this.value = feedbackCreateBody.value
                    additionalProperties(feedbackCreateBody.additionalProperties)
                }

            @JsonProperty("key") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun key(key: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.key = key
            }

            @JsonProperty("run_id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun runId(runId: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.runId = runId
            }

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun id(id: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
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

            @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun createdAt(createdAt: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.createdAt = createdAt
                }

            @JsonProperty("feedback_config") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun feedbackConfig(feedbackConfig: FeedbackConfig) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.feedbackConfig = feedbackConfig
                }

            @JsonProperty("feedback_source") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun feedbackSource(feedbackSource: FeedbackSource) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.feedbackSource = feedbackSource
                }

            @JsonProperty("modified_at") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun modifiedAt(modifiedAt: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.modifiedAt = modifiedAt
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

            fun build(): FeedbackCreateBody =
                FeedbackCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(key) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`key` is required but was not set"
                    },
                    checkNotNull(runId) { // templates/JavaSDK/entities/objects.ts:358:13
                        "`runId` is required but was not set"
                    },
                    id,
                    comment,
                    correction,
                    createdAt,
                    feedbackConfig,
                    feedbackSource,
                    modifiedAt,
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

        return other is FeedbackCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.key == other.key &&
            this.runId == other.runId &&
            this.id == other.id &&
            this.comment == other.comment &&
            this.correction == other.correction &&
            this.createdAt == other.createdAt &&
            this.feedbackConfig == other.feedbackConfig &&
            this.feedbackSource == other.feedbackSource &&
            this.modifiedAt == other.modifiedAt &&
            this.score == other.score &&
            this.value == other.value &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            key, // templates/JavaSDK/entities/fields.ts:163:19
            runId,
            id,
            comment,
            correction,
            createdAt,
            feedbackConfig,
            feedbackSource,
            modifiedAt,
            score,
            value,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FeedbackCreateParams{key=$key, runId=$runId, id=$id, comment=$comment, correction=$correction, createdAt=$createdAt, feedbackConfig=$feedbackConfig, feedbackSource=$feedbackSource, modifiedAt=$modifiedAt, score=$score, value=$value, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var key: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var runId: String? = null
        private var id: String? = null
        private var comment: String? = null
        private var correction: JsonValue? = null
        private var createdAt: OffsetDateTime? = null
        private var feedbackConfig: FeedbackConfig? = null
        private var feedbackSource: FeedbackSource? = null
        private var modifiedAt: OffsetDateTime? = null
        private var score: Score? = null
        private var value: Value? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(feedbackCreateParams: FeedbackCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.key =
                    feedbackCreateParams.key // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.runId = feedbackCreateParams.runId
                this.id = feedbackCreateParams.id
                this.comment = feedbackCreateParams.comment
                this.correction = feedbackCreateParams.correction
                this.createdAt = feedbackCreateParams.createdAt
                this.feedbackConfig = feedbackCreateParams.feedbackConfig
                this.feedbackSource = feedbackCreateParams.feedbackSource
                this.modifiedAt = feedbackCreateParams.modifiedAt
                this.score = feedbackCreateParams.score
                this.value = feedbackCreateParams.value
                additionalQueryParams(feedbackCreateParams.additionalQueryParams)
                additionalHeaders(feedbackCreateParams.additionalHeaders)
                additionalBodyProperties(feedbackCreateParams.additionalBodyProperties)
            }

        fun key(key: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.key = key
        }

        fun runId(runId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.runId = runId
        }

        fun id(id: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.id = id
        }

        fun comment(comment: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.comment = comment
        }

        fun correction(correction: JsonValue) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.correction = correction
            }

        fun createdAt(createdAt: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.createdAt = createdAt
            }

        fun feedbackConfig(feedbackConfig: FeedbackConfig) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.feedbackConfig = feedbackConfig
            }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(feedbackSource: FeedbackSource) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.feedbackSource = feedbackSource
            }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(appFeedbackSource: FeedbackSource.AppFeedbackSource) =
            apply { // templates/JavaSDK/entities/params.ts:659:30
                this.feedbackSource = FeedbackSource.ofAppFeedbackSource(appFeedbackSource)
            }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(apiFeedbackSource: FeedbackSource.ApiFeedbackSource) =
            apply { // templates/JavaSDK/entities/params.ts:659:30
                this.feedbackSource = FeedbackSource.ofApiFeedbackSource(apiFeedbackSource)
            }

        /** Feedback from the LangChainPlus App. */
        fun feedbackSource(modelFeedbackSource: FeedbackSource.ModelFeedbackSource) =
            apply { // templates/JavaSDK/entities/params.ts:659:30
                this.feedbackSource = FeedbackSource.ofModelFeedbackSource(modelFeedbackSource)
            }

        fun modifiedAt(modifiedAt: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.modifiedAt = modifiedAt
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

        fun build(): FeedbackCreateParams =
            FeedbackCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(key) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`key` is required but was not set"
                },
                checkNotNull(runId) { // templates/JavaSDK/entities/params.ts:844:13
                    "`runId` is required but was not set"
                },
                id,
                comment,
                correction,
                createdAt,
                feedbackConfig,
                feedbackSource,
                modifiedAt,
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
        using = FeedbackSource.Deserializer::class
    ) // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13 // templates/JavaSDK/entities/unions.ts:68:13 //
    // templates/JavaSDK/entities/unions.ts:68:13
    @JsonSerialize(using = FeedbackSource.Serializer::class)
    class FeedbackSource
    private constructor( // templates/JavaSDK/entities/unions.ts:68:13
        private val appFeedbackSource: AppFeedbackSource? =
            null, // templates/JavaSDK/entities/unions.ts:68:13 //
        // templates/JavaSDK/entities/unions.ts:68:13
        private val apiFeedbackSource: ApiFeedbackSource? = null,
        private val modelFeedbackSource: ModelFeedbackSource? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false // templates/JavaSDK/entities/unions.ts:68:13

        /** Feedback from the LangChainPlus App. */
        // templates/JavaSDK/entities/unions.ts:89:12 // templates/JavaSDK/entities/unions.ts:89:12
        fun appFeedbackSource(): Optional<AppFeedbackSource> =
            Optional.ofNullable(appFeedbackSource)
        /** API feedback source. */
        fun apiFeedbackSource(): Optional<ApiFeedbackSource> =
            Optional.ofNullable(apiFeedbackSource)
        /** Model feedback source. */
        fun modelFeedbackSource(): Optional<ModelFeedbackSource> =
            Optional.ofNullable(modelFeedbackSource)

        fun isAppFeedbackSource(): Boolean =
            appFeedbackSource != null // templates/JavaSDK/entities/unions.ts:104:12 //
        // templates/JavaSDK/entities/unions.ts:104:12

        fun isApiFeedbackSource(): Boolean = apiFeedbackSource != null

        fun isModelFeedbackSource(): Boolean = modelFeedbackSource != null

        fun asAppFeedbackSource(): AppFeedbackSource =
            appFeedbackSource.getOrThrow(
                "appFeedbackSource"
            ) // templates/JavaSDK/entities/unions.ts:113:12 //
        // templates/JavaSDK/entities/unions.ts:113:12

        fun asApiFeedbackSource(): ApiFeedbackSource =
            apiFeedbackSource.getOrThrow("apiFeedbackSource")

        fun asModelFeedbackSource(): ModelFeedbackSource =
            modelFeedbackSource.getOrThrow("modelFeedbackSource")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T { // templates/JavaSDK/entities/unions.ts:128:10
            return when { // templates/JavaSDK/entities/unions.ts:134:30
                appFeedbackSource != null ->
                    visitor.visitAppFeedbackSource(
                        appFeedbackSource
                    ) // templates/JavaSDK/entities/unions.ts:134:30 //
                // templates/JavaSDK/entities/unions.ts:134:30
                apiFeedbackSource != null -> visitor.visitApiFeedbackSource(apiFeedbackSource)
                modelFeedbackSource != null -> visitor.visitModelFeedbackSource(modelFeedbackSource)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): FeedbackSource = apply { // templates/JavaSDK/entities/unions.ts:151:28
            if (!validated) { // templates/JavaSDK/entities/unions.ts:154:20 //
                // templates/JavaSDK/entities/unions.ts:151:28 //
                // templates/JavaSDK/entities/unions.ts:151:28
                if (
                    appFeedbackSource == null &&
                        apiFeedbackSource == null &&
                        modelFeedbackSource == null
                ) { // templates/JavaSDK/entities/unions.ts:157:24 //
                    // templates/JavaSDK/entities/unions.ts:154:20 //
                    // templates/JavaSDK/entities/unions.ts:154:20
                    throw LangSmithInvalidDataException("Unknown FeedbackSource: $_json")
                }
                appFeedbackSource?.validate()
                apiFeedbackSource?.validate()
                modelFeedbackSource?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is FeedbackSource && // templates/JavaSDK/entities/fields.ts:143:33
                this.appFeedbackSource == other.appFeedbackSource &&
                this.apiFeedbackSource == other.apiFeedbackSource &&
                this.modelFeedbackSource == other.modelFeedbackSource
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
                // templates/JavaSDK/entities/fields.ts:181:14
                appFeedbackSource, // templates/JavaSDK/entities/fields.ts:163:19
                apiFeedbackSource,
                modelFeedbackSource,
            )
        }

        override fun toString(): String { // templates/JavaSDK/entities/unions.ts:181:10
            return when { // templates/JavaSDK/entities/unions.ts:188:16
                appFeedbackSource != null ->
                    "FeedbackSource{appFeedbackSource=$appFeedbackSource}" // templates/JavaSDK/entities/unions.ts:188:16 // templates/JavaSDK/entities/unions.ts:188:16
                apiFeedbackSource != null -> "FeedbackSource{apiFeedbackSource=$apiFeedbackSource}"
                modelFeedbackSource != null ->
                    "FeedbackSource{modelFeedbackSource=$modelFeedbackSource}"
                _json != null -> "FeedbackSource{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FeedbackSource")
            }
        }

        companion object { // templates/JavaSDK/entities/unions.ts:201:10

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14 //
            // templates/JavaSDK/entities/unions.ts:201:10
            fun ofAppFeedbackSource(appFeedbackSource: AppFeedbackSource) =
                FeedbackSource(appFeedbackSource = appFeedbackSource)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofApiFeedbackSource(apiFeedbackSource: ApiFeedbackSource) =
                FeedbackSource(apiFeedbackSource = apiFeedbackSource)

            @JvmStatic // templates/JavaSDK/entities/unions.ts:203:14
            fun ofModelFeedbackSource(modelFeedbackSource: ModelFeedbackSource) =
                FeedbackSource(modelFeedbackSource = modelFeedbackSource)
        }

        interface Visitor<out T> { // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10 //
            // templates/JavaSDK/entities/unions.ts:211:10

            fun visitAppFeedbackSource(
                appFeedbackSource: AppFeedbackSource
            ): T // templates/JavaSDK/entities/unions.ts:211:10

            fun visitApiFeedbackSource(apiFeedbackSource: ApiFeedbackSource): T

            fun visitModelFeedbackSource(modelFeedbackSource: ModelFeedbackSource): T

            fun unknown(json: JsonValue?): T { // templates/JavaSDK/entities/unions.ts:230:14
                throw LangSmithInvalidDataException("Unknown FeedbackSource: $json")
            }
        }

        class Deserializer :
            BaseDeserializer<FeedbackSource>(
                FeedbackSource::class
            ) { // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10 //
            // templates/JavaSDK/entities/unions.ts:240:10

            override fun ObjectCodec.deserialize(
                node: JsonNode
            ): FeedbackSource { // templates/JavaSDK/entities/unions.ts:244:14 //
                // templates/JavaSDK/entities/unions.ts:240:10
                val json =
                    JsonValue.fromJsonNode(node) // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:251:22 //
                // templates/JavaSDK/entities/unions.ts:250:28
                tryDeserialize(node, jacksonTypeRef<AppFeedbackSource>()) { it.validate() }
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return FeedbackSource(appFeedbackSource = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ApiFeedbackSource>()) { it.validate() }
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return FeedbackSource(apiFeedbackSource = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<ModelFeedbackSource>()) { it.validate() }
                    ?.let { // templates/JavaSDK/entities/unions.ts:254:34
                        return FeedbackSource(modelFeedbackSource = it, _json = json)
                    }

                return FeedbackSource(_json = json)
            }
        }

        class Serializer :
            BaseSerializer<FeedbackSource>(
                FeedbackSource::class
            ) { // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10 //
            // templates/JavaSDK/entities/unions.ts:269:10

            override fun serialize(
                value: FeedbackSource,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) { // templates/JavaSDK/entities/unions.ts:273:14 //
                // templates/JavaSDK/entities/unions.ts:269:10
                when { // templates/JavaSDK/entities/unions.ts:278:24
                    value.appFeedbackSource != null ->
                        generator.writeObject(
                            value.appFeedbackSource
                        ) // templates/JavaSDK/entities/unions.ts:278:24 //
                    // templates/JavaSDK/entities/unions.ts:278:24
                    value.apiFeedbackSource != null ->
                        generator.writeObject(value.apiFeedbackSource)
                    value.modelFeedbackSource != null ->
                        generator.writeObject(value.modelFeedbackSource)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FeedbackSource")
                }
            }
        }

        /** Feedback from the LangChainPlus App. */
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @JsonDeserialize(builder = AppFeedbackSource.Builder::class)
        @NoAutoDetect
        class AppFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _type() = type

            @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _metadata() = metadata

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AppFeedbackSource =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        type() // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:201:20
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

                return other is AppFeedbackSource && // templates/JavaSDK/entities/fields.ts:143:33
                    this.type == other.type &&
                    this.metadata == other.metadata &&
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
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AppFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var type: JsonField<String> =
                    JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(appFeedbackSource: AppFeedbackSource) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.type =
                            appFeedbackSource
                                .type // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.metadata = appFeedbackSource.metadata
                        additionalProperties(appFeedbackSource.additionalProperties)
                    }

                fun type(type: String) =
                    type(JsonField.of(type)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun type(type: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.type = type
                    }

                @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun metadata(metadata: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.metadata = metadata
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

                fun build(): AppFeedbackSource =
                    AppFeedbackSource( // templates/JavaSDK/entities/objects.ts:326:30
                        type, // templates/JavaSDK/entities/objects.ts:326:30
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** API feedback source. */
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @JsonDeserialize(builder = ApiFeedbackSource.Builder::class)
        @NoAutoDetect
        class ApiFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _type() = type

            @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _metadata() = metadata

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ApiFeedbackSource =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        type() // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:201:20
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

                return other is ApiFeedbackSource && // templates/JavaSDK/entities/fields.ts:143:33
                    this.type == other.type &&
                    this.metadata == other.metadata &&
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
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ApiFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var type: JsonField<String> =
                    JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(apiFeedbackSource: ApiFeedbackSource) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.type =
                            apiFeedbackSource
                                .type // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.metadata = apiFeedbackSource.metadata
                        additionalProperties(apiFeedbackSource.additionalProperties)
                    }

                fun type(type: String) =
                    type(JsonField.of(type)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun type(type: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.type = type
                    }

                @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun metadata(metadata: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.metadata = metadata
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

                fun build(): ApiFeedbackSource =
                    ApiFeedbackSource( // templates/JavaSDK/entities/objects.ts:326:30
                        type, // templates/JavaSDK/entities/objects.ts:326:30
                        metadata,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /** Model feedback source. */
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        @JsonDeserialize(builder = ModelFeedbackSource.Builder::class)
        @NoAutoDetect
        class ModelFeedbackSource
        private constructor(
            private val type: JsonField<String>,
            private val metadata: JsonValue,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false // templates/JavaSDK/entities/objects.ts:94:14 //
            // templates/JavaSDK/entities/objects.ts:76:13

            private var hashCode: Int = 0

            fun type(): Optional<String> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _type() = type

            @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:166:16
            @ExcludeMissing
            fun _metadata() = metadata

            @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
            // templates/JavaSDK/entities/objects.ts:180:12
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ModelFeedbackSource =
                apply { // templates/JavaSDK/entities/objects.ts:198:28
                    if (!validated) { // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:198:28 //
                        // templates/JavaSDK/entities/objects.ts:198:28
                        type() // templates/JavaSDK/entities/objects.ts:201:20 //
                        // templates/JavaSDK/entities/objects.ts:201:20
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

                return other is
                    ModelFeedbackSource && // templates/JavaSDK/entities/fields.ts:143:33
                    this.type == other.type &&
                    this.metadata == other.metadata &&
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
                            metadata,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "ModelFeedbackSource{type=$type, metadata=$metadata, additionalProperties=$additionalProperties}"

            companion object { // templates/JavaSDK/entities/objects.ts:217:10

                @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
                // templates/JavaSDK/entities/objects.ts:217:10
                fun builder() = Builder()
            }

            class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10 //
                // templates/JavaSDK/entities/objects.ts:224:10

                private var type: JsonField<String> =
                    JsonMissing.of() // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:226:16 //
                // templates/JavaSDK/entities/objects.ts:224:10
                private var metadata: JsonValue = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
                internal fun from(modelFeedbackSource: ModelFeedbackSource) =
                    apply { // templates/JavaSDK/entities/objects.ts:240:30
                        this.type =
                            modelFeedbackSource
                                .type // templates/JavaSDK/entities/objects.ts:240:30 //
                        // templates/JavaSDK/entities/objects.ts:240:30
                        this.metadata = modelFeedbackSource.metadata
                        additionalProperties(modelFeedbackSource.additionalProperties)
                    }

                fun type(type: String) =
                    type(JsonField.of(type)) // templates/JavaSDK/entities/objects.ts:252:20

                @JsonProperty("type") // templates/JavaSDK/entities/objects.ts:264:20
                @ExcludeMissing
                fun type(type: JsonField<String>) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.type = type
                    }

                @JsonProperty("metadata") // templates/JavaSDK/entities/objects.ts:264:20 //
                // templates/JavaSDK/entities/objects.ts:252:20
                @ExcludeMissing
                fun metadata(metadata: JsonValue) =
                    apply { // templates/JavaSDK/entities/objects.ts:275:36
                        this.metadata = metadata
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

                fun build(): ModelFeedbackSource =
                    ModelFeedbackSource( // templates/JavaSDK/entities/objects.ts:326:30
                        type, // templates/JavaSDK/entities/objects.ts:326:30
                        metadata,
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
