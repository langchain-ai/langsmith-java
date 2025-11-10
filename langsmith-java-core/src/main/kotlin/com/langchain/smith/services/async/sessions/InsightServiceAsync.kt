// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.insights.InsightCreateParams
import com.langchain.smith.models.sessions.insights.InsightCreateResponse
import com.langchain.smith.models.sessions.insights.InsightDeleteParams
import com.langchain.smith.models.sessions.insights.InsightDeleteResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveJobResponse
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsParams
import com.langchain.smith.models.sessions.insights.InsightRetrieveRunsResponse
import com.langchain.smith.models.sessions.insights.InsightUpdateParams
import com.langchain.smith.models.sessions.insights.InsightUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InsightServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightServiceAsync

    /** Create an insights job. */
    fun create(
        sessionId: String,
        params: InsightCreateParams,
    ): CompletableFuture<InsightCreateResponse> = create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightCreateResponse> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: InsightCreateParams): CompletableFuture<InsightCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightCreateResponse>

    /** Update a session cluster job. */
    fun update(
        jobId: String,
        params: InsightUpdateParams,
    ): CompletableFuture<InsightUpdateResponse> = update(jobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        jobId: String,
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightUpdateResponse> =
        update(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see update */
    fun update(params: InsightUpdateParams): CompletableFuture<InsightUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightUpdateResponse>

    /** Delete a session cluster job. */
    fun delete(
        jobId: String,
        params: InsightDeleteParams,
    ): CompletableFuture<InsightDeleteResponse> = delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteResponse> =
        delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(params: InsightDeleteParams): CompletableFuture<InsightDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightDeleteResponse>

    /** Get a specific cluster job for a session. */
    fun retrieveJob(
        jobId: String,
        params: InsightRetrieveJobParams,
    ): CompletableFuture<InsightRetrieveJobResponse> =
        retrieveJob(jobId, params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveJobResponse> =
        retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveJob */
    fun retrieveJob(
        params: InsightRetrieveJobParams
    ): CompletableFuture<InsightRetrieveJobResponse> = retrieveJob(params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveJobResponse>

    /** Get all runs for a cluster job, optionally filtered by cluster. */
    fun retrieveRuns(
        jobId: String,
        params: InsightRetrieveRunsParams,
    ): CompletableFuture<InsightRetrieveRunsResponse> =
        retrieveRuns(jobId, params, RequestOptions.none())

    /** @see retrieveRuns */
    fun retrieveRuns(
        jobId: String,
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveRunsResponse> =
        retrieveRuns(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveRuns */
    fun retrieveRuns(
        params: InsightRetrieveRunsParams
    ): CompletableFuture<InsightRetrieveRunsResponse> = retrieveRuns(params, RequestOptions.none())

    /** @see retrieveRuns */
    fun retrieveRuns(
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveRunsResponse>

    /**
     * A view of [InsightServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InsightServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/insights`, but is
         * otherwise the same as [InsightServiceAsync.create].
         */
        fun create(
            sessionId: String,
            params: InsightCreateParams,
        ): CompletableFuture<HttpResponseFor<InsightCreateResponse>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: String,
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightCreateResponse>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(
            params: InsightCreateParams
        ): CompletableFuture<HttpResponseFor<InsightCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightServiceAsync.update].
         */
        fun update(
            jobId: String,
            params: InsightUpdateParams,
        ): CompletableFuture<HttpResponseFor<InsightUpdateResponse>> =
            update(jobId, params, RequestOptions.none())

        /** @see update */
        fun update(
            jobId: String,
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightUpdateResponse>> =
            update(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see update */
        fun update(
            params: InsightUpdateParams
        ): CompletableFuture<HttpResponseFor<InsightUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightUpdateResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightServiceAsync.delete].
         */
        fun delete(
            jobId: String,
            params: InsightDeleteParams,
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(jobId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            jobId: String,
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: InsightDeleteParams
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightDeleteResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightServiceAsync.retrieveJob].
         */
        fun retrieveJob(
            jobId: String,
            params: InsightRetrieveJobParams,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveJobResponse>> =
            retrieveJob(jobId, params, RequestOptions.none())

        /** @see retrieveJob */
        fun retrieveJob(
            jobId: String,
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveJobResponse>> =
            retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveJob */
        fun retrieveJob(
            params: InsightRetrieveJobParams
        ): CompletableFuture<HttpResponseFor<InsightRetrieveJobResponse>> =
            retrieveJob(params, RequestOptions.none())

        /** @see retrieveJob */
        fun retrieveJob(
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveJobResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/sessions/{session_id}/insights/{job_id}/runs`, but is otherwise the same as
         * [InsightServiceAsync.retrieveRuns].
         */
        fun retrieveRuns(
            jobId: String,
            params: InsightRetrieveRunsParams,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveRunsResponse>> =
            retrieveRuns(jobId, params, RequestOptions.none())

        /** @see retrieveRuns */
        fun retrieveRuns(
            jobId: String,
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveRunsResponse>> =
            retrieveRuns(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveRuns */
        fun retrieveRuns(
            params: InsightRetrieveRunsParams
        ): CompletableFuture<HttpResponseFor<InsightRetrieveRunsResponse>> =
            retrieveRuns(params, RequestOptions.none())

        /** @see retrieveRuns */
        fun retrieveRuns(
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveRunsResponse>>
    }
}
