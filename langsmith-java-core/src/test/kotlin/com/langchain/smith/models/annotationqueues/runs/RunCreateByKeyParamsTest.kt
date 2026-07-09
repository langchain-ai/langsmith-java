// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.annotationqueues.runs

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunCreateByKeyParamsTest {

    @Test
    fun create() {
        RunCreateByKeyParams.builder()
            .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .extendTraceRetention(true)
            .addBody(
                RunCreateByKeyParams.Body.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunCreateByKeyParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    RunCreateByKeyParams.Body.builder()
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunCreateByKeyParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extendTraceRetention(true)
                .addBody(
                    RunCreateByKeyParams.Body.builder()
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("extend_trace_retention", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunCreateByKeyParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    RunCreateByKeyParams.Body.builder()
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            RunCreateByKeyParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extendTraceRetention(true)
                .addBody(
                    RunCreateByKeyParams.Body.builder()
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                RunCreateByKeyParams.Body.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .sourceProposedExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RunCreateByKeyParams.builder()
                .queueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addBody(
                    RunCreateByKeyParams.Body.builder()
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .containsExactly(
                RunCreateByKeyParams.Body.builder()
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
