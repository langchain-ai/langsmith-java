// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.public_.datasets

import com.langsmith_api.api.core.http.QueryParams
import com.langsmith_api.api.models.api.v1.datasets.comparative.SortByComparativeExperimentColumn
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetRetrieveComparativeParamsTest {

    @Test
    fun create() {
        DatasetRetrieveComparativeParams.builder()
            .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .name("name")
            .nameContains("name_contains")
            .offset(0L)
            .sortBy(SortByComparativeExperimentColumn.NAME)
            .sortByDesc(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DatasetRetrieveComparativeParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DatasetRetrieveComparativeParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .name("name")
                .nameContains("name_contains")
                .offset(0L)
                .sortBy(SortByComparativeExperimentColumn.NAME)
                .sortByDesc(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "1")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put("sort_by", "name")
                    .put("sort_by_desc", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DatasetRetrieveComparativeParams.builder()
                .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
