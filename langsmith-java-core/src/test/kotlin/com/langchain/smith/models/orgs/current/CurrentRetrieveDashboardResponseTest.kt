// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentRetrieveDashboardResponseTest {

    @Test
    fun create() {
        val currentRetrieveDashboardResponse =
            CurrentRetrieveDashboardResponse.builder().embeddableUrl("embeddable_url").build()

        assertThat(currentRetrieveDashboardResponse.embeddableUrl()).isEqualTo("embeddable_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentRetrieveDashboardResponse =
            CurrentRetrieveDashboardResponse.builder().embeddableUrl("embeddable_url").build()

        val roundtrippedCurrentRetrieveDashboardResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentRetrieveDashboardResponse),
                jacksonTypeRef<CurrentRetrieveDashboardResponse>(),
            )

        assertThat(roundtrippedCurrentRetrieveDashboardResponse)
            .isEqualTo(currentRetrieveDashboardResponse)
    }
}
