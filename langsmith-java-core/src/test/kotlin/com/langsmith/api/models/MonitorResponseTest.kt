// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MonitorResponseTest {

    @Test
    fun createMonitorResponse() {
        val monitorResponse =
            MonitorResponse.builder()
                .blocks(
                    listOf(
                        MonitorResponse.Block.builder()
                            .chartSpec(JsonValue.from(mapOf<String, Any>()))
                            .columns(listOf("string"))
                            .rows(listOf(listOf(JsonValue.from(mapOf<String, Any>()))))
                            .section("string")
                            .title("string")
                            .clickTarget("string")
                            .subtitle("string")
                            .toggleableMarks(
                                MonitorResponse.Block.ToggleableMarks.builder().build()
                            )
                            .build()
                    )
                )
                .build()
        assertThat(monitorResponse).isNotNull
        assertThat(monitorResponse.blocks())
            .containsExactly(
                MonitorResponse.Block.builder()
                    .chartSpec(JsonValue.from(mapOf<String, Any>()))
                    .columns(listOf("string"))
                    .rows(listOf(listOf(JsonValue.from(mapOf<String, Any>()))))
                    .section("string")
                    .title("string")
                    .clickTarget("string")
                    .subtitle("string")
                    .toggleableMarks(MonitorResponse.Block.ToggleableMarks.builder().build())
                    .build()
            )
    }
}
