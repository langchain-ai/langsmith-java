// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgcharts

import com.langsmith_api.api.models.api.v1.charts.CustomChartsRequest
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgChartOrgChartsParamsTest {

    @Test
    fun create() {
        OrgChartOrgChartsParams.builder()
            .customChartsRequest(
                CustomChartsRequest.builder()
                    .afterIndex(0L)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timezone("timezone")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            OrgChartOrgChartsParams.builder()
                .customChartsRequest(
                    CustomChartsRequest.builder()
                        .afterIndex(0L)
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .omitData(true)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                        .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartsRequest.builder()
                    .afterIndex(0L)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OrgChartOrgChartsParams.builder()
                .customChartsRequest(CustomChartsRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CustomChartsRequest.builder().build())
    }
}
