// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class FeedbackConfigServiceTest {

    @Test // templates/JavaSDK/entities/testing.ts:18:13 // templates/JavaSDK/services.ts:298:15
    fun callCreate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackConfigService = client.feedbackConfigs()
        val feedbackConfigSchema =
            feedbackConfigService.create(
                FeedbackConfigCreateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .feedbackConfig(
                        FeedbackConfigCreateParams.FeedbackConfig.builder()
                            .type(FeedbackConfigCreateParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackConfigCreateParams.FeedbackConfig.FeedbackCategory
                                        .builder()
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
        println(
            feedbackConfigSchema
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        feedbackConfigSchema.validate()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callList() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackConfigService = client.feedbackConfigs()
        val feedbackConfigListResponse =
            feedbackConfigService.list(
                FeedbackConfigListParams.builder().build()
            ) // templates/JavaSDK/services.ts:475:17 // templates/JavaSDK/services.ts:475:17
        println(
            feedbackConfigListResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (feedbackConfigSchema: FeedbackConfigSchema in
            feedbackConfigListResponse) { // templates/JavaSDK/services.ts:509:10
            feedbackConfigSchema.validate()
        }
    }
}
