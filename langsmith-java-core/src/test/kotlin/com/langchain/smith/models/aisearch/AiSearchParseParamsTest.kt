// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.aisearch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSearchParseParamsTest {

    @Test
    fun create() {
        AiSearchParseParams.builder()
            .aiSearch("threads where the agent did not complete the task and spent more than \$1")
            .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
            .allowClarification(true)
            .scope(AiSearchParseParams.Scope.RUNS)
            .build()
    }

    @Test
    fun body() {
        val params =
            AiSearchParseParams.builder()
                .aiSearch(
                    "threads where the agent did not complete the task and spent more than \$1"
                )
                .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .allowClarification(true)
                .scope(AiSearchParseParams.Scope.RUNS)
                .build()

        val body = params._body()

        assertThat(body.aiSearch())
            .isEqualTo("threads where the agent did not complete the task and spent more than \$1")
        assertThat(body.projectIds()).containsExactly("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
        assertThat(body.allowClarification()).contains(true)
        assertThat(body.scope()).contains(AiSearchParseParams.Scope.RUNS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AiSearchParseParams.builder()
                .aiSearch(
                    "threads where the agent did not complete the task and spent more than \$1"
                )
                .addProjectId("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
                .build()

        val body = params._body()

        assertThat(body.aiSearch())
            .isEqualTo("threads where the agent did not complete the task and spent more than \$1")
        assertThat(body.projectIds()).containsExactly("018e4c7e-a9fb-7ef0-a5b6-6ea3a82e9327")
    }
}
