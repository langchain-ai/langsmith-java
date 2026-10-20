// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.sandboxes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SandboxListUsageCostsPageResponseTest {

    @Test
    fun create() {
        val sandboxListUsageCostsPageResponse =
            SandboxListUsageCostsPageResponse.builder()
                .addItem(
                    SandboxListUsageCostsResponse.builder()
                        .lcu("1.234567")
                        .lsu("0.000123")
                        .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resourceType(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
                        .computeStandardUnits("compute_standard_units")
                        .storageStandardUnits("storage_standard_units")
                        .build()
                )
                .nextCursor("next_cursor")
                .totals(
                    SandboxListUsageCostsPageResponse.Totals.builder()
                        .lcu("lcu")
                        .lsu("lsu")
                        .computeStandardUnits("compute_standard_units")
                        .storageStandardUnits("storage_standard_units")
                        .build()
                )
                .build()

        assertThat(sandboxListUsageCostsPageResponse.items())
            .containsExactly(
                SandboxListUsageCostsResponse.builder()
                    .lcu("1.234567")
                    .lsu("0.000123")
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .resourceType(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
                    .computeStandardUnits("compute_standard_units")
                    .storageStandardUnits("storage_standard_units")
                    .build()
            )
        assertThat(sandboxListUsageCostsPageResponse.nextCursor()).contains("next_cursor")
        assertThat(sandboxListUsageCostsPageResponse.totals())
            .contains(
                SandboxListUsageCostsPageResponse.Totals.builder()
                    .lcu("lcu")
                    .lsu("lsu")
                    .computeStandardUnits("compute_standard_units")
                    .storageStandardUnits("storage_standard_units")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sandboxListUsageCostsPageResponse =
            SandboxListUsageCostsPageResponse.builder()
                .addItem(
                    SandboxListUsageCostsResponse.builder()
                        .lcu("1.234567")
                        .lsu("0.000123")
                        .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .resourceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .resourceType(SandboxListUsageCostsResponse.ResourceType.SANDBOX)
                        .computeStandardUnits("compute_standard_units")
                        .storageStandardUnits("storage_standard_units")
                        .build()
                )
                .nextCursor("next_cursor")
                .totals(
                    SandboxListUsageCostsPageResponse.Totals.builder()
                        .lcu("lcu")
                        .lsu("lsu")
                        .computeStandardUnits("compute_standard_units")
                        .storageStandardUnits("storage_standard_units")
                        .build()
                )
                .build()

        val roundtrippedSandboxListUsageCostsPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sandboxListUsageCostsPageResponse),
                jacksonTypeRef<SandboxListUsageCostsPageResponse>(),
            )

        assertThat(roundtrippedSandboxListUsageCostsPageResponse)
            .isEqualTo(sandboxListUsageCostsPageResponse)
    }
}
