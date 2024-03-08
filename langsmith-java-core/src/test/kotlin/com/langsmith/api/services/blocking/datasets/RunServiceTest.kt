// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.datasets

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RunServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.datasets().runs()
        val datasetRunCreateResponse =
            runService.create(
                DatasetRunCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .filters(DatasetRunCreateParams.Filters.builder().build())
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(datasetRunCreateResponse)
    }
}
