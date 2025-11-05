// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.ace.AceExecuteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val aceService = client.ace()

        val response =
            aceService.execute(
                AceExecuteParams.builder()
                    .addArg(JsonValue.from(mapOf<String, Any>()))
                    .code("code")
                    .language("language")
                    .build()
            )

        response.validate()
    }
}
