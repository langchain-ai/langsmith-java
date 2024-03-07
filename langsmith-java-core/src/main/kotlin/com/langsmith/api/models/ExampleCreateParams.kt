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

class ExampleCreateParams
constructor(
    private val datasetId: String,
    private val inputs: JsonValue,
    private val id: String?,
    private val createdAt: OffsetDateTime?,
    private val outputs: JsonValue?,
    private val sourceRunId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun inputs(): JsonValue = inputs

    fun id(): Optional<String> = Optional.ofNullable(id)

    fun createdAt(): Optional<OffsetDateTime> = Optional.ofNullable(createdAt)

    fun outputs(): Optional<JsonValue> = Optional.ofNullable(outputs)

    fun sourceRunId(): Optional<String> = Optional.ofNullable(sourceRunId)

    @JvmSynthetic
    internal fun getBody(): ExampleCreateBody {
        return ExampleCreateBody(
            datasetId,
            inputs,
            id,
            createdAt,
            outputs,
            sourceRunId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    /** Create class for Example. */
    @JsonDeserialize(builder = ExampleCreateBody.Builder::class)
    @NoAutoDetect
    class ExampleCreateBody
    internal constructor(
        private val datasetId: String?,
        private val inputs: JsonValue?,
        private val id: String?,
        private val createdAt: OffsetDateTime?,
        private val outputs: JsonValue?,
        private val sourceRunId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        @JsonProperty("inputs") fun inputs(): JsonValue? = inputs

        @JsonProperty("id") fun id(): String? = id

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("outputs") fun outputs(): JsonValue? = outputs

        @JsonProperty("source_run_id") fun sourceRunId(): String? = sourceRunId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleCreateBody &&
                this.datasetId == other.datasetId &&
                this.inputs == other.inputs &&
                this.id == other.id &&
                this.createdAt == other.createdAt &&
                this.outputs == other.outputs &&
                this.sourceRunId == other.sourceRunId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        datasetId,
                        inputs,
                        id,
                        createdAt,
                        outputs,
                        sourceRunId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleCreateBody{datasetId=$datasetId, inputs=$inputs, id=$id, createdAt=$createdAt, outputs=$outputs, sourceRunId=$sourceRunId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var datasetId: String? = null
            private var inputs: JsonValue? = null
            private var id: String? = null
            private var createdAt: OffsetDateTime? = null
            private var outputs: JsonValue? = null
            private var sourceRunId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exampleCreateBody: ExampleCreateBody) = apply {
                this.datasetId = exampleCreateBody.datasetId
                this.inputs = exampleCreateBody.inputs
                this.id = exampleCreateBody.id
                this.createdAt = exampleCreateBody.createdAt
                this.outputs = exampleCreateBody.outputs
                this.sourceRunId = exampleCreateBody.sourceRunId
                additionalProperties(exampleCreateBody.additionalProperties)
            }

            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

            @JsonProperty("inputs") fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

            @JsonProperty("created_at")
            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            @JsonProperty("outputs")
            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            @JsonProperty("source_run_id")
            fun sourceRunId(sourceRunId: String) = apply { this.sourceRunId = sourceRunId }

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

            fun build(): ExampleCreateBody =
                ExampleCreateBody(
                    checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                    checkNotNull(inputs) { "`inputs` is required but was not set" },
                    id,
                    createdAt,
                    outputs,
                    sourceRunId,
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

        return other is ExampleCreateParams &&
            this.datasetId == other.datasetId &&
            this.inputs == other.inputs &&
            this.id == other.id &&
            this.createdAt == other.createdAt &&
            this.outputs == other.outputs &&
            this.sourceRunId == other.sourceRunId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            inputs,
            id,
            createdAt,
            outputs,
            sourceRunId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExampleCreateParams{datasetId=$datasetId, inputs=$inputs, id=$id, createdAt=$createdAt, outputs=$outputs, sourceRunId=$sourceRunId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var inputs: JsonValue? = null
        private var id: String? = null
        private var createdAt: OffsetDateTime? = null
        private var outputs: JsonValue? = null
        private var sourceRunId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleCreateParams: ExampleCreateParams) = apply {
            this.datasetId = exampleCreateParams.datasetId
            this.inputs = exampleCreateParams.inputs
            this.id = exampleCreateParams.id
            this.createdAt = exampleCreateParams.createdAt
            this.outputs = exampleCreateParams.outputs
            this.sourceRunId = exampleCreateParams.sourceRunId
            additionalQueryParams(exampleCreateParams.additionalQueryParams)
            additionalHeaders(exampleCreateParams.additionalHeaders)
            additionalBodyProperties(exampleCreateParams.additionalBodyProperties)
        }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        fun id(id: String) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

        fun sourceRunId(sourceRunId: String) = apply { this.sourceRunId = sourceRunId }

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

        fun build(): ExampleCreateParams =
            ExampleCreateParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(inputs) { "`inputs` is required but was not set" },
                id,
                createdAt,
                outputs,
                sourceRunId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
