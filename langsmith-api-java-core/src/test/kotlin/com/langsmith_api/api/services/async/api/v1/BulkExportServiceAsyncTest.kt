// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportBulkExportsParams
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportCompression
import com.langsmith_api.api.models.api.v1.bulkexports.BulkExportFormat
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.api().v1().bulkExports()

        val bulkExportFuture =
            bulkExportServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExport = bulkExportFuture.get()
        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.api().v1().bulkExports()

        val bulkExportFuture = bulkExportServiceAsync.update("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExport = bulkExportFuture.get()
        bulkExport.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulkExports() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.api().v1().bulkExports()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkExportServiceAsync = client.api().v1().bulkExports()

        val bulkExportsFuture = bulkExportServiceAsync.retrieveBulkExports()

        val bulkExports = bulkExportsFuture.get()
        bulkExports.forEach { it.validate() }
    }
}
