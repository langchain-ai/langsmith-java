// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.current.info.InfoPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoService = client.orgs().current().info()

        val organizationInfo = infoService.list()

        organizationInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoService = client.orgs().current().info()

        val organizationInfo =
            infoService.patchAll(
                InfoPatchAllParams.builder()
                    .displayName("display_name")
                    .jitProvisioningEnabled(true)
                    .patCreationDisabled(true)
                    .publicSharingDisabled(true)
                    .unshareAll(true)
                    .workspaceAdminCanInviteToOrg(true)
                    .build()
            )

        organizationInfo.validate()
    }
}
