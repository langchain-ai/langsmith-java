// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.orgs.current.info

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InfoPatchAllParamsTest {

    @Test
    fun create() {
        InfoPatchAllParams.builder()
            .displayName("display_name")
            .jitProvisioningEnabled(true)
            .patCreationDisabled(true)
            .publicSharingDisabled(true)
            .unshareAll(true)
            .workspaceAdminCanInviteToOrg(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            InfoPatchAllParams.builder()
                .displayName("display_name")
                .jitProvisioningEnabled(true)
                .patCreationDisabled(true)
                .publicSharingDisabled(true)
                .unshareAll(true)
                .workspaceAdminCanInviteToOrg(true)
                .build()

        val body = params._body()

        assertThat(body.displayName()).contains("display_name")
        assertThat(body.jitProvisioningEnabled()).contains(true)
        assertThat(body.patCreationDisabled()).contains(true)
        assertThat(body.publicSharingDisabled()).contains(true)
        assertThat(body.unshareAll()).contains(true)
        assertThat(body.workspaceAdminCanInviteToOrg()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InfoPatchAllParams.builder().build()

        val body = params._body()
    }
}
