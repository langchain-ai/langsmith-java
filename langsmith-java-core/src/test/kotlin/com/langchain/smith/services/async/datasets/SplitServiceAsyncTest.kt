// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.datasets

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.datasets.splits.SplitCreateParams
import com.langchain.smith.models.datasets.splits.SplitRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SplitServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val splitServiceAsync = client.datasets().splits()

        val splitsFuture =
            splitServiceAsync.create(
                SplitCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addExample("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .splitName("split_name")
                    .remove(true)
                    .build()
            )

        val splits = splitsFuture.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val splitServiceAsync = client.datasets().splits()

        val splitsFuture =
            splitServiceAsync.retrieve(
                SplitRetrieveParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .asOf(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val splits = splitsFuture.get()
    }
}
