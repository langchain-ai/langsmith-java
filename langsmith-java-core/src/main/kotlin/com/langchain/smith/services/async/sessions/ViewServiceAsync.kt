// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.sessions

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ViewServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewServiceAsync

    /** Create a new filter view. */
    fun create(sessionId: String, params: ViewCreateParams): CompletableFuture<FilterView> =
        create(sessionId, params, RequestOptions.none())

    /** @see create */
    fun create(
        sessionId: String,
        params: ViewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView> =
        create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see create */
    fun create(params: ViewCreateParams): CompletableFuture<FilterView> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ViewCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView>

    /** Get a specific filter view. */
    fun retrieve(viewId: String, params: ViewRetrieveParams): CompletableFuture<FilterView> =
        retrieve(viewId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        viewId: String,
        params: ViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView> =
        retrieve(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ViewRetrieveParams): CompletableFuture<FilterView> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ViewRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView>

    /** Update a filter view. */
    fun update(viewId: String, params: ViewUpdateParams): CompletableFuture<FilterView> =
        update(viewId, params, RequestOptions.none())

    /** @see update */
    fun update(
        viewId: String,
        params: ViewUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView> =
        update(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see update */
    fun update(params: ViewUpdateParams): CompletableFuture<FilterView> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ViewUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FilterView>

    /** Get all filter views for a session. */
    fun list(sessionId: String): CompletableFuture<List<FilterView>> =
        list(sessionId, ViewListParams.none())

    /** @see list */
    fun list(
        sessionId: String,
        params: ViewListParams = ViewListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterView>> =
        list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

    /** @see list */
    fun list(
        sessionId: String,
        params: ViewListParams = ViewListParams.none(),
    ): CompletableFuture<List<FilterView>> = list(sessionId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ViewListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<FilterView>>

    /** @see list */
    fun list(params: ViewListParams): CompletableFuture<List<FilterView>> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        sessionId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<FilterView>> = list(sessionId, ViewListParams.none(), requestOptions)

    /** Delete a specific filter view. */
    fun delete(viewId: String, params: ViewDeleteParams): CompletableFuture<ViewDeleteResponse> =
        delete(viewId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        viewId: String,
        params: ViewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ViewDeleteResponse> =
        delete(params.toBuilder().viewId(viewId).build(), requestOptions)

    /** @see delete */
    fun delete(params: ViewDeleteParams): CompletableFuture<ViewDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ViewDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ViewDeleteResponse>

    /** A view of [ViewServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ViewServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/sessions/{session_id}/views`, but is
         * otherwise the same as [ViewServiceAsync.create].
         */
        fun create(
            sessionId: String,
            params: ViewCreateParams,
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            create(sessionId, params, RequestOptions.none())

        /** @see create */
        fun create(
            sessionId: String,
            params: ViewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            create(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see create */
        fun create(params: ViewCreateParams): CompletableFuture<HttpResponseFor<FilterView>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ViewCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/views/{view_id}`, but
         * is otherwise the same as [ViewServiceAsync.retrieve].
         */
        fun retrieve(
            viewId: String,
            params: ViewRetrieveParams,
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            retrieve(viewId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            viewId: String,
            params: ViewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            retrieve(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(params: ViewRetrieveParams): CompletableFuture<HttpResponseFor<FilterView>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ViewRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>>

        /**
         * Returns a raw HTTP response for `patch /api/v1/sessions/{session_id}/views/{view_id}`,
         * but is otherwise the same as [ViewServiceAsync.update].
         */
        fun update(
            viewId: String,
            params: ViewUpdateParams,
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            update(viewId, params, RequestOptions.none())

        /** @see update */
        fun update(
            viewId: String,
            params: ViewUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>> =
            update(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see update */
        fun update(params: ViewUpdateParams): CompletableFuture<HttpResponseFor<FilterView>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ViewUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FilterView>>

        /**
         * Returns a raw HTTP response for `get /api/v1/sessions/{session_id}/views`, but is
         * otherwise the same as [ViewServiceAsync.list].
         */
        fun list(sessionId: String): CompletableFuture<HttpResponseFor<List<FilterView>>> =
            list(sessionId, ViewListParams.none())

        /** @see list */
        fun list(
            sessionId: String,
            params: ViewListParams = ViewListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterView>>> =
            list(params.toBuilder().sessionId(sessionId).build(), requestOptions)

        /** @see list */
        fun list(
            sessionId: String,
            params: ViewListParams = ViewListParams.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterView>>> =
            list(sessionId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: ViewListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<FilterView>>>

        /** @see list */
        fun list(params: ViewListParams): CompletableFuture<HttpResponseFor<List<FilterView>>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            sessionId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<FilterView>>> =
            list(sessionId, ViewListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/sessions/{session_id}/views/{view_id}`,
         * but is otherwise the same as [ViewServiceAsync.delete].
         */
        fun delete(
            viewId: String,
            params: ViewDeleteParams,
        ): CompletableFuture<HttpResponseFor<ViewDeleteResponse>> =
            delete(viewId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            viewId: String,
            params: ViewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ViewDeleteResponse>> =
            delete(params.toBuilder().viewId(viewId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: ViewDeleteParams
        ): CompletableFuture<HttpResponseFor<ViewDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ViewDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ViewDeleteResponse>>
    }
}
