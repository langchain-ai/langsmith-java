package com.langchain.smith.otel

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OtelTraceExporterTest {

    @Test
    fun redactHeadersForLoggingRedactsSensitiveHeaderValuesCaseInsensitively() {
        val redacted =
            redactHeadersForLogging(
                mapOf(
                    "x-api-key" to "secret-api-key",
                    "Authorization" to "Bearer secret-token",
                    "Langsmith-Project" to "project-name",
                )
            )

        assertThat(redacted)
            .containsEntry("x-api-key", "[REDACTED]")
            .containsEntry("Authorization", "[REDACTED]")
            .containsEntry("Langsmith-Project", "project-name")
        assertThat(redacted.values).doesNotContain("secret-api-key", "Bearer secret-token")
    }
}
