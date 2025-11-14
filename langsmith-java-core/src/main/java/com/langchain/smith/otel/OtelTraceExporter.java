package com.langchain.smith.otel;

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
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Manages OpenTelemetry SDK for exporting traces to OTLP endpoints.
 *
 * <p>This class initializes the OpenTelemetry SDK with OTLP HTTP export capabilities,
 * providing a Tracer for creating spans with Gen AI semantic conventions.
 */
public final class OtelTraceExporter {
    private static final Logger logger = LoggerFactory.getLogger(OtelTraceExporter.class);
    private static final String INSTRUMENTATION_NAME = "langsmith-java";
    private static final String INSTRUMENTATION_VERSION = "0.1.0";

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
        logger.debug("Created OpenTelemetry SDK with endpoint: {}, timeout: {}",
            config.getEndpoint(), config.getTimeout());
        logger.debug("Headers: {}", config.getHeaders());
        logger.debug("Service name: {}, Project name: {}", serviceName, projectName);

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
