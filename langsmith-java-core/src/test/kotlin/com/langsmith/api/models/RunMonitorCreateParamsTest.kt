// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunMonitorCreateParamsTest {

    @Test
    fun createRunMonitorCreateParams() {
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
                RunMonitorCreateParams.Stride.builder().days(123L).hours(123L).minutes(123L).build()
            )
            .timezone("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
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
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.groups())
            .isEqualTo(
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
        assertThat(body.interval())
            .isEqualTo(
                RunMonitorCreateParams.Interval.builder()
                    .days(123L)
                    .hours(123L)
                    .minutes(123L)
                    .build()
            )
        assertThat(body.stride())
            .isEqualTo(
                RunMonitorCreateParams.Stride.builder().days(123L).hours(123L).minutes(123L).build()
            )
        assertThat(body.timezone()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            RunMonitorCreateParams.builder()
                .groups(
                    listOf(
                        RunMonitorCreateParams.Group.builder()
                            .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.groups())
            .isEqualTo(
                listOf(
                    RunMonitorCreateParams.Group.builder()
                        .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
