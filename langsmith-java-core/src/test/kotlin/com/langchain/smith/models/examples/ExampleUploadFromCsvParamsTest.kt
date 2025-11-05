// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUploadFromCsvParamsTest {

    @Test
    fun create() {
        ExampleUploadFromCsvParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .file("some content".byteInputStream())
            .addInputKey("string")
            .addMetadataKey("string")
            .addOutputKey("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleUploadFromCsvParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("some content".byteInputStream())
                .addInputKey("string")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExampleUploadFromCsvParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("some content".byteInputStream())
                .addInputKey("string")
                .addMetadataKey("string")
                .addOutputKey("string")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "input_keys" to MultipartField.of(listOf("string")),
                        "metadata_keys" to MultipartField.of(listOf("string")),
                        "output_keys" to MultipartField.of(listOf("string")),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleUploadFromCsvParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .file("some content".byteInputStream())
                .addInputKey("string")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("some content".byteInputStream()),
                        "input_keys" to MultipartField.of(listOf("string")),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
