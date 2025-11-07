// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.settings.AppHubCrudTenantsTenant
import com.langchain.smith.models.settings.SettingListParams
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
    }
}
