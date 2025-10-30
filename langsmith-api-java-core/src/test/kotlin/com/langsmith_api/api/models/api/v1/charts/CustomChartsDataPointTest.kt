// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsDataPointTest {

    @Test
    fun create() {
        val customChartsDataPoint =
            CustomChartsDataPoint.builder()
                .seriesId("series_id")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .group("group")
                .build()

        assertThat(customChartsDataPoint.seriesId()).isEqualTo("series_id")
        assertThat(customChartsDataPoint.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsDataPoint.value())
            .contains(CustomChartsDataPoint.Value.ofNumber(0.0))
        assertThat(customChartsDataPoint.group()).contains("group")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsDataPoint =
            CustomChartsDataPoint.builder()
                .seriesId("series_id")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .value(0.0)
                .group("group")
                .build()

        val roundtrippedCustomChartsDataPoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsDataPoint),
                jacksonTypeRef<CustomChartsDataPoint>(),
            )

        assertThat(roundtrippedCustomChartsDataPoint).isEqualTo(customChartsDataPoint)
    }
}
