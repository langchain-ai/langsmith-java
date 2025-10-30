// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessPolicyTest {

    @Test
    fun create() {
        val accessPolicy =
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

        assertThat(accessPolicy.id()).contains("id")
        assertThat(accessPolicy.conditionGroups().getOrNull())
            .containsExactly(
                ConditionGroup.builder()
                    .addCondition(
                        ConditionGroup.Condition.builder()
                            .attributeKey("attribute_key")
                            .attributeName(ConditionGroup.Condition.AttributeName.RESOURCE_TAG_KEY)
                            .attributeValue("attribute_value")
                            .operator(ConditionGroup.Condition.Operator.EQUALS)
                            .build()
                    )
                    .permission(ConditionGroup.Permission.ANNOTATION_QUEUES_CREATE)
                    .resourceType("resource_type")
                    .build()
            )
        assertThat(accessPolicy.createdAt()).contains("created_at")
        assertThat(accessPolicy.description()).contains("description")
        assertThat(accessPolicy.effect()).contains("effect")
        assertThat(accessPolicy.name()).contains("name")
        assertThat(accessPolicy.roleIds().getOrNull()).containsExactly("string")
        assertThat(accessPolicy.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessPolicy =
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

        val roundtrippedAccessPolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessPolicy),
                jacksonTypeRef<AccessPolicy>(),
            )

        assertThat(roundtrippedAccessPolicy).isEqualTo(accessPolicy)
    }
}
