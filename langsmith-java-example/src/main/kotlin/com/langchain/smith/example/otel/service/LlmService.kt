package com.langchain.smith.example.otel.service

import com.langchain.smith.otel.OtelSpanCreator
import io.opentelemetry.api.trace.Span
import io.opentelemetry.api.trace.StatusCode
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.context.Scope
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Service layer demonstrating nested OpenTelemetry spans.
 */
@Service
class LlmService @Autowired constructor(
    private val tracer: Tracer
) {

    /**
     * Simulates an LLM API call with tracing.
     */
    fun generateResponse(input: String): String {
        val llmSpan = OtelSpanCreator.createLlmSpan(
            tracer, "openai.chat", "openai", "gpt-4", "spring-boot-langsmith", null
        )

        try {
            llmSpan.makeCurrent().use {
                OtelSpanCreator.setInput(llmSpan, input)
                println("  → Calling OpenAI API...")
                Thread.sleep(500)
                val response = "I received your message: '$input'. How can I help you today?"
                OtelSpanCreator.setOutput(llmSpan, response)
                OtelSpanCreator.setTokenUsage(llmSpan, 15, 20)
                llmSpan.setStatus(StatusCode.OK)
                println("  ← OpenAI API response received")
                return response
            }
        } catch (e: Exception) {
            llmSpan.setStatus(StatusCode.ERROR, e.message)
            throw RuntimeException("LLM call failed", e)
        } finally {
            llmSpan.end()
        }
    }

    /**
     * Simulates sentiment analysis with tracing.
     */
    fun analyzeSentiment(text: String): String {
        val sentimentSpan = OtelSpanCreator.createLlmSpan(
            tracer, "sentiment_analysis", "openai", "gpt-4", "spring-boot-langsmith", null
        )

        try {
            sentimentSpan.makeCurrent().use {
                OtelSpanCreator.setInput(sentimentSpan, text)
                println("  → Analyzing sentiment...")
                Thread.sleep(300)
                val sentiment = when {
                    text.lowercase().contains("good") || text.lowercase().contains("great") -> "positive"
                    text.lowercase().contains("bad") || text.lowercase().contains("terrible") -> "negative"
                    else -> "neutral"
                }
                OtelSpanCreator.setOutput(sentimentSpan, sentiment)
                OtelSpanCreator.setTokenUsage(sentimentSpan, 8, 2)
                sentimentSpan.setStatus(StatusCode.OK)
                println("  ← Sentiment: $sentiment")
                return sentiment
            }
        } catch (e: Exception) {
            sentimentSpan.setStatus(StatusCode.ERROR, e.message)
            throw RuntimeException("Sentiment analysis failed", e)
        } finally {
            sentimentSpan.end()
        }
    }
}
