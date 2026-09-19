package com.langchain.smith.sandbox

/**
 * A command to run in a sandbox, as either a shell string or an argv list.
 *
 * A shell command is interpreted by the sandbox's shell, so it may use pipes, globs, and
 * redirection. An argv list is executed directly, which avoids quoting entirely — prefer it for
 * anything built from untrusted input.
 */
class ExecCommand private constructor(val args: List<String>, val isShell: Boolean) {

    /** The wire representation: a bare string for shell mode, an array for argv mode. */
    fun jsonValue(): Any = if (isShell) args[0] else args

    override fun equals(other: Any?): Boolean =
        this === other || (other is ExecCommand && args == other.args && isShell == other.isShell)

    override fun hashCode(): Int = 31 * args.hashCode() + isShell.hashCode()

    override fun toString(): String = if (isShell) args[0] else args.joinToString(" ")

    companion object {

        /** Runs [command] through the sandbox's shell. */
        @JvmStatic
        fun shell(command: String): ExecCommand {
            require(command.isNotEmpty()) { "command must not be empty" }
            return ExecCommand(listOf(command), isShell = true)
        }

        /** Executes [args] directly, without a shell. */
        @JvmStatic fun argv(vararg args: String): ExecCommand = argv(args.toList())

        /** Executes [args] directly, without a shell. */
        @JvmStatic
        fun argv(args: List<String>): ExecCommand {
            require(args.isNotEmpty()) { "args must not be empty" }
            require(args[0].isNotEmpty()) { "the executable must not be empty" }
            return ExecCommand(args.toList(), isShell = false)
        }
    }
}
