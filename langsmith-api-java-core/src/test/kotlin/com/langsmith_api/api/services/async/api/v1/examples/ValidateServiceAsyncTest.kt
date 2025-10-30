// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.examples

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ValidateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val validateServiceAsync = client.api().v1().examples().validate()

        val exampleValidationResultFuture = validateServiceAsync.create()

        val exampleValidationResult = exampleValidationResultFuture.get()
        exampleValidationResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun bulk() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val validateServiceAsync = client.api().v1().examples().validate()

        val exampleValidationResultsFuture = validateServiceAsync.bulk()

        val exampleValidationResults = exampleValidationResultsFuture.get()
        exampleValidationResults.forEach { it.validate() }
    }
}
