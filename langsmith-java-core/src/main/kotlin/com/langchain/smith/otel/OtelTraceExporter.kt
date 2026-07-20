package com.langchain.smith.otel

import com.langchain.smith.core.http.isSensitiveHeader
import io.opentelemetry.api.OpenTelemetry
import io.opentelemetry.api.trace.Tracer
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter
import io.opentelemetry.sdk.OpenTelemetrySdk
import io.opentelemetry.sdk.common.CompletableResultCode
import io.opentelemetry.sdk.resources.Resource
import io.opentelemetry.sdk.trace.SdkTracerProvider
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor
import io.opentelemetry.semconv.ServiceAttributes
import java.time.Duration
import java.util.concurrent.TimeUnit
import org.slf4j.LoggerFactory

internal fun redactHeadersForLogging(headers: Map<String, String>): Map<String, String> =
    headers.mapValues { (name, value) -> if (isSensitiveHeader(name)) "[REDACTED]" else value }

/**
 * Manages OpenTelemetry SDK for exporting traces to OTLP endpoints.
 *
 * This class initializes the OpenTelemetry SDK with OTLP HTTP export capabilities, providing a
 * Tracer for creating spans with Gen AI semantic conventions.
 */
class OtelTraceExporter
private constructor(
    private val config: OtelConfig,
    private val openTelemetry: OpenTelemetry,
    val tracer: Tracer,
    private val tracerProvider: SdkTracerProvider,
    projectName: String?,
) {
    val projectName: String = projectName ?: "default"

    fun shutdown(): CompletableResultCode = tracerProvider.shutdown()

    fun flush(): CompletableResultCode = tracerProvider.forceFlush()

    companion object {
        private val logger = LoggerFactory.getLogger(OtelTraceExporter::class.java)
        private const val INSTRUMENTATION_NAME = "langsmith-java"
        private const val INSTRUMENTATION_VERSION = "0.1.0"

        @JvmStatic fun fromEnv(): OtelTraceExporter = fromConfig(OtelConfig.fromEnv())

        @JvmStatic
        fun fromConfig(config: OtelConfig): OtelTraceExporter {
            val serviceName = config.serviceName ?: "langsmith-app"
            val resource =
                Resource.getDefault()
                    .toBuilder()
                    .put(ServiceAttributes.SERVICE_NAME, serviceName)
                    .put(ServiceAttributes.SERVICE_VERSION, INSTRUMENTATION_VERSION)
                    .build()

            if (!config.enabled) {
                val tracerProvider = SdkTracerProvider.builder().build()
                val openTelemetry =
                    OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build()
                val tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME, INSTRUMENTATION_VERSION)
                return OtelTraceExporter(config, openTelemetry, tracer, tracerProvider, null)
            }

            val exporterBuilder =
                OtlpHttpSpanExporter.builder()
                    .setEndpoint(config.endpoint)
                    .setTimeout(config.timeout)
            for ((key, value) in config.headers) {
                exporterBuilder.addHeader(key, value)
            }
            val exporter = exporterBuilder.build()

            val spanProcessor =
                BatchSpanProcessor.builder(exporter)
                    .setScheduleDelay(5, TimeUnit.SECONDS)
                    .setMaxQueueSize(2048)
                    .setMaxExportBatchSize(512)
                    .build()

            val tracerProvider =
                SdkTracerProvider.builder()
                    .addResource(resource)
                    .addSpanProcessor(spanProcessor)
                    .build()

            val openTelemetry = OpenTelemetrySdk.builder().setTracerProvider(tracerProvider).build()
            val tracer = openTelemetry.getTracer(INSTRUMENTATION_NAME, INSTRUMENTATION_VERSION)
            val projectName = config.headers["Langsmith-Project"] ?: "default"

            logger.debug(
                "Created OpenTelemetry SDK with endpoint: {}, timeout: {}",
                config.endpoint,
                config.timeout,
            )
            logger.debug("Headers: {}", redactHeadersForLogging(config.headers))
            logger.debug("Service name: {}, Project name: {}", serviceName, projectName)

            return OtelTraceExporter(config, openTelemetry, tracer, tracerProvider, projectName)
        }

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder {
        private var config: OtelConfig? = null
        private var endpoint: String? = null
        private var enabled: Boolean? = null
        private var timeout: Duration? = null
        private val headers: MutableMap<String, String> = mutableMapOf()
        private var serviceName: String? = null

        fun config(config: OtelConfig) = apply { this.config = config }

        fun endpoint(endpoint: String) = apply { this.endpoint = endpoint }

        fun enabled(enabled: Boolean) = apply { this.enabled = enabled }

        fun timeout(timeout: Duration) = apply { this.timeout = timeout }

        fun headers(headers: Map<String, String>) = apply {
            this.headers.clear()
            this.headers.putAll(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers[name] = value }

        fun serviceName(serviceName: String?) = apply { this.serviceName = serviceName }

        fun build(): OtelTraceExporter {
            val finalConfig =
                config
                    ?: OtelConfig.builder()
                        .endpoint(endpoint ?: "http://localhost:4318/v1/traces")
                        .enabled(enabled ?: false)
                        .timeout(timeout ?: Duration.ofSeconds(10))
                        .headers(headers)
                        .let { b -> if (serviceName != null) b.serviceName(serviceName) else b }
                        .build()
            return fromConfig(finalConfig)
        }
    }
}
