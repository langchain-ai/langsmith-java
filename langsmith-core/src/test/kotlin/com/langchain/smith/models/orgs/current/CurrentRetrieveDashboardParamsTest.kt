// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.langchain.smith.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentRetrieveDashboardParamsTest {

    @Test
    fun create() {
        CurrentRetrieveDashboardParams.builder()
            .colorScheme(CurrentRetrieveDashboardParams.ColorScheme.LIGHT)
            .type(CurrentRetrieveDashboardParams.Type.INVOICES)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CurrentRetrieveDashboardParams.builder()
                .colorScheme(CurrentRetrieveDashboardParams.ColorScheme.LIGHT)
                .type(CurrentRetrieveDashboardParams.Type.INVOICES)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("color_scheme", "light").put("type", "invoices").build()
            )
    }
}
