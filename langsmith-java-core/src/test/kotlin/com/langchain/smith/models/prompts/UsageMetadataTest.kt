// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.prompts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageMetadataTest {

    @Test
    fun create() {
        val usageMetadata =
            UsageMetadata.builder()
                .inputTokens(0L)
                .outputTokens(0L)
                .totalTokens(0L)
                .inputTokenDetails(
                    UsageMetadata.InputTokenDetails.builder()
                        .audio(0L)
                        .cacheCreation(0L)
                        .cacheRead(0L)
                        .build()
                )
                .outputTokenDetails(
                    UsageMetadata.OutputTokenDetails.builder().audio(0L).reasoning(0L).build()
                )
                .build()

        assertThat(usageMetadata.inputTokens()).isEqualTo(0L)
        assertThat(usageMetadata.outputTokens()).isEqualTo(0L)
        assertThat(usageMetadata.totalTokens()).isEqualTo(0L)
        assertThat(usageMetadata.inputTokenDetails())
            .contains(
                UsageMetadata.InputTokenDetails.builder()
                    .audio(0L)
                    .cacheCreation(0L)
                    .cacheRead(0L)
                    .build()
            )
        assertThat(usageMetadata.outputTokenDetails())
            .contains(UsageMetadata.OutputTokenDetails.builder().audio(0L).reasoning(0L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageMetadata =
            UsageMetadata.builder()
                .inputTokens(0L)
                .outputTokens(0L)
                .totalTokens(0L)
                .inputTokenDetails(
                    UsageMetadata.InputTokenDetails.builder()
                        .audio(0L)
                        .cacheCreation(0L)
                        .cacheRead(0L)
                        .build()
                )
                .outputTokenDetails(
                    UsageMetadata.OutputTokenDetails.builder().audio(0L).reasoning(0L).build()
                )
                .build()

        val roundtrippedUsageMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageMetadata),
                jacksonTypeRef<UsageMetadata>(),
            )

        assertThat(roundtrippedUsageMetadata).isEqualTo(usageMetadata)
    }
}
