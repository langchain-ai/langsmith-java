// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.roles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleUpdateParamsTest {

    @Test
    fun create() {
        RoleUpdateParams.builder()
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .description("description")
            .displayName("display_name")
            .addPermission("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RoleUpdateParams.builder()
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .displayName("display_name")
                .addPermission("string")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RoleUpdateParams.builder()
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .description("description")
                .displayName("display_name")
                .addPermission("string")
                .build()

        val body = params._body()

        assertThat(body.description()).isEqualTo("description")
        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.permissions()).containsExactly("string")
    }
}
