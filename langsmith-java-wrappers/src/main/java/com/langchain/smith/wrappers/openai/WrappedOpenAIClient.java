package com.langchain.smith.wrappers.openai;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.core.ClientOptions;
import java.util.function.Consumer;

/**
 * Wrapped OpenAI client that maintains the same developer experience as the
 * original client
 * while adding LangSmith tracing capabilities.
 *
 * <p>
 * This wrapper delegates all calls to the underlying OpenAI client, allowing
 * all
 * configuration options and methods to work exactly as they would with the
 * original client.
 */
public class WrappedOpenAIClient implements OpenAIClient {

    private final OpenAIClient delegate;

    /**
     * Creates a new wrapped client that delegates to the provided client.
     *
     * @param delegate the underlying OpenAI client to wrap
     */
    public WrappedOpenAIClient(OpenAIClient delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("Delegate client cannot be null");
        }
        this.delegate = delegate;
    }

    /**
     * Gets the underlying delegate client.
     *
     * @return the wrapped OpenAI client
     */
    public OpenAIClient getDelegate() {
        return delegate;
    }

    @Override
    public com.openai.client.OpenAIClientAsync async() {
        return delegate.async();
    }

    @Override
    public OpenAIClient.WithRawResponse withRawResponse() {
        return delegate.withRawResponse();
    }

    @Override
    public OpenAIClient withOptions(Consumer<ClientOptions.Builder> options) {
        return delegate.withOptions(options);
    }

    @Override
    public com.openai.services.blocking.CompletionService completions() {
        return delegate.completions();
    }

    @Override
    public com.openai.services.blocking.ChatService chat() {
        return new WrappedChatService(delegate.chat());
    }

    @Override
    public com.openai.services.blocking.EmbeddingService embeddings() {
        return delegate.embeddings();
    }

    @Override
    public com.openai.services.blocking.FileService files() {
        return delegate.files();
    }

    @Override
    public com.openai.services.blocking.ImageService images() {
        return delegate.images();
    }

    @Override
    public com.openai.services.blocking.AudioService audio() {
        return delegate.audio();
    }

    @Override
    public com.openai.services.blocking.ModerationService moderations() {
        return delegate.moderations();
    }

    @Override
    public com.openai.services.blocking.ModelService models() {
        return delegate.models();
    }

    @Override
    public com.openai.services.blocking.FineTuningService fineTuning() {
        return delegate.fineTuning();
    }

    @Override
    public com.openai.services.blocking.GraderService graders() {
        return delegate.graders();
    }

    @Override
    public com.openai.services.blocking.VectorStoreService vectorStores() {
        return delegate.vectorStores();
    }

    @Override
    public com.openai.services.blocking.WebhookService webhooks() {
        return delegate.webhooks();
    }

    @Override
    public com.openai.services.blocking.BetaService beta() {
        return delegate.beta();
    }

    @Override
    public com.openai.services.blocking.BatchService batches() {
        return delegate.batches();
    }

    @Override
    public com.openai.services.blocking.UploadService uploads() {
        return delegate.uploads();
    }

    @Override
    public com.openai.services.blocking.ResponseService responses() {
        return new WrappedResponseService(delegate.responses());
    }

    @Override
    public com.openai.services.blocking.RealtimeService realtime() {
        return delegate.realtime();
    }

    @Override
    public com.openai.services.blocking.ConversationService conversations() {
        return delegate.conversations();
    }

    @Override
    public com.openai.services.blocking.EvalService evals() {
        return delegate.evals();
    }

    @Override
    public com.openai.services.blocking.ContainerService containers() {
        return delegate.containers();
    }

    @Override
    public com.openai.services.blocking.VideoService videos() {
        return delegate.videos();
    }

    @Override
    public void close() {
        delegate.close();
    }

    /**
     * Builder for creating wrapped OpenAI clients with the same configuration
     * options
     * as the original client builder.
     */
    public static class Builder {
        private final OpenAIOkHttpClient.Builder delegateBuilder;

        /**
         * Creates a new builder that wraps the OpenAI client builder.
         */
        public Builder() {
            this.delegateBuilder = OpenAIOkHttpClient.builder();
        }

        /**
         * Creates a new builder that wraps the OpenAI client builder, starting from
         * environment variables.
         *
         * @return this builder for method chaining
         */
        public Builder fromEnv() {
            delegateBuilder.fromEnv();
            return this;
        }

        /**
         * Sets the API key.
         *
         * @param apiKey the OpenAI API key
         * @return this builder for method chaining
         */
        public Builder apiKey(String apiKey) {
            delegateBuilder.apiKey(apiKey);
            return this;
        }

        /**
         * Sets the organization ID.
         *
         * @param organization the organization ID
         * @return this builder for method chaining
         */
        public Builder organization(String organization) {
            delegateBuilder.organization(organization);
            return this;
        }

        /**
         * Sets the project ID.
         *
         * @param project the project ID
         * @return this builder for method chaining
         */
        public Builder project(String project) {
            delegateBuilder.project(project);
            return this;
        }

        /**
         * Sets the webhook secret.
         *
         * @param webhookSecret the webhook secret
         * @return this builder for method chaining
         */
        public Builder webhookSecret(String webhookSecret) {
            delegateBuilder.webhookSecret(webhookSecret);
            return this;
        }

        /**
         * Sets the base URL.
         *
         * @param baseUrl the base URL
         * @return this builder for method chaining
         */
        public Builder baseUrl(String baseUrl) {
            delegateBuilder.baseUrl(baseUrl);
            return this;
        }

        /**
         * Builds the wrapped OpenAI client.
         *
         * @return a new wrapped OpenAI client
         */
        public WrappedOpenAIClient build() {
            return new WrappedOpenAIClient(delegateBuilder.build());
        }
    }

    /**
     * Creates a new builder for constructing wrapped OpenAI clients.
     *
     * @return a new builder instance
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Creates a wrapped OpenAI client from environment variables.
     *
     * @return a new wrapped OpenAI client configured from environment variables
     */
    public static WrappedOpenAIClient fromEnv() {
        return builder().fromEnv().build();
    }
}
