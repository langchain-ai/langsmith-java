@file:JvmName("OpenAITracing")

package com.langchain.smith.wrappers.openai

import com.langchain.smith.tracing.RunType
import com.langchain.smith.tracing.TraceConfig
import com.langchain.smith.tracing.TraceProcessIO
import com.langchain.smith.tracing.traceBiFunction
import com.langchain.smith.tracing.traceable
import com.openai.client.OpenAIClient
import com.openai.core.ClientOptions
import com.openai.core.RequestOptions
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.responses.Response
import com.openai.models.responses.ResponseCreateParams
import com.openai.services.blocking.ChatService
import com.openai.services.blocking.ResponseService
import com.openai.services.blocking.chat.ChatCompletionService
import java.util.function.Consumer
import java.util.function.Function

/**
 * Wraps an [OpenAIClient] with LangSmith tracing.
 *
 * The returned client traces `chat().completions().create()` and `responses().create()` calls using
 * [traceable], recording inputs and outputs as JSON maps. All other methods — including
 * `createStreaming()` — pass through to the delegate unchanged.
 *
 * // TODO: Trace `createStreaming()` for both chat completions and responses.
 *
 * The [config] is used as the base configuration for all traced calls — the wrapper overrides
 * [TraceConfig.name] and [TraceConfig.runType] per operation.
 *
 * ## Example (Kotlin)
 *
 * ```kotlin
 * val client = wrapOpenAI(
 *     OpenAIOkHttpClient.fromEnv(),
 *     TraceConfig(client = langsmithClient),
 * )
 * val completion = client.chat().completions().create(params)
 * ```
 *
 * ## Example (Java)
 *
 * ```java
 * OpenAIClient client = OpenAITracing.wrapOpenAI(
 *     OpenAIOkHttpClient.fromEnv(),
 *     TraceConfig.builder().client(langsmithClient).build());
 * ChatCompletion completion = client.chat().completions().create(params);
 * ```
 *
 * @param client the OpenAI client to wrap
 * @param config base tracing configuration (client, project, tags, etc.)
 * @return a wrapped [OpenAIClient] that traces LLM calls to LangSmith
 */
fun wrapOpenAI(client: OpenAIClient, config: TraceConfig): OpenAIClient =
    TracedOpenAIClient(client, config)

// ---------------------------------------------------------------------------
// Internal wrapper implementations
// ---------------------------------------------------------------------------

private class TracedOpenAIClient(
    private val delegate: OpenAIClient,
    private val config: TraceConfig,
) : OpenAIClient by delegate {

    override fun chat(): ChatService = TracedChatService(delegate.chat(), config)

    override fun responses(): ResponseService = TracedResponseService(delegate.responses(), config)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIClient =
        TracedOpenAIClient(delegate.withOptions(modifier), config)
}

private class TracedChatService(
    private val delegate: ChatService,
    private val config: TraceConfig,
) : ChatService by delegate {

    override fun completions(): ChatCompletionService =
        TracedChatCompletionService(delegate.completions(), config)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        TracedChatService(delegate.withOptions(modifier), config)
}

private class TracedChatCompletionService(
    private val delegate: ChatCompletionService,
    private val config: TraceConfig,
) : ChatCompletionService by delegate {

    private val processIO =
        TraceProcessIO<ChatCompletionCreateParams, ChatCompletion>(
            processInputs = Function { params -> chatParamsToMap(params) },
            processOutputs =
                Function { completion -> processChatCompletionOutput(toMap(completion)) },
        )

    private val processIOWithOpts =
        TraceProcessIO<Pair<ChatCompletionCreateParams, RequestOptions>, ChatCompletion>(
            processInputs =
                Function { (params, opts) ->
                    chatParamsToMap(params) + ("request_options" to toGenericMap(opts))
                },
            processOutputs =
                Function { completion -> processChatCompletionOutput(toMap(completion)) },
        )

    private val oneArgTraced =
        traceable(
            Function<ChatCompletionCreateParams, ChatCompletion> {
                setInvocationParams(chatParamsToMap(it), useResponsesApi = false)
                delegate.create(it)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(processIO)
                .build(),
        )

    private val twoArgTraced =
        traceBiFunction(
            java.util.function.BiFunction<
                ChatCompletionCreateParams,
                RequestOptions,
                ChatCompletion,
            > { params, opts ->
                setInvocationParams(chatParamsToMap(params), useResponsesApi = false)
                delegate.create(params, opts)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(processIOWithOpts)
                .build(),
        )

    override fun create(params: ChatCompletionCreateParams): ChatCompletion =
        oneArgTraced.apply(params)

    override fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions,
    ): ChatCompletion = twoArgTraced.apply(params, requestOptions)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatCompletionService =
        TracedChatCompletionService(delegate.withOptions(modifier), config)
}

private class TracedResponseService(
    private val delegate: ResponseService,
    private val config: TraceConfig,
) : ResponseService by delegate {

    private val processIO =
        TraceProcessIO<ResponseCreateParams, Response>(
            processInputs = Function { params -> responseParamsToMap(params) },
            processOutputs = Function { response -> processChatCompletionOutput(toMap(response)) },
        )

    private val processIOWithOpts =
        TraceProcessIO<Pair<ResponseCreateParams, RequestOptions>, Response>(
            processInputs =
                Function { (params, opts) ->
                    responseParamsToMap(params) + ("request_options" to toGenericMap(opts))
                },
            processOutputs = Function { response -> processChatCompletionOutput(toMap(response)) },
        )

    private val oneArgTraced =
        traceable(
            Function<ResponseCreateParams, Response> {
                setInvocationParams(responseParamsToMap(it), useResponsesApi = true)
                delegate.create(it)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(processIO)
                .build(),
        )

    private val twoArgTraced =
        traceBiFunction(
            java.util.function.BiFunction<ResponseCreateParams, RequestOptions, Response> {
                params,
                opts ->
                setInvocationParams(responseParamsToMap(params), useResponsesApi = true)
                delegate.create(params, opts)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(processIOWithOpts)
                .build(),
        )

    override fun create(params: ResponseCreateParams): Response = oneArgTraced.apply(params)

    override fun create(params: ResponseCreateParams, requestOptions: RequestOptions): Response =
        twoArgTraced.apply(params, requestOptions)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService =
        TracedResponseService(delegate.withOptions(modifier), config)
}
