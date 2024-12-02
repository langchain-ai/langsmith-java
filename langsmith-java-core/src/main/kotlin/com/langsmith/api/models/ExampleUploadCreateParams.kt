// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.langsmith.api.core.ContentTypes
import com.langsmith.api.core.MultipartFormValue
import com.langsmith.api.core.NoAutoDetect
import com.langsmith.api.core.toUnmodifiable
import com.langsmith.api.models.*
import java.util.Objects
import java.util.Optional
import org.apache.hc.core5.http.ContentType

class ExampleUploadCreateParams
constructor(
    private val datasetId: MultipartFormValue<String>,
    private val file: MultipartFormValue<ByteArray>,
    private val inputKeys: MultipartFormValue<List<String>>,
    private val outputKeys: MultipartFormValue<List<String>>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun datasetId(): MultipartFormValue<String> = datasetId

    fun file(): MultipartFormValue<ByteArray> = file

    fun inputKeys(): MultipartFormValue<List<String>> = inputKeys

    fun outputKeys(): Optional<MultipartFormValue<List<String>>> = Optional.ofNullable(outputKeys)

    @JvmSynthetic
    internal fun getBody(): Array<MultipartFormValue<*>?> {
        return arrayOf(
            file,
            inputKeys,
            outputKeys,
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
        private val file: ByteArray?,
        private val inputKeys: List<String>?,
        private val outputKeys: List<String>?,
    ) {

        private var hashCode: Int = 0

        fun file(): ByteArray? = file

        fun inputKeys(): List<String>? = inputKeys

        fun outputKeys(): List<String>? = outputKeys

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExampleUploadCreateBody &&
                this.file == other.file &&
                this.inputKeys == other.inputKeys &&
                this.outputKeys == other.outputKeys
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        file,
                        inputKeys,
                        outputKeys,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ExampleUploadCreateBody{file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var file: ByteArray? = null
            private var inputKeys: List<String>? = null
            private var outputKeys: List<String>? = null

            @JvmSynthetic
            internal fun from(exampleUploadCreateBody: ExampleUploadCreateBody) = apply {
                this.file = exampleUploadCreateBody.file
                this.inputKeys = exampleUploadCreateBody.inputKeys
                this.outputKeys = exampleUploadCreateBody.outputKeys
            }

            fun file(file: ByteArray) = apply { this.file = file }

            fun inputKeys(inputKeys: List<String>) = apply { this.inputKeys = inputKeys }

            fun outputKeys(outputKeys: List<String>) = apply { this.outputKeys = outputKeys }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

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
            this.additionalHeaders == other.additionalHeaders
    }

    override fun hashCode(): Int {
        return Objects.hash(
            datasetId,
            file,
            inputKeys,
            outputKeys,
            additionalQueryParams,
            additionalHeaders,
        )
    }

    override fun toString() =
        "ExampleUploadCreateParams{datasetId=$datasetId, file=$file, inputKeys=$inputKeys, outputKeys=$outputKeys, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var datasetId: MultipartFormValue<String>? = null
        private var file: MultipartFormValue<ByteArray>? = null
        private var inputKeys: MutableMultipartFormValue<List<String>> = mutableListOf()
        private var outputKeys: MutableMultipartFormValue<List<String>> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        @JvmSynthetic
        internal fun from(exampleUploadCreateParams: ExampleUploadCreateParams) = apply {
            this.datasetId = exampleUploadCreateParams.datasetId
            this.file = exampleUploadCreateParams.file
            this.inputKeys(exampleUploadCreateParams.inputKeys)
            this.outputKeys(exampleUploadCreateParams.outputKeys ?: listOf())
            additionalQueryParams(exampleUploadCreateParams.additionalQueryParams)
            additionalHeaders(exampleUploadCreateParams.additionalHeaders)
        }

        fun datasetId(datasetId: String, contentType: ContentType = ContentTypes.DefaultText) =
            apply {
                this.datasetId = MultipartFormValue.fromString("datasetId", datasetId, contentType)
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

        fun build(): ExampleUploadCreateParams =
            ExampleUploadCreateParams(
                checkNotNull(datasetId) { "`datasetId` is required but was not set" },
                checkNotNull(file) { "`file` is required but was not set" },
                checkNotNull(inputKeys) { "`inputKeys` is required but was not set" }
                    .toUnmodifiable(),
                if (outputKeys.size == 0) null else outputKeys.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
