// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChartDeleteResponseTest {

    @Test
    fun create() {
        val chartDeleteResponse = ChartDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chartDeleteResponse = ChartDeleteResponse.builder().build()

        val roundtrippedChartDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chartDeleteResponse),
                jacksonTypeRef<ChartDeleteResponse>(),
            )

        assertThat(roundtrippedChartDeleteResponse).isEqualTo(chartDeleteResponse)
    }
}
