package com.langchain.smith.sandbox

import java.io.ByteArrayOutputStream

/**
 * Collects a command's output in memory, up to [limitBytes].
 *
 * This is what [SandboxClient.run] uses. Prefer it over a hand-rolled accumulator when writing a
 * handler that needs to keep output: the streaming request has no overall timeout, so an unbounded
 * accumulator will grow the heap for as long as a command keeps producing, and a command's output
 * is often not the caller's own to trust.
 *
 * [limitBytes] bounds the two streams together, and exceeding it raises
 * [SandboxOutputTooLargeException] from the call that is streaming. Stream without collecting to
 * consume output of genuinely unknown size — that is the only way to go past [MAX_LIMIT_BYTES].
 *
 * Not safe to share between concurrent commands.
 */
class CollectingHandler(val limitBytes: Long) : ExecOutputHandler {

    init {
        require(limitBytes > 0) { "limitBytes must be positive" }
        // Beyond this the accumulator cannot represent the output it is asked to hold, so the
        // limit could never be enforced: growth would die on an OutOfMemoryError instead of
        // raising SandboxOutputTooLargeException, which is the opposite of the point.
        require(limitBytes <= MAX_LIMIT_BYTES) {
            "limitBytes must be at most $MAX_LIMIT_BYTES, the most output that can be collected" +
                " in memory; stream without collecting to consume more than that"
        }
    }

    private val stdout = ByteArrayOutputStream()
    private val stderr = ByteArrayOutputStream()

    /** Total bytes collected so far across both streams. */
    fun size(): Long = stdout.size().toLong() + stderr.size().toLong()

    fun stdout(): ByteArray = stdout.toByteArray()

    fun stderr(): ByteArray = stderr.toByteArray()

    override fun onStdout(chunk: ByteArray) = collect(stdout, chunk)

    override fun onStderr(chunk: ByteArray) = collect(stderr, chunk)

    companion object {
        /** The most a single in-memory accumulator can hold, since it is indexed by an `Int`. */
        const val MAX_LIMIT_BYTES: Long = Int.MAX_VALUE.toLong()
    }

    private fun collect(sink: ByteArrayOutputStream, chunk: ByteArray) {
        // Checked before the write, so what is collected never exceeds the limit.
        if (size() + chunk.size > limitBytes) {
            throw SandboxOutputTooLargeException(
                limitBytes,
                "command produced more than $limitBytes bytes of output; stream it without" +
                    " collecting, or raise the limit",
            )
        }
        sink.write(chunk)
    }
}
