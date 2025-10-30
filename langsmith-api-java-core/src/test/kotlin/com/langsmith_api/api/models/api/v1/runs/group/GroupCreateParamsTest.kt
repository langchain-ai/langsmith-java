// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.group

import com.langsmith_api.api.core.http.Headers
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GroupCreateParamsTest {

    @Test
    fun create() {
        GroupCreateParams.builder()
            .accept("accept")
            .runGroupRequest(
                RunGroupRequest.builder()
                    .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .limit(1L)
                    .offset(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            GroupCreateParams.builder()
                .accept("accept")
                .runGroupRequest(
                    RunGroupRequest.builder()
                        .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filter("filter")
                        .limit(1L)
                        .offset(0L)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("accept", "accept").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            GroupCreateParams.builder()
                .runGroupRequest(
                    RunGroupRequest.builder()
                        .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            GroupCreateParams.builder()
                .accept("accept")
                .runGroupRequest(
                    RunGroupRequest.builder()
                        .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .filter("filter")
                        .limit(1L)
                        .offset(0L)
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RunGroupRequest.builder()
                    .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .limit(1L)
                    .offset(0L)
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GroupCreateParams.builder()
                .runGroupRequest(
                    RunGroupRequest.builder()
                        .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                RunGroupRequest.builder()
                    .groupBy(RunGroupRequest.GroupBy.CONVERSATION)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
