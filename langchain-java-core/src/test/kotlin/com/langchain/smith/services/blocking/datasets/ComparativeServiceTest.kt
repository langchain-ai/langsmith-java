// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.comparative.ComparativeCreateParams
import com.langchain.smith.models.datasets.comparative.ComparativeListParams
import com.langchain.smith.models.datasets.comparative.SortByComparativeExperimentColumn
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ComparativeServiceTest {

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
        val comparativeService = client.datasets().comparative()

        val comparative =
            comparativeService.create(
                ComparativeCreateParams.builder()
                    .addExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .referenceDatasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .extra(JsonValue.from(mapOf<String, Any>()))
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .build()
            )

        comparative.validate()
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
        val comparativeService = client.datasets().comparative()

        val comparatives =
            comparativeService.list(
                ComparativeListParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(1L)
                    .name("name")
                    .nameContains("name_contains")
                    .offset(0L)
                    .sortBy(SortByComparativeExperimentColumn.NAME)
                    .sortByDesc(true)
                    .build()
            )

        comparatives.forEach { it.validate() }
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
        val comparativeService = client.datasets().comparative()

        val comparative = comparativeService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        comparative.validate()
    }
}
