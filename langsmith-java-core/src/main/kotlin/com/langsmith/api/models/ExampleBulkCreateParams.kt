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

class ExampleBulkCreateParams
constructor(
    private val examples: List<Example>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun examples(): List<Example> = examples

    @JvmSynthetic
    internal fun getBody(): List<Example> {
        return examples
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ExampleBulkCreateBody.Builder::class)
    @NoAutoDetect
    class ExampleBulkCreateBody
    internal constructor(
        private val examples: List<Example>?,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("examples") fun examples(): List<Example>? = examples

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleBulkCreateBody && this.examples == other.examples
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(examples)
            }
            return hashCode
        }

        override fun toString() = "ExampleBulkCreateBody{examples=$examples}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var examples: List<Example>? = null

            @JvmSynthetic
            internal fun from(exampleBulkCreateBody: ExampleBulkCreateBody) = apply {
                this.examples = exampleBulkCreateBody.examples
            }

            @JsonProperty("examples")
            fun examples(examples: List<Example>) = apply { this.examples = examples }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExampleBulkCreateParams &&
            this.examples == other.examples &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            examples,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExampleBulkCreateParams{examples=$examples, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var examples: MutableList<Example> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleBulkCreateParams: ExampleBulkCreateParams) = apply {
            this.examples(exampleBulkCreateParams.examples)
            additionalQueryParams(exampleBulkCreateParams.additionalQueryParams)
            additionalHeaders(exampleBulkCreateParams.additionalHeaders)
        }

        fun examples(examples: List<Example>) = apply {
            this.examples.clear()
            this.examples.addAll(examples)
        }

        fun addExample(example: Example) = apply { this.examples.add(example) }

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

        fun build(): ExampleBulkCreateParams =
            ExampleBulkCreateParams(
                checkNotNull(examples) { "`examples` is required but was not set" }
                    .toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    /** Create class for Example. */
    @JsonDeserialize(builder = Example.Builder::class)
    @NoAutoDetect
    class Example
    private constructor(
        private val createdAt: OffsetDateTime?,
        private val inputs: JsonValue?,
        private val outputs: JsonValue?,
        private val datasetId: String?,
        private val sourceRunId: String?,
        private val id: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("created_at") fun createdAt(): OffsetDateTime? = createdAt

        @JsonProperty("inputs") fun inputs(): JsonValue? = inputs

        @JsonProperty("outputs") fun outputs(): JsonValue? = outputs

        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        @JsonProperty("source_run_id") fun sourceRunId(): String? = sourceRunId

        @JsonProperty("id") fun id(): String? = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Example &&
                this.createdAt == other.createdAt &&
                this.inputs == other.inputs &&
                this.outputs == other.outputs &&
                this.datasetId == other.datasetId &&
                this.sourceRunId == other.sourceRunId &&
                this.id == other.id &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        createdAt,
                        inputs,
                        outputs,
                        datasetId,
                        sourceRunId,
                        id,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Example{createdAt=$createdAt, inputs=$inputs, outputs=$outputs, datasetId=$datasetId, sourceRunId=$sourceRunId, id=$id, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var createdAt: OffsetDateTime? = null
            private var inputs: JsonValue? = null
            private var outputs: JsonValue? = null
            private var datasetId: String? = null
            private var sourceRunId: String? = null
            private var id: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(example: Example) = apply {
                this.createdAt = example.createdAt
                this.inputs = example.inputs
                this.outputs = example.outputs
                this.datasetId = example.datasetId
                this.sourceRunId = example.sourceRunId
                this.id = example.id
                additionalProperties(example.additionalProperties)
            }

            @JsonProperty("created_at")
            fun createdAt(createdAt: OffsetDateTime) = apply { this.createdAt = createdAt }

            @JsonProperty("inputs") fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            @JsonProperty("outputs")
            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

            @JsonProperty("source_run_id")
            fun sourceRunId(sourceRunId: String) = apply { this.sourceRunId = sourceRunId }

            @JsonProperty("id") fun id(id: String) = apply { this.id = id }

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

            fun build(): Example =
                Example(
                    createdAt,
                    checkNotNull(inputs) { "`inputs` is required but was not set" },
                    outputs,
                    checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                    sourceRunId,
                    id,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
