// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryListParamsTest {

    @Test
    fun create() {
        DirectoryListParams.builder().owner("owner").repo("repo").commit("commit").build()
    }

    @Test
    fun pathParams() {
        val params = DirectoryListParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DirectoryListParams.builder().owner("owner").repo("repo").commit("commit").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("commit", "commit").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DirectoryListParams.builder().owner("owner").repo("repo").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
