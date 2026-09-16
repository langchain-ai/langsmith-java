// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.fleet

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.fleet.threads.ThreadActivateSandboxParams
import com.langchain.smith.models.fleet.threads.ThreadActivateSandboxResponse
import java.util.function.Consumer

interface ThreadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService

    /**
     * Starts or resumes the sandbox referenced by the thread and returns when it is ready. The
     * operation is idempotent. The thread must include sandbox.sandbox_slug.
     */
    fun activateSandbox(threadId: String): ThreadActivateSandboxResponse =
        activateSandbox(threadId, ThreadActivateSandboxParams.none())

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadActivateSandboxResponse =
        activateSandbox(params.toBuilder().threadId(threadId).build(), requestOptions)

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
    ): ThreadActivateSandboxResponse = activateSandbox(threadId, params, RequestOptions.none())

    /** @see activateSandbox */
    fun activateSandbox(
        params: ThreadActivateSandboxParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ThreadActivateSandboxResponse

    /** @see activateSandbox */
    fun activateSandbox(params: ThreadActivateSandboxParams): ThreadActivateSandboxResponse =
        activateSandbox(params, RequestOptions.none())

    /** @see activateSandbox */
    fun activateSandbox(
        threadId: String,
        requestOptions: RequestOptions,
    ): ThreadActivateSandboxResponse =
        activateSandbox(threadId, ThreadActivateSandboxParams.none(), requestOptions)

    /** A view of [ThreadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/fleet/threads/{thread_id}/sandbox-activation`,
         * but is otherwise the same as [ThreadService.activateSandbox].
         */
        @MustBeClosed
        fun activateSandbox(threadId: String): HttpResponseFor<ThreadActivateSandboxResponse> =
            activateSandbox(threadId, ThreadActivateSandboxParams.none())

        /** @see activateSandbox */
        @MustBeClosed
        fun activateSandbox(
            threadId: String,
            params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadActivateSandboxResponse> =
            activateSandbox(params.toBuilder().threadId(threadId).build(), requestOptions)

        /** @see activateSandbox */
        @MustBeClosed
        fun activateSandbox(
            threadId: String,
            params: ThreadActivateSandboxParams = ThreadActivateSandboxParams.none(),
        ): HttpResponseFor<ThreadActivateSandboxResponse> =
            activateSandbox(threadId, params, RequestOptions.none())

        /** @see activateSandbox */
        @MustBeClosed
        fun activateSandbox(
            params: ThreadActivateSandboxParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ThreadActivateSandboxResponse>

        /** @see activateSandbox */
        @MustBeClosed
        fun activateSandbox(
            params: ThreadActivateSandboxParams
        ): HttpResponseFor<ThreadActivateSandboxResponse> =
            activateSandbox(params, RequestOptions.none())

        /** @see activateSandbox */
        @MustBeClosed
        fun activateSandbox(
            threadId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ThreadActivateSandboxResponse> =
            activateSandbox(threadId, ThreadActivateSandboxParams.none(), requestOptions)
    }
}
