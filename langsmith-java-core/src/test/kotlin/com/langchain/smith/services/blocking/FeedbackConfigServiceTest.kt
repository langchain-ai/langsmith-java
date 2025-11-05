// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.feedbackconfigs.FeedbackConfig
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langchain.smith.models.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeedbackConfigServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun feedbackConfigs() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.feedbackConfigs()

        val feedbackConfigSchema =
            feedbackConfigService.feedbackConfigs(
                FeedbackConfigFeedbackConfigsParams.builder()
                    .feedbackConfig(
                        FeedbackConfig.builder()
                            .type(FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackConfig.Category.builder().value(0.0).label("x").build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .feedbackKey("feedback_key")
                    .isLowerScoreBetter(true)
                    .build()
            )

        feedbackConfigSchema.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveFeedbackConfigs() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.feedbackConfigs()

        val feedbackConfigSchemata =
            feedbackConfigService.retrieveFeedbackConfigs(
                FeedbackConfigRetrieveFeedbackConfigsParams.builder()
                    .addKey("string")
                    .readAfterWrite(true)
                    .build()
            )

        feedbackConfigSchemata.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateFeedbackConfigs() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.feedbackConfigs()

        val feedbackConfigSchema =
            feedbackConfigService.updateFeedbackConfigs(
                FeedbackConfigUpdateFeedbackConfigsParams.builder()
                    .feedbackKey("feedback_key")
                    .feedbackConfig(
                        FeedbackConfig.builder()
                            .type(FeedbackConfig.Type.CONTINUOUS)
                            .addCategory(
                                FeedbackConfig.Category.builder().value(0.0).label("x").build()
                            )
                            .max(0.0)
                            .min(0.0)
                            .build()
                    )
                    .isLowerScoreBetter(true)
                    .build()
            )

        feedbackConfigSchema.validate()
    }
}
