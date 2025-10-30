// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1.orgs.current

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoListParams
import com.langsmith_api.api.models.api.v1.orgs.current.info.InfoPatchAllParams
import com.langsmith_api.api.models.api.v1.orgs.current.info.OrganizationInfo
import java.util.function.Consumer

interface InfoService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService

    /** Get Current Organization Info */
    fun list(): OrganizationInfo = list(InfoListParams.none())

    /** @see list */
    fun list(
        params: InfoListParams = InfoListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationInfo

    /** @see list */
    fun list(params: InfoListParams = InfoListParams.none()): OrganizationInfo =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): OrganizationInfo =
        list(InfoListParams.none(), requestOptions)

    /** Update Current Organization Info */
    fun patchAll(): OrganizationInfo = patchAll(InfoPatchAllParams.none())

    /** @see patchAll */
    fun patchAll(
        params: InfoPatchAllParams = InfoPatchAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationInfo

    /** @see patchAll */
    fun patchAll(params: InfoPatchAllParams = InfoPatchAllParams.none()): OrganizationInfo =
        patchAll(params, RequestOptions.none())

    /** @see patchAll */
    fun patchAll(requestOptions: RequestOptions): OrganizationInfo =
        patchAll(InfoPatchAllParams.none(), requestOptions)

    /** A view of [InfoService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): InfoService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/info`, but is otherwise the
         * same as [InfoService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<OrganizationInfo> = list(InfoListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: InfoListParams = InfoListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationInfo>

        /** @see list */
        @MustBeClosed
        fun list(
            params: InfoListParams = InfoListParams.none()
        ): HttpResponseFor<OrganizationInfo> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OrganizationInfo> =
            list(InfoListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/info`, but is otherwise the
         * same as [InfoService.patchAll].
         */
        @MustBeClosed
        fun patchAll(): HttpResponseFor<OrganizationInfo> = patchAll(InfoPatchAllParams.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: InfoPatchAllParams = InfoPatchAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationInfo>

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(
            params: InfoPatchAllParams = InfoPatchAllParams.none()
        ): HttpResponseFor<OrganizationInfo> = patchAll(params, RequestOptions.none())

        /** @see patchAll */
        @MustBeClosed
        fun patchAll(requestOptions: RequestOptions): HttpResponseFor<OrganizationInfo> =
            patchAll(InfoPatchAllParams.none(), requestOptions)
    }
}
