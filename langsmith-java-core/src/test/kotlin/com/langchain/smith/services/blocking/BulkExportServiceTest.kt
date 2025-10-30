// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.bulkexports.BulkExportBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportCompression
import com.langchain.smith.models.bulkexports.BulkExportFormat
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkExportServiceTest {

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
        val bulkExportService = client.bulkExports()

        val bulkExport = bulkExportService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportService = client.bulkExports()

        val bulkExport = bulkExportService.update("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkExports() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportService = client.bulkExports()

        val bulkExport =
            bulkExportService.bulkExports(
                BulkExportBulkExportsParams.builder()
                    .bulkExportDestinationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .compression(BulkExportCompression.NONE)
                    .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .format(BulkExportFormat.PARQUET)
                    .intervalHours(0L)
                    .build()
            )

        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBulkExports() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportService = client.bulkExports()

        val bulkExports = bulkExportService.retrieveBulkExports()

        bulkExports.forEach { it.validate() }
    }
}
