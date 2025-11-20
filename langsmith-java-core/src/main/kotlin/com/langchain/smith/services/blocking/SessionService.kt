// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.CustomChartsSection
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionDeleteResponse
import com.langchain.smith.models.sessions.SessionListPage
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.blocking.sessions.InsightService
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
    fun list(): SessionListPage = list(SessionListParams.none())

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionListPage

    /** @see list */
    fun list(params: SessionListParams = SessionListParams.none()): SessionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SessionListPage =
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

    /** A view of [SessionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SessionService.WithRawResponse

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
        @MustBeClosed fun list(): HttpResponseFor<SessionListPage> = list(SessionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SessionListParams = SessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SessionListParams = SessionListParams.none()
        ): HttpResponseFor<SessionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SessionListPage> =
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
    }
}
