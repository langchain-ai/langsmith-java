// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.ace.AceExecuteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val aceServiceAsync = client.api().v1().ace()

        val responseFuture =
            aceServiceAsync.execute(
                AceExecuteParams.builder()
                    .addArg(JsonValue.from(mapOf<String, Any>()))
                    .code("code")
                    .language("language")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
