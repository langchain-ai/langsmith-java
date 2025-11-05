// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.examples

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUpdateParamsTest {

    @Test
    fun create() {
        ExampleUpdateParams.builder()
            .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
    }

    @Test
    fun pathParams() {
        val params =
            ExampleUpdateParams.builder().exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExampleUpdateParams.builder()
                .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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

        val body = params._body()

        assertThat(body.attachmentsOperations())
            .contains(
                AttachmentsOperations.builder()
                    .rename(
                        AttachmentsOperations.Rename.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addRetain("string")
                    .build()
            )
        assertThat(body.datasetId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(body.overwrite()).contains(true)
        assertThat(body.split()).contains(ExampleUpdateParams.Split.ofStrings(listOf("string")))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleUpdateParams.builder().exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
