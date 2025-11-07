package com.langchain.smith.wrappers.openai;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import io.opentelemetry.sdk.trace.SpanProcessor;
import java.util.concurrent.TimeUnit;

/**
 * Configuration utility for setting up OpenTelemetry to export traces to
 * LangSmith.
 *
 * <p>
 * This class provides a convenient way to configure OpenTelemetry with
 * LangSmith's OTLP
 * endpoint. You can use this programmatically, or configure via environment
 * variables.
 *
 * <p>
 * Example usage:
 *
 * <pre>{@code
 * // Configure OpenTelemetry for LangSmith before using the wrapper
 * OpenTelemetryConfig.configureForLangSmith(
 *     "your-langsmith-api-key",
 *     "your-project-name");
 *
 * // Now use the wrapped client - traces will be sent to LangSmith
 * WrappedOpenAIClient client = OpenAIWrappers.wrapFromEnv();
 * }</pre>
 */
public final class OpenTelemetryConfig {

  private OpenTelemetryConfig() {
    // Utility class
  }

  /**
   * LangSmith OTLP endpoint for traces.
   * Can be overridden via LANGSMITH_OTLP_ENDPOINT environment variable or
   * by passing a custom endpoint to the configuration methods.
   */
  public static final String LANGSMITH_OTLP_ENDPOINT = "https://api.smith.langchain.com/otel/v1/traces";

  /**
   * Span processor type for configuring how spans are exported.
   */
  public enum SpanProcessorType {
    /**
     * BatchSpanProcessor - Queues spans and exports them in batches.
     * Best for production use - efficient and non-blocking.
     */
    BATCH,

    /**
     * SimpleSpanProcessor - Exports spans synchronously on span.end().
     * Best for testing - predictable but blocks application thread.
     * WARNING: Not recommended for production due to performance impact.
     */
    SIMPLE
  }

  /**
   * Configures OpenTelemetry to export traces to LangSmith.
   *
   * <p>
   * This method configures the global OpenTelemetry instance to send traces to
   * LangSmith's
   * OTLP endpoint. After calling this method, all spans created by the wrapped
   * OpenAI client
   * will be exported to LangSmith.
   *
   * @param apiKey      your LangSmith API key
   * @param projectName your LangSmith project name (optional, can be null)
   * @return the configured OpenTelemetry instance
   */
  public static OpenTelemetry configureForLangSmith(String apiKey, String projectName) {
    return configureForLangSmith(apiKey, projectName, null, null);
  }

  /**
   * Configures OpenTelemetry to export traces to LangSmith with a custom service
   * name.
   *
   * @param apiKey      your LangSmith API key
   * @param projectName your LangSmith project name (optional, can be null)
   * @param serviceName the service name to identify your application (defaults to
   *                    "langsmith-java-otel-wrappers")
   * @return the configured OpenTelemetry instance
   */
  public static OpenTelemetry configureForLangSmith(String apiKey, String projectName,
      String serviceName) {
    return configureForLangSmith(apiKey, projectName, serviceName, null);
  }

  /**
   * Configures OpenTelemetry to export traces to LangSmith with a custom service
   * name and endpoint.
   *
   * @param apiKey      your LangSmith API key
   * @param projectName your LangSmith project name (optional, can be null)
   * @param serviceName the service name to identify your application (defaults to
   *                    "langsmith-java-otel-wrappers")
   * @param endpoint    the OTLP endpoint URL (optional, defaults to
   *                    LANGSMITH_OTLP_ENDPOINT constant)
   * @return the configured OpenTelemetry instance
   */
  public static OpenTelemetry configureForLangSmith(String apiKey, String projectName,
      String serviceName, String endpoint) {
    return configureForLangSmith(apiKey, projectName, serviceName, endpoint,
        SpanProcessorType.BATCH, 512);
  }

