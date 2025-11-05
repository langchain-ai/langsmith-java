// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.platform.orgs.current

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClientAsync
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.platform.orgs.current.accesspolicies.AccessPolicyCreateParams
import com.langchain.smith.models.platform.orgs.current.accesspolicies.ConditionGroup
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccessPolicyServiceAsyncTest {

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
        val accessPolicyServiceAsync = client.platform().orgs().current().accessPolicies()

        val accessPolicyFuture =
            accessPolicyServiceAsync.create(
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

        val accessPolicy = accessPolicyFuture.get()
        accessPolicy.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val accessPolicyServiceAsync = client.platform().orgs().current().accessPolicies()

        val accessPolicyFuture =
            accessPolicyServiceAsync.retrieve(JsonValue.from(mapOf<String, Any>()))

        val accessPolicy = accessPolicyFuture.get()
        accessPolicy.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            LangsmithOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val accessPolicyServiceAsync = client.platform().orgs().current().accessPolicies()

        val accessPoliciesFuture = accessPolicyServiceAsync.list()

        val accessPolicies = accessPoliciesFuture.get()
        accessPolicies.validate()
    }

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
        val accessPolicyServiceAsync = client.platform().orgs().current().accessPolicies()

        val future = accessPolicyServiceAsync.delete(JsonValue.from(mapOf<String, Any>()))

        val response = future.get()
    }
}
