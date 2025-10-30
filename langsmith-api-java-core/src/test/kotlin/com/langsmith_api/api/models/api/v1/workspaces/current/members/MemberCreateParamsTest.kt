// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.workspaces.current.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberCreateParamsTest {

    @Test
    fun create() {
        MemberCreateParams.builder()
            .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .orgIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .readOnly(true)
            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .build()
    }

    @Test
    fun body() {
        val params =
            MemberCreateParams.builder()
                .lsUserId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .orgIdentityId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .readOnly(true)
                .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.lsUserId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.orgIdentityId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.readOnly()).contains(true)
        assertThat(body.roleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.userId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MemberCreateParams.builder().build()

        val body = params._body()
    }
}
