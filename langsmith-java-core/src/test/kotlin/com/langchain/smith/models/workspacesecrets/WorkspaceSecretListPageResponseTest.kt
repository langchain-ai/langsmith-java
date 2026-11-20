// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspacesecrets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WorkspaceSecretListPageResponseTest {

    @Test
    fun create() {
        val workspaceSecretListPageResponse =
            WorkspaceSecretListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        assertThat(workspaceSecretListPageResponse.items())
            .containsExactly(
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
            )
        assertThat(workspaceSecretListPageResponse.nextCursor()).contains("next_cursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val workspaceSecretListPageResponse =
            WorkspaceSecretListPageResponse.builder()
                .addItem(
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
                )
                .nextCursor("next_cursor")
                .build()

        val roundtrippedWorkspaceSecretListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(workspaceSecretListPageResponse),
                jacksonTypeRef<WorkspaceSecretListPageResponse>(),
            )

        assertThat(roundtrippedWorkspaceSecretListPageResponse)
            .isEqualTo(workspaceSecretListPageResponse)
    }
}
