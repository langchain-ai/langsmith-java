// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.examples.bulk

import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.examples.AttachmentsOperations
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
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
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
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .metadata(JsonValue.from(mapOf<String, Any>()))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
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
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
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
