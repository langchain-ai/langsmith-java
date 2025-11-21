// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.datasets.share.ShareCreateParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ShareServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
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
        val shareService = client.datasets().share()

        val datasetShareSchema = shareService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val unwrappedDatasetShareSchema = datasetShareSchema.getOrNull()
        unwrappedDatasetShareSchema?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val shareService = client.datasets().share()

        val response = shareService.deleteAll("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        response.validate()
    }
}
