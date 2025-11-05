// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.alerts.AlertActionBase
import com.langchain.smith.models.platform.alerts.AlertCreateParams
import com.langchain.smith.models.platform.alerts.AlertDeleteParams
import com.langchain.smith.models.platform.alerts.AlertRetrieveParams
import com.langchain.smith.models.platform.alerts.AlertRuleBase
import com.langchain.smith.models.platform.alerts.AlertUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AlertServiceTest {

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
        val alertService = client.platform().alerts()

        val alertRuleResponse =
            alertService.create(
                AlertCreateParams.builder()
                    .sessionId(JsonValue.from(mapOf<String, Any>()))
                    .addAction(
                        AlertActionBase.builder()
                            .config(JsonValue.from(mapOf<String, Any>()))
                            .target(AlertActionBase.Target.PAGERDUTY)
                            .id("id")
                            .alertRuleId("alert_rule_id")
                            .build()
                    )
                    .rule(
                        AlertRuleBase.builder()
                            .aggregation(AlertRuleBase.Aggregation.AVG)
                            .attribute(AlertRuleBase.Attribute.LATENCY)
                            .description("description")
                            .name("name")
                            .operator(AlertRuleBase.Operator.GTE)
                            .type(AlertRuleBase.Type.THRESHOLD)
                            .windowMinutes(15L)
                            .id("id")
                            .denominatorFilter("denominator_filter")
                            .filter("filter")
                            .threshold(0.0)
                            .thresholdMultiplier(0.0)
                            .thresholdWindowMinutes(60L)
                            .build()
                    )
                    .build()
            )

        alertRuleResponse.validate()
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
        val alertService = client.platform().alerts()

        val alertRuleResponse =
            alertService.retrieve(
                AlertRetrieveParams.builder()
                    .sessionId(JsonValue.from(mapOf<String, Any>()))
                    .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        alertRuleResponse.validate()
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
        val alertService = client.platform().alerts()

        val alert =
            alertService.update(
                AlertUpdateParams.builder()
                    .sessionId(JsonValue.from(mapOf<String, Any>()))
                    .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                    .addAction(
                        AlertActionBase.builder()
                            .config(JsonValue.from(mapOf<String, Any>()))
                            .target(AlertActionBase.Target.PAGERDUTY)
                            .id("id")
                            .alertRuleId("alert_rule_id")
                            .build()
                    )
                    .rule(
                        AlertRuleBase.builder()
                            .aggregation(AlertRuleBase.Aggregation.AVG)
                            .attribute(AlertRuleBase.Attribute.LATENCY)
                            .description("description")
                            .name("name")
                            .operator(AlertRuleBase.Operator.GTE)
                            .type(AlertRuleBase.Type.THRESHOLD)
                            .windowMinutes(15L)
                            .id("id")
                            .denominatorFilter("denominator_filter")
                            .filter("filter")
                            .threshold(0.0)
                            .thresholdMultiplier(0.0)
                            .thresholdWindowMinutes(60L)
                            .build()
                    )
                    .build()
            )

        alert.validate()
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
        val alertService = client.platform().alerts()

        val alert =
            alertService.delete(
                AlertDeleteParams.builder()
                    .sessionId(JsonValue.from(mapOf<String, Any>()))
                    .alertRuleId(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )

        alert.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun test() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val alertService = client.platform().alerts()

        val response = alertService.test(JsonValue.from(mapOf<String, Any>()))

        response.validate()
    }
}
