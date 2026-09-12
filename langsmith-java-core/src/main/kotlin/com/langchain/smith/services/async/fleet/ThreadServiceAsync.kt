// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.fleet

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.fleet.threads.ThreadActivateSandboxParams
import com.langchain.smith.models.fleet.threads.ThreadActivateSandboxResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ThreadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadServiceAsync

    /**
     * Starts or resumes the sandbox referenced by the thread and returns when it is ready. The
     * operation is idempotent. The thread must include sandbox.sandbox_slug.
     */
    fun activateSandbox(threadId: String): CompletableFuture<ThreadActivateSandboxResponse> =
        activateSandbox(threadId, ThreadActivateSandboxParams.none())

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadActivateSandboxResponse> =
        activateSandbox(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
    ): CompletableFuture<ThreadActivateSandboxResponse> =
        activateSandbox(threadId, params, RequestOptions.none())

    /** @see activateSandbox */
    fun activateSandbox(
        params: ThreadActivateSandboxParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ThreadActivateSandboxResponse>

    /** @see activateSandbox */
    fun activateSandbox(
        params: ThreadActivateSandboxParams
    ): CompletableFuture<ThreadActivateSandboxResponse> =
        activateSandbox(params, RequestOptions.none())

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ThreadActivateSandboxResponse> =
        activateSandbox(threadId, ThreadActivateSandboxParams.none(), requestOptions)

    /**
     * A view of [ThreadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fleet/threads/{thread_id}/sandbox-activation`,
         * but is otherwise the same as [ThreadServiceAsync.activateSandbox].
         */
        fun activateSandbox(
            threadId: String
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>> =
            activateSandbox(threadId, ThreadActivateSandboxParams.none())

        /** @see activateSandbox */
        fun activateSandbox(
            threadId: String,
            params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>> =
            activateSandbox(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see activateSandbox */
        fun activateSandbox(
            threadId: String,
            params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>> =
            activateSandbox(threadId, params, RequestOptions.none())

        /** @see activateSandbox */
        fun activateSandbox(
            params: ThreadActivateSandboxParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>>

        /** @see activateSandbox */
        fun activateSandbox(
            params: ThreadActivateSandboxParams
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>> =
            activateSandbox(params, RequestOptions.none())

        /** @see activateSandbox */
        fun activateSandbox(
            threadId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ThreadActivateSandboxResponse>> =
            activateSandbox(threadId, ThreadActivateSandboxParams.none(), requestOptions)
    }
}
