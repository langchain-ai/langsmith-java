// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxListParamsTest {

    @Test
    fun create() {
        BoxListParams.builder()
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
            BoxListParams.builder()
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
        val params = BoxListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
