// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs

import com.langchain.smith.core.http.Headers
import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RunRetrieveV2ParamsTest {

    @Test
    fun create() {
        RunRetrieveV2Params.builder()
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .addSelect(RunRetrieveV2Params.Select.ID)
            .accept("Accept")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RunRetrieveV2Params.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            RunRetrieveV2Params.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSelect(RunRetrieveV2Params.Select.ID)
                .accept("Accept")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Accept", "Accept").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            RunRetrieveV2Params.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            RunRetrieveV2Params.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addSelect(RunRetrieveV2Params.Select.ID)
                .accept("Accept")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .put("selects", "ID")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RunRetrieveV2Params.builder()
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
