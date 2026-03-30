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

private class TracedOpenAIClient(
    private val delegate: OpenAIClient,
    private val config: TraceConfig,
) : OpenAIClient by delegate {

    private val tracedChat by lazy { TracedChatService(delegate.chat(), config) }
    private val tracedResponses by lazy { TracedResponseService(delegate.responses(), config) }

    override fun chat(): ChatService = tracedChat

    override fun responses(): ResponseService = tracedResponses

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenAIClient =
        TracedOpenAIClient(delegate.withOptions(modifier), config)
}

private class TracedChatService(
    private val delegate: ChatService,
    private val config: TraceConfig,
) : ChatService by delegate {

    private val tracedCompletions by lazy {
        TracedChatCompletionService(delegate.completions(), config)
    }

    override fun completions(): ChatCompletionService = tracedCompletions

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatService =
        TracedChatService(delegate.withOptions(modifier), config)
}

/**
 * Builds the traced `create` functions (1-arg and 2-arg) for an OpenAI service.
 *
 * Both [TracedChatCompletionService] and [TracedResponseService] follow the same pattern — this
 * extracts the shared tracing plumbing so each service only provides the type-specific bits.
 *
 * @param P the params type (e.g. [ChatCompletionCreateParams])
 * @param R the response type (e.g. [ChatCompletion])
 * @param config base tracing configuration
 * @param paramsToMap serializes params to a map for recording as run inputs
 * @param useResponsesApi whether this is the responses API (affects metadata)
 * @param createOne calls the underlying service's `create(params)` method
 * @param createTwo calls the underlying service's `create(params, requestOptions)` method
 */
private class TracedOpenAIClientCreate<P, R : Any>(
    config: TraceConfig,
    paramsToMap: (P) -> Map<String, Any?>,
    useResponsesApi: Boolean,
    createOne: (P) -> R,
    createTwo: (P, RequestOptions) -> R,
) {
    val oneArg: Function<P, R> =
        traceable(
            Function<P, R> {
                setInvocationParams(paramsToMap(it), useResponsesApi = useResponsesApi)
                createOne(it)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(
                    TraceProcessIO<P, R>(
                        processInputs = Function { params -> paramsToMap(params) },
                        processOutputs =
                            Function { response -> processChatCompletionOutput(toMap(response)) },
                    )
                )
                .build(),
        )

    val twoArg: java.util.function.BiFunction<P, RequestOptions, R> =
        traceBiFunction(
            java.util.function.BiFunction<P, RequestOptions, R> { params, opts ->
                setInvocationParams(paramsToMap(params), useResponsesApi = useResponsesApi)
                createTwo(params, opts)
            },
            config
                .toBuilder()
                .name("ChatOpenAI")
                .runType(RunType.LLM)
                .processTracedIO(
                    TraceProcessIO<Pair<P, RequestOptions>, R>(
                        processInputs =
                            Function { (params, opts) ->
                                paramsToMap(params) + ("request_options" to toGenericMap(opts))
                            },
                        processOutputs =
                            Function { response -> processChatCompletionOutput(toMap(response)) },
                    )
                )
                .build(),
        )
}

private class TracedChatCompletionService(
    private val delegate: ChatCompletionService,
    private val config: TraceConfig,
) : ChatCompletionService by delegate {

    private val traced =
        TracedOpenAIClientCreate(
            config = config,
            paramsToMap = ::chatParamsToMap,
            useResponsesApi = false,
            createOne = delegate::create,
            createTwo = delegate::create,
        )

    override fun create(params: ChatCompletionCreateParams): ChatCompletion =
        traced.oneArg.apply(params)

    override fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions,
    ): ChatCompletion = traced.twoArg.apply(params, requestOptions)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChatCompletionService =
        TracedChatCompletionService(delegate.withOptions(modifier), config)
}

private class TracedResponseService(
    private val delegate: ResponseService,
    private val config: TraceConfig,
) : ResponseService by delegate {

    private val traced =
        TracedOpenAIClientCreate(
            config = config,
            paramsToMap = ::responseParamsToMap,
            useResponsesApi = true,
            createOne = delegate::create,
            createTwo = delegate::create,
        )

    override fun create(params: ResponseCreateParams): Response = traced.oneArg.apply(params)

    override fun create(params: ResponseCreateParams, requestOptions: RequestOptions): Response =
        traced.twoArg.apply(params, requestOptions)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService =
        TracedResponseService(delegate.withOptions(modifier), config)
}
