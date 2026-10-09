package com.langchain.smith.address

import com.langchain.smith.errors.LangChainException
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.tracing.AddressEnv
import java.util.Locale

/**
 * (beta) Names the tracing project of a feature. Only an [AgentAddress] can receive traces; the
 * others are for queries.
 */
interface Address {
    /** (beta) Returns the address as `sessions().resolve` takes it. */
    fun toApiAddress(): SessionResolveParams
}

/** (beta) The `LANGSMITH_AGENT_*` env vars cannot address a run. The message omits their values. */
class EnvAddressException internal constructor(message: String) : LangChainException(message)

/**
 * (beta) The address of an agent's environment: a DNS-label [id] and one of `local`, `development`,
 * `staging` or `production` (any case, stored upper-case).
 *
 * @throws LangChainInvalidDataException if a value is invalid. The message never echoes it.
 */
class AgentAddress(val id: String, environment: String) : Address {
    val environment: String = environment.uppercase(Locale.ROOT)

    init {
        if (!AGENT_ID_PATTERN.matches(id)) {
            throw LangChainInvalidDataException(
                "Address agent id must be 1 to 63 lowercase ASCII letters, digits, or hyphens, " +
                    "start with a letter, and end with a letter or digit."
            )
        }
        if (this.environment !in ENVIRONMENTS) {
            throw LangChainInvalidDataException(
                "Address environment must be one of local, development, staging or production."
            )
        }
    }

    internal fun toLrn(): String =
        "lrn:agents/$id/environments/${environment.lowercase(Locale.ROOT)}"

    override fun toApiAddress(): SessionResolveParams =
        SessionResolveParams.builder()
            .kind(SessionResolveParams.Kind.AGENT)
            .id(id)
            .environment(SessionResolveParams.Environment.of(environment))
            .build()

    override fun equals(other: Any?): Boolean =
        this === other ||
            (other is AgentAddress && id == other.id && environment == other.environment)

    override fun hashCode(): Int = 31 * id.hashCode() + environment.hashCode()

    override fun toString(): String = "AgentAddress{id=$id, environment=$environment}"

    companion object {
        private val AGENT_ID_PATTERN = Regex("[a-z](?:[a-z0-9-]{0,61}[a-z0-9])?")
        private val ENVIRONMENTS = setOf("LOCAL", "DEVELOPMENT", "STAGING", "PRODUCTION")
        private val LRN_PATTERN = Regex("lrn:agents/([^/]+)/environments/([^/]+)")

        private const val ENV_ID = "LANGSMITH_AGENT_ID"
        private const val ENV_ENVIRONMENT = "LANGSMITH_AGENT_ENVIRONMENT"

        /** Parses an untrusted wire LRN; the value is never echoed in the error. */
        internal fun fromLrn(value: String): AgentAddress {
            val match =
                LRN_PATTERN.matchEntire(value)
                    ?: throw LangChainInvalidDataException("Not an agent address.")
            return AgentAddress(match.groupValues[1], match.groupValues[2])
        }

        /**
         * (beta) Reads `LANGSMITH_AGENT_ID` and `LANGSMITH_AGENT_ENVIRONMENT`: `null` if neither is
         * set.
         *
         * @throws EnvAddressException if only one is set, or a value is invalid.
         */
        @JvmStatic
        fun fromEnv(): AgentAddress? {
            val id = AddressEnv.get(ENV_ID)?.takeIf { it.isNotEmpty() }
            val environment = AddressEnv.get(ENV_ENVIRONMENT)?.takeIf { it.isNotEmpty() }
            if (id == null && environment == null) return null
            if (id == null || environment == null) {
                val missing = if (id == null) ENV_ID else ENV_ENVIRONMENT
                throw EnvAddressException("An address needs $missing as well as the other.")
            }
            return try {
                AgentAddress(id, environment)
            } catch (e: LangChainInvalidDataException) {
                throw EnvAddressException(
                    "The $ENV_ID and $ENV_ENVIRONMENT env vars can't address a run: ${e.message}"
                )
            }
        }
    }
}

/**
 * (beta) The tracing project of an experiment, by its hyphenated UUID (stored lower-case).
 *
 * @throws LangChainInvalidDataException if [id] is not one. The message never echoes it.
 */
class ExperimentAddress(id: String) : Address {
    val id: String = id.lowercase(Locale.ROOT)

    init {
        if (!UUID_PATTERN.matches(this.id)) {
            throw LangChainInvalidDataException(
                "An experiment id must be a UUID with hyphens, such as " +
                    "'0190c3d4-0000-7000-8000-0000000000b1'."
            )
        }
    }

    override fun toApiAddress(): SessionResolveParams =
        SessionResolveParams.builder().kind(SessionResolveParams.Kind.EXPERIMENT).id(id).build()

    override fun equals(other: Any?): Boolean =
        this === other || (other is ExperimentAddress && id == other.id)

    override fun hashCode(): Int = id.hashCode()

    override fun toString(): String = "ExperimentAddress{id=$id}"

    private companion object {
        val UUID_PATTERN = Regex("[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}")
    }
}

/** (beta) The tracing project of the workspace's evaluators. */
class EvaluatorAddress : Address {
    override fun toApiAddress(): SessionResolveParams =
        SessionResolveParams.builder().kind(SessionResolveParams.Kind.EVALUATOR).build()

    override fun equals(other: Any?): Boolean = other is EvaluatorAddress

    override fun hashCode(): Int = EvaluatorAddress::class.java.hashCode()

    override fun toString(): String = "EvaluatorAddress{}"
}
