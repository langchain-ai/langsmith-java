// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessPolicyCreateParamsTest {

    @Test
    fun create() {
        AccessPolicyCreateParams.builder()
            .payload(
                AccessPolicyCreateParams.Payload.builder()
                    .addConditionGroup(
                        ConditionGroup.builder()
                            .addCondition(
                                ConditionGroup.Condition.builder()
                                    .attributeKey("attribute_key")
                                    .attributeName(
                                        ConditionGroup.Condition.AttributeName.RESOURCE_TAG_KEY
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
    }

    @Test
    fun body() {
        val params =
            AccessPolicyCreateParams.builder()
                .payload(
                    AccessPolicyCreateParams.Payload.builder()
                        .addConditionGroup(
                            ConditionGroup.builder()
                                .addCondition(
                                    ConditionGroup.Condition.builder()
                                        .attributeKey("attribute_key")
                                        .attributeName(
                                            ConditionGroup.Condition.AttributeName.RESOURCE_TAG_KEY
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

        val body = params._body()

        assertThat(body.payload())
            .contains(
                AccessPolicyCreateParams.Payload.builder()
                    .addConditionGroup(
                        ConditionGroup.builder()
                            .addCondition(
                                ConditionGroup.Condition.builder()
                                    .attributeKey("attribute_key")
                                    .attributeName(
                                        ConditionGroup.Condition.AttributeName.RESOURCE_TAG_KEY
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AccessPolicyCreateParams.builder().build()

        val body = params._body()
    }
}
