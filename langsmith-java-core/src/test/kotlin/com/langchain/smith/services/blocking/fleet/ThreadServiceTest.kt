// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.fleet

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun activateSandbox() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val threadService = client.fleet().threads()

        val response = threadService.activateSandbox("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
