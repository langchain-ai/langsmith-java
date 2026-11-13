// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceSecretUpsertParamsTest {

    @Test
    fun create() {
        WorkspaceSecretUpsertParams.builder()
            .key("key")
            .addConfig(
                WorkspaceSecretUpsertParams.Config.builder()
                    .hostPattern("host_pattern")
                    .headerName("header_name")
                    .headerValueTemplate("header_value_template")
                    .build()
            )
            .value("x")
            .build()
    }

    @Test
    fun pathParams() {
        val params = WorkspaceSecretUpsertParams.builder().key("key").build()

        assertThat(params._pathParam(0)).isEqualTo("key")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            WorkspaceSecretUpsertParams.builder()
                .key("key")
                .addConfig(
                    WorkspaceSecretUpsertParams.Config.builder()
                        .hostPattern("host_pattern")
                        .headerName("header_name")
                        .headerValueTemplate("header_value_template")
                        .build()
                )
                .value("x")
                .build()

        val body = params._body()

        assertThat(body.configs().getOrNull())
            .containsExactly(
                WorkspaceSecretUpsertParams.Config.builder()
                    .hostPattern("host_pattern")
                    .headerName("header_name")
                    .headerValueTemplate("header_value_template")
                    .build()
            )
        assertThat(body.value()).contains("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = WorkspaceSecretUpsertParams.builder().key("key").build()

        val body = params._body()
    }
}
