// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.ttlsettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtlSettingsTest {

    @Test
    fun create() {
        val ttlSettings =
            TtlSettings.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configuredBy(TtlSettings.ConfiguredBy.SYSTEM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultTraceTier(TraceTier.LONGLIVED)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applyToAllProjects(true)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(ttlSettings.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ttlSettings.configuredBy()).isEqualTo(TtlSettings.ConfiguredBy.SYSTEM)
        assertThat(ttlSettings.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ttlSettings.defaultTraceTier()).isEqualTo(TraceTier.LONGLIVED)
        assertThat(ttlSettings.organizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ttlSettings.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(ttlSettings.applyToAllProjects()).contains(true)
        assertThat(ttlSettings.tenantId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ttlSettings =
            TtlSettings.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configuredBy(TtlSettings.ConfiguredBy.SYSTEM)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultTraceTier(TraceTier.LONGLIVED)
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .applyToAllProjects(true)
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedTtlSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ttlSettings),
                jacksonTypeRef<TtlSettings>(),
            )

        assertThat(roundtrippedTtlSettings).isEqualTo(ttlSettings)
    }
}
