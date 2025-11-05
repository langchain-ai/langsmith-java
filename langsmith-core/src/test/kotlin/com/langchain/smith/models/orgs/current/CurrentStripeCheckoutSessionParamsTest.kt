// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentStripeCheckoutSessionParamsTest {

    @Test
    fun create() {
        CurrentStripeCheckoutSessionParams.builder()
            .amountCents(0L)
            .successPath("success_path")
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrentStripeCheckoutSessionParams.builder()
                .amountCents(0L)
                .successPath("success_path")
                .build()

        val body = params._body()

        assertThat(body.amountCents()).isEqualTo(0L)
        assertThat(body.successPath()).isEqualTo("success_path")
    }
}
