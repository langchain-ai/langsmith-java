// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.aisearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSearchParseResponseTest {

    @Test
    fun create() {
        val aiSearchParseResponse =
            AiSearchParseResponse.builder()
                .clarification(
                    AiSearchParseResponse.Clarification.builder()
                        .addOption(
                            AiSearchParseResponse.Clarification.Option.builder()
                                .filter("filter")
                                .label("label")
                                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .scope(AiSearchParseResponse.Clarification.Option.Scope.RUNS)
                                .semFilter("sem_filter")
                                .threadFilter("thread_filter")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .build()
                )
                .filter("filter")
                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scope(AiSearchParseResponse.Scope.RUNS)
                .semFilter("sem_filter")
                .threadFilter("thread_filter")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .build()

        assertThat(aiSearchParseResponse.clarification())
            .contains(
                AiSearchParseResponse.Clarification.builder()
                    .addOption(
                        AiSearchParseResponse.Clarification.Option.builder()
                            .filter("filter")
                            .label("label")
                            .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .scope(AiSearchParseResponse.Clarification.Option.Scope.RUNS)
                            .semFilter("sem_filter")
                            .threadFilter("thread_filter")
                            .traceFilter("trace_filter")
                            .treeFilter("tree_filter")
                            .build()
                    )
                    .build()
            )
        assertThat(aiSearchParseResponse.filter()).contains("filter")
        assertThat(aiSearchParseResponse.maxStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aiSearchParseResponse.minStartTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(aiSearchParseResponse.scope()).contains(AiSearchParseResponse.Scope.RUNS)
        assertThat(aiSearchParseResponse.semFilter()).contains("sem_filter")
        assertThat(aiSearchParseResponse.threadFilter()).contains("thread_filter")
        assertThat(aiSearchParseResponse.traceFilter()).contains("trace_filter")
        assertThat(aiSearchParseResponse.treeFilter()).contains("tree_filter")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiSearchParseResponse =
            AiSearchParseResponse.builder()
                .clarification(
                    AiSearchParseResponse.Clarification.builder()
                        .addOption(
                            AiSearchParseResponse.Clarification.Option.builder()
                                .filter("filter")
                                .label("label")
                                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .scope(AiSearchParseResponse.Clarification.Option.Scope.RUNS)
                                .semFilter("sem_filter")
                                .threadFilter("thread_filter")
                                .traceFilter("trace_filter")
                                .treeFilter("tree_filter")
                                .build()
                        )
                        .build()
                )
                .filter("filter")
                .maxStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .minStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .scope(AiSearchParseResponse.Scope.RUNS)
                .semFilter("sem_filter")
                .threadFilter("thread_filter")
                .traceFilter("trace_filter")
                .treeFilter("tree_filter")
                .build()

        val roundtrippedAiSearchParseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiSearchParseResponse),
                jacksonTypeRef<AiSearchParseResponse>(),
            )

        assertThat(roundtrippedAiSearchParseResponse).isEqualTo(aiSearchParseResponse)
    }
}
