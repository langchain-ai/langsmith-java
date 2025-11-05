// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.ssosettings

import com.langchain.smith.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SsoSettingSsoSettingsParamsTest {

    @Test
    fun create() {
        SsoSettingSsoSettingsParams.builder()
            .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .attributeMapping(
                SsoSettingSsoSettingsParams.AttributeMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .metadataUrl("metadata_url")
            .metadataXml("metadata_xml")
            .build()
    }

    @Test
    fun body() {
        val params =
            SsoSettingSsoSettingsParams.builder()
                .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .attributeMapping(
                    SsoSettingSsoSettingsParams.AttributeMapping.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .metadataUrl("metadata_url")
                .metadataXml("metadata_xml")
                .build()

        val body = params._body()

        assertThat(body.defaultWorkspaceIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.defaultWorkspaceRoleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.attributeMapping())
            .contains(
                SsoSettingSsoSettingsParams.AttributeMapping.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.metadataUrl()).contains("metadata_url")
        assertThat(body.metadataXml()).contains("metadata_xml")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SsoSettingSsoSettingsParams.builder()
                .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()

        assertThat(body.defaultWorkspaceIds())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.defaultWorkspaceRoleId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
