// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgcharts.section

import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SectionRetrieveParamsTest {

    @Test
    fun create() {
        SectionRetrieveParams.builder()
            .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .customChartsRequestBase(
                CustomChartsRequestBase.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .timezone("timezone")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SectionRetrieveParams.builder()
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartsRequestBase(CustomChartsRequestBase.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SectionRetrieveParams.builder()
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartsRequestBase(
                    CustomChartsRequestBase.builder()
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .omitData(true)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                        .timezone("timezone")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CustomChartsRequestBase.builder()
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .omitData(true)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                    .timezone("timezone")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SectionRetrieveParams.builder()
                .sectionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customChartsRequestBase(CustomChartsRequestBase.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(CustomChartsRequestBase.builder().build())
    }
}
