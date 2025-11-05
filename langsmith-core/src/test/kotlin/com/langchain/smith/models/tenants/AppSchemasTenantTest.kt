// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.tenants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppSchemasTenantTest {

    @Test
    fun create() {
        val appSchemasTenant =
            AppSchemasTenant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        assertThat(appSchemasTenant.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(appSchemasTenant.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(appSchemasTenant.displayName()).isEqualTo("display_name")
        assertThat(appSchemasTenant.isDeleted()).isEqualTo(true)
        assertThat(appSchemasTenant.isPersonal()).isEqualTo(true)
        assertThat(appSchemasTenant.organizationId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(appSchemasTenant.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val appSchemasTenant =
            AppSchemasTenant.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .displayName("display_name")
                .isDeleted(true)
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        val roundtrippedAppSchemasTenant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(appSchemasTenant),
                jacksonTypeRef<AppSchemasTenant>(),
            )

        assertThat(roundtrippedAppSchemasTenant).isEqualTo(appSchemasTenant)
    }
}
