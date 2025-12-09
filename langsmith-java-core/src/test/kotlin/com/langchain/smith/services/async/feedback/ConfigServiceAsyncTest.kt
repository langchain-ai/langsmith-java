// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.feedback

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.feedback.configs.ConfigDeleteParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ConfigServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val configServiceAsync = client.feedback().configs()

        val future =
            configServiceAsync.delete(
                ConfigDeleteParams.builder().feedbackKey("feedback_key").build()
            )

        val response = future.get()
    }
}
