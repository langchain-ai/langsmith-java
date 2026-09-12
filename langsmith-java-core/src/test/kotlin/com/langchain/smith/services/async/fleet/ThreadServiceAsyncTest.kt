// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.fleet

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun activateSandbox() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val threadServiceAsync = client.fleet().threads()

        val responseFuture =
            threadServiceAsync.activateSandbox("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
