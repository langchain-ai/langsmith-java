// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking.examples

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class BulkServiceTest {

    @Test // templates/JavaSDK/entities/testing.ts:18:13 // templates/JavaSDK/services.ts:298:15
    fun callCreate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val bulkService = client.examples().bulk()
        val exampleBulkCreateResponse =
            bulkService.create(
                ExampleBulkCreateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
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
        println(
            exampleBulkCreateResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (example: Example in
            exampleBulkCreateResponse) { // templates/JavaSDK/services.ts:509:10
            example.validate()
        }
    }
}
