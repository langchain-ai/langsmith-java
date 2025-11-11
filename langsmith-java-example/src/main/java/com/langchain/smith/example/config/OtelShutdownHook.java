package com.langchain.smith.example.config;

import com.langchain.smith.otel.OtelTraceExporter;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Ensures OpenTelemetry traces are flushed on application shutdown.
 */
@Component
public class OtelShutdownHook {

    private final OtelTraceExporter exporter;

    @Autowired
    public OtelShutdownHook(OtelTraceExporter exporter) {
        this.exporter = exporter;
    }

    @PreDestroy
    public void onShutdown() {
        System.out.println("\n→ Flushing OpenTelemetry traces...");
        try {
            exporter.flush().join(10000, java.util.concurrent.TimeUnit.MILLISECONDS);
            System.out.println("✓ Traces flushed successfully");
        } catch (Exception e) {
            System.err.println("✗ Failed to flush traces: " + e.getMessage());
        }
    }
}
