// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.playgroundexperiment

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunnableConfigTest {

    @Test
    fun create() {
        val runnableConfig =
            RunnableConfig.builder()
                .callbacksOfJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
                .configurable(
                    RunnableConfig.Configurable.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxConcurrency(0L)
                .metadata(
                    RunnableConfig.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .recursionLimit(0L)
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runName("run_name")
                .addTag("string")
                .build()

        assertThat(runnableConfig.callbacks())
            .contains(
                RunnableConfig.Callbacks.ofJsonValues(listOf(JsonValue.from(mapOf<String, Any>())))
            )
        assertThat(runnableConfig.configurable())
            .contains(
                RunnableConfig.Configurable.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(runnableConfig.maxConcurrency()).contains(0L)
        assertThat(runnableConfig.metadata())
            .contains(
                RunnableConfig.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
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
                .configurable(
                    RunnableConfig.Configurable.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .maxConcurrency(0L)
                .metadata(
                    RunnableConfig.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
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
