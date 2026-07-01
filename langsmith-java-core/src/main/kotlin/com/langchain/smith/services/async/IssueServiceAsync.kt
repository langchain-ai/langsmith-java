// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.issues.Issue
import com.langchain.smith.models.issues.IssueListPageAsync
import com.langchain.smith.models.issues.IssueListParams
import com.langchain.smith.models.issues.IssueRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IssueServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IssueServiceAsync

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * Returns one issue for the authenticated tenant.
     */
    fun retrieve(id: String): CompletableFuture<Issue> = retrieve(id, IssueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IssueRetrieveParams = IssueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Issue> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IssueRetrieveParams = IssueRetrieveParams.none(),
    ): CompletableFuture<Issue> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IssueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Issue>

    /** @see retrieve */
    fun retrieve(params: IssueRetrieveParams): CompletableFuture<Issue> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Issue> =
        retrieve(id, IssueRetrieveParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * Returns issues for the authenticated tenant, optionally filtered by session, status,
     * severity, tag, or last modified time.
     */
    fun list(): CompletableFuture<IssueListPageAsync> = list(IssueListParams.none())

    /** @see list */
    fun list(
        params: IssueListParams = IssueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IssueListPageAsync>

    /** @see list */
    fun list(
        params: IssueListParams = IssueListParams.none()
    ): CompletableFuture<IssueListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<IssueListPageAsync> =
        list(IssueListParams.none(), requestOptions)

    /** A view of [IssueServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IssueServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/platform/issues/{id}`, but is otherwise the same
         * as [IssueServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Issue>> =
            retrieve(id, IssueRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IssueRetrieveParams = IssueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Issue>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IssueRetrieveParams = IssueRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Issue>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IssueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Issue>>

        /** @see retrieve */
        fun retrieve(params: IssueRetrieveParams): CompletableFuture<HttpResponseFor<Issue>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Issue>> =
            retrieve(id, IssueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/platform/issues`, but is otherwise the same as
         * [IssueServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IssueListPageAsync>> =
            list(IssueListParams.none())

        /** @see list */
        fun list(
            params: IssueListParams = IssueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IssueListPageAsync>>

        /** @see list */
        fun list(
            params: IssueListParams = IssueListParams.none()
        ): CompletableFuture<HttpResponseFor<IssueListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IssueListPageAsync>> =
            list(IssueListParams.none(), requestOptions)
    }
}
