// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.evaluators.EvaluatorListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EvaluatorServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val evaluatorService = client.evaluators()

        val evaluators =
            evaluatorService.list(
                EvaluatorListParams.builder()
                    .addId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .evaluatorId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeBackfillProgress(true)
                    .nameContains("name_contains")
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addTagValueId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .type(EvaluatorListParams.Type.SESSION)
                    .build()
            )

        evaluators.forEach { it.validate() }
    }
}
