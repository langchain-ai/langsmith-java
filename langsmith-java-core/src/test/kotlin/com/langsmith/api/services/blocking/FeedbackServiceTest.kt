// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.services.blocking

import com.langsmith.api.TestServerExtension
import com.langsmith.api.client.okhttp.LangSmithOkHttpClient
import com.langsmith.api.core.JsonValue
import com.langsmith.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class FeedbackServiceTest {

    @Test
    fun callCreate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.create(
                FeedbackCreateParams.builder()
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
                                    FeedbackCreateParams.FeedbackConfig.Category.builder()
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
        println(feedbackSchema)
        feedbackSchema.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.retrieve(
                FeedbackRetrieveParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(feedbackSchema)
        feedbackSchema.validate()
    }

    @Test
    fun callUpdate() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.update(
                FeedbackUpdateParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("string")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .feedbackConfig(
                        FeedbackUpdateParams.FeedbackConfig.builder()
                            .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                            .categories(
                                listOf(
                                    FeedbackUpdateParams.FeedbackConfig.Category.builder()
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
        println(feedbackSchema)
        feedbackSchema.validate()
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
        val feedbackService = client.feedback()
        val feedbackListResponse =
            feedbackService.list(
                FeedbackListParams.builder()
                    .hasComment(true)
                    .hasScore(true)
                    .key(listOf("string"))
                    .limit(123L)
                    .offset(123L)
                    .run(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .session(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .source(listOf(FeedbackListParams.Source.API))
                    .user(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                    .build()
            )
        println(feedbackListResponse)
        for (feedbackSchema: FeedbackSchema in feedbackListResponse) {
            feedbackSchema.validate()
        }
    }

    @Test
    fun callDelete() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackDeleteResponse =
            feedbackService.delete(
                FeedbackDeleteParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(feedbackDeleteResponse)
    }

    @Test
    fun callEager() {
        val client =
            LangSmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .bearerToken("My Bearer Token")
                .build()
        val feedbackService = client.feedback()
        val feedbackSchema =
            feedbackService.eager(
                FeedbackEagerParams.builder()
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
                                    FeedbackEagerParams.FeedbackConfig.Category.builder()
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
        println(feedbackSchema)
        feedbackSchema.validate()
    }
}
