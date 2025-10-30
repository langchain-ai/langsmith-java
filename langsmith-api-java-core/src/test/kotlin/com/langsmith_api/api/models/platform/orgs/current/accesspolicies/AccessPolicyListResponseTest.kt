// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessPolicyListResponseTest {

    @Test
    fun create() {
        val accessPolicyListResponse =
            AccessPolicyListResponse.builder()
                .addAccessPolicy(
                    AccessPolicy.builder()
                        .id("id")
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
                        .createdAt("created_at")
                        .description("description")
                        .effect("effect")
                        .name("name")
                        .addRoleId("string")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        assertThat(accessPolicyListResponse.accessPolicies().getOrNull())
            .containsExactly(
                AccessPolicy.builder()
                    .id("id")
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
                    .createdAt("created_at")
                    .description("description")
                    .effect("effect")
                    .name("name")
                    .addRoleId("string")
                    .updatedAt("updated_at")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessPolicyListResponse =
            AccessPolicyListResponse.builder()
                .addAccessPolicy(
                    AccessPolicy.builder()
                        .id("id")
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
                        .createdAt("created_at")
                        .description("description")
                        .effect("effect")
                        .name("name")
                        .addRoleId("string")
                        .updatedAt("updated_at")
                        .build()
                )
                .build()

        val roundtrippedAccessPolicyListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessPolicyListResponse),
                jacksonTypeRef<AccessPolicyListResponse>(),
            )

        assertThat(roundtrippedAccessPolicyListResponse).isEqualTo(accessPolicyListResponse)
    }
}
