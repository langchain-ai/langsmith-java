// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.runs.rules

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RuleListParamsTest {

    @Test
    fun create() {
        RuleListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .nameContains("name_contains")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(RuleListParams.Type.SESSION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RuleListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .nameContains("name_contains")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(RuleListParams.Type.SESSION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("dataset_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("name_contains", "name_contains")
                    .put("session_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("type", "session")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RuleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
