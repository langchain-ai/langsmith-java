// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FeedbackConfigSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createFeedbackConfigSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val feedbackConfigSchema =
            FeedbackConfigSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .feedbackConfig(
                    FeedbackConfigSchema.FeedbackConfig.builder()
                        .type(FeedbackConfigSchema.FeedbackConfig.Type.CONTINUOUS)
                        .categories(
                            listOf(
                                FeedbackConfigSchema.FeedbackConfig.FeedbackCategory.builder()
                                    .value(42.23)
                                    .label("x")
                                    .build()
                            )
                        )
                        .max(42.23)
                        .min(42.23)
                        .build()
                )
                .feedbackKey("string")
                .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tenantId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()
        assertThat(feedbackConfigSchema).isNotNull
        assertThat(feedbackConfigSchema.feedbackConfig())
            .isEqualTo(
                FeedbackConfigSchema.FeedbackConfig
                    .builder() // templates/JavaSDK/entities/objects.ts:717:13
                    .type(FeedbackConfigSchema.FeedbackConfig.Type.CONTINUOUS)
                    .categories(
                        listOf(
                            FeedbackConfigSchema.FeedbackConfig.FeedbackCategory.builder()
                                .value(42.23)
                                .label("x")
                                .build()
                        )
                    )
                    .max(42.23)
                    .min(42.23)
                    .build()
            )
        assertThat(feedbackConfigSchema.feedbackKey()).isEqualTo("string")
        assertThat(feedbackConfigSchema.modifiedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(feedbackConfigSchema.tenantId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
