package com.langchain.smith.otel

import java.time.Duration

/**
 * Configuration for OpenTelemetry trace export.
 *
 * This class provides configuration options for exporting LangSmith runs as OpenTelemetry traces.
 * Configuration can be loaded from environment variables or system properties, or set manually via
 * the builder.
 *
 * Environment variables:
 * - OTEL_EXPORTER_OTLP_ENDPOINT: The OTEL endpoint URL (default: http://localhost:4318/v1/traces)
 * - OTEL_EXPORTER_OTLP_ENABLED: Whether export is enabled (default: false)
 * - OTEL_EXPORTER_OTLP_TIMEOUT: Timeout in seconds (default: 10)
 *
 * System properties:
 * - langchain.otel.endpoint
 * - langchain.otel.enabled
 * - langchain.otel.timeout
 */
class OtelConfig private constructor(
    val endpoint: String,
    val enabled: Boolean,
    val timeout: Duration,
    val headers: Map<String, String>,
    val serviceName: String?,
) {
    class Builder {
        private var endpoint: String = "http://localhost:4318/v1/traces"
        private var enabled: Boolean = false
        private var timeout: Duration = Duration.ofSeconds(10)
        private val headers: MutableMap<String, String> = mutableMapOf()
        private var serviceName: String? = null

        fun endpoint(endpoint: String) = apply { this.endpoint = endpoint }
        fun enabled(enabled: Boolean) = apply { this.enabled = enabled }
        fun timeout(timeout: Duration) = apply { this.timeout = timeout }
        fun headers(headers: Map<String, String>) = apply {
            this.headers.clear()
            this.headers.putAll(headers)
        }
        fun putHeader(name: String, value: String) = apply { headers[name] = value }
        fun serviceName(serviceName: String?) = apply { this.serviceName = serviceName }

        fun build(): OtelConfig = OtelConfig(
            endpoint = endpoint,
            enabled = enabled,
            timeout = timeout,
            headers = headers.toMap(),
            serviceName = serviceName,
        )
    }

    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()

        @JvmStatic
        fun fromEnv(): OtelConfig {
            val endpoint = System.getProperty("langchain.otel.endpoint")
                ?: System.getenv("OTEL_EXPORTER_OTLP_ENDPOINT")
                ?: "http://localhost:4318/v1/traces"

            val enabledStr = System.getProperty("langchain.otel.enabled")
                ?: System.getenv("OTEL_EXPORTER_OTLP_ENABLED")
                ?: "false"
            val enabled = "true".equals(enabledStr, ignoreCase = true)

            val timeoutStr = System.getProperty("langchain.otel.timeout")
                ?: System.getenv("OTEL_EXPORTER_OTLP_TIMEOUT")
                ?: "10"
            val timeoutSeconds = timeoutStr.toLongOrNull() ?: 10L
            val timeout = Duration.ofSeconds(timeoutSeconds)

            val serviceName = System.getProperty("langchain.otel.service.name")
                ?: System.getenv("OTEL_SERVICE_NAME")

            val configBuilder = builder().endpoint(endpoint).enabled(enabled).timeout(timeout)
            return (if (serviceName != null) configBuilder.serviceName(serviceName) else configBuilder).build()
        }
    }
}
