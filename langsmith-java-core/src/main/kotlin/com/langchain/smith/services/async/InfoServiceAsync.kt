// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.info.InfoListParams
import com.langchain.smith.models.info.InfoListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync

    /** Get information about the current deployment of LangSmith. */
    fun list(): CompletableFuture<InfoListResponse> = list(InfoListParams.none())

    /** @see list */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoListResponse>

    /** @see list */
    fun list(params: InfoListParams = InfoListParams.none()): CompletableFuture<InfoListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<InfoListResponse> =
        list(InfoListParams.none(), requestOptions)

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/info`, but is otherwise the same as
         * [InfoServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(InfoListParams.none())

        /** @see list */
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoListResponse>>

        /** @see list */
        fun list(
            params: InfoListParams = InfoListParams.none()
        ): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InfoListResponse>> =
            list(InfoListParams.none(), requestOptions)
    }
}
