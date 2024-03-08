// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
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

class DatasetRunCreateParams
constructor(
    private val datasetId: String,
    private val sessionIds: List<String>,
    private val filters: Filters?,
    private val limit: Long?,
    private val offset: Long?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun sessionIds(): List<String> = sessionIds

    fun filters(): Optional<Filters> = Optional.ofNullable(filters)

    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    fun offset(): Optional<Long> = Optional.ofNullable(offset)

    @JvmSynthetic
    internal fun getBody(): DatasetRunCreateBody {
        return DatasetRunCreateBody(
            sessionIds,
            filters,
            limit,
            offset,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> datasetId
            else -> ""
        }
    }

    @JsonDeserialize(builder = DatasetRunCreateBody.Builder::class)
    @NoAutoDetect
    class DatasetRunCreateBody
    internal constructor(
        private val sessionIds: List<String>?,
        private val filters: Filters?,
        private val limit: Long?,
        private val offset: Long?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("session_ids") fun sessionIds(): List<String>? = sessionIds

        @JsonProperty("filters") fun filters(): Filters? = filters

        @JsonProperty("limit") fun limit(): Long? = limit

        @JsonProperty("offset") fun offset(): Long? = offset

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DatasetRunCreateBody &&
                this.sessionIds == other.sessionIds &&
                this.filters == other.filters &&
                this.limit == other.limit &&
                this.offset == other.offset &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        sessionIds,
                        filters,
                        limit,
                        offset,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DatasetRunCreateBody{sessionIds=$sessionIds, filters=$filters, limit=$limit, offset=$offset, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var sessionIds: List<String>? = null
            private var filters: Filters? = null
            private var limit: Long? = null
            private var offset: Long? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetRunCreateBody: DatasetRunCreateBody) = apply {
                this.sessionIds = datasetRunCreateBody.sessionIds
                this.filters = datasetRunCreateBody.filters
                this.limit = datasetRunCreateBody.limit
                this.offset = datasetRunCreateBody.offset
                additionalProperties(datasetRunCreateBody.additionalProperties)
            }

            @JsonProperty("session_ids")
            fun sessionIds(sessionIds: List<String>) = apply { this.sessionIds = sessionIds }

            @JsonProperty("filters")
            fun filters(filters: Filters) = apply { this.filters = filters }

            @JsonProperty("limit") fun limit(limit: Long) = apply { this.limit = limit }

            @JsonProperty("offset") fun offset(offset: Long) = apply { this.offset = offset }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): DatasetRunCreateBody =
                DatasetRunCreateBody(
                    checkNotNull(sessionIds) { "`sessionIds` is required but was not set" }
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DatasetRunCreateParams &&
            this.datasetId == other.datasetId &&
            this.sessionIds == other.sessionIds &&
            this.filters == other.filters &&
            this.limit == other.limit &&
            this.offset == other.offset &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
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
        "DatasetRunCreateParams{datasetId=$datasetId, sessionIds=$sessionIds, filters=$filters, limit=$limit, offset=$offset, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var sessionIds: MutableList<String> = mutableListOf()
        private var filters: Filters? = null
        private var limit: Long? = null
        private var offset: Long? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetRunCreateParams: DatasetRunCreateParams) = apply {
            this.datasetId = datasetRunCreateParams.datasetId
            this.sessionIds(datasetRunCreateParams.sessionIds)
            this.filters = datasetRunCreateParams.filters
            this.limit = datasetRunCreateParams.limit
            this.offset = datasetRunCreateParams.offset
            additionalQueryParams(datasetRunCreateParams.additionalQueryParams)
            additionalHeaders(datasetRunCreateParams.additionalHeaders)
            additionalBodyProperties(datasetRunCreateParams.additionalBodyProperties)
        }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun sessionIds(sessionIds: List<String>) = apply {
            this.sessionIds.clear()
            this.sessionIds.addAll(sessionIds)
        }

        fun addSessionId(sessionId: String) = apply { this.sessionIds.add(sessionId) }

        fun filters(filters: Filters) = apply { this.filters = filters }

        fun limit(limit: Long) = apply { this.limit = limit }

        fun offset(offset: Long) = apply { this.offset = offset }

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

        fun build(): DatasetRunCreateParams =
            DatasetRunCreateParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(sessionIds) { "`sessionIds` is required but was not set" }
                    .toUnmodifiable(),
                filters,
                limit,
                offset,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Filters.Builder::class)
    @NoAutoDetect
    class Filters
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Filters && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Filters{additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(filters: Filters) = apply {
                additionalProperties(filters.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Filters = Filters(additionalProperties.toUnmodifiable())
        }
    }
}
