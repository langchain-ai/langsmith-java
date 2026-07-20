// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunGetUrlParamsTest {

    @Test
    fun create() {
        RunGetUrlParams.builder()
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("project_id")
            .traceId("trace_id")
            .startTime("start_time")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunGetUrlParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("project_id")
                .traceId("trace_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RunGetUrlParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("project_id")
                .traceId("trace_id")
                .startTime("start_time")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "project_id")
                    .put("trace_id", "trace_id")
                    .put("start_time", "start_time")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunGetUrlParams.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("project_id")
                .traceId("trace_id")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "project_id")
                    .put("trace_id", "trace_id")
                    .build()
            )
    }
}
