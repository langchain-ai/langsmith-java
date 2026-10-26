package com.langchain.smith.otel

import com.langchain.smith.address.AgentAddress
import com.langchain.smith.errors.LangChainInvalidDataException
import java.time.Duration
import java.util.Locale

/**
 * Configuration for OpenTelemetry trace export.
 *
 * This class provides configuration options for exporting LangSmith runs as OpenTelemetry traces.
 * Configuration can be loaded from environment variables or system properties, or set manually via
 * the builder.
 *
 * Environment variables:
 * - OTEL_EXPORTER_OTLP_ENDPOINT: The OTEL endpoint URL (default: http://localhost:4318/v1/traces)
 * - OTEL_EXPORTER_OTLP_ENABLED: Whether export is enabled (default: false)
 * - OTEL_EXPORTER_OTLP_TIMEOUT: Timeout in seconds (default: 10)
 *
 * System properties:
 * - langchain.otel.endpoint
 * - langchain.otel.enabled
 * - langchain.otel.timeout
 */
class OtelConfig
private constructor(
    val endpoint: String,
    val enabled: Boolean,
    val timeout: Duration,
    val headers: Map<String, String>,
    val serviceName: String?,
) {
    class Builder {
        private var endpoint: String = "http://localhost:4318/v1/traces"
        private var enabled: Boolean = false
        private var timeout: Duration = Duration.ofSeconds(10)
        private val headers: MutableMap<String, String> = mutableMapOf()
        private var address: AgentAddress? = null
        private var serviceName: String? = null

        fun endpoint(endpoint: String) = apply { this.endpoint = endpoint }

        fun enabled(enabled: Boolean) = apply { this.enabled = enabled }

        fun timeout(timeout: Duration) = apply { this.timeout = timeout }

        fun headers(headers: Map<String, String>) = apply {
            this.headers.clear()
            this.headers.putAll(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers[name] = value }

        /**
         * Sends traces to an agent environment instead of a project, by setting the
         * `Langsmith-Agent-Id` and `Langsmith-Agent-Environment` headers. It cannot be combined
         * with a `Langsmith-Project` header: [build] throws.
         */
        fun address(address: AgentAddress) = apply { this.address = address }

        fun serviceName(serviceName: String?) = apply { this.serviceName = serviceName }

        /**
         * @throws LangChainInvalidDataException if the headers name a project and an agent, or only
         *   one of the two agent headers.
         */
        fun build(): OtelConfig {
            val finalHeaders = headers.toMutableMap()
            address?.let {
                // The receiver reads one value per header, so no other spelling may remain.
                replaceHeader(finalHeaders, AGENT_ID_HEADER, it.id)
                replaceHeader(
                    finalHeaders,
                    AGENT_ENVIRONMENT_HEADER,
                    it.environment.lowercase(Locale.ROOT),
                )
            }
            validateDestination(finalHeaders)
            return OtelConfig(
                endpoint = endpoint,
                enabled = enabled,
                timeout = timeout,
                headers = finalHeaders.toMap(),
                serviceName = serviceName,
            )
        }
    }

    companion object {
        internal const val PROJECT_HEADER = "Langsmith-Project"
        internal const val AGENT_ID_HEADER = "Langsmith-Agent-Id"
        internal const val AGENT_ENVIRONMENT_HEADER = "Langsmith-Agent-Environment"

        private fun replaceHeader(
            headers: MutableMap<String, String>,
            name: String,
            value: String,
        ) {
            headers.keys.removeAll { it.equals(name, ignoreCase = true) }
            headers[name] = value
        }

        /**
         * A trace goes to a project or to an agent environment, never both, and never half of one.
         * Each destination header is set once, whatever its spelling.
         */
        private fun validateDestination(headers: Map<String, String>) {
            listOf(PROJECT_HEADER, AGENT_ID_HEADER, AGENT_ENVIRONMENT_HEADER).forEach { name ->
                if (headers.keys.count { it.equals(name, ignoreCase = true) } > 1) {
                    throw LangChainInvalidDataException(
                        "$name is set more than once, in different spellings."
                    )
                }
            }
            // The receiver ignores a header with an empty value, so an empty one is not a
            // destination.
            fun has(name: String) =
                headers.any { (key, value) ->
                    key.equals(name, ignoreCase = true) && value.isNotEmpty()
                }
            val hasAgentId = has(AGENT_ID_HEADER)
            if (hasAgentId != has(AGENT_ENVIRONMENT_HEADER)) {
                throw LangChainInvalidDataException(
                    "$AGENT_ID_HEADER and $AGENT_ENVIRONMENT_HEADER must be set together."
                )
            }
            if (hasAgentId && has(PROJECT_HEADER)) {
                throw LangChainInvalidDataException(
                    "$PROJECT_HEADER cannot be combined with the agent headers."
                )
            }
        }

        @JvmStatic fun builder(): Builder = Builder()

        @JvmStatic
        fun fromEnv(): OtelConfig {
            val endpoint =
                System.getProperty("langchain.otel.endpoint")
                    ?: System.getenv("OTEL_EXPORTER_OTLP_ENDPOINT")
                    ?: "http://localhost:4318/v1/traces"

            val enabledStr =
                System.getProperty("langchain.otel.enabled")
                    ?: System.getenv("OTEL_EXPORTER_OTLP_ENABLED")
                    ?: "false"
            val enabled = "true".equals(enabledStr, ignoreCase = true)

            val timeoutStr =
                System.getProperty("langchain.otel.timeout")
                    ?: System.getenv("OTEL_EXPORTER_OTLP_TIMEOUT")
                    ?: "10"
            val timeoutSeconds = timeoutStr.toLongOrNull() ?: 10L
            val timeout = Duration.ofSeconds(timeoutSeconds)

            val serviceName =
                System.getProperty("langchain.otel.service.name")
                    ?: System.getenv("OTEL_SERVICE_NAME")

            val configBuilder = builder().endpoint(endpoint).enabled(enabled).timeout(timeout)
            return (if (serviceName != null) configBuilder.serviceName(serviceName)
                else configBuilder)
                .build()
        }
    }
}
