// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.langchain.smith.TestServerExtension
import com.langchain.smith.client.okhttp.LangsmithOkHttpClient
import com.langchain.smith.core.JsonValue
import com.langchain.smith.models.prompts.InvalidToolCall
import com.langchain.smith.models.prompts.PromptCanvasParams
import com.langchain.smith.models.prompts.PromptInvokePromptParams
import com.langchain.smith.models.prompts.ToolCall
import com.langchain.smith.models.prompts.UsageMetadata
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun canvas() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptService = client.prompts()

        val response =
            promptService.canvas(
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
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invokePrompt() {
        val client =
            LangsmithOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptService = client.prompts()

        val response =
            promptService.invokePrompt(
                PromptInvokePromptParams.builder()
                    .inputs(JsonValue.from(mapOf<String, Any>()))
                    .addMessage(
                        listOf(
                            JsonValue.from(mapOf<String, Any>()),
                            JsonValue.from(mapOf<String, Any>()),
                        )
                    )
                    .templateFormat("template_format")
                    .build()
            )

        response.validate()
    }
}
