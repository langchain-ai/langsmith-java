// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.feedback

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.feedback.tokens.FeedbackIngestTokenCreateSchema
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenCreateParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenListParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenRetrieveParams
import com.langsmith_api.api.models.api.v1.feedback.tokens.TokenUpdateParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import com.langsmith_api.api.models.api.v1.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tokenServiceAsync = client.api().v1().feedback().tokens()

        val tokenFuture =
            tokenServiceAsync.create(
                TokenCreateParams.builder()
                    .body(
                        FeedbackIngestTokenCreateSchema.builder()
                            .feedbackKey("feedback_key")
                            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiresIn(
                                TimedeltaInput.builder().days(0L).hours(0L).minutes(0L).build()
                            )
                            .feedbackConfig(
                                FeedbackConfig.builder()
                                    .type(FeedbackConfig.Type.CONTINUOUS)
                                    .addCategory(
                                        FeedbackConfig.Category.builder()
                                            .value(0.0)
                                            .label("x")
                                            .build()
                                    )
                                    .max(0.0)
                                    .min(0.0)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val token = tokenFuture.get()
        token.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tokenServiceAsync = client.api().v1().feedback().tokens()

        val tokenFuture =
            tokenServiceAsync.retrieve(
                TokenRetrieveParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction("correction")
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        val token = tokenFuture.get()
        token.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tokenServiceAsync = client.api().v1().feedback().tokens()

        val tokenFuture =
            tokenServiceAsync.update(
                TokenUpdateParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        val token = tokenFuture.get()
        token.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val tokenServiceAsync = client.api().v1().feedback().tokens()

        val feedbackIngestTokenSchemataFuture =
            tokenServiceAsync.list(
                TokenListParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )

        val feedbackIngestTokenSchemata = feedbackIngestTokenSchemataFuture.get()
        feedbackIngestTokenSchemata.forEach { it.validate() }
    }
}
