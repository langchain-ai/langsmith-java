// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.commits.CommitManifestResponse
import com.langsmith_api.api.models.api.v1.commits.CommitRetrieveParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateResponse
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
    }
}
