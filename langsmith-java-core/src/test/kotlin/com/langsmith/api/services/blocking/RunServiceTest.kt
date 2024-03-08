// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

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
        val runService = client.runs()
        val runCreateResponse = runService.create(RunCreateParams.builder().build())
        println(runCreateResponse)
    }

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.runs()
        val runSchema =
            runService.retrieve(
                RunRetrieveParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(runSchema)
        runSchema.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.runs()
        val runUpdateResponse =
            runService.update(
                RunUpdateParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(runUpdateResponse)
    }

    @Test
    fun callBatch() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.runs()
        val runBatchResponse = runService.batch(RunBatchParams.builder().build())
        println(runBatchResponse)
    }
}
