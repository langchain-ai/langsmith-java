// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.langchain.smith.client.LangsmithClient
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.sessions.CustomChartsSectionRequest
import com.langchain.smith.models.sessions.RunStatsGroupBy
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: LangsmithClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            LangsmithOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun dashboard() {
        val sessionService = client.sessions()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        sessionService.dashboard(
            SessionDashboardParams.builder()
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .accept("accept")
                .customChartsSectionRequest(
                    CustomChartsSectionRequest.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .groupBy(
                            RunStatsGroupBy.builder()
                                .attribute(RunStatsGroupBy.Attribute.NAME)
                                .maxGroups(0L)
                                .path("path")
                                .build()
                        )
                        .omitData(true)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                        .timezone("timezone")
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
