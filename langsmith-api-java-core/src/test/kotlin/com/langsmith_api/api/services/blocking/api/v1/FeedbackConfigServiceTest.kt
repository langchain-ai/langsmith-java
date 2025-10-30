// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClient
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfig
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigRetrieveFeedbackConfigsParams
import com.langsmith_api.api.models.api.v1.feedbackconfigs.FeedbackConfigUpdateFeedbackConfigsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FeedbackConfigServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun feedbackConfigs() {
        val client =
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.api().v1().feedbackConfigs()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.api().v1().feedbackConfigs()

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
            LangsmithApiOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val feedbackConfigService = client.api().v1().feedbackConfigs()

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
