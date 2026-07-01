// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import com.langchain.smith.models.examples.bulk.BulkCreateParams
import com.langchain.smith.models.examples.bulk.BulkPatchAllParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BulkServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val bulkService = client.examples().bulk()

        val examples =
            bulkService.create(
                listOf(
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
                        .sourceRunStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .sourceSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sourceTraceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .splitOfStrings(listOf("string"))
                        .useLegacyMessageFormat(true)
                        .addUseSourceRunAttachment("string")
                        .useSourceRunIo(true)
                        .build()
                )
            )

        examples.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val bulkService = client.examples().bulk()

        val response =
            bulkService.patchAll(
                listOf(
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
            )

        response.validate()
    }
}
