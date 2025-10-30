// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppHubCrudTenantsTenantTest {

    @Test
    fun create() {
        val appHubCrudTenantsTenant =
            AppHubCrudTenantsTenant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(appHubCrudTenantsTenant.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(appHubCrudTenantsTenant.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(appHubCrudTenantsTenant.displayName()).isEqualTo("display_name")
        assertThat(appHubCrudTenantsTenant.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appHubCrudTenantsTenant =
            AppHubCrudTenantsTenant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedAppHubCrudTenantsTenant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appHubCrudTenantsTenant),
                jacksonTypeRef<AppHubCrudTenantsTenant>(),
            )

        assertThat(roundtrippedAppHubCrudTenantsTenant).isEqualTo(appHubCrudTenantsTenant)
    }
}
