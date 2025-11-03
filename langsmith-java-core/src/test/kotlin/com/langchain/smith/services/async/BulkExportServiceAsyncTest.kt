// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.bulkexports.BulkExportBulkExportsParams
import com.langchain.smith.models.bulkexports.BulkExportCompression
import com.langchain.smith.models.bulkexports.BulkExportFormat
import com.langchain.smith.models.bulkexports.BulkExportUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkExportServiceAsyncTest {

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
        val bulkExportServiceAsync = client.bulkExports()

        val bulkExportFuture =
            bulkExportServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExport = bulkExportFuture.get()
        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.bulkExports()

        val bulkExportFuture =
            bulkExportServiceAsync.update(
                BulkExportUpdateParams.builder()
                    .bulkExportId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(BulkExportUpdateParams.Status.CANCELLED)
                    .build()
            )

        val bulkExport = bulkExportFuture.get()
        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkExports() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.bulkExports()

        val bulkExportFuture =
            bulkExportServiceAsync.bulkExports(
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

        val bulkExport = bulkExportFuture.get()
        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveBulkExports() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.bulkExports()

        val bulkExportsFuture = bulkExportServiceAsync.retrieveBulkExports()

        val bulkExports = bulkExportsFuture.get()
        bulkExports.forEach { it.validate() }
    }
}
