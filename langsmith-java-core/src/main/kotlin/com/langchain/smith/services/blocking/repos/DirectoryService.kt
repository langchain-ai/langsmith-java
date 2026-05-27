// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.directories.DirectoryCommitParams
import com.langchain.smith.models.repos.directories.DirectoryCommitResponse
import com.langchain.smith.models.repos.directories.DirectoryDeleteParams
import com.langchain.smith.models.repos.directories.DirectoryListParams
import com.langchain.smith.models.repos.directories.DirectoryListResponse
import java.util.function.Consumer

interface DirectoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService

    /**
     * Resolves the flattened file tree for an agent or skill repository at a specific commit, tag,
     * or latest.
     */
    fun list(repo: String, params: DirectoryListParams): DirectoryListResponse =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: DirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryListResponse = list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: DirectoryListParams): DirectoryListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DirectoryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryListResponse

    /** Deletes an agent or skill repository and its owned child file repositories. */
    fun delete(repo: String, params: DirectoryDeleteParams) =
        delete(repo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        repo: String,
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see delete */
    fun delete(params: DirectoryDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DirectoryDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Creates a new directory commit for an agent or skill repository by applying file/link create,
     * update, and delete operations.
     */
    fun commit(repo: String, params: DirectoryCommitParams): DirectoryCommitResponse =
        commit(repo, params, RequestOptions.none())

    /** @see commit */
    fun commit(
        repo: String,
        params: DirectoryCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryCommitResponse = commit(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see commit */
    fun commit(params: DirectoryCommitParams): DirectoryCommitResponse =
        commit(params, RequestOptions.none())

    /** @see commit */
    fun commit(
        params: DirectoryCommitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DirectoryCommitResponse

    /** A view of [DirectoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): DirectoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/platform/hub/repos/{owner}/{repo}/directories`,
         * but is otherwise the same as [DirectoryService.list].
         */
        @MustBeClosed
        fun list(
            repo: String,
            params: DirectoryListParams,
        ): HttpResponseFor<DirectoryListResponse> = list(repo, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            repo: String,
            params: DirectoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryListResponse> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: DirectoryListParams): HttpResponseFor<DirectoryListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DirectoryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryListResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/platform/hub/repos/{owner}/{repo}/directories`, but is otherwise the same as
         * [DirectoryService.delete].
         */
        @MustBeClosed
        fun delete(repo: String, params: DirectoryDeleteParams): HttpResponse =
            delete(repo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            repo: String,
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: DirectoryDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: DirectoryDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/platform/hub/repos/{owner}/{repo}/directories/commits`, but is otherwise the same as
         * [DirectoryService.commit].
         */
        @MustBeClosed
        fun commit(
            repo: String,
            params: DirectoryCommitParams,
        ): HttpResponseFor<DirectoryCommitResponse> = commit(repo, params, RequestOptions.none())

        /** @see commit */
        @MustBeClosed
        fun commit(
            repo: String,
            params: DirectoryCommitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryCommitResponse> =
            commit(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see commit */
        @MustBeClosed
        fun commit(params: DirectoryCommitParams): HttpResponseFor<DirectoryCommitResponse> =
            commit(params, RequestOptions.none())

        /** @see commit */
        @MustBeClosed
        fun commit(
            params: DirectoryCommitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DirectoryCommitResponse>
    }
}
