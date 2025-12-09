// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.JsonValue
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.commits.CommitCreateParams
import com.langchain.smith.models.commits.CommitCreateResponse
import com.langchain.smith.models.commits.CommitListPageAsync
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CommitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitServiceAsync

    /**
     * Creates a new commit in a repository. Requires authentication and write access to the
     * repository.
     */
    fun create(
        repo: JsonValue,
        params: CommitCreateParams,
    ): CompletableFuture<CommitCreateResponse> = create(repo, params, RequestOptions.none())

    /** @see create */
    fun create(
        repo: JsonValue,
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitCreateResponse> =
        create(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see create */
    fun create(params: CommitCreateParams): CompletableFuture<CommitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitCreateResponse>

    /**
     * Retrieves a specific commit by hash, tag, or "latest" for a repository. This endpoint
     * supports both authenticated and unauthenticated access. Authenticated users can access
     * private repos, while unauthenticated users can only access public repos. Commit resolution
     * logic:
     * - "latest" or empty: Get the most recent commit
     * - Less than 8 characters: Only check for tags
     * - 8 or more characters: Prioritize commit hash over tag, check both
     */
    fun retrieve(
        commit: JsonValue,
        params: CommitRetrieveParams,
    ): CompletableFuture<CommitRetrieveResponse> = retrieve(commit, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        commit: JsonValue,
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse> =
        retrieve(params.toBuilder().commit(commit).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommitRetrieveParams): CompletableFuture<CommitRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitRetrieveResponse>

    /**
     * Lists all commits for a repository with pagination support. This endpoint supports both
     * authenticated and unauthenticated access. Authenticated users can access private repos, while
     * unauthenticated users can only access public repos.
     */
    fun list(repo: JsonValue, params: CommitListParams): CompletableFuture<CommitListPageAsync> =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: JsonValue,
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitListPageAsync> =
        list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: CommitListParams): CompletableFuture<CommitListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitListPageAsync>

    /**
     * A view of [CommitServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /commits/{owner}/{repo}`, but is otherwise the same
         * as [CommitServiceAsync.create].
         */
        fun create(
            repo: JsonValue,
            params: CommitCreateParams,
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(repo, params, RequestOptions.none())

        /** @see create */
        fun create(
            repo: JsonValue,
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see create */
        fun create(
            params: CommitCreateParams
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CommitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /commits/{owner}/{repo}/{commit}`, but is otherwise
         * the same as [CommitServiceAsync.retrieve].
         */
        fun retrieve(
            commit: JsonValue,
            params: CommitRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(commit, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            commit: JsonValue,
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(params.toBuilder().commit(commit).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CommitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /commits/{owner}/{repo}`, but is otherwise the same
         * as [CommitServiceAsync.list].
         */
        fun list(
            repo: JsonValue,
            params: CommitListParams,
        ): CompletableFuture<HttpResponseFor<CommitListPageAsync>> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        fun list(
            repo: JsonValue,
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitListPageAsync>> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        fun list(
            params: CommitListParams
        ): CompletableFuture<HttpResponseFor<CommitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitListPageAsync>>
    }
}
