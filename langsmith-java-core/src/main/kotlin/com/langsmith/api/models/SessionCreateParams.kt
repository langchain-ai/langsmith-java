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

class SessionCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val id: String?, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val defaultDatasetId: String?,
    private val description: String?,
    private val endTime: OffsetDateTime?,
    private val extra: JsonValue?,
    private val name: String?,
    private val referenceDatasetId: String?,
    private val startTime: OffsetDateTime?,
    private val upsert: Boolean?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun id(): Optional<String> =
        Optional.ofNullable(id) // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun defaultDatasetId(): Optional<String> = Optional.ofNullable(defaultDatasetId)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun extra(): Optional<JsonValue> = Optional.ofNullable(extra)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun referenceDatasetId(): Optional<String> = Optional.ofNullable(referenceDatasetId)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    fun upsert(): Optional<Boolean> = Optional.ofNullable(upsert)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody(): SessionCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return SessionCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            id, // templates/JavaSDK/entities/params.ts:180:26
            defaultDatasetId,
            description,
            endTime,
            extra,
            name,
            referenceDatasetId,
            startTime,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.upsert?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("upsert", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Create class for TracerSession. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = SessionCreateBody.Builder::class)
    @NoAutoDetect
    class SessionCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val id: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val defaultDatasetId: String?,
        private val description: String?,
        private val endTime: OffsetDateTime?,
        private val extra: JsonValue?,
        private val name: String?,
        private val referenceDatasetId: String?,
        private val startTime: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:113:14
        fun id(): String? = id

        @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:113:14
        fun defaultDatasetId(): String? = defaultDatasetId

        @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:113:14
        fun description(): String? = description

        @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:113:14
        fun extra(): JsonValue? = extra

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:113:14
        fun name(): String? = name

        @JsonProperty("reference_dataset_id") // templates/JavaSDK/entities/objects.ts:113:14
        fun referenceDatasetId(): String? = referenceDatasetId

        @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:113:14
        fun startTime(): OffsetDateTime? = startTime

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is SessionCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.id == other.id &&
                this.defaultDatasetId == other.defaultDatasetId &&
                this.description == other.description &&
                this.endTime == other.endTime &&
                this.extra == other.extra &&
                this.name == other.name &&
                this.referenceDatasetId == other.referenceDatasetId &&
                this.startTime == other.startTime &&
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
                        id, // templates/JavaSDK/entities/fields.ts:163:19
                        defaultDatasetId,
                        description,
                        endTime,
                        extra,
                        name,
                        referenceDatasetId,
                        startTime,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SessionCreateBody{id=$id, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, referenceDatasetId=$referenceDatasetId, startTime=$startTime, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var id: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var defaultDatasetId: String? = null
            private var description: String? = null
            private var endTime: OffsetDateTime? = null
            private var extra: JsonValue? = null
            private var name: String? = null
            private var referenceDatasetId: String? = null
            private var startTime: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(sessionCreateBody: SessionCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.id =
                        sessionCreateBody.id // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.defaultDatasetId = sessionCreateBody.defaultDatasetId
                    this.description = sessionCreateBody.description
                    this.endTime = sessionCreateBody.endTime
                    this.extra = sessionCreateBody.extra
                    this.name = sessionCreateBody.name
                    this.referenceDatasetId = sessionCreateBody.referenceDatasetId
                    this.startTime = sessionCreateBody.startTime
                    additionalProperties(sessionCreateBody.additionalProperties)
                }

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun id(id: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            @JsonProperty("default_dataset_id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun defaultDatasetId(defaultDatasetId: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.defaultDatasetId = defaultDatasetId
                }

            @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun description(description: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.description = description
                }

            @JsonProperty("end_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun endTime(endTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.endTime = endTime
                }

            @JsonProperty("extra") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.extra = extra
            }

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun name(name: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.name = name
            }

            @JsonProperty("reference_dataset_id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun referenceDatasetId(referenceDatasetId: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.referenceDatasetId = referenceDatasetId
                }

            @JsonProperty("start_time") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun startTime(startTime: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.startTime = startTime
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

            fun build(): SessionCreateBody =
                SessionCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    id, // templates/JavaSDK/entities/objects.ts:326:30
                    defaultDatasetId,
                    description,
                    endTime,
                    extra,
                    name,
                    referenceDatasetId,
                    startTime,
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

        return other is SessionCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.id == other.id &&
            this.defaultDatasetId == other.defaultDatasetId &&
            this.description == other.description &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.name == other.name &&
            this.referenceDatasetId == other.referenceDatasetId &&
            this.startTime == other.startTime &&
            this.upsert == other.upsert &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            id, // templates/JavaSDK/entities/fields.ts:163:19
            defaultDatasetId,
            description,
            endTime,
            extra,
            name,
            referenceDatasetId,
            startTime,
            upsert,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SessionCreateParams{id=$id, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, referenceDatasetId=$referenceDatasetId, startTime=$startTime, upsert=$upsert, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var id: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var defaultDatasetId: String? = null
        private var description: String? = null
        private var endTime: OffsetDateTime? = null
        private var extra: JsonValue? = null
        private var name: String? = null
        private var referenceDatasetId: String? = null
        private var startTime: OffsetDateTime? = null
        private var upsert: Boolean? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(sessionCreateParams: SessionCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.id = sessionCreateParams.id // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.defaultDatasetId = sessionCreateParams.defaultDatasetId
                this.description = sessionCreateParams.description
                this.endTime = sessionCreateParams.endTime
                this.extra = sessionCreateParams.extra
                this.name = sessionCreateParams.name
                this.referenceDatasetId = sessionCreateParams.referenceDatasetId
                this.startTime = sessionCreateParams.startTime
                this.upsert = sessionCreateParams.upsert
                additionalQueryParams(sessionCreateParams.additionalQueryParams)
                additionalHeaders(sessionCreateParams.additionalHeaders)
                additionalBodyProperties(sessionCreateParams.additionalBodyProperties)
            }

        fun id(id: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.id = id
        }

        fun defaultDatasetId(defaultDatasetId: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.defaultDatasetId = defaultDatasetId
            }

        fun description(description: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.description = description
            }

        fun endTime(endTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.endTime = endTime
            }

        fun extra(extra: JsonValue) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.extra = extra
        }

        fun name(name: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.name = name
        }

        fun referenceDatasetId(referenceDatasetId: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.referenceDatasetId = referenceDatasetId
            }

        fun startTime(startTime: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.startTime = startTime
            }

        fun upsert(upsert: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.upsert = upsert
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

        fun build(): SessionCreateParams =
            SessionCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                id, // templates/JavaSDK/entities/params.ts:683:22
                defaultDatasetId,
                description,
                endTime,
                extra,
                name,
                referenceDatasetId,
                startTime,
                upsert,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
