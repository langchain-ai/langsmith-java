package com.langchain.smith.wrappers.openai

import com.openai.client.OpenAIClient
import com.openai.client.okhttp.OpenAIOkHttpClient
import com.openai.core.ClientOptions
import com.openai.services.blocking.ChatService
import com.openai.services.blocking.ResponseService
import java.util.function.Consumer

/**
 * Wrapped OpenAI client that maintains the same developer experience as the original client
 * while adding LangSmith tracing capabilities.
 *
 * This wrapper delegates all calls to the underlying OpenAI client.
 */
class WrappedOpenAIClient(private val delegate: OpenAIClient) : OpenAIClient {

    fun getDelegate(): OpenAIClient = delegate

    override fun async() = delegate.async()
    override fun withRawResponse(): OpenAIClient.WithRawResponse = delegate.withRawResponse()
    override fun withOptions(options: Consumer<ClientOptions.Builder>) = delegate.withOptions(options)
    override fun completions() = delegate.completions()
    override fun chat(): ChatService = WrappedChatService(delegate.chat())
    override fun embeddings() = delegate.embeddings()
    override fun files() = delegate.files()
    override fun images() = delegate.images()
    override fun audio() = delegate.audio()
    override fun moderations() = delegate.moderations()
    override fun models() = delegate.models()
    override fun fineTuning() = delegate.fineTuning()
    override fun graders() = delegate.graders()
    override fun vectorStores() = delegate.vectorStores()
    override fun webhooks() = delegate.webhooks()
    override fun beta() = delegate.beta()
    override fun batches() = delegate.batches()
    override fun uploads() = delegate.uploads()
    override fun responses(): ResponseService = WrappedResponseService(delegate.responses())
    override fun realtime() = delegate.realtime()
    override fun conversations() = delegate.conversations()
    override fun evals() = delegate.evals()
    override fun containers() = delegate.containers()
    override fun videos() = delegate.videos()
    override fun close() = delegate.close()

    class Builder {
        private val delegateBuilder = OpenAIOkHttpClient.builder()

        fun fromEnv() = apply { delegateBuilder.fromEnv() }
        fun apiKey(apiKey: String) = apply { delegateBuilder.apiKey(apiKey) }
        fun organization(organization: String) = apply { delegateBuilder.organization(organization) }
        fun project(project: String) = apply { delegateBuilder.project(project) }
        fun webhookSecret(webhookSecret: String) = apply { delegateBuilder.webhookSecret(webhookSecret) }
        fun baseUrl(baseUrl: String) = apply { delegateBuilder.baseUrl(baseUrl) }
        fun build(): WrappedOpenAIClient = WrappedOpenAIClient(delegateBuilder.build())
    }

    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()

        @JvmStatic
        fun wrap(client: OpenAIClient): WrappedOpenAIClient {
            require(client != null) { "client cannot be null" }
            return WrappedOpenAIClient(client)
        }

        @JvmStatic
        fun fromEnv(): WrappedOpenAIClient = builder().fromEnv().build()
    }
}
