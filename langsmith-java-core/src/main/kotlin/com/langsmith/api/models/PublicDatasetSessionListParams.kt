// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class PublicDatasetSessionListParams
constructor( // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val shareToken: String, // templates/JavaSDK/entities/params.ts:131:13 //
    // templates/JavaSDK/entities/params.ts:131:13
    private val id: List<String>?,
    private val facets: Boolean?,
    private val limit: Long?,
    private val name: String?,
    private val nameContains: String?,
    private val offset: Long?,
    private val sortBy: SortBy?,
    private val sortByDesc: Boolean?,
    private val sortByFeedbackKey: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun shareToken(): String = shareToken // templates/JavaSDK/entities/params.ts:145:14 //
    // templates/JavaSDK/entities/params.ts:131:13

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun facets(): Optional<Boolean> = Optional.ofNullable(facets)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    fun sortByFeedbackKey(): Optional<String> = Optional.ofNullable(sortByFeedbackKey)

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:201:14
    internal fun getQueryParams():
        Map<String, List<String>> { // templates/JavaSDK/entities/params.ts:201:14
        val params =
            mutableMapOf<String, List<String>>() // templates/JavaSDK/entities/params.ts:210:30 //
        // templates/JavaSDK/entities/params.ts:210:30
        this.id?.let { // templates/JavaSDK/entities/objects.ts:392:21
            params.put("id", listOf(it.joinToString(separator = ",")))
        }
        this.facets?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("facets", listOf(it.toString()))
        }
        this.limit?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("limit", listOf(it.toString()))
        }
        this.name?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("name", listOf(it.toString()))
        }
        this.nameContains?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("name_contains", listOf(it.toString()))
        }
        this.offset?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("offset", listOf(it.toString()))
        }
        this.sortBy?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("sort_by", listOf(it.toString()))
        }
        this.sortByDesc?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("sort_by_desc", listOf(it.toString()))
        }
        this.sortByFeedbackKey?.let { // templates/JavaSDK/entities/objects.ts:462:15
            params.put("sort_by_feedback_key", listOf(it.toString()))
        }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic // templates/JavaSDK/entities/params.ts:540:6
    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String { // templates/JavaSDK/entities/params.ts:555:13
        return when (index) { // templates/JavaSDK/entities/params.ts:560:26
            0 -> shareToken // templates/JavaSDK/entities/params.ts:560:26 //
            // templates/JavaSDK/entities/params.ts:560:26
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
        if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
            return true
        }

        return other is
            PublicDatasetSessionListParams && // templates/JavaSDK/entities/fields.ts:143:33
            this.shareToken == other.shareToken &&
            this.id == other.id &&
            this.facets == other.facets &&
            this.limit == other.limit &&
            this.name == other.name &&
            this.nameContains == other.nameContains &&
            this.offset == other.offset &&
            this.sortBy == other.sortBy &&
            this.sortByDesc == other.sortByDesc &&
            this.sortByFeedbackKey == other.sortByFeedbackKey &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int { // templates/JavaSDK/entities/fields.ts:167:13
        return Objects.hash( // templates/JavaSDK/entities/fields.ts:163:19 //
            // templates/JavaSDK/entities/fields.ts:181:14
            shareToken, // templates/JavaSDK/entities/fields.ts:163:19
            id,
            facets,
            limit,
            name,
            nameContains,
            offset,
            sortBy,
            sortByDesc,
            sortByFeedbackKey,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "PublicDatasetSessionListParams{shareToken=$shareToken, id=$id, facets=$facets, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, sortByFeedbackKey=$sortByFeedbackKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

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
        private var id: MutableList<String> = mutableListOf()
        private var facets: Boolean? = null
        private var limit: Long? = null
        private var name: String? = null
        private var nameContains: String? = null
        private var offset: Long? = null
        private var sortBy: SortBy? = null
        private var sortByDesc: Boolean? = null
        private var sortByFeedbackKey: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic // templates/JavaSDK/entities/params.ts:251:18
        internal fun from(publicDatasetSessionListParams: PublicDatasetSessionListParams) =
            apply { // templates/JavaSDK/entities/params.ts:257:34
                this.shareToken =
                    publicDatasetSessionListParams
                        .shareToken // templates/JavaSDK/entities/params.ts:257:34 //
                // templates/JavaSDK/entities/params.ts:257:34
                this.id(publicDatasetSessionListParams.id ?: listOf())
                this.facets = publicDatasetSessionListParams.facets
                this.limit = publicDatasetSessionListParams.limit
                this.name = publicDatasetSessionListParams.name
                this.nameContains = publicDatasetSessionListParams.nameContains
                this.offset = publicDatasetSessionListParams.offset
                this.sortBy = publicDatasetSessionListParams.sortBy
                this.sortByDesc = publicDatasetSessionListParams.sortByDesc
                this.sortByFeedbackKey = publicDatasetSessionListParams.sortByFeedbackKey
                additionalQueryParams(publicDatasetSessionListParams.additionalQueryParams)
                additionalHeaders(publicDatasetSessionListParams.additionalHeaders)
            }

        fun shareToken(shareToken: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.shareToken = shareToken
        }

        fun id(id: List<String>) = apply { // templates/JavaSDK/entities/params.ts:609:26
            this.id.clear() // templates/JavaSDK/entities/params.ts:609:26 //
            // templates/JavaSDK/entities/params.ts:609:26
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { // templates/JavaSDK/entities/params.ts:620:26
            this.id.add(id)
        }

        fun facets(facets: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.facets = facets
        }

        fun limit(limit: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.limit = limit
        }

        fun name(name: String) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.name = name
        }

        fun nameContains(nameContains: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.nameContains = nameContains
            }

        fun offset(offset: Long) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.offset = offset
        }

        /** An enumeration. */
        fun sortBy(sortBy: SortBy) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.sortBy = sortBy
        }

        fun sortByDesc(sortByDesc: Boolean) = apply { // templates/JavaSDK/entities/params.ts:634:26
            this.sortByDesc = sortByDesc
        }

        fun sortByFeedbackKey(sortByFeedbackKey: String) =
            apply { // templates/JavaSDK/entities/params.ts:634:26
                this.sortByFeedbackKey = sortByFeedbackKey
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

        fun build(): PublicDatasetSessionListParams =
            PublicDatasetSessionListParams( // templates/JavaSDK/entities/params.ts:683:22
                checkNotNull(shareToken) { // templates/JavaSDK/entities/params.ts:844:13 //
                    // templates/JavaSDK/entities/params.ts:683:22
                    "`shareToken` is required but was not set"
                },
                if (id.size == 0) null else id.toUnmodifiable(),
                facets,
                limit,
                name,
                nameContains,
                offset,
                sortBy,
                sortByDesc,
                sortByFeedbackKey,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class SortBy
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) { // templates/JavaSDK/entities/enums.ts:56:13 // templates/JavaSDK/entities/enums.ts:56:13 //
        // templates/JavaSDK/entities/enums.ts:56:13

        @com.fasterxml.jackson.annotation.JsonValue // templates/JavaSDK/entities/enums.ts:62:10 //
        // templates/JavaSDK/entities/enums.ts:56:13
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean { // templates/JavaSDK/entities/fields.ts:131:6
            if (this === other) { // templates/JavaSDK/entities/fields.ts:137:19
                return true
            }

            return other is SortBy && // templates/JavaSDK/entities/fields.ts:143:33
                this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object { // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField
            val NAME = SortBy(JsonField.of("name")) // templates/JavaSDK/entities/enums.ts:71:10

            @JvmField val START_TIME = SortBy(JsonField.of("start_time"))

            @JvmField val LAST_RUN_START_TIME = SortBy(JsonField.of("last_run_start_time"))

            @JvmField val LATENCY_P50 = SortBy(JsonField.of("latency_p50"))

            @JvmField val LATENCY_P99 = SortBy(JsonField.of("latency_p99"))

            @JvmField val ERROR_RATE = SortBy(JsonField.of("error_rate"))

            @JvmField val FEEDBACK = SortBy(JsonField.of("feedback"))

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        enum class Known { // templates/JavaSDK/entities/enums.ts:78:10
            NAME, // templates/JavaSDK/entities/enums.ts:78:10 //
            // templates/JavaSDK/entities/enums.ts:78:10
            START_TIME,
            LAST_RUN_START_TIME,
            LATENCY_P50,
            LATENCY_P99,
            ERROR_RATE,
            FEEDBACK,
        }

        enum class Value { // templates/JavaSDK/entities/enums.ts:82:10
            NAME, // templates/JavaSDK/entities/enums.ts:82:10 //
            // templates/JavaSDK/entities/enums.ts:82:10
            START_TIME,
            LAST_RUN_START_TIME,
            LATENCY_P50,
            LATENCY_P99,
            ERROR_RATE,
            FEEDBACK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) { // templates/JavaSDK/entities/enums.ts:91:29
                NAME -> Value.NAME // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                START_TIME -> Value.START_TIME
                LAST_RUN_START_TIME -> Value.LAST_RUN_START_TIME
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                ERROR_RATE -> Value.ERROR_RATE
                FEEDBACK -> Value.FEEDBACK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) { // templates/JavaSDK/entities/enums.ts:104:29
                NAME -> Known.NAME // templates/JavaSDK/entities/enums.ts:54:10 //
                // templates/JavaSDK/entities/enums.ts:54:10
                START_TIME -> Known.START_TIME
                LAST_RUN_START_TIME -> Known.LAST_RUN_START_TIME
                LATENCY_P50 -> Known.LATENCY_P50
                LATENCY_P99 -> Known.LATENCY_P99
                ERROR_RATE -> Known.ERROR_RATE
                FEEDBACK -> Known.FEEDBACK
                else -> throw LangSmithInvalidDataException("Unknown SortBy: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
