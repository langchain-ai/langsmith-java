// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.SessionCreateParams
import com.langchain.smith.models.sessions.SessionDeleteParams
import com.langchain.smith.models.sessions.SessionDeleteResponse
import com.langchain.smith.models.sessions.SessionListParams
import com.langchain.smith.models.sessions.SessionRetrieveParams
import com.langchain.smith.models.sessions.SessionUpdateParams
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
    }
}
