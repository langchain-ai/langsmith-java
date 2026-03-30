package com.langchain.smith.wrappers.openai

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.langchain.smith.tracing.getCurrentRunTree
import com.openai.core.jsonMapper
import com.openai.models.chat.completions.ChatCompletionCreateParams
import com.openai.models.responses.ResponseCreateParams

/**
 * The OpenAI SDK's own ObjectMapper — understands JsonField, @ExcludeMissing, and @JsonProperty
 * annotations. Used to serialize OpenAI SDK model types (Body, ChatCompletion, Response) which rely
 * on explicit @JsonProperty annotations with snake_case keys rather than getter auto-detection.
 */
private val openAIMapper = jsonMapper()

/** A standard Jackson mapper for general-purpose serialization (e.g. RequestOptions). */
private val genericMapper = jacksonObjectMapper()

private val MAP_TYPE = object : TypeReference<Map<String, Any?>>() {}

/**
 * Converts an OpenAI SDK model object to a `Map<String, Any?>` using the OpenAI SDK's own
 * ObjectMapper, which correctly handles @JsonProperty, @ExcludeMissing, and JsonField.
 */
internal fun toMap(value: Any): Map<String, Any?> = openAIMapper.convertValue(value, MAP_TYPE)

/**
 * Converts a general object to a `Map<String, Any?>` using a standard Jackson mapper with getter
 * auto-detection. Used for non-OpenAI types like `RequestOptions`.
 */
internal fun toGenericMap(value: Any): Map<String, Any?> =
    genericMapper.convertValue(value, MAP_TYPE)

/**
 * Serializes [ChatCompletionCreateParams] to a `Map<String, Any?>` using the inner Body (which has
 * proper `@JsonProperty` snake_case annotations), matching the OpenAI REST API wire format.
 */
internal fun chatParamsToMap(params: ChatCompletionCreateParams): Map<String, Any?> =
    toMap(params._body())

/**
 * Serializes [ResponseCreateParams] to a `Map<String, Any?>` using the inner Body (which has proper
 * `@JsonProperty` snake_case annotations), matching the OpenAI REST API wire format.
 */
internal fun responseParamsToMap(params: ResponseCreateParams): Map<String, Any?> =
    toMap(params._body())

// Keys from the request params that go into ls_invocation_params (matching JS SDK)
internal val TRACED_INVOCATION_KEYS =
    setOf(
        "frequency_penalty",
        "n",
        "logit_bias",
        "logprobs",
        "modalities",
        "parallel_tool_calls",
        "prediction",
        "presence_penalty",
        "prompt_cache_key",
        "reasoning",
        "reasoning_effort",
        "response_format",
        "seed",
        "service_tier",
        "stream_options",
        "top_logprobs",
        "top_p",
        "truncation",
        "user",
        "verbosity",
        "web_search_options",
    )

/**
 * Processes a chat completion output to restructure usage into `usage_metadata`, matching the
 * LangSmith JS SDK's `processChatCompletion`.
 */
internal fun processChatCompletionOutput(raw: Map<String, Any?>): Map<String, Any?> {
    val result = raw.toMutableMap()
    val usage = result.remove("usage")
    if (usage is Map<*, *>) {
        val serviceTier = result["service_tier"] as? String
        val recognized = if (serviceTier in listOf("priority", "flex")) serviceTier else null
        val prefix = if (recognized != null) "${recognized}_" else ""

        // Chat completions use prompt_tokens/completion_tokens
        // Responses API uses input_tokens/output_tokens
        val inputTokens = (usage["prompt_tokens"] ?: usage["input_tokens"]) as? Number ?: 0
        val outputTokens = (usage["completion_tokens"] ?: usage["output_tokens"]) as? Number ?: 0
        val totalTokens = (usage["total_tokens"]) as? Number ?: 0

        val inputTokenDetails = mutableMapOf<String, Any?>()
        val outputTokenDetails = mutableMapOf<String, Any?>()

        // Chat completions token details
        val promptDetails = usage["prompt_tokens_details"] as? Map<*, *>
        val completionDetails = usage["completion_tokens_details"] as? Map<*, *>
        // Responses API token details
        val inputDetails = usage["input_tokens_details"] as? Map<*, *>
        val outputDetails = usage["output_tokens_details"] as? Map<*, *>

        val cachedTokens = promptDetails?.get("cached_tokens") ?: inputDetails?.get("cached_tokens")
        if (cachedTokens != null) {
            inputTokenDetails["${prefix}cache_read"] = cachedTokens
        }

        val audioInputTokens = promptDetails?.get("audio_tokens")
        if (audioInputTokens != null) {
            inputTokenDetails["audio"] = audioInputTokens
        }

        val reasoningTokens =
            completionDetails?.get("reasoning_tokens") ?: outputDetails?.get("reasoning_tokens")
        if (reasoningTokens != null) {
            outputTokenDetails["${prefix}reasoning"] = reasoningTokens
        }

        val audioOutputTokens = completionDetails?.get("audio_tokens")
        if (audioOutputTokens != null) {
            outputTokenDetails["audio"] = audioOutputTokens
        }

        if (recognized != null) {
            val cacheRead = (inputTokenDetails["${prefix}cache_read"] as? Number)?.toLong() ?: 0L
            inputTokenDetails[recognized] = inputTokens.toLong() - cacheRead
            val reasoning = (outputTokenDetails["${prefix}reasoning"] as? Number)?.toLong() ?: 0L
            outputTokenDetails[recognized] = outputTokens.toLong() - reasoning
        }

        result["usage_metadata"] = buildMap {
            put("input_tokens", inputTokens)
            put("output_tokens", outputTokens)
            put("total_tokens", totalTokens)
            if (inputTokenDetails.isNotEmpty()) put("input_token_details", inputTokenDetails)
            if (outputTokenDetails.isNotEmpty()) put("output_token_details", outputTokenDetails)
        }
    }
    return result
}

/**
 * Extracts invocation params from chat completion request params and sets them as metadata on the
 * current run, matching the JS SDK's `getInvocationParams`.
 */
internal fun setInvocationParams(params: Map<String, Any?>, useResponsesApi: Boolean) {
    val run = getCurrentRunTree() ?: return

    val invocationParams = mutableMapOf<String, Any?>()
    for ((key, value) in params) {
        if (key in TRACED_INVOCATION_KEYS) {
            invocationParams[key] = value
        }
    }
    if (useResponsesApi) {
        invocationParams["use_responses_api"] = true
    }

    run.metadata["ls_provider"] = "openai"
    run.metadata["ls_model_type"] = "chat"
    params["model"]?.let { run.metadata["ls_model_name"] = it }
    (params["max_completion_tokens"] ?: params["max_tokens"])?.let {
        run.metadata["ls_max_tokens"] = it
    }
    params["temperature"]?.let { run.metadata["ls_temperature"] = it }
    val stop = params["stop"]
    if (stop != null) {
        run.metadata["ls_stop"] = if (stop is String) listOf(stop) else stop
    }
    if (invocationParams.isNotEmpty()) {
        run.metadata["ls_invocation_params"] = invocationParams
    }
}
