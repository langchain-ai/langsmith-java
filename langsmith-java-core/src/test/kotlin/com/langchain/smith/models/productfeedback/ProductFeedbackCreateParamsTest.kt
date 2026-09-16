// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.productfeedback

import com.langchain.smith.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductFeedbackCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun headers() {
        val params =
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

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("Idempotency-Key", "Idempotency-Key").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            ProductFeedbackCreateParams.builder()
                .category(ProductFeedbackCreateParams.Category.BUG)
                .message("x")
                .source(ProductFeedbackCreateParams.Source.LANGSMITH_CLI)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.category()).isEqualTo(ProductFeedbackCreateParams.Category.BUG)
        assertThat(body.message()).isEqualTo("x")
        assertThat(body.source()).isEqualTo(ProductFeedbackCreateParams.Source.LANGSMITH_CLI)
        assertThat(body.client())
            .contains(
                ProductFeedbackCreateParams.Client.builder()
                    .architecture("architecture")
                    .os("os")
                    .version("version")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ProductFeedbackCreateParams.builder()
                .category(ProductFeedbackCreateParams.Category.BUG)
                .message("x")
                .source(ProductFeedbackCreateParams.Source.LANGSMITH_CLI)
                .build()

        val body = params._body()

        assertThat(body.category()).isEqualTo(ProductFeedbackCreateParams.Category.BUG)
        assertThat(body.message()).isEqualTo("x")
        assertThat(body.source()).isEqualTo(ProductFeedbackCreateParams.Source.LANGSMITH_CLI)
    }
}
