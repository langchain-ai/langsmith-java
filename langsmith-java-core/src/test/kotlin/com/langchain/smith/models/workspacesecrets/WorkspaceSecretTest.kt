// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceSecretTest {

    @Test
    fun create() {
        val workspaceSecret =
            WorkspaceSecret.builder()
                .key("key")
                .addConfig(
                    WorkspaceSecret.Config.builder()
                        .hostPattern("host_pattern")
                        .source(WorkspaceSecret.Config.Source.DEFAULT)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .headerName("header_name")
                        .headerValueTemplate("header_value_template")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(workspaceSecret.key()).isEqualTo("key")
        assertThat(workspaceSecret.configs().getOrNull())
            .containsExactly(
                WorkspaceSecret.Config.builder()
                    .hostPattern("host_pattern")
                    .source(WorkspaceSecret.Config.Source.DEFAULT)
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .headerName("header_name")
                    .headerValueTemplate("header_value_template")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceSecret =
            WorkspaceSecret.builder()
                .key("key")
                .addConfig(
                    WorkspaceSecret.Config.builder()
                        .hostPattern("host_pattern")
                        .source(WorkspaceSecret.Config.Source.DEFAULT)
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .headerName("header_name")
                        .headerValueTemplate("header_value_template")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedWorkspaceSecret =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceSecret),
                jacksonTypeRef<WorkspaceSecret>(),
            )

        assertThat(roundtrippedWorkspaceSecret).isEqualTo(workspaceSecret)
    }
}
