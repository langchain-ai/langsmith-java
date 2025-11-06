// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.runs.QueryExampleSchemaWithRuns
import com.langchain.smith.models.datasets.runs.SortParamsForRunsComparisonView
import com.langchain.smith.models.examples.ExampleSelect
import com.langchain.smith.models.public_.examples.ExampleListParams
import com.langchain.smith.models.public_.examples.ExampleRetrieveCountParams
import com.langchain.smith.models.public_.examples.ExampleRunsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ExampleServiceAsyncTest {

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
        val exampleServiceAsync = client.public_().examples()

        val examplesFuture =
            exampleServiceAsync.list(
                ExampleListParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .limit(1L)
                    .metadata("metadata")
                    .offset(0L)
                    .addSelect(ExampleSelect.ID)
                    .build()
            )

        val examples = examplesFuture.get()
        examples.forEach { it.validate() }
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
        val exampleServiceAsync = client.public_().examples()

        val responseFuture =
            exampleServiceAsync.retrieveCount(
                ExampleRetrieveCountParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .filter("filter")
                    .metadata("metadata")
                    .build()
            )

        val response = responseFuture.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun runs() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val exampleServiceAsync = client.public_().examples()

        val responseFuture =
            exampleServiceAsync.runs(
                ExampleRunsParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queryExampleSchemaWithRuns(
                        QueryExampleSchemaWithRuns.builder()
                            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .filters(
                                QueryExampleSchemaWithRuns.Filters.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .limit(1L)
                            .offset(0L)
                            .preview(true)
                            .sortParams(
                                SortParamsForRunsComparisonView.builder()
                                    .sortBy("sort_by")
                                    .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
