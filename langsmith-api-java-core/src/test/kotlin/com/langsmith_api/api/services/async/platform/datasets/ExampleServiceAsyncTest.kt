// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.platform.datasets

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.platform.datasets.examples.ExampleHardDeleteParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUpdateParams
import com.langsmith_api.api.models.platform.datasets.examples.ExampleUploadParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExampleServiceAsyncTest {

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
        val exampleServiceAsync = client.platform().datasets().examples()

        val exampleFuture =
            exampleServiceAsync.update(
                ExampleUpdateParams.builder()
                    .datasetId(JsonValue.from(mapOf<String, Any>()))
                    .exampleId("some content".byteInputStream())
                    .exampleIdAttachmentName("some content".byteInputStream())
                    .exampleIdAttachmentsOperations("some content".byteInputStream())
                    .exampleIdInputs("some content".byteInputStream())
                    .exampleIdOutputs("some content".byteInputStream())
                    .build()
            )

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun hardDelete() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.platform().datasets().examples()

        val responseFuture =
            exampleServiceAsync.hardDelete(
                ExampleHardDeleteParams.builder().addExampleId("string").hardDelete(true).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.platform().datasets().examples()

        val responseFuture =
            exampleServiceAsync.upload(
                ExampleUploadParams.builder()
                    .datasetId(JsonValue.from(mapOf<String, Any>()))
                    .exampleId("some content".byteInputStream())
                    .exampleIdInputs("some content".byteInputStream())
                    .exampleIdAttachmentsName("some content".byteInputStream())
                    .exampleIdOutputs("some content".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
