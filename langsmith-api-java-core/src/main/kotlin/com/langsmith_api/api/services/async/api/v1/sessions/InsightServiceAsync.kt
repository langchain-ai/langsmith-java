// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.sessions

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
import com.langsmith_api.api.services.async.api.v1.sessions.insights.ConfigServiceAsync
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

    fun configs(): ConfigServiceAsync

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

    /** Get a specific cluster for a session. */
    fun retrieve(
        clusterId: String,
        params: InsightRetrieveParams,
    ): CompletableFuture<InsightRetrieveResponse> =
        retrieve(clusterId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        clusterId: String,
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveResponse> =
        retrieve(params.toBuilder().clusterId(clusterId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: InsightRetrieveParams): CompletableFuture<InsightRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: InsightRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightRetrieveResponse>

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

    /** Get all clusters for a session. */
    fun list(sessionId: String): CompletableFuture<InsightListResponse> =
        list(sessionId, InsightListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: InsightListParams = InsightListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightListResponse> =
        list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: InsightListParams = InsightListParams.none(),
    ): CompletableFuture<InsightListResponse> = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: InsightListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InsightListResponse>

    /** @see list */
    fun list(params: InsightListParams): CompletableFuture<InsightListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InsightListResponse> =
        list(sessionId, InsightListParams.none(), requestOptions)

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

        fun configs(): ConfigServiceAsync.WithRawResponse

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
         * Returns a raw HTTP response for `get
         * /api/v1/sessions/{session_id}/insights/{job_id}/clusters/{cluster_id}`, but is otherwise
         * the same as [InsightServiceAsync.retrieve].
         */
        fun retrieve(
            clusterId: String,
            params: InsightRetrieveParams,
        ): CompletableFuture<HttpResponseFor<InsightRetrieveResponse>> =
            retrieve(clusterId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            clusterId: String,
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveResponse>> =
            retrieve(params.toBuilder().clusterId(clusterId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: InsightRetrieveParams
        ): CompletableFuture<HttpResponseFor<InsightRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: InsightRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightRetrieveResponse>>

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
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/insights`, but is
         * otherwise the same as [InsightServiceAsync.list].
         */
        fun list(sessionId: String): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(sessionId, InsightListParams.none())

        /** @see list */
        fun list(
            sessionId: String,
            params: InsightListParams = InsightListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        fun list(
            sessionId: String,
            params: InsightListParams = InsightListParams.none(),
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(sessionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: InsightListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InsightListResponse>>

        /** @see list */
        fun list(
            params: InsightListParams
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InsightListResponse>> =
            list(sessionId, InsightListParams.none(), requestOptions)

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
