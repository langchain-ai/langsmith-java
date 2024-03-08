// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(
    TestServerExtension::class
) // templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15 //
// templates/JavaSDK/services.ts:298:15 // templates/JavaSDK/services.ts:298:15
class FeedbackServiceTest {

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
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.create(
                FeedbackCreateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .key("string")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("string")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .feedbackConfig(
                        FeedbackCreateParams.FeedbackConfig.builder()
                            .type(FeedbackCreateParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackCreateParams.FeedbackConfig.FeedbackCategory.builder()
                                        .value(42.23)
                                        .label("x")
                                        .build()
                                )
                            )
                            .max(42.23)
                            .min(42.23)
                            .build()
                    )
                    .feedbackSource(
                        FeedbackCreateParams.FeedbackSource.ofAppFeedbackSource(
                            FeedbackCreateParams.FeedbackSource.AppFeedbackSource.builder()
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .type("string")
                                .build()
                        )
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .score(FeedbackCreateParams.Score.ofDouble(42.23))
                    .value(FeedbackCreateParams.Value.ofDouble(42.23))
                    .build()
            )
        println(
            feedbackSchema
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        feedbackSchema.validate()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callRetrieve() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.retrieve(
                FeedbackRetrieveParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(
            feedbackSchema
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        feedbackSchema.validate()
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callUpdate() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.update(
                FeedbackUpdateParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("string")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .feedbackConfig(
                        FeedbackUpdateParams.FeedbackConfig.builder()
                            .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackUpdateParams.FeedbackConfig.FeedbackCategory.builder()
                                        .value(42.23)
                                        .label("x")
                                        .build()
                                )
                            )
                            .max(42.23)
                            .min(42.23)
                            .build()
                    )
                    .score(FeedbackUpdateParams.Score.ofDouble(42.23))
                    .value(FeedbackUpdateParams.Value.ofDouble(42.23))
                    .build()
            )
        println(
            feedbackSchema
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        feedbackSchema.validate()
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
        val feedbackService = client.feedback()
        val feedbackListResponse =
            feedbackService.list(
                FeedbackListParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .hasComment(true)
                    .hasScore(true)
                    .key(listOf("string"))
                    .limit(123L)
                    .offset(123L)
                    .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .source(listOf(FeedbackListParams.SourceType.API))
                    .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(
            feedbackListResponse
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        for (feedbackSchema: FeedbackSchema in
            feedbackListResponse) { // templates/JavaSDK/services.ts:509:10
            feedbackSchema.validate()
        }
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callDelete() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackDeleteResponse =
            feedbackService.delete(
                FeedbackDeleteParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(feedbackDeleteResponse)
    }

    @Test // templates/JavaSDK/entities/testing.ts:18:13
    fun callEager() { // templates/JavaSDK/entities/testing.ts:18:13
        val client =
            LangSmithOkHttpClient.builder() // templates/JavaSDK/services.ts:308:18 //
                // templates/JavaSDK/services.ts:307:24 //
                // templates/JavaSDK/services.ts:307:24
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.eager(
                FeedbackEagerParams.builder() // templates/JavaSDK/services.ts:464:26 //
                    // templates/JavaSDK/services.ts:479:20 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:476:10 //
                    // templates/JavaSDK/services.ts:475:17 //
                    // templates/JavaSDK/services.ts:475:17
                    .key("string")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("string")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .feedbackConfig(
                        FeedbackEagerParams.FeedbackConfig.builder()
                            .type(FeedbackEagerParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackEagerParams.FeedbackConfig.FeedbackCategory.builder()
                                        .value(42.23)
                                        .label("x")
                                        .build()
                                )
                            )
                            .max(42.23)
                            .min(42.23)
                            .build()
                    )
                    .feedbackSource(
                        FeedbackEagerParams.FeedbackSource.ofAppFeedbackSource(
                            FeedbackEagerParams.FeedbackSource.AppFeedbackSource.builder()
                                .metadata(JsonValue.from(mapOf<String, Any>()))
                                .type("string")
                                .build()
                        )
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .score(FeedbackEagerParams.Score.ofDouble(42.23))
                    .value(FeedbackEagerParams.Value.ofDouble(42.23))
                    .build()
            )
        println(
            feedbackSchema
        ) // templates/JavaSDK/services.ts:526:15 // templates/JavaSDK/services.ts:526:15
        feedbackSchema.validate()
    }
}
