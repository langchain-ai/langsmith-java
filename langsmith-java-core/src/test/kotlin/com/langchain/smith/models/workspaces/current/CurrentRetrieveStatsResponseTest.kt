// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.workspaces.current

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CurrentRetrieveStatsResponseTest {

    @Test
    fun create() {
        val currentRetrieveStatsResponse =
            CurrentRetrieveStatsResponse.builder()
                .annotationQueueCount(0L)
                .dashboardsCount(0L)
                .datasetCount(0L)
                .deploymentCount(0L)
                .repoCount(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tracerSessionCount(0L)
                .build()

        assertThat(currentRetrieveStatsResponse.annotationQueueCount()).isEqualTo(0L)
        assertThat(currentRetrieveStatsResponse.dashboardsCount()).isEqualTo(0L)
        assertThat(currentRetrieveStatsResponse.datasetCount()).isEqualTo(0L)
        assertThat(currentRetrieveStatsResponse.deploymentCount()).isEqualTo(0L)
        assertThat(currentRetrieveStatsResponse.repoCount()).isEqualTo(0L)
        assertThat(currentRetrieveStatsResponse.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(currentRetrieveStatsResponse.tracerSessionCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val currentRetrieveStatsResponse =
            CurrentRetrieveStatsResponse.builder()
                .annotationQueueCount(0L)
                .dashboardsCount(0L)
                .datasetCount(0L)
                .deploymentCount(0L)
                .repoCount(0L)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .tracerSessionCount(0L)
                .build()

        val roundtrippedCurrentRetrieveStatsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(currentRetrieveStatsResponse),
                jacksonTypeRef<CurrentRetrieveStatsResponse>(),
            )

        assertThat(roundtrippedCurrentRetrieveStatsResponse).isEqualTo(currentRetrieveStatsResponse)
    }
}
