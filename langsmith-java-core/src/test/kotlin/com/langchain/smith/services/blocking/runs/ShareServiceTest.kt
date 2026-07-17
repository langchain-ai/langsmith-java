// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.share.ShareCreateParams
import com.langchain.smith.models.runs.share.ShareDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShareServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.runs().share()

        val share =
            shareService.create(
                ShareCreateParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )

        share.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.runs().share()

        shareService.delete(
            ShareDeleteParams.builder()
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()
        )
    }
}
