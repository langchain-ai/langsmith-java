// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.productfeedback.ProductFeedbackCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductFeedbackServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val productFeedbackService = client.productFeedback()

        val productFeedback =
            productFeedbackService.create(
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

        productFeedback.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val productFeedbackService = client.productFeedback()

        val productFeedback =
            productFeedbackService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        productFeedback.validate()
    }
}
