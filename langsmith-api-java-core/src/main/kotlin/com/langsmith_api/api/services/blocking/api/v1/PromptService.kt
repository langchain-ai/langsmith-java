// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasParams
import com.langsmith_api.api.models.api.v1.prompts.PromptCanvasResponse
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptParams
import com.langsmith_api.api.models.api.v1.prompts.PromptInvokePromptResponse
import java.util.function.Consumer

interface PromptService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptService

    /** Prompt Canvas */
    fun canvas(params: PromptCanvasParams): PromptCanvasResponse =
        canvas(params, RequestOptions.none())

    /** @see canvas */
    fun canvas(
        params: PromptCanvasParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptCanvasResponse

    /** Invoke Prompt */
    fun invokePrompt(params: PromptInvokePromptParams): PromptInvokePromptResponse =
        invokePrompt(params, RequestOptions.none())

    /** @see invokePrompt */
    fun invokePrompt(
        params: PromptInvokePromptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptInvokePromptResponse

    /** A view of [PromptService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PromptService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/prompts/canvas`, but is otherwise the same
         * as [PromptService.canvas].
         */
        @MustBeClosed
        fun canvas(params: PromptCanvasParams): HttpResponseFor<PromptCanvasResponse> =
            canvas(params, RequestOptions.none())

        /** @see canvas */
        @MustBeClosed
        fun canvas(
            params: PromptCanvasParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptCanvasResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/prompts/invoke_prompt`, but is otherwise
         * the same as [PromptService.invokePrompt].
         */
        @MustBeClosed
        fun invokePrompt(
            params: PromptInvokePromptParams
        ): HttpResponseFor<PromptInvokePromptResponse> = invokePrompt(params, RequestOptions.none())

        /** @see invokePrompt */
        @MustBeClosed
        fun invokePrompt(
            params: PromptInvokePromptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptInvokePromptResponse>
    }
}
