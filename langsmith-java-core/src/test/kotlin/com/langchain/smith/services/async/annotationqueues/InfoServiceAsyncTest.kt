// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.annotationqueues

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class InfoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoServiceAsync = client.annotationQueues().info()

        val infosFuture = infoServiceAsync.list()

        val infos = infosFuture.get()
        infos.validate()
    }
}
