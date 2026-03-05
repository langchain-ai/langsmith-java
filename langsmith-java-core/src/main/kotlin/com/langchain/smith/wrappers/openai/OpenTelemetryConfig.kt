package com.langchain.smith.wrappers.openai

import io.opentelemetry.api.GlobalOpenTelemetry
import io.opentelemetry.exporter.otlp.http.trace.OtlpHttpSpanExporter
import io.opentelemetry.sdk.OpenTelemetrySdk
import io.opentelemetry.sdk.common.CompletableResultCode
import io.opentelemetry.sdk.resources.Resource
import io.opentelemetry.sdk.trace.SdkTracerProvider
import io.opentelemetry.sdk.trace.SpanProcessor
import io.opentelemetry.sdk.trace.data.SpanData
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor
import io.opentelemetry.sdk.trace.export.SimpleSpanProcessor
import io.opentelemetry.sdk.trace.export.SpanExporter
import java.io.PrintWriter
import java.io.StringWriter
import java.util.concurrent.TimeUnit
import org.slf4j.LoggerFactory

/**
 * Configuration utility for setting up OpenTelemetry to export traces to LangSmith.
 *
 * Example usage:
 * ```
 * OpenTelemetryConfig.builder()
 *     .apiKey("your-langsmith-api-key")
 *     .projectName("your-project-name")
 *     .build()
 *
 * // Or using only environment variables (LANGSMITH_API_KEY, LANGSMITH_PROJECT)
 * OpenTelemetryConfig.builder().build()
 *
 * val client = WrappedOpenAIClient.fromEnv()
 * ```
 */
object OpenTelemetryConfig {
    private val logger = LoggerFactory.getLogger(OpenTelemetryConfig::class.java)

    const val DEFAULT_BASE_URL: String = "https://api.smith.langchain.com"
    const val OTLP_TRACES_PATH: String = "/otel/v1/traces"

    enum class SpanProcessorType {
        /** Batch export - best for production. */
        BATCH,
        /** Simple synchronous export on span.end() - best for testing. */
        SIMPLE,
    }

    @JvmStatic fun builder(): Builder = Builder()

    @JvmStatic fun flush(): Boolean = flush(5, TimeUnit.SECONDS)

    @JvmStatic
    fun flush(timeout: Long, unit: TimeUnit): Boolean {
        val openTelemetry = GlobalOpenTelemetry.get()
        if (openTelemetry is OpenTelemetrySdk) {
            val tracerProvider = openTelemetry.getSdkTracerProvider()
            if (tracerProvider != null) {
                return try {
                    val result = tracerProvider.forceFlush()
                    result.join(timeout, unit)
                    if (!result.isSuccess) logger.warn("Flush did not complete successfully")
                    result.isSuccess
                } catch (e: Exception) {
                    logger.warn("Failed to flush spans", e)
                    false
                }
            }
        }
        return true
    }

    @JvmStatic
    fun shutdown() {
        val openTelemetry = GlobalOpenTelemetry.get()
        if (openTelemetry is OpenTelemetrySdk) {
            val tracerProvider = openTelemetry.getSdkTracerProvider()
            if (tracerProvider != null) {
                try {
                    tracerProvider.shutdown().join(5, TimeUnit.SECONDS)
                } catch (e: Exception) {
                    logger.warn("Failed to shutdown OpenTelemetry", e)
                }
            }
        }
    }

    private fun buildOtlpEndpoint(baseUrl: String?): String {
        val base = (baseUrl?.takeIf { it.isNotBlank() } ?: DEFAULT_BASE_URL).trim().removeSuffix("/")
        return base + OTLP_TRACES_PATH
    }

    class Builder {
        private var apiKey: String? = System.getenv("LANGSMITH_API_KEY")
        private var projectName: String? = System.getenv("LANGSMITH_PROJECT")
        private var serviceName: String? = System.getenv("OTEL_SERVICE_NAME")
        private var baseUrl: String? = System.getenv("LANGSMITH_ENDPOINT")
        private var processorType: SpanProcessorType = SpanProcessorType.BATCH
        private var maxBatchSize: Int = 512

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun projectName(projectName: String?) = apply { this.projectName = projectName }

        fun serviceName(serviceName: String?) = apply { this.serviceName = serviceName }

        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        fun processorType(processorType: SpanProcessorType) = apply {
            this.processorType = processorType
        }

        fun maxBatchSize(maxBatchSize: Int) = apply { this.maxBatchSize = maxBatchSize }

        fun buildSpanProcessor(): SpanProcessor {
            require(!apiKey.isNullOrEmpty()) {
                "LangSmith API key is required. Set it using apiKey() or LANGSMITH_API_KEY environment variable."
            }
            val endpointUrl = buildOtlpEndpoint(baseUrl)
            val exporterBuilder =
                OtlpHttpSpanExporter.builder()
                    .setEndpoint(endpointUrl)
                    .addHeader("x-api-key", apiKey!!)
            if (!projectName.isNullOrEmpty()) {
                exporterBuilder.addHeader("Langsmith-Project", projectName!!)
            }
            val spanExporter = exporterBuilder.build()
            val loggingExporter = LoggingSpanExporter(spanExporter)
            return when (processorType) {
                SpanProcessorType.SIMPLE -> SimpleSpanProcessor.create(loggingExporter)
                SpanProcessorType.BATCH ->
                    BatchSpanProcessor.builder(loggingExporter)
                        .setScheduleDelay(100, TimeUnit.MILLISECONDS)
                        .setMaxExportBatchSize(maxBatchSize)
                        .setExporterTimeout(5, TimeUnit.SECONDS)
                        .build()
            }
        }

