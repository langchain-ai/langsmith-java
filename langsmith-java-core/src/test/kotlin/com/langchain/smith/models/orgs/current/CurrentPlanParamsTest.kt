// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentPlanParamsTest {

    @Test
    fun create() {
        CurrentPlanParams.builder().tier(CurrentPlanParams.Tier.DISABLED).build()
    }

    @Test
    fun body() {
        val params = CurrentPlanParams.builder().tier(CurrentPlanParams.Tier.DISABLED).build()

        val body = params._body()

        assertThat(body.tier()).isEqualTo(CurrentPlanParams.Tier.DISABLED)
    }
}
