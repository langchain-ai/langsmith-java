// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.examples

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.examples.AttachmentsOperations
import com.langsmith_api.api.models.api.v1.examples.bulk.BulkPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkService = client.api().v1().examples().bulk()

        val bulk = bulkService.create()

        bulk.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkService = client.api().v1().examples().bulk()

        val response =
            bulkService.patchAll(
                BulkPatchAllParams.builder()
                    .addBody(
                        BulkPatchAllParams.Body.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .attachmentsOperations(
                                AttachmentsOperations.builder()
                                    .rename(
                                        AttachmentsOperations.Rename.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("string"))
                                            .build()
                                    )
                                    .addRetain("string")
                                    .build()
                            )
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .inputs(JsonValue.from(mapOf<String, Any>()))
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .outputs(JsonValue.from(mapOf<String, Any>()))
                            .overwrite(true)
                            .splitOfStrings(listOf("string"))
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
