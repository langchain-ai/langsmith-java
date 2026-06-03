package com.langchain.smith.example.otel.config

import com.langchain.smith.otel.OtelConfig
import com.langchain.smith.otel.OtelTraceExporter
import io.opentelemetry.api.trace.Tracer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration

/**
 * Spring configuration for OpenTelemetry integration with LangSmith.
 */
@Configuration
class OtelConfiguration {

    @Bean
    fun otelTraceExporter(): OtelTraceExporter {
        val apiKey = System.getenv("LANGSMITH_API_KEY")
        var projectName = System.getenv("LANGSMITH_PROJECT")
        if (projectName.isNullOrEmpty()) {
            projectName = "default"
        }

        val headers = mapOf(
            "x-api-key" to apiKey,
            "Langsmith-Project" to projectName
        )

        val config = OtelConfig.builder()
            .enabled(true)
            .endpoint("https://api.smith.langchain.com/otel/v1/traces")
            .headers(headers)
            .timeout(Duration.ofSeconds(30))
            .serviceName("spring-boot-langsmith")
            .build()

        return OtelTraceExporter.fromConfig(config)
    }

    @Bean
    fun tracer(exporter: OtelTraceExporter): Tracer = exporter.tracer
}
