// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUploadParamsTest {

    @Test
    fun create() {
        DatasetUploadParams.builder()
            .file("some content".byteInputStream())
            .addInputKey("string")
            .dataType(DataType.KV)
            .description("description")
            .inputKeyMappings("input_key_mappings")
            .inputsSchemaDefinition("inputs_schema_definition")
            .metadataKeyMappings("metadata_key_mappings")
            .addMetadataKey("string")
            .name("name")
            .outputKeyMappings("output_key_mappings")
            .addOutputKey("string")
            .outputsSchemaDefinition("outputs_schema_definition")
            .transformations("transformations")
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetUploadParams.builder()
                .file("some content".byteInputStream())
                .addInputKey("string")
                .dataType(DataType.KV)
                .description("description")
                .inputKeyMappings("input_key_mappings")
                .inputsSchemaDefinition("inputs_schema_definition")
                .metadataKeyMappings("metadata_key_mappings")
                .addMetadataKey("string")
                .name("name")
                .outputKeyMappings("output_key_mappings")
                .addOutputKey("string")
                .outputsSchemaDefinition("outputs_schema_definition")
                .transformations("transformations")
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
                        "data_type" to MultipartField.of(DataType.KV),
                        "description" to MultipartField.of("description"),
                        "input_key_mappings" to MultipartField.of("input_key_mappings"),
                        "inputs_schema_definition" to MultipartField.of("inputs_schema_definition"),
                        "metadata_key_mappings" to MultipartField.of("metadata_key_mappings"),
                        "metadata_keys" to MultipartField.of(listOf("string")),
                        "name" to MultipartField.of("name"),
                        "output_key_mappings" to MultipartField.of("output_key_mappings"),
                        "output_keys" to MultipartField.of(listOf("string")),
                        "outputs_schema_definition" to
                            MultipartField.of("outputs_schema_definition"),
                        "transformations" to MultipartField.of("transformations"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetUploadParams.builder()
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
