// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.orgs.OrgCreateParams
import com.langsmith_api.api.models.api.v1.orgs.OrgListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class OrgServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.api().v1().orgs()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.api().v1().orgs()

        val organizationPgSchemaSlimsFuture =
            orgServiceAsync.list(OrgListParams.builder().includeTier(true).skipCreate(true).build())

        val organizationPgSchemaSlims = organizationPgSchemaSlimsFuture.get()
        organizationPgSchemaSlims.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrievePermissions() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val orgServiceAsync = client.api().v1().orgs()

        val responseFuture = orgServiceAsync.retrievePermissions()

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
