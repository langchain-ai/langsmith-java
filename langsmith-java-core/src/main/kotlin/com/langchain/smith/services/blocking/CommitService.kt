// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.commits.CommitCreateResponse
import com.langchain.smith.models.commits.CommitListPage
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitRetrieveResponse
import java.util.function.Consumer

interface CommitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService

    /**
     * Creates a new commit in a repository. Requires authentication and write access to the
     * repository.
     */
    fun create(repo: JsonValue, params: CommitCreateParams): CommitCreateResponse =
        create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: JsonValue,
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitCreateResponse = create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: CommitCreateParams): CommitCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitCreateResponse

    /**
     * Retrieves a specific commit by hash, tag, or "latest" for a repository. This endpoint
     * supports both authenticated and unauthenticated access. Authenticated users can access
     * private repos, while unauthenticated users can only access public repos. Commit resolution
     * logic:
     * - "latest" or empty: Get the most recent commit
     * - Less than 8 characters: Only check for tags
     * - 8 or more characters: Prioritize commit hash over tag, check both
     */
    fun retrieve(commit: JsonValue, params: CommitRetrieveParams): CommitRetrieveResponse =
        retrieve(commit, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        commit: JsonValue,
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitRetrieveResponse = retrieve(params.toBuilder().commit(commit).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommitRetrieveParams): CommitRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitRetrieveResponse

    /**
     * Lists all commits for a repository with pagination support. This endpoint supports both
     * authenticated and unauthenticated access. Authenticated users can access private repos, while
     * unauthenticated users can only access public repos. The include_stats parameter controls
     * whether download and view statistics are computed (defaults to true).
     */
    fun list(repo: JsonValue, params: CommitListParams): CommitListPage =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: JsonValue,
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListPage = list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: CommitListParams): CommitListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListPage

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /commits/{owner}/{repo}`, but is otherwise the same
         * as [CommitService.create].
         */
        @MustBeClosed
        fun create(
            repo: JsonValue,
            params: CommitCreateParams,
        ): HttpResponseFor<CommitCreateResponse> = create(repo, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            repo: JsonValue,
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitCreateResponse> =
            create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: CommitCreateParams): HttpResponseFor<CommitCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /commits/{owner}/{repo}/{commit}`, but is otherwise
         * the same as [CommitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            commit: JsonValue,
            params: CommitRetrieveParams,
        ): HttpResponseFor<CommitRetrieveResponse> = retrieve(commit, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            commit: JsonValue,
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(params.toBuilder().commit(commit).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommitRetrieveParams): HttpResponseFor<CommitRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /commits/{owner}/{repo}`, but is otherwise the same
         * as [CommitService.list].
         */
        @MustBeClosed
        fun list(repo: JsonValue, params: CommitListParams): HttpResponseFor<CommitListPage> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            repo: JsonValue,
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListPage> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: CommitListParams): HttpResponseFor<CommitListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListPage>
    }
}
