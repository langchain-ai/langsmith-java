// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.runs.RunQueryParams
import com.langchain.smith.models.datasets.runs.SortParamsForRunsComparisonView
import kotlin.jvm.optionals.getOrNull
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val runService = client.datasets().runs()

        val exampleWithRunsChes =
            runService.query(
                RunQueryParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .format(RunQueryParams.Format.CSV)
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filters(
                        RunQueryParams.Filters.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .includeAnnotatorDetail(true)
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

        val unwrappedExampleWithRunsChes = exampleWithRunsChes.getOrNull()
        unwrappedExampleWithRunsChes?.forEach { it.validate() }
    }
}
