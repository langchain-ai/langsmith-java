// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.datasets

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class OpenAIFtServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val openaiFtService = client.datasets().openaiFt()
        val datasetOpenAIFtRetrieveResponse =
            openaiFtService.retrieve(
                DatasetOpenAIFtRetrieveParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(datasetOpenAIFtRetrieveResponse)
    }
}
