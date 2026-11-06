// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetUpdateParamsTest {

    @Test
    fun create() {
        DatasetUpdateParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .inputsSchemaDefinition(
                DatasetUpdateParams.InputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .metadata(
                DatasetUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .name("name")
            .outputsSchemaDefinition(
                DatasetUpdateParams.OutputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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
                                "inputs" to mapOf("foo" to "bar"),
                                "metadata" to mapOf("foo" to "bar"),
                                "outputs" to mapOf("foo" to "bar"),
                                "overwrite" to true,
                                "split" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
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
                .baselineExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .inputsSchemaDefinition(
                    DatasetUpdateParams.InputsSchemaDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .metadata(
                    DatasetUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .outputsSchemaDefinition(
                    DatasetUpdateParams.OutputsSchemaDefinition.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
                                    "inputs" to mapOf("foo" to "bar"),
                                    "metadata" to mapOf("foo" to "bar"),
                                    "outputs" to mapOf("foo" to "bar"),
                                    "overwrite" to true,
                                    "split" to listOf("string"),
                                )
                            ),
                        )
                        .build()
                )
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

        assertThat(body.baselineExperimentId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.description()).contains("description")
        assertThat(body.inputsSchemaDefinition())
            .contains(
                DatasetUpdateParams.InputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                DatasetUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.name()).contains("name")
        assertThat(body.outputsSchemaDefinition())
            .contains(
                DatasetUpdateParams.OutputsSchemaDefinition.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
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
                                "inputs" to mapOf("foo" to "bar"),
                                "metadata" to mapOf("foo" to "bar"),
                                "outputs" to mapOf("foo" to "bar"),
                                "overwrite" to true,
                                "split" to listOf("string"),
                            )
                        ),
                    )
                    .build()
            )
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
        val params =
            DatasetUpdateParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
