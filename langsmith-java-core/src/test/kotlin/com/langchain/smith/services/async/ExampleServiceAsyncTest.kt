// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.examples.AttachmentsOperations
import com.langchain.smith.models.examples.ExampleCreateParams
import com.langchain.smith.models.examples.ExampleDeleteAllParams
import com.langchain.smith.models.examples.ExampleListParams
import com.langchain.smith.models.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.examples.ExampleRetrieveParams
import com.langchain.smith.models.examples.ExampleSelect
import com.langchain.smith.models.examples.ExampleUpdateParams
import com.langchain.smith.models.examples.ExampleUploadFromCsvParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExampleServiceAsyncTest {

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
        val exampleServiceAsync = client.examples()

        val exampleFuture =
            exampleServiceAsync.create(
                ExampleCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt("created_at")
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .sourceRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .splitOfStrings(listOf("string"))
                    .useLegacyMessageFormat(true)
                    .addUseSourceRunAttachment("string")
                    .useSourceRunIo(true)
                    .build()
            )

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val exampleFuture =
            exampleServiceAsync.retrieve(
                ExampleRetrieveParams.builder()
                    .exampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val exampleFuture =
            exampleServiceAsync.update(
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
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .outputs(JsonValue.from(mapOf<String, Any>()))
                    .overwrite(true)
                    .splitOfStrings(listOf("string"))
                    .build()
            )

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val examplesFuture =
            exampleServiceAsync.list(
                ExampleListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .dataset("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .descending(true)
                    .filter("filter")
                    .addFullTextContain("string")
                    .limit(1L)
                    .metadata("metadata")
                    .offset(0L)
                    .order(ExampleListParams.Order.RECENT)
                    .randomSeed(0.0)
                    .addSelect(ExampleSelect.ID)
                    .addSplit("string")
                    .build()
            )

        val examples = examplesFuture.get()
        examples.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val exampleFuture = exampleServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val responseFuture =
            exampleServiceAsync.deleteAll(
                ExampleDeleteAllParams.builder()
                    .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCount() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val responseFuture =
            exampleServiceAsync.retrieveCount(
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

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun uploadFromCsv() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.examples()

        val examplesFuture =
            exampleServiceAsync.uploadFromCsv(
                ExampleUploadFromCsvParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .file("some content".byteInputStream())
                    .addInputKey("string")
                    .addMetadataKey("string")
                    .addOutputKey("string")
                    .build()
            )

        val examples = examplesFuture.get()
        examples.forEach { it.validate() }
    }
}
