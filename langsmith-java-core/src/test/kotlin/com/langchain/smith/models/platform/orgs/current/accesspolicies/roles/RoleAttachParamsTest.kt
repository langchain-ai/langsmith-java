// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.platform.orgs.current.accesspolicies.roles

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleAttachParamsTest {

    @Test
    fun create() {
        RoleAttachParams.builder()
            .roleId(JsonValue.from(mapOf<String, Any>()))
            .payload(RoleAttachParams.Payload.builder().addAccessPolicyId("string").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = RoleAttachParams.builder().roleId(JsonValue.from(mapOf<String, Any>())).build()

        assertThat(params._pathParam(0)).isEqualTo("[object Object]")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RoleAttachParams.builder()
                .roleId(JsonValue.from(mapOf<String, Any>()))
                .payload(RoleAttachParams.Payload.builder().addAccessPolicyId("string").build())
                .build()

        val body = params._body()

        assertThat(body.payload())
            .contains(RoleAttachParams.Payload.builder().addAccessPolicyId("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = RoleAttachParams.builder().roleId(JsonValue.from(mapOf<String, Any>())).build()

        val body = params._body()
    }
}
