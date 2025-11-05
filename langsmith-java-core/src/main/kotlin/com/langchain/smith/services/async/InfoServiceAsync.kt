// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.info.InfoListParams
import com.langchain.smith.models.info.InfoListResponse
import com.langchain.smith.models.info.InfoRetrieveHealthParams
import com.langchain.smith.models.info.InfoRetrieveHealthResponse
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

    /** Get health information about the current deployment of LangSmith. */
    fun retrieveHealth(): CompletableFuture<InfoRetrieveHealthResponse> =
        retrieveHealth(InfoRetrieveHealthParams.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InfoRetrieveHealthResponse>

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none()
    ): CompletableFuture<InfoRetrieveHealthResponse> = retrieveHealth(params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        requestOptions: RequestOptions
    ): CompletableFuture<InfoRetrieveHealthResponse> =
        retrieveHealth(InfoRetrieveHealthParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `get /api/v1/info/health`, but is otherwise the same as
         * [InfoServiceAsync.retrieveHealth].
         */
        fun retrieveHealth(): CompletableFuture<HttpResponseFor<InfoRetrieveHealthResponse>> =
            retrieveHealth(InfoRetrieveHealthParams.none())

        /** @see retrieveHealth */
        fun retrieveHealth(
            params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InfoRetrieveHealthResponse>>

        /** @see retrieveHealth */
        fun retrieveHealth(
            params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none()
        ): CompletableFuture<HttpResponseFor<InfoRetrieveHealthResponse>> =
            retrieveHealth(params, RequestOptions.none())

        /** @see retrieveHealth */
        fun retrieveHealth(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<InfoRetrieveHealthResponse>> =
            retrieveHealth(InfoRetrieveHealthParams.none(), requestOptions)
    }
}
