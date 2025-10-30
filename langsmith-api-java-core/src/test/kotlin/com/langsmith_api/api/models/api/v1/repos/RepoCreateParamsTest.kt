// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoCreateParamsTest {

    @Test
    fun create() {
        RepoCreateParams.builder()
            .isPublic(true)
            .repoHandle("repo_handle")
            .description("description")
            .readme("readme")
            .addTag("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            RepoCreateParams.builder()
                .isPublic(true)
                .repoHandle("repo_handle")
                .description("description")
                .readme("readme")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.isPublic()).isEqualTo(true)
        assertThat(body.repoHandle()).isEqualTo("repo_handle")
        assertThat(body.description()).contains("description")
        assertThat(body.readme()).contains("readme")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RepoCreateParams.builder().isPublic(true).repoHandle("repo_handle").build()

        val body = params._body()

        assertThat(body.isPublic()).isEqualTo(true)
        assertThat(body.repoHandle()).isEqualTo("repo_handle")
    }
}
