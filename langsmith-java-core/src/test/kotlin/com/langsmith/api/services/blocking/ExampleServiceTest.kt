// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExampleServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.examples()
        val example =
            exampleService.create(
                ExampleCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(example)
        example.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.examples()
        val example =
            exampleService.retrieve(
                ExampleRetrieveParams.builder()
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(example)
        example.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.examples()
        val exampleUpdateResponse =
            exampleService.update(
                ExampleUpdateParams.builder()
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        println(exampleUpdateResponse)
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.examples()
        val exampleListResponse =
            exampleService.list(
                ExampleListParams.builder()
                    .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(exampleListResponse)
        for (example: Example in exampleListResponse) {
            example.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.examples()
        val exampleDeleteResponse =
            exampleService.delete(
                ExampleDeleteParams.builder()
                    .exampleIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(exampleDeleteResponse)
    }
}
