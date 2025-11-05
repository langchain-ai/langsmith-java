// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.runs.rules

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TriggerServiceTest {

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
        val triggerService = client.runs().rules().trigger()

        val trigger =
            triggerService.create(
                TriggerCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        trigger.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val triggerService = client.runs().rules().trigger()

        val runRulesSchema = triggerService.execute("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        runRulesSchema.validate()
    }
}
