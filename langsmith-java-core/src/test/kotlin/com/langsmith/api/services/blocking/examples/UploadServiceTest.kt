// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.examples

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class UploadServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadService = client.examples().upload()
        val exampleUploadCreateResponse =
            uploadService.create(
                ExampleUploadCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .file("file.txt")
                    .inputKeys(listOf("string"))
                    .outputKeys(listOf("string"))
                    .build()
            )
        println(exampleUploadCreateResponse)
        for (example: Example in exampleUploadCreateResponse) {
            example.validate()
        }
    }
}
