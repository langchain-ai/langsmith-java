// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.traces.TraceListRunsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TraceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRuns() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val traceServiceAsync = client.traces()

        val responseFuture =
            traceServiceAsync.listRuns(
                TraceListRunsParams.builder()
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter("filter")
                    .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addSelect(TraceListRunsParams.Select.ID)
                    .accept("Accept")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val traceServiceAsync = client.traces()

        val pageFuture = traceServiceAsync.query()

        val page = pageFuture.get()
        page.response().validate()
    }
}
