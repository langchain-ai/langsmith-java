package com.langchain.smith.wrappers.openai

import com.openai.core.ClientOptions
import com.openai.core.RequestOptions
import com.openai.core.http.StreamResponse
import com.openai.helpers.ChatCompletionAccumulator
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionChunk
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.ChatCompletionStreamOptions
import com.openai.models.chat.completions.StructuredChatCompletion
import com.openai.models.chat.completions.StructuredChatCompletionCreateParams
import com.openai.services.blocking.ChatService
import com.openai.services.blocking.chat.ChatCompletionService
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import java.util.function.Consumer
import java.util.regex.Pattern
import java.util.stream.Stream
import kotlin.jvm.optionals.getOrNull

/** Wrapped ChatService that adds OpenTelemetry tracing to chat completion operations. */
internal class WrappedChatService(private val delegate: ChatService) : ChatService {

    override fun withRawResponse() = delegate.withRawResponse()

    override fun withOptions(options: Consumer<ClientOptions.Builder>) =
        WrappedChatService(delegate.withOptions(options))

    override fun completions(): ChatCompletionService =
        WrappedChatCompletionService(delegate.completions())

    private class WrappedChatCompletionService(private val delegate: ChatCompletionService) :
        ChatCompletionService {

        override fun withRawResponse() = delegate.withRawResponse()

        override fun withOptions(options: Consumer<ClientOptions.Builder>) =
            WrappedChatCompletionService(delegate.withOptions(options))

        override fun messages() = delegate.messages()

        override fun create(params: ChatCompletionCreateParams): ChatCompletion =
            createChat(params, null)

        override fun create(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions,
        ): ChatCompletion = createChat(params, requestOptions)

        private fun createChat(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions?,
        ): ChatCompletion {
            val model = params.model()?.toString()
            val span = TracingUtils.createSpanBuilder(model, "chat").startSpan()
            try {
                span.makeCurrent().use {
                    setExperimentContextAttributes(span)
                    TracingUtils.setRequestAttributes(span, model)
                    TracingUtils.setRequestParameters(
                        span,
                        params.temperature().orElse(null),
                        params.topP().orElse(null),
                        params.maxCompletionTokens().orElse(null),
                    )
                    val promptTextNonStream =
                        extractPromptFromParams(params)?.takeIf { it.isNotEmpty() }
                    promptTextNonStream?.let {
                        span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), it)
                    }
                    TracingUtils.setInputMessages(span, formatInputMessages(params))
                    val result =
                        if (requestOptions == null) delegate.create(params)
                        else delegate.create(params, requestOptions)
                    applyChatCompletionToSpan(span, result)
                    return result
                }
            } catch (e: Exception) {
                TracingUtils.recordException(span, e)
                throw e
            } finally {
                span.end()
            }
        }

        /**
         * Applies completion output, gen_ai.completion JSON, and usage to the span (shared by
         * non-streaming and streaming).
         */
        private fun applyChatCompletionToSpan(span: Span, completion: ChatCompletion) {
            formatOutputMessages(completion).let { TracingUtils.setOutputMessages(span, it) }
            span.setAttribute(
                AttributeKey.stringKey("gen_ai.completion"),
                "{\"messages\":${formatOutputMessages(completion)}}",
            )
            val responseModel = completion.model()
            val finishReason =
                completion.choices().firstOrNull()?.finishReason()?.toString() ?: "stop"
            TracingUtils.setResponseMetadata(span, responseModel, finishReason)
            completion.usage().ifPresent { usage ->
                TracingUtils.setResponseAttributes(
                    span,
                    usage.promptTokens().toLong(),
                    usage.completionTokens().toLong(),
                    usage.totalTokens().toLong(),
                )
            }
        }

        private fun setExperimentContextAttributes(span: Span) {
            ExperimentContext.current()
                .getReferenceExampleId()
                .filter { it.isNotEmpty() }
                .ifPresent {
                    span.setAttribute(AttributeKey.stringKey("langsmith.reference_example_id"), it)
                }
            ExperimentContext.current()
                .getSessionId()
                .filter { it.isNotEmpty() }
                .ifPresent {
                    span.setAttribute(AttributeKey.stringKey("langsmith.trace.session_id"), it)
                }
            for ((key, value) in ExperimentContext.current().getMetadata()) {
                span.setAttribute(AttributeKey.stringKey("langsmith.metadata.$key"), value)
            }
        }

        private fun formatInputMessages(params: ChatCompletionCreateParams): String {
            if (params.messages().isEmpty()) return "[]"
            val json = StringBuilder("[")
            var first = true
            for (messageParam in params.messages()) {
                if (!first) json.append(",")
                first = false
                json.append("{")
                var role: String? = null
                var content: String? = null
                try {
                    val isUser =
                        messageParam.javaClass.getMethod("isUser").invoke(messageParam) as Boolean
                    val isSystem =
                        messageParam.javaClass.getMethod("isSystem").invoke(messageParam) as Boolean
                    val isAssistant =
                        messageParam.javaClass.getMethod("isAssistant").invoke(messageParam)
                            as Boolean
                    val isTool =
                        messageParam.javaClass.getMethod("isTool").invoke(messageParam) as Boolean
                    val actualMessage =
                        when {
                            isUser -> {
                                role = "user"
                                messageParam.javaClass.getMethod("asUser").invoke(messageParam)
                            }
                            isSystem -> {
                                role = "system"
                                messageParam.javaClass.getMethod("asSystem").invoke(messageParam)
                            }
                            isAssistant -> {
                                role = "assistant"
                                messageParam.javaClass.getMethod("asAssistant").invoke(messageParam)
                            }
                            isTool -> {
                                role = "tool"
                                messageParam.javaClass.getMethod("asTool").invoke(messageParam)
                            }
                            else -> null
                        }
                    if (actualMessage != null) {
                        try {
                            val contentResult =
                                actualMessage.javaClass.getMethod("content").invoke(actualMessage)
                            if (contentResult != null) {
                                try {
                                    val textResult =
                                        contentResult.javaClass
                                            .getMethod("text")
                                            .invoke(contentResult)
                                    content =
                                        when (textResult) {
                                            is java.util.Optional<*> ->
                                                (textResult as java.util.Optional<*>)
                                                    .orElse(null)
                                                    ?.toString()
                                            is String -> textResult
                                            else -> null
                                        }
                                } catch (_: NoSuchMethodException) {
                                    content =
                                        when (contentResult) {
                                            is String -> contentResult
                                            is java.util.Optional<*> ->
                                                (contentResult as java.util.Optional<*>)
                                                    .orElse(null)
                                                    ?.toString()
                                            else -> null
                                        }
                                }
                            }
                        } catch (_: NoSuchMethodException) {}
                    }
                    if (role == null) {
                        val roleResult =
                            messageParam.javaClass.getMethod("role").invoke(messageParam)
                        role = roleResult?.toString()?.lowercase()
                    }
                } catch (_: Exception) {}
                if (role == null) {
                    val className = messageParam.javaClass.simpleName
                    val fullName = messageParam.javaClass.name
                    role =
                        when {
                            "User" in className || "User" in fullName -> "user"
                            "System" in className || "System" in fullName -> "system"
                            "Assistant" in className || "Assistant" in fullName -> "assistant"
                            "Tool" in className || "Tool" in fullName -> "tool"
                            else -> null
                        }
                }
                if (content == null) {
                    content = extractContentFromToString(messageParam.toString(), role)
                }
                // OTel GenAI schema: messages have "role" and "parts" array (LangSmith expects
                // this)
                val outRole = role ?: "user"
                json.append("\"role\":\"").append(outRole).append("\"")
                json.append(",\"parts\":[")
                if (content != null) {
                    val partType = if (role == "tool") "tool_call_response" else "text"
                    val partKey = if (role == "tool") "response" else "content"
                    json.append("{\"type\":\"").append(partType).append("\",\"")
                    json.append(partKey).append("\":\"")
                    json.append(TracingUtils.escapeJsonString(content))
                    json.append("\"}")
                }
                json.append("]}")
            }
            json.append("]")
            return json.toString()
        }

        private fun extractContentFromToString(messageStr: String, role: String?): String? {
            if (role == "tool") {
                val toolContentPattern = Pattern.compile("text=\\{([^}]+)\\}")
                val toolMatcher = toolContentPattern.matcher(messageStr)
                if (toolMatcher.find()) return "{" + toolMatcher.group(1) + "}"
                val simplePattern = Pattern.compile("text=[\"']([^\"']+)[\"']")
                val simpleMatcher = simplePattern.matcher(messageStr)
                if (simpleMatcher.find()) return simpleMatcher.group(1)
            }
            var contentIdx = messageStr.indexOf("content=")
            if (contentIdx >= 0) {
                val textIdx = messageStr.indexOf("text=", contentIdx)
                if (textIdx > contentIdx) {
                    val start1 = messageStr.indexOf("\"", textIdx)
                    if (start1 >= 0) {
                        var end = start1 + 1
                        while (end < messageStr.length && messageStr[end] != '"') {
                            if (messageStr[end] == '\\') end += 2 else end++
                        }
                        if (end < messageStr.length) return messageStr.substring(start1 + 1, end)
                    }
                }
                val start2 = messageStr.indexOf("\"", contentIdx)
                if (start2 >= 0) {
                    val end = messageStr.indexOf("\"", start2 + 1)
                    if (end > start2) return messageStr.substring(start2 + 1, end)
                }
            }
            val pattern = Pattern.compile("content[=:]\\s*[\"']([^\"']+)[\"']")
            val matcher = pattern.matcher(messageStr)
            if (matcher.find()) return matcher.group(1)
            val fallback = Pattern.compile("[\"']([^\"']+)[\"']").matcher(messageStr)
            if (fallback.find()) {
                val potential = fallback.group(1)
                if (
                    !potential.contains("com.openai") &&
                        potential !in listOf("user", "system", "assistant", "tool") &&
                        potential.isNotEmpty()
                )
                    return potential
            }
            return null
        }

        /** OTel GenAI schema: each message has role, parts array, and finish_reason (output). */
        private fun formatOutputMessages(completion: ChatCompletion): String {
            if (completion.choices().isEmpty()) return "[]"
            val json = StringBuilder("[")
            var first = true
            for (choice in completion.choices()) {
                if (!first) json.append(",")
                first = false
                val message = choice.message()
                val finishReason = choice.finishReason()?.toString()?.lowercase() ?: "stop"
                json.append("{\"role\":\"assistant\",\"parts\":[")
                var partFirst = true
                message.content().ifPresent { content ->
                    if (!partFirst) json.append(",")
                    partFirst = false
                    json.append("{\"type\":\"text\",\"content\":\"")
                    json.append(TracingUtils.escapeJsonString(content))
                    json.append("\"}")
                }
                message.toolCalls().ifPresent { toolCalls ->
                    for (toolCall in toolCalls) {
                        if (!toolCall.isFunction()) continue
                        if (!partFirst) json.append(",")
                        partFirst = false
                        val fn = toolCall.asFunction()
                        json.append("{\"type\":\"tool_call\",\"id\":\"")
                        json.append(TracingUtils.escapeJsonString(fn.id()))
                        json.append("\",\"name\":\"")
                        json.append(TracingUtils.escapeJsonString(fn.function().name()))
                        json.append("\",\"arguments\":\"")
                        json.append(TracingUtils.escapeJsonString(fn.function().arguments()))
                        json.append("\"}")
                    }
                }
                json
                    .append("],\"finish_reason\":\"")
                    .append(TracingUtils.escapeJsonString(finishReason))
                    .append("\"}")
            }
            json.append("]")
            return json.toString()
        }

        private fun extractPromptFromParams(params: ChatCompletionCreateParams): String? {
            for (messageParam in params.messages()) {
                if (messageParam.isUser()) {
                    val userMessage = messageParam.asUser()
                    val text = userMessage.content().text().getOrNull()
                    if (!text.isNullOrEmpty()) return text
                }
            }
            return null
        }

        override fun <T : Any> create(
            params: StructuredChatCompletionCreateParams<T>
        ): StructuredChatCompletion<T> = createStructured(params, null)

        override fun <T : Any> create(
            params: StructuredChatCompletionCreateParams<T>,
            requestOptions: RequestOptions,
        ): StructuredChatCompletion<T> = createStructured(params, requestOptions)

        private fun <T : Any> createStructured(
            params: StructuredChatCompletionCreateParams<T>,
            requestOptions: RequestOptions?,
        ): StructuredChatCompletion<T> {
            val model = params.rawParams?.model()?.toString()
            val span = TracingUtils.createSpanBuilder(model, "chat").startSpan()
            try {
                span.makeCurrent().use {
                    setExperimentContextAttributes(span)
                    TracingUtils.setRequestAttributes(span, model)
                    params.rawParams?.let { raw ->
                        TracingUtils.setRequestParameters(
                            span,
                            raw.temperature().orElse(null),
                            raw.topP().orElse(null),
                            raw.maxCompletionTokens().orElse(null),
                        )
                        val promptStructured =
                            extractPromptFromParams(raw)?.takeIf { it.isNotEmpty() }
                        promptStructured?.let {
                            span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), it)
                        }
                        TracingUtils.setInputMessages(span, formatInputMessages(raw))
                    }
                    val result =
                        if (requestOptions == null) delegate.create(params)
                        else delegate.create(params, requestOptions!!)
                    TracingUtils.setResponseMetadata(span, model, null)
                    result.usage().ifPresent { u ->
                        TracingUtils.setResponseAttributes(
                            span,
                            u.promptTokens().toLong(),
                            u.completionTokens().toLong(),
                            u.totalTokens().toLong(),
                        )
                    }
                    return result
                }
            } catch (e: Exception) {
                TracingUtils.recordException(span, e)
                throw e
            } finally {
                span.end()
            }
        }

        override fun createStreaming(
            params: ChatCompletionCreateParams
        ): StreamResponse<ChatCompletionChunk> = createStreamingChat(params, null)

        override fun createStreaming(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions,
        ): StreamResponse<ChatCompletionChunk> = createStreamingChat(params, requestOptions)

        /**
         * Ensures the request asks for usage in the stream so we get token counts in the final
         * chunk. Without stream_options.include_usage=true the API does not send usage and traces
         * lack token metadata.
         */
        private fun ensureStreamIncludeUsage(
            params: ChatCompletionCreateParams
        ): ChatCompletionCreateParams {
            val existing = params.streamOptions().orElse(null)
            if (existing != null && existing.includeUsage().orElse(false)) return params
            val streamOptsBuilder = ChatCompletionStreamOptions.builder().includeUsage(true)
            existing?.includeObfuscation()?.ifPresent { streamOptsBuilder.includeObfuscation(it) }
            val newOpts = streamOptsBuilder.build()
            return params.toBuilder().streamOptions(newOpts).build()
        }

        private fun createStreamingChat(
            params: ChatCompletionCreateParams,
            requestOptions: RequestOptions?,
        ): StreamResponse<ChatCompletionChunk> {
            val model = params.model()?.toString()
            val span = TracingUtils.createSpanBuilder(model, "chat").startSpan()
            try {
                span.makeCurrent().use {
                    setExperimentContextAttributes(span)
                    TracingUtils.setRequestAttributes(span, model)
                    span.setAttribute(AttributeKey.booleanKey("gen_ai.streaming"), true)
                    TracingUtils.setRequestParameters(
                        span,
                        params.temperature().orElse(null),
                        params.topP().orElse(null),
                        params.maxCompletionTokens().orElse(null),
                    )
                    val promptText = extractPromptFromParams(params)?.takeIf { it.isNotEmpty() }
                    promptText?.let {
                        span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), it)
                    }
                    TracingUtils.setInputMessages(span, formatInputMessages(params))
                    val accumulator = ChatCompletionAccumulator.create()
                    val paramsWithUsage = ensureStreamIncludeUsage(params)
                    val startNanos = System.nanoTime()
                    val delegateStream =
                        if (requestOptions == null) delegate.createStreaming(paramsWithUsage)
                        else delegate.createStreaming(paramsWithUsage, requestOptions!!)
                    return TracedChatStreamResponse(
                        span,
                        accumulator,
                        delegateStream,
                        startNanos,
                    ) { s, c ->
                        c?.let { applyChatCompletionToSpan(s, it) }
                    }
                }
            } catch (e: Exception) {
                TracingUtils.recordException(span, e)
                span.end()
                throw e
            }
        }

        override fun retrieve(completionId: String) = delegate.retrieve(completionId)

        override fun retrieve(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionRetrieveParams,
        ) = delegate.retrieve(completionId, params)

        override fun retrieve(completionId: String, requestOptions: RequestOptions) =
            delegate.retrieve(completionId, requestOptions)

        override fun retrieve(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionRetrieveParams,
            requestOptions: RequestOptions,
        ) = delegate.retrieve(completionId, params, requestOptions)

        override fun retrieve(
            params: com.openai.models.chat.completions.ChatCompletionRetrieveParams
        ) = delegate.retrieve(params)

        override fun retrieve(
            params: com.openai.models.chat.completions.ChatCompletionRetrieveParams,
            requestOptions: RequestOptions,
        ) = delegate.retrieve(params, requestOptions)

        override fun update(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionUpdateParams,
        ) = delegate.update(completionId, params)

        override fun update(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionUpdateParams,
            requestOptions: RequestOptions,
        ) = delegate.update(completionId, params, requestOptions)

        override fun update(params: com.openai.models.chat.completions.ChatCompletionUpdateParams) =
            delegate.update(params)

        override fun update(
            params: com.openai.models.chat.completions.ChatCompletionUpdateParams,
            requestOptions: RequestOptions,
        ) = delegate.update(params, requestOptions)

        override fun list() = delegate.list()

        override fun list(requestOptions: RequestOptions) = delegate.list(requestOptions)

        override fun list(params: com.openai.models.chat.completions.ChatCompletionListParams) =
            delegate.list(params)

        override fun list(
            params: com.openai.models.chat.completions.ChatCompletionListParams,
            requestOptions: RequestOptions,
        ) = delegate.list(params, requestOptions)

        override fun delete(completionId: String) = delegate.delete(completionId)

        override fun delete(completionId: String, requestOptions: RequestOptions) =
            delegate.delete(completionId, requestOptions)

        override fun delete(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionDeleteParams,
        ) = delegate.delete(completionId, params)

        override fun delete(
            completionId: String,
            params: com.openai.models.chat.completions.ChatCompletionDeleteParams,
            requestOptions: RequestOptions,
        ) = delegate.delete(completionId, params, requestOptions)

        override fun delete(params: com.openai.models.chat.completions.ChatCompletionDeleteParams) =
            delegate.delete(params)

        override fun delete(
            params: com.openai.models.chat.completions.ChatCompletionDeleteParams,
            requestOptions: RequestOptions,
        ) = delegate.delete(params, requestOptions)
    }
}

