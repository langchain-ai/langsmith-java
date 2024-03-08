// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MonitorResponseTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createMonitorResponse() { // templates/JavaSDK/entities/testing.ts:18:13
        val monitorResponse =
            MonitorResponse.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .blocks(
                    listOf(
                        MonitorResponse.MonitorBlock.builder()
                            .chartSpec(JsonValue.from(mapOf<String, Any>()))
                            .columns(listOf("string"))
                            .rows(listOf(listOf(JsonValue.from(mapOf<String, Any>()))))
                            .section("string")
                            .title("string")
                            .clickTarget("string")
                            .subtitle("string")
                            .toggleableMarks(
                                MonitorResponse.MonitorBlock.ToggleableMarks.builder().build()
                            )
                            .build()
                    )
                )
                .build()
        assertThat(monitorResponse).isNotNull
        assertThat(monitorResponse.blocks())
            .containsExactly(
                MonitorResponse.MonitorBlock
                    .builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .chartSpec(JsonValue.from(mapOf<String, Any>()))
                    .columns(listOf("string"))
                    .rows(listOf(listOf(JsonValue.from(mapOf<String, Any>()))))
                    .section("string")
                    .title("string")
                    .clickTarget("string")
                    .subtitle("string")
                    .toggleableMarks(MonitorResponse.MonitorBlock.ToggleableMarks.builder().build())
                    .build()
            )
    }
}
