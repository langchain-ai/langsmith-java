// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.repos.optimizationjobs

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.repos.optimizationjobs.logs.LogCreateParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogDeleteResponse
import com.langchain.smith.models.repos.optimizationjobs.logs.LogListParams
import com.langchain.smith.models.repos.optimizationjobs.logs.LogRetrieveParams
import com.langchain.smith.models.repos.optimizationjobs.logs.PromptOptimizationJobLog
import java.util.function.Consumer

interface LogService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService

    /** Create a new log entry for a prompt optimization job. */
    fun create(jobId: String, params: LogCreateParams): PromptOptimizationJobLog =
        create(jobId, params, RequestOptions.none())

    /** @see create */
    fun create(
        jobId: String,
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJobLog = create(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see create */
    fun create(params: LogCreateParams): PromptOptimizationJobLog =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LogCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJobLog

    /** Get a specific prompt optimization job log. */
    fun retrieve(logId: String, params: LogRetrieveParams): PromptOptimizationJobLog =
        retrieve(logId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        logId: String,
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJobLog = retrieve(params.toBuilder().logId(logId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: LogRetrieveParams): PromptOptimizationJobLog =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: LogRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PromptOptimizationJobLog

    /** List all logs for a specific prompt optimization job. */
    fun list(jobId: String, params: LogListParams): List<PromptOptimizationJobLog> =
        list(jobId, params, RequestOptions.none())

    /** @see list */
    fun list(
        jobId: String,
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PromptOptimizationJobLog> =
        list(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see list */
    fun list(params: LogListParams): List<PromptOptimizationJobLog> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LogListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<PromptOptimizationJobLog>

    /** Delete a prompt optimization job log. */
    fun delete(logId: String, params: LogDeleteParams): LogDeleteResponse =
        delete(logId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        logId: String,
        params: LogDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogDeleteResponse = delete(params.toBuilder().logId(logId).build(), requestOptions)

    /** @see delete */
    fun delete(params: LogDeleteParams): LogDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LogDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LogDeleteResponse

    /** A view of [LogService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LogService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs`, but is otherwise the same
         * as [LogService.create].
         */
        @MustBeClosed
        fun create(
            jobId: String,
            params: LogCreateParams,
        ): HttpResponseFor<PromptOptimizationJobLog> = create(jobId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            jobId: String,
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJobLog> =
            create(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: LogCreateParams): HttpResponseFor<PromptOptimizationJobLog> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LogCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJobLog>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}`, but is otherwise
         * the same as [LogService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            logId: String,
            params: LogRetrieveParams,
        ): HttpResponseFor<PromptOptimizationJobLog> =
            retrieve(logId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            logId: String,
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJobLog> =
            retrieve(params.toBuilder().logId(logId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: LogRetrieveParams): HttpResponseFor<PromptOptimizationJobLog> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: LogRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PromptOptimizationJobLog>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs`, but is otherwise the same
         * as [LogService.list].
         */
        @MustBeClosed
        fun list(
            jobId: String,
            params: LogListParams,
        ): HttpResponseFor<List<PromptOptimizationJobLog>> =
            list(jobId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            jobId: String,
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PromptOptimizationJobLog>> =
            list(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(params: LogListParams): HttpResponseFor<List<PromptOptimizationJobLog>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LogListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<PromptOptimizationJobLog>>

        /**
         * Returns a raw HTTP response for `delete
         * /api/v1/repos/{owner}/{repo}/optimization-jobs/{job_id}/logs/{log_id}`, but is otherwise
         * the same as [LogService.delete].
         */
        @MustBeClosed
        fun delete(logId: String, params: LogDeleteParams): HttpResponseFor<LogDeleteResponse> =
            delete(logId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            logId: String,
            params: LogDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogDeleteResponse> =
            delete(params.toBuilder().logId(logId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: LogDeleteParams): HttpResponseFor<LogDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LogDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LogDeleteResponse>
    }
}
