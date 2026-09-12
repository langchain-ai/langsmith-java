// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryDeleteParamsTest {

    @Test
    fun create() {
        DirectoryDeleteParams.builder()
            .owner("owner")
            .repo("repo")
            .repoType(DirectoryDeleteParams.RepoType.AGENT)
            .build()
    }

    @Test
    fun pathParams() {
        val params = DirectoryDeleteParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DirectoryDeleteParams.builder()
                .owner("owner")
                .repo("repo")
                .repoType(DirectoryDeleteParams.RepoType.AGENT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("repo_type", "agent").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DirectoryDeleteParams.builder().owner("owner").repo("repo").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
