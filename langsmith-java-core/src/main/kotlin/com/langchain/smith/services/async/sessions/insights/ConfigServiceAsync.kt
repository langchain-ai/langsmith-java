// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions.insights

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateParams
import com.langchain.smith.models.sessions.insights.configs.ConfigCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ConfigServiceAsync

    /** Save an insights job config. */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
    ): CompletableFuture<ConfigCreateResponse> = create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigCreateResponse> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ConfigCreateParams): CompletableFuture<ConfigCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ConfigCreateResponse>

    /**
     * A view of [ConfigServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/insights/configs`,
         * but is otherwise the same as [ConfigServiceAsync.create].
         */
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: String,
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: ConfigCreateParams
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ConfigCreateResponse>>
    }
}
