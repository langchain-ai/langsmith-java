// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.examples

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ValidateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val validateService = client.api().v1().examples().validate()

        val exampleValidationResult = validateService.create()

        exampleValidationResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulk() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val validateService = client.api().v1().examples().validate()

        val exampleValidationResults = validateService.bulk()

        exampleValidationResults.forEach { it.validate() }
    }
}
