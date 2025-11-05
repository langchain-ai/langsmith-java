// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.orgs.OrgCreateParams
import com.langchain.smith.models.orgs.OrgListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.orgs()

        val organizationPgSchemaSlimFuture =
            orgServiceAsync.create(
                OrgCreateParams.builder().displayName("display_name").isPersonal(true).build()
            )

        val organizationPgSchemaSlim = organizationPgSchemaSlimFuture.get()
        organizationPgSchemaSlim.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.orgs()

        val organizationPgSchemaSlimsFuture =
            orgServiceAsync.list(OrgListParams.builder().includeTier(true).skipCreate(true).build())

        val organizationPgSchemaSlims = organizationPgSchemaSlimsFuture.get()
        organizationPgSchemaSlims.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePermissions() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.orgs()

        val responseFuture = orgServiceAsync.retrievePermissions()

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
