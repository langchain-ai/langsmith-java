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

class ExampleUpdateParams
constructor(
    private val exampleId: String,
    private val datasetId: String?,
    private val inputs: JsonValue?,
    private val outputs: JsonValue?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun exampleId(): String = exampleId

    fun datasetId(): Optional<String> = Optional.ofNullable(datasetId)

    fun inputs(): Optional<JsonValue> = Optional.ofNullable(inputs)

    fun outputs(): Optional<JsonValue> = Optional.ofNullable(outputs)

    @JvmSynthetic
    internal fun getBody(): ExampleUpdateBody {
        return ExampleUpdateBody(
            datasetId,
            inputs,
            outputs,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> exampleId
            else -> ""
        }
    }

    /** Update class for Example. */
    @JsonDeserialize(builder = ExampleUpdateBody.Builder::class)
    @NoAutoDetect
    class ExampleUpdateBody
    internal constructor(
        private val datasetId: String?,
        private val inputs: JsonValue?,
        private val outputs: JsonValue?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("dataset_id") fun datasetId(): String? = datasetId

        @JsonProperty("inputs") fun inputs(): JsonValue? = inputs

        @JsonProperty("outputs") fun outputs(): JsonValue? = outputs

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleUpdateBody &&
                this.datasetId == other.datasetId &&
                this.inputs == other.inputs &&
                this.outputs == other.outputs &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        datasetId,
                        inputs,
                        outputs,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleUpdateBody{datasetId=$datasetId, inputs=$inputs, outputs=$outputs, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var datasetId: String? = null
            private var inputs: JsonValue? = null
            private var outputs: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exampleUpdateBody: ExampleUpdateBody) = apply {
                this.datasetId = exampleUpdateBody.datasetId
                this.inputs = exampleUpdateBody.inputs
                this.outputs = exampleUpdateBody.outputs
                additionalProperties(exampleUpdateBody.additionalProperties)
            }

            @JsonProperty("dataset_id")
            fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

            @JsonProperty("inputs") fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

            @JsonProperty("outputs")
            fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

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

            fun build(): ExampleUpdateBody =
                ExampleUpdateBody(
                    datasetId,
                    inputs,
                    outputs,
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

        return other is ExampleUpdateParams &&
            this.exampleId == other.exampleId &&
            this.datasetId == other.datasetId &&
            this.inputs == other.inputs &&
            this.outputs == other.outputs &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            exampleId,
            datasetId,
            inputs,
            outputs,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExampleUpdateParams{exampleId=$exampleId, datasetId=$datasetId, inputs=$inputs, outputs=$outputs, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var exampleId: String? = null
        private var datasetId: String? = null
        private var inputs: JsonValue? = null
        private var outputs: JsonValue? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleUpdateParams: ExampleUpdateParams) = apply {
            this.exampleId = exampleUpdateParams.exampleId
            this.datasetId = exampleUpdateParams.datasetId
            this.inputs = exampleUpdateParams.inputs
            this.outputs = exampleUpdateParams.outputs
            additionalQueryParams(exampleUpdateParams.additionalQueryParams)
            additionalHeaders(exampleUpdateParams.additionalHeaders)
            additionalBodyProperties(exampleUpdateParams.additionalBodyProperties)
        }

        fun exampleId(exampleId: String) = apply { this.exampleId = exampleId }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun inputs(inputs: JsonValue) = apply { this.inputs = inputs }

        fun outputs(outputs: JsonValue) = apply { this.outputs = outputs }

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

        fun build(): ExampleUpdateParams =
            ExampleUpdateParams(
                checkNotNull(exampleId) { "`exampleId` is required but was not set" },
                datasetId,
                inputs,
                outputs,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
