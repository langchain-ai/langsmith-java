// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ShareServiceTest {

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val shareService = client.runs().share()
        val runShareSchema =
            shareService.retrieve(
                RunShareRetrieveParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(runShareSchema)
        runShareSchema.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val shareService = client.runs().share()
        val runShareSchema =
            shareService.update(
                RunShareUpdateParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(runShareSchema)
        runShareSchema.validate()
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val shareService = client.runs().share()
        val runShareDeleteResponse =
            shareService.delete(
                RunShareDeleteParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(runShareDeleteResponse)
    }
}
