// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoForkParamsTest {

    @Test
    fun create() {
        RepoForkParams.builder()
            .owner("owner")
            .repo("repo")
            .repoHandle("repo_handle")
            .description("description")
            .isPublic(true)
            .readme("readme")
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RepoForkParams.builder().owner("owner").repo("repo").repoHandle("repo_handle").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RepoForkParams.builder()
                .owner("owner")
                .repo("repo")
                .repoHandle("repo_handle")
                .description("description")
                .isPublic(true)
                .readme("readme")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.repoHandle()).isEqualTo("repo_handle")
        assertThat(body.description()).contains("description")
        assertThat(body.isPublic()).contains(true)
        assertThat(body.readme()).contains("readme")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RepoForkParams.builder().owner("owner").repo("repo").repoHandle("repo_handle").build()

        val body = params._body()

        assertThat(body.repoHandle()).isEqualTo("repo_handle")
    }
}
