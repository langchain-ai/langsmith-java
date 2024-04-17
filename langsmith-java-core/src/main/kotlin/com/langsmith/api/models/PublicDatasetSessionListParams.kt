// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.langsmith.api.core.Enum
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class PublicDatasetSessionListParams
constructor(
    private val shareToken: String,
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
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun shareToken(): String = shareToken

    fun id(): Optional<List<String>> = Optional.ofNullable(id)

    fun facets(): Optional<Boolean> = Optional.ofNullable(facets)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun nameContains(): Optional<String> = Optional.ofNullable(nameContains)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    fun sortBy(): Optional<SortBy> = Optional.ofNullable(sortBy)

    fun sortByDesc(): Optional<Boolean> = Optional.ofNullable(sortByDesc)

    fun sortByFeedbackKey(): Optional<String> = Optional.ofNullable(sortByFeedbackKey)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.id?.let { params.put("id", listOf(it.joinToString(separator = ","))) }
        this.facets?.let { params.put("facets", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.name?.let { params.put("name", listOf(it.toString())) }
        this.nameContains?.let { params.put("name_contains", listOf(it.toString())) }
        this.offset?.let { params.put("offset", listOf(it.toString())) }
        this.sortBy?.let { params.put("sort_by", listOf(it.toString())) }
        this.sortByDesc?.let { params.put("sort_by_desc", listOf(it.toString())) }
        this.sortByFeedbackKey?.let { params.put("sort_by_feedback_key", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> shareToken
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PublicDatasetSessionListParams &&
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
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            shareToken,
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
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PublicDatasetSessionListParams{shareToken=$shareToken, id=$id, facets=$facets, limit=$limit, name=$name, nameContains=$nameContains, offset=$offset, sortBy=$sortBy, sortByDesc=$sortByDesc, sortByFeedbackKey=$sortByFeedbackKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var shareToken: String? = null
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
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(publicDatasetSessionListParams: PublicDatasetSessionListParams) = apply {
            this.shareToken = publicDatasetSessionListParams.shareToken
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
            additionalBodyProperties(publicDatasetSessionListParams.additionalBodyProperties)
        }

        fun shareToken(shareToken: String) = apply { this.shareToken = shareToken }

        fun id(id: List<String>) = apply {
            this.id.clear()
            this.id.addAll(id)
        }

        fun addId(id: String) = apply { this.id.add(id) }

        fun facets(facets: Boolean) = apply { this.facets = facets }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun name(name: String) = apply { this.name = name }

        fun nameContains(nameContains: String) = apply { this.nameContains = nameContains }

        fun offset(offset: Long) = apply { this.offset = offset }

        /** An enumeration. */
        fun sortBy(sortBy: SortBy) = apply { this.sortBy = sortBy }

        fun sortByDesc(sortByDesc: Boolean) = apply { this.sortByDesc = sortByDesc }

        fun sortByFeedbackKey(sortByFeedbackKey: String) = apply {
            this.sortByFeedbackKey = sortByFeedbackKey
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): PublicDatasetSessionListParams =
            PublicDatasetSessionListParams(
                checkNotNull(shareToken) { "`shareToken` is required but was not set" },
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
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class SortBy
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortBy && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val NAME = SortBy(JsonField.of("name"))

            @JvmField val START_TIME = SortBy(JsonField.of("start_time"))

            @JvmField val LAST_RUN_START_TIME = SortBy(JsonField.of("last_run_start_time"))

            @JvmField val LATENCY_P50 = SortBy(JsonField.of("latency_p50"))

            @JvmField val LATENCY_P99 = SortBy(JsonField.of("latency_p99"))

            @JvmField val ERROR_RATE = SortBy(JsonField.of("error_rate"))

            @JvmField val FEEDBACK = SortBy(JsonField.of("feedback"))

            @JvmStatic fun of(value: String) = SortBy(JsonField.of(value))
        }

        enum class Known {
            NAME,
            START_TIME,
            LAST_RUN_START_TIME,
            LATENCY_P50,
            LATENCY_P99,
            ERROR_RATE,
            FEEDBACK,
        }

        enum class Value {
            NAME,
            START_TIME,
            LAST_RUN_START_TIME,
            LATENCY_P50,
            LATENCY_P99,
            ERROR_RATE,
            FEEDBACK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                NAME -> Value.NAME
                START_TIME -> Value.START_TIME
                LAST_RUN_START_TIME -> Value.LAST_RUN_START_TIME
                LATENCY_P50 -> Value.LATENCY_P50
                LATENCY_P99 -> Value.LATENCY_P99
                ERROR_RATE -> Value.ERROR_RATE
                FEEDBACK -> Value.FEEDBACK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                NAME -> Known.NAME
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