  /**
   * Configures OpenTelemetry to export traces to LangSmith with custom batch
   * size.
   *
   * @param apiKey       your LangSmith API key
   * @param projectName  your LangSmith project name (optional, can be null)
   * @param serviceName  the service name to identify your application (defaults
   *                     to
   *                     "langsmith-java-otel-wrappers")
   * @param endpoint     the OTLP endpoint URL (optional, defaults to
   *                     LANGSMITH_OTLP_ENDPOINT constant)
   * @param maxBatchSize the maximum batch size before export is triggered
   *                     (set to 1 for immediate export, default 512)
   * @return the configured OpenTelemetry instance
   */
  public static OpenTelemetry configureForLangSmith(String apiKey, String projectName,
      String serviceName, String endpoint, int maxBatchSize) {
    return configureForLangSmith(apiKey, projectName, serviceName, endpoint,
        SpanProcessorType.BATCH, maxBatchSize);
  }

  /**
   * Configures OpenTelemetry to export traces to LangSmith with custom span
   * processor type and batch size.
   *
   * @param apiKey        your LangSmith API key
   * @param projectName   your LangSmith project name (optional, can be null)
   * @param serviceName   the service name to identify your application
   *                      (defaults to "langsmith-java-otel-wrappers")
   * @param endpoint      the OTLP endpoint URL (optional, defaults to
   *                      LANGSMITH_OTLP_ENDPOINT constant)
   * @param processorType the span processor type (BATCH or SIMPLE)
   * @param maxBatchSize  the maximum batch size before export is triggered
   *                      (only used for BATCH processor, set to 1 for
   *                      immediate export)
   * @return the configured OpenTelemetry instance
   */
  public static OpenTelemetry configureForLangSmith(String apiKey, String projectName,
      String serviceName, String endpoint, SpanProcessorType processorType, int maxBatchSize) {
    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalArgumentException("LangSmith API key cannot be null or empty");
    }

    // Use provided endpoint or default to LANGSMITH_OTLP_ENDPOINT
    String endpointUrl = endpoint != null && !endpoint.isEmpty()
        ? endpoint
        : LANGSMITH_OTLP_ENDPOINT;

    // Create OTLP HTTP exporter configured for LangSmith
    // Build the exporter with conditional headers
    // Note: Using Object to work around Java 8 limitation (can't use var)
    // The builder() method returns a builder that supports method chaining
    Object builder = OtlpHttpSpanExporter.builder()
        .setEndpoint(endpointUrl)
        .addHeader("x-api-key", apiKey);

    // Only add project header if projectName is not null and not empty
    if (projectName != null && !projectName.isEmpty()) {
      // Use reflection to call addHeader on the builder
      try {
        java.lang.reflect.Method addHeaderMethod = builder.getClass().getMethod("addHeader", String.class,
            String.class);
        builder = addHeaderMethod.invoke(builder, "langsmith-project", projectName);
      } catch (Exception e) {
        throw new RuntimeException("Failed to add project header", e);
      }
    }

    // Build the exporter using reflection
    OtlpHttpSpanExporter spanExporter;
    try {
      java.lang.reflect.Method buildMethod = builder.getClass().getMethod("build");
      spanExporter = (OtlpHttpSpanExporter) buildMethod.invoke(builder);
    } catch (Exception e) {
      throw new RuntimeException("Failed to build OtlpHttpSpanExporter", e);
    }

    // Wrap exporter to log export errors
    SpanExporter loggingExporter = new LoggingSpanExporter(spanExporter);

    // Create resource with service name
    Resource resource = Resource.getDefault()
        .merge(Resource.builder()
            .put("service.name",
                serviceName != null ? serviceName : "langsmith-java-otel-wrappers")
            .build());

