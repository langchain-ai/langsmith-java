// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.prompts.PromptCanvasParams
import com.langchain.smith.models.prompts.PromptCanvasResponse
import com.langchain.smith.models.prompts.PromptInvokePromptParams
import com.langchain.smith.models.prompts.PromptInvokePromptResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PromptServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptServiceAsync

    /** Prompt Canvas */
    fun canvas(params: PromptCanvasParams): CompletableFuture<PromptCanvasResponse> =
        canvas(params, RequestOptions.none())

    /** @see canvas */
    fun canvas(
        params: PromptCanvasParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptCanvasResponse>

    /** Invoke Prompt */
    fun invokePrompt(
        params: PromptInvokePromptParams
    ): CompletableFuture<PromptInvokePromptResponse> = invokePrompt(params, RequestOptions.none())

    /** @see invokePrompt */
    fun invokePrompt(
        params: PromptInvokePromptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptInvokePromptResponse>

    /**
     * A view of [PromptServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PromptServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/prompts/canvas`, but is otherwise the same
         * as [PromptServiceAsync.canvas].
         */
        fun canvas(
            params: PromptCanvasParams
        ): CompletableFuture<HttpResponseFor<PromptCanvasResponse>> =
            canvas(params, RequestOptions.none())

        /** @see canvas */
        fun canvas(
            params: PromptCanvasParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptCanvasResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/prompts/invoke_prompt`, but is otherwise
         * the same as [PromptServiceAsync.invokePrompt].
         */
        fun invokePrompt(
            params: PromptInvokePromptParams
        ): CompletableFuture<HttpResponseFor<PromptInvokePromptResponse>> =
            invokePrompt(params, RequestOptions.none())

        /** @see invokePrompt */
        fun invokePrompt(
            params: PromptInvokePromptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptInvokePromptResponse>>
    }
}
