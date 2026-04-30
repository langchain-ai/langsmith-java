// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.examples

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ValidateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val validateServiceAsync = client.examples().validate()

        val exampleValidationResultFuture = validateServiceAsync.create()

        val exampleValidationResult = exampleValidationResultFuture.get()
        exampleValidationResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulk() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val validateServiceAsync = client.examples().validate()

        val exampleValidationResultsFuture = validateServiceAsync.bulk()

        val exampleValidationResults = exampleValidationResultsFuture.get()
        exampleValidationResults.forEach { it.validate() }
    }
}
