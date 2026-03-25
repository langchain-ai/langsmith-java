@file:JvmName("PromptConverters")

package com.langchain.smith.prompts

/**
 * Converts a formatted [PromptValue] to a typed OpenAI [ChatCompletionCreateParams.Builder].
 *
 * The returned builder has messages (and structured output response format, if applicable) already
 * set. Call `.model(...)` and any other options, then `.build()`.
 *
 * ## Example (Java)
 *
 * ```java
 * import static com.langchain.smith.prompts.PromptConverters.convertToOpenAIParams;
 *
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 *
 * ChatCompletion completion = openai.chat().completions().create(
 *     convertToOpenAIParams(formattedPrompt)
 *         .model(ChatModel.GPT_4_1_MINI)
 *         .build());
 * ```
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * import com.langchain.smith.prompts.convertToOpenAIParams
 *
 * val completion = openai.chat().completions().create(
 *     convertToOpenAIParams(formattedPrompt)
 *         .model(ChatModel.GPT_4_1_MINI)
 *         .build())
 * ```
 *
 * @param promptValue the formatted prompt value from [Prompt.invoke]
 * @param strictStructuredOutput whether to enable strict schema validation for structured outputs.
 *   Defaults to `true`, which guarantees the response matches the schema exactly but requires
 *   `additionalProperties: false` on all object nodes (injected automatically).
 * @return a [ChatCompletionCreateParams.Builder] with messages and response format set
 * @see Prompt.invoke
 */
@JvmOverloads
fun convertToOpenAIParams(
    promptValue: PromptValue,
    strictStructuredOutput: Boolean = true,
): com.openai.models.chat.completions.ChatCompletionCreateParams.Builder {
    val pm = promptValue.promptMessages
    val builder = com.openai.models.chat.completions.ChatCompletionCreateParams.builder()

    for (msg in pm.messages) {
        when (msg.role) {
            PromptMessage.Role.SYSTEM ->
                builder.addMessage(
                    com.openai.models.chat.completions.ChatCompletionMessageParam.ofSystem(
                        com.openai.models.chat.completions.ChatCompletionSystemMessageParam
                            .builder()
                            .content(msg.template)
                            .build()
                    )
                )
            PromptMessage.Role.AI ->
                builder.addMessage(
                    com.openai.models.chat.completions.ChatCompletionMessageParam.ofAssistant(
                        com.openai.models.chat.completions.ChatCompletionAssistantMessageParam
                            .builder()
                            .content(msg.template)
                            .build()
                    )
                )
            PromptMessage.Role.TOOL -> {
                builder.addMessage(
                    com.openai.models.chat.completions.ChatCompletionMessageParam.ofTool(
                        com.openai.models.chat.completions.ChatCompletionToolMessageParam.builder()
                            .toolCallId(msg.toolCallId ?: "")
                            .content(msg.template)
                            .build()
                    )
                )
            }
            else ->
                builder.addMessage(
                    com.openai.models.chat.completions.ChatCompletionMessageParam.ofUser(
                        com.openai.models.chat.completions.ChatCompletionUserMessageParam.builder()
                            .content(msg.template)
                            .build()
                    )
                )
        }
    }

    val outputSchema = pm.outputSchema
    if (outputSchema != null) {
        val schemaName = (outputSchema["title"] as? String) ?: "structured_output"
        val resolvedSchema =
            if (strictStructuredOutput) strictSchemaForStructuredOutput(outputSchema)
            else outputSchema
        val schemaBuilder = com.openai.models.ResponseFormatJsonSchema.JsonSchema.Schema.builder()
        resolvedSchema.forEach { (k, v) ->
            schemaBuilder.putAdditionalProperty(k, com.openai.core.JsonValue.from(v))
        }
        builder.responseFormat(
            com.openai.models.chat.completions.ChatCompletionCreateParams.ResponseFormat
                .ofJsonSchema(
                    com.openai.models.ResponseFormatJsonSchema.builder()
                        .jsonSchema(
                            com.openai.models.ResponseFormatJsonSchema.JsonSchema.builder()
                                .name(schemaName)
                                .strict(strictStructuredOutput)
                                .schema(schemaBuilder.build())
                                .build()
                        )
                        .build()
                )
        )
    }

    return builder
}

