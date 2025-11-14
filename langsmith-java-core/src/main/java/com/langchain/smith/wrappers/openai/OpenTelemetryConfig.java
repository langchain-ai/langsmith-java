package com.langchain.smith.wrappers.openai;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.SpanProcessor;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor;
import io.opentelemetry.sdk.trace.export.SpanExporter;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Configuration utility for setting up OpenTelemetry to export traces to
 * LangSmith.
 *
 * <p>
 * This class provides a convenient way to configure OpenTelemetry with
 * LangSmith's OTLP
 * endpoint using a Builder pattern. Configuration can be done programmatically
 * or via environment variables.
 *
 * <p>
 * Example usage:
 *
 * <pre>{@code
 * // Configure OpenTelemetry for LangSmith before using the wrapper
 * OpenTelemetryConfig.builder()
 *     .apiKey("your-langsmith-api-key")
 *     .projectName("your-project-name")
 *     .build();
 *
 * // Or using only environment variables (LANGSMITH_API_KEY, LANGSMITH_PROJECT)
 * OpenTelemetryConfig.builder().build();
 *
 * // Now use the wrapped client - traces will be sent to LangSmith
 * WrappedOpenAIClient client = OpenAIWrappers.wrapFromEnv();
 * }</pre>
 */
public final class OpenTelemetryConfig {
    private static final Logger logger = LoggerFactory.getLogger(OpenTelemetryConfig.class);

    private OpenTelemetryConfig() {
        // Utility class
    }

    /**
     * Default LangSmith base URL.
     * Can be overridden by setting LANGCHAIN_BASE_URL environment variable or
     * by passing a custom base URL to the configuration methods.
     */
    public static final String DEFAULT_BASE_URL = "https://api.smith.langchain.com";

    /**
     * OTLP traces endpoint path.
     * This path is appended to the base URL to construct the full OTLP endpoint.
     */
    public static final String OTLP_TRACES_PATH = "/otel/v1/traces";

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
     * Builder for configuring OpenTelemetry for LangSmith.
     * Provides a fluent API for setting only the parameters you need.
     *
     * <p>
     * Example usage:
     * <pre>{@code
     * OpenTelemetry otel = OpenTelemetryConfig.builder()
     *     .apiKey("your-api-key")
     *     .projectName("MyProject")
     *     .processorType(SpanProcessorType.SIMPLE)
     *     .maxBatchSize(1)
     *     .build();
     * }</pre>
     */
    public static class Builder {
        private String apiKey;
        private String projectName;
        private String serviceName;
        private String baseUrl;
        private SpanProcessorType processorType = SpanProcessorType.BATCH;
        private int maxBatchSize = 512;

        private Builder() {
            // Initialize from environment variables as defaults
            this.apiKey = System.getenv("LANGSMITH_API_KEY");
            this.projectName = System.getenv("LANGSMITH_PROJECT");
            this.serviceName = System.getenv("OTEL_SERVICE_NAME");
            this.baseUrl = System.getenv("LANGCHAIN_BASE_URL");
        }

