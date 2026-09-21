// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.threads.ThreadAggregateStatsParams
import com.langchain.smith.models.threads.ThreadListTracesParams
import com.langchain.smith.models.threads.ThreadStatsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ThreadServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun aggregateStats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val threadServiceAsync = client.threads()

        val responseFuture =
            threadServiceAsync.aggregateStats(
                ThreadAggregateStatsParams.builder()
                    .projectId("0190a1b2-c3d4-7ef0-a5b6-6ea3a82e9328")
                    .select(
                        listOf(
                            ThreadAggregateStatsParams.Select.THREAD_COUNT,
                            ThreadAggregateStatsParams.Select.TRACE_COUNT,
                            ThreadAggregateStatsParams.Select.TOTAL_TOKENS,
                            ThreadAggregateStatsParams.Select.TOTAL_COST,
                        )
                    )
                    .filter("eq(status, \"error\")")
                    .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadFilter("gte(turn_count, 3)")
                    .traceFilter("eq(status, \"error\")")
                    .treeFilter("has(tags, \"production\")")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listTraces() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val threadServiceAsync = client.threads()

        val pageFuture =
            threadServiceAsync.listTraces(
                ThreadListTracesParams.builder()
                    .threadId("thread_id")
                    .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val threadServiceAsync = client.threads()

        val pageFuture = threadServiceAsync.query()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val threadServiceAsync = client.threads()

        val threadStatsFuture =
            threadServiceAsync.stats(
                ThreadStatsParams.builder()
                    .threadId("thread_id")
                    .addSelect(ThreadStatsParams.Select.TURNS)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filter("filter")
                    .build()
            )

        val threadStats = threadStatsFuture.get()
        threadStats.validate()
    }
}
