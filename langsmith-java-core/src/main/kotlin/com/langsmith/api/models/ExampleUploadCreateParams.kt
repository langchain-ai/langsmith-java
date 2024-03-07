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

class ExampleUploadCreateParams
constructor(
    private val datasetId: String,
    private val file: String,
    private val inputKeys: List<String>,
    private val outputKeys: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun datasetId(): String = datasetId

    fun file(): String = file

    fun inputKeys(): List<String> = inputKeys

    fun outputKeys(): Optional<List<String>> = Optional.ofNullable(outputKeys)

    @JvmSynthetic
    internal fun getBody(): ExampleUploadCreateBody {
        return ExampleUploadCreateBody(
            file,
            inputKeys,
            outputKeys,
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

    @JsonDeserialize(builder = ExampleUploadCreateBody.Builder::class)
    @NoAutoDetect
    class ExampleUploadCreateBody
    internal constructor(
        private val file: String?,
        private val inputKeys: List<String>?,
        private val outputKeys: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("file") fun file(): String? = file

        @JsonProperty("input_keys") fun inputKeys(): List<String>? = inputKeys

        @JsonProperty("output_keys") fun outputKeys(): List<String>? = outputKeys

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleUploadCreateBody &&
                this.file == other.file &&
                this.inputKeys == other.inputKeys &&
                this.outputKeys == other.outputKeys &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        file,
                        inputKeys,
                        outputKeys,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleUploadCreateBody{file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var file: String? = null
            private var inputKeys: List<String>? = null
            private var outputKeys: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(exampleUploadCreateBody: ExampleUploadCreateBody) = apply {
                this.file = exampleUploadCreateBody.file
                this.inputKeys = exampleUploadCreateBody.inputKeys
                this.outputKeys = exampleUploadCreateBody.outputKeys
                additionalProperties(exampleUploadCreateBody.additionalProperties)
            }

            @JsonProperty("file") fun file(file: String) = apply { this.file = file }

            @JsonProperty("input_keys")
            fun inputKeys(inputKeys: List<String>) = apply { this.inputKeys = inputKeys }

            @JsonProperty("output_keys")
            fun outputKeys(outputKeys: List<String>) = apply { this.outputKeys = outputKeys }

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

            fun build(): ExampleUploadCreateBody =
                ExampleUploadCreateBody(
                    checkNotNull(file) { "`file` is required but was not set" },
                    checkNotNull(inputKeys) { "`inputKeys` is required but was not set" }
                        .toUnmodifiable(),
                    outputKeys?.toUnmodifiable(),
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

        return other is ExampleUploadCreateParams &&
            this.datasetId == other.datasetId &&
            this.file == other.file &&
            this.inputKeys == other.inputKeys &&
            this.outputKeys == other.outputKeys &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            file,
            inputKeys,
            outputKeys,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ExampleUploadCreateParams{datasetId=$datasetId, file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: String? = null
        private var file: String? = null
        private var inputKeys: MutableList<String> = mutableListOf()
        private var outputKeys: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleUploadCreateParams: ExampleUploadCreateParams) = apply {
            this.datasetId = exampleUploadCreateParams.datasetId
            this.file = exampleUploadCreateParams.file
            this.inputKeys(exampleUploadCreateParams.inputKeys)
            this.outputKeys(exampleUploadCreateParams.outputKeys ?: listOf())
            additionalQueryParams(exampleUploadCreateParams.additionalQueryParams)
            additionalHeaders(exampleUploadCreateParams.additionalHeaders)
            additionalBodyProperties(exampleUploadCreateParams.additionalBodyProperties)
        }

        fun datasetId(datasetId: String) = apply { this.datasetId = datasetId }

        fun file(file: String) = apply { this.file = file }

        fun inputKeys(inputKeys: List<String>) = apply {
            this.inputKeys.clear()
            this.inputKeys.addAll(inputKeys)
        }

        fun addInputKey(inputKey: String) = apply { this.inputKeys.add(inputKey) }

        fun outputKeys(outputKeys: List<String>) = apply {
            this.outputKeys.clear()
            this.outputKeys.addAll(outputKeys)
        }

        fun addOutputKey(outputKey: String) = apply { this.outputKeys.add(outputKey) }

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

        fun build(): ExampleUploadCreateParams =
            ExampleUploadCreateParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(inputKeys) { "`inputKeys` is required but was not set" }
                    .toUnmodifiable(),
                if (outputKeys.size == 0) null else outputKeys.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
