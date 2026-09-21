// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.models.productfeedback

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langchain.smith.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProductFeedbackCreateResponseTest {

    @Test
    fun create() {
        val productFeedbackCreateResponse =
            ProductFeedbackCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ProductFeedbackCreateResponse.Category.BUG)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .message("message")
                .source(ProductFeedbackCreateResponse.Source.LANGSMITH_CLI)
                .client(
                    ProductFeedbackCreateResponse.Client.builder()
                        .architecture("architecture")
                        .os("os")
                        .version("version")
                        .build()
                )
                .build()

        assertThat(productFeedbackCreateResponse.id())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(productFeedbackCreateResponse.category())
            .isEqualTo(ProductFeedbackCreateResponse.Category.BUG)
        assertThat(productFeedbackCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(productFeedbackCreateResponse.message()).isEqualTo("message")
        assertThat(productFeedbackCreateResponse.source())
            .isEqualTo(ProductFeedbackCreateResponse.Source.LANGSMITH_CLI)
        assertThat(productFeedbackCreateResponse.client())
            .contains(
                ProductFeedbackCreateResponse.Client.builder()
                    .architecture("architecture")
                    .os("os")
                    .version("version")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val productFeedbackCreateResponse =
            ProductFeedbackCreateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .category(ProductFeedbackCreateResponse.Category.BUG)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .message("message")
                .source(ProductFeedbackCreateResponse.Source.LANGSMITH_CLI)
                .client(
                    ProductFeedbackCreateResponse.Client.builder()
                        .architecture("architecture")
                        .os("os")
                        .version("version")
                        .build()
                )
                .build()

        val roundtrippedProductFeedbackCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(productFeedbackCreateResponse),
                jacksonTypeRef<ProductFeedbackCreateResponse>(),
            )

        assertThat(roundtrippedProductFeedbackCreateResponse)
            .isEqualTo(productFeedbackCreateResponse)
    }
}
