// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorListParamsTest {

    @Test
    fun create() {
        EvaluatorListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeBackfillProgress(true)
            .nameContains("name_contains")
            .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(EvaluatorListParams.Type.SESSION)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EvaluatorListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeBackfillProgress(true)
                .nameContains("name_contains")
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(EvaluatorListParams.Type.SESSION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("dataset_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("evaluator_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("include_backfill_progress", "true")
                    .put("name_contains", "name_contains")
                    .put("session_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("type", "session")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EvaluatorListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
