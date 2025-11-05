// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.orgs.OrgCreateParams
import com.langchain.smith.models.orgs.OrgListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgService = client.orgs()

        val organizationPgSchemaSlim =
            orgService.create(
                OrgCreateParams.builder().displayName("display_name").isPersonal(true).build()
            )

        organizationPgSchemaSlim.validate()
    }

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
        val orgService = client.orgs()

        val organizationPgSchemaSlims =
            orgService.list(OrgListParams.builder().includeTier(true).skipCreate(true).build())

        organizationPgSchemaSlims.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePermissions() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgService = client.orgs()

        val response = orgService.retrievePermissions()

        response.forEach { it.validate() }
    }
}
