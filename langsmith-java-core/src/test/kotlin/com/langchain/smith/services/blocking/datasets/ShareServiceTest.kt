// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.datasets.share.ShareCreateParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ShareServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.datasets().share()

        val datasetShareSchema =
            shareService.create(
                ShareCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .shareProjects(true)
                    .build()
            )

        datasetShareSchema.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.datasets().share()

        val datasetShareSchema = shareService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val unwrappedDatasetShareSchema = datasetShareSchema.getOrNull()
        unwrappedDatasetShareSchema?.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val shareService = client.datasets().share()

        val response = shareService.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
