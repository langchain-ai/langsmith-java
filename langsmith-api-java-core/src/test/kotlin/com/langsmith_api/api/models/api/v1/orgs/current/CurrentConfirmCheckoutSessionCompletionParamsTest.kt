// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentConfirmCheckoutSessionCompletionParamsTest {

    @Test
    fun create() {
        CurrentConfirmCheckoutSessionCompletionParams.builder()
            .stripeSessionId("stripe_session_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            CurrentConfirmCheckoutSessionCompletionParams.builder()
                .stripeSessionId("stripe_session_id")
                .build()

        val body = params._body()

        assertThat(body.stripeSessionId()).isEqualTo("stripe_session_id")
    }
}
