package com.langchain.smith.sandbox

import java.time.Duration

internal class SandboxExecConfig(
    val maxReconnects: Int,
    val maxOutputBytes: Long,
    private val backoffBase: Duration,
    private val backoffMax: Duration,
) {

    /** Exponential backoff for the [attempt]-th consecutive reconnect, starting at 1. */
    fun backoff(attempt: Int): Duration {
        val shift = (attempt - 1).coerceIn(0, 16)
        val millis = backoffBase.toMillis() shl shift
        return if (millis >= backoffMax.toMillis()) backoffMax else Duration.ofMillis(millis)
    }

    companion object {
        val DEFAULT_MAX_RECONNECTS = 5

        /**
         * Far above any ordinary command's output, and small enough to fail before a default heap
         * does. A command whose output legitimately exceeds this should be streamed, not collected.
         */
        val DEFAULT_MAX_OUTPUT_BYTES = 64L * 1024 * 1024

        val DEFAULT_BACKOFF_BASE: Duration = Duration.ofMillis(500)
        val DEFAULT_BACKOFF_MAX: Duration = Duration.ofSeconds(8)
    }
}
