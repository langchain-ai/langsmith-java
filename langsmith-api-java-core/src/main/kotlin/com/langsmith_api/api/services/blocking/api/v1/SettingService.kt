// File generated from our OpenAPI spec by Stainless.

package com.langsmith_api.api.services.blocking.api.v1

import com.google.errorprone.annotations.MustBeClosed
import com.langsmith_api.api.core.ClientOptions
import com.langsmith_api.api.core.RequestOptions
import com.langsmith_api.api.core.http.HttpResponseFor
import com.langsmith_api.api.models.api.v1.settings.AppHubCrudTenantsTenant
import com.langsmith_api.api.models.api.v1.settings.SettingHandleParams
import com.langsmith_api.api.models.api.v1.settings.SettingListParams
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    /** Get settings. */
    fun list(): AppHubCrudTenantsTenant = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppHubCrudTenantsTenant

    /** @see list */
    fun list(params: SettingListParams = SettingListParams.none()): AppHubCrudTenantsTenant =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AppHubCrudTenantsTenant =
        list(SettingListParams.none(), requestOptions)

    /** Set tenant handle. */
    fun handle(params: SettingHandleParams): AppHubCrudTenantsTenant =
        handle(params, RequestOptions.none())

    /** @see handle */
    fun handle(
        params: SettingHandleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AppHubCrudTenantsTenant

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/settings`, but is otherwise the same as
         * [SettingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AppHubCrudTenantsTenant> = list(SettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppHubCrudTenantsTenant>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): HttpResponseFor<AppHubCrudTenantsTenant> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AppHubCrudTenantsTenant> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/settings/handle`, but is otherwise the same
         * as [SettingService.handle].
         */
        @MustBeClosed
        fun handle(params: SettingHandleParams): HttpResponseFor<AppHubCrudTenantsTenant> =
            handle(params, RequestOptions.none())

        /** @see handle */
        @MustBeClosed
        fun handle(
            params: SettingHandleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AppHubCrudTenantsTenant>
    }
}
