// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.shared

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SharedListResponseTest {

    @Test
    fun create() {
        val sharedListResponse =
            SharedListResponse.builder()
                .addEntity(
                    SharedListResponse.Entity.Run.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .shareToken("share_token")
                        .runName("run_name")
                        .runType("run_type")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionName("session_name")
                        .build()
                )
                .build()

        assertThat(sharedListResponse.entities())
            .containsExactly(
                SharedListResponse.Entity.ofRun(
                    SharedListResponse.Entity.Run.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .shareToken("share_token")
                        .runName("run_name")
                        .runType("run_type")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionName("session_name")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sharedListResponse =
            SharedListResponse.builder()
                .addEntity(
                    SharedListResponse.Entity.Run.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .shareToken("share_token")
                        .runName("run_name")
                        .runType("run_type")
                        .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sessionName("session_name")
                        .build()
                )
                .build()

        val roundtrippedSharedListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sharedListResponse),
                jacksonTypeRef<SharedListResponse>(),
            )

        assertThat(roundtrippedSharedListResponse).isEqualTo(sharedListResponse)
    }
}
