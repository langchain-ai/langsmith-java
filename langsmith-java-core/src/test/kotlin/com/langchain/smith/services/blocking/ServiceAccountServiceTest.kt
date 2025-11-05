// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.serviceaccounts.ServiceAccountServiceAccountsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ServiceAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val serviceAccountService = client.serviceAccounts()

        val serviceAccount = serviceAccountService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        serviceAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveServiceAccounts() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val serviceAccountService = client.serviceAccounts()

        val response = serviceAccountService.retrieveServiceAccounts()

        response.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun serviceAccounts() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val serviceAccountService = client.serviceAccounts()

        val response =
            serviceAccountService.serviceAccounts(
                ServiceAccountServiceAccountsParams.builder()
                    .name("name")
                    .addWorkspace(
                        ServiceAccountServiceAccountsParams.Workspace.builder()
                            .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .roleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
