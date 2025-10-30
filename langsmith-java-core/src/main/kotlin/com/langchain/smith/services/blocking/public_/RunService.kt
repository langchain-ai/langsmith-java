// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.public_

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.public_.runs.RunListParams
import com.langchain.smith.models.public_.runs.RunPublicSchema
import com.langchain.smith.models.public_.runs.RunQueryParams
import com.langchain.smith.models.public_.runs.RunQueryResponse
import com.langchain.smith.models.public_.runs.RunRetrieveParams
import java.util.function.Consumer

interface RunService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService

    /** Get the shared run. */
    fun retrieve(id: String, params: RunRetrieveParams): RunPublicSchema =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicSchema = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RunRetrieveParams): RunPublicSchema =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RunRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicSchema

    /** Get the shared run. */
    fun list(shareToken: String): RunPublicSchema = list(shareToken, RunListParams.none())

    /** @see list */
    fun list(
        shareToken: String,
        params: RunListParams = RunListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicSchema = list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see list */
    fun list(shareToken: String, params: RunListParams = RunListParams.none()): RunPublicSchema =
        list(shareToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: RunListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunPublicSchema

    /** @see list */
    fun list(params: RunListParams): RunPublicSchema = list(params, RequestOptions.none())

    /** @see list */
    fun list(shareToken: String, requestOptions: RequestOptions): RunPublicSchema =
        list(shareToken, RunListParams.none(), requestOptions)

    /** Get run by ids or the shared run if not specifed. */
    fun query(shareToken: String): RunQueryResponse = query(shareToken, RunQueryParams.none())

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse = query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

    /** @see query */
    fun query(
        shareToken: String,
        params: RunQueryParams = RunQueryParams.none(),
    ): RunQueryResponse = query(shareToken, params, RequestOptions.none())

    /** @see query */
    fun query(
        params: RunQueryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RunQueryResponse

    /** @see query */
    fun query(params: RunQueryParams): RunQueryResponse = query(params, RequestOptions.none())

    /** @see query */
    fun query(shareToken: String, requestOptions: RequestOptions): RunQueryResponse =
        query(shareToken, RunQueryParams.none(), requestOptions)

    /** A view of [RunService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RunService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/run/{id}`, but is
         * otherwise the same as [RunService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String, params: RunRetrieveParams): HttpResponseFor<RunPublicSchema> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicSchema> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RunRetrieveParams): HttpResponseFor<RunPublicSchema> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RunRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicSchema>

        /**
         * Returns a raw HTTP response for `get /api/v1/public/{share_token}/run`, but is otherwise
         * the same as [RunService.list].
         */
        @MustBeClosed
        fun list(shareToken: String): HttpResponseFor<RunPublicSchema> =
            list(shareToken, RunListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: RunListParams = RunListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicSchema> =
            list(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            params: RunListParams = RunListParams.none(),
        ): HttpResponseFor<RunPublicSchema> = list(shareToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RunListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunPublicSchema>

        /** @see list */
        @MustBeClosed
        fun list(params: RunListParams): HttpResponseFor<RunPublicSchema> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunPublicSchema> = list(shareToken, RunListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/public/{share_token}/runs/query`, but is
         * otherwise the same as [RunService.query].
         */
        @MustBeClosed
        fun query(shareToken: String): HttpResponseFor<RunQueryResponse> =
            query(shareToken, RunQueryParams.none())

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse> =
            query(params.toBuilder().shareToken(shareToken).build(), requestOptions)

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            params: RunQueryParams = RunQueryParams.none(),
        ): HttpResponseFor<RunQueryResponse> = query(shareToken, params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            params: RunQueryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RunQueryResponse>

        /** @see query */
        @MustBeClosed
        fun query(params: RunQueryParams): HttpResponseFor<RunQueryResponse> =
            query(params, RequestOptions.none())

        /** @see query */
        @MustBeClosed
        fun query(
            shareToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RunQueryResponse> =
            query(shareToken, RunQueryParams.none(), requestOptions)
    }
}
