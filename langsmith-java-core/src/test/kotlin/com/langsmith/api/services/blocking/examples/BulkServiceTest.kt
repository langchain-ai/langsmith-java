// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.examples

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BulkServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val bulkService = client.examples().bulk()
        val exampleBulkCreateResponse =
            bulkService.create(
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
            )
        println(exampleBulkCreateResponse)
        for (example: Example in exampleBulkCreateResponse) {
            example.validate()
        }
    }
}
