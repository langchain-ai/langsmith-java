// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExampleServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val exampleServiceAsync = client.datasets().examples()

        val future =
            exampleServiceAsync.delete(
                ExampleDeleteParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateMetadata() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val exampleServiceAsync = client.datasets().examples()

        val responseFuture =
            exampleServiceAsync.updateMetadata(
                ExampleUpdateMetadataParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addOperation(
                        ExampleUpdateMetadataParams.Operation.builder()
                            .key("key")
                            .operation(ExampleUpdateMetadataParams.Operation.InnerOperation.SET)
                            .value(JsonValue.from(mapOf<String, Any>()))
                            .addValue("string")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
