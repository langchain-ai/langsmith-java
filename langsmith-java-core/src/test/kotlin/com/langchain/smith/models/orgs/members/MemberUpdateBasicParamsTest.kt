// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.members

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MemberUpdateBasicParamsTest {

    @Test
    fun create() {
        MemberUpdateBasicParams.builder().fullName("full_name").password("password").build()
    }

    @Test
    fun body() {
        val params =
            MemberUpdateBasicParams.builder().fullName("full_name").password("password").build()

        val body = params._body()

        assertThat(body.fullName()).contains("full_name")
        assertThat(body.password()).contains("password")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MemberUpdateBasicParams.builder().build()

        val body = params._body()
    }
}
