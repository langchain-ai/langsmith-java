// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.examples.ExampleDeleteParams
import com.langchain.smith.models.datasets.examples.ExampleUpdateMetadataParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExampleServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val exampleService = client.datasets().examples()

        exampleService.delete(
            ExampleDeleteParams.builder()
                .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateMetadata() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val exampleService = client.datasets().examples()

        val response =
            exampleService.updateMetadata(
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

        response.validate()
    }
}
