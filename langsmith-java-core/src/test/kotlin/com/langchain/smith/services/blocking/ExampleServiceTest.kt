// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExampleServiceTest {

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
        val exampleService = client.examples()

        val example =
            exampleService.create(
                ExampleCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt("created_at")
                    .inputs(
                        ExampleCreateParams.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        ExampleCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputs(
                        ExampleCreateParams.Outputs.builder()
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

        example.validate()
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
        val exampleService = client.examples()

        val example =
            exampleService.retrieve(
                ExampleRetrieveParams.builder()
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        example.validate()
    }

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
        val exampleService = client.examples()

        val example =
            exampleService.update(
                ExampleUpdateParams.builder()
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                        ExampleUpdateParams.Inputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .metadata(
                        ExampleUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .outputs(
                        ExampleUpdateParams.Outputs.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .overwrite(true)
                    .splitOfStrings(listOf("string"))
                    .build()
            )

        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.examples()

        val page = exampleService.list()

        page.items().forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.examples()

        val example = exampleService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        example.validate()
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
        val exampleService = client.examples()

        val response =
            exampleService.deleteAll(
                ExampleDeleteAllParams.builder()
                    .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCount() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.examples()

        exampleService.retrieveCount(
            ExampleRetrieveCountParams.builder()
                .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter("filter")
                .addFullTextContain("string")
                .metadata("metadata")
                .addSplit("string")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadFromCsv() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleService = client.examples()

        val examples =
            exampleService.uploadFromCsv(
                ExampleUploadFromCsvParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .file("some content".byteInputStream())
                    .addInputKey("string")
                    .addMetadataKey("string")
                    .addOutputKey("string")
                    .build()
            )

        examples.forEach { it.validate() }
    }
}
