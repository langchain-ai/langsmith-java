package com.langchain.smith.sandbox

import java.io.BufferedReader
import java.io.Closeable
import java.io.InputStream
import java.io.InputStreamReader

internal class SseEvent(val name: String, val data: String)

/**
 * Reads Server-Sent Events off a response body.
 *
 * Comment lines carry the sandbox's heartbeat and are skipped, so a quiet command does not look
 * like a dead connection.
 */
internal class SseReader(input: InputStream) : Closeable {

    private val reader = BufferedReader(InputStreamReader(input, Charsets.UTF_8))

    /** Returns the next event, or null once the connection ends. */
    fun next(): SseEvent? {
        var name: String? = null
        val data = StringBuilder()

        while (true) {
            val line = reader.readLine() ?: return null

            if (line.isEmpty()) {
                if (name != null || data.isNotEmpty()) {
                    return SseEvent(name ?: DEFAULT_EVENT, data.toString())
                }
                continue
            }
            if (line.startsWith(":")) {
                continue
            }

            val colon = line.indexOf(':')
            val field = if (colon < 0) line else line.substring(0, colon)
            var value = if (colon < 0) "" else line.substring(colon + 1)
            if (value.startsWith(" ")) {
                value = value.substring(1)
            }
            when (field) {
                "event" -> name = value
                "data" -> {
                    if (data.isNotEmpty()) data.append('\n')
                    data.append(value)
                }
            }
        }
    }

    override fun close() = reader.close()

    private companion object {
        const val DEFAULT_EVENT = "message"
    }
}
