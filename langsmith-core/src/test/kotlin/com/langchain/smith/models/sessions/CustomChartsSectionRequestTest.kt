// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsSectionRequestTest {

    @Test
    fun create() {
        val customChartsSectionRequest =
            CustomChartsSectionRequest.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .timezone("timezone")
                .build()

        assertThat(customChartsSectionRequest.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsSectionRequest.groupBy())
            .contains(
                RunStatsGroupBy.builder()
                    .attribute(RunStatsGroupBy.Attribute.NAME)
                    .maxGroups(0L)
                    .path("path")
                    .build()
            )
        assertThat(customChartsSectionRequest.omitData()).contains(true)
        assertThat(customChartsSectionRequest.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsSectionRequest.stride())
            .contains(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
        assertThat(customChartsSectionRequest.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsSectionRequest =
            CustomChartsSectionRequest.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .groupBy(
                    RunStatsGroupBy.builder()
                        .attribute(RunStatsGroupBy.Attribute.NAME)
                        .maxGroups(0L)
                        .path("path")
                        .build()
                )
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .timezone("timezone")
                .build()

        val roundtrippedCustomChartsSectionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsSectionRequest),
                jacksonTypeRef<CustomChartsSectionRequest>(),
            )

        assertThat(roundtrippedCustomChartsSectionRequest).isEqualTo(customChartsSectionRequest)
    }
}
