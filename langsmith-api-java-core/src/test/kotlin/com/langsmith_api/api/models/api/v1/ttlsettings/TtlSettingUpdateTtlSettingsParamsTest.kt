// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.ttlsettings

import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.TraceTier
import com.langsmith_api.api.models.api.v1.orgs.ttlsettings.UpsertTtlSettingsRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtlSettingUpdateTtlSettingsParamsTest {

    @Test
    fun create() {
        TtlSettingUpdateTtlSettingsParams.builder()
            .upsertTtlSettingsRequest(
                UpsertTtlSettingsRequest.builder()
                    .defaultTraceTier(TraceTier.LONGLIVED)
                    .applyToAllProjects(true)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TtlSettingUpdateTtlSettingsParams.builder()
                .upsertTtlSettingsRequest(
                    UpsertTtlSettingsRequest.builder()
                        .defaultTraceTier(TraceTier.LONGLIVED)
                        .applyToAllProjects(true)
                        .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpsertTtlSettingsRequest.builder()
                    .defaultTraceTier(TraceTier.LONGLIVED)
                    .applyToAllProjects(true)
                    .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TtlSettingUpdateTtlSettingsParams.builder()
                .upsertTtlSettingsRequest(
                    UpsertTtlSettingsRequest.builder().defaultTraceTier(TraceTier.LONGLIVED).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpsertTtlSettingsRequest.builder().defaultTraceTier(TraceTier.LONGLIVED).build()
            )
    }
}
