package com.langchain.smith.sandbox

/** Base class for every failure raised by the sandbox client. */
open class SandboxException @JvmOverloads constructor(message: String, cause: Throwable? = null) :
    RuntimeException(message, cause)

/** The sandbox, or the command being resumed, does not exist. */
class SandboxNotFoundException(message: String) : SandboxException(message)

/**
 * The sandbox refused to stream this command.
 *
 * Not every sandbox supports streamed execution, and a command already running in a mode
 * incompatible with it — an interactive terminal, or one set to be killed when its client
 * disconnects — cannot be attached to this way. The message says which applies.
 */
class SandboxCommandNotStreamableException(message: String) : SandboxException(message)

/**
 * The sandbox ended the stream with an `error` event.
 *
 * [errorType] is the server's machine-readable classification, e.g. `InvalidOffset` or
 * `ReadOffsetUnavailable`.
 */
class SandboxStreamErrorException(val errorType: String, message: String) :
    SandboxException("$errorType: $message")

/**
 * A collected command produced more output than the client will hold in memory.
 *
 * Raised only by the methods that collect output into the result. Stream the command instead to
 * consume unbounded output, or raise the limit if the whole of it genuinely has to be held.
 */
class SandboxOutputTooLargeException(val limitBytes: Long, message: String) :
    SandboxException(message)

/** The stream could not be re-established within the reconnect budget. */
class SandboxStreamInterruptedException
@JvmOverloads
constructor(message: String, cause: Throwable? = null) : SandboxException(message, cause)

/** The response was not a well-formed exec event stream. */
class SandboxProtocolException(message: String) : SandboxException(message)

/** An HTTP status the sandbox client does not translate into a more specific failure. */
class SandboxApiException(val statusCode: Int, val body: String) :
    SandboxException("sandbox request failed with HTTP $statusCode: $body")
