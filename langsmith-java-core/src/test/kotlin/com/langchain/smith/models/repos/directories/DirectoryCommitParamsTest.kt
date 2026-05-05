// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos.directories

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectoryCommitParamsTest {

    @Test
    fun create() {
        DirectoryCommitParams.builder()
            .owner("owner")
            .repo("repo")
            .files(
                DirectoryCommitParams.Files.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .parentCommit("parent_commit")
            .build()
    }

    @Test
    fun pathParams() {
        val params = DirectoryCommitParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DirectoryCommitParams.builder()
                .owner("owner")
                .repo("repo")
                .files(
                    DirectoryCommitParams.Files.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parentCommit("parent_commit")
                .build()

        val body = params._body()

        assertThat(body.files())
            .contains(
                DirectoryCommitParams.Files.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.parentCommit()).contains("parent_commit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DirectoryCommitParams.builder().owner("owner").repo("repo").build()

        val body = params._body()
    }
}
