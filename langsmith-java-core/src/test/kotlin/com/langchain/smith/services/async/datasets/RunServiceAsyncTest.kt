// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.runs.QueryExampleSchemaWithRuns
import com.langchain.smith.models.datasets.runs.QueryFeedbackDelta
import com.langchain.smith.models.datasets.runs.RunCreateParams
import com.langchain.smith.models.datasets.runs.RunDeltaParams
import com.langchain.smith.models.datasets.runs.SortParamsForRunsComparisonView
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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.datasets().runs()

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
                                SortParamsForRunsComparisonView.builder()
                                    .sortBy("sort_by")
                                    .sortOrder(SortParamsForRunsComparisonView.SortOrder.ASC)
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
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runServiceAsync = client.datasets().runs()

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
