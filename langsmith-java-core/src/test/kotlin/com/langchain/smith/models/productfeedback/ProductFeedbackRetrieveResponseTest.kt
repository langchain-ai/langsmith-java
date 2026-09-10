// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.productfeedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductFeedbackRetrieveResponseTest {

    @Test
    fun create() {
        val productFeedbackRetrieveResponse =
            ProductFeedbackRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ProductFeedbackRetrieveResponse.Category.BUG)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .message("message")
                .source(ProductFeedbackRetrieveResponse.Source.LANGSMITH_CLI)
                .client(
                    ProductFeedbackRetrieveResponse.Client.builder()
                        .architecture("architecture")
                        .os("os")
                        .version("version")
                        .build()
                )
                .build()

        assertThat(productFeedbackRetrieveResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(productFeedbackRetrieveResponse.category())
            .isEqualTo(ProductFeedbackRetrieveResponse.Category.BUG)
        assertThat(productFeedbackRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productFeedbackRetrieveResponse.message()).isEqualTo("message")
        assertThat(productFeedbackRetrieveResponse.source())
            .isEqualTo(ProductFeedbackRetrieveResponse.Source.LANGSMITH_CLI)
        assertThat(productFeedbackRetrieveResponse.client())
            .contains(
                ProductFeedbackRetrieveResponse.Client.builder()
                    .architecture("architecture")
                    .os("os")
                    .version("version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productFeedbackRetrieveResponse =
            ProductFeedbackRetrieveResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ProductFeedbackRetrieveResponse.Category.BUG)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .message("message")
                .source(ProductFeedbackRetrieveResponse.Source.LANGSMITH_CLI)
                .client(
                    ProductFeedbackRetrieveResponse.Client.builder()
                        .architecture("architecture")
                        .os("os")
                        .version("version")
                        .build()
                )
                .build()

        val roundtrippedProductFeedbackRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productFeedbackRetrieveResponse),
                jacksonTypeRef<ProductFeedbackRetrieveResponse>(),
            )

        assertThat(roundtrippedProductFeedbackRetrieveResponse)
            .isEqualTo(productFeedbackRetrieveResponse)
    }
}
