// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponse
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.CustomChartsSection
import com.langchain.smith.models.sessions.Session
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionCreateV2Params
import com.langchain.smith.models.sessions.SessionDashboardParams
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionListPage
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionListV1Page
import com.langchain.smith.models.sessions.SessionListV1Params
import com.langchain.smith.models.sessions.SessionListV2Page
import com.langchain.smith.models.sessions.SessionListV2Params
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.models.sessions.SessionResolveResponse
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionRetrieveV2Params
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.SessionUpdateV2Params
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

    /**
     * Create a new project.
     *
     * Deprecated: use POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul
     * 1, 2027.
     */
    @Deprecated(
        "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun create(): TracerSessionWithoutVirtualFields = create(SessionCreateParams.none())

    /** @see create */
    @Deprecated(
        "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun create(
        params: SessionCreateParams = SessionCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields

    /** @see create */
    @Deprecated(
        "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun create(
        params: SessionCreateParams = SessionCreateParams.none()
    ): TracerSessionWithoutVirtualFields = create(params, RequestOptions.none())

    /** @see create */
    @Deprecated(
        "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun create(requestOptions: RequestOptions): TracerSessionWithoutVirtualFields =
        create(SessionCreateParams.none(), requestOptions)

    /**
     * Get a specific project.
     *
     * Deprecated: use GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal
     * on Jul 1, 2027.
     */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(sessionId: String): TracerSession =
        retrieve(sessionId, SessionRetrieveParams.none())

    /** @see retrieve */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSession = retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(
        sessionId: String,
        params: SessionRetrieveParams = SessionRetrieveParams.none(),
    ): TracerSession = retrieve(sessionId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(
        params: SessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSession

    /** @see retrieve */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(params: SessionRetrieveParams): TracerSession =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated(
        "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun retrieve(sessionId: String, requestOptions: RequestOptions): TracerSession =
        retrieve(sessionId, SessionRetrieveParams.none(), requestOptions)

    /**
     * Update a project.
     *
     * Deprecated: use PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal
     * on Jul 1, 2027.
     */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(sessionId: String): TracerSessionWithoutVirtualFields =
        update(sessionId, SessionUpdateParams.none())

    /** @see update */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields =
        update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see update */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(
        sessionId: String,
        params: SessionUpdateParams = SessionUpdateParams.none(),
    ): TracerSessionWithoutVirtualFields = update(sessionId, params, RequestOptions.none())

    /** @see update */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(
        params: SessionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TracerSessionWithoutVirtualFields

    /** @see update */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(params: SessionUpdateParams): TracerSessionWithoutVirtualFields =
        update(params, RequestOptions.none())

    /** @see update */
    @Deprecated(
        "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun update(
        sessionId: String,
        requestOptions: RequestOptions,
    ): TracerSessionWithoutVirtualFields =
        update(sessionId, SessionUpdateParams.none(), requestOptions)

    /**
     * Delete a specific project.
     *
     * Returns 202 when deletion is accepted. Cleanup runs asynchronously. Location identifies the
     * affected project, not a cleanup-status endpoint. For a caller with read access, GET at that
     * URL returns 200 with the project while it is still available, or 404 after the project is
     * removed. A 404 does not confirm that background trace cleanup has finished. Polling for
     * cleanup completion is not supported.
     */
    fun delete(sessionId: String) = delete(sessionId, SessionDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(sessionId: String, params: SessionDeleteParams = SessionDeleteParams.none()) =
        delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SessionDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SessionDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sessionId: String, requestOptions: RequestOptions) =
        delete(sessionId, SessionDeleteParams.none(), requestOptions)

    /**
     * Create a session, or update an existing session with the same name when upsert is true.
     * Returns the refreshed session representation without optional run statistics.
     */
    fun createV2(params: SessionCreateV2Params): Session = createV2(params, RequestOptions.none())

    /** @see createV2 */
    fun createV2(
        params: SessionCreateV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session

    /**
     * GET with body payload — no resources created. Returns the prebuilt dashboard for the tracing
     * project matching the query passed as the request payload.
     */
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

    /**
     * List all projects.
     *
     * Deprecated: use GET /api/v2/sessions, which pages with a cursor. The v1 endpoint is scheduled
     * for removal on Jul 1, 2027.
     */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun listV1(): SessionListV1Page = listV1(SessionListV1Params.none())

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun listV1(
        params: SessionListV1Params = SessionListV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionListV1Page

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun listV1(params: SessionListV1Params = SessionListV1Params.none()): SessionListV1Page =
        listV1(params, RequestOptions.none())

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
    )
    fun listV1(requestOptions: RequestOptions): SessionListV1Page =
        listV1(SessionListV1Params.none(), requestOptions)

    /**
     * Returns a page of the workspace's tracing projects and experiments. Pass the response's
     * next_cursor as cursor to fetch the next page; next_cursor is null on the last page. A cursor
     * is valid only with the same query parameters as the request that returned it.
     */
    fun listV2(): SessionListV2Page = listV2(SessionListV2Params.none())

    /** @see listV2 */
    fun listV2(
        params: SessionListV2Params = SessionListV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionListV2Page

    /** @see listV2 */
    fun listV2(params: SessionListV2Params = SessionListV2Params.none()): SessionListV2Page =
        listV2(params, RequestOptions.none())

    /** @see listV2 */
    fun listV2(requestOptions: RequestOptions): SessionListV2Page =
        listV2(SessionListV2Params.none(), requestOptions)

    /**
     * Returns the tracing project (session) an address names. An address is an AGENT (`id` and
     * `environment`), an EXPERIMENT (`id`), or an EVALUATOR (no `id`: evaluator traces share one
     * project per workspace). Send `kind` and `environment` in upper case, as listed; they are
     * matched case-insensitively, while the Agent `id` is case-sensitive. An address that does not
     * exist, or whose project you cannot read, is a 404. Pass the returned `session_id` to any
     * endpoint that takes a project (session) ID. This is not supported on a BYOC data plane yet,
     * and is a 501 there. Self-hosted deployments need LangSmith v0.18 or later.
     */
    fun resolve(params: SessionResolveParams): SessionResolveResponse =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: SessionResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SessionResolveResponse

    /**
     * Returns one tracing project or experiment by ID. Pass include_stats=true to include run
     * statistics.
     */
    fun retrieveV2(sessionId: String): Session =
        retrieveV2(sessionId, SessionRetrieveV2Params.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        sessionId: String,
        params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session = retrieveV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieveV2 */
    fun retrieveV2(
        sessionId: String,
        params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
    ): Session = retrieveV2(sessionId, params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        params: SessionRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session

    /** @see retrieveV2 */
    fun retrieveV2(params: SessionRetrieveV2Params): Session =
        retrieveV2(params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(sessionId: String, requestOptions: RequestOptions): Session =
        retrieveV2(sessionId, SessionRetrieveV2Params.none(), requestOptions)

    /**
     * Updates supplied fields and returns the refreshed resource without optional run statistics.
     * Omitted fields remain unchanged. Null clears description, default_dataset_id, end_time, or
     * extra. Extra merges top-level keys; null values remove keys.
     */
    fun updateV2(sessionId: String): Session = updateV2(sessionId, SessionUpdateV2Params.none())

    /** @see updateV2 */
    fun updateV2(
        sessionId: String,
        params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session = updateV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see updateV2 */
    fun updateV2(
        sessionId: String,
        params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
    ): Session = updateV2(sessionId, params, RequestOptions.none())

    /** @see updateV2 */
    fun updateV2(
        params: SessionUpdateV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session

    /** @see updateV2 */
    fun updateV2(params: SessionUpdateV2Params): Session = updateV2(params, RequestOptions.none())

    /** @see updateV2 */
    fun updateV2(sessionId: String, requestOptions: RequestOptions): Session =
        updateV2(sessionId, SessionUpdateV2Params.none(), requestOptions)

    /**
     * List all projects.
     *
     * Deprecated: use GET /api/v2/sessions, which pages with a cursor. The v1 endpoint is scheduled
     * for removal on Jul 1, 2027.
     */
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
        @Deprecated(
            "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun create(): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(SessionCreateParams.none())

        /** @see create */
        @Deprecated(
            "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun create(
            params: SessionCreateParams = SessionCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields>

        /** @see create */
        @Deprecated(
            "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun create(
            params: SessionCreateParams = SessionCreateParams.none()
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated(
            "Deprecated: use createV2 instead, which calls POST /api/v2/sessions. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            create(SessionCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}`, but is otherwise the
         * same as [SessionService.retrieve].
         */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun retrieve(sessionId: String): HttpResponseFor<TracerSession> =
            retrieve(sessionId, SessionRetrieveParams.none())

        /** @see retrieve */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSession> =
            retrieve(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun retrieve(
            sessionId: String,
            params: SessionRetrieveParams = SessionRetrieveParams.none(),
        ): HttpResponseFor<TracerSession> = retrieve(sessionId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun retrieve(
            params: SessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSession>

        /** @see retrieve */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun retrieve(params: SessionRetrieveParams): HttpResponseFor<TracerSession> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated(
            "Deprecated: use retrieveV2 instead, which calls GET /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
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
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(sessionId: String): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, SessionUpdateParams.none())

        /** @see update */
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see update */
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(
            sessionId: String,
            params: SessionUpdateParams = SessionUpdateParams.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, params, RequestOptions.none())

        /** @see update */
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(
            params: SessionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TracerSessionWithoutVirtualFields>

        /** @see update */
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(
            params: SessionUpdateParams
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(params, RequestOptions.none())

        /** @see update */
        @Deprecated(
            "Deprecated: use updateV2 instead, which calls PATCH /api/v2/sessions/{session_id}. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun update(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TracerSessionWithoutVirtualFields> =
            update(sessionId, SessionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionService.delete].
         */
        @MustBeClosed
        fun delete(sessionId: String): HttpResponse = delete(sessionId, SessionDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
        ): HttpResponse = delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SessionDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(sessionId: String, requestOptions: RequestOptions): HttpResponse =
            delete(sessionId, SessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/sessions`, but is otherwise the same as
         * [SessionService.createV2].
         */
        @MustBeClosed
        fun createV2(params: SessionCreateV2Params): HttpResponseFor<Session> =
            createV2(params, RequestOptions.none())

        /** @see createV2 */
        @MustBeClosed
        fun createV2(
            params: SessionCreateV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session>

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
         * Returns a raw HTTP response for `get /api/v1/sessions`, but is otherwise the same as
         * [SessionService.listV1].
         */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun listV1(): HttpResponseFor<SessionListV1Page> = listV1(SessionListV1Params.none())

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun listV1(
            params: SessionListV1Params = SessionListV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionListV1Page>

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun listV1(
            params: SessionListV1Params = SessionListV1Params.none()
        ): HttpResponseFor<SessionListV1Page> = listV1(params, RequestOptions.none())

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. The v1 endpoint is scheduled for removal on Jul 1, 2027."
        )
        @MustBeClosed
        fun listV1(requestOptions: RequestOptions): HttpResponseFor<SessionListV1Page> =
            listV1(SessionListV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sessions`, but is otherwise the same as
         * [SessionService.listV2].
         */
        @MustBeClosed
        fun listV2(): HttpResponseFor<SessionListV2Page> = listV2(SessionListV2Params.none())

        /** @see listV2 */
        @MustBeClosed
        fun listV2(
            params: SessionListV2Params = SessionListV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionListV2Page>

        /** @see listV2 */
        @MustBeClosed
        fun listV2(
            params: SessionListV2Params = SessionListV2Params.none()
        ): HttpResponseFor<SessionListV2Page> = listV2(params, RequestOptions.none())

        /** @see listV2 */
        @MustBeClosed
        fun listV2(requestOptions: RequestOptions): HttpResponseFor<SessionListV2Page> =
            listV2(SessionListV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/resolutions`, but is otherwise the
         * same as [SessionService.resolve].
         */
        @MustBeClosed
        fun resolve(params: SessionResolveParams): HttpResponseFor<SessionResolveResponse> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        @MustBeClosed
        fun resolve(
            params: SessionResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SessionResolveResponse>

        /**
         * Returns a raw HTTP response for `get /api/v2/sessions/{session_id}`, but is otherwise the
         * same as [SessionService.retrieveV2].
         */
        @MustBeClosed
        fun retrieveV2(sessionId: String): HttpResponseFor<Session> =
            retrieveV2(sessionId, SessionRetrieveV2Params.none())

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            sessionId: String,
            params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session> =
            retrieveV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            sessionId: String,
            params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
        ): HttpResponseFor<Session> = retrieveV2(sessionId, params, RequestOptions.none())

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            params: SessionRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session>

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(params: SessionRetrieveV2Params): HttpResponseFor<Session> =
            retrieveV2(params, RequestOptions.none())

        /** @see retrieveV2 */
        @MustBeClosed
        fun retrieveV2(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Session> =
            retrieveV2(sessionId, SessionRetrieveV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v2/sessions/{session_id}`, but is otherwise
         * the same as [SessionService.updateV2].
         */
        @MustBeClosed
        fun updateV2(sessionId: String): HttpResponseFor<Session> =
            updateV2(sessionId, SessionUpdateV2Params.none())

        /** @see updateV2 */
        @MustBeClosed
        fun updateV2(
            sessionId: String,
            params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session> =
            updateV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see updateV2 */
        @MustBeClosed
        fun updateV2(
            sessionId: String,
            params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
        ): HttpResponseFor<Session> = updateV2(sessionId, params, RequestOptions.none())

        /** @see updateV2 */
        @MustBeClosed
        fun updateV2(
            params: SessionUpdateV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session>

        /** @see updateV2 */
        @MustBeClosed
        fun updateV2(params: SessionUpdateV2Params): HttpResponseFor<Session> =
            updateV2(params, RequestOptions.none())

        /** @see updateV2 */
        @MustBeClosed
        fun updateV2(sessionId: String, requestOptions: RequestOptions): HttpResponseFor<Session> =
            updateV2(sessionId, SessionUpdateV2Params.none(), requestOptions)

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
    }
}
