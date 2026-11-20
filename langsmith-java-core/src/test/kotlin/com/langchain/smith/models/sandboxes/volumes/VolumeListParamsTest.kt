// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.volumes

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VolumeListParamsTest {

    @Test
    fun create() {
        VolumeListParams.builder()
            .cursor("cursor")
            .nameContains("name_contains")
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VolumeListParams.builder()
                .cursor("cursor")
                .nameContains("name_contains")
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("name_contains", "name_contains")
                    .put("page_size", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VolumeListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
