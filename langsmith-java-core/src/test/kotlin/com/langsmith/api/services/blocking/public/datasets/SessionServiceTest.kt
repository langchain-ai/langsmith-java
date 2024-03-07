// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.public.datasets

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SessionServiceTest {

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val sessionService = client.public_().datasets().sessions()
        val publicDatasetSessionListResponse =
            sessionService.list(
                PublicDatasetSessionListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .facets(true)
                    .limit(123L)
                    .name("string")
                    .nameContains("string")
                    .offset(123L)
                    .sortBy(PublicDatasetSessionListParams.SortBy.NAME)
                    .sortByDesc(true)
                    .sortByFeedbackKey("string")
                    .build()
            )
        println(publicDatasetSessionListResponse)
        for (tracerSession: TracerSession in publicDatasetSessionListResponse) {
            tracerSession.validate()
        }
    }
}
