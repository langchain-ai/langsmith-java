// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.runs.rules

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.models.runs.rules.trigger.TriggerCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TriggerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val triggerServiceAsync = client.runs().rules().trigger()

        val triggerFuture =
            triggerServiceAsync.create(
                TriggerCreateParams.builder()
                    .datasetId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addRuleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val trigger = triggerFuture.get()
        trigger.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun execute() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val triggerServiceAsync = client.runs().rules().trigger()

        val runRulesSchemaFuture =
            triggerServiceAsync.execute("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val runRulesSchema = runRulesSchemaFuture.get()
        runRulesSchema.validate()
    }
}
