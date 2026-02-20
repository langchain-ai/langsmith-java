package com.langchain.smith.wrappers.openai

import io.opentelemetry.context.Context
import io.opentelemetry.context.ContextKey
import io.opentelemetry.context.Scope
import java.util.Optional

/**
 * Immutable context for experiment metadata that will be automatically
 * attached to OpenTelemetry spans.
 *
 * When you set experiment context using this class, the wrapped OpenAI client will automatically
 * attach it to the spans it creates. Follows the OpenTelemetry Context pattern with immutable
 * context objects and explicit scope management.
 *
 * Example (recommended - use scope):
 * ```
 * ExperimentContext.withExperiment("example-123", "session-789").use { scope ->
 *     val completion = client.chat().completions().create(params)
 * }
 * ```
 *
 * Thread Safety: This class is thread-safe. Each thread maintains its own context via
 * OpenTelemetry's Context mechanism.
 */
class ExperimentContext private constructor(private val data: ExperimentData) {

    fun withReferenceExampleId(exampleId: String): ExperimentContext {
        require(exampleId.isNotBlank()) { "exampleId cannot be null or empty" }
        return ExperimentContext(data.withReferenceExampleId(exampleId))
    }

    fun withSessionId(sessionId: String): ExperimentContext {
        require(sessionId.isNotBlank()) { "sessionId cannot be null or empty" }
        return ExperimentContext(data.withSessionId(sessionId))
    }

    fun withMetadata(key: String, value: String): ExperimentContext {
        require(key.isNotBlank()) { "metadata key cannot be null or empty" }
        require(value.isNotBlank()) { "metadata value cannot be null or empty" }
        return ExperimentContext(data.withMetadata(key, value))
    }

    private fun makeCurrent(): Scope {
        val otelContext = Context.current().with(CONTEXT_KEY, data)
        return otelContext.makeCurrent()
    }

    fun getReferenceExampleId(): Optional<String> = Optional.ofNullable(data.referenceExampleId)
    fun getSessionId(): Optional<String> = Optional.ofNullable(data.sessionId)
    fun getMetadata(): Map<String, String> = data.metadata

    companion object {
        private val CONTEXT_KEY = ContextKey.named<ExperimentData>("langsmith-experiment-context")

        @JvmStatic
        fun current(): ExperimentContext {
            val otelContext = Context.current()
            val data = otelContext.get(CONTEXT_KEY) ?: ExperimentData.empty()
            return ExperimentContext(data)
        }

        @JvmStatic
        fun withExperiment(exampleId: String, sessionId: String): Scope {
            require(exampleId.isNotBlank()) { "exampleId cannot be null or empty" }
            require(sessionId.isNotBlank()) { "sessionId cannot be null or empty" }
            return current()
                .withReferenceExampleId(exampleId)
                .withSessionId(sessionId)
                .makeCurrent()
        }
    }

    private data class ExperimentData(
        val referenceExampleId: String?,
        val sessionId: String?,
        val metadata: Map<String, String>,
    ) {
        fun withReferenceExampleId(exampleId: String) = copy(referenceExampleId = exampleId)
        fun withSessionId(sessionId: String) = copy(sessionId = sessionId)
        fun withMetadata(key: String, value: String) = copy(
            metadata = metadata + (key to value)
        )

        companion object {
            fun empty() = ExperimentData(null, null, emptyMap())
        }
    }
}
