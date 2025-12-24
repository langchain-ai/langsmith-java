// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.runs.QueryFeedbackDelta
import com.langchain.smith.models.datasets.runs.RunCreateParams
import com.langchain.smith.models.datasets.runs.RunDeltaParams
import com.langchain.smith.models.datasets.runs.SortParamsForRunsComparisonView
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

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
        val runService = client.datasets().runs()

        val run =
            runService.create(
                RunCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .format(RunCreateParams.Format.CSV)
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filters(
                        RunCreateParams.Filters.builder()
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
                    .stream(true)
                    .build()
            )

        val unwrappedRun = run.getOrNull()
        unwrappedRun?.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delta() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val runService = client.datasets().runs()

        val sessionFeedbackDelta =
            runService.delta(
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

        sessionFeedbackDelta.validate()
    }
}
