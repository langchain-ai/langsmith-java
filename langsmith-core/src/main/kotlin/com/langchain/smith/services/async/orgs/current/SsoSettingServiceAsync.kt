// File generated from our OpenAPI spec by Stainless.

package com.langchain.smith.services.async.orgs.current

import com.langchain.smith.core.ClientOptions
import com.langchain.smith.core.RequestOptions
import com.langchain.smith.core.http.HttpResponseFor
import com.langchain.smith.models.orgs.current.ssosettings.SsoProvider
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingDeleteParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingRetrieveSsoSettingsParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingSsoSettingsParams
import com.langchain.smith.models.orgs.current.ssosettings.SsoSettingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SsoSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SsoSettingServiceAsync

    /** Update SSO provider settings defaults for the current organization. */
    fun update(id: String): CompletableFuture<SsoProvider> =
        update(id, SsoSettingUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SsoProvider> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
    ): CompletableFuture<SsoProvider> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SsoSettingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SsoProvider>

    /** @see update */
    fun update(params: SsoSettingUpdateParams): CompletableFuture<SsoProvider> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<SsoProvider> =
        update(id, SsoSettingUpdateParams.none(), requestOptions)

    /** Delete SSO provider settings for the current organization. */
    fun delete(id: String): CompletableFuture<SsoProvider> =
        delete(id, SsoSettingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SsoProvider> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
    ): CompletableFuture<SsoProvider> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SsoSettingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SsoProvider>

    /** @see delete */
    fun delete(params: SsoSettingDeleteParams): CompletableFuture<SsoProvider> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<SsoProvider> =
        delete(id, SsoSettingDeleteParams.none(), requestOptions)

    /** Get SSO provider settings for the current organization. */
    fun retrieveSsoSettings(): CompletableFuture<List<SsoProvider>> =
        retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none())

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<SsoProvider>>

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(
        params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none()
    ): CompletableFuture<List<SsoProvider>> = retrieveSsoSettings(params, RequestOptions.none())

    /** @see retrieveSsoSettings */
    fun retrieveSsoSettings(requestOptions: RequestOptions): CompletableFuture<List<SsoProvider>> =
        retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none(), requestOptions)

    /** Create SSO provider settings for the current organization. */
    fun ssoSettings(params: SsoSettingSsoSettingsParams): CompletableFuture<SsoProvider> =
        ssoSettings(params, RequestOptions.none())

    /** @see ssoSettings */
    fun ssoSettings(
        params: SsoSettingSsoSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SsoProvider>

    /**
     * A view of [SsoSettingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SsoSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /api/v1/orgs/current/sso-settings/{id}`, but is
         * otherwise the same as [SsoSettingServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<SsoProvider>> =
            update(id, SsoSettingUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: SsoSettingUpdateParams = SsoSettingUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SsoSettingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>>

        /** @see update */
        fun update(
            params: SsoSettingUpdateParams
        ): CompletableFuture<HttpResponseFor<SsoProvider>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            update(id, SsoSettingUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/orgs/current/sso-settings/{id}`, but is
         * otherwise the same as [SsoSettingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<SsoProvider>> =
            delete(id, SsoSettingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: SsoSettingDeleteParams = SsoSettingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SsoSettingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>>

        /** @see delete */
        fun delete(
            params: SsoSettingDeleteParams
        ): CompletableFuture<HttpResponseFor<SsoProvider>> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            delete(id, SsoSettingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/orgs/current/sso-settings`, but is otherwise
         * the same as [SsoSettingServiceAsync.retrieveSsoSettings].
         */
        fun retrieveSsoSettings(): CompletableFuture<HttpResponseFor<List<SsoProvider>>> =
            retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none())

        /** @see retrieveSsoSettings */
        fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams =
                SsoSettingRetrieveSsoSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<SsoProvider>>>

        /** @see retrieveSsoSettings */
        fun retrieveSsoSettings(
            params: SsoSettingRetrieveSsoSettingsParams = SsoSettingRetrieveSsoSettingsParams.none()
        ): CompletableFuture<HttpResponseFor<List<SsoProvider>>> =
            retrieveSsoSettings(params, RequestOptions.none())

        /** @see retrieveSsoSettings */
        fun retrieveSsoSettings(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<SsoProvider>>> =
            retrieveSsoSettings(SsoSettingRetrieveSsoSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/orgs/current/sso-settings`, but is
         * otherwise the same as [SsoSettingServiceAsync.ssoSettings].
         */
        fun ssoSettings(
            params: SsoSettingSsoSettingsParams
        ): CompletableFuture<HttpResponseFor<SsoProvider>> =
            ssoSettings(params, RequestOptions.none())

        /** @see ssoSettings */
        fun ssoSettings(
            params: SsoSettingSsoSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SsoProvider>>
    }
}
