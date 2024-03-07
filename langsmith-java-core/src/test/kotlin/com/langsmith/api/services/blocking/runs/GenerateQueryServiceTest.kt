// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class GenerateQueryServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val generateQueryService = client.runs().generateQuery()
        val responseBodyForRunsGenerateQuery =
            generateQueryService.create(
                RunGenerateQueryCreateParams.builder().query("string").build()
            )
        println(responseBodyForRunsGenerateQuery)
        responseBodyForRunsGenerateQuery.validate()
    }
}