        /**
         * Sets the LangSmith API key (optional, defaults to LANGSMITH_API_KEY env var).
         *
         * <p>
         * This is your authentication key for LangSmith. You can find it in your
         * LangSmith account settings.
         *
         * <p>
         * If not set explicitly, the builder will use the value from the
         * LANGSMITH_API_KEY environment variable. At least one of these must be provided.
         *
         * @param apiKey your LangSmith API key
         * @return this Builder for method chaining
         * @throws IllegalStateException if apiKey is null or empty when build() is called
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * Sets the LangSmith project name (optional, defaults to LANGSMITH_PROJECT env var).
         *
         * <p>
         * If set, all traces will be sent to this project in LangSmith. The project
         * will be created automatically if it doesn't exist.
         *
         * <p>
         * If not set explicitly, the builder will use the value from the
         * LANGSMITH_PROJECT environment variable.
         *
         * <p>
         * <b>Note:</b> For experiments, you may want to leave this unset and instead
         * use {@link ExperimentContext#withExperiment(String, String)} to set
         * the session ID via span attributes. This prevents the project name from
         * overwriting the session's reference_dataset_id.
         *
         * @param projectName your LangSmith project name
         * @return this Builder for method chaining
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * Sets the service name for OpenTelemetry (optional, defaults to OTEL_SERVICE_NAME env var).
         *
         * <p>
         * This identifies your application in the traces. If not set explicitly,
         * the builder will use the value from the OTEL_SERVICE_NAME environment variable,
         * or fall back to "langsmith-java-otel-wrappers" if not set.
         *
         * <p>
         * The service name appears in the trace metadata and can be used to filter
         * traces from different services.
         *
         * @param serviceName the service name to identify your application
         * @return this Builder for method chaining
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Sets the LangSmith base URL (optional, defaults to LANGCHAIN_BASE_URL env var).
         *
         * <p>
         * The base URL is used to construct the OTLP endpoint by appending "/otel/v1/traces".
         * If not set explicitly, the builder will use the value from the LANGCHAIN_BASE_URL
         * environment variable, or default to "https://api.smith.langchain.com".
         *
         * <p>
         * This is useful for:
         * <ul>
         * <li>Self-hosted LangSmith instances</li>
         * <li>Internal/development environments</li>
         * <li>Testing against different LangSmith deployments</li>
         * </ul>
         *
         * @param baseUrl the LangSmith base URL (e.g., "https://dev.api.smith.langchain.com")
         * @return this Builder for method chaining
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * Sets the span processor type (optional).
         *
         * <p>
         * Determines how spans are processed and exported:
         *
         * <ul>
         * <li><b>BATCH</b> (default, recommended for production):
         *     <ul>
         *     <li>Queues spans and exports them in batches</li>
         *     <li>Non-blocking - doesn't slow down your application</li>
         *     <li>Efficient - reduces network overhead</li>
         *     <li>May have a slight delay before spans appear in LangSmith</li>
         *     </ul>
         * </li>
         * <li><b>SIMPLE</b> (recommended for testing/examples):
         *     <ul>
         *     <li>Exports spans immediately when span.end() is called</li>
         *     <li>Blocking - waits for export to complete</li>
         *     <li>Predictable - spans appear in LangSmith right away</li>
         *     <li><b>Warning:</b> Can impact performance, not recommended for production</li>
         *     </ul>
         * </li>
         * </ul>
         *
         * <p>
         * <b>When to use SIMPLE:</b>
         * <ul>
         * <li>Short-lived applications or scripts</li>
         * <li>Testing and debugging</li>
         * <li>When you need immediate visibility of traces</li>
         * </ul>
         *
         * <p>
         * <b>When to use BATCH:</b>
         * <ul>
         * <li>Production applications</li>
         * <li>High-throughput services</li>
         * <li>Long-running applications</li>
         * <li>When performance is critical</li>
         * </ul>
         *
         * @param processorType the span processor type (BATCH or SIMPLE)
         * @return this Builder for method chaining
         * @see SpanProcessorType
         */
        public Builder processorType(SpanProcessorType processorType) {
            this.processorType = processorType;
            return this;
        }

        /**
         * Sets the maximum batch size for span export (optional).
         *
         * <p>
         * <b>Only applies to BATCH processor type.</b> Ignored when using SIMPLE processor.
         *
         * <p>
         * Controls how many spans are batched together before triggering an export:
         * <ul>
         * <li><b>Default: 512</b> - Good balance between efficiency and latency</li>
         * <li><b>1</b> - Exports immediately (still non-blocking unlike SIMPLE)</li>
         * <li><b>Higher values</b> - More efficient but increased latency</li>
         * </ul>
         *
         * <p>
         * <b>Setting to 1:</b> If you want immediate export but don't want to block
         * your application thread, use BATCH processor with maxBatchSize=1 instead of
         * SIMPLE processor. This gives you non-blocking immediate export.
         *
         * <p>
         * Example for immediate non-blocking export:
         * <pre>{@code
         * OpenTelemetryConfig.builder()
         *     .apiKey(apiKey)
         *     .processorType(SpanProcessorType.BATCH)
         *     .maxBatchSize(1)  // Export immediately but don't block
         *     .build();
         * }</pre>
         *
         * @param maxBatchSize the maximum batch size (1-512, default 512)
         * @return this Builder for method chaining
         */
        public Builder maxBatchSize(int maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        /**
         * Builds and configures the OpenTelemetry instance.
         *
         * @return the configured OpenTelemetry instance
         * @throws IllegalStateException if apiKey is not set
         */
        public OpenTelemetry build() {
            // Validate required fields
            if (apiKey == null || apiKey.isEmpty()) {
                throw new IllegalStateException(
                        "LangSmith API key is required. Set it using apiKey() or LANGSMITH_API_KEY environment"
                                + " variable.");
            }

            // Build OTLP endpoint from base URL
            String endpointUrl = buildOtlpEndpoint(baseUrl);

            // Create OTLP HTTP exporter configured for LangSmith
            OtlpHttpSpanExporterBuilder exporterBuilder =
                    OtlpHttpSpanExporter.builder().setEndpoint(endpointUrl).addHeader("x-api-key", apiKey);

            // Only add project header if projectName is not null and not empty
            if (projectName != null && !projectName.isEmpty()) {
                exporterBuilder.addHeader("Langsmith-Project", projectName);
            }

            OtlpHttpSpanExporter spanExporter = exporterBuilder.build();

            // Wrap exporter to log export errors
            SpanExporter loggingExporter = new LoggingSpanExporter(spanExporter);

            // Create resource with service name
            Resource resource = Resource.getDefault()
                    .merge(Resource.builder()
                            .put("service.name", serviceName != null ? serviceName : "langsmith-java-otel-wrappers")
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

            return OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).buildAndRegisterGlobal();
        }
    }

