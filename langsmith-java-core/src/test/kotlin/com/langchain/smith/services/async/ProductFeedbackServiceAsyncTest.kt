// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductFeedbackServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val productFeedbackServiceAsync = client.productFeedback()

        val productFeedbackFuture =
            productFeedbackServiceAsync.create(
                ProductFeedbackCreateParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .category(ProductFeedbackCreateParams.Category.BUG)
                    .message("x")
                    .source(ProductFeedbackCreateParams.Source.LANGSMITH_CLI)
                    .client(
                        ProductFeedbackCreateParams.Client.builder()
                            .architecture("architecture")
                            .os("os")
                            .version("version")
                            .build()
                    )
                    .build()
            )

        val productFeedback = productFeedbackFuture.get()
        productFeedback.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .build()
        val productFeedbackServiceAsync = client.productFeedback()

        val productFeedbackFuture =
            productFeedbackServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val productFeedback = productFeedbackFuture.get()
        productFeedback.validate()
    }
}
