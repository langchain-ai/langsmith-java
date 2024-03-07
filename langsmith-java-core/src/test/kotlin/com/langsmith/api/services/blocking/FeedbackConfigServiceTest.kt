// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FeedbackConfigServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackConfigService = client.feedbackConfigs()
        val feedbackConfigSchema =
            feedbackConfigService.create(
                FeedbackConfigCreateParams.builder()
                    .feedbackConfig(
                        FeedbackConfigCreateParams.FeedbackConfig.builder()
                            .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackConfigCreateParams.FeedbackConfig.Category.builder()
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
                    .build()
            )
        println(feedbackConfigSchema)
        feedbackConfigSchema.validate()
    }

    @Test
    fun callList() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackConfigService = client.feedbackConfigs()
        val feedbackConfigListResponse =
            feedbackConfigService.list(FeedbackConfigListParams.builder().build())
        println(feedbackConfigListResponse)
        for (feedbackConfigSchema: FeedbackConfigSchema in feedbackConfigListResponse) {
            feedbackConfigSchema.validate()
        }
    }
}
