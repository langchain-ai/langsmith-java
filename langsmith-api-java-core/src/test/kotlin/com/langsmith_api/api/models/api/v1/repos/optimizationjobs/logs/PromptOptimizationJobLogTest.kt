// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptOptimizationJobLogTest {

    @Test
    fun create() {
        val promptOptimizationJobLog =
            PromptOptimizationJobLog.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .logType(EPromptOptimizationJobLogType.INFO)
                .message("message")
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(promptOptimizationJobLog.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptOptimizationJobLog.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptOptimizationJobLog.jobId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(promptOptimizationJobLog.logType()).isEqualTo(EPromptOptimizationJobLogType.INFO)
        assertThat(promptOptimizationJobLog.message()).isEqualTo("message")
        assertThat(promptOptimizationJobLog._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptOptimizationJobLog =
            PromptOptimizationJobLog.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .logType(EPromptOptimizationJobLogType.INFO)
                .message("message")
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedPromptOptimizationJobLog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptOptimizationJobLog),
                jacksonTypeRef<PromptOptimizationJobLog>(),
            )

        assertThat(roundtrippedPromptOptimizationJobLog).isEqualTo(promptOptimizationJobLog)
    }
}
