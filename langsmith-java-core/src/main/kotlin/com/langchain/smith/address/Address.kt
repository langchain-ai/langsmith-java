package com.langchain.smith.address

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.langchain.smith.errors.LangChainException
import com.langchain.smith.errors.LangChainInvalidDataException
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.tracing.AddressEnv
import java.util.Locale

/** (beta) Names the tracing project of a feature; only an [AgentAddress] can receive traces. */
@JsonDeserialize(using = AnyAddressDeserializer::class)
sealed interface Address {
    /** (beta) `AGENT`, `EXPERIMENT` or `EVALUATOR`. */
    // Explicit @JsonProperty: the SDK mapper disables getter auto-detection.
    @get:JsonProperty("kind") val kind: String

    /** (beta) Adapts the address to the generated params of `sessions().resolve`. */
    fun toApiAddress(): SessionResolveParams
}

/** (beta) The `LANGSMITH_AGENT_*` env vars cannot address a run. The message omits their values. */
class EnvAddressException internal constructor(message: String) : LangChainException(message)

/**
 * (beta) The address of an agent's environment: [id] is a DNS label and [environment] one of
 * `local`, `development`, `staging` or `production` (any case, stored upper-case).
 *
 * @throws LangChainInvalidDataException if a value is invalid. The message never echoes it.
 */
@JsonDeserialize(using = AgentAddressDeserializer::class)
class AgentAddress(@get:JsonProperty("id") val id: String, environment: String) : Address {
    override val kind: String
        get() = "AGENT"

    @get:JsonProperty("environment") val environment: String = environment.uppercase(Locale.ROOT)

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

        /** Parses an untrusted LRN. */
        internal fun fromLrn(value: String): AgentAddress {
            val match =
                LRN_PATTERN.matchEntire(value)
                    ?: throw LangChainInvalidDataException("Not an agent address.")
            return AgentAddress(match.groupValues[1], match.groupValues[2])
        }

        /**
         * (beta) Reads the agent named by `LANGSMITH_AGENT_ID` and `LANGSMITH_AGENT_ENVIRONMENT`;
         * null if neither is set.
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
 * (beta) The tracing project of an experiment: [id] is a hyphenated UUID, stored lower-case.
 *
 * @throws LangChainInvalidDataException if [id] is invalid. The message never echoes it.
 */
@JsonDeserialize(using = ExperimentAddressDeserializer::class)
class ExperimentAddress(id: String) : Address {
    override val kind: String
        get() = "EXPERIMENT"

    @get:JsonProperty("id") val id: String = id.lowercase(Locale.ROOT)

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
@JsonDeserialize(using = EvaluatorAddressDeserializer::class)
class EvaluatorAddress : Address {
    override val kind: String
        get() = "EVALUATOR"

    override fun toApiAddress(): SessionResolveParams =
        SessionResolveParams.builder().kind(SessionResolveParams.Kind.EVALUATOR).build()

    override fun equals(other: Any?): Boolean = other is EvaluatorAddress

    override fun hashCode(): Int = EvaluatorAddress::class.java.hashCode()

    override fun toString(): String = "EvaluatorAddress{}"
}

private fun addressFromJson(node: JsonNode): Address {
    fun text(name: String) = node.get(name)?.takeIf { it.isTextual }?.asText().orEmpty()
    if (!node.isObject) throw LangChainInvalidDataException("Not an address.")
    return when (node.get("kind")?.takeIf { it.isTextual }?.asText()) {
        "AGENT" -> AgentAddress(id = text("id"), environment = text("environment"))
        "EXPERIMENT" -> ExperimentAddress(text("id"))
        "EVALUATOR" -> EvaluatorAddress()
        else -> throw LangChainInvalidDataException("Not an address.")
    }
}

internal open class AddressDeserializer<T : Address>(
    private val type: Class<T>,
    private val label: String,
) : StdDeserializer<T>(type) {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): T {
        val address = addressFromJson(ctxt.readTree(p))
        if (!type.isInstance(address)) throw LangChainInvalidDataException("Not an $label address.")
        return type.cast(address)
    }
}

internal class AnyAddressDeserializer :
    AddressDeserializer<Address>(type = Address::class.java, label = "")

internal class AgentAddressDeserializer :
    AddressDeserializer<AgentAddress>(type = AgentAddress::class.java, label = "agent")

internal class ExperimentAddressDeserializer :
    AddressDeserializer<ExperimentAddress>(
        type = ExperimentAddress::class.java,
        label = "experiment",
    )

internal class EvaluatorAddressDeserializer :
    AddressDeserializer<EvaluatorAddress>(type = EvaluatorAddress::class.java, label = "evaluator")
