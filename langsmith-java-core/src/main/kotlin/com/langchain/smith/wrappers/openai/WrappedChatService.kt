package com.langchain.smith.wrappers.openai

import com.openai.core.ClientOptions
import com.openai.core.RequestOptions
import com.openai.core.http.StreamResponse
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionChunk
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.chat.completions.StructuredChatCompletion
import com.openai.models.chat.completions.StructuredChatCompletionCreateParams
import com.openai.services.blocking.ChatService
import com.openai.services.blocking.chat.ChatCompletionService
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import java.util.function.Consumer
import java.util.regex.Pattern
import org.slf4j.LoggerFactory

/** Wrapped ChatService that adds OpenTelemetry tracing to chat completion operations. */
internal class WrappedChatService(private val delegate: ChatService) : ChatService {

    override fun withRawResponse() = delegate.withRawResponse()

    override fun withOptions(options: Consumer<ClientOptions.Builder>) =
        WrappedChatService(delegate.withOptions(options))

    override fun completions(): ChatCompletionService =
        WrappedChatCompletionService(delegate.completions())

    private class WrappedChatCompletionService(private val delegate: ChatCompletionService) :
        ChatCompletionService {
        companion object {
            private val logger = LoggerFactory.getLogger(WrappedChatCompletionService::class.java)
        }

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
            if (logger.isDebugEnabled) {
                logger.debug(
                    "[WrappedChatService] Created span: {}, isRecording: {}, traceId: {}",
                    span.spanContext.spanId,
                    span.isRecording,
                    span.spanContext.traceId,
                )
            }
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
                    formatInputMessages(params).let { TracingUtils.setInputMessages(span, it) }
                    extractPromptFromParams(params)
                        ?.takeIf { it.isNotEmpty() }
                        ?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.prompt"), it) }
                    val result =
                        if (requestOptions == null) delegate.create(params)
                        else delegate.create(params, requestOptions)
                    val responseModel = result.model()
                    val finishReason =
                        result.choices().firstOrNull()?.finishReason()?.toString() ?: "stop"
                    TracingUtils.setResponseMetadata(span, responseModel, finishReason)
                    formatOutputMessages(result).let { TracingUtils.setOutputMessages(span, it) }
                    extractCompletionFromResult(result)
                        ?.takeIf { it.isNotEmpty() }
                        ?.let { span.setAttribute(AttributeKey.stringKey("gen_ai.completion"), it) }
                    result.usage().ifPresent { usage ->
                        TracingUtils.setResponseAttributes(
                            span,
                            usage.promptTokens().toLong(),
                            usage.completionTokens().toLong(),
                            usage.totalTokens().toLong(),
                        )
                    }
                    return result
                }
            } catch (e: Exception) {
                TracingUtils.recordException(span, e)
                throw e
            } finally {
                if (logger.isDebugEnabled)
                    logger.debug("[WrappedChatService] Ending span: {}", span.spanContext.spanId)
                span.end()
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
            if (logger.isDebugEnabled)
                logger.debug(
                    "[formatInputMessages] Processing {} message(s)",
                    params.messages().size,
                )
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
                if (role != null) json.append("\"role\":\"").append(role).append("\"")
                if (content != null) {
                    if (role != null) json.append(",")
                    json
                        .append("\"content\":\"")
                        .append(TracingUtils.escapeJsonString(content))
                        .append("\"")
                }
                json.append("}")
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

        private fun formatOutputMessages(completion: ChatCompletion): String {
            if (completion.choices().isEmpty()) return "[]"
            val json = StringBuilder("[")
            var first = true
            for (choice in completion.choices()) {
                if (!first) json.append(",")
                first = false
                val message = choice.message()
                json.append("{\"role\":\"assistant\"")
                message.content().ifPresent {
                    json
                        .append(",\"content\":\"")
                        .append(TracingUtils.escapeJsonString(it))
                        .append("\"")
                }
                message.toolCalls().ifPresent { toolCalls ->
                    if (toolCalls.isNotEmpty()) {
                        json.append(",\"tool_calls\":[")
                        var firstTc = true
                        for (toolCall in toolCalls) {
                            if (!toolCall.isFunction()) continue
                            if (!firstTc) json.append(",")
                            firstTc = false
                            val fn = toolCall.asFunction()
                            json
                                .append("{\"id\":\"")
                                .append(TracingUtils.escapeJsonString(fn.id()))
                                .append("\"")
                            json.append(",\"type\":\"function\"")
                            json
                                .append(",\"function\":{\"name\":\"")
                                .append(TracingUtils.escapeJsonString(fn.function().name()))
                            json
                                .append("\",\"arguments\":\"")
                                .append(TracingUtils.escapeJsonString(fn.function().arguments()))
                                .append("\"}")
                            json.append("}")
                        }
                        json.append("]")
                    }
                }
                json.append("}")
            }
            json.append("]")
            return json.toString()
        }

        private fun extractPromptFromParams(params: ChatCompletionCreateParams): String? {
            for (messageParam in params.messages()) {
                try {
                    if (
                        messageParam.javaClass.getMethod("isUser").invoke(messageParam) as Boolean
                    ) {
                        val userMessage =
                            messageParam.javaClass.getMethod("asUser").invoke(messageParam)
                        val content = userMessage.javaClass.getMethod("content").invoke(userMessage)
                        when (content) {
                            is String -> return content
                            is List<*> ->
                                if (content.isNotEmpty())
                                    (content[0] as? String)?.let {
                                        return it
                                    }
                        }
                    }
                } catch (_: Exception) {}
            }
            return null
        }

        private fun extractCompletionFromResult(result: ChatCompletion): String? =
            result.choices().firstOrNull()?.message()?.content()?.orElse(null)

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
                        formatInputMessages(raw).let { TracingUtils.setInputMessages(span, it) }
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
                    formatInputMessages(params).let { TracingUtils.setInputMessages(span, it) }
                    return if (requestOptions == null) delegate.createStreaming(params)
                    else delegate.createStreaming(params, requestOptions!!)
                }
            } catch (e: Exception) {
                TracingUtils.recordException(span, e)
                throw e
            } finally {
                span.end()
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
