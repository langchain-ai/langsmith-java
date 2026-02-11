// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.commits

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommitRetrieveParamsTest {

    @Test
    fun create() {
        CommitRetrieveParams.builder()
            .owner("owner")
            .repo("repo")
            .commit("commit")
            .getExamples(true)
            .includeModel(true)
            .isView(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CommitRetrieveParams.builder().owner("owner").repo("repo").commit("commit").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("commit")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CommitRetrieveParams.builder()
                .owner("owner")
                .repo("repo")
                .commit("commit")
                .getExamples(true)
                .includeModel(true)
                .isView(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("get_examples", "true")
                    .put("include_model", "true")
                    .put("is_view", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CommitRetrieveParams.builder().owner("owner").repo("repo").commit("commit").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
