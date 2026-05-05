// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.repos

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.directories.DirectoryCommitParams
import com.langchain.smith.models.repos.directories.DirectoryCommitResponse
import com.langchain.smith.models.repos.directories.DirectoryDeleteParams
import com.langchain.smith.models.repos.directories.DirectoryListParams
import com.langchain.smith.models.repos.directories.DirectoryListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DirectoryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryServiceAsync

    /**
     * Resolves the flattened file tree for an agent or skill repository at a specific commit, tag,
     * or latest.
     */
    fun list(repo: String, params: DirectoryListParams): CompletableFuture<DirectoryListResponse> =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: DirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryListResponse> =
        list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: DirectoryListParams): CompletableFuture<DirectoryListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryListResponse>

    /** Deletes an agent or skill repository and its owned child file repositories. */
    fun delete(repo: String, params: DirectoryDeleteParams): CompletableFuture<Void?> =
        delete(repo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        repo: String,
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see delete */
    fun delete(params: DirectoryDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Creates a new directory commit for an agent or skill repository by applying file/link create,
     * update, and delete operations.
     */
    fun commit(
        repo: String,
        params: DirectoryCommitParams,
    ): CompletableFuture<DirectoryCommitResponse> = commit(repo, params, RequestOptions.none())

    /** @see commit */
    fun commit(
        repo: String,
        params: DirectoryCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryCommitResponse> =
        commit(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see commit */
    fun commit(params: DirectoryCommitParams): CompletableFuture<DirectoryCommitResponse> =
        commit(params, RequestOptions.none())

    /** @see commit */
    fun commit(
        params: DirectoryCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DirectoryCommitResponse>

    /**
     * A view of [DirectoryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DirectoryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/platform/hub/repos/{owner}/{repo}/directories`,
         * but is otherwise the same as [DirectoryServiceAsync.list].
         */
        fun list(
            repo: String,
            params: DirectoryListParams,
        ): CompletableFuture<HttpResponseFor<DirectoryListResponse>> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        fun list(
            repo: String,
            params: DirectoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryListResponse>> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        fun list(
            params: DirectoryListParams
        ): CompletableFuture<HttpResponseFor<DirectoryListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DirectoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryListResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/hub/repos/{owner}/{repo}/directories`, but is otherwise the same as
         * [DirectoryServiceAsync.delete].
         */
        fun delete(repo: String, params: DirectoryDeleteParams): CompletableFuture<HttpResponse> =
            delete(repo, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            repo: String,
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see delete */
        fun delete(params: DirectoryDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/platform/hub/repos/{owner}/{repo}/directories/commits`, but is otherwise the same as
         * [DirectoryServiceAsync.commit].
         */
        fun commit(
            repo: String,
            params: DirectoryCommitParams,
        ): CompletableFuture<HttpResponseFor<DirectoryCommitResponse>> =
            commit(repo, params, RequestOptions.none())

        /** @see commit */
        fun commit(
            repo: String,
            params: DirectoryCommitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryCommitResponse>> =
            commit(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see commit */
        fun commit(
            params: DirectoryCommitParams
        ): CompletableFuture<HttpResponseFor<DirectoryCommitResponse>> =
            commit(params, RequestOptions.none())

        /** @see commit */
        fun commit(
            params: DirectoryCommitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DirectoryCommitResponse>>
    }
}
