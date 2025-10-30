// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.datasets

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListParamsTest {

    @Test
    fun create() {
        DatasetListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .dataTypeOfTypes(listOf(DataType.KV))
            .excludeCorrectionsDatasets(true)
            .limit(1L)
            .metadata("metadata")
            .name("name")
            .nameContains("name_contains")
            .offset(0L)
            .sortBy(SortByDatasetColumn.NAME)
            .sortByDesc(true)
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DatasetListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dataTypeOfTypes(listOf(DataType.KV))
                .excludeCorrectionsDatasets(true)
                .limit(1L)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .offset(0L)
                .sortBy(SortByDatasetColumn.NAME)
                .sortByDesc(true)
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","))
                    .put("data_type", listOf("kv").joinToString(","))
                    .put("exclude_corrections_datasets", "true")
                    .put("limit", "1")
                    .put("metadata", "metadata")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put("sort_by", "name")
                    .put("sort_by_desc", "true")
                    .put(
                        "tag_value_id",
                        listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").joinToString(","),
                    )
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DatasetListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
