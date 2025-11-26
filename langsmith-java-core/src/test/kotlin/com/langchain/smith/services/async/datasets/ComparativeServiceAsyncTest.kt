// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.comparative.ComparativeCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ComparativeServiceAsyncTest {

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
        val comparativeServiceAsync = client.datasets().comparative()

        val comparativeFuture =
            comparativeServiceAsync.create(
                ComparativeCreateParams.builder()
                    .addExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .extra(
                        ComparativeCreateParams.Extra.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val comparative = comparativeFuture.get()
        comparative.validate()
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
        val comparativeServiceAsync = client.datasets().comparative()

        val pageFuture = comparativeServiceAsync.list("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val page = pageFuture.get()
        page.items().forEach { it.validate() }
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
        val comparativeServiceAsync = client.datasets().comparative()

        val comparativeFuture =
            comparativeServiceAsync.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val comparative = comparativeFuture.get()
        comparative.validate()
    }
}
