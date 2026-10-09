package com.langchain.smith.tracing

import com.langchain.smith.address.AgentAddress
import com.langchain.smith.address.EnvAddressException
import com.langchain.smith.errors.LangChainInvalidDataException
import java.util.Optional
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicBoolean
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger("com.langchain.smith.tracing.Addressing")

/**
 * Env access for addressing. Process env vars are cached; the thread-local override is for tests.
 */
internal object AddressEnv {
    val override = ThreadLocal<Map<String, String>?>()

    private val processEnv = ConcurrentHashMap<String, Optional<String>>()

    fun get(name: String): String? =
        override.get().let {
            if (it != null) it[name]
            else
                processEnv
                    .computeIfAbsent(name) { n -> Optional.ofNullable(System.getenv(n)) }
                    .orElse(null)
        }

    fun project(): String? =
        if (override.get() != null) get("LANGSMITH_PROJECT")?.takeIf { it.isNotBlank() }
        else DEFAULT_PROJECT_NAME
}

internal class Destination(val projectName: String?, val address: AgentAddress?)

internal fun rejectConflicting(project: String?, sessionId: String?, address: AgentAddress?) {
    if (address != null && (!project.isNullOrEmpty() || sessionId != null)) {
        throw LangChainInvalidDataException(
            "A run is addressed by project or by address, not both."
        )
    }
}

/**
 * Settles a root run's destination: the config first, then the env vars. A session id names a
 * project, so it skips the env address.
 *
 * @throws EnvAddressException if the env decides and names both, or half an address.
 */
internal fun resolveRootDestination(
    projectName: String?,
    sessionId: String?,
    address: AgentAddress?,
): Destination {
    rejectConflicting(projectName, sessionId, address)
    if (!projectName.isNullOrEmpty()) return Destination(projectName, null)
    if (address != null) return Destination(null, address)
    val envProject = AddressEnv.project()
    if (sessionId != null) return Destination(envProject, null)
    val envAddress = AgentAddress.fromEnv()
    if (envProject != null && envAddress != null) {
        throw EnvAddressException(
            "The LANGSMITH_PROJECT and LANGSMITH_AGENT_* env vars are both set, so neither " +
                "outranks the other."
        )
    }
    return if (envAddress != null) Destination(null, envAddress) else Destination(envProject, null)
}

private val loggedUntraced = ConcurrentHashMap.newKeySet<String>()

/** Logs each distinct bad-env cause once. */
internal fun logUntraced(error: EnvAddressException) {
    if (loggedUntraced.add(error.message.orEmpty())) {
        logger.warn("LangSmith is not tracing this call: {}", error.message)
    }
}

private val warnedBeta = AtomicBoolean(false)

internal fun warnIsBeta() {
    if (warnedBeta.compareAndSet(false, true)) {
        logger.warn(
            "Addressing runs to an agent is in beta and enabled per workspace. A workspace " +
                "without it rejects the run, so the trace is lost instead of falling back to a " +
                "project."
        )
    }
}
