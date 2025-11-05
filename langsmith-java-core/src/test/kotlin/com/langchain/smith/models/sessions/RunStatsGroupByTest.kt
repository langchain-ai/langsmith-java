// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunStatsGroupByTest {

    @Test
    fun create() {
        val runStatsGroupBy =
            RunStatsGroupBy.builder()
                .attribute(RunStatsGroupBy.Attribute.NAME)
                .maxGroups(0L)
                .path("path")
                .build()

        assertThat(runStatsGroupBy.attribute()).isEqualTo(RunStatsGroupBy.Attribute.NAME)
        assertThat(runStatsGroupBy.maxGroups()).contains(0L)
        assertThat(runStatsGroupBy.path()).contains("path")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runStatsGroupBy =
            RunStatsGroupBy.builder()
                .attribute(RunStatsGroupBy.Attribute.NAME)
                .maxGroups(0L)
                .path("path")
                .build()

        val roundtrippedRunStatsGroupBy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runStatsGroupBy),
                jacksonTypeRef<RunStatsGroupBy>(),
            )

        assertThat(roundtrippedRunStatsGroupBy).isEqualTo(runStatsGroupBy)
    }
}
