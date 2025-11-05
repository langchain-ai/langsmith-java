// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUpdateParams
import com.langchain.smith.models.platform.datasets.examples.ExampleUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExampleServiceTest {

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
        val exampleService = client.platform().datasets().examples()

        val example =
            exampleService.update(
                ExampleUpdateParams.builder()
                    .datasetId(JsonValue.from(mapOf<String, Any>()))
                    .exampleId("some content".byteInputStream())
                    .exampleIdAttachmentName("some content".byteInputStream())
                    .exampleIdAttachmentsOperations("some content".byteInputStream())
                    .exampleIdInputs("some content".byteInputStream())
                    .exampleIdOutputs("some content".byteInputStream())
                    .build()
            )

        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun hardDelete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.platform().datasets().examples()

        val response =
            exampleService.hardDelete(
                ExampleHardDeleteParams.builder().addExampleId("string").hardDelete(true).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.platform().datasets().examples()

        val response =
            exampleService.upload(
                ExampleUploadParams.builder()
                    .datasetId(JsonValue.from(mapOf<String, Any>()))
                    .exampleId("some content".byteInputStream())
                    .exampleIdInputs("some content".byteInputStream())
                    .exampleIdAttachmentsName("some content".byteInputStream())
                    .exampleIdOutputs("some content".byteInputStream())
                    .build()
            )

        response.validate()
    }
}
