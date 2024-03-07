// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public.examples

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
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val runService = client.public_().examples().runs()
        val publicExampleRunCreateResponse =
            runService.create(
                PublicExampleRunCreateParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .filters(PublicExampleRunCreateParams.Filters.builder().build())
                    .limit(123L)
                    .offset(123L)
                    .build()
            )
        println(publicExampleRunCreateResponse)
    }
}
