// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.commits.CommitManifestResponse
import com.langsmith_api.api.models.api.v1.commits.CommitRetrieveParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateParams
import com.langsmith_api.api.models.api.v1.commits.CommitUpdateResponse
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

    /** Download a repo. */
    fun retrieve(
        commit: String,
        params: CommitRetrieveParams,
    ): CompletableFuture<CommitManifestResponse> = retrieve(commit, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        commit: String,
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitManifestResponse> =
        retrieve(params.toBuilder().commit(commit).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: CommitRetrieveParams): CompletableFuture<CommitManifestResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CommitRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitManifestResponse>

    /** Upload a repo. */
    fun update(repo: String, params: CommitUpdateParams): CompletableFuture<CommitUpdateResponse> =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: CommitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitUpdateResponse> =
        update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: CommitUpdateParams): CompletableFuture<CommitUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CommitUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CommitUpdateResponse>

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
         * Returns a raw HTTP response for `get /api/v1/commits/{owner}/{repo}/{commit}`, but is
         * otherwise the same as [CommitServiceAsync.retrieve].
         */
        fun retrieve(
            commit: String,
            params: CommitRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CommitManifestResponse>> =
            retrieve(commit, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            commit: String,
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitManifestResponse>> =
            retrieve(params.toBuilder().commit(commit).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: CommitRetrieveParams
        ): CompletableFuture<HttpResponseFor<CommitManifestResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CommitRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitManifestResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/commits/{owner}/{repo}`, but is otherwise
         * the same as [CommitServiceAsync.update].
         */
        fun update(
            repo: String,
            params: CommitUpdateParams,
        ): CompletableFuture<HttpResponseFor<CommitUpdateResponse>> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        fun update(
            repo: String,
            params: CommitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitUpdateResponse>> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        fun update(
            params: CommitUpdateParams
        ): CompletableFuture<HttpResponseFor<CommitUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CommitUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CommitUpdateResponse>>
    }
}
