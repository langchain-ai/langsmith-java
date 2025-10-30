// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgcharts.section

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsRequestBaseTest {

    @Test
    fun create() {
        val customChartsRequestBase =
            CustomChartsRequestBase.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .timezone("timezone")
                .build()

        assertThat(customChartsRequestBase.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsRequestBase.omitData()).contains(true)
        assertThat(customChartsRequestBase.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsRequestBase.stride())
            .contains(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
        assertThat(customChartsRequestBase.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsRequestBase =
            CustomChartsRequestBase.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .timezone("timezone")
                .build()

        val roundtrippedCustomChartsRequestBase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsRequestBase),
                jacksonTypeRef<CustomChartsRequestBase>(),
            )

        assertThat(roundtrippedCustomChartsRequestBase).isEqualTo(customChartsRequestBase)
    }
}
