// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoService = client.api().v1().orgs().current().info()

        val organizationInfo = infoService.list()

        organizationInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoService = client.api().v1().orgs().current().info()

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
