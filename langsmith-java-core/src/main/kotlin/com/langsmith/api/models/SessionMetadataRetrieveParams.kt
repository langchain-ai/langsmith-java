// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SessionMetadataRetrieveParams
constructor(
    private val sessionId: String,
    private val k: Long?,
    private val metadataKeys: List<String>?,
    private val startTime: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun sessionId(): String = sessionId

    fun k(): Optional<Long> = Optional.ofNullable(k)

    fun metadataKeys(): Optional<List<String>> = Optional.ofNullable(metadataKeys)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.k?.let { params.put("k", listOf(it.toString())) }
        this.metadataKeys?.let {
            params.put("metadata_keys", listOf(it.joinToString(separator = ",")))
        }
        this.startTime?.let { params.put("start_time", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> sessionId
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

        return other is SessionMetadataRetrieveParams &&
            this.sessionId == other.sessionId &&
            this.k == other.k &&
            this.metadataKeys == other.metadataKeys &&
            this.startTime == other.startTime &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            sessionId,
            k,
            metadataKeys,
            startTime,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SessionMetadataRetrieveParams{sessionId=$sessionId, k=$k, metadataKeys=$metadataKeys, startTime=$startTime, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var sessionId: String? = null
        private var k: Long? = null
        private var metadataKeys: MutableList<String> = mutableListOf()
        private var startTime: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionMetadataRetrieveParams: SessionMetadataRetrieveParams) = apply {
            this.sessionId = sessionMetadataRetrieveParams.sessionId
            this.k = sessionMetadataRetrieveParams.k
            this.metadataKeys(sessionMetadataRetrieveParams.metadataKeys ?: listOf())
            this.startTime = sessionMetadataRetrieveParams.startTime
            additionalQueryParams(sessionMetadataRetrieveParams.additionalQueryParams)
            additionalHeaders(sessionMetadataRetrieveParams.additionalHeaders)
            additionalBodyProperties(sessionMetadataRetrieveParams.additionalBodyProperties)
        }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun k(k: Long) = apply { this.k = k }

        fun metadataKeys(metadataKeys: List<String>) = apply {
            this.metadataKeys.clear()
            this.metadataKeys.addAll(metadataKeys)
        }

        fun addMetadataKey(metadataKey: String) = apply { this.metadataKeys.add(metadataKey) }

        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

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

        fun build(): SessionMetadataRetrieveParams =
            SessionMetadataRetrieveParams(
                checkNotNull(sessionId) { "`sessionId` is required but was not set" },
                k,
                if (metadataKeys.size == 0) null else metadataKeys.toUnmodifiable(),
                startTime,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
