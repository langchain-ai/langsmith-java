// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ContentTypes
import com.langsmith.api.core.Enum
import com.langsmith.api.core.JsonField
import com.langsmith.api.core.JsonValue
import com.langsmith.api.core.MultipartFormValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.errors.LangSmithInvalidDataException
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional
import org.apache.hc.core5.http.ContentType

class DatasetUploadParams
constructor(
    private val file: MultipartFormValue<ByteArray>,
    private val inputKeys: MultipartFormValue<List<String>>,
    private val dataType: MultipartFormValue<DataType>?,
    private val description: MultipartFormValue<String>?,
    private val name: MultipartFormValue<String>?,
    private val outputKeys: MultipartFormValue<List<String>>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun file(): MultipartFormValue<ByteArray> = file

    fun inputKeys(): MultipartFormValue<List<String>> = inputKeys

    fun dataType(): Optional<MultipartFormValue<DataType>> = Optional.ofNullable(dataType)

    fun description(): Optional<MultipartFormValue<String>> = Optional.ofNullable(description)

    fun name(): Optional<MultipartFormValue<String>> = Optional.ofNullable(name)

    fun outputKeys(): Optional<MultipartFormValue<List<String>>> = Optional.ofNullable(outputKeys)

    @JvmSynthetic
    internal fun getBody(): Array<MultipartFormValue<*>?> {
        return arrayOf(
            file,
            inputKeys,
            dataType,
            description,
            name,
            outputKeys,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DatasetUploadBody.Builder::class)
    @NoAutoDetect
    class DatasetUploadBody
    internal constructor(
        private val file: ByteArray?,
        private val inputKeys: List<String>?,
        private val dataType: DataType?,
        private val description: String?,
        private val name: String?,
        private val outputKeys: List<String>?,
    ) {

        private var hashCode: Int = 0

        fun file(): ByteArray? = file

        fun inputKeys(): List<String>? = inputKeys

        /** Enum for dataset data types. */
        fun dataType(): DataType? = dataType

        fun description(): String? = description

        fun name(): String? = name

        fun outputKeys(): List<String>? = outputKeys

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
                this.outputKeys == other.outputKeys
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
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DatasetUploadBody{file=$file, inputKeys=$inputKeys, dataType=$dataType, description=$description, name=$name, outputKeys=$outputKeys}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var file: ByteArray? = null
            private var inputKeys: List<String>? = null
            private var dataType: DataType? = null
            private var description: String? = null
            private var name: String? = null
            private var outputKeys: List<String>? = null

            @JvmSynthetic
            internal fun from(datasetUploadBody: DatasetUploadBody) = apply {
                this.file = datasetUploadBody.file
                this.inputKeys = datasetUploadBody.inputKeys
                this.dataType = datasetUploadBody.dataType
                this.description = datasetUploadBody.description
                this.name = datasetUploadBody.name
                this.outputKeys = datasetUploadBody.outputKeys
            }

            fun file(file: ByteArray) = apply { this.file = file }

            fun inputKeys(inputKeys: List<String>) = apply { this.inputKeys = inputKeys }

            /** Enum for dataset data types. */
            fun dataType(dataType: DataType) = apply { this.dataType = dataType }

            fun description(description: String) = apply { this.description = description }

            fun name(name: String) = apply { this.name = name }

            fun outputKeys(outputKeys: List<String>) = apply { this.outputKeys = outputKeys }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

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
            this.additionalHeaders == other.additionalHeaders
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
        )
    }

    override fun toString() =
        "DatasetUploadParams{file=$file, inputKeys=$inputKeys, dataType=$dataType, description=$description, name=$name, outputKeys=$outputKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var file: MultipartFormValue<ByteArray>? = null
        private var inputKeys: MutableMultipartFormValue<List<String>> = mutableListOf()
        private var dataType: MultipartFormValue<DataType>? = null
        private var description: MultipartFormValue<String>? = null
        private var name: MultipartFormValue<String>? = null
        private var outputKeys: MutableMultipartFormValue<List<String>> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

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
        }

        fun file(
            content: ByteArray,
            filename: String? = null,
            contentType: ContentType = ContentTypes.DefaultBinary
        ) = apply {
            this.file = MultipartFormValue.fromByteArray("file", content, contentType, filename)
        }

        fun inputKeys(inputKeys: List<String>) = apply {
            this.inputKeys.clear()
            this.inputKeys.addAll(inputKeys)
        }

        fun addInputKey(inputKey: String) = apply { this.inputKeys.add(inputKey) }

        /** Enum for dataset data types. */
        fun dataType(dataType: DataType, contentType: ContentType = ContentTypes.DefaultText) =
            apply {
                this.dataType = MultipartFormValue.fromEnum("dataType", dataType, contentType)
            }

        fun description(description: String, contentType: ContentType = ContentTypes.DefaultText) =
            apply {
                this.description =
                    MultipartFormValue.fromString("description", description, contentType)
            }

        fun name(name: String, contentType: ContentType = ContentTypes.DefaultText) = apply {
            this.name = MultipartFormValue.fromString("name", name, contentType)
        }

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
            )
    }

    class DataType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
