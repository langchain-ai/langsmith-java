// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.sessions.CustomChartsSection
import com.langsmith_api.api.models.api.v1.sessions.SessionCreateParams
import com.langsmith_api.api.models.api.v1.sessions.SessionDashboardParams
import com.langsmith_api.api.models.api.v1.sessions.SessionDeleteAllParams
import com.langsmith_api.api.models.api.v1.sessions.SessionDeleteAllResponse
import com.langsmith_api.api.models.api.v1.sessions.SessionDeleteParams
import com.langsmith_api.api.models.api.v1.sessions.SessionDeleteResponse
import com.langsmith_api.api.models.api.v1.sessions.SessionListParams
import com.langsmith_api.api.models.api.v1.sessions.SessionRetrieveMetadataParams
import com.langsmith_api.api.models.api.v1.sessions.SessionRetrieveMetadataResponse
import com.langsmith_api.api.models.api.v1.sessions.SessionRetrieveParams
import com.langsmith_api.api.models.api.v1.sessions.SessionUpdateParams
import com.langsmith_api.api.models.api.v1.sessions.TracerSession
import com.langsmith_api.api.models.api.v1.sessions.TracerSessionWithoutVirtualFields
import com.langsmith_api.api.services.async.api.v1.sessions.InsightServiceAsync
import com.langsmith_api.api.services.async.api.v1.sessions.ViewServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionServiceAsync

    fun views(): ViewServiceAsync

    fun insights(): InsightServiceAsync

    /** Create a new session. */
    fun create(): CompletableFuture<TracerSessionWithoutVirtualFields> =
        create(SessionCreateParams.none())

    /** @see create */
    fun create(
        params: SessionCreateParams = SessionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** @see create */
    fun create(
        params: SessionCreateParams = SessionCreateParams.none()
    ): CompletableFuture<TracerSessionWithoutVirtualFields> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        create(SessionCreateParams.none(), requestOptions)

    /** Get a specific session. */
    fun retrieve(sessionId: String): CompletableFuture<TracerSession> =
        retrieve(sessionId, SessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TracerSession> =
        retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
    ): CompletableFuture<TracerSession> = retrieve(sessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TracerSession>

    /** @see retrieve */
    fun retrieve(params: SessionRetrieveParams): CompletableFuture<TracerSession> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSession> =
        retrieve(sessionId, SessionRetrieveParams.none(), requestOptions)

    /** Create a new session. */
    fun update(sessionId: String): CompletableFuture<TracerSessionWithoutVirtualFields> =
        update(sessionId, SessionUpdateParams.none())

    /** @see update */
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see update */
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        update(sessionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TracerSessionWithoutVirtualFields>

    /** @see update */
    fun update(params: SessionUpdateParams): CompletableFuture<TracerSessionWithoutVirtualFields> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TracerSessionWithoutVirtualFields> =
        update(sessionId, SessionUpdateParams.none(), requestOptions)

    /** Get all sessions. */
    fun list(): CompletableFuture<List<TracerSession>> = list(SessionListParams.none())

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<TracerSession>>

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none()
    ): CompletableFuture<List<TracerSession>> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<TracerSession>> =
        list(SessionListParams.none(), requestOptions)

    /** Delete a specific session. */
    fun delete(sessionId: String): CompletableFuture<SessionDeleteResponse> =
        delete(sessionId, SessionDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionDeleteResponse> =
        delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
    ): CompletableFuture<SessionDeleteResponse> = delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionDeleteResponse>

    /** @see delete */
    fun delete(params: SessionDeleteParams): CompletableFuture<SessionDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionDeleteResponse> =
        delete(sessionId, SessionDeleteParams.none(), requestOptions)

    /** Get a prebuilt dashboard for a tracing project. */
    fun dashboard(
        sessionId: String,
        params: SessionDashboardParams,
    ): CompletableFuture<CustomChartsSection> = dashboard(sessionId, params, RequestOptions.none())

    /** @see dashboard */
    fun dashboard(
        sessionId: String,
        params: SessionDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSection> =
        dashboard(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see dashboard */
    fun dashboard(params: SessionDashboardParams): CompletableFuture<CustomChartsSection> =
        dashboard(params, RequestOptions.none())

    /** @see dashboard */
    fun dashboard(
        params: SessionDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomChartsSection>

    /** Delete a specific session. */
    fun deleteAll(params: SessionDeleteAllParams): CompletableFuture<SessionDeleteAllResponse> =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: SessionDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionDeleteAllResponse>

    /**
     * Given a session, a number K, and (optionally) a list of metadata keys, return the top K
     * values for each key.
     */
    fun retrieveMetadata(sessionId: String): CompletableFuture<SessionRetrieveMetadataResponse> =
        retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveMetadataResponse> =
        retrieveMetadata(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
    ): CompletableFuture<SessionRetrieveMetadataResponse> =
        retrieveMetadata(sessionId, params, RequestOptions.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        params: SessionRetrieveMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionRetrieveMetadataResponse>

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        params: SessionRetrieveMetadataParams
    ): CompletableFuture<SessionRetrieveMetadataResponse> =
        retrieveMetadata(params, RequestOptions.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SessionRetrieveMetadataResponse> =
        retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none(), requestOptions)

    /**
     * A view of [SessionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SessionServiceAsync.WithRawResponse

        fun views(): ViewServiceAsync.WithRawResponse

        fun insights(): InsightServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions`, but is otherwise the same as
         * [SessionServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            create(SessionCreateParams.none())

        /** @see create */
        fun create(
            params: SessionCreateParams = SessionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>>

        /** @see create */
        fun create(
            params: SessionCreateParams = SessionCreateParams.none()
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            create(SessionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}`, but is otherwise the
         * same as [SessionServiceAsync.retrieve].
         */
        fun retrieve(sessionId: String): CompletableFuture<HttpResponseFor<TracerSession>> =
            retrieve(sessionId, SessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TracerSession>> =
            retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TracerSession>> =
            retrieve(sessionId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TracerSession>>

        /** @see retrieve */
        fun retrieve(
            params: SessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<TracerSession>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TracerSession>> =
            retrieve(sessionId, SessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionServiceAsync.update].
         */
        fun update(
            sessionId: String
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            update(sessionId, SessionUpdateParams.none())

        /** @see update */
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see update */
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            update(sessionId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SessionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>>

        /** @see update */
        fun update(
            params: SessionUpdateParams
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TracerSessionWithoutVirtualFields>> =
            update(sessionId, SessionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions`, but is otherwise the same as
         * [SessionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            list(SessionListParams.none())

        /** @see list */
        fun list(
            params: SessionListParams = SessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>>

        /** @see list */
        fun list(
            params: SessionListParams = SessionListParams.none()
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<TracerSession>>> =
            list(SessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionServiceAsync.delete].
         */
        fun delete(sessionId: String): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> =
            delete(sessionId, SessionDeleteParams.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> =
            delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> =
            delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>>

        /** @see delete */
        fun delete(
            params: SessionDeleteParams
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionDeleteResponse>> =
            delete(sessionId, SessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/dashboard`, but is
         * otherwise the same as [SessionServiceAsync.dashboard].
         */
        fun dashboard(
            sessionId: String,
            params: SessionDashboardParams,
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            dashboard(sessionId, params, RequestOptions.none())

        /** @see dashboard */
        fun dashboard(
            sessionId: String,
            params: SessionDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            dashboard(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see dashboard */
        fun dashboard(
            params: SessionDashboardParams
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>> =
            dashboard(params, RequestOptions.none())

        /** @see dashboard */
        fun dashboard(
            params: SessionDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomChartsSection>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions`, but is otherwise the same as
         * [SessionServiceAsync.deleteAll].
         */
        fun deleteAll(
            params: SessionDeleteAllParams
        ): CompletableFuture<HttpResponseFor<SessionDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            params: SessionDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionDeleteAllResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/metadata`, but is
         * otherwise the same as [SessionServiceAsync.retrieveMetadata].
         */
        fun retrieveMetadata(
            sessionId: String
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>> =
            retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none())

        /** @see retrieveMetadata */
        fun retrieveMetadata(
            sessionId: String,
            params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>> =
            retrieveMetadata(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieveMetadata */
        fun retrieveMetadata(
            sessionId: String,
            params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>> =
            retrieveMetadata(sessionId, params, RequestOptions.none())

        /** @see retrieveMetadata */
        fun retrieveMetadata(
            params: SessionRetrieveMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>>

        /** @see retrieveMetadata */
        fun retrieveMetadata(
            params: SessionRetrieveMetadataParams
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>> =
            retrieveMetadata(params, RequestOptions.none())

        /** @see retrieveMetadata */
        fun retrieveMetadata(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SessionRetrieveMetadataResponse>> =
            retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none(), requestOptions)
    }
}
