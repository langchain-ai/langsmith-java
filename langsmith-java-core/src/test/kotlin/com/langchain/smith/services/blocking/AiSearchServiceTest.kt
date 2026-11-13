// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.aisearch.AiSearchParseParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AiSearchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun parse() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val aiSearchService = client.aiSearch()

        val response =
            aiSearchService.parse(
                AiSearchParseParams.builder()
                    .aiSearch(
                        "threads where the agent did not complete the task and spent more than \$1"
                    )
                    .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .allowClarification(true)
                    .scope(AiSearchParseParams.Scope.RUNS)
                    .build()
            )

        response.validate()
    }
}
