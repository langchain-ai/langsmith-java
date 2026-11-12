// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.evaluators

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EvaluatorListV2ParamsTest {

    @Test
    fun create() {
        EvaluatorListV2Params.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .includeBackfillProgress(true)
            .nameContains("name_contains")
            .pageSize(1L)
            .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .type(EvaluatorListV2Params.Type.PROJECT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            EvaluatorListV2Params.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .includeBackfillProgress(true)
                .nameContains("name_contains")
                .pageSize(1L)
                .projectId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .type(EvaluatorListV2Params.Type.PROJECT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("cursor", "cursor")
                    .put("dataset_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("evaluator_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("include_backfill_progress", "true")
                    .put("name_contains", "name_contains")
                    .put("page_size", "1")
                    .put("project_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("type", "PROJECT")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EvaluatorListV2Params.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
