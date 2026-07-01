// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.issues.Issue
import com.langchain.smith.models.issues.IssueListPage
import com.langchain.smith.models.issues.IssueListParams
import com.langchain.smith.models.issues.IssueRetrieveParams
import java.util.function.Consumer

interface IssueService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IssueService

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * Returns one issue for the authenticated tenant.
     */
    fun retrieve(id: String): Issue = retrieve(id, IssueRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IssueRetrieveParams = IssueRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Issue = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: IssueRetrieveParams = IssueRetrieveParams.none()): Issue =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IssueRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Issue

    /** @see retrieve */
    fun retrieve(params: IssueRetrieveParams): Issue = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Issue =
        retrieve(id, IssueRetrieveParams.none(), requestOptions)

    /**
     * **Beta:** This endpoint is in active development and may change without notice.
     *
     * Returns issues for the authenticated tenant, optionally filtered by session, status,
     * severity, tag, or last modified time.
     */
    fun list(): IssueListPage = list(IssueListParams.none())

    /** @see list */
    fun list(
        params: IssueListParams = IssueListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IssueListPage

    /** @see list */
    fun list(params: IssueListParams = IssueListParams.none()): IssueListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): IssueListPage =
        list(IssueListParams.none(), requestOptions)

    /** A view of [IssueService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IssueService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/platform/issues/{id}`, but is otherwise the same
         * as [IssueService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Issue> = retrieve(id, IssueRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IssueRetrieveParams = IssueRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Issue> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IssueRetrieveParams = IssueRetrieveParams.none(),
        ): HttpResponseFor<Issue> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: IssueRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Issue>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: IssueRetrieveParams): HttpResponseFor<Issue> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Issue> =
            retrieve(id, IssueRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/platform/issues`, but is otherwise the same as
         * [IssueService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<IssueListPage> = list(IssueListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: IssueListParams = IssueListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IssueListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: IssueListParams = IssueListParams.none()): HttpResponseFor<IssueListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<IssueListPage> =
            list(IssueListParams.none(), requestOptions)
    }
}
