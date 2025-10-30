// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.datasets.examples

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUploadParamsTest {

    @Test
    fun create() {
        ExampleUploadParams.builder()
            .datasetId(JsonValue.from(mapOf<String, Any>()))
            .exampleId("some content".byteInputStream())
            .exampleIdInputs("some content".byteInputStream())
            .exampleIdAttachmentsName("some content".byteInputStream())
            .exampleIdOutputs("some content".byteInputStream())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleUploadParams.builder()
                .datasetId(JsonValue.from(mapOf<String, Any>()))
                .exampleId("some content".byteInputStream())
                .exampleIdInputs("some content".byteInputStream())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExampleUploadParams.builder()
                .datasetId(JsonValue.from(mapOf<String, Any>()))
                .exampleId("some content".byteInputStream())
                .exampleIdInputs("some content".byteInputStream())
                .exampleIdAttachmentsName("some content".byteInputStream())
                .exampleIdOutputs("some content".byteInputStream())
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
                        "{example_id}" to MultipartField.of("some content".byteInputStream()),
                        "{example_id}.inputs" to
                            MultipartField.of("some content".byteInputStream()),
                        "{example_id}.attachments.{name}" to
                            MultipartField.of("some content".byteInputStream()),
                        "{example_id}.outputs" to
                            MultipartField.of("some content".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleUploadParams.builder()
                .datasetId(JsonValue.from(mapOf<String, Any>()))
                .exampleId("some content".byteInputStream())
                .exampleIdInputs("some content".byteInputStream())
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
                        "{example_id}" to MultipartField.of("some content".byteInputStream()),
                        "{example_id}.inputs" to MultipartField.of("some content".byteInputStream()),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
