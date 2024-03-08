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
import java.util.Objects
import java.util.Optional

class PublicExampleRunCreateParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val shareToken: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val sessionIds: List<String>,
    private val filters: Filters?,
    private val limit: Long?,
    private val offset: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun shareToken(): String = shareToken // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun sessionIds(): List<String> = sessionIds

    fun filters(): Optional<Filters> = Optional.ofNullable(filters)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:165:16
    internal fun getBody():
        PublicExampleRunCreateBody { // templates/JavaSDK/entities/params.ts:165:16
        return PublicExampleRunCreateBody( // templates/JavaSDK/entities/params.ts:180:26 //
            // templates/JavaSDK/entities/params.ts:179:24
            sessionIds, // templates/JavaSDK/entities/params.ts:180:26
            filters,
            limit,
            offset,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> shareToken // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    @JsonDeserialize(
        builder = PublicExampleRunCreateBody.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class PublicExampleRunCreateBody
    internal constructor( // templates/JavaSDK/entities/objects.ts:76:13
        private val sessionIds: List<String>?, // templates/JavaSDK/entities/objects.ts:76:13 //
        // templates/JavaSDK/entities/objects.ts:76:13
        private val filters: Filters?,
        private val limit: Long?,
        private val offset: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonProperty("session_ids") // templates/JavaSDK/entities/objects.ts:113:14
        fun sessionIds(): List<String>? = sessionIds

        @JsonProperty("filters") // templates/JavaSDK/entities/objects.ts:113:14
        fun filters(): Filters? = filters

        @JsonProperty("limit") // templates/JavaSDK/entities/objects.ts:113:14
        fun limit(): Long? = limit

        @JsonProperty("offset") // templates/JavaSDK/entities/objects.ts:113:14
        fun offset(): Long? = offset

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
                PublicExampleRunCreateBody && // templates/JavaSDK/entities/fields.ts:143:33
                this.sessionIds == other.sessionIds &&
                this.filters == other.filters &&
                this.limit == other.limit &&
                this.offset == other.offset &&
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
                        sessionIds, // templates/JavaSDK/entities/fields.ts:163:19
                        filters,
                        limit,
                        offset,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PublicExampleRunCreateBody{sessionIds=$sessionIds, filters=$filters, limit=$limit, offset=$offset, additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var sessionIds: List<String>? =
                null // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:226:16 //
            // templates/JavaSDK/entities/objects.ts:224:10
            private var filters: Filters? = null
            private var limit: Long? = null
            private var offset: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(publicExampleRunCreateBody: PublicExampleRunCreateBody) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    this.sessionIds =
                        publicExampleRunCreateBody
                            .sessionIds // templates/JavaSDK/entities/objects.ts:240:30 //
                    // templates/JavaSDK/entities/objects.ts:240:30
                    this.filters = publicExampleRunCreateBody.filters
                    this.limit = publicExampleRunCreateBody.limit
                    this.offset = publicExampleRunCreateBody.offset
                    additionalProperties(publicExampleRunCreateBody.additionalProperties)
                }

            @JsonProperty("session_ids") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun sessionIds(sessionIds: List<String>) =
                apply { // templates/JavaSDK/entities/objects.ts:275:36
                    this.sessionIds = sessionIds
                }

            @JsonProperty("filters") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun filters(filters: Filters) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.filters = filters
            }

            @JsonProperty("limit") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun limit(limit: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.limit = limit
            }

            @JsonProperty("offset") // templates/JavaSDK/entities/objects.ts:264:20 //
            // templates/JavaSDK/entities/objects.ts:252:20
            fun offset(offset: Long) = apply { // templates/JavaSDK/entities/objects.ts:275:36
                this.offset = offset
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

            fun build(): PublicExampleRunCreateBody =
                PublicExampleRunCreateBody( // templates/JavaSDK/entities/objects.ts:326:30
                    checkNotNull(sessionIds) { // templates/JavaSDK/entities/objects.ts:358:13 //
                            // templates/JavaSDK/entities/objects.ts:326:30
                            "`sessionIds` is required but was not set"
                        }
                        .toUnmodifiable(),
                    filters,
                    limit,
                    offset,
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
            PublicExampleRunCreateParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.shareToken == other.shareToken &&
            this.sessionIds == other.sessionIds &&
            this.filters == other.filters &&
            this.limit == other.limit &&
            this.offset == other.offset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            shareToken, // templates/JavaSDK/entities/fields.ts:163:19
            sessionIds,
            filters,
            limit,
            offset,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PublicExampleRunCreateParams{shareToken=$shareToken, sessionIds=$sessionIds, filters=$filters, limit=$limit, offset=$offset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object { // templates/JavaSDK/entities/builders.ts:8:8

        @JvmStatic // templates/JavaSDK/entities/builders.ts:9:10 //
        // templates/JavaSDK/entities/builders.ts:8:8
        fun builder() = Builder()
    }

    @NoAutoDetect // templates/JavaSDK/entities/params.ts:235:14 //
    // templates/JavaSDK/entities/params.ts:235:14
    class Builder { // templates/JavaSDK/entities/params.ts:235:14

        private var shareToken: String? = null // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:238:20 //
        // templates/JavaSDK/entities/params.ts:235:14
        private var sessionIds: MutableList<String> = mutableListOf()
        private var filters: Filters? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(publicExampleRunCreateParams: PublicExampleRunCreateParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.shareToken =
                    publicExampleRunCreateParams
                        .shareToken // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.sessionIds(publicExampleRunCreateParams.sessionIds)
                this.filters = publicExampleRunCreateParams.filters
                this.limit = publicExampleRunCreateParams.limit
                this.offset = publicExampleRunCreateParams.offset
                additionalQueryParams(publicExampleRunCreateParams.additionalQueryParams)
                additionalHeaders(publicExampleRunCreateParams.additionalHeaders)
                additionalBodyProperties(publicExampleRunCreateParams.additionalBodyProperties)
            }

        fun shareToken(shareToken: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.shareToken = shareToken
        }

        fun sessionIds(sessionIds: List<String>) =
            apply { // templates/JavaSDK/entities/params.ts:609:26
                this.sessionIds.clear() // templates/JavaSDK/entities/params.ts:609:26 //
                // templates/JavaSDK/entities/params.ts:609:26
                this.sessionIds.addAll(sessionIds)
            }

        fun addSessionId(sessionId: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.sessionIds.add(sessionId)
        }

        fun filters(filters: Filters) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.filters = filters
        }

        fun limit(limit: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.limit = limit
        }

        fun offset(offset: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.offset = offset
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

        fun build(): PublicExampleRunCreateParams =
            PublicExampleRunCreateParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(shareToken) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`shareToken` is required but was not set"
                },
                checkNotNull(sessionIds) { // templates/JavaSDK/entities/params.ts:844:13
                        "`sessionIds` is required but was not set"
                    }
                    .toUnmodifiable(),
                filters,
                limit,
                offset,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(
        builder = Filters.Builder::class
    ) // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    // // templates/JavaSDK/entities/objects.ts:76:13 //
    // templates/JavaSDK/entities/objects.ts:76:13 // templates/JavaSDK/entities/objects.ts:76:13
    @NoAutoDetect
    class Filters
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0 // templates/JavaSDK/entities/objects.ts:94:14 //
        // templates/JavaSDK/entities/objects.ts:76:13

        @JsonAnyGetter // templates/JavaSDK/entities/objects.ts:180:12 //
        // templates/JavaSDK/entities/objects.ts:180:12
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is Filters && // templates/JavaSDK/entities/fields.ts:143:33
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
            if (hashCode == 0) { // templates/JavaSDK/entities/fields.ts:175:16 //
                // templates/JavaSDK/entities/fields.ts:174:16 //
                // templates/JavaSDK/entities/fields.ts:174:16
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Filters{additionalProperties=$additionalProperties}"

        companion object { // templates/JavaSDK/entities/objects.ts:217:10

            @JvmStatic // templates/JavaSDK/entities/objects.ts:218:12 //
            // templates/JavaSDK/entities/objects.ts:217:10
            fun builder() = Builder()
        }

        class Builder { // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10 //
            // templates/JavaSDK/entities/objects.ts:224:10

            private var additionalProperties: MutableMap<String, JsonValue> =
                mutableMapOf() // templates/JavaSDK/entities/objects.ts:224:10

            @JvmSynthetic // templates/JavaSDK/entities/objects.ts:234:14
            internal fun from(filters: Filters) =
                apply { // templates/JavaSDK/entities/objects.ts:240:30
                    additionalProperties(filters.additionalProperties)
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

            fun build(): Filters = Filters(additionalProperties.toUnmodifiable())
        }
    }
}
