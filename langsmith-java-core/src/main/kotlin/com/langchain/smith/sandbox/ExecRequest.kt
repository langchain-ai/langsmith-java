package com.langchain.smith.sandbox

import java.util.Optional

/**
 * A command to start with [SandboxClient.stream] or [SandboxClient.run].
 *
 * [stdin] is written once when the process spawns and then closed, so the process reads EOF. There
 * is no stdin streaming on this endpoint.
 */
class ExecRequest
private constructor(
    val command: ExecCommand,
    private val commandId: String?,
    private val shell: String?,
    private val cwd: String?,
    val env: Map<String, String>,
    private val stdin: ByteArray?,
    val timeoutSeconds: Int,
    val idleTimeoutSeconds: Int,
    val ttlSeconds: Int,
) {

    /**
     * A caller-chosen ID making the start request idempotent: retrying with the same ID attaches to
     * the running command instead of starting a second one.
     */
    fun commandId(): Optional<String> = Optional.ofNullable(commandId)

    fun shell(): Optional<String> = Optional.ofNullable(shell)

    fun cwd(): Optional<String> = Optional.ofNullable(cwd)

    fun stdin(): Optional<ByteArray> = Optional.ofNullable(stdin?.copyOf())

    /** Returns a copy carrying [id], so a generated ID can be pinned before the first attempt. */
    fun withCommandId(id: String): ExecRequest =
        ExecRequest(
            command,
            id,
            shell,
            cwd,
            env,
            stdin,
            timeoutSeconds,
            idleTimeoutSeconds,
            ttlSeconds,
        )

    internal fun toBody(): Map<String, Any> = buildMap {
        put("command", command.jsonValue())
        commandId?.let { put("command_id", it) }
        shell?.let { put("shell", it) }
        cwd?.let { put("cwd", it) }
        if (env.isNotEmpty()) put("env", env)
        stdin?.takeIf { it.isNotEmpty() }?.let { put("stdin", it) }
        if (timeoutSeconds != 0) put("timeout_seconds", timeoutSeconds)
        if (idleTimeoutSeconds != 0) put("idle_timeout_seconds", idleTimeoutSeconds)
        if (ttlSeconds != 0) put("ttl_seconds", ttlSeconds)
    }

    companion object {

        @JvmStatic fun builder(): Builder = Builder()

        /** Shorthand for a shell command with every other option left at its default. */
        @JvmStatic
        fun ofShell(command: String): ExecRequest =
            builder().command(ExecCommand.shell(command)).build()
    }

    class Builder internal constructor() {

        private var command: ExecCommand? = null
        private var commandId: String? = null
        private var shell: String? = null
        private var cwd: String? = null
        private var env: MutableMap<String, String> = linkedMapOf()
        private var stdin: ByteArray? = null
        private var timeoutSeconds: Int = 0
        private var idleTimeoutSeconds: Int = 0
        private var ttlSeconds: Int = 0

        fun command(command: ExecCommand) = apply { this.command = command }

        /** Shorthand for `command(ExecCommand.shell(command))`. */
        fun command(command: String) = command(ExecCommand.shell(command))

        fun commandId(commandId: String) = apply { this.commandId = commandId }

        /** Overrides the sandbox's default shell. Only meaningful for a shell command. */
        fun shell(shell: String) = apply { this.shell = shell }

        /** Overrides the sandbox's default working directory. */
        fun cwd(cwd: String) = apply { this.cwd = cwd }

        fun env(env: Map<String, String>) = apply {
            this.env.clear()
            this.env.putAll(env)
        }

        fun putEnv(name: String, value: String) = apply { env[name] = value }

        fun stdin(stdin: ByteArray) = apply { this.stdin = stdin.copyOf() }

        fun stdin(stdin: String) = stdin(stdin.toByteArray(Charsets.UTF_8))

        /** Wall-clock limit for the command. Zero, the default, means no timeout. */
        fun timeoutSeconds(timeoutSeconds: Int) = apply {
            require(timeoutSeconds >= 0) { "timeoutSeconds must be non-negative" }
            this.timeoutSeconds = timeoutSeconds
        }

        /** Zero uses the sandbox default; -1 never idle-kills the command. */
        fun idleTimeoutSeconds(idleTimeoutSeconds: Int) = apply {
            require(idleTimeoutSeconds >= -1) { "idleTimeoutSeconds must be >= -1" }
            this.idleTimeoutSeconds = idleTimeoutSeconds
        }

        /** Zero uses the sandbox default; -1 keeps the command forever. */
        fun ttlSeconds(ttlSeconds: Int) = apply {
            require(ttlSeconds >= -1) { "ttlSeconds must be >= -1" }
            this.ttlSeconds = ttlSeconds
        }

        fun build(): ExecRequest =
            ExecRequest(
                checkNotNull(command) { "command is required" },
                commandId,
                shell,
                cwd,
                env.toMap(),
                stdin,
                timeoutSeconds,
                idleTimeoutSeconds,
                ttlSeconds,
            )
    }
}
