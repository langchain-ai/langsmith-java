// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.orgs.OrgCreateParams
import com.langsmith_api.api.models.api.v1.orgs.OrgListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgService = client.api().v1().orgs()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgService = client.api().v1().orgs()

        val organizationPgSchemaSlims =
            orgService.list(OrgListParams.builder().includeTier(true).skipCreate(true).build())

        organizationPgSchemaSlims.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePermissions() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgService = client.api().v1().orgs()

        val response = orgService.retrievePermissions()

        response.forEach { it.validate() }
    }
}
