// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.comments

import com.langsmith_api.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommentRetrieveParamsTest {

    @Test
    fun create() {
        CommentRetrieveParams.builder()
            .owner("owner")
            .repo("repo")
            .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .limit(1L)
            .offset(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommentRetrieveParams.builder()
                .owner("owner")
                .repo("repo")
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommentRetrieveParams.builder()
                .owner("owner")
                .repo("repo")
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .limit(1L)
                .offset(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("limit", "1").put("offset", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommentRetrieveParams.builder()
                .owner("owner")
                .repo("repo")
                .parentCommentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
