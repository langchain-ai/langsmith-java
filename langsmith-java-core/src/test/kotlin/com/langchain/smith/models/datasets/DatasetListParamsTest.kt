// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListParamsTest {

    @Test
    fun create() {
        DatasetListParams.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .datatype(DataType.KV)
            .addExclude(DatasetListParams.Exclude.EXAMPLE_COUNT)
            .addExclude(DatasetListParams.Exclude.EXAMPLE_COUNT)
            .excludeCorrectionsDatasets(true)
            .limit(1L)
            .metadata("metadata")
            .name("name")
            .nameContains("name_contains")
            .offset(0L)
            .sortBy(SortByDatasetColumn.NAME)
            .sortByDesc(true)
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DatasetListParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .datatype(DataType.KV)
                .addExclude(DatasetListParams.Exclude.EXAMPLE_COUNT)
                .addExclude(DatasetListParams.Exclude.EXAMPLE_COUNT)
                .excludeCorrectionsDatasets(true)
                .limit(1L)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .offset(0L)
                .sortBy(SortByDatasetColumn.NAME)
                .sortByDesc(true)
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("data_type", "kv")
                    .put("exclude", "example_count")
                    .put("exclude", "example_count")
                    .put("exclude_corrections_datasets", "true")
                    .put("limit", "1")
                    .put("metadata", "metadata")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put("sort_by", "name")
                    .put("sort_by_desc", "true")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
