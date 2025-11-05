// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.bulkexports

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.bulkexports.runs.RunListParams
import com.langchain.smith.models.bulkexports.runs.RunRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.bulkExports().runs()

        val bulkExportRun =
            runService.retrieve(
                RunRetrieveParams.builder()
                    .bulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        bulkExportRun.validate()
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
        val runService = client.bulkExports().runs()

        val bulkExportRuns =
            runService.list(
                RunListParams.builder()
                    .sourceBulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        bulkExportRuns.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.bulkExports().runs()

        val bulkExportRuns = runService.retrieveAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        bulkExportRuns.forEach { it.validate() }
    }
}
