// File generated from our OpenAPI spec by Stainless.

package com.langsmith.api.models

import com.langsmith.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ListPublicDatasetRunsResponseTest {

    @Test
    fun createListPublicDatasetRunsResponse() {
        val listPublicDatasetRunsResponse =
            ListPublicDatasetRunsResponse.builder()
                .cursors(ListPublicDatasetRunsResponse.Cursors.builder().build())
                .runs(
                    listOf(
                        RunPublicDatasetSchema.builder()
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
                    )
                )
                .parsedQuery("string")
                .build()
        assertThat(listPublicDatasetRunsResponse).isNotNull
        assertThat(listPublicDatasetRunsResponse.cursors())
            .isEqualTo(ListPublicDatasetRunsResponse.Cursors.builder().build())
        assertThat(listPublicDatasetRunsResponse.runs())
            .containsExactly(
                RunPublicDatasetSchema.builder()
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
            )
        assertThat(listPublicDatasetRunsResponse.parsedQuery()).contains("string")
    }
}
