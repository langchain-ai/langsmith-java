// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.sandboxes.SandboxListUsageCostsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SandboxServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listUsageCosts() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val sandboxServiceAsync = client.sandboxes()

        val pageFuture =
            sandboxServiceAsync.listUsageCosts(
                SandboxListUsageCostsParams.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }
}
