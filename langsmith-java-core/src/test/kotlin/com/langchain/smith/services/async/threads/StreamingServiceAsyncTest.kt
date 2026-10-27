// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.threads

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.threads.streaming.StreamingQueryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryStreaming() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val streamingServiceAsync = client.threads().streaming()

        val responseStreamResponse =
            streamingServiceAsync.queryStreaming(
                StreamingQueryParams.builder()
                    .accept("Accept")
                    .aiSearch("A conversation about a refund request")
                    .cursor("cursor")
                    .filter("filter")
                    .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pageSize(20L)
                    .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                    .threadFilter("gte(turn_count, 3)")
                    .traceFilter("eq(status, \"error\")")
                    .treeFilter("has(tags, \"production\")")
                    .build()
            )

        val onCompleteFuture =
            responseStreamResponse
                .subscribe { response -> response.forEach { it.validate() } }
                .onCompleteFuture()
        onCompleteFuture.get()
    }
}
