package com.langchain.smith.wrappers.openai;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanBuilder;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.Tracer;

/**
 * Utility class for creating and managing OpenTelemetry spans for OpenAI API
 * calls.
 *
 * <p>
 * This class follows the LangSmith OTEL conventions documented in
 * LANGSMITH_OTEL.md.
 */
final class TracingUtils {

  private static final String INSTRUMENTATION_NAME = "langsmith-java-otel-wrappers";

  private TracingUtils() {
    // Utility class
  }

  /**
   * Gets or creates a tracer for OpenAI operations.
   *
   * @return a tracer instance
   */
  static Tracer getTracer() {
    // Try to get the global tracer if available
    try {
      Tracer tracer = io.opentelemetry.api.GlobalOpenTelemetry.get()
          .getTracer(INSTRUMENTATION_NAME);

      // Debug: Check if tracer is a noop tracer
      boolean debug = Boolean.getBoolean("langsmith.debug")
          || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));
      if (debug) {
        // Check if the OpenTelemetry instance is a noop
        io.opentelemetry.api.OpenTelemetry otel = io.opentelemetry.api.GlobalOpenTelemetry.get();
        boolean isNoop = otel.getClass().getName().contains("Noop");
        System.out.println("[TracingUtils] Tracer obtained: " + tracer.getClass().getName()
            + ", OpenTelemetry isNoop: " + isNoop);
      }

      return tracer;
    } catch (Exception e) {
      // Fall back to noop - GlobalOpenTelemetry.get() will return a noop
      // implementation
      // if OpenTelemetry is not configured
      return io.opentelemetry.api.GlobalOpenTelemetry.get()
          .getTracer(INSTRUMENTATION_NAME);
    }
  }

  /**
   * Creates a span builder for an OpenAI operation with LangSmith-specific
   * attributes.
   *
   * @param model         the model name (e.g., "gpt-4o-mini")
   * @param operationType the operation type (e.g., "chat", "response")
   * @param spanKind      the LangSmith span kind (e.g., "llm") - can be null
   * @return a span builder with CLIENT kind and core attributes
   */
  static SpanBuilder createSpanBuilder(String model, String operationType, String spanKind) {
    Tracer tracer = getTracer();
    String spanName = operationType + " " + (model != null ? model : "unknown");
    SpanBuilder builder = tracer.spanBuilder(spanName)
        .setSpanKind(SpanKind.CLIENT)
        .setAttribute("gen_ai.system", "openai")
        .setAttribute("gen_ai.operation.name", operationType)
        .setAttribute("gen_ai.provider.name", "openai");

    // Set LangSmith span kind on the builder (important for LangSmith detection)
    if (spanKind != null) {
      builder.setAttribute("langsmith.span.kind", spanKind);
    }

    return builder;
  }

  /**
   * Creates a span builder for an OpenAI operation (defaults to "llm" span kind).
   *
   * @param model         the model name (e.g., "gpt-4o-mini")
   * @param operationType the operation type (e.g., "chat", "response")
   * @return a span builder with CLIENT kind and core attributes
   */
  static SpanBuilder createSpanBuilder(String model, String operationType) {
    return createSpanBuilder(model, operationType, "llm");
  }

  /**
   * Sets common span attributes for OpenAI LLM requests.
   *
   * Note: Core attributes (gen_ai.system, gen_ai.operation.name,
   * gen_ai.provider.name,
   * langsmith.span.kind) are already set on the SpanBuilder. This method sets
   * additional
   * request-specific attributes.
   *
   * @param span  the span to set attributes on
   * @param model the model name
   */
  static void setRequestAttributes(Span span, String model) {
    if (model != null) {
      span.setAttribute("gen_ai.request.model", model);
    }
  }

  /**
   * Sets request parameter attributes on a span.
   *
   * @param span        the span to set attributes on
   * @param temperature the temperature parameter (nullable)
   * @param topP        the top_p parameter (nullable)
   * @param maxTokens   the max_tokens parameter (nullable)
   */
  static void setRequestParameters(Span span, Double temperature, Double topP, Long maxTokens) {
    if (temperature != null) {
      span.setAttribute("gen_ai.request.temperature", temperature);
    }
    if (topP != null) {
      span.setAttribute("gen_ai.request.top_p", topP);
    }
    if (maxTokens != null) {
      span.setAttribute("gen_ai.request.max_tokens", maxTokens);
    }
  }

  /**
   * Sets input messages as JSON array string.
   *
   * @param span         the span to set attributes on
   * @param messagesJson the messages in JSON array format
   */
  static void setInputMessages(Span span, String messagesJson) {
    if (messagesJson != null) {
      span.setAttribute("gen_ai.input.messages", messagesJson);
    }
  }

  /**
   * Sets output messages as JSON array string.
   *
   * @param span         the span to set attributes on
   * @param messagesJson the messages in JSON array format
   */
  static void setOutputMessages(Span span, String messagesJson) {
    if (messagesJson != null) {
      span.setAttribute("gen_ai.output.messages", messagesJson);
    }
  }

  /**
   * Sets response attributes on a span.
   *
   * @param span         the span to set attributes on
   * @param inputTokens  number of input tokens
   * @param outputTokens number of output tokens
   * @param totalTokens  total tokens used
   */
  static void setResponseAttributes(Span span, Long inputTokens, Long outputTokens,
      Long totalTokens) {
    if (inputTokens != null) {
      span.setAttribute("gen_ai.usage.input_tokens", inputTokens);
    }
    if (outputTokens != null) {
      span.setAttribute("gen_ai.usage.output_tokens", outputTokens);
    }
    if (totalTokens != null) {
      span.setAttribute("gen_ai.usage.total_tokens", totalTokens);
    }
  }

  /**
   * Sets response model and finish reason attributes.
   *
   * @param span          the span to set attributes on
   * @param responseModel the model used in the response
   * @param finishReason  the finish reason
   */
  static void setResponseMetadata(Span span, String responseModel, String finishReason) {
    if (responseModel != null) {
      span.setAttribute("gen_ai.response.model", responseModel);
    }
    if (finishReason != null) {
      span.setAttribute("gen_ai.response.finish_reason", finishReason);
    }
  }

  /**
   * Records an exception on a span and marks it as an error.
   *
   * @param span      the span to record the exception on
   * @param exception the exception that occurred
   */
  static void recordException(Span span, Throwable exception) {
    span.recordException(exception);
    span.setAttribute("error", true);
  }

  /**
   * Escapes a JSON string by replacing special characters.
   *
   * @param str the string to escape
   * @return the escaped string
   */
  static String escapeJsonString(String str) {
    if (str == null) {
      return "";
    }
    return str.replace("\\", "\\\\")
        .replace("\"", "\\\"")
        .replace("\n", "\\n")
        .replace("\r", "\\r")
        .replace("\t", "\\t");
  }
}
