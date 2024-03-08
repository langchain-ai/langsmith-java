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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class SessionUpdateParams
constructor(
    private val sessionId: String,
    private val defaultDatasetId: String?,
    private val description: String?,
    private val endTime: OffsetDateTime?,
    private val extra: JsonValue?,
    private val name: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun sessionId(): String = sessionId

    fun defaultDatasetId(): Optional<String> = Optional.ofNullable(defaultDatasetId)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun extra(): Optional<JsonValue> = Optional.ofNullable(extra)

    fun name(): Optional<String> = Optional.ofNullable(name)

    @JvmSynthetic
    internal fun getBody(): SessionUpdateBody {
        return SessionUpdateBody(
            defaultDatasetId,
            description,
            endTime,
            extra,
            name,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> sessionId
            else -> ""
        }
    }

    /** Update class for TracerSession. */
    @JsonDeserialize(builder = SessionUpdateBody.Builder::class)
    @NoAutoDetect
    class SessionUpdateBody
    internal constructor(
        private val defaultDatasetId: String?,
        private val description: String?,
        private val endTime: OffsetDateTime?,
        private val extra: JsonValue?,
        private val name: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("default_dataset_id") fun defaultDatasetId(): String? = defaultDatasetId

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("end_time") fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("extra") fun extra(): JsonValue? = extra

        @JsonProperty("name") fun name(): String? = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SessionUpdateBody &&
                this.defaultDatasetId == other.defaultDatasetId &&
                this.description == other.description &&
                this.endTime == other.endTime &&
                this.extra == other.extra &&
                this.name == other.name &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        defaultDatasetId,
                        description,
                        endTime,
                        extra,
                        name,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SessionUpdateBody{defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var defaultDatasetId: String? = null
            private var description: String? = null
            private var endTime: OffsetDateTime? = null
            private var extra: JsonValue? = null
            private var name: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sessionUpdateBody: SessionUpdateBody) = apply {
                this.defaultDatasetId = sessionUpdateBody.defaultDatasetId
                this.description = sessionUpdateBody.description
                this.endTime = sessionUpdateBody.endTime
                this.extra = sessionUpdateBody.extra
                this.name = sessionUpdateBody.name
                additionalProperties(sessionUpdateBody.additionalProperties)
            }

            @JsonProperty("default_dataset_id")
            fun defaultDatasetId(defaultDatasetId: String) = apply {
                this.defaultDatasetId = defaultDatasetId
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("end_time")
            fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

            @JsonProperty("extra") fun extra(extra: JsonValue) = apply { this.extra = extra }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): SessionUpdateBody =
                SessionUpdateBody(
                    defaultDatasetId,
                    description,
                    endTime,
                    extra,
                    name,
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

        return other is SessionUpdateParams &&
            this.sessionId == other.sessionId &&
            this.defaultDatasetId == other.defaultDatasetId &&
            this.description == other.description &&
            this.endTime == other.endTime &&
            this.extra == other.extra &&
            this.name == other.name &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            sessionId,
            defaultDatasetId,
            description,
            endTime,
            extra,
            name,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SessionUpdateParams{sessionId=$sessionId, defaultDatasetId=$defaultDatasetId, description=$description, endTime=$endTime, extra=$extra, name=$name, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var sessionId: String? = null
        private var defaultDatasetId: String? = null
        private var description: String? = null
        private var endTime: OffsetDateTime? = null
        private var extra: JsonValue? = null
        private var name: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionUpdateParams: SessionUpdateParams) = apply {
            this.sessionId = sessionUpdateParams.sessionId
            this.defaultDatasetId = sessionUpdateParams.defaultDatasetId
            this.description = sessionUpdateParams.description
            this.endTime = sessionUpdateParams.endTime
            this.extra = sessionUpdateParams.extra
            this.name = sessionUpdateParams.name
            additionalQueryParams(sessionUpdateParams.additionalQueryParams)
            additionalHeaders(sessionUpdateParams.additionalHeaders)
            additionalBodyProperties(sessionUpdateParams.additionalBodyProperties)
        }

        fun sessionId(sessionId: String) = apply { this.sessionId = sessionId }

        fun defaultDatasetId(defaultDatasetId: String) = apply {
            this.defaultDatasetId = defaultDatasetId
        }

        fun description(description: String) = apply { this.description = description }

        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun name(name: String) = apply { this.name = name }

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

        fun build(): SessionUpdateParams =
            SessionUpdateParams(
                checkNotNull(sessionId) { "`sessionId` is required but was not set" },
                defaultDatasetId,
                description,
                endTime,
                extra,
                name,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
