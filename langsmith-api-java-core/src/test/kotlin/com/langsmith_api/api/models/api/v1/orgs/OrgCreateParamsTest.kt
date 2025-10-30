// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OrgCreateParamsTest {

    @Test
    fun create() {
        OrgCreateParams.builder().displayName("display_name").isPersonal(true).build()
    }

    @Test
    fun body() {
        val params = OrgCreateParams.builder().displayName("display_name").isPersonal(true).build()

        val body = params._body()

        assertThat(body.displayName()).isEqualTo("display_name")
        assertThat(body.isPersonal()).isEqualTo(true)
    }
}
