// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleCustomChartResponseBaseTest {

    @Test
    fun create() {
        val singleCustomChartResponseBase =
            SingleCustomChartResponseBase.builder()
                .addData(
                    CustomChartsDataPoint.builder()
                        .seriesId("series_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .group("group")
                        .build()
                )
                .build()

        assertThat(singleCustomChartResponseBase.data())
            .containsExactly(
                CustomChartsDataPoint.builder()
                    .seriesId("series_id")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .value(0.0)
                    .group("group")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val singleCustomChartResponseBase =
            SingleCustomChartResponseBase.builder()
                .addData(
                    CustomChartsDataPoint.builder()
                        .seriesId("series_id")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .value(0.0)
                        .group("group")
                        .build()
                )
                .build()

        val roundtrippedSingleCustomChartResponseBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(singleCustomChartResponseBase),
                jacksonTypeRef<SingleCustomChartResponseBase>(),
            )

        assertThat(roundtrippedSingleCustomChartResponseBase)
            .isEqualTo(singleCustomChartResponseBase)
    }
}
