// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.billing

import com.langchain.smith.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingRetrieveUsageParamsTest {

    @Test
    fun create() {
        BillingRetrieveUsageParams.builder()
            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onCurrentPlan(true)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BillingRetrieveUsageParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .onCurrentPlan(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .put("on_current_plan", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            BillingRetrieveUsageParams.builder()
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("ending_before", "2019-12-27T18:11:19.117Z")
                    .put("starting_on", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
