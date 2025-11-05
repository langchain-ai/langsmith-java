// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberUpdateParamsTest {

    @Test
    fun create() {
        MemberUpdateParams.builder()
            .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .fullName("full_name")
            .password("password")
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MemberUpdateParams.builder().identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MemberUpdateParams.builder()
                .identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .fullName("full_name")
                .password("password")
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.fullName()).contains("full_name")
        assertThat(body.password()).contains("password")
        assertThat(body.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MemberUpdateParams.builder().identityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
