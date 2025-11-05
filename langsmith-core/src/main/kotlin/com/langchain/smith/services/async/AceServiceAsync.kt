// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.ace.AceExecuteParams
import com.langchain.smith.models.ace.AceExecuteResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AceServiceAsync

    /** Execute some custom code for testing purposes. */
    fun execute(params: AceExecuteParams): CompletableFuture<AceExecuteResponse> =
        execute(params, RequestOptions.none())

    /** @see execute */
    fun execute(
        params: AceExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AceExecuteResponse>

    /** A view of [AceServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/ace/execute`, but is otherwise the same as
         * [AceServiceAsync.execute].
         */
        fun execute(
            params: AceExecuteParams
        ): CompletableFuture<HttpResponseFor<AceExecuteResponse>> =
            execute(params, RequestOptions.none())

        /** @see execute */
        fun execute(
            params: AceExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AceExecuteResponse>>
    }
}
