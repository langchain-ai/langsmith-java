// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.repos

import com.google.errorprone.annotations.MustBeClosed
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
import com.langsmith_api.api.services.blocking.api.v1.repos.optimizationjobs.LogService
import java.util.function.Consumer

interface OptimizationJobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptimizationJobService

    fun logs(): LogService

    /** Get a specific optimization job. */
    fun retrieve(
        jobId: String,
        params: OptimizationJobRetrieveParams,
    ): OptimizationJobRetrieveResponse = retrieve(jobId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        jobId: String,
        params: OptimizationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptimizationJobRetrieveResponse =
        retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: OptimizationJobRetrieveParams): OptimizationJobRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: OptimizationJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptimizationJobRetrieveResponse

    /** Replace an existing prompt optimization job with a new, modified job. */
    fun update(jobId: String, params: OptimizationJobUpdateParams): PromptOptimizationJob =
        update(jobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        jobId: String,
        params: OptimizationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJob = update(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see update */
    fun update(params: OptimizationJobUpdateParams): PromptOptimizationJob =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: OptimizationJobUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJob

    /** Delete a prompt optimization job. */
    fun delete(jobId: String, params: OptimizationJobDeleteParams): OptimizationJobDeleteResponse =
        delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: OptimizationJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptimizationJobDeleteResponse =
        delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(params: OptimizationJobDeleteParams): OptimizationJobDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: OptimizationJobDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OptimizationJobDeleteResponse

    /** Create a new prompt optimization job. */
    fun optimizationJobs(
        repo: String,
        params: OptimizationJobOptimizationJobsParams,
    ): PromptOptimizationJob = optimizationJobs(repo, params, RequestOptions.none())

    /** @see optimizationJobs */
    fun optimizationJobs(
        repo: String,
        params: OptimizationJobOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJob =
        optimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see optimizationJobs */
    fun optimizationJobs(params: OptimizationJobOptimizationJobsParams): PromptOptimizationJob =
        optimizationJobs(params, RequestOptions.none())

    /** @see optimizationJobs */
    fun optimizationJobs(
        params: OptimizationJobOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJob

    /** List all prompt optimization jobs. */
    fun retrieveOptimizationJobs(
        repo: String,
        params: OptimizationJobRetrieveOptimizationJobsParams,
    ): List<PromptOptimizationJob> = retrieveOptimizationJobs(repo, params, RequestOptions.none())

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        repo: String,
        params: OptimizationJobRetrieveOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PromptOptimizationJob> =
        retrieveOptimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        params: OptimizationJobRetrieveOptimizationJobsParams
    ): List<PromptOptimizationJob> = retrieveOptimizationJobs(params, RequestOptions.none())

    /** @see retrieveOptimizationJobs */
    fun retrieveOptimizationJobs(
        params: OptimizationJobRetrieveOptimizationJobsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PromptOptimizationJob>

    /**
     * A view of [OptimizationJobService] that provides access to raw HTTP responses for each
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
        ): OptimizationJobService.WithRawResponse

        fun logs(): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: OptimizationJobRetrieveParams,
        ): HttpResponseFor<OptimizationJobRetrieveResponse> =
            retrieve(jobId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            jobId: String,
            params: OptimizationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptimizationJobRetrieveResponse> =
            retrieve(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OptimizationJobRetrieveParams
        ): HttpResponseFor<OptimizationJobRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OptimizationJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptimizationJobRetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobService.update].
         */
        @MustBeClosed
        fun update(
            jobId: String,
            params: OptimizationJobUpdateParams,
        ): HttpResponseFor<PromptOptimizationJob> = update(jobId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            jobId: String,
            params: OptimizationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJob> =
            update(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: OptimizationJobUpdateParams): HttpResponseFor<PromptOptimizationJob> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: OptimizationJobUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJob>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}`, but is otherwise the same as
         * [OptimizationJobService.delete].
         */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: OptimizationJobDeleteParams,
        ): HttpResponseFor<OptimizationJobDeleteResponse> =
            delete(jobId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: OptimizationJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptimizationJobDeleteResponse> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OptimizationJobDeleteParams
        ): HttpResponseFor<OptimizationJobDeleteResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: OptimizationJobDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OptimizationJobDeleteResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/repos/{owner}/{repo}/optimization-jobs`,
         * but is otherwise the same as [OptimizationJobService.optimizationJobs].
         */
        @MustBeClosed
        fun optimizationJobs(
            repo: String,
            params: OptimizationJobOptimizationJobsParams,
        ): HttpResponseFor<PromptOptimizationJob> =
            optimizationJobs(repo, params, RequestOptions.none())

        /** @see optimizationJobs */
        @MustBeClosed
        fun optimizationJobs(
            repo: String,
            params: OptimizationJobOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJob> =
            optimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see optimizationJobs */
        @MustBeClosed
        fun optimizationJobs(
            params: OptimizationJobOptimizationJobsParams
        ): HttpResponseFor<PromptOptimizationJob> = optimizationJobs(params, RequestOptions.none())

        /** @see optimizationJobs */
        @MustBeClosed
        fun optimizationJobs(
            params: OptimizationJobOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJob>

        /**
         * Returns a raw HTTP response for `get /api/v1/repos/{owner}/{repo}/optimization-jobs`, but
         * is otherwise the same as [OptimizationJobService.retrieveOptimizationJobs].
         */
        @MustBeClosed
        fun retrieveOptimizationJobs(
            repo: String,
            params: OptimizationJobRetrieveOptimizationJobsParams,
        ): HttpResponseFor<List<PromptOptimizationJob>> =
            retrieveOptimizationJobs(repo, params, RequestOptions.none())

        /** @see retrieveOptimizationJobs */
        @MustBeClosed
        fun retrieveOptimizationJobs(
            repo: String,
            params: OptimizationJobRetrieveOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PromptOptimizationJob>> =
            retrieveOptimizationJobs(params.toBuilder().repo(repo).build(), requestOptions)

        /** @see retrieveOptimizationJobs */
        @MustBeClosed
        fun retrieveOptimizationJobs(
            params: OptimizationJobRetrieveOptimizationJobsParams
        ): HttpResponseFor<List<PromptOptimizationJob>> =
            retrieveOptimizationJobs(params, RequestOptions.none())

        /** @see retrieveOptimizationJobs */
        @MustBeClosed
        fun retrieveOptimizationJobs(
            params: OptimizationJobRetrieveOptimizationJobsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PromptOptimizationJob>>
    }
}
