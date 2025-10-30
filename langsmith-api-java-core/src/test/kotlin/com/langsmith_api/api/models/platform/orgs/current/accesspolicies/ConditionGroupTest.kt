// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.platform.orgs.current.accesspolicies

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.langsmith_api.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConditionGroupTest {

    @Test
    fun create() {
        val conditionGroup =
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

        assertThat(conditionGroup.conditions().getOrNull())
            .containsExactly(
                ConditionGroup.Condition.builder()
                    .attributeKey("attribute_key")
                    .attributeName(ConditionGroup.Condition.AttributeName.RESOURCE_TAG_KEY)
                    .attributeValue("attribute_value")
                    .operator(ConditionGroup.Condition.Operator.EQUALS)
                    .build()
            )
        assertThat(conditionGroup.permission())
            .contains(ConditionGroup.Permission.ANNOTATION_QUEUES_CREATE)
        assertThat(conditionGroup.resourceType()).contains("resource_type")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conditionGroup =
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

        val roundtrippedConditionGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conditionGroup),
                jacksonTypeRef<ConditionGroup>(),
            )

        assertThat(roundtrippedConditionGroup).isEqualTo(conditionGroup)
    }
}
