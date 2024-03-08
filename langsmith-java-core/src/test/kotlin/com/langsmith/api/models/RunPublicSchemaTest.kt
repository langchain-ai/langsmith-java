// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunPublicSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createRunPublicSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val runPublicSchema =
            RunPublicSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dottedOrder("string")
                .name("string")
                .runType(RunPublicSchema.RunType.TOOL)
                .status("string")
                .traceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .childRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .completionCost(42.23)
                .completionTokens(123L)
                .directChildRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .error("string")
                .events(listOf(JsonValue.from(mapOf<String, Any>())))
                .executionOrder(123L)
                .extra(JsonValue.from(mapOf<String, Any>()))
                .feedbackStats(RunPublicSchema.FeedbackStats.builder().build())
                .firstTokenTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inputs(JsonValue.from(mapOf<String, Any>()))
                .inputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                .manifestId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .manifestS3Id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .outputs(JsonValue.from(mapOf<String, Any>()))
                .outputsS3Urls(JsonValue.from(mapOf<String, Any>()))
                .parentRunId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .parentRunIds(listOf("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e"))
                .promptCost(42.23)
                .promptTokens(123L)
                .referenceExampleId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .serialized(JsonValue.from(mapOf<String, Any>()))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .tags(listOf("string"))
                .totalCost(42.23)
                .totalTokens(123L)
                .build()
        assertThat(runPublicSchema).isNotNull
        assertThat(runPublicSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.dottedOrder()).isEqualTo("string")
        assertThat(runPublicSchema.name()).isEqualTo("string")
        assertThat(runPublicSchema.runType()).isEqualTo(RunPublicSchema.RunType.TOOL)
        assertThat(runPublicSchema.status()).isEqualTo("string")
        assertThat(runPublicSchema.traceId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.childRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.completionCost()).contains(42.23)
        assertThat(runPublicSchema.completionTokens()).contains(123L)
        assertThat(runPublicSchema.directChildRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicSchema.error()).contains("string")
        assertThat(runPublicSchema.events().get())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema.executionOrder()).contains(123L)
        assertThat(runPublicSchema._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema.feedbackStats())
            .contains(RunPublicSchema.FeedbackStats.builder().build())
        assertThat(runPublicSchema.firstTokenTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicSchema._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema._inputsS3Urls()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema.manifestId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.manifestS3Id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema._outputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema._outputsS3Urls()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema.parentRunId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.parentRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema.promptCost()).contains(42.23)
        assertThat(runPublicSchema.promptTokens()).contains(123L)
        assertThat(runPublicSchema.referenceExampleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicSchema._serialized()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicSchema.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicSchema.tags().get()).containsExactly("string")
        assertThat(runPublicSchema.totalCost()).contains(42.23)
        assertThat(runPublicSchema.totalTokens()).contains(123L)
    }
}
