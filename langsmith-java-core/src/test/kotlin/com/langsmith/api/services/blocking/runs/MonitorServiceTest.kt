// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking.runs

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class MonitorServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val monitorService = client.runs().monitor()
        val monitorResponse =
            monitorService.create(
                RunMonitorCreateParams.builder()
                    .groups(
                        listOf(
                            RunMonitorCreateParams.Group.builder()
                                .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .metadata(
                                    RunMonitorCreateParams.Group.Metadata.builder()
                                        .key("string")
                                        .value("string")
                                        .build()
                                )
                                .tag("string")
                                .build()
                        )
                    )
                    .interval(
                        RunMonitorCreateParams.Interval.builder()
                            .days(123L)
                            .hours(123L)
                            .minutes(123L)
                            .build()
                    )
                    .stride(
                        RunMonitorCreateParams.Stride.builder()
                            .days(123L)
                            .hours(123L)
                            .minutes(123L)
                            .build()
                    )
                    .timezone("string")
                    .build()
            )
        println(monitorResponse)
        monitorResponse.validate()
    }
}
