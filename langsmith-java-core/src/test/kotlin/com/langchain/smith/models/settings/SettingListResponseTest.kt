// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingListResponseTest {

    @Test
    fun create() {
        val settingListResponse =
            SettingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneName("data_plane_name")
                .dataPlaneRegion("data_plane_region")
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(settingListResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(settingListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(settingListResponse.displayName()).isEqualTo("display_name")
        assertThat(settingListResponse.isDeleted()).isEqualTo(true)
        assertThat(settingListResponse.isPersonal()).isEqualTo(true)
        assertThat(settingListResponse.dataPlaneName()).contains("data_plane_name")
        assertThat(settingListResponse.dataPlaneRegion()).contains("data_plane_region")
        assertThat(settingListResponse.dataPlaneUrl()).contains("data_plane_url")
        assertThat(settingListResponse.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(settingListResponse.permissions().getOrNull()).containsExactly("string")
        assertThat(settingListResponse.readOnly()).contains(true)
        assertThat(settingListResponse.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(settingListResponse.roleName()).contains("role_name")
        assertThat(settingListResponse.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val settingListResponse =
            SettingListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .dataPlaneName("data_plane_name")
                .dataPlaneRegion("data_plane_region")
                .dataPlaneUrl("data_plane_url")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addPermission("string")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .roleName("role_name")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedSettingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(settingListResponse),
                jacksonTypeRef<SettingListResponse>(),
            )

        assertThat(roundtrippedSettingListResponse).isEqualTo(settingListResponse)
    }
}
