// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public_

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ExampleServiceTest {

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val exampleService = client.public_().examples()
        val publicExampleListResponse =
            exampleService.list(
                PublicExampleListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(publicExampleListResponse)
        for (example: Example in publicExampleListResponse) {
            example.validate()
        }
    }
}
