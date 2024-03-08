// File generated from our OpenAPI spec by Stainless. // templates/JavaSDK/components/file.ts:28:17

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RunPublicDatasetSchemaTest { // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15 //
    // templates/JavaSDK/entities/objects.ts:645:15

    @Test // templates/JavaSDK/entities/testing.ts:18:13 //
    // templates/JavaSDK/entities/objects.ts:645:15
    fun createRunPublicDatasetSchema() { // templates/JavaSDK/entities/testing.ts:18:13
        val runPublicDatasetSchema =
            RunPublicDatasetSchema.builder() // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:657:10 //
                // templates/JavaSDK/entities/objects.ts:656:16 //
                // templates/JavaSDK/entities/objects.ts:656:16
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .dottedOrder("string")
                .name("string")
                .runType(RunPublicDatasetSchema.RunType.TOOL)
                .sessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
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
                .feedbackStats(RunPublicDatasetSchema.FeedbackStats.builder().build())
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
        assertThat(runPublicDatasetSchema).isNotNull
        assertThat(runPublicDatasetSchema.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.dottedOrder()).isEqualTo("string")
        assertThat(runPublicDatasetSchema.name()).isEqualTo("string")
        assertThat(runPublicDatasetSchema.runType()).isEqualTo(RunPublicDatasetSchema.RunType.TOOL)
        assertThat(runPublicDatasetSchema.sessionId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.status()).isEqualTo("string")
        assertThat(runPublicDatasetSchema.traceId())
            .isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.childRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.completionCost()).contains(42.23)
        assertThat(runPublicDatasetSchema.completionTokens()).contains(123L)
        assertThat(runPublicDatasetSchema.directChildRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.endTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicDatasetSchema.error()).contains("string")
        assertThat(runPublicDatasetSchema.events().get())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema.executionOrder()).contains(123L)
        assertThat(runPublicDatasetSchema._extra()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema.feedbackStats())
            .contains(RunPublicDatasetSchema.FeedbackStats.builder().build())
        assertThat(runPublicDatasetSchema.firstTokenTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicDatasetSchema._inputs()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema._inputsS3Urls())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema.manifestId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.manifestS3Id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema._outputs())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema._outputsS3Urls())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema.parentRunId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.parentRunIds().get())
            .containsExactly("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema.promptCost()).contains(42.23)
        assertThat(runPublicDatasetSchema.promptTokens()).contains(123L)
        assertThat(runPublicDatasetSchema.referenceExampleId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(runPublicDatasetSchema._serialized())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(runPublicDatasetSchema.startTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(runPublicDatasetSchema.tags().get()).containsExactly("string")
        assertThat(runPublicDatasetSchema.totalCost()).contains(42.23)
        assertThat(runPublicDatasetSchema.totalTokens()).contains(123L)
    }
}
