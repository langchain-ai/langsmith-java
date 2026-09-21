// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxListUsageCostsResponseTest {

    @Test
    fun create() {
        val sandboxListUsageCostsResponse =
            SandboxListUsageCostsResponse.builder()
                .lcu("1.234567")
                .lsu("0.000123")
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
                .build()

        assertThat(sandboxListUsageCostsResponse.lcu()).isEqualTo("1.234567")
        assertThat(sandboxListUsageCostsResponse.lsu()).isEqualTo("0.000123")
        assertThat(sandboxListUsageCostsResponse.periodStart())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(sandboxListUsageCostsResponse.resourceId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(sandboxListUsageCostsResponse.resourceType())
            .isEqualTo(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxListUsageCostsResponse =
            SandboxListUsageCostsResponse.builder()
                .lcu("1.234567")
                .lsu("0.000123")
                .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .resourceType(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
                .build()

        val roundtrippedSandboxListUsageCostsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxListUsageCostsResponse),
                jacksonTypeRef<SandboxListUsageCostsResponse>(),
            )

        assertThat(roundtrippedSandboxListUsageCostsResponse)
            .isEqualTo(sandboxListUsageCostsResponse)
    }
}
