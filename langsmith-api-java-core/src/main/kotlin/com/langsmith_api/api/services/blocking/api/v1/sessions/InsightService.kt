// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.sessions

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightCreateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightCreateResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightDeleteResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightListParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightListResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveRunsParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightRetrieveRunsResponse
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightUpdateParams
import com.langsmith_api.api.models.api.v1.sessions.insights.InsightUpdateResponse
import com.langsmith_api.api.services.blocking.api.v1.sessions.insights.ConfigService
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

    fun configs(): ConfigService

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

    /** Get a specific cluster for a session. */
    fun retrieve(clusterId: String, params: InsightRetrieveParams): InsightRetrieveResponse =
        retrieve(clusterId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        clusterId: String,
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveResponse =
        retrieve(params.toBuilder().clusterId(clusterId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: InsightRetrieveParams): InsightRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightRetrieveResponse

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

    /** Get all clusters for a session. */
    fun list(sessionId: String): InsightListResponse = list(sessionId, InsightListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: InsightListParams = InsightListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightListResponse = list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: InsightListParams = InsightListParams.none(),
    ): InsightListResponse = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InsightListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InsightListResponse

    /** @see list */
    fun list(params: InsightListParams): InsightListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(sessionId: String, requestOptions: RequestOptions): InsightListResponse =
        list(sessionId, InsightListParams.none(), requestOptions)

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

        fun configs(): ConfigService.WithRawResponse

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
         * Returns a raw HTTP response for `get
         * /api/v1/sessions/{session_id}/insights/{job_id}/clusters/{cluster_id}`, but is otherwise
         * the same as [InsightService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            clusterId: String,
            params: InsightRetrieveParams,
        ): HttpResponseFor<InsightRetrieveResponse> =
            retrieve(clusterId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            clusterId: String,
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveResponse> =
            retrieve(params.toBuilder().clusterId(clusterId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: InsightRetrieveParams): HttpResponseFor<InsightRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightRetrieveResponse>

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
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights`, but is
         * otherwise the same as [InsightService.list].
         */
        @MustBeClosed
        fun list(sessionId: String): HttpResponseFor<InsightListResponse> =
            list(sessionId, InsightListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: InsightListParams = InsightListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightListResponse> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: InsightListParams = InsightListParams.none(),
        ): HttpResponseFor<InsightListResponse> = list(sessionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InsightListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InsightListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: InsightListParams): HttpResponseFor<InsightListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InsightListResponse> =
            list(sessionId, InsightListParams.none(), requestOptions)

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
