package com.langchain.smith.example.service;

import com.langchain.smith.otel.OtelSpanCreator;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service layer demonstrating nested OpenTelemetry spans.
 */
@Service
public class LlmService {

    private final Tracer tracer;

    @Autowired
    public LlmService(Tracer tracer) {
        this.tracer = tracer;
    }

    /**
     * Simulates an LLM API call with tracing.
     */
    public String generateResponse(String input) {
        Span llmSpan =
                OtelSpanCreator.createLlmSpan(tracer, "openai.chat", "openai", "gpt-4", "spring-boot-langsmith", null);

        try (Scope scope = llmSpan.makeCurrent()) {
            OtelSpanCreator.setInput(llmSpan, input);

            System.out.println("  → Calling OpenAI API...");

            // Simulate LLM processing time
            Thread.sleep(500);

            String response = "I received your message: '" + input + "'. How can I help you today?";

            OtelSpanCreator.setOutput(llmSpan, response);
            OtelSpanCreator.setTokenUsage(llmSpan, 15, 20);
            llmSpan.setStatus(StatusCode.OK);

            System.out.println("  ← OpenAI API response received");

            return response;

        } catch (Exception e) {
            llmSpan.setStatus(StatusCode.ERROR, e.getMessage());
            throw new RuntimeException("LLM call failed", e);
        } finally {
            llmSpan.end();
        }
    }

    /**
     * Simulates sentiment analysis with tracing.
     */
    public String analyzeSentiment(String text) {
        Span sentimentSpan = OtelSpanCreator.createLlmSpan(
                tracer, "sentiment_analysis", "openai", "gpt-4", "spring-boot-langsmith", null);

        try (Scope scope = sentimentSpan.makeCurrent()) {
            OtelSpanCreator.setInput(sentimentSpan, text);

            System.out.println("  → Analyzing sentiment...");

            // Simulate analysis time
            Thread.sleep(300);

            // Simple sentiment detection
            String sentiment;
            if (text.toLowerCase().contains("good") || text.toLowerCase().contains("great")) {
                sentiment = "positive";
            } else if (text.toLowerCase().contains("bad") || text.toLowerCase().contains("terrible")) {
                sentiment = "negative";
            } else {
                sentiment = "neutral";
            }

            OtelSpanCreator.setOutput(sentimentSpan, sentiment);
            OtelSpanCreator.setTokenUsage(sentimentSpan, 8, 2);
            sentimentSpan.setStatus(StatusCode.OK);

            System.out.println("  ← Sentiment: " + sentiment);

            return sentiment;

        } catch (Exception e) {
            sentimentSpan.setStatus(StatusCode.ERROR, e.getMessage());
            throw new RuntimeException("Sentiment analysis failed", e);
        } finally {
            sentimentSpan.end();
        }
    }
}
