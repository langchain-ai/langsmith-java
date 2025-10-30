// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.charts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChartsRequestTest {

    @Test
    fun create() {
        val customChartsRequest =
            CustomChartsRequest.builder()
                .afterIndex(0L)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .timezone("timezone")
                .build()

        assertThat(customChartsRequest.afterIndex()).contains(0L)
        assertThat(customChartsRequest.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsRequest.omitData()).contains(true)
        assertThat(customChartsRequest.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(customChartsRequest.stride())
            .contains(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
        assertThat(customChartsRequest.tagValueId().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(customChartsRequest.timezone()).contains("timezone")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChartsRequest =
            CustomChartsRequest.builder()
                .afterIndex(0L)
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .omitData(true)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .stride(TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build())
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .timezone("timezone")
                .build()

        val roundtrippedCustomChartsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChartsRequest),
                jacksonTypeRef<CustomChartsRequest>(),
            )

        assertThat(roundtrippedCustomChartsRequest).isEqualTo(customChartsRequest)
    }
}
