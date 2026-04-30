// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.feedback

import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.feedback.configs.ConfigDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ConfigServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClient.builder().apiKey("My API Key").tenantId("My Tenant ID").build()
        val configService = client.feedback().configs()

        configService.delete(ConfigDeleteParams.builder().feedbackKey("feedback_key").build())
    }
}
