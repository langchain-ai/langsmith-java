// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.bulkexports

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.BulkExportDestinationS3Config
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.BulkExportDestinationType
import com.langsmith_api.api.models.api.v1.bulkexports.destinations.DestinationCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DestinationServiceAsyncTest {

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
        val destinationServiceAsync = client.api().v1().bulkExports().destinations()

        val bulkExportDestinationFuture =
            destinationServiceAsync.create(
                DestinationCreateParams.builder()
                    .config(
                        BulkExportDestinationS3Config.builder()
                            .bucketName("xxx")
                            .endpointUrl("endpoint_url")
                            .prefix("prefix")
                            .region("x")
                            .s3AdditionalKwargs(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .displayName("display_name")
                    .credentials(
                        DestinationCreateParams.Credentials.builder()
                            .accessKeyId("x")
                            .secretAccessKey("x")
                            .sessionToken("session_token")
                            .build()
                    )
                    .destinationType(BulkExportDestinationType.S3)
                    .build()
            )

        val bulkExportDestination = bulkExportDestinationFuture.get()
        bulkExportDestination.validate()
    }

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
        val destinationServiceAsync = client.api().v1().bulkExports().destinations()

        val bulkExportDestinationFuture =
            destinationServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val bulkExportDestination = bulkExportDestinationFuture.get()
        bulkExportDestination.validate()
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
        val destinationServiceAsync = client.api().v1().bulkExports().destinations()

        val bulkExportDestinationsFuture = destinationServiceAsync.list()

        val bulkExportDestinations = bulkExportDestinationsFuture.get()
        bulkExportDestinations.forEach { it.validate() }
    }
}
