// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.public_

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.public_.runs.RunQueryParams
import com.langchain.smith.models.public_.runs.RunRetrieveParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.public_().runs()

        val runFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSelect("string")
                    .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .accept("Accept")
                    .build()
            )

        val run = runFuture.get()
        run.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun query() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val runServiceAsync = client.public_().runs()

        val responseFuture =
            runServiceAsync.query(
                RunQueryParams.builder()
                    .shareToken("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .accept("Accept")
                    .selects(
                        listOf(
                            RunQueryParams.Select.ID,
                            RunQueryParams.Select.NAME,
                            RunQueryParams.Select.PROJECT_ID,
                            RunQueryParams.Select.START_TIME,
                            RunQueryParams.Select.RUN_TYPE,
                            RunQueryParams.Select.STATUS,
                            RunQueryParams.Select.INPUTS_PREVIEW,
                            RunQueryParams.Select.OUTPUTS_PREVIEW,
                            RunQueryParams.Select.METADATA,
                        )
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
