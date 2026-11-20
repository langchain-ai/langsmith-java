// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxRetrieveUsageResponseTest {

    @Test
    fun create() {
        val sandboxRetrieveUsageResponse =
            SandboxRetrieveUsageResponse.builder()
                .cpuLimitMillicores(0L)
                .cpuUsedMillicores(0L)
                .memoryLimitBytes(0L)
                .memoryUsedBytes(0L)
                .poolsCount(0L)
                .registriesCount(0L)
                .sandboxDirectCount(0L)
                .sandboxPoolReplicasCount(0L)
                .sandboxRunningCount(0L)
                .sandboxStoppedCount(0L)
                .sandboxesLimit(0L)
                .sandboxesUsed(0L)
                .snapshotsCount(0L)
                .templatesCount(0L)
                .build()

        assertThat(sandboxRetrieveUsageResponse.cpuLimitMillicores()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.cpuUsedMillicores()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.memoryLimitBytes()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.memoryUsedBytes()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.poolsCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.registriesCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxDirectCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxPoolReplicasCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxRunningCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxStoppedCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxesLimit()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.sandboxesUsed()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.snapshotsCount()).contains(0L)
        assertThat(sandboxRetrieveUsageResponse.templatesCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxRetrieveUsageResponse =
            SandboxRetrieveUsageResponse.builder()
                .cpuLimitMillicores(0L)
                .cpuUsedMillicores(0L)
                .memoryLimitBytes(0L)
                .memoryUsedBytes(0L)
                .poolsCount(0L)
                .registriesCount(0L)
                .sandboxDirectCount(0L)
                .sandboxPoolReplicasCount(0L)
                .sandboxRunningCount(0L)
                .sandboxStoppedCount(0L)
                .sandboxesLimit(0L)
                .sandboxesUsed(0L)
                .snapshotsCount(0L)
                .templatesCount(0L)
                .build()

        val roundtrippedSandboxRetrieveUsageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxRetrieveUsageResponse),
                jacksonTypeRef<SandboxRetrieveUsageResponse>(),
            )

        assertThat(roundtrippedSandboxRetrieveUsageResponse).isEqualTo(sandboxRetrieveUsageResponse)
    }
}
