// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.repos

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoUpdateParamsTest {

    @Test
    fun create() {
        RepoUpdateParams.builder()
            .owner("owner")
            .repo("repo")
            .description("description")
            .isArchived(true)
            .isPublic(true)
            .readme("readme")
            .addTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RepoUpdateParams.builder().owner("owner").repo("repo").build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RepoUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .description("description")
                .isArchived(true)
                .isPublic(true)
                .readme("readme")
                .addTag("string")
                .build()

        val body = params._body()

        assertThat(body.description()).contains("description")
        assertThat(body.isArchived()).contains(true)
        assertThat(body.isPublic()).contains(true)
        assertThat(body.readme()).contains("readme")
        assertThat(body.tags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RepoUpdateParams.builder().owner("owner").repo("repo").build()

        val body = params._body()
    }
}
