// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentStripeAccountLinksParamsTest {

    @Test
    fun create() {
        CurrentStripeAccountLinksParams.builder().successPath("success_path").build()
    }

    @Test
    fun body() {
        val params = CurrentStripeAccountLinksParams.builder().successPath("success_path").build()

        val body = params._body()

        assertThat(body.successPath()).isEqualTo("success_path")
    }
}
