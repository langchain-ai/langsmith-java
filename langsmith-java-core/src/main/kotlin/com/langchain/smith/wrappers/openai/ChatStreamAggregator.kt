package com.langchain.smith.wrappers.openai

import com.openai.models.chat.completions.ChatCompletionChunk
import io.opentelemetry.api.common.AttributeKey
import io.opentelemetry.api.trace.Span
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.optionals.getOrNull

/**
 * Aggregates streaming chat completion chunks to produce gen_ai.completion ({"messages":[...]} JSON
 */
internal class ChatStreamAggregator {
    private val content = StringBuilder()
    private val toolCallsByIndex = ConcurrentHashMap<Int, ToolCallAccumulator>()
    private var inputTokens: Long? = null
    private var outputTokens: Long? = null
    private var totalTokens: Long? = null
    private var responseModel: String? = null
    private var finishReason: String? = null

    fun addChunk(chunk: ChatCompletionChunk) {
        try {
            val choices = chunk.choices()
            if (choices.isNotEmpty()) {
                val choice = choices[0]
                val delta = choice.delta()
                delta.content().getOrNull()?.let { content.append(it) }
                delta.toolCalls().getOrNull()?.forEach { tc ->
                    val idx = tc.index().toInt()
                    toolCallsByIndex.getOrPut(idx) { ToolCallAccumulator() }.add(tc)
                }
                choice.finishReason().getOrNull()?.let { reason ->
                    finishReason = reason.toString()
                }
            }
            chunk.usage().getOrNull()?.let { usage ->
                inputTokens = usage.promptTokens().toLong()
                outputTokens = usage.completionTokens().toLong()
                totalTokens = usage.totalTokens().toLong()
            }
            try {
                responseModel = chunk.model()
            } catch (_: Exception) {
                // Last chunk (usage-only) may omit model in some API versions
            }
        } catch (_: Exception) {
            // Ignore parsing errors for optional fields
        }
    }

    fun applyToSpan(span: Span) {
        val completionJson = buildCompletionJson()
        span.setAttribute(
            AttributeKey.stringKey("gen_ai.completion"),
            "{\"messages\":${completionJson?.let { "[$it]" } ?: "[]"}}",
        )
        if (inputTokens != null || outputTokens != null || totalTokens != null) {
            TracingUtils.setResponseAttributes(span, inputTokens, outputTokens, totalTokens)
        }
        TracingUtils.setResponseMetadata(span, responseModel, finishReason)
    }

    /** Builds assistant message JSON object (role, content, tool_calls) for {"messages":[...]}. */
    private fun buildCompletionJson(): String? {
        val hasContent = content.isNotEmpty()
        val toolCallsList =
            toolCallsByIndex.keys.sorted().mapNotNull { toolCallsByIndex[it]?.toJson() }
        val hasToolCalls = toolCallsList.isNotEmpty()
        if (!hasContent && !hasToolCalls) return null
        return buildString {
            append("{\"role\":\"assistant\"")
            if (hasContent) {
                append(",\"content\":\"")
                append(TracingUtils.escapeJsonString(content.toString()))
                append("\"")
            }
            if (hasToolCalls) {
                append(",\"tool_calls\":[")
                append(toolCallsList.joinToString(","))
                append("]")
            }
            append("}")
        }
    }

    private data class ToolCallAccumulator(
        var id: String? = null,
        var type: String? = null,
        var name: String? = null,
        val arguments: StringBuilder = StringBuilder(),
    ) {
        fun add(tc: com.openai.models.chat.completions.ChatCompletionChunk.Choice.Delta.ToolCall) {
            try {
                tc.id().getOrNull()?.let { id = it }
                tc.type().getOrNull()?.let { type = it.toString() }
                tc.function().getOrNull()?.let { fn ->
                    fn.name().getOrNull()?.let { name = it }
                    fn.arguments().getOrNull()?.let { arguments.append(it) }
                }
            } catch (_: Exception) {}
        }

        fun toJson(): String = buildString {
            append("{\"id\":\"")
            append(TracingUtils.escapeJsonString(id ?: ""))
            append("\",\"type\":\"")
            append(TracingUtils.escapeJsonString(type ?: "function"))
            append("\",\"function\":{\"name\":\"")
            append(TracingUtils.escapeJsonString(name ?: ""))
            append("\",\"arguments\":\"")
            append(TracingUtils.escapeJsonString(arguments.toString()))
            append("\"}}")
        }
    }
}