        fun build(): io.opentelemetry.api.OpenTelemetry {
            require(!apiKey.isNullOrEmpty()) {
                "LangSmith API key is required. Set it using apiKey() or LANGSMITH_API_KEY environment variable."
            }
            val endpointUrl = buildOtlpEndpoint(baseUrl)
            val exporterBuilder =
                OtlpHttpSpanExporter.builder()
                    .setEndpoint(endpointUrl)
                    .addHeader("x-api-key", apiKey!!)
            if (!projectName.isNullOrEmpty()) {
                exporterBuilder.addHeader("Langsmith-Project", projectName!!)
            }
            val spanExporter = exporterBuilder.build()
            val loggingExporter = LoggingSpanExporter(spanExporter)
            val resource =
                Resource.getDefault()
                    .merge(
                        Resource.builder()
                            .put("service.name", serviceName ?: "langsmith-java-otel-wrappers")
                            .build()
                    )
            val spanProcessor =
                when (processorType) {
                    SpanProcessorType.SIMPLE -> SimpleSpanProcessor.create(loggingExporter)
                    SpanProcessorType.BATCH ->
                        BatchSpanProcessor.builder(loggingExporter)
                            .setScheduleDelay(100, TimeUnit.MILLISECONDS)
                            .setMaxExportBatchSize(maxBatchSize)
                            .setExporterTimeout(5, TimeUnit.SECONDS)
                            .build()
                }
            val tracerProvider =
                SdkTracerProvider.builder()
                    .addSpanProcessor(spanProcessor)
                    .setResource(resource)
                    .build()
            return OpenTelemetrySdk.builder()
                .setTracerProvider(tracerProvider)
                .buildAndRegisterGlobal()
        }

        private fun buildOtlpEndpoint(baseUrl: String?): String =
            OpenTelemetryConfig.buildOtlpEndpoint(baseUrl)
    }

    private class LoggingSpanExporter(private val delegate: SpanExporter) : SpanExporter {
        override fun export(spans: Collection<SpanData>): CompletableResultCode {
            if (DEBUG) {
                logger.debug("[LangSmith] Exporting ${spans.size} span(s):")
                for (span in spans) {
                    logger.debug(
                        "  - ${span.name} (kind=${span.kind}, attributes=${span.attributes.size()})"
                    )
                }
            }
            val result = delegate.export(spans)
            // Always wait for export to complete so flush/shutdown don't run before the HTTP
            // request finishes. Without this, shutdown can abort in-flight exports and traces are lost.
            try {
                result.join(5, TimeUnit.SECONDS)
            } catch (e: Exception) {
                if (DEBUG) logger.error("[LangSmith ERROR] Exception waiting for export result", e)
                else logger.error("[LangSmith] Exception waiting for export result", e)
            }
            if (!result.isSuccess) {
                logger.error("[LangSmith ERROR] Failed to export ${spans.size} span(s) to LangSmith")
                logExportException(result)
                if (DEBUG) {
                    for (span in spans) {
                        logger.error(
                            "  - ${span.name} (traceId=${span.traceId}, spanId=${span.spanId})"
                        )
                    }
                    logger.error(
                        "  This usually indicates a network error, authentication problem, or invalid span data"
                    )
                    logger.error("  Check your LANGSMITH_API_KEY and network connectivity")
                } else {
                    logger.error("  Set LANGSMITH_DEBUG=true for more details")
                }
            } else if (DEBUG) {
                logger.debug("[LangSmith] Successfully exported ${spans.size} span(s)")
            }
            return result
        }

        override fun flush(): CompletableResultCode {
            if (DEBUG) logger.debug("[LangSmith] Flushing spans...")
            val result = delegate.flush()
            result.whenComplete {
                if (!result.isSuccess) logger.error("[LangSmith ERROR] Failed to flush spans")
                else if (DEBUG) logger.debug("[LangSmith] Flush completed successfully")
            }
            return result
        }

        override fun shutdown(): CompletableResultCode {
            if (DEBUG) logger.debug("[LangSmith] Shutting down span exporter...")
            return delegate.shutdown()
        }

        companion object {
            private val logger =
                LoggerFactory.getLogger(LoggingSpanExporter::class.java)
            private val DEBUG =
                java.lang.Boolean.getBoolean("langsmith.debug") ||
                    "true".equals(System.getenv("LANGSMITH_DEBUG"), ignoreCase = true)

            private fun logExportException(result: CompletableResultCode) {
                try {
                    val getExceptionMethod = result.javaClass.getMethod("getException")
                    val exception = getExceptionMethod.invoke(result) as? Throwable
                    if (exception != null) {
                        logger.error("  Error: ${exception.message}")
                        exception.cause?.let { logger.error("  Caused by: ${it.message}") }
                        if (DEBUG) {
                            val sw = StringWriter()
                            exception.printStackTrace(PrintWriter(sw))
                            logger.debug("  Stack trace:\n${sw}")
                        }
                    }
                } catch (_: Exception) {}
            }
        }
    }
}