    /**
     * Creates a new Builder for configuring OpenTelemetry.
     *
     * @return a new Builder instance
     */
    public static Builder builder() {
        return new Builder();
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
            OpenTelemetrySdk sdk = (OpenTelemetrySdk) openTelemetry;
            SdkTracerProvider tracerProvider = sdk.getSdkTracerProvider();
            if (tracerProvider != null) {
                try {
                    io.opentelemetry.sdk.common.CompletableResultCode result = tracerProvider.forceFlush();
                    result.join(timeout, unit);
                    if (!result.isSuccess()) {
                        logger.warn("Flush did not complete successfully");
                    }
                    return result.isSuccess();
                } catch (Exception e) {
                    logger.warn("Failed to flush spans", e);
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Builds the OTLP endpoint URL from a base URL.
     *
     * <p>
     * The endpoint is constructed as: baseUrl + OTLP_TRACES_PATH
     *
     * <p>
     * If baseUrl is null or empty, defaults to DEFAULT_BASE_URL.
     *
     * @param baseUrl the base URL (can be null)
     * @return the OTLP endpoint URL
     */
    private static String buildOtlpEndpoint(String baseUrl) {
        // Use provided base URL or default
        String effectiveBaseUrl = baseUrl;
        if (effectiveBaseUrl == null || effectiveBaseUrl.isEmpty()) {
            effectiveBaseUrl = System.getenv("LANGCHAIN_BASE_URL");
        }
        if (effectiveBaseUrl == null || effectiveBaseUrl.isEmpty()) {
            effectiveBaseUrl = DEFAULT_BASE_URL;
        }

        // Remove trailing slash if present
        if (effectiveBaseUrl.endsWith("/")) {
            effectiveBaseUrl = effectiveBaseUrl.substring(0, effectiveBaseUrl.length() - 1);
        }

        return effectiveBaseUrl + OTLP_TRACES_PATH;
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
                    logger.warn("Failed to shutdown OpenTelemetry", e);
                }
            }
        }
    }

    /**
     * Wrapper SpanExporter that logs export errors to help debug issues.
     */
    private static class LoggingSpanExporter implements SpanExporter {
        private final SpanExporter delegate;
        private static final boolean DEBUG =
                Boolean.getBoolean("langsmith.debug") || "true".equalsIgnoreCase(System.getenv("LANGSMITH_DEBUG"));

        LoggingSpanExporter(SpanExporter delegate) {
            this.delegate = delegate;
        }

        @Override
        public io.opentelemetry.sdk.common.CompletableResultCode export(
                java.util.Collection<io.opentelemetry.sdk.trace.data.SpanData> spans) {
            if (DEBUG) {
                logger.debug("[LangSmith] Exporting " + spans.size() + " span(s):");
                for (io.opentelemetry.sdk.trace.data.SpanData span : spans) {
                    logger.debug("  - " + span.getName()
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
                        logger.error("[LangSmith ERROR] Failed to export " + spans.size() + " span(s) to LangSmith");
                        logger.error("  This usually indicates a network error or authentication problem");
                        logger.error("  Check your LANGSMITH_API_KEY and network connectivity");
                    } else {
                        logger.debug("[LangSmith] Successfully exported " + spans.size() + " span(s)");
                    }
                } catch (Exception e) {
                    logger.error("[LangSmith ERROR] Exception waiting for export result", e);
                }
            } else {
                // Without DEBUG, still log errors but don't block
                result.whenComplete(() -> {
                    if (!result.isSuccess()) {
                        logger.error("[LangSmith ERROR] Failed to export " + spans.size() + " span(s) to LangSmith");
                        logger.error("  This usually indicates a network error or authentication problem");
                        logger.error("  Check your LANGSMITH_API_KEY and network connectivity");
                    }
                });
            }
            return result;
        }

        @Override
        public io.opentelemetry.sdk.common.CompletableResultCode flush() {
            if (DEBUG) {
                logger.debug("[LangSmith] Flushing spans...");
            }
            io.opentelemetry.sdk.common.CompletableResultCode result = delegate.flush();
            result.whenComplete(() -> {
                if (!result.isSuccess()) {
                    logger.error("[LangSmith ERROR] Failed to flush spans");
                } else if (DEBUG) {
                    logger.debug("[LangSmith] Flush completed successfully");
                }
            });
            return result;
        }

        @Override
        public io.opentelemetry.sdk.common.CompletableResultCode shutdown() {
            if (DEBUG) {
                logger.debug("[LangSmith] Shutting down span exporter...");
            }
            return delegate.shutdown();
        }
    }
}
