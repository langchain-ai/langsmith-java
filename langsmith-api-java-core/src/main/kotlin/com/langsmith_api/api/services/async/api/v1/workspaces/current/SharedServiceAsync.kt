// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.workspaces.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SharedServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SharedServiceAsync

    /** List all shared entities and their tokens by the workspace. */
    fun list(): CompletableFuture<SharedListResponse> = list(SharedListParams.none())

    /** @see list */
    fun list(
        params: SharedListParams = SharedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SharedListResponse>

    /** @see list */
    fun list(
        params: SharedListParams = SharedListParams.none()
    ): CompletableFuture<SharedListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SharedListResponse> =
        list(SharedListParams.none(), requestOptions)

    /** Bulk unshare entities by share tokens for the workspace. */
    fun deleteAll(): CompletableFuture<SharedDeleteAllResponse> =
        deleteAll(SharedDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        params: SharedDeleteAllParams = SharedDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SharedDeleteAllResponse>

    /** @see deleteAll */
    fun deleteAll(
        params: SharedDeleteAllParams = SharedDeleteAllParams.none()
    ): CompletableFuture<SharedDeleteAllResponse> = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(requestOptions: RequestOptions): CompletableFuture<SharedDeleteAllResponse> =
        deleteAll(SharedDeleteAllParams.none(), requestOptions)

    /**
     * A view of [SharedServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SharedServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/shared`, but is otherwise
         * the same as [SharedServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SharedListResponse>> =
            list(SharedListParams.none())

        /** @see list */
        fun list(
            params: SharedListParams = SharedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SharedListResponse>>

        /** @see list */
        fun list(
            params: SharedListParams = SharedListParams.none()
        ): CompletableFuture<HttpResponseFor<SharedListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SharedListResponse>> =
            list(SharedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/current/shared`, but is
         * otherwise the same as [SharedServiceAsync.deleteAll].
         */
        fun deleteAll(): CompletableFuture<HttpResponseFor<SharedDeleteAllResponse>> =
            deleteAll(SharedDeleteAllParams.none())

        /** @see deleteAll */
        fun deleteAll(
            params: SharedDeleteAllParams = SharedDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SharedDeleteAllResponse>>

        /** @see deleteAll */
        fun deleteAll(
            params: SharedDeleteAllParams = SharedDeleteAllParams.none()
        ): CompletableFuture<HttpResponseFor<SharedDeleteAllResponse>> =
            deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        fun deleteAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SharedDeleteAllResponse>> =
            deleteAll(SharedDeleteAllParams.none(), requestOptions)
    }
}
