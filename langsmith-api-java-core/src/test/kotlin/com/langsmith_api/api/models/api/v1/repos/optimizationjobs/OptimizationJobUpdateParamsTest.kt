// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptimizationJobUpdateParamsTest {

    @Test
    fun create() {
        OptimizationJobUpdateParams.builder()
            .owner("owner")
            .repo("repo")
            .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .result(
                PromptOptimizationResult.builder()
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .x(0.0)
                    .y(0.0)
                    .build()
            )
            .status(EPromptOptimizationJobStatus.CREATED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            OptimizationJobUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            OptimizationJobUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .result(
                    PromptOptimizationResult.builder()
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .x(0.0)
                        .y(0.0)
                        .build()
                )
                .status(EPromptOptimizationJobStatus.CREATED)
                .build()

        val body = params._body()

        assertThat(body.result())
            .contains(
                PromptOptimizationResult.builder()
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .x(0.0)
                    .y(0.0)
                    .build()
            )
        assertThat(body.status()).contains(EPromptOptimizationJobStatus.CREATED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            OptimizationJobUpdateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
