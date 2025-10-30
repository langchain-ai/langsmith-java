// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.repos

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobDeleteParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveOptimizationJobsParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobRetrieveResponse
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.OptimizationJobUpdateParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.PromptOptimizationJob
import com.langsmith_api.api.services.async.api.v1.repos.optimizationjobs.LogServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OptimizationJobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationJobServiceAsync

    fun logs(): LogServiceAsync

    /** Get a specific optimization job. */
    fun retrieve(
        jobId: String,
        params: OptimizationJobRetrieveParams,
    ): CompletableFuture<OptimizationJobRetrieveResponse> =
        retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: OptimizationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OptimizationJobRetrieveResponse> =
        retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: OptimizationJobRetrieveParams
    ): CompletableFuture<OptimizationJobRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OptimizationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OptimizationJobRetrieveResponse>

    /** Replace an existing prompt optimization job with a new, modified job. */
    fun update(
        jobId: String,
        params: OptimizationJobUpdateParams,
    ): CompletableFuture<PromptOptimizationJob> = update(jobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        jobId: String,
        params: OptimizationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJob> =
        update(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see update */
    fun update(params: OptimizationJobUpdateParams): CompletableFuture<PromptOptimizationJob> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OptimizationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJob>

    /** Delete a prompt optimization job. */
    fun delete(
        jobId: String,
        params: OptimizationJobDeleteParams,
    ): CompletableFuture<OptimizationJobDeleteResponse> =
        delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: OptimizationJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OptimizationJobDeleteResponse> =
        delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: OptimizationJobDeleteParams
    ): CompletableFuture<OptimizationJobDeleteResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OptimizationJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OptimizationJobDeleteResponse>

    /** Create a new prompt optimization job. */
    fun optimizationJobs(
        repo: String,
        params: OptimizationJobOptimizationJobsParams,
    ): CompletableFuture<PromptOptimizationJob> =
        optimizationJobs(repo, params, RequestOptions.none())

    /** @see optimizationJobs */
    fun optimizationJobs(
        repo: String,
        params: OptimizationJobOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJob> =
        optimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see optimizationJobs */
    fun optimizationJobs(
        params: OptimizationJobOptimizationJobsParams
    ): CompletableFuture<PromptOptimizationJob> = optimizationJobs(params, RequestOptions.none())

    /** @see optimizationJobs */
    fun optimizationJobs(
        params: OptimizationJobOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJob>

    /** List all prompt optimization jobs. */
    fun retrieveOptimizationJobs(
        repo: String,
        params: OptimizationJobRetrieveOptimizationJobsParams,
    ): CompletableFuture<List<PromptOptimizationJob>> =
        retrieveOptimizationJobs(repo, params, RequestOptions.none())

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        repo: String,
        params: OptimizationJobRetrieveOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptOptimizationJob>> =
        retrieveOptimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        params: OptimizationJobRetrieveOptimizationJobsParams
    ): CompletableFuture<List<PromptOptimizationJob>> =
        retrieveOptimizationJobs(params, RequestOptions.none())

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        params: OptimizationJobRetrieveOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptOptimizationJob>>

    /**
     * A view of [OptimizationJobServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptimizationJobServiceAsync.WithRawResponse

        fun logs(): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobServiceAsync.retrieve].
         */
        fun retrieve(
            jobId: String,
            params: OptimizationJobRetrieveParams,
        ): CompletableFuture<HttpResponseFor<OptimizationJobRetrieveResponse>> =
            retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            jobId: String,
            params: OptimizationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OptimizationJobRetrieveResponse>> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: OptimizationJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<OptimizationJobRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: OptimizationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OptimizationJobRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobServiceAsync.update].
         */
        fun update(
            jobId: String,
            params: OptimizationJobUpdateParams,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            update(jobId, params, RequestOptions.none())

        /** @see update */
        fun update(
            jobId: String,
            params: OptimizationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            update(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see update */
        fun update(
            params: OptimizationJobUpdateParams
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: OptimizationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobServiceAsync.delete].
         */
        fun delete(
            jobId: String,
            params: OptimizationJobDeleteParams,
        ): CompletableFuture<HttpResponseFor<OptimizationJobDeleteResponse>> =
            delete(jobId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            jobId: String,
            params: OptimizationJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OptimizationJobDeleteResponse>> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: OptimizationJobDeleteParams
        ): CompletableFuture<HttpResponseFor<OptimizationJobDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: OptimizationJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OptimizationJobDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/optimization-jobs`,
         * but is otherwise the same as [OptimizationJobServiceAsync.optimizationJobs].
         */
        fun optimizationJobs(
            repo: String,
            params: OptimizationJobOptimizationJobsParams,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            optimizationJobs(repo, params, RequestOptions.none())

        /** @see optimizationJobs */
        fun optimizationJobs(
            repo: String,
            params: OptimizationJobOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            optimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see optimizationJobs */
        fun optimizationJobs(
            params: OptimizationJobOptimizationJobsParams
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>> =
            optimizationJobs(params, RequestOptions.none())

        /** @see optimizationJobs */
        fun optimizationJobs(
            params: OptimizationJobOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJob>>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/optimization-jobs`, but
         * is otherwise the same as [OptimizationJobServiceAsync.retrieveOptimizationJobs].
         */
        fun retrieveOptimizationJobs(
            repo: String,
            params: OptimizationJobRetrieveOptimizationJobsParams,
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJob>>> =
            retrieveOptimizationJobs(repo, params, RequestOptions.none())

        /** @see retrieveOptimizationJobs */
        fun retrieveOptimizationJobs(
            repo: String,
            params: OptimizationJobRetrieveOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJob>>> =
            retrieveOptimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieveOptimizationJobs */
        fun retrieveOptimizationJobs(
            params: OptimizationJobRetrieveOptimizationJobsParams
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJob>>> =
            retrieveOptimizationJobs(params, RequestOptions.none())

        /** @see retrieveOptimizationJobs */
        fun retrieveOptimizationJobs(
            params: OptimizationJobRetrieveOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJob>>>
    }
}
