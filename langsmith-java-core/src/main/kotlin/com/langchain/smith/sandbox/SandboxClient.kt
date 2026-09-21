package com.langchain.smith.sandbox

import com.langchain.smith.client.LangsmithClientImpl
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.Timeout
import com.langchain.smith.models.sandboxes.SandboxResponse
import com.langchain.smith.models.sandboxes.boxes.BoxCreateParams
import java.time.Duration

/**
 * Runs commands inside a LangSmith sandbox.
 *
 * Create one with [create], or take a handle to an existing sandbox with [attach]; both return a
 * [Sandbox] that runs commands and reads and writes files without an identifier threaded through
 * every call.
 *
 * A stopped sandbox is started on demand, so nothing here needs starting first. Snapshots, service
 * URLs, and the rest of the lifecycle remain on the generated `client.sandboxes().boxes()` service.
 *
 * Every method blocks until the command exits. Call them from a thread pool or wrap them in
 * `CompletableFuture.supplyAsync` to run commands concurrently; instances are safe to share.
 *
 * This client does not own [ClientOptions] and never closes it. Close the options, or the
 * `LangsmithClient` they came from, when done.
 */
class SandboxClient
private constructor(
    clientOptions: ClientOptions,
    private val config: SandboxExecConfig,
    private val requestOptions: RequestOptions,
) {

    private val http = SandboxHttp(clientOptions)
    private val files = SandboxFileOps(http)

    // Built here so callers never have to construct a second client for the lifecycle calls the
    // generated services own. It shares the caller's options and is deliberately never closed.
    private val boxes = LangsmithClientImpl(clientOptions).sandboxes().boxes()

    /**
     * Creates a sandbox and returns a handle to it.
     *
     * This is the usual way to get one: the server picks the name and the defaults suit most
     * workloads. Reach for the [BoxCreateParams] overload only to pin a name, a snapshot, a size,
     * or similar.
     */
    fun create(): Sandbox = create(BoxCreateParams.none())

    /** Creates a sandbox with explicit settings. Prefer [create] unless you need one of them. */
    fun create(params: BoxCreateParams): Sandbox {
        val created = boxes.create(params)
        // Prefer the ID: a sandbox can be renamed, and the route accepts either.
        val ref =
            created.id().orElseGet {
                created.name().orElseThrow {
                    SandboxException("sandbox was created without an id or a name")
                }
            }
        return Sandbox(this, ref)
    }

    /**
     * Returns a handle to an existing sandbox, by name or ID. Performs no request, so it does not
     * verify that the sandbox exists.
     */
    fun attach(nameOrId: String): Sandbox {
        requireSandboxId(nameOrId)
        return Sandbox(this, nameOrId)
    }

    /** Runs [command] in the sandbox's shell and collects its output. */
    fun run(sandboxId: String, command: String): CollectedExecResult =
        run(sandboxId, ExecRequest.ofShell(command))

    /**
     * Runs a command to completion and collects its output into the result.
     *
     * Output is held in memory and capped, so a command that produces more than the configured
     * limit fails with [SandboxOutputTooLargeException] rather than exhausting the heap. Use
     * [stream] for output that is large or of unknown size — it buffers nothing.
     */
    fun run(sandboxId: String, request: ExecRequest): CollectedExecResult {
        val collector = CollectingHandler(config.maxOutputBytes)
        val result = stream(sandboxId, request, collector)
        return CollectedExecResult(
            result.commandId,
            result.exitCode,
            collector.stdout(),
            collector.stderr(),
        )
    }

    /**
     * Runs a command to completion, passing output to [handler] as it arrives.
     *
     * Nothing is buffered, so this is the way to consume output of unknown size. Pass a
     * [CollectingHandler] to keep some of it within a bound.
     */
    fun stream(sandboxId: String, request: ExecRequest, handler: ExecOutputHandler): ExecResult {
        requireSandboxId(sandboxId)
        return SandboxExecStream(http, config, sandboxId, request, handler, requestOptions).run()
    }

    /** Reads a file's contents. */
    fun readFile(sandboxId: String, path: String): ByteArray {
        requireSandboxId(sandboxId)
        require(path.isNotEmpty()) { "path must not be empty" }
        return files.readFile(sandboxId, path)
    }

    /** Reads a file and decodes it as UTF-8. */
    fun readFileAsString(sandboxId: String, path: String): String =
        String(readFile(sandboxId, path), Charsets.UTF_8)

    /** Writes [content] to [path], replacing any existing file. */
    fun writeFile(sandboxId: String, path: String, content: ByteArray): UploadResult {
        requireSandboxId(sandboxId)
        require(path.isNotEmpty()) { "path must not be empty" }
        return files.writeFile(sandboxId, path, content)
    }

    /** Writes [content] to [path] as UTF-8, replacing any existing file. */
    fun writeFile(sandboxId: String, path: String, content: String): UploadResult =
        writeFile(sandboxId, path, content.toByteArray(Charsets.UTF_8))

    /** Finds files under an absolute root path matching a glob pattern. */
    fun glob(sandboxId: String, request: GlobRequest): GlobResult {
        requireSandboxId(sandboxId)
        return files.glob(sandboxId, request)
    }

    /** Finds files under [path] matching [pattern], with no result cap. */
    fun glob(sandboxId: String, path: String, pattern: String): GlobResult =
        glob(sandboxId, GlobRequest.of(path, pattern))

    /**
     * Lists a directory's immediate entries, files and subdirectories alike.
     *
     * There is no separate listing endpoint: this is the non-recursive case of [glob].
     */
    fun listDirectory(sandboxId: String, path: String): GlobResult = glob(sandboxId, path, "*")

    /** Searches file contents under an absolute root path for literal text. */
    fun grep(sandboxId: String, request: GrepRequest): GrepResult {
        requireSandboxId(sandboxId)
        return files.grep(sandboxId, request)
    }

    /**
     * Searches files under [path] for the literal text [pattern], with no result cap.
     *
     * [pattern] is not a regular expression.
     */
    fun grep(sandboxId: String, path: String, pattern: String): GrepResult =
        grep(sandboxId, GrepRequest.of(path, pattern))

    /** Current metadata for a sandbox, by name or ID. */
    fun retrieve(sandboxId: String): SandboxResponse {
        requireSandboxId(sandboxId)
        return boxes.retrieve(sandboxId)
    }

    /**
     * Stops a sandbox, releasing its compute. Its filesystem survives, and the next command starts
     * it again.
     */
    fun stop(sandboxId: String) {
        requireSandboxId(sandboxId)
        boxes.stop(sandboxId)
    }

    /** Deletes a sandbox and its filesystem. */
    fun delete(sandboxId: String) {
        requireSandboxId(sandboxId)
        boxes.delete(sandboxId)
    }

    private fun requireSandboxId(sandboxId: String) {
        require(sandboxId.isNotEmpty()) { "sandboxId must not be empty" }
    }

    companion object {

        /**
         * The stream must outlive the default 90-second call timeout, since it lasts as long as the
         * command does. The read timeout still bounds a connection that goes quiet: the sandbox
         * heartbeats every 15 seconds, so four missed beats are treated as a dead connection and
         * resumed.
         */
        private val DEFAULT_STREAM_TIMEOUT: Timeout =
            Timeout.builder()
                .connect(Duration.ofSeconds(30))
                .read(Duration.ofSeconds(60))
                .write(Duration.ofSeconds(30))
                .request(Duration.ZERO)
                .build()

        @JvmStatic
        fun of(clientOptions: ClientOptions): SandboxClient =
            builder().clientOptions(clientOptions).build()

        @JvmStatic fun builder(): Builder = Builder()
    }

    class Builder internal constructor() {

        private var clientOptions: ClientOptions? = null
        private var maxReconnects: Int = SandboxExecConfig.DEFAULT_MAX_RECONNECTS
        private var maxOutputBytes: Long = SandboxExecConfig.DEFAULT_MAX_OUTPUT_BYTES
        private var streamTimeout: Timeout = DEFAULT_STREAM_TIMEOUT

        /**
         * The options to send requests with, including the base URL and credentials.
         *
         * Build these the same way the SDK client does, e.g.
         * `ClientOptions.builder().httpClient(OkHttpClient.builder().build()).fromEnv().build()`.
         */
        fun clientOptions(clientOptions: ClientOptions) = apply {
            this.clientOptions = clientOptions
        }

        /**
         * How many times a dropped stream is resumed before giving up. Defaults to 5.
         *
         * Only consecutive failures count: a reconnect that delivers output resets the budget, so a
         * long command on a flaky network keeps going. Resuming to ack a full output buffer is
         * ordinary flow and never counts against this.
         */
        fun maxReconnects(maxReconnects: Int) = apply {
            require(maxReconnects >= 0) { "maxReconnects must be non-negative" }
            this.maxReconnects = maxReconnects
        }

        /**
         * How much output [run] will hold in memory before failing. Defaults to 64 MiB.
         *
         * Only the default for [run]'s collector; a [CollectingHandler] passed to [stream] carries
         * its own limit. Capped at [CollectingHandler.MAX_LIMIT_BYTES], beyond which output cannot
         * be collected in memory at all — stream it instead.
         *
         * This bounds the collecting methods only, and exists because the streaming request has no
         * overall timeout: without it, a command that never stops producing output would grow the
         * heap until the JVM died. There is deliberately no way to disable it — use [stream] for
         * unbounded output, which buffers nothing.
         */
        fun maxOutputBytes(maxOutputBytes: Long) = apply {
            require(maxOutputBytes > 0) { "maxOutputBytes must be positive" }
            // Rejected here as well as in the collector so a misconfiguration fails when the
            // client is built rather than partway through the first large command.
            require(maxOutputBytes <= CollectingHandler.MAX_LIMIT_BYTES) {
                "maxOutputBytes must be at most ${CollectingHandler.MAX_LIMIT_BYTES};" +
                    " stream without collecting to consume more than that"
            }
            this.maxOutputBytes = maxOutputBytes
        }

        /**
         * Timeouts for the streaming requests.
         *
         * A non-zero `request` timeout caps the whole call, and so kills any command that outlives
         * it mid-stream. Leave it at zero unless commands are meant to be bounded that way.
         */
        fun streamTimeout(streamTimeout: Timeout) = apply { this.streamTimeout = streamTimeout }

        fun build(): SandboxClient =
            SandboxClient(
                checkNotNull(clientOptions) { "clientOptions is required" },
                SandboxExecConfig(
                    maxReconnects,
                    maxOutputBytes,
                    SandboxExecConfig.DEFAULT_BACKOFF_BASE,
                    SandboxExecConfig.DEFAULT_BACKOFF_MAX,
                ),
                RequestOptions.builder().timeout(streamTimeout).build(),
            )
    }
}
