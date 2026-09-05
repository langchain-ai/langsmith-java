package com.langchain.smith.sandbox

import java.util.function.Consumer

/**
 * Receives a command's output as it arrives.
 *
 * Callbacks run on the thread that called [SandboxClient.stream], in stream order. A callback that
 * blocks stops the client reading, which eventually backpressures the command itself, so hand slow
 * work to another thread.
 *
 * Chunks are raw bytes and carry no encoding guarantee: a multi-byte character can be split across
 * two of them, so decode the concatenation rather than each chunk.
 */
interface ExecOutputHandler {

    /** Called once per connection, including after a reconnect, before any output. */
    fun onStarted(commandId: String, pid: Int) {}

    fun onStdout(chunk: ByteArray) {}

    fun onStderr(chunk: ByteArray) {}

    companion object {

        @JvmStatic
        fun of(onStdout: Consumer<ByteArray>, onStderr: Consumer<ByteArray>): ExecOutputHandler =
            object : ExecOutputHandler {
                override fun onStdout(chunk: ByteArray) = onStdout.accept(chunk)

                override fun onStderr(chunk: ByteArray) = onStderr.accept(chunk)
            }
    }
}
