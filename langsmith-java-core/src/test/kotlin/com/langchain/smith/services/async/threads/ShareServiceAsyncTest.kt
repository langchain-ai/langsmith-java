// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.threads

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.threads.share.ShareCreateParams
import com.langchain.smith.models.threads.share.ShareDeleteParams
import com.langchain.smith.models.threads.share.ShareRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShareServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.threads().share()

        val shareFuture =
            shareServiceAsync.create(
                ShareCreateParams.builder()
                    .threadId("thread_id")
                    .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )

        val share = shareFuture.get()
        share.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.threads().share()

        val shareFuture =
            shareServiceAsync.retrieve(
                ShareRetrieveParams.builder()
                    .threadId("thread_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val share = shareFuture.get()
        share.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.threads().share()

        val future =
            shareServiceAsync.delete(
                ShareDeleteParams.builder()
                    .threadId("thread_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }
}
