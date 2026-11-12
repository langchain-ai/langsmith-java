// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

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
import com.langchain.smith.models.sessions.SessionListPageAsync
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionListV1PageAsync
import com.langchain.smith.models.sessions.SessionListV1Params
import com.langchain.smith.models.sessions.SessionListV2PageAsync
import com.langchain.smith.models.sessions.SessionListV2Params
import com.langchain.smith.models.sessions.SessionResolveParams
import com.langchain.smith.models.sessions.SessionResolveResponse
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionRetrieveV2Params
import com.langchain.smith.models.sessions.SessionUpdateParams
import com.langchain.smith.models.sessions.SessionUpdateV2Params
import com.langchain.smith.models.sessions.TracerSession
import com.langchain.smith.models.sessions.TracerSessionWithoutVirtualFields
import com.langchain.smith.services.async.sessions.InsightServiceAsync
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

    fun insights(): InsightServiceAsync

    /** Create a new project. */
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

    /** Get a specific project. */
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

    /** Update a project. */
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

    /**
     * Delete a specific project.
     *
     * Returns 202 when deletion is accepted. Cleanup runs asynchronously. Location identifies the
     * affected project, not a cleanup-status endpoint. For a caller with read access, GET at that
     * URL returns 200 with the project while it is still available, or 404 after the project is
     * removed. A 404 does not confirm that background trace cleanup has finished. Polling for
     * cleanup completion is not supported.
     */
    fun delete(sessionId: String): CompletableFuture<Void?> =
        delete(sessionId, SessionDeleteParams.none())

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see delete */
    fun delete(
        sessionId: String,
        params: SessionDeleteParams = SessionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(sessionId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SessionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SessionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(sessionId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(sessionId, SessionDeleteParams.none(), requestOptions)

    /**
     * Create a session, or update an existing session with the same name when upsert is true.
     * Returns the refreshed session representation without optional run statistics.
     */
    fun createV2(params: SessionCreateV2Params): CompletableFuture<Session> =
        createV2(params, RequestOptions.none())

    /** @see createV2 */
    fun createV2(
        params: SessionCreateV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session>

    /**
     * GET with body payload — no resources created. Returns the prebuilt dashboard for the tracing
     * project matching the query passed as the request payload.
     */
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

    /**
     * List all projects.
     *
     * Deprecated: use GET /api/v2/sessions, which pages with a cursor. Will be removed after Jun
     * 1, 2027.
     */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
    )
    fun listV1(): CompletableFuture<SessionListV1PageAsync> = listV1(SessionListV1Params.none())

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
    )
    fun listV1(
        params: SessionListV1Params = SessionListV1Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionListV1PageAsync>

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
    )
    fun listV1(
        params: SessionListV1Params = SessionListV1Params.none()
    ): CompletableFuture<SessionListV1PageAsync> = listV1(params, RequestOptions.none())

    /** @see listV1 */
    @Deprecated(
        "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
    )
    fun listV1(requestOptions: RequestOptions): CompletableFuture<SessionListV1PageAsync> =
        listV1(SessionListV1Params.none(), requestOptions)

    /**
     * Returns a page of the workspace's tracing projects and experiments. Pass the response's
     * next_cursor as cursor to fetch the next page; next_cursor is null on the last page. A cursor
     * is valid only with the same query parameters as the request that returned it.
     */
    fun listV2(): CompletableFuture<SessionListV2PageAsync> = listV2(SessionListV2Params.none())

    /** @see listV2 */
    fun listV2(
        params: SessionListV2Params = SessionListV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionListV2PageAsync>

    /** @see listV2 */
    fun listV2(
        params: SessionListV2Params = SessionListV2Params.none()
    ): CompletableFuture<SessionListV2PageAsync> = listV2(params, RequestOptions.none())

    /** @see listV2 */
    fun listV2(requestOptions: RequestOptions): CompletableFuture<SessionListV2PageAsync> =
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
    fun resolve(params: SessionResolveParams): CompletableFuture<SessionResolveResponse> =
        resolve(params, RequestOptions.none())

    /** @see resolve */
    fun resolve(
        params: SessionResolveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionResolveResponse>

    /**
     * Returns one tracing project or experiment by ID. Pass include_stats=true to include run
     * statistics.
     */
    fun retrieveV2(sessionId: String): CompletableFuture<Session> =
        retrieveV2(sessionId, SessionRetrieveV2Params.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        sessionId: String,
        params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session> =
        retrieveV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see retrieveV2 */
    fun retrieveV2(
        sessionId: String,
        params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
    ): CompletableFuture<Session> = retrieveV2(sessionId, params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(
        params: SessionRetrieveV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session>

    /** @see retrieveV2 */
    fun retrieveV2(params: SessionRetrieveV2Params): CompletableFuture<Session> =
        retrieveV2(params, RequestOptions.none())

    /** @see retrieveV2 */
    fun retrieveV2(sessionId: String, requestOptions: RequestOptions): CompletableFuture<Session> =
        retrieveV2(sessionId, SessionRetrieveV2Params.none(), requestOptions)

    /**
     * Updates supplied fields and returns the refreshed resource without optional run statistics.
     * Omitted fields remain unchanged. Null clears description, default_dataset_id, end_time, or
     * extra. Extra merges top-level keys; null values remove keys.
     */
    fun updateV2(sessionId: String): CompletableFuture<Session> =
        updateV2(sessionId, SessionUpdateV2Params.none())

    /** @see updateV2 */
    fun updateV2(
        sessionId: String,
        params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session> =
        updateV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see updateV2 */
    fun updateV2(
        sessionId: String,
        params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
    ): CompletableFuture<Session> = updateV2(sessionId, params, RequestOptions.none())

    /** @see updateV2 */
    fun updateV2(
        params: SessionUpdateV2Params,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session>

    /** @see updateV2 */
    fun updateV2(params: SessionUpdateV2Params): CompletableFuture<Session> =
        updateV2(params, RequestOptions.none())

    /** @see updateV2 */
    fun updateV2(sessionId: String, requestOptions: RequestOptions): CompletableFuture<Session> =
        updateV2(sessionId, SessionUpdateV2Params.none(), requestOptions)

    /**
     * List all projects.
     *
     * Deprecated: use GET /api/v2/sessions, which pages with a cursor. Will be removed after Jun
     * 1, 2027.
     */
    fun list(): CompletableFuture<SessionListPageAsync> = list(SessionListParams.none())

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SessionListPageAsync>

    /** @see list */
    fun list(
        params: SessionListParams = SessionListParams.none()
    ): CompletableFuture<SessionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SessionListPageAsync> =
        list(SessionListParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}`, but is otherwise
         * the same as [SessionServiceAsync.delete].
         */
        fun delete(sessionId: String): CompletableFuture<HttpResponse> =
            delete(sessionId, SessionDeleteParams.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see delete */
        fun delete(
            sessionId: String,
            params: SessionDeleteParams = SessionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(sessionId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SessionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SessionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(sessionId, SessionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v2/sessions`, but is otherwise the same as
         * [SessionServiceAsync.createV2].
         */
        fun createV2(params: SessionCreateV2Params): CompletableFuture<HttpResponseFor<Session>> =
            createV2(params, RequestOptions.none())

        /** @see createV2 */
        fun createV2(
            params: SessionCreateV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>>

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
         * Returns a raw HTTP response for `get /api/v1/sessions`, but is otherwise the same as
         * [SessionServiceAsync.listV1].
         */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
        )
        fun listV1(): CompletableFuture<HttpResponseFor<SessionListV1PageAsync>> =
            listV1(SessionListV1Params.none())

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
        )
        fun listV1(
            params: SessionListV1Params = SessionListV1Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionListV1PageAsync>>

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
        )
        fun listV1(
            params: SessionListV1Params = SessionListV1Params.none()
        ): CompletableFuture<HttpResponseFor<SessionListV1PageAsync>> =
            listV1(params, RequestOptions.none())

        /** @see listV1 */
        @Deprecated(
            "Deprecated: use listV2 instead, which calls GET /api/v2/sessions and pages with a cursor. Will be removed after Apr 1, 2027."
        )
        fun listV1(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SessionListV1PageAsync>> =
            listV1(SessionListV1Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v2/sessions`, but is otherwise the same as
         * [SessionServiceAsync.listV2].
         */
        fun listV2(): CompletableFuture<HttpResponseFor<SessionListV2PageAsync>> =
            listV2(SessionListV2Params.none())

        /** @see listV2 */
        fun listV2(
            params: SessionListV2Params = SessionListV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionListV2PageAsync>>

        /** @see listV2 */
        fun listV2(
            params: SessionListV2Params = SessionListV2Params.none()
        ): CompletableFuture<HttpResponseFor<SessionListV2PageAsync>> =
            listV2(params, RequestOptions.none())

        /** @see listV2 */
        fun listV2(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SessionListV2PageAsync>> =
            listV2(SessionListV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/resolutions`, but is otherwise the
         * same as [SessionServiceAsync.resolve].
         */
        fun resolve(
            params: SessionResolveParams
        ): CompletableFuture<HttpResponseFor<SessionResolveResponse>> =
            resolve(params, RequestOptions.none())

        /** @see resolve */
        fun resolve(
            params: SessionResolveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionResolveResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v2/sessions/{session_id}`, but is otherwise the
         * same as [SessionServiceAsync.retrieveV2].
         */
        fun retrieveV2(sessionId: String): CompletableFuture<HttpResponseFor<Session>> =
            retrieveV2(sessionId, SessionRetrieveV2Params.none())

        /** @see retrieveV2 */
        fun retrieveV2(
            sessionId: String,
            params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>> =
            retrieveV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see retrieveV2 */
        fun retrieveV2(
            sessionId: String,
            params: SessionRetrieveV2Params = SessionRetrieveV2Params.none(),
        ): CompletableFuture<HttpResponseFor<Session>> =
            retrieveV2(sessionId, params, RequestOptions.none())

        /** @see retrieveV2 */
        fun retrieveV2(
            params: SessionRetrieveV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>>

        /** @see retrieveV2 */
        fun retrieveV2(
            params: SessionRetrieveV2Params
        ): CompletableFuture<HttpResponseFor<Session>> = retrieveV2(params, RequestOptions.none())

        /** @see retrieveV2 */
        fun retrieveV2(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> =
            retrieveV2(sessionId, SessionRetrieveV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v2/sessions/{session_id}`, but is otherwise
         * the same as [SessionServiceAsync.updateV2].
         */
        fun updateV2(sessionId: String): CompletableFuture<HttpResponseFor<Session>> =
            updateV2(sessionId, SessionUpdateV2Params.none())

        /** @see updateV2 */
        fun updateV2(
            sessionId: String,
            params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>> =
            updateV2(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see updateV2 */
        fun updateV2(
            sessionId: String,
            params: SessionUpdateV2Params = SessionUpdateV2Params.none(),
        ): CompletableFuture<HttpResponseFor<Session>> =
            updateV2(sessionId, params, RequestOptions.none())

        /** @see updateV2 */
        fun updateV2(
            params: SessionUpdateV2Params,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>>

        /** @see updateV2 */
        fun updateV2(params: SessionUpdateV2Params): CompletableFuture<HttpResponseFor<Session>> =
            updateV2(params, RequestOptions.none())

        /** @see updateV2 */
        fun updateV2(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> =
            updateV2(sessionId, SessionUpdateV2Params.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions`, but is otherwise the same as
         * [SessionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SessionListPageAsync>> =
            list(SessionListParams.none())

        /** @see list */
        fun list(
            params: SessionListParams = SessionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SessionListPageAsync>>

        /** @see list */
        fun list(
            params: SessionListParams = SessionListParams.none()
        ): CompletableFuture<HttpResponseFor<SessionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SessionListPageAsync>> =
            list(SessionListParams.none(), requestOptions)
    }
}