/**
 * Converts a formatted [PromptValue] to a typed Anthropic [MessageCreateParams.Builder].
 *
 * The returned builder has system message, messages, and structured output config (if applicable)
 * already set. Call `.model(...)`, `.maxTokens(...)`, and any other options, then `.build()`.
 *
 * Requires `com.anthropic:anthropic-java` (>= 2.18.0) as a dependency.
 *
 * ## Example (Java)
 *
 * ```java
 * import static com.langchain.smith.prompts.PromptConverters.convertToAnthropicParams;
 *
 * Prompt prompt = promptClient.pull("my-org/joke-generator");
 * PromptValue formattedPrompt = prompt.invoke(Map.of("topic", "cats"));
 *
 * Message message = anthropic.messages().create(
 *     convertToAnthropicParams(formattedPrompt)
 *         .model(Model.CLAUDE_SONNET_4_6)
 *         .maxTokens(1024)
 *         .build());
 * ```
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * import com.langchain.smith.prompts.convertToAnthropicParams
 *
 * val message = anthropic.messages().create(
 *     convertToAnthropicParams(formattedPrompt)
 *         .model(Model.CLAUDE_SONNET_4_6)
 *         .maxTokens(1024)
 *         .build())
 * ```
 *
 * @param promptValue the formatted prompt value from [Prompt.invoke]
 * @param strictStructuredOutput whether to inject `additionalProperties: false` into the schema.
 *   Defaults to `true`, which is required by Anthropic's `output_config` schemas.
 * @return a [MessageCreateParams.Builder] with system, messages, and output config set
 * @see Prompt.invoke
 */
@JvmOverloads
fun convertToAnthropicParams(
    promptValue: PromptValue,
    strictStructuredOutput: Boolean = true,
): com.anthropic.models.messages.MessageCreateParams.Builder {
    val pm = promptValue.promptMessages
    val builder =
        try {
            com.anthropic.models.messages.MessageCreateParams.builder()
        } catch (e: NoClassDefFoundError) {
            throw IllegalStateException(
                "Anthropic SDK not found. Add com.anthropic:anthropic-java to your dependencies.",
                e,
            )
        }

    val (systemMessages, nonSystemMessages) =
        pm.messages.partition { it.role == PromptMessage.Role.SYSTEM }

    val system = systemMessages.joinToString("\n") { it.template }
    if (system.isNotEmpty()) {
        builder.system(system)
    }

    for (msg in nonSystemMessages) {
        val role =
            when (msg.role) {
                PromptMessage.Role.HUMAN -> com.anthropic.models.messages.MessageParam.Role.USER
                PromptMessage.Role.AI -> com.anthropic.models.messages.MessageParam.Role.ASSISTANT
                else -> com.anthropic.models.messages.MessageParam.Role.USER
            }
        builder.addMessage(
            com.anthropic.models.messages.MessageParam.builder()
                .role(role)
                .content(msg.template)
                .build()
        )
    }

    val outputSchema = pm.outputSchema
    if (outputSchema != null) {
        val resolvedSchema =
            if (strictStructuredOutput) strictSchemaForStructuredOutput(outputSchema)
            else outputSchema
        val schemaBuilder = com.anthropic.models.messages.JsonOutputFormat.Schema.builder()
        resolvedSchema.forEach { (k, v) ->
            schemaBuilder.putAdditionalProperty(k, com.anthropic.core.JsonValue.from(v))
        }
        builder.outputConfig(
            com.anthropic.models.messages.OutputConfig.builder()
                .format(
                    com.anthropic.models.messages.JsonOutputFormat.builder()
                        .schema(schemaBuilder.build())
                        .build()
                )
                .build()
        )
    }

    return builder
}
