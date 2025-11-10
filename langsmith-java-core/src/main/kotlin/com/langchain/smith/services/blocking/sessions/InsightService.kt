// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface InsightService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService

    /** Create an insights job. */
    fun create(sessionId: String, params: InsightCreateParams): InsightCreateResponse =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightCreateResponse =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: InsightCreateParams): InsightCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: InsightCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightCreateResponse

    /** Update a session cluster job. */
    fun update(jobId: String, params: InsightUpdateParams): InsightUpdateResponse =
        update(jobId, params, RequestOptions.none())

    /** @see update */
    fun update(
        jobId: String,
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightUpdateResponse = update(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see update */
    fun update(params: InsightUpdateParams): InsightUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: InsightUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightUpdateResponse

    /** Delete a session cluster job. */
    fun delete(jobId: String, params: InsightDeleteParams): InsightDeleteResponse =
        delete(jobId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        jobId: String,
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteResponse = delete(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see delete */
    fun delete(params: InsightDeleteParams): InsightDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: InsightDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightDeleteResponse

    /** Get a specific cluster job for a session. */
    fun retrieveJob(jobId: String, params: InsightRetrieveJobParams): InsightRetrieveJobResponse =
        retrieveJob(jobId, params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        jobId: String,
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveJobResponse =
        retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveJob */
    fun retrieveJob(params: InsightRetrieveJobParams): InsightRetrieveJobResponse =
        retrieveJob(params, RequestOptions.none())

    /** @see retrieveJob */
    fun retrieveJob(
        params: InsightRetrieveJobParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveJobResponse

    /** Get all runs for a cluster job, optionally filtered by cluster. */
    fun retrieveRuns(
        jobId: String,
        params: InsightRetrieveRunsParams,
    ): InsightRetrieveRunsResponse = retrieveRuns(jobId, params, RequestOptions.none())

    /** @see retrieveRuns */
    fun retrieveRuns(
        jobId: String,
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveRunsResponse =
        retrieveRuns(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see retrieveRuns */
    fun retrieveRuns(params: InsightRetrieveRunsParams): InsightRetrieveRunsResponse =
        retrieveRuns(params, RequestOptions.none())

    /** @see retrieveRuns */
    fun retrieveRuns(
        params: InsightRetrieveRunsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveRunsResponse

    /** A view of [InsightService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/insights`, but is
         * otherwise the same as [InsightService.create].
         */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: InsightCreateParams,
        ): HttpResponseFor<InsightCreateResponse> = create(sessionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightCreateResponse> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: InsightCreateParams): HttpResponseFor<InsightCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: InsightCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightCreateResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightService.update].
         */
        @MustBeClosed
        fun update(
            jobId: String,
            params: InsightUpdateParams,
        ): HttpResponseFor<InsightUpdateResponse> = update(jobId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            jobId: String,
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightUpdateResponse> =
            update(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: InsightUpdateParams): HttpResponseFor<InsightUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: InsightUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightUpdateResponse>

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightService.delete].
         */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: InsightDeleteParams,
        ): HttpResponseFor<InsightDeleteResponse> = delete(jobId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            jobId: String,
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteResponse> =
            delete(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: InsightDeleteParams): HttpResponseFor<InsightDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: InsightDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightDeleteResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights/{job_id}`,
         * but is otherwise the same as [InsightService.retrieveJob].
         */
        @MustBeClosed
        fun retrieveJob(
            jobId: String,
            params: InsightRetrieveJobParams,
        ): HttpResponseFor<InsightRetrieveJobResponse> =
            retrieveJob(jobId, params, RequestOptions.none())

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            jobId: String,
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveJobResponse> =
            retrieveJob(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            params: InsightRetrieveJobParams
        ): HttpResponseFor<InsightRetrieveJobResponse> = retrieveJob(params, RequestOptions.none())

        /** @see retrieveJob */
        @MustBeClosed
        fun retrieveJob(
            params: InsightRetrieveJobParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveJobResponse>

        /**
         * Returns a raw HTTP response for `get
         * /api/v1/sessions/{session_id}/insights/{job_id}/runs`, but is otherwise the same as
         * [InsightService.retrieveRuns].
         */
        @MustBeClosed
        fun retrieveRuns(
            jobId: String,
            params: InsightRetrieveRunsParams,
        ): HttpResponseFor<InsightRetrieveRunsResponse> =
            retrieveRuns(jobId, params, RequestOptions.none())

        /** @see retrieveRuns */
        @MustBeClosed
        fun retrieveRuns(
            jobId: String,
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveRunsResponse> =
            retrieveRuns(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see retrieveRuns */
        @MustBeClosed
        fun retrieveRuns(
            params: InsightRetrieveRunsParams
        ): HttpResponseFor<InsightRetrieveRunsResponse> =
            retrieveRuns(params, RequestOptions.none())

        /** @see retrieveRuns */
        @MustBeClosed
        fun retrieveRuns(
            params: InsightRetrieveRunsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveRunsResponse>
    }
}
