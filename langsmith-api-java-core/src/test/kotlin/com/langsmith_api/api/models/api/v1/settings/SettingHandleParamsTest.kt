// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingHandleParamsTest {

    @Test
    fun create() {
        SettingHandleParams.builder().tenantHandle("tenant_handle").build()
    }

    @Test
    fun body() {
        val params = SettingHandleParams.builder().tenantHandle("tenant_handle").build()

        val body = params._body()

        assertThat(body.tenantHandle()).isEqualTo("tenant_handle")
    }
}
