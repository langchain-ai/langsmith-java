// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantCreateParamsTest {

    @Test
    fun createTenantCreateParams() {
        TenantCreateParams.builder()
            .displayName("x")
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .tenantHandle("string")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TenantCreateParams.builder()
                .displayName("x")
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tenantHandle("string")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.displayName()).isEqualTo("x")
        assertThat(body.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.organizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tenantHandle()).isEqualTo("string")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TenantCreateParams.builder().displayName("x").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.displayName()).isEqualTo("x")
    }
}
