// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.repos.optimizationjobs

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogCreateParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogDeleteParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogDeleteResponse
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogListParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.LogRetrieveParams
import com.langsmith_api.api.models.api.v1.repos.optimizationjobs.logs.PromptOptimizationJobLog
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LogServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync

    /** Create a new log entry for a prompt optimization job. */
    fun create(
        jobId: String,
        params: LogCreateParams,
    ): CompletableFuture<PromptOptimizationJobLog> = create(jobId, params, RequestOptions.none())

    /** @see create */
    fun create(
        jobId: String,
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJobLog> =
        create(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see create */
    fun create(params: LogCreateParams): CompletableFuture<PromptOptimizationJobLog> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJobLog>

    /** Get a specific prompt optimization job log. */
    fun retrieve(
        logId: String,
        params: LogRetrieveParams,
    ): CompletableFuture<PromptOptimizationJobLog> = retrieve(logId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        logId: String,
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJobLog> =
        retrieve(params.toBuilder().logId(logId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: LogRetrieveParams): CompletableFuture<PromptOptimizationJobLog> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PromptOptimizationJobLog>

    /** List all logs for a specific prompt optimization job. */
    fun list(
        jobId: String,
        params: LogListParams,
    ): CompletableFuture<List<PromptOptimizationJobLog>> =
        list(jobId, params, RequestOptions.none())

    /** @see list */
    fun list(
        jobId: String,
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptOptimizationJobLog>> =
        list(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see list */
    fun list(params: LogListParams): CompletableFuture<List<PromptOptimizationJobLog>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<PromptOptimizationJobLog>>

    /** Delete a prompt optimization job log. */
    fun delete(logId: String, params: LogDeleteParams): CompletableFuture<LogDeleteResponse> =
        delete(logId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        logId: String,
        params: LogDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogDeleteResponse> =
        delete(params.toBuilder().logId(logId).build(), requestOptions)

    /** @see delete */
    fun delete(params: LogDeleteParams): CompletableFuture<LogDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LogDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LogDeleteResponse>

    /** A view of [LogServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs`, but is otherwise the same
         * as [LogServiceAsync.create].
         */
        fun create(
            jobId: String,
            params: LogCreateParams,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            create(jobId, params, RequestOptions.none())

        /** @see create */
        fun create(
            jobId: String,
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            create(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LogCreateParams
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}`, but is otherwise
         * the same as [LogServiceAsync.retrieve].
         */
        fun retrieve(
            logId: String,
            params: LogRetrieveParams,
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            retrieve(logId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            logId: String,
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            retrieve(params.toBuilder().logId(logId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: LogRetrieveParams
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PromptOptimizationJobLog>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs`, but is otherwise the same
         * as [LogServiceAsync.list].
         */
        fun list(
            jobId: String,
            params: LogListParams,
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJobLog>>> =
            list(jobId, params, RequestOptions.none())

        /** @see list */
        fun list(
            jobId: String,
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJobLog>>> =
            list(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see list */
        fun list(
            params: LogListParams
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJobLog>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<PromptOptimizationJobLog>>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}`, but is otherwise
         * the same as [LogServiceAsync.delete].
         */
        fun delete(
            logId: String,
            params: LogDeleteParams,
        ): CompletableFuture<HttpResponseFor<LogDeleteResponse>> =
            delete(logId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            logId: String,
            params: LogDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogDeleteResponse>> =
            delete(params.toBuilder().logId(logId).build(), requestOptions)

        /** @see delete */
        fun delete(params: LogDeleteParams): CompletableFuture<HttpResponseFor<LogDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LogDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LogDeleteResponse>>
    }
}
