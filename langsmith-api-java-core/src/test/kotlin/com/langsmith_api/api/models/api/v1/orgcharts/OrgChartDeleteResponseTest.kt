// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgcharts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgChartDeleteResponseTest {

    @Test
    fun create() {
        val orgChartDeleteResponse = OrgChartDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val orgChartDeleteResponse = OrgChartDeleteResponse.builder().build()

        val roundtrippedOrgChartDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orgChartDeleteResponse),
                jacksonTypeRef<OrgChartDeleteResponse>(),
            )

        assertThat(roundtrippedOrgChartDeleteResponse).isEqualTo(orgChartDeleteResponse)
    }
}
