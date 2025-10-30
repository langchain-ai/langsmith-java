// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.tenants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TenantCreateParamsTest {

    @Test
    fun create() {
        TenantCreateParams.builder()
            .displayName("display_name")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .isPersonal(true)
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tenantHandle("tenant_handle")
            .build()
    }

    @Test
    fun body() {
        val params =
            TenantCreateParams.builder()
                .displayName("display_name")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .isPersonal(true)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("tenant_handle")
                .build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.isPersonal()).contains(true)
        assertThat(body.organizationId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tenantHandle()).contains("tenant_handle")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TenantCreateParams.builder().displayName("display_name").build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
    }
}
