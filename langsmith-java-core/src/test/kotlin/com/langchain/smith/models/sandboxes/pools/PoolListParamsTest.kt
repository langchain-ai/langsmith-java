// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.pools

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PoolListParamsTest {

    @Test
    fun create() {
        PoolListParams.builder().limit(0L).nameContains("name_contains").offset(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            PoolListParams.builder().limit(0L).nameContains("name_contains").offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("limit", "0")
                    .put("name_contains", "name_contains")
                    .put("offset", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PoolListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
