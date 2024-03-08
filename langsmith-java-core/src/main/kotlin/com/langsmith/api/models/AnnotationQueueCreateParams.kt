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

class AnnotationQueueCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val name: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val id: String?,
    private val createdAt: OffsetDateTime?,
    private val description: String?,
    private val updatedAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody():
        AnnotationQueueCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return AnnotationQueueCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            name, // templates/JavaSDK/entities/params.ts:180:26
            id,
            createdAt,
            description,
            updatedAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** AnnotationQueue schema. */
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13
    @JsonDeserialize(builder = AnnotationQueueCreateBody.Builder::class)
    @NoAutoDetect
    class AnnotationQueueCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val name: String?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val id: String?,
        private val createdAt: OffsetDateTime?,
        private val description: String?,
        private val updatedAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:113:14
        fun name(): String? = name

        @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:113:14
        fun id(): String? = id

        @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:113:14
        fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:113:14
        fun description(): String? = description

        @JsonProperty("updated_at") // templates/JavaSDK/entities/objects.ts:113:14
        fun updatedAt(): OffsetDateTime? = updatedAt

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
                AnnotationQueueCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.name == other.name &&
                this.id == other.id &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.updatedAt == other.updatedAt &&
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
                        name, // templates/JavaSDK/entities/fields.ts:163:19
                        id,
                        createdAt,
                        description,
                        updatedAt,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AnnotationQueueCreateBody{name=$name, id=$id, createdAt=$createdAt, description=$description, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var name: String? = null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var id: String? = null
            private var createdAt: OffsetDateTime? = null
            private var description: String? = null
            private var updatedAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(annotationQueueCreateBody: AnnotationQueueCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.name =
                        annotationQueueCreateBody
                            .name // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.id = annotationQueueCreateBody.id
                    this.createdAt = annotationQueueCreateBody.createdAt
                    this.description = annotationQueueCreateBody.description
                    this.updatedAt = annotationQueueCreateBody.updatedAt
                    additionalProperties(annotationQueueCreateBody.additionalProperties)
                }

            @JsonProperty("name") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun name(name: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.name = name
            }

            @JsonProperty("id") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun id(id: String) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.id = id
            }

            @JsonProperty("created_at") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun createdAt(createdAt: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.createdAt = createdAt
                }

            @JsonProperty("description") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun description(description: String) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.description = description
                }

            @JsonProperty("updated_at") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun updatedAt(updatedAt: OffsetDateTime) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.updatedAt = updatedAt
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

            fun build(): AnnotationQueueCreateBody =
                AnnotationQueueCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(name) { // templates/JavaSDK/entities/objects.ts:358:13 //
                        // templates/JavaSDK/entities/objects.ts:326:30
                        "`name` is required but was not set"
                    },
                    id,
                    createdAt,
                    description,
                    updatedAt,
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
            AnnotationQueueCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.name == other.name &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.updatedAt == other.updatedAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            name, // templates/JavaSDK/entities/fields.ts:163:19
            id,
            createdAt,
            description,
            updatedAt,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AnnotationQueueCreateParams{name=$name, id=$id, createdAt=$createdAt, description=$description, updatedAt=$updatedAt, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var name: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var id: String? = null
        private var createdAt: OffsetDateTime? = null
        private var description: String? = null
        private var updatedAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(annotationQueueCreateParams: AnnotationQueueCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.name =
                    annotationQueueCreateParams
                        .name // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.id = annotationQueueCreateParams.id
                this.createdAt = annotationQueueCreateParams.createdAt
                this.description = annotationQueueCreateParams.description
                this.updatedAt = annotationQueueCreateParams.updatedAt
                additionalQueryParams(annotationQueueCreateParams.additionalQueryParams)
                additionalHeaders(annotationQueueCreateParams.additionalHeaders)
                additionalBodyProperties(annotationQueueCreateParams.additionalBodyProperties)
            }

        fun name(name: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.name = name
        }

        fun id(id: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.id = id
        }

        fun createdAt(createdAt: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.createdAt = createdAt
            }

        fun description(description: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.description = description
            }

        fun updatedAt(updatedAt: OffsetDateTime) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.updatedAt = updatedAt
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

        fun build(): AnnotationQueueCreateParams =
            AnnotationQueueCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(name) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`name` is required but was not set"
                },
                id,
                createdAt,
                description,
                updatedAt,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
