// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogRetrieveParamsTest {

    @Test
    fun create() {
        LogRetrieveParams.builder()
            .owner("owner")
            .repo("repo")
            .jobId("job_id")
            .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LogRetrieveParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("job_id")
                .logId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("owner")
        assertThat(params._pathParam(1)).isEqualTo("repo")
        assertThat(params._pathParam(2)).isEqualTo("job_id")
        assertThat(params._pathParam(3)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(4)).isEqualTo("")
    }
}
