// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.orgs.current.ssosettings

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SsoSettingUpdateParamsTest {

    @Test
    fun create() {
        SsoSettingUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .metadataUrl("metadata_url")
            .metadataXml("metadata_xml")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SsoSettingUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SsoSettingUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addDefaultWorkspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .defaultWorkspaceRoleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .metadataUrl("metadata_url")
                .metadataXml("metadata_xml")
                .build()

        val body = params._body()

        assertThat(body.defaultWorkspaceIds().getOrNull())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.defaultWorkspaceRoleId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.metadataUrl()).contains("metadata_url")
        assertThat(body.metadataXml()).contains("metadata_xml")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SsoSettingUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
