// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.datasets.group.GroupRunsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GroupServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun runs() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val groupService = client.datasets().group()

        val response =
            groupService.runs(
                GroupRunsParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .groupBy(GroupRunsParams.GroupBy.RUN_METADATA)
                    .metadataKey("metadata_key")
                    .addSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .filters(
                        GroupRunsParams.Filters.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .limit(1L)
                    .offset(0L)
                    .perGroupLimit(1L)
                    .preview(true)
                    .build()
            )

        response.validate()
    }
}
