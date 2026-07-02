package com.langchain.smith.example.otel.config

import com.langchain.smith.otel.OtelTraceExporter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit
import jakarta.annotation.PreDestroy

/**
 * Ensures OpenTelemetry traces are flushed on application shutdown.
 */
@Component
class OtelShutdownHook @Autowired constructor(
    private val exporter: OtelTraceExporter
) {

    @PreDestroy
    fun onShutdown() {
        println("\n→ Flushing OpenTelemetry traces...")
        try {
            exporter.flush().join(10000, TimeUnit.MILLISECONDS)
            println("✓ Traces flushed successfully")
        } catch (e: Exception) {
            System.err.println("✗ Failed to flush traces: ${e.message}")
        }
    }
}
