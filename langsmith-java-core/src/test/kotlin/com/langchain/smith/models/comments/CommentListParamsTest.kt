// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.comments

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentListParamsTest {

    @Test
    fun create() {
        CommentListParams.builder().owner("owner").repo("repo").limit(1L).offset(0L).build()
    }

    @Test
    fun pathParams() {
        val params = CommentListParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommentListParams.builder().owner("owner").repo("repo").limit(1L).offset(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "1").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CommentListParams.builder().owner("owner").repo("repo").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
