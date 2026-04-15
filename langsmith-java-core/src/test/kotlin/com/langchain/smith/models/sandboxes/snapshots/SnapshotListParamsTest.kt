// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.snapshots

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SnapshotListParamsTest {

    @Test
    fun create() {
        SnapshotListParams.builder()
            .limit(0L)
            .nameContains("name_contains")
            .offset(0L)
            .sortBy("sort_by")
            .sortDirection("sort_direction")
            .status("status")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SnapshotListParams.builder()
                .limit(0L)
                .nameContains("name_contains")
                .offset(0L)
                .sortBy("sort_by")
                .sortDirection("sort_direction")
                .status("status")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .put("sort_by", "sort_by")
                    .put("sort_direction", "sort_direction")
                    .put("status", "status")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SnapshotListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
