// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.runs.share.ShareCreateParams
import com.langchain.smith.models.runs.share.ShareDeleteParams
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
        val shareServiceAsync = client.runs().share()

        val shareFuture =
            shareServiceAsync.create(
                ShareCreateParams.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .traceId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
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
        val shareServiceAsync = client.runs().share()

        val future =
            shareServiceAsync.delete(
                ShareDeleteParams.builder()
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .build()
            )

        val response = future.get()
    }
}
