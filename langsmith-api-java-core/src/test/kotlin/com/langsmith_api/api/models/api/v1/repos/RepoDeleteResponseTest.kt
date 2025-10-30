// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoDeleteResponseTest {

    @Test
    fun create() {
        val repoDeleteResponse = RepoDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoDeleteResponse = RepoDeleteResponse.builder().build()

        val roundtrippedRepoDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(repoDeleteResponse),
                jacksonTypeRef<RepoDeleteResponse>(),
            )

        assertThat(roundtrippedRepoDeleteResponse).isEqualTo(repoDeleteResponse)
    }
}
