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

class AnnotationQueueCreateParams
constructor(
    private val name: String,
    private val id: String?,
    private val createdAt: OffsetDateTime?,
    private val description: String?,
    private val updatedAt: OffsetDateTime?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun name(): String = name

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun updatedAt(): Optional<OffsetDateTime> = Optional.ofNullable(updatedAt)

    @JvmSynthetic
    internal fun getBody(): AnnotationQueueCreateBody {
        return AnnotationQueueCreateBody(
            name,
            id,
            createdAt,
            description,
            updatedAt,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** AnnotationQueue schema. */
    @JsonDeserialize(builder = AnnotationQueueCreateBody.Builder::class)
    @NoAutoDetect
    class AnnotationQueueCreateBody
    internal constructor(
        private val name: String?,
        private val id: String?,
        private val createdAt: OffsetDateTime?,
        private val description: String?,
        private val updatedAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("updated_at") fun updatedAt(): OffsetDateTime? = updatedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AnnotationQueueCreateBody &&
                this.name == other.name &&
                this.id == other.id &&
                this.createdAt == other.createdAt &&
                this.description == other.description &&
                this.updatedAt == other.updatedAt &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
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

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var id: String? = null
            private var createdAt: OffsetDateTime? = null
            private var description: String? = null
            private var updatedAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(annotationQueueCreateBody: AnnotationQueueCreateBody) = apply {
                this.name = annotationQueueCreateBody.name
                this.id = annotationQueueCreateBody.id
                this.createdAt = annotationQueueCreateBody.createdAt
                this.description = annotationQueueCreateBody.description
                this.updatedAt = annotationQueueCreateBody.updatedAt
                additionalProperties(annotationQueueCreateBody.additionalProperties)
            }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("created_at")
            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("updated_at")
            fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }

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

            fun build(): AnnotationQueueCreateBody =
                AnnotationQueueCreateBody(
                    checkNotNull(name) { "`name` is required but was not set" },
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AnnotationQueueCreateParams &&
            this.name == other.name &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.updatedAt == other.updatedAt &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
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

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var name: String? = null
        private var id: String? = null
        private var createdAt: OffsetDateTime? = null
        private var description: String? = null
        private var updatedAt: OffsetDateTime? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(annotationQueueCreateParams: AnnotationQueueCreateParams) = apply {
            this.name = annotationQueueCreateParams.name
            this.id = annotationQueueCreateParams.id
            this.createdAt = annotationQueueCreateParams.createdAt
            this.description = annotationQueueCreateParams.description
            this.updatedAt = annotationQueueCreateParams.updatedAt
            additionalQueryParams(annotationQueueCreateParams.additionalQueryParams)
            additionalHeaders(annotationQueueCreateParams.additionalHeaders)
            additionalBodyProperties(annotationQueueCreateParams.additionalBodyProperties)
        }

        fun name(name: String) = apply { this.name = name }

        fun id(id: String) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

        fun description(description: String) = apply { this.description = description }

        fun updatedAt(updatedAt: OffsetDateTime) = apply { this.updatedAt = updatedAt }

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

        fun build(): AnnotationQueueCreateParams =
            AnnotationQueueCreateParams(
                checkNotNull(name) { "`name` is required but was not set" },
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
