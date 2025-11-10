// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.JsonValue
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetCreateParamsTest {

    @Test
    fun create() {
        DatasetCreateParams.builder()
            .name("name")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .dataType(DatasetCreateParams.DataType.KV)
            .description("description")
            .externallyManaged(true)
            .extra(JsonValue.from(mapOf<String, Any>()))
            .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
            .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
            .addTransformation(
                DatasetTransformation.builder()
                    .addPath("string")
                    .transformationType(
                        DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DatasetCreateParams.builder()
                .name("name")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataType(DatasetCreateParams.DataType.KV)
                .description("description")
                .externallyManaged(true)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                .addTransformation(
                    DatasetTransformation.builder()
                        .addPath("string")
                        .transformationType(
                            DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.dataType()).contains(DatasetCreateParams.DataType.KV)
        assertThat(body.description()).contains("description")
        assertThat(body.externallyManaged()).contains(true)
        assertThat(body._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._inputsSchemaDefinition()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._outputsSchemaDefinition()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.transformations().getOrNull())
            .containsExactly(
                DatasetTransformation.builder()
                    .addPath("string")
                    .transformationType(
                        DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DatasetCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
