// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.settings.AppHubCrudTenantsTenant
import com.langchain.smith.models.settings.SettingHandleParams
import com.langchain.smith.models.settings.SettingListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    /** Get settings. */
    fun list(): CompletableFuture<AppHubCrudTenantsTenant> = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppHubCrudTenantsTenant>

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none()
    ): CompletableFuture<AppHubCrudTenantsTenant> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AppHubCrudTenantsTenant> =
        list(SettingListParams.none(), requestOptions)

    /** Set tenant handle. */
    fun handle(params: SettingHandleParams): CompletableFuture<AppHubCrudTenantsTenant> =
        handle(params, RequestOptions.none())

    /** @see handle */
    fun handle(
        params: SettingHandleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AppHubCrudTenantsTenant>

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/settings`, but is otherwise the same as
         * [SettingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>> =
            list(SettingListParams.none())

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>>

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/settings/handle`, but is otherwise the same
         * as [SettingServiceAsync.handle].
         */
        fun handle(
            params: SettingHandleParams
        ): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>> =
            handle(params, RequestOptions.none())

        /** @see handle */
        fun handle(
            params: SettingHandleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AppHubCrudTenantsTenant>>
    }
}
