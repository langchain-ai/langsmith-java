// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

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
            .repoType(RepoCreateParams.RepoType.PROMPT)
            .restrictedMode(true)
            .source(RepoCreateParams.Source.INTERNAL)
            .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .repoType(RepoCreateParams.RepoType.PROMPT)
                .restrictedMode(true)
                .source(RepoCreateParams.Source.INTERNAL)
                .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.isPublic()).isEqualTo(true)
        assertThat(body.repoHandle()).isEqualTo("repo_handle")
        assertThat(body.description()).contains("description")
        assertThat(body.readme()).contains("readme")
        assertThat(body.repoType()).contains(RepoCreateParams.RepoType.PROMPT)
        assertThat(body.restrictedMode()).contains(true)
        assertThat(body.source()).contains(RepoCreateParams.Source.INTERNAL)
        assertThat(body.tagValueIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
