// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.datasets.experiments.ExperimentGroupedParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExperimentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun grouped() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val experimentServiceAsync = client.datasets().experiments()

        val responseFuture =
            experimentServiceAsync.grouped(
                ExperimentGroupedParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addMetadataKey("string")
                    .datasetVersion("dataset_version")
                    .experimentLimit(1L)
                    .filter("filter")
                    .nameContains("name_contains")
                    .statsStartTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .useApproxStats(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
