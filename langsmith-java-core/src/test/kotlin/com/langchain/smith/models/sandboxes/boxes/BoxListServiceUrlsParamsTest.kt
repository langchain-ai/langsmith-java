// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes.boxes

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BoxListServiceUrlsParamsTest {

    @Test
    fun create() {
        BoxListServiceUrlsParams.builder().name("name").cursor("cursor").pageSize(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BoxListServiceUrlsParams.builder().name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("name")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            BoxListServiceUrlsParams.builder().name("name").cursor("cursor").pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("page_size", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BoxListServiceUrlsParams.builder().name("name").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