    // Build and configure span processor based on type
    SpanProcessor spanProcessor;
    if (processorType == SpanProcessorType.SIMPLE) {
      // SimpleSpanProcessor - exports synchronously on span.end()
      // Good for testing, but blocks the application thread
      spanProcessor = SimpleSpanProcessor.create(loggingExporter);
    } else {
      // BatchSpanProcessor - queues and exports in batches
      // Good for production, non-blocking
      // If maxBatchSize is 1, spans are exported immediately as they complete
      spanProcessor = BatchSpanProcessor.builder(loggingExporter)
          .setScheduleDelay(100, TimeUnit.MILLISECONDS) // Export every 100ms
          .setMaxExportBatchSize(maxBatchSize) // Trigger export when batch reaches this size
          .setExporterTimeout(5, TimeUnit.SECONDS) // 5 second timeout
          .build();
    }

    SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
        .addSpanProcessor(spanProcessor)
        .setResource(resource)
        .build();

    OpenTelemetry openTelemetry = OpenTelemetrySdk.builder()
        .setTracerProvider(tracerProvider)
        .buildAndRegisterGlobal();

    return openTelemetry;
  }

  /**
   * Configures OpenTelemetry from environment variables.
   *
   * <p>
   * Reads configuration from the following environment variables:
   * <ul>
   * <li>LANGSMITH_API_KEY - Required: Your LangSmith API key</li>
   * <li>LANGSMITH_PROJECT - Optional: Your LangSmith project name</li>
   * <li>OTEL_SERVICE_NAME - Optional: Service name (defaults to
   * "langsmith-java-otel-wrappers")</li>
   * <li>LANGSMITH_OTLP_ENDPOINT - Optional: Custom OTLP endpoint URL (defaults to
   * LANGSMITH_OTLP_ENDPOINT constant)</li>
   * </ul>
   *
   * @return the configured OpenTelemetry instance
   * @throws IllegalStateException if LANGSMITH_API_KEY is not set
   */
  public static OpenTelemetry configureFromEnv() {
    String apiKey = System.getenv("LANGSMITH_API_KEY");
    if (apiKey == null || apiKey.isEmpty()) {
      throw new IllegalStateException(
          "LANGSMITH_API_KEY environment variable is required. " +
              "Please set it with your LangSmith API key.");
    }

    String projectName = System.getenv("LANGSMITH_PROJECT");
    String serviceName = System.getenv("OTEL_SERVICE_NAME");
    String endpoint = System.getenv("LANGSMITH_OTLP_ENDPOINT");

    return configureForLangSmith(apiKey, projectName, serviceName, endpoint);
  }

  /**
   * Forces flushing of all pending spans to ensure they are exported.
   * This should be called before application shutdown to ensure all spans
   * are sent to LangSmith.
   *
   * @return true if flush completed successfully, false otherwise
   */
  public static boolean flush() {
    return flush(5, TimeUnit.SECONDS);
  }

  /**
   * Forces flushing of all pending spans to ensure they are exported.
   * This should be called before application shutdown to ensure all spans
   * are sent to LangSmith.
   *
   * @param timeout the maximum time to wait for flush to complete
   * @param unit    the time unit of the timeout
   * @return true if flush completed successfully, false otherwise
   */
  public static boolean flush(long timeout, TimeUnit unit) {
    OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
    if (openTelemetry instanceof OpenTelemetrySdk) {
      // Don't close the SDK instance - it's the global instance that should remain
      // alive
      @SuppressWarnings("resource")
      OpenTelemetrySdk sdk = (OpenTelemetrySdk) openTelemetry;
      SdkTracerProvider tracerProvider = sdk.getSdkTracerProvider();
      if (tracerProvider != null) {
        try {
          io.opentelemetry.sdk.common.CompletableResultCode result = tracerProvider.forceFlush();
          result.join(timeout, unit);
          if (!result.isSuccess()) {
            System.err.println("Warning: Flush did not complete successfully");
          }
          return result.isSuccess();
        } catch (Exception e) {
          System.err.println("Warning: Failed to flush spans: " + e.getMessage());
          e.printStackTrace();
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Shuts down the OpenTelemetry SDK and ensures all spans are exported.
   * This should be called before application shutdown.
   */
  public static void shutdown() {
    OpenTelemetry openTelemetry = io.opentelemetry.api.GlobalOpenTelemetry.get();
    if (openTelemetry instanceof OpenTelemetrySdk) {
      // Don't close the SDK instance - it's the global instance that should remain
      // alive
      @SuppressWarnings("resource")
      OpenTelemetrySdk sdk = (OpenTelemetrySdk) openTelemetry;
      SdkTracerProvider tracerProvider = sdk.getSdkTracerProvider();
      if (tracerProvider != null) {
        try {
          tracerProvider.shutdown().join(5, TimeUnit.SECONDS);
        } catch (Exception e) {
          System.err.println("Warning: Failed to shutdown OpenTelemetry: " + e.getMessage());
          e.printStackTrace();
        }
      }
    }
  }

  /**
   * Wrapper SpanExporter that logs export errors to help debug issues.
   */
  private static class LoggingSpanExporter implements SpanExporter {
    private final SpanExporter delegate;
    private static final boolean DEBUG = Boolean.getBoolean("langsmith.debug")
        || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));

    LoggingSpanExporter(SpanExporter delegate) {
      this.delegate = delegate;
    }

    @Override
    public io.opentelemetry.sdk.common.CompletableResultCode export(
        java.util.Collection<io.opentelemetry.sdk.trace.data.SpanData> spans) {
      if (DEBUG) {
        System.out.println("[LangSmith] Exporting " + spans.size() + " span(s):");
        for (io.opentelemetry.sdk.trace.data.SpanData span : spans) {
          System.out.println("  - " + span.getName()
              + " (kind=" + span.getKind()
              + ", attributes=" + span.getAttributes().size() + ")");
        }
      }

      io.opentelemetry.sdk.common.CompletableResultCode result = delegate.export(spans);

      // For SimpleSpanProcessor, wait for the result synchronously to get immediate
      // feedback
      // For BatchSpanProcessor, this will return immediately but we can still check
      // status
      if (DEBUG) {
        // Wait up to 5 seconds for the result
        try {
          result.join(5, java.util.concurrent.TimeUnit.SECONDS);
          if (!result.isSuccess()) {
            System.err.println("[LangSmith ERROR] Failed to export " + spans.size() + " span(s) to LangSmith");
            System.err.println("  This usually indicates a network error or authentication problem");
            System.err.println("  Check your LANGSMITH_API_KEY and network connectivity");
          } else {
            System.out.println("[LangSmith] Successfully exported " + spans.size() + " span(s)");
          }
        } catch (Exception e) {
          System.err.println("[LangSmith ERROR] Exception waiting for export result: " + e.getMessage());
          e.printStackTrace();
        }
      } else {
        // Without DEBUG, still log errors but don't block
        result.whenComplete(() -> {
          if (!result.isSuccess()) {
            System.err.println("[LangSmith ERROR] Failed to export " + spans.size() + " span(s) to LangSmith");
            System.err.println("  This usually indicates a network error or authentication problem");
            System.err.println("  Check your LANGSMITH_API_KEY and network connectivity");
          }
        });
      }
      return result;
    }

    @Override
    public io.opentelemetry.sdk.common.CompletableResultCode flush() {
      if (DEBUG) {
        System.out.println("[LangSmith] Flushing spans...");
      }
      io.opentelemetry.sdk.common.CompletableResultCode result = delegate.flush();
      result.whenComplete(() -> {
        if (!result.isSuccess()) {
          System.err.println("[LangSmith ERROR] Failed to flush spans");
        } else if (DEBUG) {
          System.out.println("[LangSmith] Flush completed successfully");
        }
      });
      return result;
    }

    @Override
    public io.opentelemetry.sdk.common.CompletableResultCode shutdown() {
      if (DEBUG) {
        System.out.println("[LangSmith] Shutting down span exporter...");
      }
      return delegate.shutdown();
    }
  }
}
