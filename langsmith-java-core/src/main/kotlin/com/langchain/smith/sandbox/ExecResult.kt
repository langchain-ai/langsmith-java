package com.langchain.smith.sandbox

/** The outcome of a command that ran to completion. */
open class ExecResult internal constructor(val commandId: String, val exitCode: Int) {

    fun isSuccess(): Boolean = exitCode == 0

    override fun toString(): String = "ExecResult{commandId=$commandId, exitCode=$exitCode}"
}

/** The outcome of a command whose output was collected, as [SandboxClient.run] does. */
class CollectedExecResult
internal constructor(
    commandId: String,
    exitCode: Int,
    private val stdout: ByteArray,
    private val stderr: ByteArray,
) : ExecResult(commandId, exitCode) {

    fun stdout(): ByteArray = stdout.copyOf()

    fun stderr(): ByteArray = stderr.copyOf()

    fun stdoutString(): String = String(stdout, Charsets.UTF_8)

    fun stderrString(): String = String(stderr, Charsets.UTF_8)

    override fun toString(): String =
        "CollectedExecResult{commandId=$commandId, exitCode=$exitCode," +
            " stdout=${stdout.size}B, stderr=${stderr.size}B}"
}
