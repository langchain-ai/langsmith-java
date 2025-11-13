package com.langchain.smith.wrappers.openai;

import java.util.HashMap;
import java.util.Map;

/**
 * Thread-local context for experiment metadata that will be automatically
 * attached to OpenTelemetry spans.
 *
 * <p>
 * This class provides a convenient way to associate experiment metadata with
 * LLM calls without requiring manual span creation. When you set a reference
 * example ID or other metadata using this context, the wrapped OpenAI client
 * will automatically attach it to the spans it creates.
 *
 * <p>
 * Example usage (recommended - try-with-resources):
 *
 * <pre>{@code
 * // Automatically clears context when done
 * try (var ctx = ExperimentContext.withExperiment("example-123", "session-789")) {
 *     ChatCompletion completion = client.chat().completions().create(params);
 * } // Context automatically cleared here
 * }</pre>
 *
 * <p>
 * Example usage (manual):
 *
 * <pre>{@code
 * // Set experiment context before making LLM call
 * ExperimentContext.setReferenceExampleId("example-123");
 * ExperimentContext.setDatasetId("dataset-456");
 * ExperimentContext.setSessionId("session-789");
 * ChatCompletion completion = client.chat().completions().create(params);
 * ExperimentContext.clear();
 * }</pre>
 *
 * <p>
 * This is particularly useful for running experiments where you want to link
 * LLM traces to specific dataset examples in LangSmith.
 */
public final class ExperimentContext {

    private static final ThreadLocal<Context> CONTEXT = ThreadLocal.withInitial(Context::new);

    private ExperimentContext() {
        // Utility class
    }

    /**
     * Scope that automatically clears context when closed.
     * Implements AutoCloseable for try-with-resources support.
     */
    public static class Scope implements AutoCloseable {
        private final Context previousContext;

        private Scope(Context previousContext) {
            this.previousContext = previousContext;
        }

        @Override
        public void close() {
            // Restore previous context (or clear if it was empty)
            if (previousContext.isEmpty()) {
                clear();
            } else {
                CONTEXT.set(previousContext);
            }
        }
    }

    /**
     * Sets all experiment context values and returns a Scope for try-with-resources.
     * This is the recommended method for running experiments as it properly links runs to
     * the experiment session and automatically clears context when done.
     *
     * <pre>{@code
     * try (var ctx = ExperimentContext.withExperiment(example.id(), session.id())) {
     *     ChatCompletion completion = client.chat().completions().create(params);
     * } // Context automatically cleared here
     * }</pre>
     *
     * @param exampleId the reference example ID from your LangSmith dataset
     * @param sessionId the session/experiment UUID
     * @return a Scope that will clear the context when closed
     */
    public static Scope withExperiment(String exampleId, String sessionId) {
        Context previous = CONTEXT.get().copy();
        setReferenceExampleId(exampleId);
        setSessionId(sessionId);
        return new Scope(previous);
    }

    /**
     * Sets the reference example ID for the current thread.
     * This ID will be attached to all LLM spans created in this thread until cleared.
     *
     * @param exampleId the reference example ID from your LangSmith dataset
     */
    public static void setReferenceExampleId(String exampleId) {
        CONTEXT.get().referenceExampleId = exampleId;
    }

    /**
     * Gets the reference example ID for the current thread.
     *
     * @return the reference example ID, or null if not set
     */
    public static String getReferenceExampleId() {
        return CONTEXT.get().referenceExampleId;
    }

    /**
     * Sets the dataset ID for the current thread.
     * This ID will be attached to all LLM spans created in this thread until cleared.
     *
     * @param datasetId the dataset ID from your LangSmith dataset
     */
    public static void setDatasetId(String datasetId) {
        CONTEXT.get().datasetId = datasetId;
    }

    /**
     * Gets the dataset ID for the current thread.
     *
     * @return the dataset ID, or null if not set
     */
    public static String getDatasetId() {
        return CONTEXT.get().datasetId;
    }

    /**
     * Sets the session ID (experiment ID) for the current thread.
     * This ID will be attached to all LLM spans created in this thread until cleared.
     *
     * @param sessionId the session/experiment UUID from LangSmith
     */
    public static void setSessionId(String sessionId) {
        CONTEXT.get().sessionId = sessionId;
    }

    /**
     * Gets the session ID for the current thread.
     *
     * @return the session ID, or null if not set
     */
    public static String getSessionId() {
        return CONTEXT.get().sessionId;
    }

    /**
     * Sets custom metadata that will be attached to spans as attributes.
     * Metadata keys will be prefixed with "langsmith.metadata." when set as span attributes.
     *
     * @param key   the metadata key
     * @param value the metadata value
     */
    public static void setMetadata(String key, String value) {
        CONTEXT.get().metadata.put(key, value);
    }

    /**
     * Gets all custom metadata for the current thread.
     *
     * @return a map of metadata key-value pairs
     */
    public static Map<String, String> getMetadata() {
        return new HashMap<>(CONTEXT.get().metadata);
    }

    /**
     * Adds a tag that will be attached to spans.
     * Tags are stored as a comma-separated list in the "langsmith.tags" attribute.
     *
     * @param tag the tag to add
     */
    public static void addTag(String tag) {
        CONTEXT.get().tags.add(tag);
    }

    /**
     * Gets all tags for the current thread.
     *
     * @return a comma-separated string of tags, or null if no tags are set
     */
    public static String getTags() {
        java.util.List<String> tags = CONTEXT.get().tags;
        return tags.isEmpty() ? null : String.join(",", tags);
    }

    /**
     * Clears all experiment context for the current thread.
     * This should be called after completing an experiment run to avoid
     * leaking context to subsequent operations.
     */
    public static void clear() {
        CONTEXT.get().clear();
    }

    /**
     * Removes the thread-local context entirely.
     * This is useful for cleanup in thread pool environments.
     */
    public static void remove() {
        CONTEXT.remove();
    }

    /**
     * Internal context holder for thread-local data.
     */
    private static class Context {
        String referenceExampleId;
        String datasetId;
        String sessionId;
        Map<String, String> metadata = new HashMap<>();
        java.util.List<String> tags = new java.util.ArrayList<>();

        void clear() {
            referenceExampleId = null;
            datasetId = null;
            sessionId = null;
            metadata.clear();
            tags.clear();
        }

        boolean isEmpty() {
            return referenceExampleId == null
                    && datasetId == null
                    && sessionId == null
                    && metadata.isEmpty()
                    && tags.isEmpty();
        }

        Context copy() {
            Context copy = new Context();
            copy.referenceExampleId = this.referenceExampleId;
            copy.datasetId = this.datasetId;
            copy.sessionId = this.sessionId;
            copy.metadata = new HashMap<>(this.metadata);
            copy.tags = new java.util.ArrayList<>(this.tags);
            return copy;
        }
    }
}
