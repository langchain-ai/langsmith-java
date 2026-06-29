// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExperimentRunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val experimentRunServiceAsync = client.datasets().experimentRuns()

        val pageFuture = experimentRunServiceAsync.create("dataset_id")

        val page = pageFuture.get()
        page.response().validate()
    }
}
