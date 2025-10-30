// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.models.api.v1.examples.ExampleDeleteAllParams
import com.langsmith_api.api.models.api.v1.examples.ExampleListParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveCountParams
import com.langsmith_api.api.models.api.v1.examples.ExampleRetrieveParams
import com.langsmith_api.api.models.api.v1.examples.ExampleSelect
import com.langsmith_api.api.models.api.v1.examples.ExampleUpdateParams
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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

        val exampleFuture = exampleServiceAsync.create()

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

        val examplesFuture =
            exampleServiceAsync.update(
                ExampleUpdateParams.builder()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

        val exampleFuture = exampleServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val example = exampleFuture.get()
        example.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteAll() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

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
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.api().v1().examples()

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
}
