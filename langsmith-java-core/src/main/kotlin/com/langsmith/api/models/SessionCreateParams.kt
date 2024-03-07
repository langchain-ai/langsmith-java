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

class SessionCreateParams
constructor(
    private val id: String?,
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

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun defaultDatasetId(): Optional<String> = Optional.ofNullable(defaultDatasetId)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun endTime(): Optional<OffsetDateTime> = Optional.ofNullable(endTime)

    fun extra(): Optional<JsonValue> = Optional.ofNullable(extra)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun referenceDatasetId(): Optional<String> = Optional.ofNullable(referenceDatasetId)

    fun startTime(): Optional<OffsetDateTime> = Optional.ofNullable(startTime)

    fun upsert(): Optional<Boolean> = Optional.ofNullable(upsert)

    @JvmSynthetic
    internal fun getBody(): SessionCreateBody {
        return SessionCreateBody(
            id,
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

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.upsert?.let { params.put("upsert", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Create class for TracerSession. */
    @JsonDeserialize(builder = SessionCreateBody.Builder::class)
    @NoAutoDetect
    class SessionCreateBody
    internal constructor(
        private val id: String?,
        private val defaultDatasetId: String?,
        private val description: String?,
        private val endTime: OffsetDateTime?,
        private val extra: JsonValue?,
        private val name: String?,
        private val referenceDatasetId: String?,
        private val startTime: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("default_dataset_id") fun defaultDatasetId(): String? = defaultDatasetId

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("end_time") fun endTime(): OffsetDateTime? = endTime

        @JsonProperty("extra") fun extra(): JsonValue? = extra

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("reference_dataset_id") fun referenceDatasetId(): String? = referenceDatasetId

        @JsonProperty("start_time") fun startTime(): OffsetDateTime? = startTime

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SessionCreateBody &&
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

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        id,
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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: String? = null
            private var defaultDatasetId: String? = null
            private var description: String? = null
            private var endTime: OffsetDateTime? = null
            private var extra: JsonValue? = null
            private var name: String? = null
            private var referenceDatasetId: String? = null
            private var startTime: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sessionCreateBody: SessionCreateBody) = apply {
                this.id = sessionCreateBody.id
                this.defaultDatasetId = sessionCreateBody.defaultDatasetId
                this.description = sessionCreateBody.description
                this.endTime = sessionCreateBody.endTime
                this.extra = sessionCreateBody.extra
                this.name = sessionCreateBody.name
                this.referenceDatasetId = sessionCreateBody.referenceDatasetId
                this.startTime = sessionCreateBody.startTime
                additionalProperties(sessionCreateBody.additionalProperties)
            }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

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

            @JsonProperty("reference_dataset_id")
            fun referenceDatasetId(referenceDatasetId: String) = apply {
                this.referenceDatasetId = referenceDatasetId
            }

            @JsonProperty("start_time")
            fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

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

            fun build(): SessionCreateBody =
                SessionCreateBody(
                    id,
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionCreateParams &&
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

    override fun hashCode(): Int {
        return Objects.hash(
            id,
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

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var id: String? = null
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

        @JvmSynthetic
        internal fun from(sessionCreateParams: SessionCreateParams) = apply {
            this.id = sessionCreateParams.id
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

        fun id(id: String) = apply { this.id = id }

        fun defaultDatasetId(defaultDatasetId: String) = apply {
            this.defaultDatasetId = defaultDatasetId
        }

        fun description(description: String) = apply { this.description = description }

        fun endTime(endTime: OffsetDateTime) = apply { this.endTime = endTime }

        fun extra(extra: JsonValue) = apply { this.extra = extra }

        fun name(name: String) = apply { this.name = name }

        fun referenceDatasetId(referenceDatasetId: String) = apply {
            this.referenceDatasetId = referenceDatasetId
        }

        fun startTime(startTime: OffsetDateTime) = apply { this.startTime = startTime }

        fun upsert(upsert: Boolean) = apply { this.upsert = upsert }

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

        fun build(): SessionCreateParams =
            SessionCreateParams(
                id,
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
