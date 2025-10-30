// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.platform.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.ConditionGroup
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessPolicyServiceTest {

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
        val accessPolicyService = client.platform().orgs().current().accessPolicies()

        val accessPolicy =
            accessPolicyService.create(
                AccessPolicyCreateParams.builder()
                    .payload(
                        AccessPolicyCreateParams.Payload.builder()
                            .addConditionGroup(
                                ConditionGroup.builder()
                                    .addCondition(
                                        ConditionGroup.Condition.builder()
                                            .attributeKey("attribute_key")
                                            .attributeName(
                                                ConditionGroup.Condition.AttributeName
                                                    .RESOURCE_TAG_KEY
                                            )
                                            .attributeValue("attribute_value")
                                            .operator(ConditionGroup.Condition.Operator.EQUALS)
                                            .build()
                                    )
                                    .permission(ConditionGroup.Permission.ANNOTATION_QUEUES_CREATE)
                                    .resourceType("resource_type")
                                    .build()
                            )
                            .description("description")
                            .effect("effect")
                            .name("name")
                            .addRoleId("string")
                            .build()
                    )
                    .build()
            )

        accessPolicy.validate()
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
        val accessPolicyService = client.platform().orgs().current().accessPolicies()

        val accessPolicy = accessPolicyService.retrieve(JsonValue.from(mapOf<String, Any>()))

        accessPolicy.validate()
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
        val accessPolicyService = client.platform().orgs().current().accessPolicies()

        val accessPolicies = accessPolicyService.list()

        accessPolicies.validate()
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
        val accessPolicyService = client.platform().orgs().current().accessPolicies()

        accessPolicyService.delete(JsonValue.from(mapOf<String, Any>()))
    }
}
