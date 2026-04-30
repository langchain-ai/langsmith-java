// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.datasets.share.ShareCreateParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShareServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.datasets().share()

        val datasetShareSchemaFuture =
            shareServiceAsync.create(
                ShareCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shareProjects(true)
                    .build()
            )

        val datasetShareSchema = datasetShareSchemaFuture.get()
        datasetShareSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.datasets().share()

        val datasetShareSchemaFuture =
            shareServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val datasetShareSchema = datasetShareSchemaFuture.get()
        val unwrappedDatasetShareSchema = datasetShareSchema.getOrNull()
        unwrappedDatasetShareSchema?.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val shareServiceAsync = client.datasets().share()

        val responseFuture = shareServiceAsync.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = responseFuture.get()
        response.validate()
    }
}
