package com.langchain.smith.example.otel.config;

import com.langchain.smith.otel.OtelConfig;
import com.langchain.smith.otel.OtelTraceExporter;
import io.opentelemetry.api.trace.Tracer;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring configuration for OpenTelemetry integration with LangSmith.
 */
@Configuration
public class OtelConfiguration {

    @Bean
    public OtelTraceExporter otelTraceExporter() {
        String apiKey = System.getenv("LANGSMITH_API_KEY");
        String projectName = System.getenv("LANGSMITH_PROJECT");
        if (projectName == null || projectName.isEmpty()) {
            projectName = "default";
        }

        Map<String, String> headers = new HashMap<>();
        headers.put("x-api-key", apiKey);
        headers.put("Langsmith-Project", projectName);

        OtelConfig config = OtelConfig.builder()
                .enabled(true)
                .endpoint("https://api.smith.langchain.com/otel/v1/traces")
                .headers(headers)
                .timeout(Duration.ofSeconds(30))
                .serviceName("spring-boot-langsmith")
                .build();

        return OtelTraceExporter.fromConfig(config);
    }

    @Bean
    public Tracer tracer(OtelTraceExporter exporter) {
        return exporter.getTracer();
    }
}
