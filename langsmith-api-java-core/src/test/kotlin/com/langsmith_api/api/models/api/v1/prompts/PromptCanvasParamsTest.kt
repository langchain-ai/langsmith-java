// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.models.api.v1.prompts

import com.langsmith_api.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PromptCanvasParamsTest {

    @Test
    fun create() {
        PromptCanvasParams.builder()
            .addMessage(
                PromptCanvasParams.Message.AiMessage.builder()
                    .content("string")
                    .id("id")
                    .additionalKwargs(JsonValue.from(mapOf<String, Any>()))
                    .addInvalidToolCall(
                        InvalidToolCall.builder()
                            .id("id")
                            .args("args")
                            .error("error")
                            .name("name")
                            .extras(JsonValue.from(mapOf<String, Any>()))
                            .index(0L)
                            .build()
                    )
                    .name("name")
                    .responseMetadata(JsonValue.from(mapOf<String, Any>()))
                    .addToolCall(
                        ToolCall.builder()
                            .id("id")
                            .args(JsonValue.from(mapOf<String, Any>()))
                            .name("name")
                            .type(ToolCall.Type.TOOL_CALL)
                            .build()
                    )
                    .type(PromptCanvasParams.Message.AiMessage.Type.AI)
                    .usageMetadata(
                        UsageMetadata.builder()
                            .inputTokens(0L)
                            .outputTokens(0L)
                            .totalTokens(0L)
                            .inputTokenDetails(
                                UsageMetadata.InputTokenDetails.builder()
                                    .audio(0L)
                                    .cacheCreation(0L)
                                    .cacheRead(0L)
                                    .build()
                            )
                            .outputTokenDetails(
                                UsageMetadata.OutputTokenDetails.builder()
                                    .audio(0L)
                                    .reasoning(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .secrets(
                PromptCanvasParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .templateFormat(PromptCanvasParams.TemplateFormat.F_STRING)
            .artifact(
                PromptCanvasParams.Artifact.builder()
                    .id("id")
                    .addContent(
                        PromptCanvasParams.Artifact.Content.builder()
                            .content("content")
                            .index(0L)
                            .build()
                    )
                    .currentContentIndex(0L)
                    .build()
            )
            .artifactLength(PromptCanvasParams.ArtifactLength.SHORTEST)
            .customAction("custom_action")
            .highlighted(
                PromptCanvasParams.Highlighted.builder()
                    .highlightText("highlight_text")
                    .promptChunk("prompt_chunk")
                    .promptChunkEndIndex(0L)
                    .promptChunkStartIndex(0L)
                    .build()
            )
            .readingLevel(PromptCanvasParams.ReadingLevel.CHILD)
            .build()
    }

    @Test
    fun body() {
        val params =
            PromptCanvasParams.builder()
                .addMessage(
                    PromptCanvasParams.Message.AiMessage.builder()
                        .content("string")
                        .id("id")
                        .additionalKwargs(JsonValue.from(mapOf<String, Any>()))
                        .addInvalidToolCall(
                            InvalidToolCall.builder()
                                .id("id")
                                .args("args")
                                .error("error")
                                .name("name")
                                .extras(JsonValue.from(mapOf<String, Any>()))
                                .index(0L)
                                .build()
                        )
                        .name("name")
                        .responseMetadata(JsonValue.from(mapOf<String, Any>()))
                        .addToolCall(
                            ToolCall.builder()
                                .id("id")
                                .args(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .type(ToolCall.Type.TOOL_CALL)
                                .build()
                        )
                        .type(PromptCanvasParams.Message.AiMessage.Type.AI)
                        .usageMetadata(
                            UsageMetadata.builder()
                                .inputTokens(0L)
                                .outputTokens(0L)
                                .totalTokens(0L)
                                .inputTokenDetails(
                                    UsageMetadata.InputTokenDetails.builder()
                                        .audio(0L)
                                        .cacheCreation(0L)
                                        .cacheRead(0L)
                                        .build()
                                )
                                .outputTokenDetails(
                                    UsageMetadata.OutputTokenDetails.builder()
                                        .audio(0L)
                                        .reasoning(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .secrets(
                    PromptCanvasParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateFormat(PromptCanvasParams.TemplateFormat.F_STRING)
                .artifact(
                    PromptCanvasParams.Artifact.builder()
                        .id("id")
                        .addContent(
                            PromptCanvasParams.Artifact.Content.builder()
                                .content("content")
                                .index(0L)
                                .build()
                        )
                        .currentContentIndex(0L)
                        .build()
                )
                .artifactLength(PromptCanvasParams.ArtifactLength.SHORTEST)
                .customAction("custom_action")
                .highlighted(
                    PromptCanvasParams.Highlighted.builder()
                        .highlightText("highlight_text")
                        .promptChunk("prompt_chunk")
                        .promptChunkEndIndex(0L)
                        .promptChunkStartIndex(0L)
                        .build()
                )
                .readingLevel(PromptCanvasParams.ReadingLevel.CHILD)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                PromptCanvasParams.Message.ofAi(
                    PromptCanvasParams.Message.AiMessage.builder()
                        .content("string")
                        .id("id")
                        .additionalKwargs(JsonValue.from(mapOf<String, Any>()))
                        .addInvalidToolCall(
                            InvalidToolCall.builder()
                                .id("id")
                                .args("args")
                                .error("error")
                                .name("name")
                                .extras(JsonValue.from(mapOf<String, Any>()))
                                .index(0L)
                                .build()
                        )
                        .name("name")
                        .responseMetadata(JsonValue.from(mapOf<String, Any>()))
                        .addToolCall(
                            ToolCall.builder()
                                .id("id")
                                .args(JsonValue.from(mapOf<String, Any>()))
                                .name("name")
                                .type(ToolCall.Type.TOOL_CALL)
                                .build()
                        )
                        .type(PromptCanvasParams.Message.AiMessage.Type.AI)
                        .usageMetadata(
                            UsageMetadata.builder()
                                .inputTokens(0L)
                                .outputTokens(0L)
                                .totalTokens(0L)
                                .inputTokenDetails(
                                    UsageMetadata.InputTokenDetails.builder()
                                        .audio(0L)
                                        .cacheCreation(0L)
                                        .cacheRead(0L)
                                        .build()
                                )
                                .outputTokenDetails(
                                    UsageMetadata.OutputTokenDetails.builder()
                                        .audio(0L)
                                        .reasoning(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
            )
        assertThat(body.secrets())
            .isEqualTo(
                PromptCanvasParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.templateFormat()).isEqualTo(PromptCanvasParams.TemplateFormat.F_STRING)
        assertThat(body.artifact())
            .contains(
                PromptCanvasParams.Artifact.builder()
                    .id("id")
                    .addContent(
                        PromptCanvasParams.Artifact.Content.builder()
                            .content("content")
                            .index(0L)
                            .build()
                    )
                    .currentContentIndex(0L)
                    .build()
            )
        assertThat(body.artifactLength()).contains(PromptCanvasParams.ArtifactLength.SHORTEST)
        assertThat(body.customAction()).contains("custom_action")
        assertThat(body.highlighted())
            .contains(
                PromptCanvasParams.Highlighted.builder()
                    .highlightText("highlight_text")
                    .promptChunk("prompt_chunk")
                    .promptChunkEndIndex(0L)
                    .promptChunkStartIndex(0L)
                    .build()
            )
        assertThat(body.readingLevel()).contains(PromptCanvasParams.ReadingLevel.CHILD)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PromptCanvasParams.builder()
                .addMessage(
                    PromptCanvasParams.Message.AiMessage.builder().content("string").build()
                )
                .secrets(
                    PromptCanvasParams.Secrets.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .templateFormat(PromptCanvasParams.TemplateFormat.F_STRING)
                .build()

        val body = params._body()

        assertThat(body.messages())
            .containsExactly(
                PromptCanvasParams.Message.ofAi(
                    PromptCanvasParams.Message.AiMessage.builder().content("string").build()
                )
            )
        assertThat(body.secrets())
            .isEqualTo(
                PromptCanvasParams.Secrets.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.templateFormat()).isEqualTo(PromptCanvasParams.TemplateFormat.F_STRING)
    }
}
