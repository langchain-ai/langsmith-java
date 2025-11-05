// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.ssosettings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SsoProviderTest {

    @Test
    fun create() {
        val ssoProvider =
            SsoProvider.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadataUrl("metadata_url")
                .metadataXml("metadata_xml")
                .build()

        assertThat(ssoProvider.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoProvider.defaultWorkspaceIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoProvider.defaultWorkspaceRoleId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoProvider.organizationId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoProvider.providerId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(ssoProvider.metadataUrl()).contains("metadata_url")
        assertThat(ssoProvider.metadataXml()).contains("metadata_xml")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ssoProvider =
            SsoProvider.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .providerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadataUrl("metadata_url")
                .metadataXml("metadata_xml")
                .build()

        val roundtrippedSsoProvider =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ssoProvider),
                jacksonTypeRef<SsoProvider>(),
            )

        assertThat(roundtrippedSsoProvider).isEqualTo(ssoProvider)
    }
}
