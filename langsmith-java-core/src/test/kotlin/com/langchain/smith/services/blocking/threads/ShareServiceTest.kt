// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.threads

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.threads.share.ShareCreateParams
import com.langchain.smith.models.threads.share.ShareDeleteParams
import com.langchain.smith.models.threads.share.ShareRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShareServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.threads().share()

        val share =
            shareService.create(
                ShareCreateParams.builder()
                    .threadId("thread_id")
                    .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )

        share.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.threads().share()

        val share =
            shareService.retrieve(
                ShareRetrieveParams.builder()
                    .threadId("thread_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        share.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.threads().share()

        shareService.delete(
            ShareDeleteParams.builder()
                .threadId("thread_id")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }
}
