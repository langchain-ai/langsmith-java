// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUpdateParamsTest {

    @Test
    fun create() {
        DatasetUpdateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("string")
            .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
            .metadata(JsonValue.from(mapOf<String, Any>()))
            .name("string")
            .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
            .patchExamples(
                DatasetUpdateParams.PatchExamples.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "attachments_operations" to
                                    mapOf(
                                        "rename" to mapOf("foo" to "string"),
                                        "retain" to listOf("string"),
                                    ),
                                "dataset_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                "inputs" to mapOf<String, Any>(),
                                "metadata" to mapOf<String, Any>(),
                                "outputs" to mapOf<String, Any>(),
                                "overwrite" to true,
                                "split" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
            .transformationsOfDataset(
                listOf(
                    DatasetTransformation.builder()
                        .addPath("string")
                        .transformationType(
                            DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                        )
                        .build()
                )
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetUpdateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DatasetUpdateParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("string")
                .inputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .name("string")
                .outputsSchemaDefinition(JsonValue.from(mapOf<String, Any>()))
                .patchExamples(
                    DatasetUpdateParams.PatchExamples.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "attachments_operations" to
                                        mapOf(
                                            "rename" to mapOf("foo" to "string"),
                                            "retain" to listOf("string"),
                                        ),
                                    "dataset_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                    "inputs" to mapOf<String, Any>(),
                                    "metadata" to mapOf<String, Any>(),
                                    "outputs" to mapOf<String, Any>(),
                                    "overwrite" to true,
                                    "split" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
                .transformationsOfDataset(
                    listOf(
                        DatasetTransformation.builder()
                            .addPath("string")
                            .transformationType(
                                DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                            )
                            .build()
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.description()).contains(DatasetUpdateParams.Description.ofString("string"))
        assertThat(body.inputsSchemaDefinition())
            .contains(
                DatasetUpdateParams.InputsSchemaDefinition.ofJsonValue(
                    JsonValue.from(mapOf<String, Any>())
                )
            )
        assertThat(body.metadata())
            .contains(
                DatasetUpdateParams.Metadata.ofJsonValue(JsonValue.from(mapOf<String, Any>()))
            )
        assertThat(body.name()).contains(DatasetUpdateParams.Name.ofString("string"))
        assertThat(body.outputsSchemaDefinition())
            .contains(
                DatasetUpdateParams.OutputsSchemaDefinition.ofJsonValue(
                    JsonValue.from(mapOf<String, Any>())
                )
            )
        assertThat(body.patchExamples())
            .contains(
                DatasetUpdateParams.PatchExamples.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "attachments_operations" to
                                    mapOf(
                                        "rename" to mapOf("foo" to "string"),
                                        "retain" to listOf("string"),
                                    ),
                                "dataset_id" to "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e",
                                "inputs" to mapOf<String, Any>(),
                                "metadata" to mapOf<String, Any>(),
                                "outputs" to mapOf<String, Any>(),
                                "overwrite" to true,
                                "split" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(body.transformations())
            .contains(
                DatasetUpdateParams.Transformations.ofDataset(
                    listOf(
                        DatasetTransformation.builder()
                            .addPath("string")
                            .transformationType(
                                DatasetTransformation.TransformationType.CONVERT_TO_OPENAI_MESSAGE
                            )
                            .build()
                    )
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DatasetUpdateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
