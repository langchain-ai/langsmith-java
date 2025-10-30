// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
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
import com.langsmith_api.api.services.blocking.api.v1.sessions.InsightService
import com.langsmith_api.api.services.blocking.api.v1.sessions.ViewService
import java.util.function.Consumer

interface SessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService

    fun views(): ViewService

    fun insights(): InsightService

    /** Create a new session. */
    fun create(): TracerSessionWithoutVirtualFields = create(SessionCreateParams.none())

    /** @see create */
    fun create(
        params: SessionCreateParams = SessionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields

    /** @see create */
    fun create(
        params: SessionCreateParams = SessionCreateParams.none()
    ): TracerSessionWithoutVirtualFields = create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): TracerSessionWithoutVirtualFields =
        create(SessionCreateParams.none(), requestOptions)

    /** Get a specific session. */
    fun retrieve(sessionId: String): TracerSession =
        retrieve(sessionId, SessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSession = retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
    ): TracerSession = retrieve(sessionId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSession

    /** @see retrieve */
    fun retrieve(params: SessionRetrieveParams): TracerSession =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(sessionId: String, requestOptions: RequestOptions): TracerSession =
        retrieve(sessionId, SessionRetrieveParams.none(), requestOptions)

    /** Create a new session. */
    fun update(sessionId: String): TracerSessionWithoutVirtualFields =
        update(sessionId, SessionUpdateParams.none())

    /** @see update */
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields =
        update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see update */
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
    ): TracerSessionWithoutVirtualFields = update(sessionId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields

    /** @see update */
    fun update(params: SessionUpdateParams): TracerSessionWithoutVirtualFields =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        sessionId: String,
        requestOptions: RequestOptions,
    ): TracerSessionWithoutVirtualFields =
        update(sessionId, SessionUpdateParams.none(), requestOptions)

    /** Get all sessions. */
    fun list(): List<TracerSession> = list(SessionListParams.none())

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TracerSession>

    /** @see list */
    fun list(params: SessionListParams = SessionListParams.none()): List<TracerSession> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): List<TracerSession> =
        list(SessionListParams.none(), requestOptions)

    /** Delete a specific session. */
    fun delete(sessionId: String): SessionDeleteResponse =
        delete(sessionId, SessionDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionDeleteResponse =
        delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
    ): SessionDeleteResponse = delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionDeleteResponse

    /** @see delete */
    fun delete(params: SessionDeleteParams): SessionDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sessionId: String, requestOptions: RequestOptions): SessionDeleteResponse =
        delete(sessionId, SessionDeleteParams.none(), requestOptions)

    /** Get a prebuilt dashboard for a tracing project. */
    fun dashboard(sessionId: String, params: SessionDashboardParams): CustomChartsSection =
        dashboard(sessionId, params, RequestOptions.none())

    /** @see dashboard */
    fun dashboard(
        sessionId: String,
        params: SessionDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSection =
        dashboard(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see dashboard */
    fun dashboard(params: SessionDashboardParams): CustomChartsSection =
        dashboard(params, RequestOptions.none())

    /** @see dashboard */
    fun dashboard(
        params: SessionDashboardParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomChartsSection

    /** Delete a specific session. */
    fun deleteAll(params: SessionDeleteAllParams): SessionDeleteAllResponse =
        deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(
        params: SessionDeleteAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionDeleteAllResponse

    /**
     * Given a session, a number K, and (optionally) a list of metadata keys, return the top K
     * values for each key.
     */
    fun retrieveMetadata(sessionId: String): SessionRetrieveMetadataResponse =
        retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveMetadataResponse =
        retrieveMetadata(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
    ): SessionRetrieveMetadataResponse = retrieveMetadata(sessionId, params, RequestOptions.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        params: SessionRetrieveMetadataParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionRetrieveMetadataResponse

    /** @see retrieveMetadata */
    fun retrieveMetadata(params: SessionRetrieveMetadataParams): SessionRetrieveMetadataResponse =
        retrieveMetadata(params, RequestOptions.none())

    /** @see retrieveMetadata */
    fun retrieveMetadata(
        sessionId: String,
        requestOptions: RequestOptions,
    ): SessionRetrieveMetadataResponse =
        retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none(), requestOptions)

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

        fun views(): ViewService.WithRawResponse

        fun insights(): InsightService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions`, but is otherwise the same as
         * [SessionService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(SessionCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SessionCreateParams = SessionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields>

        /** @see create */
        @MustBeClosed
        fun create(
            params: SessionCreateParams = SessionCreateParams.none()
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(SessionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}`, but is otherwise the
         * same as [SessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(sessionId: String): HttpResponseFor<TracerSession> =
            retrieve(sessionId, SessionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSession> =
            retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
        ): HttpResponseFor<TracerSession> = retrieve(sessionId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSession>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: SessionRetrieveParams): HttpResponseFor<TracerSession> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSession> =
            retrieve(sessionId, SessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionService.update].
         */
        @MustBeClosed
        fun update(sessionId: String): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, SessionUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SessionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields>

        /** @see update */
        @MustBeClosed
        fun update(
            params: SessionUpdateParams
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, SessionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions`, but is otherwise the same as
         * [SessionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<List<TracerSession>> = list(SessionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SessionListParams = SessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TracerSession>>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SessionListParams = SessionListParams.none()
        ): HttpResponseFor<List<TracerSession>> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<List<TracerSession>> =
            list(SessionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionService.delete].
         */
        @MustBeClosed
        fun delete(sessionId: String): HttpResponseFor<SessionDeleteResponse> =
            delete(sessionId, SessionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionDeleteResponse> =
            delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
        ): HttpResponseFor<SessionDeleteResponse> = delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: SessionDeleteParams): HttpResponseFor<SessionDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionDeleteResponse> =
            delete(sessionId, SessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/dashboard`, but is
         * otherwise the same as [SessionService.dashboard].
         */
        @MustBeClosed
        fun dashboard(
            sessionId: String,
            params: SessionDashboardParams,
        ): HttpResponseFor<CustomChartsSection> =
            dashboard(sessionId, params, RequestOptions.none())

        /** @see dashboard */
        @MustBeClosed
        fun dashboard(
            sessionId: String,
            params: SessionDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSection> =
            dashboard(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see dashboard */
        @MustBeClosed
        fun dashboard(params: SessionDashboardParams): HttpResponseFor<CustomChartsSection> =
            dashboard(params, RequestOptions.none())

        /** @see dashboard */
        @MustBeClosed
        fun dashboard(
            params: SessionDashboardParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomChartsSection>

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions`, but is otherwise the same as
         * [SessionService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(params: SessionDeleteAllParams): HttpResponseFor<SessionDeleteAllResponse> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: SessionDeleteAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionDeleteAllResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/metadata`, but is
         * otherwise the same as [SessionService.retrieveMetadata].
         */
        @MustBeClosed
        fun retrieveMetadata(sessionId: String): HttpResponseFor<SessionRetrieveMetadataResponse> =
            retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none())

        /** @see retrieveMetadata */
        @MustBeClosed
        fun retrieveMetadata(
            sessionId: String,
            params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveMetadataResponse> =
            retrieveMetadata(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieveMetadata */
        @MustBeClosed
        fun retrieveMetadata(
            sessionId: String,
            params: SessionRetrieveMetadataParams = SessionRetrieveMetadataParams.none(),
        ): HttpResponseFor<SessionRetrieveMetadataResponse> =
            retrieveMetadata(sessionId, params, RequestOptions.none())

        /** @see retrieveMetadata */
        @MustBeClosed
        fun retrieveMetadata(
            params: SessionRetrieveMetadataParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionRetrieveMetadataResponse>

        /** @see retrieveMetadata */
        @MustBeClosed
        fun retrieveMetadata(
            params: SessionRetrieveMetadataParams
        ): HttpResponseFor<SessionRetrieveMetadataResponse> =
            retrieveMetadata(params, RequestOptions.none())

        /** @see retrieveMetadata */
        @MustBeClosed
        fun retrieveMetadata(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SessionRetrieveMetadataResponse> =
            retrieveMetadata(sessionId, SessionRetrieveMetadataParams.none(), requestOptions)
    }
}
