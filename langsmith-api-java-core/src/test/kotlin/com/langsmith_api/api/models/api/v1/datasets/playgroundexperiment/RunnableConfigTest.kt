// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets.playgroundexperiment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunnableConfigTest {

    @Test
    fun create() {
        val runnableConfig =
            RunnableConfig.builder()
                .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                .configurable(JsonValue.from(mapOf<String, Any>()))
                .maxConcurrency(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .recursionLimit(0L)
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runName("run_name")
                .addTag("string")
                .build()

        assertThat(runnableConfig.callbacks())
            .contains(
                RunnableConfig.Callbacks.ofJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
            )
        assertThat(runnableConfig._configurable()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runnableConfig.maxConcurrency()).contains(0L)
        assertThat(runnableConfig._metadata()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runnableConfig.recursionLimit()).contains(0L)
        assertThat(runnableConfig.runId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runnableConfig.runName()).contains("run_name")
        assertThat(runnableConfig.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runnableConfig =
            RunnableConfig.builder()
                .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                .configurable(JsonValue.from(mapOf<String, Any>()))
                .maxConcurrency(0L)
                .metadata(JsonValue.from(mapOf<String, Any>()))
                .recursionLimit(0L)
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runName("run_name")
                .addTag("string")
                .build()

        val roundtrippedRunnableConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runnableConfig),
                jacksonTypeRef<RunnableConfig>(),
            )

        assertThat(roundtrippedRunnableConfig).isEqualTo(runnableConfig)
    }
}
