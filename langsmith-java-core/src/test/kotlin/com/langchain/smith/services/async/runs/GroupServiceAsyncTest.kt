// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.runs.group.GroupCreateParams
import com.langchain.smith.models.runs.group.RunGroupRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class GroupServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val groupServiceAsync = client.runs().group()

        val groupFuture =
            groupServiceAsync.create(
                GroupCreateParams.builder()
                    .accept("accept")
                    .runGroupRequest(
                        RunGroupRequest.builder()
                            .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .filter("filter")
                            .limit(1L)
                            .offset(0L)
                            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val group = groupFuture.get()
        group.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun stats() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val groupServiceAsync = client.runs().group()

        val responseFuture =
            groupServiceAsync.stats(
                RunGroupRequest.builder()
                    .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .limit(1L)
                    .offset(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