private class TracedChatStreamResponse(
    private val span: Span,
    private val accumulator: ChatCompletionAccumulator,
    private val delegate: StreamResponse<ChatCompletionChunk>,
    private val startNanos: Long,
    private val onComplete: (Span, ChatCompletion?) -> Unit,
) : StreamResponse<ChatCompletionChunk> {

    @Volatile private var closed = false
    @Volatile private var timeToFirstTokenSet = false

    override fun stream(): Stream<ChatCompletionChunk> =
        delegate.stream().map { chunk ->
            if (!timeToFirstTokenSet) {
                val hasContent =
                    chunk.choices().isNotEmpty() &&
                        chunk.choices()[0].delta().content().getOrNull()?.isNotEmpty() == true
                if (hasContent) {
                    val ttftMs = (System.nanoTime() - startNanos) / 1_000_000
                    span.setAttribute(
                        AttributeKey.longKey("gen_ai.usage.time_to_first_token_ms"),
                        ttftMs,
                    )
                    timeToFirstTokenSet = true
                }
            }
            accumulator.accumulate(chunk)
            chunk
        }

    override fun close() {
        if (closed) return
        closed = true
        try {
            try {
                val completion = accumulator.chatCompletion()
                onComplete(span, completion)
            } catch (_: IllegalStateException) {
                // Stream closed before a complete response
            }
        } finally {
            span.end()
            try {
                delegate.close()
            } catch (_: Exception) {
                // Already ended span; ensure delegate is closed best-effort
            }
        }
    }
}
