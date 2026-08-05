package com.langchain.smith.sandbox

import com.langchain.smith.models.sandboxes.SandboxResponse

/**
 * A handle to one sandbox, so callers work with a sandbox rather than threading its identifier
 * through every call.
 *
 * A stopped sandbox is started on demand by the operations below, so there is no need to start one
 * before using it. [stop] and [delete] are here for callers that want to release it early rather
 * than wait for its TTL.
 *
 * Obtain one from [SandboxClient.create] or [SandboxClient.attach].
 */
class Sandbox internal constructor(private val client: SandboxClient, val ref: String) {

    /** Runs [command] in the sandbox's shell and collects its output. */
    fun run(command: String): CollectedExecResult = client.run(ref, command)

    /** Runs a command to completion and collects its output into the result. */
    fun run(request: ExecRequest): CollectedExecResult = client.run(ref, request)

    /** Runs a command to completion, passing output to [handler] as it arrives. */
    fun stream(request: ExecRequest, handler: ExecOutputHandler): ExecResult =
        client.stream(ref, request, handler)

    fun readFile(path: String): ByteArray = client.readFile(ref, path)

    fun readFileAsString(path: String): String = client.readFileAsString(ref, path)

    fun writeFile(path: String, content: ByteArray): UploadResult =
        client.writeFile(ref, path, content)

    fun writeFile(path: String, content: String): UploadResult =
        client.writeFile(ref, path, content)

    fun glob(request: GlobRequest): GlobResult = client.glob(ref, request)

    fun glob(path: String, pattern: String): GlobResult = client.glob(ref, path, pattern)

    fun grep(request: GrepRequest): GrepResult = client.grep(ref, request)

    /** Searches files under [path] for the literal text [pattern]. Not a regular expression. */
    fun grep(path: String, pattern: String): GrepResult = client.grep(ref, path, pattern)

    fun listDirectory(path: String): GlobResult = client.listDirectory(ref, path)

    /** Current metadata for this sandbox, including its status. */
    fun retrieve(): SandboxResponse = client.retrieve(ref)

    /**
     * Stops the sandbox, releasing its compute.
     *
     * The sandbox and its filesystem survive; the next operation on this handle starts it again.
     */
    fun stop() = client.stop(ref)

    /** Deletes the sandbox and its filesystem. This handle is unusable afterwards. */
    fun delete() = client.delete(ref)

    override fun toString(): String = "Sandbox{$ref}"
}
