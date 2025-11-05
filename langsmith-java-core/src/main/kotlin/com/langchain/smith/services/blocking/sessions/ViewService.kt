// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking.sessions

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.sessions.views.FilterView
import com.langchain.smith.models.sessions.views.ViewCreateParams
import com.langchain.smith.models.sessions.views.ViewDeleteParams
import com.langchain.smith.models.sessions.views.ViewDeleteResponse
import com.langchain.smith.models.sessions.views.ViewListParams
import com.langchain.smith.models.sessions.views.ViewRetrieveParams
import com.langchain.smith.models.sessions.views.ViewUpdateParams
import java.util.function.Consumer

interface ViewService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewService

    /** Create a new filter view. */
    fun create(sessionId: String, params: ViewCreateParams): FilterView =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ViewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView = create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ViewCreateParams): FilterView = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ViewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView

    /** Get a specific filter view. */
    fun retrieve(viewId: String, params: ViewRetrieveParams): FilterView =
        retrieve(viewId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        viewId: String,
        params: ViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView = retrieve(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ViewRetrieveParams): FilterView = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView

    /** Update a filter view. */
    fun update(viewId: String, params: ViewUpdateParams): FilterView =
        update(viewId, params, RequestOptions.none())

    /** @see update */
    fun update(
        viewId: String,
        params: ViewUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView = update(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see update */
    fun update(params: ViewUpdateParams): FilterView = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ViewUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FilterView

    /** Get all filter views for a session. */
    fun list(sessionId: String): List<FilterView> = list(sessionId, ViewListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ViewListParams = ViewListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterView> = list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(sessionId: String, params: ViewListParams = ViewListParams.none()): List<FilterView> =
        list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ViewListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<FilterView>

    /** @see list */
    fun list(params: ViewListParams): List<FilterView> = list(params, RequestOptions.none())

    /** @see list */
    fun list(sessionId: String, requestOptions: RequestOptions): List<FilterView> =
        list(sessionId, ViewListParams.none(), requestOptions)

    /** Delete a specific filter view. */
    fun delete(viewId: String, params: ViewDeleteParams): ViewDeleteResponse =
        delete(viewId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        viewId: String,
        params: ViewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewDeleteResponse = delete(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ViewDeleteParams): ViewDeleteResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ViewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ViewDeleteResponse

    /** A view of [ViewService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/views`, but is
         * otherwise the same as [ViewService.create].
         */
        @MustBeClosed
        fun create(sessionId: String, params: ViewCreateParams): HttpResponseFor<FilterView> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            sessionId: String,
            params: ViewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ViewCreateParams): HttpResponseFor<FilterView> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: ViewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/views/{view_id}`, but
         * is otherwise the same as [ViewService.retrieve].
         */
        @MustBeClosed
        fun retrieve(viewId: String, params: ViewRetrieveParams): HttpResponseFor<FilterView> =
            retrieve(viewId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            viewId: String,
            params: ViewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView> =
            retrieve(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ViewRetrieveParams): HttpResponseFor<FilterView> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ViewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView>

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}/views/{view_id}`,
         * but is otherwise the same as [ViewService.update].
         */
        @MustBeClosed
        fun update(viewId: String, params: ViewUpdateParams): HttpResponseFor<FilterView> =
            update(viewId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            viewId: String,
            params: ViewUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView> =
            update(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ViewUpdateParams): HttpResponseFor<FilterView> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ViewUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FilterView>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/views`, but is
         * otherwise the same as [ViewService.list].
         */
        @MustBeClosed
        fun list(sessionId: String): HttpResponseFor<List<FilterView>> =
            list(sessionId, ViewListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ViewListParams = ViewListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterView>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            params: ViewListParams = ViewListParams.none(),
        ): HttpResponseFor<List<FilterView>> = list(sessionId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ViewListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<FilterView>>

        /** @see list */
        @MustBeClosed
        fun list(params: ViewListParams): HttpResponseFor<List<FilterView>> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<FilterView>> =
            list(sessionId, ViewListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}/views/{view_id}`,
         * but is otherwise the same as [ViewService.delete].
         */
        @MustBeClosed
        fun delete(viewId: String, params: ViewDeleteParams): HttpResponseFor<ViewDeleteResponse> =
            delete(viewId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            viewId: String,
            params: ViewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ViewDeleteResponse> =
            delete(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ViewDeleteParams): HttpResponseFor<ViewDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ViewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ViewDeleteResponse>
    }
}
