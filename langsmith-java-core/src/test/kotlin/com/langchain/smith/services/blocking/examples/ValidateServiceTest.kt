// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.examples

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ValidateServiceTest {

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
        val validateService = client.examples().validate()

        val exampleValidationResult = validateService.create()

        exampleValidationResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulk() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val validateService = client.examples().validate()

        val exampleValidationResults = validateService.bulk()

        exampleValidationResults.forEach { it.validate() }
    }
}
