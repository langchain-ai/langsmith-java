// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.examples

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleUpdateMetadataParamsTest {

    @Test
    fun create() {
        ExampleUpdateMetadataParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addOperation(
                ExampleUpdateMetadataParams.Operation.builder()
                    .key("key")
                    .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .addValue("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ExampleUpdateMetadataParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addOperation(
                    ExampleUpdateMetadataParams.Operation.builder()
                        .key("key")
                        .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ExampleUpdateMetadataParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addOperation(
                    ExampleUpdateMetadataParams.Operation.builder()
                        .key("key")
                        .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                        .value(JsonValue.from(mapOf<String, Any>()))
                        .addValue("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.exampleIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.operations())
            .containsExactly(
                ExampleUpdateMetadataParams.Operation.builder()
                    .key("key")
                    .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                    .value(JsonValue.from(mapOf<String, Any>()))
                    .addValue("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ExampleUpdateMetadataParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addOperation(
                    ExampleUpdateMetadataParams.Operation.builder()
                        .key("key")
                        .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.exampleIds()).containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.operations())
            .containsExactly(
                ExampleUpdateMetadataParams.Operation.builder()
                    .key("key")
                    .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                    .build()
            )
    }
}
