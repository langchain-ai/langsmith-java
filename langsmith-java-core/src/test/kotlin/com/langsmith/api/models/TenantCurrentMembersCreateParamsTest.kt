// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TenantCurrentMembersCreateParamsTest {

    @Test
    fun createTenantCurrentMembersCreateParams() {
        TenantCurrentMembersCreateParams.builder().email("string").readOnly(true).build()
    }

    @Test
    fun getBody() {
        val params =
            TenantCurrentMembersCreateParams.builder().email("string").readOnly(true).build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("string")
        assertThat(body.readOnly()).isEqualTo(true)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TenantCurrentMembersCreateParams.builder().email("string").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.email()).isEqualTo("string")
    }
}
