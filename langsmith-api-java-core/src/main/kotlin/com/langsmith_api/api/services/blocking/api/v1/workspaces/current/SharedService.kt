// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.workspaces.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedDeleteAllResponse
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListParams
import com.langsmith_api.api.models.api.v1.workspaces.current.shared.SharedListResponse
import java.util.function.Consumer

interface SharedService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SharedService

    /** List all shared entities and their tokens by the workspace. */
    fun list(): SharedListResponse = list(SharedListParams.none())

    /** @see list */
    fun list(
        params: SharedListParams = SharedListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedListResponse

    /** @see list */
    fun list(params: SharedListParams = SharedListParams.none()): SharedListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SharedListResponse =
        list(SharedListParams.none(), requestOptions)

    /** Bulk unshare entities by share tokens for the workspace. */
    fun deleteAll(): SharedDeleteAllResponse = deleteAll(SharedDeleteAllParams.none())

    /** @see deleteAll */
    fun deleteAll(
        params: SharedDeleteAllParams = SharedDeleteAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SharedDeleteAllResponse

    /** @see deleteAll */
    fun deleteAll(
        params: SharedDeleteAllParams = SharedDeleteAllParams.none()
    ): SharedDeleteAllResponse = deleteAll(params, RequestOptions.none())

    /** @see deleteAll */
    fun deleteAll(requestOptions: RequestOptions): SharedDeleteAllResponse =
        deleteAll(SharedDeleteAllParams.none(), requestOptions)

    /** A view of [SharedService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SharedService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/workspaces/current/shared`, but is otherwise
         * the same as [SharedService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SharedListResponse> = list(SharedListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SharedListParams = SharedListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SharedListParams = SharedListParams.none()
        ): HttpResponseFor<SharedListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SharedListResponse> =
            list(SharedListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/workspaces/current/shared`, but is
         * otherwise the same as [SharedService.deleteAll].
         */
        @MustBeClosed
        fun deleteAll(): HttpResponseFor<SharedDeleteAllResponse> =
            deleteAll(SharedDeleteAllParams.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: SharedDeleteAllParams = SharedDeleteAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SharedDeleteAllResponse>

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(
            params: SharedDeleteAllParams = SharedDeleteAllParams.none()
        ): HttpResponseFor<SharedDeleteAllResponse> = deleteAll(params, RequestOptions.none())

        /** @see deleteAll */
        @MustBeClosed
        fun deleteAll(requestOptions: RequestOptions): HttpResponseFor<SharedDeleteAllResponse> =
            deleteAll(SharedDeleteAllParams.none(), requestOptions)
    }
}
