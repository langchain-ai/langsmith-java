// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.info.InfoListParams
import com.langchain.smith.models.info.InfoListResponse
import com.langchain.smith.models.info.InfoRetrieveHealthParams
import com.langchain.smith.models.info.InfoRetrieveHealthResponse
import java.util.function.Consumer

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService

    /** Get information about the current deployment of LangSmith. */
    fun list(): InfoListResponse = list(InfoListParams.none())

    /** @see list */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoListResponse

    /** @see list */
    fun list(params: InfoListParams = InfoListParams.none()): InfoListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): InfoListResponse =
        list(InfoListParams.none(), requestOptions)

    /** Get health information about the current deployment of LangSmith. */
    fun retrieveHealth(): InfoRetrieveHealthResponse =
        retrieveHealth(InfoRetrieveHealthParams.none())

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InfoRetrieveHealthResponse

    /** @see retrieveHealth */
    fun retrieveHealth(
        params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none()
    ): InfoRetrieveHealthResponse = retrieveHealth(params, RequestOptions.none())

    /** @see retrieveHealth */
    fun retrieveHealth(requestOptions: RequestOptions): InfoRetrieveHealthResponse =
        retrieveHealth(InfoRetrieveHealthParams.none(), requestOptions)

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/info`, but is otherwise the same as
         * [InfoService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<InfoListResponse> = list(InfoListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InfoListParams = InfoListParams.none()
        ): HttpResponseFor<InfoListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InfoListResponse> =
            list(InfoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/info/health`, but is otherwise the same as
         * [InfoService.retrieveHealth].
         */
        @MustBeClosed
        fun retrieveHealth(): HttpResponseFor<InfoRetrieveHealthResponse> =
            retrieveHealth(InfoRetrieveHealthParams.none())

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InfoRetrieveHealthResponse>

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            params: InfoRetrieveHealthParams = InfoRetrieveHealthParams.none()
        ): HttpResponseFor<InfoRetrieveHealthResponse> =
            retrieveHealth(params, RequestOptions.none())

        /** @see retrieveHealth */
        @MustBeClosed
        fun retrieveHealth(
            requestOptions: RequestOptions
        ): HttpResponseFor<InfoRetrieveHealthResponse> =
            retrieveHealth(InfoRetrieveHealthParams.none(), requestOptions)
    }
}
