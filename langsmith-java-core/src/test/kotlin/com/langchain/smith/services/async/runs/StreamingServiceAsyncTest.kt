// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.runs.RunSelectField
import com.langchain.smith.models.runs.RunType
import com.langchain.smith.models.runs.streaming.StreamingQueryV2Params
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StreamingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun queryV2Streaming() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val streamingServiceAsync = client.runs().streaming()

        val responseStreamResponse =
            streamingServiceAsync.queryV2Streaming(
                StreamingQueryV2Params.builder()
                    .accept("Accept")
                    .aiSearch("The customer was charged twice")
                    .cursor(
                        "eyJ2IjoxLCJhIjoicnVucy5xdWVyeSIsImsiOiJwYXNzIiwiYiI6InNkYiIsInQiOiJsdChjdXJzb3IsICcyMDI1LTEyLTEyIDE5OjAzOjI4LjQ4MTI1NTAxOWIxM2YyJykifQ"
                    )
                    .filter("and(eq(run_type, \"llm\"), gt(latency, 5))")
                    .hasError(false)
                    .addId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .addId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                    .includeSubtreeUsage(true)
                    .isRoot(true)
                    .maxFeedbackModifiedAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                    .maxStartTime(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                    .minFeedbackModifiedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .minStartTime(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .pageSize(100L)
                    .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .addProjectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                    .referenceDatasetId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                    .addReferenceExample("b2c3d4e5-f6a7-4b5c-9d0e-1f2a3b4c5d6e")
                    .addReferenceExample("c3d4e5f6-a7b8-4c5d-0e1f-2a3b4c5d6e7f")
                    .runType(RunType.LLM)
                    .selects(
                        listOf(
                            RunSelectField.ID,
                            RunSelectField.NAME,
                            RunSelectField.PROJECT_ID,
                            RunSelectField.START_TIME,
                            RunSelectField.RUN_TYPE,
                            RunSelectField.STATUS,
                        )
                    )
                    .traceFilter("eq(status, \"success\")")
                    .traceId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
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
