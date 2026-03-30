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
import com.openai.core.http.StreamResponse
import com.openai.helpers.ChatCompletionAccumulator
import com.openai.helpers.ResponseAccumulator
import com.openai.models.chat.completions.ChatCompletion
import com.openai.models.chat.completions.ChatCompletionChunk
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.responses.Response
import com.openai.models.responses.ResponseCreateParams
import com.openai.models.responses.ResponseStreamEvent
import com.openai.services.blocking.ChatService
import com.openai.services.blocking.ResponseService
import com.openai.services.blocking.chat.ChatCompletionService
import java.util.function.Consumer
import java.util.function.Function

/**
 * Wraps an [OpenAIClient] with LangSmith tracing.
 *
 * The returned client traces `chat().completions().create()`, `responses().create()`, and their
 * streaming counterparts (`createStreaming()`) using [traceable], recording inputs and outputs as
 * JSON maps. Streaming calls aggregate chunks using the SDK's built-in accumulators and record the
 * final aggregated result when the stream closes.
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
 * Builds the traced `create` and `createStreaming` functions for an OpenAI service.
 *
 * Both [TracedChatCompletionService] and [TracedResponseService] follow the same pattern — this
 * extracts the shared tracing plumbing so each service only provides the type-specific bits.
 *
 * @param P the params type (e.g. [ChatCompletionCreateParams])
 * @param R the response type (e.g. [ChatCompletion])
 * @param C the chunk/event type for streaming (e.g. [ChatCompletionChunk])
 */
