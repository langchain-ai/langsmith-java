// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.async.api.v1.orgs.current

import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoListParams
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoPatchAllParams
import com.langsmith_api.api.models.api.v1.orgs.current.info.OrganizationInfo
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InfoServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync

    /** Get Current Organization Info */
    fun list(): CompletableFuture<OrganizationInfo> = list(InfoListParams.none())

    /** @see list */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationInfo>

    /** @see list */
    fun list(params: InfoListParams = InfoListParams.none()): CompletableFuture<OrganizationInfo> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OrganizationInfo> =
        list(InfoListParams.none(), requestOptions)

    /** Update Current Organization Info */
    fun patchAll(): CompletableFuture<OrganizationInfo> = patchAll(InfoPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        params: InfoPatchAllParams = InfoPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationInfo>

    /** @see patchAll */
    fun patchAll(
        params: InfoPatchAllParams = InfoPatchAllParams.none()
    ): CompletableFuture<OrganizationInfo> = patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(requestOptions: RequestOptions): CompletableFuture<OrganizationInfo> =
        patchAll(InfoPatchAllParams.none(), requestOptions)

    /** A view of [InfoServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/info`, but is otherwise the
         * same as [InfoServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            list(InfoListParams.none())

        /** @see list */
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>>

        /** @see list */
        fun list(
            params: InfoListParams = InfoListParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            list(InfoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/info`, but is otherwise the
         * same as [InfoServiceAsync.patchAll].
         */
        fun patchAll(): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            patchAll(InfoPatchAllParams.none())

        /** @see patchAll */
        fun patchAll(
            params: InfoPatchAllParams = InfoPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>>

        /** @see patchAll */
        fun patchAll(
            params: InfoPatchAllParams = InfoPatchAllParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            patchAll(params, RequestOptions.none())

        /** @see patchAll */
        fun patchAll(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationInfo>> =
            patchAll(InfoPatchAllParams.none(), requestOptions)
    }
}
