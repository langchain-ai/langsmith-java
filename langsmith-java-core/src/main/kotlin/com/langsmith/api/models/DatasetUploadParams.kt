// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ExcludeMissing
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional

class DatasetUploadParams
constructor(
    private val file: String,
    private val inputKeys: List<String>,
    private val dataType: DataType?,
    private val description: String?,
    private val name: String?,
    private val outputKeys: List<String>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun file(): String = file

    fun inputKeys(): List<String> = inputKeys

    fun dataType(): Optional<DataType> = Optional.ofNullable(dataType)

    fun description(): Optional<String> = Optional.ofNullable(description)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun outputKeys(): Optional<List<String>> = Optional.ofNullable(outputKeys)

    @JvmSynthetic
    internal fun getBody(): DatasetUploadBody {
        return DatasetUploadBody(
            file,
            inputKeys,
            dataType,
            description,
            name,
            outputKeys,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DatasetUploadBody.Builder::class)
    @NoAutoDetect
    class DatasetUploadBody
    internal constructor(
        private val file: String?,
        private val inputKeys: List<String>?,
        private val dataType: DataType?,
        private val description: String?,
        private val name: String?,
        private val outputKeys: List<String>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("file") fun file(): String? = file

        @JsonProperty("input_keys") fun inputKeys(): List<String>? = inputKeys

        /** Enum for dataset data types. */
        @JsonProperty("data_type") fun dataType(): DataType? = dataType

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("output_keys") fun outputKeys(): List<String>? = outputKeys

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DatasetUploadBody &&
                this.file == other.file &&
                this.inputKeys == other.inputKeys &&
                this.dataType == other.dataType &&
                this.description == other.description &&
                this.name == other.name &&
                this.outputKeys == other.outputKeys &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        file,
                        inputKeys,
                        dataType,
                        description,
                        name,
                        outputKeys,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DatasetUploadBody{file=$file, inputKeys=$inputKeys, dataType=$dataType, description=$description, name=$name, outputKeys=$outputKeys, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var file: String? = null
            private var inputKeys: List<String>? = null
            private var dataType: DataType? = null
            private var description: String? = null
            private var name: String? = null
            private var outputKeys: List<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(datasetUploadBody: DatasetUploadBody) = apply {
                this.file = datasetUploadBody.file
                this.inputKeys = datasetUploadBody.inputKeys
                this.dataType = datasetUploadBody.dataType
                this.description = datasetUploadBody.description
                this.name = datasetUploadBody.name
                this.outputKeys = datasetUploadBody.outputKeys
                additionalProperties(datasetUploadBody.additionalProperties)
            }

            @JsonProperty("file") fun file(file: String) = apply { this.file = file }

            @JsonProperty("input_keys")
            fun inputKeys(inputKeys: List<String>) = apply { this.inputKeys = inputKeys }

            /** Enum for dataset data types. */
            @JsonProperty("data_type")
            fun dataType(dataType: DataType) = apply { this.dataType = dataType }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

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

            fun build(): DatasetUploadBody =
                DatasetUploadBody(
                    checkNotNull(file) { "`file` is required but was not set" },
                    checkNotNull(inputKeys) { "`inputKeys` is required but was not set" }
                        .toUnmodifiable(),
                    dataType,
                    description,
                    name,
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

        return other is DatasetUploadParams &&
            this.file == other.file &&
            this.inputKeys == other.inputKeys &&
            this.dataType == other.dataType &&
            this.description == other.description &&
            this.name == other.name &&
            this.outputKeys == other.outputKeys &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            file,
            inputKeys,
            dataType,
            description,
            name,
            outputKeys,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DatasetUploadParams{file=$file, inputKeys=$inputKeys, dataType=$dataType, description=$description, name=$name, outputKeys=$outputKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var file: String? = null
        private var inputKeys: MutableList<String> = mutableListOf()
        private var dataType: DataType? = null
        private var description: String? = null
        private var name: String? = null
        private var outputKeys: MutableList<String> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(datasetUploadParams: DatasetUploadParams) = apply {
            this.file = datasetUploadParams.file
            this.inputKeys(datasetUploadParams.inputKeys)
            this.dataType = datasetUploadParams.dataType
            this.description = datasetUploadParams.description
            this.name = datasetUploadParams.name
            this.outputKeys(datasetUploadParams.outputKeys ?: listOf())
            additionalQueryParams(datasetUploadParams.additionalQueryParams)
            additionalHeaders(datasetUploadParams.additionalHeaders)
            additionalBodyProperties(datasetUploadParams.additionalBodyProperties)
        }

        fun file(file: String) = apply { this.file = file }

        fun inputKeys(inputKeys: List<String>) = apply {
            this.inputKeys.clear()
            this.inputKeys.addAll(inputKeys)
        }

        fun addInputKey(inputKey: String) = apply { this.inputKeys.add(inputKey) }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType) = apply { this.dataType = dataType }

        fun description(description: String) = apply { this.description = description }

        fun name(name: String) = apply { this.name = name }

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

        fun build(): DatasetUploadParams =
            DatasetUploadParams(
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(inputKeys) { "`inputKeys` is required but was not set" }
                    .toUnmodifiable(),
                dataType,
                description,
                name,
                if (outputKeys.size == 0) null else outputKeys.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class DataType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val KV = DataType(JsonField.of("kv"))

            @JvmField val LLM = DataType(JsonField.of("llm"))

            @JvmField val CHAT = DataType(JsonField.of("chat"))

            @JvmStatic fun of(value: String) = DataType(JsonField.of(value))
        }

        enum class Known {
            KV,
            LLM,
            CHAT,
        }

        enum class Value {
            KV,
            LLM,
            CHAT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                KV -> Value.KV
                LLM -> Value.LLM
                CHAT -> Value.CHAT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                KV -> Known.KV
                LLM -> Known.LLM
                CHAT -> Known.CHAT
                else -> throw LangSmithInvalidDataException("Unknown DataType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
