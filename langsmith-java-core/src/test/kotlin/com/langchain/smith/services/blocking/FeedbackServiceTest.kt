// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.AppFeedbackSource
import com.langchain.smith.models.feedback.FeedbackCreateSchema
import com.langchain.smith.models.feedback.FeedbackLevel
import com.langchain.smith.models.feedback.FeedbackListParams
import com.langchain.smith.models.feedback.FeedbackRetrieveParams
import com.langchain.smith.models.feedback.FeedbackUpdateParams
import com.langchain.smith.models.feedback.SourceType
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeedbackServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val feedbackSchema =
            feedbackService.create(
                FeedbackCreateSchema.builder()
                    .key("key")
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .error(true)
                    .feedbackConfig(
                        FeedbackCreateSchema.FeedbackConfig.builder()
                            .type(FeedbackCreateSchema.FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackCreateSchema.FeedbackConfig.Category.builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackGroupId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .feedbackSource(
                        AppFeedbackSource.builder()
                            .metadata(JsonValue.from(mapOf<String, Any>()))
                            .type(AppFeedbackSource.Type.APP)
                            .build()
                    )
                    .modifiedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .score(0.0)
                    .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .value(0.0)
                    .build()
            )

        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val feedbackSchema =
            feedbackService.retrieve(
                FeedbackRetrieveParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .includeUserNames(true)
                    .build()
            )

        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val feedbackSchema =
            feedbackService.update(
                FeedbackUpdateParams.builder()
                    .feedbackId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .feedbackConfig(
                        FeedbackUpdateParams.FeedbackConfig.builder()
                            .type(FeedbackUpdateParams.FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackUpdateParams.FeedbackConfig.Category.builder()
                                    .value(0.0)
                                    .label("x")
                                    .build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        feedbackSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val feedbackSchemata =
            feedbackService.list(
                FeedbackListParams.builder()
                    .comparativeExperimentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .hasComment(true)
                    .hasScore(true)
                    .includeUserNames(true)
                    .addKey("string")
                    .level(FeedbackLevel.RUN)
                    .limit(1L)
                    .maxCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .minCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .offset(0L)
                    .addRun("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSession("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addSource(SourceType.API)
                    .addUser("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        feedbackSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackService = client.feedback()

        val feedback = feedbackService.delete("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        feedback.validate()
    }
}
