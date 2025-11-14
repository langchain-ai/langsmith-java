package com.langchain.smith.wrappers.openai;

import io.opentelemetry.context.Context;
import io.opentelemetry.context.ContextKey;
import io.opentelemetry.context.Scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Immutable context for experiment metadata that will be automatically
 * attached to OpenTelemetry spans.
 *
 * <p>
 * This class provides a convenient way to associate experiment metadata with
 * LLM calls without requiring manual span creation. When you set experiment
 * context using this class, the wrapped OpenAI client will automatically
 * attach it to the spans it creates.
 *
 * <p>
 * This class follows the OpenTelemetry Context pattern with immutable
 * context objects and explicit scope management.
 *
 * <p>
 * Example usage (recommended - try-with-resources):
 *
 * <pre>{@code
 * // Convenience method (recommended)
 * try (Scope scope = ExperimentContext.withExperiment("example-123", "session-789")) {
 *     ChatCompletion completion = client.chat().completions().create(params);
 * }
 * }</pre>
 *
 * <p>
 * This is particularly useful for running experiments where you want to link
 * LLM traces to specific dataset examples in LangSmith.
 *
 * <p>
 * Thread Safety: This class is thread-safe. Each thread maintains its own
 * context via OpenTelemetry's Context mechanism. Context instances are
 * immutable and safe to share across threads.
 */
public final class ExperimentContext {

    private static final ContextKey<ExperimentData> CONTEXT_KEY =
            ContextKey.named("langsmith-experiment-context");

    private final ExperimentData data;

    private ExperimentContext(ExperimentData data) {
        this.data = data;
    }

    /**
     * Gets the current ExperimentContext from the OpenTelemetry Context.
     * Returns an empty context if no context has been set.
     *
     * @return the current ExperimentContext
     */
    public static ExperimentContext current() {
        Context otelContext = Context.current();
        ExperimentData data = otelContext.get(CONTEXT_KEY);
        return new ExperimentContext(data != null ? data : ExperimentData.empty());
    }

    /**
     * Convenience method to set all experiment context values and return a Scope.
     * This is the recommended method for running experiments as it properly links runs to
     * the experiment session.
     *
     * <pre>{@code
     * try (Scope scope = ExperimentContext.withExperiment(example.id(), session.id())) {
     *     ChatCompletion completion = client.chat().completions().create(params);
     * }
     * }</pre>
     *
     * @param exampleId the reference example ID from your LangSmith dataset
     * @param sessionId the session/experiment UUID
     * @return a Scope that will restore the previous context when closed
     */
    public static Scope withExperiment(String exampleId, String sessionId) {
        return current()
                .withReferenceExampleId(exampleId)
                .withSessionId(sessionId)
                .makeCurrent();
    }

    /**
     * Returns a new ExperimentContext with the reference example ID set.
     *
     * @param exampleId the reference example ID from your LangSmith dataset
     * @return a new ExperimentContext with the updated value
     */
    public ExperimentContext withReferenceExampleId(String exampleId) {
        return new ExperimentContext(data.withReferenceExampleId(exampleId));
    }

    /**
     * Returns a new ExperimentContext with the session ID set.
     *
     * @param sessionId the session/experiment UUID from LangSmith
     * @return a new ExperimentContext with the updated value
     */
    public ExperimentContext withSessionId(String sessionId) {
        return new ExperimentContext(data.withSessionId(sessionId));
    }

    /**
     * Returns a new ExperimentContext with custom metadata added.
     * Metadata will be attached to spans as attributes prefixed with "langsmith.metadata.".
     *
     * @param key   the metadata key
     * @param value the metadata value
     * @return a new ExperimentContext with the updated metadata
     */
    public ExperimentContext withMetadata(String key, String value) {
        return new ExperimentContext(data.withMetadata(key, value));
    }

    /**
     * Makes this ExperimentContext the current context in the OpenTelemetry Context.
     * Returns a Scope that will restore the previous context when closed.
     */
    private Scope makeCurrent() {
        Context otelContext = Context.current().with(CONTEXT_KEY, this.data);
        return otelContext.makeCurrent();
    }

    /**
     * Gets the reference example ID.
     *
     * @return the reference example ID, or null if not set
     */
    public String getReferenceExampleId() {
        return data.referenceExampleId;
    }

    /**
     * Gets the session ID.
     *
     * @return the session ID, or null if not set
     */
    public String getSessionId() {
        return data.sessionId;
    }

    /**
     * Gets all custom metadata as an unmodifiable map.
     *
     * @return an unmodifiable map of metadata key-value pairs
     */
    public Map<String, String> getMetadata() {
        return data.metadata;
    }

    /**
     * Immutable data holder for experiment context values.
     */
    private static class ExperimentData {
        final String referenceExampleId;
        final String sessionId;
        final Map<String, String> metadata;

        private ExperimentData(
                String referenceExampleId,
                String sessionId,
                Map<String, String> metadata) {
            this.referenceExampleId = referenceExampleId;
            this.sessionId = sessionId;
            this.metadata = Collections.unmodifiableMap(new HashMap<>(metadata));
        }

        static ExperimentData empty() {
            return new ExperimentData(null, null, new HashMap<>());
        }

        ExperimentData withReferenceExampleId(String exampleId) {
            return new ExperimentData(exampleId, sessionId, metadata);
        }

        ExperimentData withSessionId(String sessionId) {
            return new ExperimentData(referenceExampleId, sessionId, metadata);
        }

        ExperimentData withMetadata(String key, String value) {
            Map<String, String> newMetadata = new HashMap<>(metadata);
            newMetadata.put(key, value);
            return new ExperimentData(referenceExampleId, sessionId, newMetadata);
        }
    }
}
