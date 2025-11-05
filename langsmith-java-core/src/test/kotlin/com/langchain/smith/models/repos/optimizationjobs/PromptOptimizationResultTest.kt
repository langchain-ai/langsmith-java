// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.optimizationjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptOptimizationResultTest {

    @Test
    fun create() {
        val promptOptimizationResult =
            PromptOptimizationResult.builder()
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .x(0.0)
                .y(0.0)
                .build()

        assertThat(promptOptimizationResult.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(promptOptimizationResult.x()).isEqualTo(0.0)
        assertThat(promptOptimizationResult.y()).isEqualTo(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val promptOptimizationResult =
            PromptOptimizationResult.builder()
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .x(0.0)
                .y(0.0)
                .build()

        val roundtrippedPromptOptimizationResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(promptOptimizationResult),
                jacksonTypeRef<PromptOptimizationResult>(),
            )

        assertThat(roundtrippedPromptOptimizationResult).isEqualTo(promptOptimizationResult)
    }
}
