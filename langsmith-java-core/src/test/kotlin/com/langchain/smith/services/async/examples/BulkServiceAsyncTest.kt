// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.examples

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.models.examples.bulk.BulkPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BulkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkServiceAsync = client.examples().bulk()

        val examplesFuture =
            bulkServiceAsync.create(
                BulkCreateParams.builder()
                    .addBody(
                        BulkCreateParams.Body.builder()
                            .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .createdAt("created_at")
                            .inputs(
                                BulkCreateParams.Body.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .metadata(
                                BulkCreateParams.Body.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                BulkCreateParams.Body.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .splitOfStrings(listOf("string"))
                            .useLegacyMessageFormat(true)
                            .addUseSourceRunAttachment("string")
                            .useSourceRunIo(true)
                            .build()
                    )
                    .build()
            )

        val examples = examplesFuture.get()
        examples.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val bulkServiceAsync = client.examples().bulk()

        val responseFuture =
            bulkServiceAsync.patchAll(
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
                            .inputs(
                                BulkPatchAllParams.Body.Inputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .metadata(
                                BulkPatchAllParams.Body.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .outputs(
                                BulkPatchAllParams.Body.Outputs.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .overwrite(true)
                            .splitOfStrings(listOf("string"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
