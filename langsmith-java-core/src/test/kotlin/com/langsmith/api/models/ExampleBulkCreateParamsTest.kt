// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExampleBulkCreateParamsTest {

    @Test
    fun createExampleBulkCreateParams() {
        ExampleBulkCreateParams.builder()
            .body(
                listOf(
                    ExampleBulkCreateParams.ExampleCreate.builder()
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExampleBulkCreateParams.builder()
                .body(
                    listOf(
                        ExampleBulkCreateParams.ExampleCreate.builder()
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .outputs(JsonValue.from(mapOf<String, Any>()))
                            .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.body())
            .isEqualTo(
                listOf(
                    ExampleBulkCreateParams.ExampleCreate.builder()
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .outputs(JsonValue.from(mapOf<String, Any>()))
                        .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExampleBulkCreateParams.builder()
                .body(
                    listOf(
                        ExampleBulkCreateParams.ExampleCreate.builder()
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.body())
            .isEqualTo(
                listOf(
                    ExampleBulkCreateParams.ExampleCreate.builder()
                        .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .inputs(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
            )
    }
}
