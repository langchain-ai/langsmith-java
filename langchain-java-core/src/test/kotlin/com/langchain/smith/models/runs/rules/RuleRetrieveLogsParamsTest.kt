// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.runs.rules

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleRetrieveLogsParamsTest {

    @Test
    fun create() {
        RuleRetrieveLogsParams.builder()
            .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(100L)
            .offset(0L)
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RuleRetrieveLogsParams.builder().ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RuleRetrieveLogsParams.builder()
                .ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(100L)
                .offset(0L)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("end_time", "2019-12-27T18:11:19.117Z")
                    .put("limit", "100")
                    .put("offset", "0")
                    .put("start_time", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RuleRetrieveLogsParams.builder().ruleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
