// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.datasets.versions

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionListParamsTest {

    @Test
    fun create() {
        VersionListParams.builder()
            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .example("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .offset(0L)
            .search("search")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VersionListParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            VersionListParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .example("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .offset(0L)
                .search("search")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("example", "182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .put("limit", "1")
                    .put("offset", "0")
                    .put("search", "search")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            VersionListParams.builder().datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
