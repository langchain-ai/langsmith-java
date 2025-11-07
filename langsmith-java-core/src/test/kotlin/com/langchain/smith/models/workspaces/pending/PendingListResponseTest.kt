// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.pending

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PendingListResponseTest {

    @Test
    fun create() {
        val pendingListResponse =
            PendingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(pendingListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pendingListResponse.displayName()).isEqualTo("display_name")
        assertThat(pendingListResponse.isDeleted()).isEqualTo(true)
        assertThat(pendingListResponse.isPersonal()).isEqualTo(true)
        assertThat(pendingListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(pendingListResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pendingListResponse =
            PendingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedPendingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pendingListResponse),
                jacksonTypeRef<PendingListResponse>(),
            )

        assertThat(roundtrippedPendingListResponse).isEqualTo(pendingListResponse)
    }
}
