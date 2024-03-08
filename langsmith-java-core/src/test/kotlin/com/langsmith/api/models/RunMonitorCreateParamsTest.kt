// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunMonitorCreateParamsTest { // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13 //
    // templates/JavaSDK/entities/params.ts:907:13

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:907:13
    fun createRunMonitorCreateParams() { // templates/JavaSDK/entities/testing.ts:18:13
        RunMonitorCreateParams.builder() // templates/JavaSDK/entities/params.ts:916:21 //
            // templates/JavaSDK/entities/params.ts:916:16 //
            // templates/JavaSDK/entities/params.ts:916:16
            .groups(
                listOf(
                    RunMonitorCreateParams.MonitorGroupSpec.builder()
                        .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(
                            RunMonitorCreateParams.MonitorGroupSpec.Metadata.builder()
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

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/params.ts:1011:17
    fun getBody() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            RunMonitorCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .groups(
                    listOf(
                        RunMonitorCreateParams.MonitorGroupSpec.builder()
                            .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .metadata(
                                RunMonitorCreateParams.MonitorGroupSpec.Metadata.builder()
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
                    RunMonitorCreateParams.MonitorGroupSpec
                        .builder() // templates/JavaSDK/entities/params.ts:1055:14
                        .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .metadata(
                            RunMonitorCreateParams.MonitorGroupSpec.Metadata.builder()
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
                RunMonitorCreateParams.Interval
                    .builder() // templates/JavaSDK/entities/params.ts:1055:14
                    .days(123L)
                    .hours(123L)
                    .minutes(123L)
                    .build()
            )
        assertThat(body.stride())
            .isEqualTo(
                RunMonitorCreateParams.Stride
                    .builder() // templates/JavaSDK/entities/params.ts:1055:14
                    .days(123L)
                    .hours(123L)
                    .minutes(123L)
                    .build()
            )
        assertThat(body.timezone()).isEqualTo("string")
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun getBodyWithoutOptionalFields() { // templates/JavaSDK/entities/testing.ts:18:13
        val params =
            RunMonitorCreateParams.builder() // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1043:10 //
                // templates/JavaSDK/entities/params.ts:1042:16 //
                // templates/JavaSDK/entities/params.ts:1042:16
                .groups(
                    listOf(
                        RunMonitorCreateParams.MonitorGroupSpec.builder()
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
                    RunMonitorCreateParams.MonitorGroupSpec
                        .builder() // templates/JavaSDK/entities/params.ts:1055:14
                        .session("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
            )
    }
}
