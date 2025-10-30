// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.me.onboardingstate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OnboardingStateUpdateParamsTest {

    @Test
    fun create() {
        OnboardingStateUpdateParams.builder().field("field").build()
    }

    @Test
    fun pathParams() {
        val params = OnboardingStateUpdateParams.builder().field("field").build()

        assertThat(params._pathParam(0)).isEqualTo("field")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
