// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.repos.CreateRepoResponse
import com.langsmith_api.api.models.api.v1.repos.GetRepoResponse
import com.langsmith_api.api.models.api.v1.repos.RepoCreateParams
import com.langsmith_api.api.models.api.v1.repos.RepoDeleteParams
import com.langsmith_api.api.models.api.v1.repos.RepoDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.RepoForkParams
import com.langsmith_api.api.models.api.v1.repos.RepoListParams
import com.langsmith_api.api.models.api.v1.repos.RepoListResponse
import com.langsmith_api.api.models.api.v1.repos.RepoOptimizeJobParams
import com.langsmith_api.api.models.api.v1.repos.RepoOptimizeJobResponse
import com.langsmith_api.api.models.api.v1.repos.RepoRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.RepoUpdateParams
import com.langsmith_api.api.services.blocking.api.v1.repos.OptimizationJobService
import com.langsmith_api.api.services.blocking.api.v1.repos.TagService
import java.util.function.Consumer

interface RepoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoService

    fun tags(): TagService

    fun optimizationJobs(): OptimizationJobService

    /** Create a repo. */
    fun create(params: RepoCreateParams): CreateRepoResponse = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RepoCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse

    /** Get a repo. */
    fun retrieve(repo: String, params: RepoRetrieveParams): GetRepoResponse =
        retrieve(repo, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        repo: String,
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse = retrieve(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: RepoRetrieveParams): GetRepoResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RepoRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse

    /** Update a repo. */
    fun update(repo: String, params: RepoUpdateParams): CreateRepoResponse =
        update(repo, params, RequestOptions.none())

    /** @see update */
    fun update(
        repo: String,
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse = update(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see update */
    fun update(params: RepoUpdateParams): CreateRepoResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RepoUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreateRepoResponse

    /** Get all repos. */
    fun list(): RepoListResponse = list(RepoListParams.none())

    /** @see list */
    fun list(
        params: RepoListParams = RepoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoListResponse

    /** @see list */
    fun list(params: RepoListParams = RepoListParams.none()): RepoListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): RepoListResponse =
        list(RepoListParams.none(), requestOptions)

    /** Delete a repo. */
    fun delete(repo: String, params: RepoDeleteParams): RepoDeleteResponse =
        delete(repo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        repo: String,
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoDeleteResponse = delete(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see delete */
    fun delete(params: RepoDeleteParams): RepoDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: RepoDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoDeleteResponse

    /** Fork a repo. */
    fun fork(repo: String, params: RepoForkParams): GetRepoResponse =
        fork(repo, params, RequestOptions.none())

    /** @see fork */
    fun fork(
        repo: String,
        params: RepoForkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse = fork(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see fork */
    fun fork(params: RepoForkParams): GetRepoResponse = fork(params, RequestOptions.none())

    /** @see fork */
    fun fork(
        params: RepoForkParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): GetRepoResponse

    /** Optimize prompt */
    fun optimizeJob(params: RepoOptimizeJobParams): RepoOptimizeJobResponse =
        optimizeJob(params, RequestOptions.none())

    /** @see optimizeJob */
    fun optimizeJob(
        params: RepoOptimizeJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RepoOptimizeJobResponse

    /** A view of [RepoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): RepoService.WithRawResponse

        fun tags(): TagService.WithRawResponse

        fun optimizationJobs(): OptimizationJobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/repos`, but is otherwise the same as
         * [RepoService.create].
         */
        @MustBeClosed
        fun create(params: RepoCreateParams): HttpResponseFor<CreateRepoResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: RepoCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}`, but is otherwise the
         * same as [RepoService.retrieve].
         */
        @MustBeClosed
        fun retrieve(repo: String, params: RepoRetrieveParams): HttpResponseFor<GetRepoResponse> =
            retrieve(repo, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            repo: String,
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse> =
            retrieve(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: RepoRetrieveParams): HttpResponseFor<GetRepoResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: RepoRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoService.update].
         */
        @MustBeClosed
        fun update(repo: String, params: RepoUpdateParams): HttpResponseFor<CreateRepoResponse> =
            update(repo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            repo: String,
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse> =
            update(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: RepoUpdateParams): HttpResponseFor<CreateRepoResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: RepoUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreateRepoResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos`, but is otherwise the same as
         * [RepoService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<RepoListResponse> = list(RepoListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: RepoListParams = RepoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: RepoListParams = RepoListParams.none()
        ): HttpResponseFor<RepoListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RepoListResponse> =
            list(RepoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/repos/{owner}/{repo}`, but is otherwise
         * the same as [RepoService.delete].
         */
        @MustBeClosed
        fun delete(repo: String, params: RepoDeleteParams): HttpResponseFor<RepoDeleteResponse> =
            delete(repo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            repo: String,
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoDeleteResponse> =
            delete(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: RepoDeleteParams): HttpResponseFor<RepoDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: RepoDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/fork`, but is
         * otherwise the same as [RepoService.fork].
         */
        @MustBeClosed
        fun fork(repo: String, params: RepoForkParams): HttpResponseFor<GetRepoResponse> =
            fork(repo, params, RequestOptions.none())

        /** @see fork */
        @MustBeClosed
        fun fork(
            repo: String,
            params: RepoForkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse> =
            fork(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see fork */
        @MustBeClosed
        fun fork(params: RepoForkParams): HttpResponseFor<GetRepoResponse> =
            fork(params, RequestOptions.none())

        /** @see fork */
        @MustBeClosed
        fun fork(
            params: RepoForkParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<GetRepoResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/optimize-job`, but is otherwise the
         * same as [RepoService.optimizeJob].
         */
        @MustBeClosed
        fun optimizeJob(params: RepoOptimizeJobParams): HttpResponseFor<RepoOptimizeJobResponse> =
            optimizeJob(params, RequestOptions.none())

        /** @see optimizeJob */
        @MustBeClosed
        fun optimizeJob(
            params: RepoOptimizeJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RepoOptimizeJobResponse>
    }
}
