// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.group

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGroupRequestTest {

    @Test
    fun create() {
        val runGroupRequest =
            RunGroupRequest.builder()
                .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .limit(1L)
                .offset(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(runGroupRequest.groupBy()).isEqualTo(RunGroupRequest.GroupBy.CONVERSATION)
        assertThat(runGroupRequest.sessionId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runGroupRequest.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runGroupRequest.filter()).contains("filter")
        assertThat(runGroupRequest.limit()).contains(1L)
        assertThat(runGroupRequest.offset()).contains(0L)
        assertThat(runGroupRequest.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val runGroupRequest =
            RunGroupRequest.builder()
                .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filter("filter")
                .limit(1L)
                .offset(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedRunGroupRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(runGroupRequest),
                jacksonTypeRef<RunGroupRequest>(),
            )

        assertThat(roundtrippedRunGroupRequest).isEqualTo(runGroupRequest)
    }
}
