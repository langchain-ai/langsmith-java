// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatasetListV2ParamsTest {

    @Test
    fun create() {
        DatasetListV2Params.builder()
            .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .cursor("cursor")
            .addDataType(DataType.KV)
            .addExclude(DatasetListV2Params.Exclude.EXAMPLE_COUNT)
            .excludeCorrectionsDatasets(true)
            .metadata("metadata")
            .name("name")
            .nameContains("name_contains")
            .pageSize(1L)
            .sortBy(SortByDatasetColumn.NAME)
            .sortOrder(DatasetListV2Params.SortOrder.ASC)
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DatasetListV2Params.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .cursor("cursor")
                .addDataType(DataType.KV)
                .addExclude(DatasetListV2Params.Exclude.EXAMPLE_COUNT)
                .excludeCorrectionsDatasets(true)
                .metadata("metadata")
                .name("name")
                .nameContains("name_contains")
                .pageSize(1L)
                .sortBy(SortByDatasetColumn.NAME)
                .sortOrder(DatasetListV2Params.SortOrder.ASC)
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("cursor", "cursor")
                    .put("data_type", "kv")
                    .put("exclude", "example_count")
                    .put("exclude_corrections_datasets", "true")
                    .put("metadata", "metadata")
                    .put("name", "name")
                    .put("name_contains", "name_contains")
                    .put("page_size", "1")
                    .put("sort_by", "name")
                    .put("sort_order", "asc")
                    .put("tag_value_id", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DatasetListV2Params.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
