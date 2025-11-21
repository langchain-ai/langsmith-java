// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.datasets.SortByDatasetColumn
import com.langchain.smith.models.public_.datasets.DatasetListParams
import com.langchain.smith.models.public_.datasets.DatasetRetrieveSessionsBulkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DatasetServiceAsyncTest {

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
        val datasetServiceAsync = client.public_().datasets()

        val datasetsFuture =
            datasetServiceAsync.list(
                DatasetListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .offset(0L)
                    .sortBy(SortByDatasetColumn.NAME)
                    .sortByDesc(true)
                    .build()
            )

        val datasets = datasetsFuture.get()
        datasets.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listComparative() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.public_().datasets()

        val pageFuture = datasetServiceAsync.listComparative("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listFeedback() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.public_().datasets()

        val pageFuture = datasetServiceAsync.listFeedback("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSessions() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.public_().datasets()

        val pageFuture = datasetServiceAsync.listSessions("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSessionsBulk() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val datasetServiceAsync = client.public_().datasets()

        val tracerSessionsFuture =
            datasetServiceAsync.retrieveSessionsBulk(
                DatasetRetrieveSessionsBulkParams.builder().addShareToken("string").build()
            )

        val tracerSessions = tracerSessionsFuture.get()
        tracerSessions.forEach { it.validate() }
    }
}
