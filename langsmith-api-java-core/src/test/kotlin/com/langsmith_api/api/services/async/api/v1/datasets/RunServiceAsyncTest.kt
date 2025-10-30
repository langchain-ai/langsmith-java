// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.datasets

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.datasets.runs.QueryExampleSchemaWithRuns
import com.langsmith_api.api.models.api.v1.datasets.runs.QueryFeedbackDelta
import com.langsmith_api.api.models.api.v1.datasets.runs.RunCreateParams
import com.langsmith_api.api.models.api.v1.datasets.runs.RunDeltaParams
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceAsyncTest {

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
        val runServiceAsync = client.api().v1().datasets().runs()

        val runFuture =
            runServiceAsync.create(
                RunCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queryFormat("format")
                    .queryExampleSchemaWithRuns(
                        QueryExampleSchemaWithRuns.builder()
                            .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .filters(
                                QueryExampleSchemaWithRuns.Filters.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .format(QueryExampleSchemaWithRuns.Format.CSV)
                            .limit(1L)
                            .offset(0L)
                            .preview(true)
                            .sortParams(
                                QueryExampleSchemaWithRuns.SortParams.builder()
                                    .sortBy("sort_by")
                                    .sortOrder(QueryExampleSchemaWithRuns.SortParams.SortOrder.ASC)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val run = runFuture.get()
        val unwrappedRun = run.getOrNull()
        unwrappedRun?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delta() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.api().v1().datasets().runs()

        val sessionFeedbackDeltaFuture =
            runServiceAsync.delta(
                RunDeltaParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .queryFeedbackDelta(
                        QueryFeedbackDelta.builder()
                            .baselineSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .addComparisonSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .feedbackKey("feedback_key")
                            .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .filters(
                                QueryFeedbackDelta.Filters.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                    .build()
                            )
                            .limit(1L)
                            .offset(0L)
                            .build()
                    )
                    .build()
            )

        val sessionFeedbackDelta = sessionFeedbackDeltaFuture.get()
        sessionFeedbackDelta.validate()
    }
}
