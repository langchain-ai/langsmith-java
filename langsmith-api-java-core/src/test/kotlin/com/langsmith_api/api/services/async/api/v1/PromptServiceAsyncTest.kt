// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.TestServerExtension
import com.langsmith_api.api.client.okhttp.LangsmithApiOkHttpClientAsync
import com.langsmith_api.api.core.JsonValue
import com.langsmith_api.api.models.api.v1.prompts.InvalidToolCall
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasParams
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptParams
import com.langsmith_api.api.models.api.v1.prompts.ToolCall
import com.langsmith_api.api.models.api.v1.prompts.UsageMetadata
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PromptServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun canvas() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptServiceAsync = client.api().v1().prompts()

        val responseFuture =
            promptServiceAsync.canvas(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun invokePrompt() {
        val client =
            LangsmithApiOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .tenantId("My Tenant ID")
                .organizationId("My Organization ID")
                .build()
        val promptServiceAsync = client.api().v1().prompts()

        val responseFuture =
            promptServiceAsync.invokePrompt(
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

        val response = responseFuture.get()
        response.validate()
    }
}
