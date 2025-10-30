// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.roles

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoleCreateParamsTest {

    @Test
    fun create() {
        RoleCreateParams.builder()
            .description("description")
            .displayName("display_name")
            .addPermission("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            RoleCreateParams.builder()
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
