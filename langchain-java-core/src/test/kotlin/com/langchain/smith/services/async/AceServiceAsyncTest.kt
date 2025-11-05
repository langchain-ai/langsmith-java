// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.ace.AceExecuteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val aceServiceAsync = client.ace()

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
