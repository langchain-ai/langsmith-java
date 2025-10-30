// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.bulkexports

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.bulkexports.runs.RunListParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.bulkExports().runs()

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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.bulkExports().runs()

        val bulkExportRunsFuture =
            runServiceAsync.list(
                RunListParams.builder()
                    .sourceBulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val bulkExportRuns = bulkExportRunsFuture.get()
        bulkExportRuns.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.bulkExports().runs()

        val bulkExportRunsFuture =
            runServiceAsync.retrieveAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExportRuns = bulkExportRunsFuture.get()
        bulkExportRuns.forEach { it.validate() }
    }
}
