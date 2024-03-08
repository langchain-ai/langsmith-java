// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

// //
// templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnyGetter // templates/JavaSDK/components/file.ts:28:17
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class AnnotationQueueRunUpdateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val queueId: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val queueRunId: String,
    private val addedAt: OffsetDateTime?,
    private val lastReviewedTime: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun queueId(): String = queueId // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun queueRunId(): String = queueRunId

    fun addedAt(): Optional<OffsetDateTime> = Optional.ofNullable(addedAt)

    fun lastReviewedTime(): Optional<OffsetDateTime> = Optional.ofNullable(lastReviewedTime)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody():
        AnnotationQueueRunUpdateBody { // templates/JavaSDK/entities/params.ts:165:16
        return AnnotationQueueRunUpdateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            addedAt, // templates/JavaSDK/entities/params.ts:180:26
            lastReviewedTime,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> queueId // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            1 -> queueRunId
            else -> ""
        }
    }

    @JsonDeserialize(
        builder = AnnotationQueueRunUpdateBody.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class AnnotationQueueRunUpdateBody
    internal constructor(
        private val addedAt: OffsetDateTime?,
        private val lastReviewedTime: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("added_at") // templates/JavaSDK/entities/objects.ts:113:14
        fun addedAt(): OffsetDateTime? = addedAt

        @JsonProperty("last_reviewed_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun lastReviewedTime(): OffsetDateTime? = lastReviewedTime

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
                AnnotationQueueRunUpdateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.addedAt == other.addedAt &&
                this.lastReviewedTime == other.lastReviewedTime &&
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
                        addedAt, // templates/JavaSDK/entities/fields.ts:163:19
                        lastReviewedTime,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AnnotationQueueRunUpdateBody{addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var addedAt: OffsetDateTime? =
                null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var lastReviewedTime: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(annotationQueueRunUpdateBody: AnnotationQueueRunUpdateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.addedAt =
                        annotationQueueRunUpdateBody
                            .addedAt // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.lastReviewedTime = annotationQueueRunUpdateBody.lastReviewedTime
                    additionalProperties(annotationQueueRunUpdateBody.additionalProperties)
                }

            @JsonProperty("added_at") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun addedAt(addedAt: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.addedAt = addedAt
                }

            @JsonProperty("last_reviewed_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun lastReviewedTime(lastReviewedTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.lastReviewedTime = lastReviewedTime
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

            fun build(): AnnotationQueueRunUpdateBody =
                AnnotationQueueRunUpdateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    addedAt, // templates/JavaSDK/entities/objects.ts:326:30
                    lastReviewedTime,
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

        return other is
            AnnotationQueueRunUpdateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.queueId == other.queueId &&
            this.queueRunId == other.queueRunId &&
            this.addedAt == other.addedAt &&
            this.lastReviewedTime == other.lastReviewedTime &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            queueId, // templates/JavaSDK/entities/fields.ts:163:19
            queueRunId,
            addedAt,
            lastReviewedTime,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AnnotationQueueRunUpdateParams{queueId=$queueId, queueRunId=$queueRunId, addedAt=$addedAt, lastReviewedTime=$lastReviewedTime, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var queueId: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var queueRunId: String? = null
        private var addedAt: OffsetDateTime? = null
        private var lastReviewedTime: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(annotationQueueRunUpdateParams: AnnotationQueueRunUpdateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.queueId =
                    annotationQueueRunUpdateParams
                        .queueId // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.queueRunId = annotationQueueRunUpdateParams.queueRunId
                this.addedAt = annotationQueueRunUpdateParams.addedAt
                this.lastReviewedTime = annotationQueueRunUpdateParams.lastReviewedTime
                additionalQueryParams(annotationQueueRunUpdateParams.additionalQueryParams)
                additionalHeaders(annotationQueueRunUpdateParams.additionalHeaders)
                additionalBodyProperties(annotationQueueRunUpdateParams.additionalBodyProperties)
            }

        fun queueId(queueId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.queueId = queueId
        }

        fun queueRunId(queueRunId: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.queueRunId = queueRunId
        }

        fun addedAt(addedAt: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.addedAt = addedAt
            }

        fun lastReviewedTime(lastReviewedTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.lastReviewedTime = lastReviewedTime
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

        fun build(): AnnotationQueueRunUpdateParams =
            AnnotationQueueRunUpdateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(queueId) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`queueId` is required but was not set"
                },
                checkNotNull(queueRunId) { // templates/JavaSDK/entities/params.ts:844:13
                    "`queueRunId` is required but was not set"
                },
                addedAt,
                lastReviewedTime,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
