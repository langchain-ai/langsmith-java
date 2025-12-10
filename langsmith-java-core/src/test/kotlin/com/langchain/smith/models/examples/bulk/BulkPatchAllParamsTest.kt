// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples.bulk

import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkPatchAllParamsTest {

    @Test
    fun create() {
        BulkPatchAllParams.builder()
            .addBody(
                BulkPatchAllParams.Body.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .attachmentsOperations(
                        AttachmentsOperations.builder()
                            .rename(
                                AttachmentsOperations.Rename.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addRetain("string")
                            .build()
                    )
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(
                        BulkPatchAllParams.Body.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        BulkPatchAllParams.Body.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputs(
                        BulkPatchAllParams.Body.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .overwrite(true)
                    .splitOfStrings(listOf("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BulkPatchAllParams.builder()
                .addBody(
                    BulkPatchAllParams.Body.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .attachmentsOperations(
                            AttachmentsOperations.builder()
                                .rename(
                                    AttachmentsOperations.Rename.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .addRetain("string")
                                .build()
                        )
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(
                            BulkPatchAllParams.Body.Inputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .metadata(
                            BulkPatchAllParams.Body.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .outputs(
                            BulkPatchAllParams.Body.Outputs.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .overwrite(true)
                        .splitOfStrings(listOf("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BulkPatchAllParams.Body.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .attachmentsOperations(
                        AttachmentsOperations.builder()
                            .rename(
                                AttachmentsOperations.Rename.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addRetain("string")
                            .build()
                    )
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(
                        BulkPatchAllParams.Body.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        BulkPatchAllParams.Body.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputs(
                        BulkPatchAllParams.Body.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .overwrite(true)
                    .splitOfStrings(listOf("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BulkPatchAllParams.builder()
                .addBody(
                    BulkPatchAllParams.Body.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                BulkPatchAllParams.Body.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
    }
}
