// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import com.langchain.smith.models.examples.bulk.BulkPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkServiceTest {

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
        val bulkService = client.examples().bulk()

        val bulk = bulkService.create()

        bulk.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkService = client.examples().bulk()

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
