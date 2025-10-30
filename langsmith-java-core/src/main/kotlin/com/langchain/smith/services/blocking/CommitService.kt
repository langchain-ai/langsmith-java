// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.commits.CommitListParams
import com.langchain.smith.models.commits.CommitListResponse
import com.langchain.smith.models.commits.CommitManifestResponse
import com.langchain.smith.models.commits.CommitRetrieveParams
import com.langchain.smith.models.commits.CommitUpdateParams
import com.langchain.smith.models.commits.CommitUpdateResponse
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

    /** Download a repo. */
    fun retrieve(commit: String, params: CommitRetrieveParams): CommitManifestResponse =
        retrieve(commit, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        commit: String,
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitManifestResponse = retrieve(params.toBuilder().commit(commit).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommitRetrieveParams): CommitManifestResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitManifestResponse

    /** Upload a repo. */
    fun update(repo: String, params: CommitUpdateParams): CommitUpdateResponse =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: CommitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitUpdateResponse = update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: CommitUpdateParams): CommitUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitUpdateResponse

    /** Get all commits. */
    fun list(repo: String, params: CommitListParams): CommitListResponse =
        list(repo, params, RequestOptions.none())

    /** @see list */
    fun list(
        repo: String,
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListResponse = list(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see list */
    fun list(params: CommitListParams): CommitListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CommitListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CommitListResponse

    /** A view of [CommitService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/commits/{owner}/{repo}/{commit}`, but is
         * otherwise the same as [CommitService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            commit: String,
            params: CommitRetrieveParams,
        ): HttpResponseFor<CommitManifestResponse> = retrieve(commit, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            commit: String,
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitManifestResponse> =
            retrieve(params.toBuilder().commit(commit).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CommitRetrieveParams): HttpResponseFor<CommitManifestResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitManifestResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/commits/{owner}/{repo}`, but is otherwise
         * the same as [CommitService.update].
         */
        @MustBeClosed
        fun update(
            repo: String,
            params: CommitUpdateParams,
        ): HttpResponseFor<CommitUpdateResponse> = update(repo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            repo: String,
            params: CommitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitUpdateResponse> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CommitUpdateParams): HttpResponseFor<CommitUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CommitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/commits/{owner}/{repo}`, but is otherwise
         * the same as [CommitService.list].
         */
        @MustBeClosed
        fun list(repo: String, params: CommitListParams): HttpResponseFor<CommitListResponse> =
            list(repo, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            repo: String,
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListResponse> =
            list(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: CommitListParams): HttpResponseFor<CommitListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CommitListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CommitListResponse>
    }
}
