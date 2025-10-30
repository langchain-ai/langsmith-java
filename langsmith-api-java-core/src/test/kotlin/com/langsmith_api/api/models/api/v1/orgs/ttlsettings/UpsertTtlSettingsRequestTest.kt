// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.ttlsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpsertTtlSettingsRequestTest {

    @Test
    fun create() {
        val upsertTtlSettingsRequest =
            UpsertTtlSettingsRequest.builder()
                .defaultTraceTier(TraceTier.LONGLIVED)
                .applyToAllProjects(true)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(upsertTtlSettingsRequest.defaultTraceTier()).isEqualTo(TraceTier.LONGLIVED)
        assertThat(upsertTtlSettingsRequest.applyToAllProjects()).contains(true)
        assertThat(upsertTtlSettingsRequest.tenantId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val upsertTtlSettingsRequest =
            UpsertTtlSettingsRequest.builder()
                .defaultTraceTier(TraceTier.LONGLIVED)
                .applyToAllProjects(true)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedUpsertTtlSettingsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(upsertTtlSettingsRequest),
                jacksonTypeRef<UpsertTtlSettingsRequest>(),
            )

        assertThat(roundtrippedUpsertTtlSettingsRequest).isEqualTo(upsertTtlSettingsRequest)
    }
}
