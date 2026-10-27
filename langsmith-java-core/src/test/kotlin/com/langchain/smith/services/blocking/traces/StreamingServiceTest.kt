// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.traces

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.RunSelectField
import com.langchain.smith.models.traces.streaming.StreamingQueryParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryStreaming() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val streamingService = client.traces().streaming()

        val responseStreamResponse =
            streamingService.queryStreaming(
                StreamingQueryParams.builder()
                    .accept("Accept")
                    .aiSearch("A run that contains a billing dispute")
                    .cursor("cursor")
                    .maxFeedbackModifiedAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                    .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                    .minFeedbackModifiedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .pageSize(20L)
                    .projectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .selects(
                        listOf(
                            RunSelectField.ID,
                            RunSelectField.NAME,
                            RunSelectField.START_TIME,
                            RunSelectField.STATUS,
                            RunSelectField.TOTAL_TOKENS,
                            RunSelectField.TOTAL_COST,
                            RunSelectField.FIRST_TOKEN_TIME,
                        )
                    )
                    .traceFilter("eq(status, \"error\")")
                    .addTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
