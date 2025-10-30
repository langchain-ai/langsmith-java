// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InfoServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoServiceAsync = client.api().v1().orgs().current().info()

        val organizationInfoFuture = infoServiceAsync.list()

        val organizationInfo = organizationInfoFuture.get()
        organizationInfo.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val infoServiceAsync = client.api().v1().orgs().current().info()

        val organizationInfoFuture =
            infoServiceAsync.patchAll(
                InfoPatchAllParams.builder()
                    .displayName("display_name")
                    .jitProvisioningEnabled(true)
                    .patCreationDisabled(true)
                    .publicSharingDisabled(true)
                    .unshareAll(true)
                    .workspaceAdminCanInviteToOrg(true)
                    .build()
            )

        val organizationInfo = organizationInfoFuture.get()
        organizationInfo.validate()
    }
}
