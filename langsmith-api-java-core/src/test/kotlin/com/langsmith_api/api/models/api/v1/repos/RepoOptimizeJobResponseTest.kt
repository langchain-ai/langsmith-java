// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RepoOptimizeJobResponseTest {

    @Test
    fun create() {
        val repoOptimizeJobResponse =
            RepoOptimizeJobResponse.builder()
                .optimizationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(repoOptimizeJobResponse.optimizationJobId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val repoOptimizeJobResponse =
            RepoOptimizeJobResponse.builder()
                .optimizationJobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedRepoOptimizeJobResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(repoOptimizeJobResponse),
                jacksonTypeRef<RepoOptimizeJobResponse>(),
            )

        assertThat(roundtrippedRepoOptimizeJobResponse).isEqualTo(repoOptimizeJobResponse)
    }
}
