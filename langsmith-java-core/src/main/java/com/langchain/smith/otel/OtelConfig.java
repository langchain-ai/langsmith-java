package com.langchain.smith.otel;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Configuration for OpenTelemetry trace export.
 *
 * <p>This class provides configuration options for exporting LangSmith runs as OpenTelemetry traces.
 * Configuration can be loaded from environment variables or system properties, or set manually via
 * the builder.
 *
 * <p>Environment variables:
 * <ul>
 *   <li>OTEL_EXPORTER_OTLP_ENDPOINT: The OTEL endpoint URL (default: http://localhost:4318/v1/traces)
 *   <li>OTEL_EXPORTER_OTLP_ENABLED: Whether export is enabled (default: false)
 *   <li>OTEL_EXPORTER_OTLP_TIMEOUT: Timeout in seconds (default: 10)
 * </ul>
 *
 * <p>System properties:
 * <ul>
 *   <li>langchain.otel.endpoint
 *   <li>langchain.otel.enabled
 *   <li>langchain.otel.timeout
 * </ul>
 */
public final class OtelConfig {
    private final String endpoint;
    private final boolean enabled;
    private final Duration timeout;
    private final Map<String, String> headers;
    private final String serviceName;

    private OtelConfig(Builder builder) {
        this.endpoint = builder.endpoint;
        this.enabled = builder.enabled;
        this.timeout = builder.timeout;
        this.headers = Collections.unmodifiableMap(new HashMap<>(builder.headers));
        this.serviceName = builder.serviceName;
    }

    /**
     * Returns the OpenTelemetry endpoint URL.
     *
     * @return the endpoint URL
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Returns whether OpenTelemetry export is enabled.
     *
     * @return true if enabled, false otherwise
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Returns the timeout for export requests.
     *
     * @return the timeout duration
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Returns additional headers to include in export requests.
     *
     * @return a map of header names to values
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Returns the service name for OpenTelemetry traces.
     *
     * @return the service name, or null if not set
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Creates a new builder for constructing an OtelConfig.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Creates a configuration from environment variables or system properties.
     *
     * <p>System properties take precedence over environment variables.
     *
     * @return a configuration loaded from environment/system properties
     */
    public static OtelConfig fromEnv() {
        String endpoint =
                System.getProperty("langchain.otel.endpoint") != null
                        ? System.getProperty("langchain.otel.endpoint")
                        : System.getenv("OTEL_EXPORTER_OTLP_ENDPOINT") != null
                                ? System.getenv("OTEL_EXPORTER_OTLP_ENDPOINT")
                                : "http://localhost:4318/v1/traces";

        String enabledStr =
                System.getProperty("langchain.otel.enabled") != null
                        ? System.getProperty("langchain.otel.enabled")
                        : System.getenv("OTEL_EXPORTER_OTLP_ENABLED") != null
                                ? System.getenv("OTEL_EXPORTER_OTLP_ENABLED")
                                : "false";
        boolean enabled = "true".equalsIgnoreCase(enabledStr);

        String timeoutStr =
                System.getProperty("langchain.otel.timeout") != null
                        ? System.getProperty("langchain.otel.timeout")
                        : System.getenv("OTEL_EXPORTER_OTLP_TIMEOUT") != null
                                ? System.getenv("OTEL_EXPORTER_OTLP_TIMEOUT")
                                : "10";
        long timeoutSeconds = 10L;
        try {
            timeoutSeconds = Long.parseLong(timeoutStr);
        } catch (NumberFormatException e) {
            // Use default
        }
        Duration timeout = Duration.ofSeconds(timeoutSeconds);

        String serviceName =
                System.getProperty("langchain.otel.service.name") != null
                        ? System.getProperty("langchain.otel.service.name")
                        : System.getenv("OTEL_SERVICE_NAME") != null
                                ? System.getenv("OTEL_SERVICE_NAME")
                                : null;

        Builder configBuilder = builder().endpoint(endpoint).enabled(enabled).timeout(timeout);
        if (serviceName != null) {
            configBuilder.serviceName(serviceName);
        }
        return configBuilder.build();
    }

    /** Builder for OtelConfig. */
    public static final class Builder {
        private String endpoint = "http://localhost:4318/v1/traces";
        private boolean enabled = false;
        private Duration timeout = Duration.ofSeconds(10);
        private Map<String, String> headers = new HashMap<>();
        private String serviceName = null;

        private Builder() {}

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
         * Builds the OtelConfig.
         *
         * @return a new OtelConfig instance
         */
        public OtelConfig build() {
            return new OtelConfig(this);
        }
    }
}

