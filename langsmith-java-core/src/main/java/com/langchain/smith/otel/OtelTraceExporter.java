package com.langchain.smith.otel;

import com.langchain.smith.models.runs.Run;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter;
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.semconv.ResourceAttributes;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Exports LangSmith runs as OpenTelemetry traces to an OTEL endpoint.
 *
 * <p>This exporter converts LangSmith Run objects to OpenTelemetry spans and sends them to a
 * configured OTEL endpoint using the OTLP HTTP protocol.
 */
public final class OtelTraceExporter {
    private static final Logger logger = Logger.getLogger(OtelTraceExporter.class.getName());
    private static final String INSTRUMENTATION_NAME = "langsmith-java";
    private static final String INSTRUMENTATION_VERSION = "0.1.0";

    static {
        logger.setLevel(Level.FINE);
        java.util.logging.ConsoleHandler consoleHandler = new java.util.logging.ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
        logger.addHandler(consoleHandler);
    }

    private final OtelConfig config;
    private final OpenTelemetry openTelemetry;
    private final Tracer tracer;
    private final SdkTracerProvider tracerProvider;
    private final String projectName;

    private OtelTraceExporter(
            OtelConfig config,
            OpenTelemetry openTelemetry,
            Tracer tracer,
            SdkTracerProvider tracerProvider,
            String projectName) {
        this.config = config;
        this.openTelemetry = openTelemetry;
        this.tracer = tracer;
        this.tracerProvider = tracerProvider;
        this.projectName = projectName != null ? projectName : "default";
    }

    /**
     * Get the OpenTelemetry Tracer for creating spans directly.
     * @return The OpenTelemetry Tracer instance
     */
    public Tracer getTracer() {
        return tracer;
    }

    /**
     * Get the project name configured for this exporter.
     * @return The project name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Exports a single run as a span.
     *
     * @param run the run to export
     * @return a CompletableResultCode indicating success or failure
     */
    public CompletableResultCode export(Run run) {
        return export(Collections.singletonList(run));
    }

    /**
     * Exports multiple runs as spans.
     *
     * @param runs the runs to export
     * @return a CompletableResultCode indicating success or failure
     */
    public CompletableResultCode export(List<Run> runs) {
        if (!config.isEnabled() || runs == null || runs.isEmpty()) {
            return CompletableResultCode.ofSuccess();
        }

        try {
            logger.log(Level.FINE, "Creating {0} spans using native OTEL API", runs.size());

            for (Run run : runs) {
                OtelSpanCreator.createSpanFromRun(tracer, run, projectName);
            }

            // Force flush to ensure spans are exported immediately
            CompletableResultCode result = tracerProvider.forceFlush();

            result.whenComplete(() -> {
                if (!result.isSuccess()) {
                    logger.log(
                            Level.SEVERE, "Export failed! Check OpenTelemetry logs above for HTTP response details.");
                    logger.log(Level.SEVERE, "Failed to export {0} spans to {1}", new Object[] {
                        runs.size(), config.getEndpoint()
                    });
                }
            });

            return result;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Exception while exporting runs to OTEL", e);
            e.printStackTrace();
            return CompletableResultCode.ofFailure();
        }
    }

    /**
     * Shuts down the exporter and flushes any pending exports.
     *
     * @return a CompletableResultCode indicating success or failure
     */
    public CompletableResultCode shutdown() {
        return tracerProvider.shutdown();
    }

    /**
     * Flushes any pending exports.
     *
     * @return a CompletableResultCode indicating success or failure
     */
    public CompletableResultCode flush() {
        return tracerProvider.forceFlush();
    }

    /**
     * Creates an OtelTraceExporter from environment variables or system properties.
     *
     * @return a new OtelTraceExporter instance
     * @see OtelConfig#fromEnv()
     */
    public static OtelTraceExporter fromEnv() {
        return fromConfig(OtelConfig.fromEnv());
    }

    /**
     * Creates an OtelTraceExporter from a configuration.
     * Sets up the complete OpenTelemetry SDK with TracerProvider and BatchSpanProcessor.
     *
     * @param config the configuration to use
     * @return a new OtelTraceExporter instance
     */
    public static OtelTraceExporter fromConfig(OtelConfig config) {
        String serviceName = config.getServiceName() != null ? config.getServiceName() : "langsmith-app";

        Resource resource = Resource.getDefault().toBuilder()
                .put(ResourceAttributes.SERVICE_NAME, serviceName)
                .put(ResourceAttributes.SERVICE_VERSION, INSTRUMENTATION_VERSION)
                .build();

        if (!config.isEnabled()) {
            SdkTracerProvider tracerProvider = SdkTracerProvider.builder().build();
            OpenTelemetry openTelemetry =
                    OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();
            Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME, INSTRUMENTATION_VERSION);
            return new OtelTraceExporter(config, openTelemetry, tracer, tracerProvider, null);
        }

