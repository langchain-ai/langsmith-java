// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.CreateRepoResponse
import com.langchain.smith.models.repos.GetRepoResponse
import com.langchain.smith.models.repos.RepoCreateParams
import com.langchain.smith.models.repos.RepoDeleteParams
import com.langchain.smith.models.repos.RepoDeleteResponse
import com.langchain.smith.models.repos.RepoForkParams
import com.langchain.smith.models.repos.RepoListParams
import com.langchain.smith.models.repos.RepoListResponse
import com.langchain.smith.models.repos.RepoOptimizeJobParams
import com.langchain.smith.models.repos.RepoOptimizeJobResponse
import com.langchain.smith.models.repos.RepoRetrieveParams
import com.langchain.smith.models.repos.RepoUpdateParams
import com.langchain.smith.services.async.repos.TagServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RepoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoServiceAsync

    fun tags(): TagServiceAsync

    /** Create a repo. */
    fun create(params: RepoCreateParams): CompletableFuture<CreateRepoResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RepoCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateRepoResponse>

    /** Get a repo. */
    fun retrieve(repo: String, params: RepoRetrieveParams): CompletableFuture<GetRepoResponse> =
        retrieve(repo, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        repo: String,
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GetRepoResponse> =
        retrieve(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RepoRetrieveParams): CompletableFuture<GetRepoResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GetRepoResponse>

    /** Update a repo. */
    fun update(repo: String, params: RepoUpdateParams): CompletableFuture<CreateRepoResponse> =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateRepoResponse> =
        update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: RepoUpdateParams): CompletableFuture<CreateRepoResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreateRepoResponse>

    /** Get all repos. */
    fun list(): CompletableFuture<RepoListResponse> = list(RepoListParams.none())

    /** @see list */
    fun list(
        params: RepoListParams = RepoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoListResponse>

    /** @see list */
    fun list(params: RepoListParams = RepoListParams.none()): CompletableFuture<RepoListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RepoListResponse> =
        list(RepoListParams.none(), requestOptions)

    /** Delete a repo. */
    fun delete(repo: String, params: RepoDeleteParams): CompletableFuture<RepoDeleteResponse> =
        delete(repo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        repo: String,
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoDeleteResponse> =
        delete(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see delete */
    fun delete(params: RepoDeleteParams): CompletableFuture<RepoDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoDeleteResponse>

    /** Fork a repo. */
    fun fork(repo: String, params: RepoForkParams): CompletableFuture<GetRepoResponse> =
        fork(repo, params, RequestOptions.none())

    /** @see fork */
    fun fork(
        repo: String,
        params: RepoForkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GetRepoResponse> =
        fork(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see fork */
    fun fork(params: RepoForkParams): CompletableFuture<GetRepoResponse> =
        fork(params, RequestOptions.none())

    /** @see fork */
    fun fork(
        params: RepoForkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GetRepoResponse>

    /** Optimize prompt */
    fun optimizeJob(params: RepoOptimizeJobParams): CompletableFuture<RepoOptimizeJobResponse> =
        optimizeJob(params, RequestOptions.none())

    /** @see optimizeJob */
    fun optimizeJob(
        params: RepoOptimizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RepoOptimizeJobResponse>

    /** A view of [RepoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoServiceAsync.WithRawResponse

        fun tags(): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/repos`, but is otherwise the same as
         * [RepoServiceAsync.create].
         */
        fun create(
            params: RepoCreateParams
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RepoCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}`, but is otherwise the
         * same as [RepoServiceAsync.retrieve].
         */
        fun retrieve(
            repo: String,
            params: RepoRetrieveParams,
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            retrieve(repo, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            repo: String,
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            retrieve(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: RepoRetrieveParams
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoServiceAsync.update].
         */
        fun update(
            repo: String,
            params: RepoUpdateParams,
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        fun update(
            repo: String,
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        fun update(
            params: RepoUpdateParams
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreateRepoResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos`, but is otherwise the same as
         * [RepoServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RepoListResponse>> =
            list(RepoListParams.none())

        /** @see list */
        fun list(
            params: RepoListParams = RepoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoListResponse>>

        /** @see list */
        fun list(
            params: RepoListParams = RepoListParams.none()
        ): CompletableFuture<HttpResponseFor<RepoListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RepoListResponse>> =
            list(RepoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoServiceAsync.delete].
         */
        fun delete(
            repo: String,
            params: RepoDeleteParams,
        ): CompletableFuture<HttpResponseFor<RepoDeleteResponse>> =
            delete(repo, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            repo: String,
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoDeleteResponse>> =
            delete(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: RepoDeleteParams
        ): CompletableFuture<HttpResponseFor<RepoDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/fork`, but is
         * otherwise the same as [RepoServiceAsync.fork].
         */
        fun fork(
            repo: String,
            params: RepoForkParams,
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            fork(repo, params, RequestOptions.none())

        /** @see fork */
        fun fork(
            repo: String,
            params: RepoForkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            fork(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see fork */
        fun fork(params: RepoForkParams): CompletableFuture<HttpResponseFor<GetRepoResponse>> =
            fork(params, RequestOptions.none())

        /** @see fork */
        fun fork(
            params: RepoForkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GetRepoResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/optimize-job`, but is otherwise the
         * same as [RepoServiceAsync.optimizeJob].
         */
        fun optimizeJob(
            params: RepoOptimizeJobParams
        ): CompletableFuture<HttpResponseFor<RepoOptimizeJobResponse>> =
            optimizeJob(params, RequestOptions.none())

        /** @see optimizeJob */
        fun optimizeJob(
            params: RepoOptimizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RepoOptimizeJobResponse>>
    }
}
