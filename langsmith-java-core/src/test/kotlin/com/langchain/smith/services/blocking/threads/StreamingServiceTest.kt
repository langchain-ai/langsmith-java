// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.threads

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.threads.streaming.StreamingQueryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryStreaming() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val streamingService = client.threads().streaming()

        val responseStreamResponse =
            streamingService.queryStreaming(
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

        responseStreamResponse.use {
            responseStreamResponse.stream().forEach { response ->
                response.forEach { it.validate() }
            }
        }
    }
}