        // Build the OTLP HTTP exporter
        OtlpHttpSpanExporterBuilder exporterBuilder =
                OtlpHttpSpanExporter.builder().setEndpoint(config.getEndpoint()).setTimeout(config.getTimeout());

        // Add custom headers
        for (Map.Entry<String, String> header : config.getHeaders().entrySet()) {
            exporterBuilder.addHeader(header.getKey(), header.getValue());
        }

        OtlpHttpSpanExporter exporter = exporterBuilder.build();

        BatchSpanProcessor spanProcessor = BatchSpanProcessor.builder(exporter)
                .setScheduleDelay(5, TimeUnit.SECONDS) // Batch every 5 seconds
                .setMaxQueueSize(2048)
                .setMaxExportBatchSize(512)
                .build();

        // Create TracerProvider with the processor
        SdkTracerProvider tracerProvider = SdkTracerProvider.builder()
                .addResource(resource)
                .addSpanProcessor(spanProcessor)
                .build();

        // Create OpenTelemetry SDK
        OpenTelemetry openTelemetry =
                OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build();

        Tracer tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME, INSTRUMENTATION_VERSION);

        String projectName = config.getHeaders().get("Langsmith-Project");
        if (projectName == null) {
            projectName = "default";
        }

        // Log configuration for debugging
        logger.log(Level.FINE, "Created OpenTelemetry SDK with endpoint: {0}, timeout: {1}", new Object[] {
            config.getEndpoint(), config.getTimeout()
        });
        logger.log(Level.FINE, "Headers: {0}", config.getHeaders());
        logger.log(Level.FINE, "Service name: {0}, Project name: {1}", new Object[] {serviceName, projectName});

        return new OtelTraceExporter(config, openTelemetry, tracer, tracerProvider, projectName);
    }

    /**
     * Creates a builder for OtelTraceExporter.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /** Builder for OtelTraceExporter. */
    public static final class Builder {
        private OtelConfig config;
        private String endpoint;
        private Boolean enabled;
        private Duration timeout;
        private Map<String, String> headers = new java.util.HashMap<>();
        private String serviceName;

        private Builder() {}

        /**
         * Sets the configuration to use.
         *
         * @param config the configuration
         * @return this builder
         */
        public Builder config(OtelConfig config) {
            this.config = config;
            return this;
        }

        /**
         * Sets the OpenTelemetry endpoint URL.
         *
         * @param endpoint the endpoint URL
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * Sets whether OpenTelemetry export is enabled.
         *
         * @param enabled true to enable export, false to disable
         * @return this builder
         */
        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Sets the timeout for export requests.
         *
         * @param timeout the timeout duration
         * @return this builder
         */
        public Builder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /**
         * Sets additional headers to include in export requests.
         *
         * @param headers a map of header names to values
         * @return this builder
         */
        public Builder headers(Map<String, String> headers) {
            this.headers.clear();
            this.headers.putAll(headers);
            return this;
        }

        /**
         * Adds a header to include in export requests.
         *
         * @param name the header name
         * @param value the header value
         * @return this builder
         */
        public Builder putHeader(String name, String value) {
            this.headers.put(name, value);
            return this;
        }

        /**
         * Sets the service name for OpenTelemetry traces.
         *
         * @param serviceName the service name (e.g., "langsmith-java", "my-application")
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Builds the OtelTraceExporter.
         *
         * @return a new OtelTraceExporter instance
         */
        public OtelTraceExporter build() {
            OtelConfig.Builder configBuilder = config != null
                    ? null
                    : OtelConfig.builder()
                            .endpoint(endpoint != null ? endpoint : "http://localhost:4318/v1/traces")
                            .enabled(enabled != null ? enabled : false)
                            .timeout(timeout != null ? timeout : Duration.ofSeconds(10))
                            .headers(headers);

            if (configBuilder != null && serviceName != null) {
                configBuilder.serviceName(serviceName);
            }

            OtelConfig finalConfig = config != null ? config : configBuilder.build();

            return fromConfig(finalConfig);
        }
    }
}