private class TracedOpenAIClientCreate<P, R : Any, C>(
    config: TraceConfig,
    private val paramsToMap: (P) -> Map<String, Any?>,
    private val useResponsesApi: Boolean,
    createOne: (P) -> R,
    createTwo: (P, RequestOptions) -> R,
    private val streamOne: (P) -> StreamResponse<C>,
    private val streamTwo: (P, RequestOptions) -> StreamResponse<C>,
    private val aggregator: java.util.function.Function<List<Any?>, Any?>,
) {
    private val tracedConfig = config.toBuilder().name("ChatOpenAI").runType(RunType.LLM).build()

    private val outputProcessor =
        Function<R, Map<String, Any?>> { response -> processChatCompletionOutput(toMap(response)) }

    val oneArg: Function<P, R> =
        traceable(
            Function<P, R> { p ->
                setInvocationParams(paramsToMap(p), useResponsesApi = useResponsesApi)
                createOne(p)
            },
            tracedConfig
                .toBuilder()
                .processTracedIO(
                    TraceProcessIO<P, R>(
                        processInputs = Function { params -> paramsToMap(params) },
                        processOutputs = outputProcessor,
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
            tracedConfig
                .toBuilder()
                .processTracedIO(
                    TraceProcessIO<Pair<P, RequestOptions>, R>(
                        processInputs =
                            Function { (params, opts) ->
                                paramsToMap(params) + ("request_options" to toGenericMap(opts))
                            },
                        processOutputs = outputProcessor,
                    )
                )
                .build(),
        )

    private val streamOutputProcessor =
        Function<Any, Map<String, Any?>> { processChatCompletionOutput(toMap(it!!)) }

    /**
     * Traces a streaming call. The traced function returns the inner [java.util.stream.Stream]
     * (which `traceable` instruments via `peek` + `onClose`), then we rewrap it in a
     * [StreamResponse] that delegates `close()` to both the instrumented stream and the original
     * response.
     */
    fun streamOneArg(params: P): StreamResponse<C> {
        val response = streamOne(params)
        val tracedStreamFn =
            traceable(
                Function<P, java.util.stream.Stream<C>> { p ->
                    setInvocationParams(paramsToMap(p), useResponsesApi = useResponsesApi)
                    response.stream()
                },
                tracedConfig
                    .toBuilder()
                    .processTracedIO(
                        TraceProcessIO<P, Any>(
                            processInputs = Function { p -> paramsToMap(p) },
                            processOutputs = streamOutputProcessor,
                            aggregator = aggregator,
                        )
                    )
                    .build(),
            )
        val tracedStream = tracedStreamFn.apply(params)
        return TracedStreamResponse(tracedStream, response)
    }

    fun streamTwoArg(params: P, opts: RequestOptions): StreamResponse<C> {
        val response = streamTwo(params, opts)
        val tracedStreamFn =
            traceable(
                Function<P, java.util.stream.Stream<C>> { p ->
                    setInvocationParams(paramsToMap(p), useResponsesApi = useResponsesApi)
                    response.stream()
                },
                tracedConfig
                    .toBuilder()
                    .processTracedIO(
                        TraceProcessIO<P, Any>(
                            processInputs =
                                Function { p ->
                                    paramsToMap(p) + ("request_options" to toGenericMap(opts))
                                },
                            processOutputs = streamOutputProcessor,
                            aggregator = aggregator,
                        )
                    )
                    .build(),
            )
        val tracedStream = tracedStreamFn.apply(params)
        return TracedStreamResponse(tracedStream, response)
    }
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
            streamOne = delegate::createStreaming,
            streamTwo = delegate::createStreaming,
            aggregator = CHAT_COMPLETION_AGGREGATOR,
        )

    override fun create(params: ChatCompletionCreateParams): ChatCompletion =
        traced.oneArg.apply(params)

    override fun create(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions,
    ): ChatCompletion = traced.twoArg.apply(params, requestOptions)

    override fun createStreaming(
        params: ChatCompletionCreateParams
    ): StreamResponse<ChatCompletionChunk> = traced.streamOneArg(params)

    override fun createStreaming(
        params: ChatCompletionCreateParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ChatCompletionChunk> = traced.streamTwoArg(params, requestOptions)

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
            streamOne = delegate::createStreaming,
            streamTwo = delegate::createStreaming,
            aggregator = RESPONSES_AGGREGATOR,
        )

    override fun create(params: ResponseCreateParams): Response = traced.oneArg.apply(params)

    override fun create(params: ResponseCreateParams, requestOptions: RequestOptions): Response =
        traced.twoArg.apply(params, requestOptions)

    override fun createStreaming(
        params: ResponseCreateParams
    ): StreamResponse<ResponseStreamEvent> = traced.streamOneArg(params)

    override fun createStreaming(
        params: ResponseCreateParams,
        requestOptions: RequestOptions,
    ): StreamResponse<ResponseStreamEvent> = traced.streamTwoArg(params, requestOptions)

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResponseService =
        TracedResponseService(delegate.withOptions(modifier), config)
}

/**
 * A [StreamResponse] that returns an instrumented [java.util.stream.Stream] (with tracing
 * peek/onClose handlers) and delegates [close] to the original response.
 */
private class TracedStreamResponse<C>(
    private val tracedStream: java.util.stream.Stream<C>,
    private val original: StreamResponse<C>,
) : StreamResponse<C> {

    override fun stream(): java.util.stream.Stream<C> = tracedStream

    override fun close() {
        try {
            tracedStream.close()
        } finally {
            original.close()
        }
    }
}

/** Aggregator that uses the SDK's [ChatCompletionAccumulator] to reassemble chunks. */
private val CHAT_COMPLETION_AGGREGATOR =
    java.util.function.Function<List<Any?>, Any?> { chunks ->
        val acc = ChatCompletionAccumulator.create()
        chunks.filterIsInstance<ChatCompletionChunk>().forEach { acc.accumulate(it) }
        acc.chatCompletion()
    }

/** Aggregator that uses the SDK's [ResponseAccumulator] to reassemble events. */
private val RESPONSES_AGGREGATOR =
    java.util.function.Function<List<Any?>, Any?> { events ->
        val acc = ResponseAccumulator.create()
        events.filterIsInstance<ResponseStreamEvent>().forEach { acc.accumulate(it) }
        acc.response()
    }
