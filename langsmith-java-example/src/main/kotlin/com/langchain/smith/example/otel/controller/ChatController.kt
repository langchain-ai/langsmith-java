package com.langchain.smith.example.otel.controller

import com.langchain.smith.example.otel.service.LlmService
import com.langchain.smith.otel.OtelSpanCreator
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.StatusCode
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.context.Scope
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * REST controller demonstrating OpenTelemetry tracing with LangSmith.
 */
@RestController
@RequestMapping("/api")
class ChatController @Autowired constructor(
    private val tracer: Tracer,
    private val llmService: LlmService
) {

    @PostMapping("/chat")
    fun chat(@RequestBody request: Map<String, String>): Map<String, Any> {
        val userMessage = request["message"] ?: "Hello!"

        val rootSpan = OtelSpanCreator.createChainSpan(
            tracer, "chat_request", "spring-boot-langsmith", null
        )

        try {
            rootSpan.makeCurrent().use {
                OtelSpanCreator.setInput(rootSpan, userMessage)
                println("→ Processing chat request: $userMessage")
                val response = llmService.generateResponse(userMessage)
                OtelSpanCreator.setOutput(rootSpan, response)
                rootSpan.setStatus(StatusCode.OK)
                println("← Chat response generated")
                return mapOf(
                    "request" to userMessage,
                    "response" to response,
                    "model" to "gpt-4",
                    "trace_id" to rootSpan.spanContext.traceId
                )
            }
        } catch (e: Exception) {
            rootSpan.setStatus(StatusCode.ERROR, e.message)
            throw e
        } finally {
            rootSpan.end()
        }
    }

    @GetMapping("/analyze")
    fun analyze(@RequestParam text: String): Map<String, Any> {
        val analysisSpan = OtelSpanCreator.createChainSpan(
            tracer, "text_analysis", "spring-boot-langsmith", null
        )

        try {
            analysisSpan.makeCurrent().use {
                OtelSpanCreator.setInput(analysisSpan, text)
                println("→ Analyzing text: $text")
                val wordCount = text.split("\\s+".toRegex()).size
                val sentiment = llmService.analyzeSentiment(text)
                val result = "Word count: $wordCount, Sentiment: $sentiment"
                OtelSpanCreator.setOutput(analysisSpan, result)
                analysisSpan.setStatus(StatusCode.OK)
                println("← Analysis complete")
                return mapOf(
                    "text" to text,
                    "word_count" to wordCount,
                    "sentiment" to sentiment,
                    "trace_id" to analysisSpan.spanContext.traceId
                )
            }
        } catch (e: Exception) {
            analysisSpan.setStatus(StatusCode.ERROR, e.message)
            throw e
        } finally {
            analysisSpan.end()
        }
    }

    @GetMapping("/health")
    fun health(): Map<String, String> = mapOf(
        "status" to "healthy",
        "service" to "spring-boot-langsmith"
    )
}
