// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogCreateParamsTest {

    @Test
    fun create() {
        LogCreateParams.builder()
            .owner("owner")
            .repo("repo")
            .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .logType(EPromptOptimizationJobLogType.INFO)
            .message("message")
            .data(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            LogCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .logType(EPromptOptimizationJobLogType.INFO)
                .message("message")
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
            LogCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .logType(EPromptOptimizationJobLogType.INFO)
                .message("message")
                .data(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.logType()).isEqualTo(EPromptOptimizationJobLogType.INFO)
        assertThat(body.message()).isEqualTo("message")
        assertThat(body._data()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            LogCreateParams.builder()
                .owner("owner")
                .repo("repo")
                .jobId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .logType(EPromptOptimizationJobLogType.INFO)
                .message("message")
                .build()

        val body = params._body()

        assertThat(body.logType()).isEqualTo(EPromptOptimizationJobLogType.INFO)
        assertThat(body.message()).isEqualTo("message")
    }
}
