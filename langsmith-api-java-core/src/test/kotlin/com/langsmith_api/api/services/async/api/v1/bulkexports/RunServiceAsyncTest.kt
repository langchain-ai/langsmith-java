// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.bulkexports

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.bulkexports.runs.RunRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.api().v1().bulkExports().runs()

        val bulkExportRunFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder()
                    .bulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val bulkExportRun = bulkExportRunFuture.get()
        bulkExportRun.validate()
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
        val runServiceAsync = client.api().v1().bulkExports().runs()

        val bulkExportRunsFuture = runServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExportRuns = bulkExportRunsFuture.get()
        bulkExportRuns.forEach { it.validate() }
    }
}
