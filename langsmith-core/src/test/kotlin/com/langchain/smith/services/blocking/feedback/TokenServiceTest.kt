// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.feedback.tokens.FeedbackIngestTokenCreateSchema
import com.langchain.smith.models.feedback.tokens.TokenCreateParams
import com.langchain.smith.models.feedback.tokens.TokenListParams
import com.langchain.smith.models.feedback.tokens.TokenRetrieveParams
import com.langchain.smith.models.feedback.tokens.TokenUpdateParams
import com.langchain.smith.models.feedbackconfigs.FeedbackConfig
import com.langchain.smith.models.sessions.TimedeltaInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TokenServiceTest {

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
        val tokenService = client.feedback().tokens()

        val token =
            tokenService.create(
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

        token.validate()
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
        val tokenService = client.feedback().tokens()

        val token =
            tokenService.retrieve(
                TokenRetrieveParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction("correction")
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        token.validate()
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
        val tokenService = client.feedback().tokens()

        val token =
            tokenService.update(
                TokenUpdateParams.builder()
                    .token("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .comment("comment")
                    .correction(JsonValue.from(mapOf<String, Any>()))
                    .metadata(JsonValue.from(mapOf<String, Any>()))
                    .score(0.0)
                    .value(0.0)
                    .build()
            )

        token.validate()
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
        val tokenService = client.feedback().tokens()

        val feedbackIngestTokenSchemata =
            tokenService.list(
                TokenListParams.builder().runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )

        feedbackIngestTokenSchemata.forEach { it.validate() }
    }
}
